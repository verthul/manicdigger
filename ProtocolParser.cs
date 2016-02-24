﻿#if !CITO
using System;
using System.IO;
using System.Text;
#endif

// 
//  Read/Write string and byte arrays 
// 
//namespace SilentOrbit.ProtocolBuffers
//{
public class ProtocolParser
{
    public static string ReadString(CitoStream stream)
    {
        byte[] bytes = ReadBytes(stream);
        return ProtoPlatform.BytesToString(bytes, 0);
    }

    /// <summary>
    /// Reads a length delimited byte array
    /// </summary>
    public static byte[] ReadBytes(CitoStream stream)
    {
        //VarInt length
        int length = ReadUInt32(stream);

        //Bytes
        byte[] buffer = new byte[length];
        int read = 0;
        while (read < length)
        {
            int r = stream.Read(buffer, read, length - read);
            if (r == 0)
#if !CITO
                throw new InvalidDataException("Expected " + (length - read) + " got " + read);
#else
            return null;
#endif
            read += r;
        }
        return buffer;
    }

    /// <summary>
    /// Skip the next varint length prefixed bytes.
    /// Alternative to ReadBytes when the data is not of interest.
    /// </summary>
    public static void SkipBytes(CitoStream stream)
    {
        int length = ReadUInt32(stream);
        if (stream.CanSeek())
            stream.Seek(length, CitoSeekOrigin.Current);
        else
            ReadBytes(stream);
    }

    public static void WriteString(CitoStream stream, string val)
    {
        WriteBytes(stream, ProtoPlatform.StringToBytes(val));
    }

    /// <summary>
    /// Writes length delimited byte array
    /// </summary>
    public static void WriteBytes(CitoStream stream, byte[] val)
    {
        WriteUInt32_(stream, ProtoPlatform.ArrayLength(val));
        stream.Write(val, 0, ProtoPlatform.ArrayLength(val));
    }
    //}
    //}

    //
    //  This file contain references on how to write and read
    //  fixed integers and float/double.
    //  
    //using System;
    //using System.IO;

    //namespace SilentOrbit.ProtocolBuffers
    //{
    //public static partial class ProtocolParser
    //{
    //#region Fixed Int, Only for reference

    //#endregion
    //}
    //}

    //
    //  Reader/Writer for field key
    //
    //using System;
    //using System.IO;

    //namespace SilentOrbit.ProtocolBuffers
    //{

    //public static partial class ProtocolParser
    //{

    public static Key ReadKey(CitoStream stream)
    {
        int n = ReadUInt32(stream);
        return Key.Create(n >> 3, (n & 0x07));
    }

    public static Key ReadKey_(byte firstByte, CitoStream stream)
    {
        if (firstByte < 128)
            return Key.Create((firstByte >> 3), (firstByte & 0x07));
        int fieldID = (ReadUInt32(stream) << 4) | ((firstByte >> 3) & 0x0F);
        return Key.Create(fieldID, (firstByte & 0x07));
    }

    public static void WriteKey(CitoStream stream, Key key)
    {
        int n = (key.GetField() << 3) | (key.GetWireType());
        WriteUInt32_(stream, n);
    }

    /// <summary>
    /// Seek past the value for the previously read key.
    /// </summary>
    public static void SkipKey(CitoStream stream, Key key)
    {
        switch (key.GetWireType())
        {
            case Wire.Fixed32:
                stream.Seek(4, CitoSeekOrigin.Current);
                return;
            case Wire.Fixed64:
                stream.Seek(8, CitoSeekOrigin.Current);
                return;
            case Wire.LengthDelimited:
                stream.Seek(ProtocolParser.ReadUInt32(stream), CitoSeekOrigin.Current);
                return;
            case Wire.Varint:
                ProtocolParser.ReadSkipVarInt(stream);
                return;
            default:
#if !CITO
                throw new NotImplementedException("Unknown wire type: " + key.GetWireType());
#else
                return;
#endif
        }
    }

    /// <summary>
    /// Read the value for an unknown key as bytes.
    /// Used to preserve unknown keys during deserialization.
    /// Requires the message option preserveunknown=true.
    /// </summary>
    public static byte[] ReadValueBytes(CitoStream stream, Key key)
    {
        byte[] b;
        int offset = 0;

        switch (key.GetWireType())
        {
            case Wire.Fixed32:
                b = new byte[4];
                while (offset < 4)
                    offset += stream.Read(b, offset, 4 - offset);
                return b;
            case Wire.Fixed64:
                b = new byte[8];
                while (offset < 8)
                    offset += stream.Read(b, offset, 8 - offset);
                return b;
            case Wire.LengthDelimited:
                //Read and include length in value buffer
                int length = ProtocolParser.ReadUInt32(stream);
                CitoMemoryStream ms = new CitoMemoryStream();
                {
                    //TODO: pass b directly to MemoryStream constructor or skip usage of it completely
                    ProtocolParser.WriteUInt32(ms, length);
                    b = new byte[length + ms.Length()];
                    byte[] arr = ms.ToArray();
                    for (int i = 0; i < ProtoPlatform.ArrayLength(arr); i++)
                    {
                        b[i] = arr[i];
                    }
                    offset = ms.Length();
                }

                //Read data into buffer
                while (offset < ProtoPlatform.ArrayLength(b))
                    offset += stream.Read(b, offset, ProtoPlatform.ArrayLength(b) - offset);
                return b;
            case Wire.Varint:
                return ProtocolParser.ReadVarIntBytes(stream);
            default:
#if !CITO
                throw new NotImplementedException("Unknown wire type: " + key.GetWireType());
#else
                return null;
#endif
        }
    }

    static void WriteUInt32(CitoMemoryStream ms, int length)
    {
#if !CITO
        throw new NotImplementedException();
#endif
    }
    //}
    //}

    //using System;
    //using System.IO;

    //namespace SilentOrbit.ProtocolBuffers
    //{
    //public static partial class ProtocolParser
    //{
    /// <summary>
    /// Reads past a varint for an unknown field.
    /// </summary>
    public static void ReadSkipVarInt(CitoStream stream)
    {
        while (true)
        {
            int b = stream.ReadByte();
            if (b < 0)
#if !CITO
                throw new IOException("Stream ended too early");
#else
                return;
#endif

            if ((b & 0x80) == 0)
                return; //end of varint
        }
    }

    public static byte[] ReadVarIntBytes(CitoStream stream)
    {
        byte[] buffer = new byte[10];
        int offset = 0;
        while (true)
        {
            int b = stream.ReadByte();
            if (b < 0)
#if !CITO
                throw new IOException("Stream ended too early");
#else
                return null;
#endif
#if !CITO
            buffer[offset] = (byte)b;
#else
            buffer[offset] = b.LowByte;
#endif
            offset += 1;
            if ((b & 0x80) == 0)
                break; //end of varint
            if (offset >= ProtoPlatform.ArrayLength(buffer))
#if !CITO
                throw new InvalidDataException("VarInt too long, more than 10 bytes");
#else
                return null;
#endif
        }
        byte[] ret = new byte[offset];
        for (int i = 0; i < offset; i++)
        {
            ret[i] = buffer[i];
        }
        return ret;
    }
    //#region VarInt: int32, uint32, sint32
    //[Obsolete("Use (int)ReadUInt64(stream); //yes 64")]
    /// <summary>
    /// Since the int32 format is inefficient for negative numbers we have avoided to implement it.
    /// The same functionality can be achieved using: (int)ReadUInt64(stream);
    /// </summary>
    public static int ReadInt32(CitoStream stream)
    {
        return ReadUInt64(stream);
    }

    //[Obsolete("Use WriteUInt64(stream, (ulong)val); //yes 64, negative numbers are encoded that way")]
    /// <summary>
    /// Since the int32 format is inefficient for negative numbers we have avoided to imlplement.
    /// The same functionality can be achieved using: WriteUInt64(stream, (uint)val);
    /// Note that 64 must always be used for int32 to generate the ten byte wire format.
    /// </summary>
    public static void WriteInt32(CitoStream stream, int val)
    {
        //signed varint is always encoded as 64 but values!
        WriteUInt64(stream, val);
    }

    /// <summary>
    /// Zig-zag signed VarInt format
    /// </summary>
    public static int ReadZInt32(CitoStream stream)
    {
        int val = ReadUInt32(stream);
        return (val >> 1) ^ ((val << 31) >> 31);
    }

    /// <summary>
    /// Zig-zag signed VarInt format
    /// </summary>
    public static void WriteZInt32(CitoStream stream, int val)
    {
        WriteUInt32_(stream, ((val << 1) ^ (val >> 31)));
    }

    /// <summary>
    /// Unsigned VarInt format
    /// Do not use to read int32, use ReadUint64 for that.
    /// </summary>
    public static int ReadUInt32(CitoStream stream)
    {
        int b;
        int val = 0;

        for (int n = 0; n < 5; n++)
        {
            b = stream.ReadByte();
            if (b < 0)
#if !CITO
                throw new IOException("Stream ended too early");
#else
                return 0;
#endif

            //Check that it fits in 32 bits
            if ((n == 4) && (b & 0xF0) != 0)
#if !CITO
                throw new InvalidDataException("Got larger VarInt than 32bit unsigned");
#else
                return 0;
#endif
            //End of check

            if ((b & 0x80) == 0)
                return val | b << (7 * n);

            val |= (b & 0x7F) << (7 * n);
        }

#if !CITO
        throw new InvalidDataException("Got larger VarInt than 32bit unsigned");
#else
        return 0;
#endif
    }

    /// <summary>
    /// Unsigned VarInt format
    /// </summary>
    public static void WriteUInt32_(CitoStream stream, int val)
    {
        byte[] buffer = new byte[5];
        int count = 0;

        while (true)
        {
#if !CITO
            buffer[count] = (byte)(val & 0x7F);
#else
            buffer[count] = (val & 0x7F).LowByte;
#endif
            val = val >> 7;
            if (val == 0)
                break;

            buffer[count] |= 0x80;

            count += 1;
        }

        stream.Write(buffer, 0, count + 1);
    }
    //#endregion
    //#region VarInt: int64, UInt64, SInt64
    //[Obsolete("Use (long)ReadUInt64(stream); instead")]
    /// <summary>
    /// Since the int64 format is inefficient for negative numbers we have avoided to implement it.
    /// The same functionality can be achieved using: (long)ReadUInt64(stream);
    /// </summary>
    public static int ReadInt64(CitoStream stream)
    {
        return ReadUInt64(stream);
    }

    //[Obsolete("Use WriteUInt64 (stream, (ulong)val); instead")]
    /// <summary>
    /// Since the int64 format is inefficient for negative numbers we have avoided to implement.
    /// The same functionality can be achieved using: WriteUInt64 (stream, (ulong)val);
    /// </summary>
    public static void WriteInt64(CitoStream stream, int val)
    {
        WriteUInt64(stream, val);
    }

    /// <summary>
    /// Zig-zag signed VarInt format
    /// </summary>
    public static int ReadZInt64(CitoStream stream)
    {
        int val = ReadUInt64(stream);
        return (val >> 1) ^ ((val << 63) >> 63);
    }

    /// <summary>
    /// Zig-zag signed VarInt format
    /// </summary>
    public static void WriteZInt64(CitoStream stream, int val)
    {
        WriteUInt64(stream, ((val << 1) ^ (val >> 63)));
    }

    /// <summary>
    /// Unsigned VarInt format
    /// </summary>
    public static int ReadUInt64(CitoStream stream)
    {
        int b;
        int val = 0;

        for (int n = 0; n < 10; n++)
        {
            b = stream.ReadByte();
            if (b < 0)
#if !CITO
                throw new IOException("Stream ended too early");
#else
                return 0;
#endif

            //Check that it fits in 64 bits
            if ((n == 9) && (b & 0xFE) != 0)
#if !CITO
                throw new InvalidDataException("Got larger VarInt than 64 bit unsigned");
#else
                return 0;
#endif
            //End of check

            if ((b & 0x80) == 0)
                //return val | (ulong)b << (7 * n);
                return val | b << (7 * n);

            //val |= (ulong)(b & 0x7F) << (7 * n);
            val |= (b & 0x7F) << (7 * n);
        }
#if !CITO
        throw new InvalidDataException("Got larger VarInt than 64 bit unsigned");
#else
        return 0;
#endif
    }

    /// <summary>
    /// Unsigned VarInt format
    /// </summary>
    public static void WriteUInt64(CitoStream stream, int val)
    {
        byte[] buffer = new byte[10];
        int count = 0;

        while (true)
        {
#if !CITO
            buffer[count] = (byte)(val & 0x7F);
#else
            buffer[count] = (val & 0x7F).LowByte;
#endif
            val = ProtoPlatform.logical_right_shift(val, 7);
            if (val == 0)
                break;

            buffer[count] |= 0x80;

            count += 1;
        }

        stream.Write(buffer, 0, count + 1);
    }
    //#endregion
    //#region Varint: bool
    public static bool ReadBool(CitoStream stream)
    {
        int b = stream.ReadByte();
        if (b < 0)
#if !CITO
            throw new IOException("Stream ended too early");
#else
            return false;
#endif
        if (b == 1)
            return true;
        if (b == 0)
            return false;
#if !CITO
        throw new InvalidDataException("Invalid boolean value");
#else
        return false;
#endif
    }

    public static void WriteBool(CitoStream stream, bool val)
    {
        byte ret = 0;
        if (val)
        {
            ret = 1;
        }
        stream.WriteByte(ret);
    }
    //#endregion
}
//}

///// <summary>
///// Wrapper for streams that does not support the Position property
///// </summary>
//public class StreamRead : Stream
//{
//    Stream stream;

//    /// <summary>
//    /// Bytes left to read
//    /// </summary>
//    public int BytesRead { get; private set; }

//    /// <summary>
//    /// Define how many bytes are allowed to read
//    /// </summary>
//    /// <param name='baseStream'>
//    /// Base stream.
//    /// </param>
//    /// <param name='maxLength'>
//    /// Max length allowed to read from the stream.
//    /// </param>
//    public StreamRead(Stream baseStream)
//    {
//        this.stream = baseStream;
//    }

//    public override void Flush()
//    {
//        throw new NotImplementedException();
//    }

//    public override int Read(byte[] buffer, int offset, int count)
//    {
//        int read = stream.Read(buffer, offset, count);
//        BytesRead += read;
//        return read;
//    }

//    public override int ReadByte()
//    {
//        int b = stream.ReadByte();
//        BytesRead += 1;
//        return b;
//    }

//    public override long Seek(long offset, SeekOrigin origin)
//    {
//        throw new NotImplementedException();
//    }

//    public override void SetLength(long value)
//    {
//        throw new NotImplementedException();
//    }

//    public override void Write(byte[] buffer, int offset, int count)
//    {
//        throw new NotImplementedException();
//    }

//    public override bool CanRead
//    {
//        get
//        {
//            return true;
//        }
//    }

//    public override bool CanSeek
//    {
//        get
//        {
//            return false;
//        }
//    }

//    public override bool CanWrite
//    {
//        get
//        {
//            return false;
//        }
//    }

//    public override long Length
//    {
//        get
//        {
//            return stream.Length;
//        }
//    }

//    public override long Position
//    {
//        get
//        {
//            return this.BytesRead;
//        }
//        set
//        {
//            throw new NotImplementedException();
//        }
//    }
//}


public class Wire
{
    public const int Varint = 0;
    //int32, int64, UInt32, UInt64, SInt32, SInt64, bool, enum
    public const int Fixed64 = 1;
    //fixed64, sfixed64, double
    public const int LengthDelimited = 2;
    //string, bytes, embedded messages, packed repeated fields
    //Start = 3,        //  groups (deprecated)
    //End = 4,      //  groups (deprecated)
    public const int Fixed32 = 5;
    //32-bit    fixed32, SFixed32, float
}

public class Key
{
    int Field;
    public int GetField() { return Field; }
    public void SetField(int value) { Field = value; }

    int WireType;
    public int GetWireType() { return WireType; }
    public void SetWireType(int value) { WireType = value; }

    public static Key Create(int field, int wireType)
    {
        Key k = new Key();
        k.Field = field;
        k.WireType = wireType;
        return k;
    }

    //public override string ToString()
    //{
    //    return string.Format("[Key: {0}, {1}]", Field, WireType);
    //}
}

/// <summary>
/// Storage of unknown fields
/// </summary>
public class KeyValue
{
    Key Key_;

    byte[] Value;

    public static KeyValue Create(Key key, byte[] value)
    {
        KeyValue k = new KeyValue();
        k.Key_ = key;
        k.Value = value;
        return k;
    }

    //public override string ToString()
    //{
    //    return string.Format("[KeyValue: {0}, {1}, {2} bytes]", Key.Field, Key.WireType, Value.Length);
    //}
}

public abstract class CitoStream
{
    public abstract int Read(byte[] buffer, int read, int p);
    public abstract bool CanSeek();
    public abstract void Seek(int length, CitoSeekOrigin seekOrigin);
    public abstract void Write(byte[] val, int p, int p_3);
    public abstract void Seek_(int p, CitoSeekOrigin seekOrigin);
    public abstract int ReadByte();
    public abstract void WriteByte(byte p);
    public abstract int Position();
}

public class CitoMemoryStream : CitoStream
{
    byte[] buffer_;
    int count_;
    int bufferlength;
    int position_;

    public CitoMemoryStream()
    {
        buffer_ = new byte[1];
        count_ = 0;
        bufferlength = 1;
        position_ = 0;
    }

    public int Length()
    {
        return count_;
    }

    public byte[] ToArray()
    {
        return buffer_;
    }

    public static CitoMemoryStream Create(byte[] buffer, int length)
    {
        CitoMemoryStream m = new CitoMemoryStream();
        m.buffer_ = buffer;
        m.count_ = length;
        m.bufferlength = length;
        m.position_ = 0;
        return m;
    }

    public byte[] GetBuffer()
    {
        return buffer_;
    }

    public override int Read(byte[] buffer, int offset, int count)
    {
        for (int i = 0; i < count; i++)
        {
            if (position_ + i >= this.count_)
            {
                position_ += i;
                return i;
            }
            buffer[offset + i] = this.buffer_[position_ + i];
        }
        position_ += count;
        return count;
    }

    public override bool CanSeek()
    {
        return false;
    }

    public override void Seek(int length, CitoSeekOrigin seekOrigin)
    {
        switch (seekOrigin)
        {
            case CitoSeekOrigin.Current:
                position_ += length;
                break;
        }
    }

    public override void Write(byte[] buffer, int offset, int count)
    {
        for (int i = 0; i < count; i++)
        {
            WriteByte(buffer[offset + i]);
        }
    }

    public override void Seek_(int p, CitoSeekOrigin seekOrigin)
    {
    }

    public override int ReadByte()
    {
        if (position_ >= count_)
        {
            return -1;
        }
        return buffer_[position_++];
    }

    public override void WriteByte(byte p)
    {
        if (position_ >= bufferlength)
        {
            byte[] buffer2 = new byte[bufferlength * 2];
            for (int i = 0; i < bufferlength; i++)
            {
                buffer2[i] = buffer_[i];
            }
            buffer_ = buffer2;
            bufferlength = bufferlength * 2;
        }
        buffer_[position_] = p;
        if (position_ == count_)
        {
            count_++;
        }
        position_++;
    }

    public override int Position()
    {
        return position_;
    }
}

public class ProtoPlatform
{
    public static byte[] StringToBytes(string s)
    {
        byte[] b;
#if CITO
#if CS
        native
        {
            b = Encoding.UTF8.GetBytes(s);
            
        }
#elif JS
        native
        {
        // http://stackoverflow.com/a/18729931
	var str = s;
    var utf8 = [];
    for (var i=0; i < str.length; i++) {
        var charcode = str.charCodeAt(i);
        if (charcode < 0x80) utf8.push(charcode);
        else if (charcode < 0x800) {
            utf8.push(0xc0 | (charcode >> 6), 
                      0x80 | (charcode & 0x3f));
        }
        else if (charcode < 0xd800 || charcode >= 0xe000) {
            utf8.push(0xe0 | (charcode >> 12), 
                      0x80 | ((charcode>>6) & 0x3f), 
                      0x80 | (charcode & 0x3f));
        }
        // surrogate pair
        else {
            i++;
            // UTF-16 encodes 0x10000-0x10FFFF by
            // subtracting 0x10000 and splitting the
            // 20 bits of 0x0-0xFFFFF into two halves
            charcode = 0x10000 + (((charcode & 0x3ff)<<10)
                      | (str.charCodeAt(i) & 0x3ff))
            utf8.push(0xf0 | (charcode >>18), 
                      0x80 | ((charcode>>12) & 0x3f), 
                      0x80 | ((charcode>>6) & 0x3f), 
                      0x80 | (charcode & 0x3f));
        }
    }
        b = utf8;
        }
#elif JAVA
        native
        {
            try
            {
                b = s.getBytes("UTF-8");
            }
            catch (Exception e)
            {
                b = null;
            }
        }
#else
        b = null;
#endif
#else
        b = Encoding.UTF8.GetBytes(s);

#endif
        return b;
    }
    public static string BytesToString(byte[] bytes, int length)
    {
        string s;
#if CITO
#if CS
        native
        {
            s = Encoding.UTF8.GetString(bytes);
        }
#elif JS
        native
        {
            var arr = new Uint8Array(bytes.length);
	        for(var i = 0; i < bytes.length;i++)
	        {
		        arr[i] = bytes[i];
	        }
	        var encodedString = String.fromCharCode.apply(null, arr);
	        var decodedString = decodeURIComponent(escape(encodedString));
	        s = decodedString;
        }
#elif JAVA
        native
        {
            try
            {
                s = new String(bytes, "UTF-8");
            }
            catch (Exception e)
            {
                s = null;
            }
        }
#else
        s = null;
#endif
#else
        s = Encoding.UTF8.GetString(bytes);
#endif
        return s;
    }

    public static int ArrayLength(byte[] a)
    {
        int len;
#if CITO
#if CS
        native
        {
            len = a.Length;
        }
#elif JAVA
        native
        {
            len = a.length;
        }
#elif JS
        native
        {
            len = a.length;
        }
#else
        len = 0;
#endif
#else
        len = a.Length;
#endif
        return len;
    }

    public static byte IntToByte(int a)
    {
#if CITO
        return a.LowByte;
#else
        return (byte)a;
#endif
    }

    //http://stackoverflow.com/a/8248336
    public static int logical_right_shift(int x, int n)
    {
        int mask = ~(-1 << n) << (32 - n);
        return ~mask & ((x >> n) | mask);
    }
}

public enum CitoSeekOrigin
{
    Current
}
