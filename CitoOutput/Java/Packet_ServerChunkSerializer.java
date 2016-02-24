// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class Packet_ServerChunkSerializer
{

	/**
	 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
	 */
	public static Packet_ServerChunk deserialize(CitoStream stream, Packet_ServerChunk instance)
	{
		while (true) {
			int keyByte = stream.readByte();
			if (keyByte == -1)
				break;
			switch (keyByte) {
			case 8:
				instance.x = ProtocolParser.readUInt64(stream);
				continue;
			case 16:
				instance.y = ProtocolParser.readUInt64(stream);
				continue;
			case 24:
				instance.z = ProtocolParser.readUInt64(stream);
				continue;
			case 32:
				instance.sizeX = ProtocolParser.readUInt64(stream);
				continue;
			case 40:
				instance.sizeY = ProtocolParser.readUInt64(stream);
				continue;
			case 48:
				instance.sizeZ = ProtocolParser.readUInt64(stream);
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
	public static Packet_ServerChunk deserializeBuffer(byte[] buffer, int length, Packet_ServerChunk instance)
	{
		CitoMemoryStream ms = CitoMemoryStream.create(buffer, length);
		Packet_ServerChunkSerializer.deserialize(ms, instance);
		return instance;
	}

	/**
	 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
	 */
	public static Packet_ServerChunk deserializeLength(CitoStream stream, int length, Packet_ServerChunk instance)
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
				instance.x = ProtocolParser.readUInt64(stream);
				continue;
			case 16:
				instance.y = ProtocolParser.readUInt64(stream);
				continue;
			case 24:
				instance.z = ProtocolParser.readUInt64(stream);
				continue;
			case 32:
				instance.sizeX = ProtocolParser.readUInt64(stream);
				continue;
			case 40:
				instance.sizeY = ProtocolParser.readUInt64(stream);
				continue;
			case 48:
				instance.sizeZ = ProtocolParser.readUInt64(stream);
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
	public static Packet_ServerChunk deserializeLengthDelimited(CitoStream stream, Packet_ServerChunk instance)
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
				instance.x = ProtocolParser.readUInt64(stream);
				continue;
			case 16:
				instance.y = ProtocolParser.readUInt64(stream);
				continue;
			case 24:
				instance.z = ProtocolParser.readUInt64(stream);
				continue;
			case 32:
				instance.sizeX = ProtocolParser.readUInt64(stream);
				continue;
			case 40:
				instance.sizeY = ProtocolParser.readUInt64(stream);
				continue;
			case 48:
				instance.sizeZ = ProtocolParser.readUInt64(stream);
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
	public static Packet_ServerChunk deserializeLengthDelimitedNew(CitoStream stream)
	{
		Packet_ServerChunk instance = new Packet_ServerChunk();
		Packet_ServerChunkSerializer.deserializeLengthDelimited(stream, instance);
		return instance;
	}

	/**
	 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
	 */
	public static void serialize(CitoStream stream, Packet_ServerChunk instance)
	{
		stream.writeByte(ProtoPlatform.intToByte(8));
		ProtocolParser.writeUInt64(stream, instance.x);
		stream.writeByte(ProtoPlatform.intToByte(16));
		ProtocolParser.writeUInt64(stream, instance.y);
		stream.writeByte(ProtoPlatform.intToByte(24));
		ProtocolParser.writeUInt64(stream, instance.z);
		stream.writeByte(ProtoPlatform.intToByte(32));
		ProtocolParser.writeUInt64(stream, instance.sizeX);
		stream.writeByte(ProtoPlatform.intToByte(40));
		ProtocolParser.writeUInt64(stream, instance.sizeY);
		stream.writeByte(ProtoPlatform.intToByte(48));
		ProtocolParser.writeUInt64(stream, instance.sizeZ);
	}

	/**
	 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
	 */
	public static void serializeLengthDelimited(CitoStream stream, Packet_ServerChunk instance)
	{
		byte[] data = Packet_ServerChunkSerializer.serializeToBytes(instance);
		ProtocolParser.writeUInt32_(stream, ProtoPlatform.arrayLength(data));
		stream.write(data, 0, ProtoPlatform.arrayLength(data));
	}

	/**
	 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
	 */
	public static byte[] serializeToBytes(Packet_ServerChunk instance)
	{
		CitoMemoryStream ms = new CitoMemoryStream();
		Packet_ServerChunkSerializer.serialize(ms, instance);
		return ms.toArray();
	}
}
