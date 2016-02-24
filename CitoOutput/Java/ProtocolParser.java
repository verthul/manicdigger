// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class ProtocolParser
{

	public static boolean readBool(CitoStream stream)
	{
		int b = stream.readByte();
		if (b < 0)
			return false;
		if (b == 1)
			return true;
		if (b == 0)
			return false;
		return false;
	}

	/**
	 * &lt;summary&gt;
	 * Reads a length delimited byte array
	 * &lt;/summary&gt;
	 */
	public static byte[] readBytes(CitoStream stream)
	{
		int length = ProtocolParser.readUInt32(stream);
		byte[] buffer = new byte[length];
		int read = 0;
		while (read < length) {
			int r = stream.read(buffer, read, length - read);
			if (r == 0)
				return null;
			read += r;
		}
		return buffer;
	}

	/**
	 * &lt;summary&gt;
	 * Since the int32 format is inefficient for negative numbers we have avoided to implement it.
	 * The same functionality can be achieved using: (int)ReadUInt64(stream);
	 * &lt;/summary&gt;
	 */
	public static int readInt32(CitoStream stream)
	{
		return ProtocolParser.readUInt64(stream);
	}

	/**
	 * &lt;summary&gt;
	 * Since the int64 format is inefficient for negative numbers we have avoided to implement it.
	 * The same functionality can be achieved using: (long)ReadUInt64(stream);
	 * &lt;/summary&gt;
	 */
	public static int readInt64(CitoStream stream)
	{
		return ProtocolParser.readUInt64(stream);
	}

	public static Key readKey(CitoStream stream)
	{
		int n = ProtocolParser.readUInt32(stream);
		return Key.create(n >> 3, n & 7);
	}

	public static Key readKey_(byte firstByte, CitoStream stream)
	{
		if ((firstByte & 0xff) < 128)
			return Key.create((firstByte & 0xff) >> 3, firstByte & 7);
		int fieldID = ProtocolParser.readUInt32(stream) << 4 | (firstByte & 0xff) >> 3 & 15;
		return Key.create(fieldID, firstByte & 7);
	}

	/**
	 * &lt;summary&gt;
	 * Reads past a varint for an unknown field.
	 * &lt;/summary&gt;
	 */
	public static void readSkipVarInt(CitoStream stream)
	{
		while (true) {
			int b = stream.readByte();
			if (b < 0)
				return;
			if ((b & 128) == 0)
				return;
		}
	}

	public static String readString(CitoStream stream)
	{
		byte[] bytes = ProtocolParser.readBytes(stream);
		return ProtoPlatform.bytesToString(bytes, 0);
	}

	/**
	 * &lt;summary&gt;
	 * Unsigned VarInt format
	 * Do not use to read int32, use ReadUint64 for that.
	 * &lt;/summary&gt;
	 */
	public static int readUInt32(CitoStream stream)
	{
		int b;
		int val = 0;
		for (int n = 0; n < 5; n++) {
			b = stream.readByte();
			if (b < 0)
				return 0;
			if (n == 4 && (b & 240) != 0)
				return 0;
			if ((b & 128) == 0)
				return val | b << 7 * n;
			val |= (b & 127) << 7 * n;
		}
		return 0;
	}

	/**
	 * &lt;summary&gt;
	 * Unsigned VarInt format
	 * &lt;/summary&gt;
	 */
	public static int readUInt64(CitoStream stream)
	{
		int b;
		int val = 0;
		for (int n = 0; n < 10; n++) {
			b = stream.readByte();
			if (b < 0)
				return 0;
			if (n == 9 && (b & 254) != 0)
				return 0;
			if ((b & 128) == 0)
				return val | b << 7 * n;
			val |= (b & 127) << 7 * n;
		}
		return 0;
	}

	/**
	 * &lt;summary&gt;
	 * Read the value for an unknown key as bytes.
	 * Used to preserve unknown keys during deserialization.
	 * Requires the message option preserveunknown=true.
	 * &lt;/summary&gt;
	 */
	public static byte[] readValueBytes(CitoStream stream, Key key)
	{
		byte[] b;
		int offset = 0;
		switch (key.getWireType()) {
		case 5:
			b = new byte[4];
			while (offset < 4)
				offset += stream.read(b, offset, 4 - offset);
			return b;
		case 1:
			b = new byte[8];
			while (offset < 8)
				offset += stream.read(b, offset, 8 - offset);
			return b;
		case 2:
			int length = ProtocolParser.readUInt32(stream);
			CitoMemoryStream ms = new CitoMemoryStream();
			{
				ProtocolParser.writeUInt32(ms, length);
				b = new byte[length + ms.length()];
				byte[] arr = ms.toArray();
				for (int i = 0; i < ProtoPlatform.arrayLength(arr); i++) {
					b[i] = arr[i];
				}
				offset = ms.length();
			}
			while (offset < ProtoPlatform.arrayLength(b))
				offset += stream.read(b, offset, ProtoPlatform.arrayLength(b) - offset);
			return b;
		case 0:
			return ProtocolParser.readVarIntBytes(stream);
		default:
			return null;
		}
	}

	public static byte[] readVarIntBytes(CitoStream stream)
	{
		byte[] buffer = new byte[10];
		int offset = 0;
		while (true) {
			int b = stream.readByte();
			if (b < 0)
				return null;
			buffer[offset] = (byte) b;
			offset += 1;
			if ((b & 128) == 0)
				break;
			if (offset >= ProtoPlatform.arrayLength(buffer))
				return null;
		}
		byte[] ret = new byte[offset];
		for (int i = 0; i < offset; i++) {
			ret[i] = buffer[i];
		}
		return ret;
	}

	/**
	 * &lt;summary&gt;
	 * Zig-zag signed VarInt format
	 * &lt;/summary&gt;
	 */
	public static int readZInt32(CitoStream stream)
	{
		int val = ProtocolParser.readUInt32(stream);
		return val >> 1 ^ val << 31 >> 31;
	}

	/**
	 * &lt;summary&gt;
	 * Zig-zag signed VarInt format
	 * &lt;/summary&gt;
	 */
	public static int readZInt64(CitoStream stream)
	{
		int val = ProtocolParser.readUInt64(stream);
		return val >> 1 ^ val << 63 >> 63;
	}

	/**
	 * &lt;summary&gt;
	 * Skip the next varint length prefixed bytes.
	 * Alternative to ReadBytes when the data is not of interest.
	 * &lt;/summary&gt;
	 */
	public static void skipBytes(CitoStream stream)
	{
		int length = ProtocolParser.readUInt32(stream);
		if (stream.canSeek())
			stream.seek(length, CitoSeekOrigin.CURRENT);
		else
			ProtocolParser.readBytes(stream);
	}

	/**
	 * &lt;summary&gt;
	 * Seek past the value for the previously read key.
	 * &lt;/summary&gt;
	 */
	public static void skipKey(CitoStream stream, Key key)
	{
		switch (key.getWireType()) {
		case 5:
			stream.seek(4, CitoSeekOrigin.CURRENT);
			return;
		case 1:
			stream.seek(8, CitoSeekOrigin.CURRENT);
			return;
		case 2:
			stream.seek(ProtocolParser.readUInt32(stream), CitoSeekOrigin.CURRENT);
			return;
		case 0:
			ProtocolParser.readSkipVarInt(stream);
			return;
		default:
			return;
		}
	}

	public static void writeBool(CitoStream stream, boolean val)
	{
		byte ret = 0;
		if (val) {
			ret = 1;
		}
		stream.writeByte(ret);
	}

	/**
	 * &lt;summary&gt;
	 * Writes length delimited byte array
	 * &lt;/summary&gt;
	 */
	public static void writeBytes(CitoStream stream, byte[] val)
	{
		ProtocolParser.writeUInt32_(stream, ProtoPlatform.arrayLength(val));
		stream.write(val, 0, ProtoPlatform.arrayLength(val));
	}

	/**
	 * &lt;summary&gt;
	 * Since the int32 format is inefficient for negative numbers we have avoided to imlplement.
	 * The same functionality can be achieved using: WriteUInt64(stream, (uint)val);
	 * Note that 64 must always be used for int32 to generate the ten byte wire format.
	 * &lt;/summary&gt;
	 */
	public static void writeInt32(CitoStream stream, int val)
	{
		ProtocolParser.writeUInt64(stream, val);
	}

	/**
	 * &lt;summary&gt;
	 * Since the int64 format is inefficient for negative numbers we have avoided to implement.
	 * The same functionality can be achieved using: WriteUInt64 (stream, (ulong)val);
	 * &lt;/summary&gt;
	 */
	public static void writeInt64(CitoStream stream, int val)
	{
		ProtocolParser.writeUInt64(stream, val);
	}

	public static void writeKey(CitoStream stream, Key key)
	{
		int n = key.getField() << 3 | key.getWireType();
		ProtocolParser.writeUInt32_(stream, n);
	}

	public static void writeString(CitoStream stream, String val)
	{
		ProtocolParser.writeBytes(stream, ProtoPlatform.stringToBytes(val));
	}

	private static void writeUInt32(CitoMemoryStream ms, int length)
	{
	}

	/**
	 * &lt;summary&gt;
	 * Unsigned VarInt format
	 * &lt;/summary&gt;
	 */
	public static void writeUInt32_(CitoStream stream, int val)
	{
		byte[] buffer = new byte[5];
		int count = 0;
		while (true) {
			buffer[count] = (byte) (val & 127);
			val = val >> 7;
			if (val == 0)
				break;
			buffer[count] |= -128;
			count += 1;
		}
		stream.write(buffer, 0, count + 1);
	}

	/**
	 * &lt;summary&gt;
	 * Unsigned VarInt format
	 * &lt;/summary&gt;
	 */
	public static void writeUInt64(CitoStream stream, int val)
	{
		byte[] buffer = new byte[10];
		int count = 0;
		while (true) {
			buffer[count] = (byte) (val & 127);
			val = ProtoPlatform.logical_right_shift(val, 7);
			if (val == 0)
				break;
			buffer[count] |= -128;
			count += 1;
		}
		stream.write(buffer, 0, count + 1);
	}

	/**
	 * &lt;summary&gt;
	 * Zig-zag signed VarInt format
	 * &lt;/summary&gt;
	 */
	public static void writeZInt32(CitoStream stream, int val)
	{
		ProtocolParser.writeUInt32_(stream, val << 1 ^ val >> 31);
	}

	/**
	 * &lt;summary&gt;
	 * Zig-zag signed VarInt format
	 * &lt;/summary&gt;
	 */
	public static void writeZInt64(CitoStream stream, int val)
	{
		ProtocolParser.writeUInt64(stream, val << 1 ^ val >> 63);
	}
}
