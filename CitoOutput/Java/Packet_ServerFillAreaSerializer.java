// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class Packet_ServerFillAreaSerializer
{

	/**
	 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
	 */
	public static Packet_ServerFillArea deserialize(CitoStream stream, Packet_ServerFillArea instance)
	{
		while (true) {
			int keyByte = stream.readByte();
			if (keyByte == -1)
				break;
			switch (keyByte) {
			case 8:
				instance.x1 = ProtocolParser.readUInt64(stream);
				continue;
			case 16:
				instance.x2 = ProtocolParser.readUInt64(stream);
				continue;
			case 24:
				instance.y1 = ProtocolParser.readUInt64(stream);
				continue;
			case 32:
				instance.y2 = ProtocolParser.readUInt64(stream);
				continue;
			case 40:
				instance.z1 = ProtocolParser.readUInt64(stream);
				continue;
			case 48:
				instance.z2 = ProtocolParser.readUInt64(stream);
				continue;
			case 56:
				instance.blockType = ProtocolParser.readUInt64(stream);
				continue;
			case 64:
				instance.blockCount = ProtocolParser.readUInt64(stream);
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
	public static Packet_ServerFillArea deserializeBuffer(byte[] buffer, int length, Packet_ServerFillArea instance)
	{
		CitoMemoryStream ms = CitoMemoryStream.create(buffer, length);
		Packet_ServerFillAreaSerializer.deserialize(ms, instance);
		return instance;
	}

	/**
	 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
	 */
	public static Packet_ServerFillArea deserializeLength(CitoStream stream, int length, Packet_ServerFillArea instance)
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
				instance.x1 = ProtocolParser.readUInt64(stream);
				continue;
			case 16:
				instance.x2 = ProtocolParser.readUInt64(stream);
				continue;
			case 24:
				instance.y1 = ProtocolParser.readUInt64(stream);
				continue;
			case 32:
				instance.y2 = ProtocolParser.readUInt64(stream);
				continue;
			case 40:
				instance.z1 = ProtocolParser.readUInt64(stream);
				continue;
			case 48:
				instance.z2 = ProtocolParser.readUInt64(stream);
				continue;
			case 56:
				instance.blockType = ProtocolParser.readUInt64(stream);
				continue;
			case 64:
				instance.blockCount = ProtocolParser.readUInt64(stream);
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
	public static Packet_ServerFillArea deserializeLengthDelimited(CitoStream stream, Packet_ServerFillArea instance)
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
				instance.x1 = ProtocolParser.readUInt64(stream);
				continue;
			case 16:
				instance.x2 = ProtocolParser.readUInt64(stream);
				continue;
			case 24:
				instance.y1 = ProtocolParser.readUInt64(stream);
				continue;
			case 32:
				instance.y2 = ProtocolParser.readUInt64(stream);
				continue;
			case 40:
				instance.z1 = ProtocolParser.readUInt64(stream);
				continue;
			case 48:
				instance.z2 = ProtocolParser.readUInt64(stream);
				continue;
			case 56:
				instance.blockType = ProtocolParser.readUInt64(stream);
				continue;
			case 64:
				instance.blockCount = ProtocolParser.readUInt64(stream);
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
	public static Packet_ServerFillArea deserializeLengthDelimitedNew(CitoStream stream)
	{
		Packet_ServerFillArea instance = new Packet_ServerFillArea();
		Packet_ServerFillAreaSerializer.deserializeLengthDelimited(stream, instance);
		return instance;
	}

	/**
	 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
	 */
	public static void serialize(CitoStream stream, Packet_ServerFillArea instance)
	{
		stream.writeByte(ProtoPlatform.intToByte(8));
		ProtocolParser.writeUInt64(stream, instance.x1);
		stream.writeByte(ProtoPlatform.intToByte(16));
		ProtocolParser.writeUInt64(stream, instance.x2);
		stream.writeByte(ProtoPlatform.intToByte(24));
		ProtocolParser.writeUInt64(stream, instance.y1);
		stream.writeByte(ProtoPlatform.intToByte(32));
		ProtocolParser.writeUInt64(stream, instance.y2);
		stream.writeByte(ProtoPlatform.intToByte(40));
		ProtocolParser.writeUInt64(stream, instance.z1);
		stream.writeByte(ProtoPlatform.intToByte(48));
		ProtocolParser.writeUInt64(stream, instance.z2);
		stream.writeByte(ProtoPlatform.intToByte(56));
		ProtocolParser.writeUInt64(stream, instance.blockType);
		stream.writeByte(ProtoPlatform.intToByte(64));
		ProtocolParser.writeUInt64(stream, instance.blockCount);
	}

	/**
	 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
	 */
	public static void serializeLengthDelimited(CitoStream stream, Packet_ServerFillArea instance)
	{
		byte[] data = Packet_ServerFillAreaSerializer.serializeToBytes(instance);
		ProtocolParser.writeUInt32_(stream, ProtoPlatform.arrayLength(data));
		stream.write(data, 0, ProtoPlatform.arrayLength(data));
	}

	/**
	 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
	 */
	public static byte[] serializeToBytes(Packet_ServerFillArea instance)
	{
		CitoMemoryStream ms = new CitoMemoryStream();
		Packet_ServerFillAreaSerializer.serialize(ms, instance);
		return ms.toArray();
	}
}
