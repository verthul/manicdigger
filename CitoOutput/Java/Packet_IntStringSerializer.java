// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class Packet_IntStringSerializer
{

	/**
	 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
	 */
	public static Packet_IntString deserialize(CitoStream stream, Packet_IntString instance)
	{
		while (true) {
			int keyByte = stream.readByte();
			if (keyByte == -1)
				break;
			switch (keyByte) {
			case 8:
				instance.key_ = ProtocolParser.readUInt64(stream);
				continue;
			case 18:
				instance.value_ = ProtocolParser.readString(stream);
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
	public static Packet_IntString deserializeBuffer(byte[] buffer, int length, Packet_IntString instance)
	{
		CitoMemoryStream ms = CitoMemoryStream.create(buffer, length);
		Packet_IntStringSerializer.deserialize(ms, instance);
		return instance;
	}

	/**
	 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
	 */
	public static Packet_IntString deserializeLength(CitoStream stream, int length, Packet_IntString instance)
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
				instance.key_ = ProtocolParser.readUInt64(stream);
				continue;
			case 18:
				instance.value_ = ProtocolParser.readString(stream);
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
	public static Packet_IntString deserializeLengthDelimited(CitoStream stream, Packet_IntString instance)
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
				instance.key_ = ProtocolParser.readUInt64(stream);
				continue;
			case 18:
				instance.value_ = ProtocolParser.readString(stream);
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
	public static Packet_IntString deserializeLengthDelimitedNew(CitoStream stream)
	{
		Packet_IntString instance = new Packet_IntString();
		Packet_IntStringSerializer.deserializeLengthDelimited(stream, instance);
		return instance;
	}

	/**
	 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
	 */
	public static void serialize(CitoStream stream, Packet_IntString instance)
	{
		stream.writeByte(ProtoPlatform.intToByte(8));
		ProtocolParser.writeUInt64(stream, instance.key_);
		if (instance.value_ != null) {
			stream.writeByte(ProtoPlatform.intToByte(18));
			ProtocolParser.writeBytes(stream, ProtoPlatform.stringToBytes(instance.value_));
		}
	}

	/**
	 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
	 */
	public static void serializeLengthDelimited(CitoStream stream, Packet_IntString instance)
	{
		byte[] data = Packet_IntStringSerializer.serializeToBytes(instance);
		ProtocolParser.writeUInt32_(stream, ProtoPlatform.arrayLength(data));
		stream.write(data, 0, ProtoPlatform.arrayLength(data));
	}

	/**
	 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
	 */
	public static byte[] serializeToBytes(Packet_IntString instance)
	{
		CitoMemoryStream ms = new CitoMemoryStream();
		Packet_IntStringSerializer.serialize(ms, instance);
		return ms.toArray();
	}
}
