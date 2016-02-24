// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class Packet_ServerTranslatedStringSerializer
{

	/**
	 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
	 */
	public static Packet_ServerTranslatedString deserialize(CitoStream stream, Packet_ServerTranslatedString instance)
	{
		while (true) {
			int keyByte = stream.readByte();
			if (keyByte == -1)
				break;
			switch (keyByte) {
			case 10:
				instance.lang = ProtocolParser.readString(stream);
				continue;
			case 18:
				instance.id = ProtocolParser.readString(stream);
				continue;
			case 26:
				instance.translation = ProtocolParser.readString(stream);
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
	public static Packet_ServerTranslatedString deserializeBuffer(byte[] buffer, int length, Packet_ServerTranslatedString instance)
	{
		CitoMemoryStream ms = CitoMemoryStream.create(buffer, length);
		Packet_ServerTranslatedStringSerializer.deserialize(ms, instance);
		return instance;
	}

	/**
	 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
	 */
	public static Packet_ServerTranslatedString deserializeLength(CitoStream stream, int length, Packet_ServerTranslatedString instance)
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
				instance.lang = ProtocolParser.readString(stream);
				continue;
			case 18:
				instance.id = ProtocolParser.readString(stream);
				continue;
			case 26:
				instance.translation = ProtocolParser.readString(stream);
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
	public static Packet_ServerTranslatedString deserializeLengthDelimited(CitoStream stream, Packet_ServerTranslatedString instance)
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
				instance.lang = ProtocolParser.readString(stream);
				continue;
			case 18:
				instance.id = ProtocolParser.readString(stream);
				continue;
			case 26:
				instance.translation = ProtocolParser.readString(stream);
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
	public static Packet_ServerTranslatedString deserializeLengthDelimitedNew(CitoStream stream)
	{
		Packet_ServerTranslatedString instance = new Packet_ServerTranslatedString();
		Packet_ServerTranslatedStringSerializer.deserializeLengthDelimited(stream, instance);
		return instance;
	}

	/**
	 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
	 */
	public static void serialize(CitoStream stream, Packet_ServerTranslatedString instance)
	{
		if (instance.lang != null) {
			stream.writeByte(ProtoPlatform.intToByte(10));
			ProtocolParser.writeBytes(stream, ProtoPlatform.stringToBytes(instance.lang));
		}
		if (instance.id != null) {
			stream.writeByte(ProtoPlatform.intToByte(18));
			ProtocolParser.writeBytes(stream, ProtoPlatform.stringToBytes(instance.id));
		}
		if (instance.translation != null) {
			stream.writeByte(ProtoPlatform.intToByte(26));
			ProtocolParser.writeBytes(stream, ProtoPlatform.stringToBytes(instance.translation));
		}
	}

	/**
	 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
	 */
	public static void serializeLengthDelimited(CitoStream stream, Packet_ServerTranslatedString instance)
	{
		byte[] data = Packet_ServerTranslatedStringSerializer.serializeToBytes(instance);
		ProtocolParser.writeUInt32_(stream, ProtoPlatform.arrayLength(data));
		stream.write(data, 0, ProtoPlatform.arrayLength(data));
	}

	/**
	 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
	 */
	public static byte[] serializeToBytes(Packet_ServerTranslatedString instance)
	{
		CitoMemoryStream ms = new CitoMemoryStream();
		Packet_ServerTranslatedStringSerializer.serialize(ms, instance);
		return ms.toArray();
	}
}
