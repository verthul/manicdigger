// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class Packet_ServerEntityDrawAreaSerializer
{

	/**
	 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
	 */
	public static Packet_ServerEntityDrawArea deserialize(CitoStream stream, Packet_ServerEntityDrawArea instance)
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
				instance.sizex = ProtocolParser.readUInt64(stream);
				continue;
			case 40:
				instance.sizey = ProtocolParser.readUInt64(stream);
				continue;
			case 48:
				instance.sizez = ProtocolParser.readUInt64(stream);
				continue;
			case 56:
				instance.visibleToClientId = ProtocolParser.readUInt64(stream);
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
	public static Packet_ServerEntityDrawArea deserializeBuffer(byte[] buffer, int length, Packet_ServerEntityDrawArea instance)
	{
		CitoMemoryStream ms = CitoMemoryStream.create(buffer, length);
		Packet_ServerEntityDrawAreaSerializer.deserialize(ms, instance);
		return instance;
	}

	/**
	 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
	 */
	public static Packet_ServerEntityDrawArea deserializeLength(CitoStream stream, int length, Packet_ServerEntityDrawArea instance)
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
				instance.sizex = ProtocolParser.readUInt64(stream);
				continue;
			case 40:
				instance.sizey = ProtocolParser.readUInt64(stream);
				continue;
			case 48:
				instance.sizez = ProtocolParser.readUInt64(stream);
				continue;
			case 56:
				instance.visibleToClientId = ProtocolParser.readUInt64(stream);
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
	public static Packet_ServerEntityDrawArea deserializeLengthDelimited(CitoStream stream, Packet_ServerEntityDrawArea instance)
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
				instance.sizex = ProtocolParser.readUInt64(stream);
				continue;
			case 40:
				instance.sizey = ProtocolParser.readUInt64(stream);
				continue;
			case 48:
				instance.sizez = ProtocolParser.readUInt64(stream);
				continue;
			case 56:
				instance.visibleToClientId = ProtocolParser.readUInt64(stream);
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
	public static Packet_ServerEntityDrawArea deserializeLengthDelimitedNew(CitoStream stream)
	{
		Packet_ServerEntityDrawArea instance = new Packet_ServerEntityDrawArea();
		Packet_ServerEntityDrawAreaSerializer.deserializeLengthDelimited(stream, instance);
		return instance;
	}

	/**
	 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
	 */
	public static void serialize(CitoStream stream, Packet_ServerEntityDrawArea instance)
	{
		stream.writeByte(ProtoPlatform.intToByte(8));
		ProtocolParser.writeUInt64(stream, instance.x);
		stream.writeByte(ProtoPlatform.intToByte(16));
		ProtocolParser.writeUInt64(stream, instance.y);
		stream.writeByte(ProtoPlatform.intToByte(24));
		ProtocolParser.writeUInt64(stream, instance.z);
		stream.writeByte(ProtoPlatform.intToByte(32));
		ProtocolParser.writeUInt64(stream, instance.sizex);
		stream.writeByte(ProtoPlatform.intToByte(40));
		ProtocolParser.writeUInt64(stream, instance.sizey);
		stream.writeByte(ProtoPlatform.intToByte(48));
		ProtocolParser.writeUInt64(stream, instance.sizez);
		stream.writeByte(ProtoPlatform.intToByte(56));
		ProtocolParser.writeUInt64(stream, instance.visibleToClientId);
	}

	/**
	 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
	 */
	public static void serializeLengthDelimited(CitoStream stream, Packet_ServerEntityDrawArea instance)
	{
		byte[] data = Packet_ServerEntityDrawAreaSerializer.serializeToBytes(instance);
		ProtocolParser.writeUInt32_(stream, ProtoPlatform.arrayLength(data));
		stream.write(data, 0, ProtoPlatform.arrayLength(data));
	}

	/**
	 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
	 */
	public static byte[] serializeToBytes(Packet_ServerEntityDrawArea instance)
	{
		CitoMemoryStream ms = new CitoMemoryStream();
		Packet_ServerEntityDrawAreaSerializer.serialize(ms, instance);
		return ms.toArray();
	}
}
