// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class Packet_ServerEntityDrawNameSerializer
{

	/**
	 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
	 */
	public static Packet_ServerEntityDrawName deserialize(CitoStream stream, Packet_ServerEntityDrawName instance)
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
				instance.onlyWhenSelected = ProtocolParser.readBool(stream);
				continue;
			case 24:
				instance.clientAutoComplete = ProtocolParser.readBool(stream);
				continue;
			case 34:
				instance.color = ProtocolParser.readString(stream);
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
	public static Packet_ServerEntityDrawName deserializeBuffer(byte[] buffer, int length, Packet_ServerEntityDrawName instance)
	{
		CitoMemoryStream ms = CitoMemoryStream.create(buffer, length);
		Packet_ServerEntityDrawNameSerializer.deserialize(ms, instance);
		return instance;
	}

	/**
	 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
	 */
	public static Packet_ServerEntityDrawName deserializeLength(CitoStream stream, int length, Packet_ServerEntityDrawName instance)
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
				instance.onlyWhenSelected = ProtocolParser.readBool(stream);
				continue;
			case 24:
				instance.clientAutoComplete = ProtocolParser.readBool(stream);
				continue;
			case 34:
				instance.color = ProtocolParser.readString(stream);
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
	public static Packet_ServerEntityDrawName deserializeLengthDelimited(CitoStream stream, Packet_ServerEntityDrawName instance)
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
				instance.onlyWhenSelected = ProtocolParser.readBool(stream);
				continue;
			case 24:
				instance.clientAutoComplete = ProtocolParser.readBool(stream);
				continue;
			case 34:
				instance.color = ProtocolParser.readString(stream);
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
	public static Packet_ServerEntityDrawName deserializeLengthDelimitedNew(CitoStream stream)
	{
		Packet_ServerEntityDrawName instance = new Packet_ServerEntityDrawName();
		Packet_ServerEntityDrawNameSerializer.deserializeLengthDelimited(stream, instance);
		return instance;
	}

	/**
	 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
	 */
	public static void serialize(CitoStream stream, Packet_ServerEntityDrawName instance)
	{
		if (instance.name != null) {
			stream.writeByte(ProtoPlatform.intToByte(10));
			ProtocolParser.writeBytes(stream, ProtoPlatform.stringToBytes(instance.name));
		}
		stream.writeByte(ProtoPlatform.intToByte(16));
		ProtocolParser.writeBool(stream, instance.onlyWhenSelected);
		stream.writeByte(ProtoPlatform.intToByte(24));
		ProtocolParser.writeBool(stream, instance.clientAutoComplete);
		if (instance.color != null) {
			stream.writeByte(ProtoPlatform.intToByte(34));
			ProtocolParser.writeBytes(stream, ProtoPlatform.stringToBytes(instance.color));
		}
	}

	/**
	 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
	 */
	public static void serializeLengthDelimited(CitoStream stream, Packet_ServerEntityDrawName instance)
	{
		byte[] data = Packet_ServerEntityDrawNameSerializer.serializeToBytes(instance);
		ProtocolParser.writeUInt32_(stream, ProtoPlatform.arrayLength(data));
		stream.write(data, 0, ProtoPlatform.arrayLength(data));
	}

	/**
	 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
	 */
	public static byte[] serializeToBytes(Packet_ServerEntityDrawName instance)
	{
		CitoMemoryStream ms = new CitoMemoryStream();
		Packet_ServerEntityDrawNameSerializer.serialize(ms, instance);
		return ms.toArray();
	}
}
