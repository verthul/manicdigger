// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class Packet_ServerBlockTypeSerializer
{

	/**
	 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
	 */
	public static Packet_ServerBlockType deserialize(CitoStream stream, Packet_ServerBlockType instance)
	{
		while (true) {
			int keyByte = stream.readByte();
			if (keyByte == -1)
				break;
			switch (keyByte) {
			case 8:
				instance.id = ProtocolParser.readUInt64(stream);
				continue;
			case 18:
				if (instance.blocktype == null)
					instance.blocktype = Packet_BlockTypeSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_BlockTypeSerializer.deserializeLengthDelimited(stream, instance.blocktype);
				continue;
			default:
				break;
			}
			Key key = ProtocolParser.readKey_((byte) keyByte, stream);
			switch (key.getField()) {
			case 0:
				return null;
			default:
				ProtocolParser.skipKey(stream, key);
				break;
			}
		}
		return instance;
	}

	/**
	 * &lt;summary&gt;Helper: put the buffer into a MemoryStream before deserializing&lt;/summary&gt;
	 */
	public static Packet_ServerBlockType deserializeBuffer(byte[] buffer, int length, Packet_ServerBlockType instance)
	{
		CitoMemoryStream ms = CitoMemoryStream.create(buffer, length);
		Packet_ServerBlockTypeSerializer.deserialize(ms, instance);
		return instance;
	}

	/**
	 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
	 */
	public static Packet_ServerBlockType deserializeLength(CitoStream stream, int length, Packet_ServerBlockType instance)
	{
		int limit = stream.position() + length;
		while (true) {
			if (stream.position() >= limit) {
				if (stream.position() == limit)
					break;
				else
					return null;
			}
			int keyByte = stream.readByte();
			if (keyByte == -1)
				return null;
			switch (keyByte) {
			case 8:
				instance.id = ProtocolParser.readUInt64(stream);
				continue;
			case 18:
				if (instance.blocktype == null)
					instance.blocktype = Packet_BlockTypeSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_BlockTypeSerializer.deserializeLengthDelimited(stream, instance.blocktype);
				continue;
			default:
				break;
			}
			Key key = ProtocolParser.readKey_((byte) keyByte, stream);
			switch (key.getField()) {
			case 0:
				return null;
			default:
				ProtocolParser.skipKey(stream, key);
				break;
			}
		}
		return instance;
	}

	/**
	 * &lt;summary&gt;Read the VarInt length prefix and the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
	 */
	public static Packet_ServerBlockType deserializeLengthDelimited(CitoStream stream, Packet_ServerBlockType instance)
	{
		int limit = ProtocolParser.readUInt32(stream);
		limit += stream.position();
		while (true) {
			if (stream.position() >= limit) {
				if (stream.position() == limit)
					break;
				else
					return null;
			}
			int keyByte = stream.readByte();
			if (keyByte == -1)
				return null;
			switch (keyByte) {
			case 8:
				instance.id = ProtocolParser.readUInt64(stream);
				continue;
			case 18:
				if (instance.blocktype == null)
					instance.blocktype = Packet_BlockTypeSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_BlockTypeSerializer.deserializeLengthDelimited(stream, instance.blocktype);
				continue;
			default:
				break;
			}
			Key key = ProtocolParser.readKey_((byte) keyByte, stream);
			switch (key.getField()) {
			case 0:
				return null;
			default:
				ProtocolParser.skipKey(stream, key);
				break;
			}
		}
		return instance;
	}

	/**
	 * &lt;summary&gt;Helper: create a new instance to deserializing into&lt;/summary&gt;
	 */
	public static Packet_ServerBlockType deserializeLengthDelimitedNew(CitoStream stream)
	{
		Packet_ServerBlockType instance = new Packet_ServerBlockType();
		Packet_ServerBlockTypeSerializer.deserializeLengthDelimited(stream, instance);
		return instance;
	}

	/**
	 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
	 */
	public static void serialize(CitoStream stream, Packet_ServerBlockType instance)
	{
		stream.writeByte(ProtoPlatform.intToByte(8));
		ProtocolParser.writeUInt64(stream, instance.id);
		if (instance.blocktype != null) {
			stream.writeByte(ProtoPlatform.intToByte(18));
			CitoMemoryStream ms2 = new CitoMemoryStream();
			Packet_BlockTypeSerializer.serialize(ms2, instance.blocktype);
			int ms2Length = ms2.length();
			ProtocolParser.writeUInt32_(stream, ms2Length);
			stream.write(ms2.getBuffer(), 0, ms2Length);
		}
	}

	/**
	 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
	 */
	public static void serializeLengthDelimited(CitoStream stream, Packet_ServerBlockType instance)
	{
		byte[] data = Packet_ServerBlockTypeSerializer.serializeToBytes(instance);
		ProtocolParser.writeUInt32_(stream, ProtoPlatform.arrayLength(data));
		stream.write(data, 0, ProtoPlatform.arrayLength(data));
	}

	/**
	 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
	 */
	public static byte[] serializeToBytes(Packet_ServerBlockType instance)
	{
		CitoMemoryStream ms = new CitoMemoryStream();
		Packet_ServerBlockTypeSerializer.serialize(ms, instance);
		return ms.toArray();
	}
}
