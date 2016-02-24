// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class Packet_ServerSoundSerializer
{

	/**
	 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
	 */
	public static Packet_ServerSound deserialize(CitoStream stream, Packet_ServerSound instance)
	{
		while (true) {
			int keyByte = stream.readByte();
			if (keyByte == -1)
				break;
			switch (keyByte) {
			case 10:
				instance.name = ProtocolParser.readString(stream);
				continue;
			case 16:
				instance.x = ProtocolParser.readUInt64(stream);
				continue;
			case 24:
				instance.y = ProtocolParser.readUInt64(stream);
				continue;
			case 32:
				instance.z = ProtocolParser.readUInt64(stream);
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
	public static Packet_ServerSound deserializeBuffer(byte[] buffer, int length, Packet_ServerSound instance)
	{
		CitoMemoryStream ms = CitoMemoryStream.create(buffer, length);
		Packet_ServerSoundSerializer.deserialize(ms, instance);
		return instance;
	}

	/**
	 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
	 */
	public static Packet_ServerSound deserializeLength(CitoStream stream, int length, Packet_ServerSound instance)
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
			case 10:
				instance.name = ProtocolParser.readString(stream);
				continue;
			case 16:
				instance.x = ProtocolParser.readUInt64(stream);
				continue;
			case 24:
				instance.y = ProtocolParser.readUInt64(stream);
				continue;
			case 32:
				instance.z = ProtocolParser.readUInt64(stream);
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
	public static Packet_ServerSound deserializeLengthDelimited(CitoStream stream, Packet_ServerSound instance)
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
			case 10:
				instance.name = ProtocolParser.readString(stream);
				continue;
			case 16:
				instance.x = ProtocolParser.readUInt64(stream);
				continue;
			case 24:
				instance.y = ProtocolParser.readUInt64(stream);
				continue;
			case 32:
				instance.z = ProtocolParser.readUInt64(stream);
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
	public static Packet_ServerSound deserializeLengthDelimitedNew(CitoStream stream)
	{
		Packet_ServerSound instance = new Packet_ServerSound();
		Packet_ServerSoundSerializer.deserializeLengthDelimited(stream, instance);
		return instance;
	}

	/**
	 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
	 */
	public static void serialize(CitoStream stream, Packet_ServerSound instance)
	{
		if (instance.name != null) {
			stream.writeByte(ProtoPlatform.intToByte(10));
			ProtocolParser.writeBytes(stream, ProtoPlatform.stringToBytes(instance.name));
		}
		stream.writeByte(ProtoPlatform.intToByte(16));
		ProtocolParser.writeUInt64(stream, instance.x);
		stream.writeByte(ProtoPlatform.intToByte(24));
		ProtocolParser.writeUInt64(stream, instance.y);
		stream.writeByte(ProtoPlatform.intToByte(32));
		ProtocolParser.writeUInt64(stream, instance.z);
	}

	/**
	 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
	 */
	public static void serializeLengthDelimited(CitoStream stream, Packet_ServerSound instance)
	{
		byte[] data = Packet_ServerSoundSerializer.serializeToBytes(instance);
		ProtocolParser.writeUInt32_(stream, ProtoPlatform.arrayLength(data));
		stream.write(data, 0, ProtoPlatform.arrayLength(data));
	}

	/**
	 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
	 */
	public static byte[] serializeToBytes(Packet_ServerSound instance)
	{
		CitoMemoryStream ms = new CitoMemoryStream();
		Packet_ServerSoundSerializer.serialize(ms, instance);
		return ms.toArray();
	}
}
