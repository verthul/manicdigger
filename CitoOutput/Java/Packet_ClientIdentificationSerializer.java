// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class Packet_ClientIdentificationSerializer
{

	/**
	 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
	 */
	public static Packet_ClientIdentification deserialize(CitoStream stream, Packet_ClientIdentification instance)
	{
		while (true) {
			int keyByte = stream.readByte();
			if (keyByte == -1)
				break;
			switch (keyByte) {
			case 10:
				instance.mdProtocolVersion = ProtocolParser.readString(stream);
				continue;
			case 18:
				instance.username = ProtocolParser.readString(stream);
				continue;
			case 26:
				instance.verificationKey = ProtocolParser.readString(stream);
				continue;
			case 34:
				instance.serverPassword = ProtocolParser.readString(stream);
				continue;
			case 42:
				if (instance.requestPosition == null)
					instance.requestPosition = Packet_PositionAndOrientationSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_PositionAndOrientationSerializer.deserializeLengthDelimited(stream, instance.requestPosition);
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
	public static Packet_ClientIdentification deserializeBuffer(byte[] buffer, int length, Packet_ClientIdentification instance)
	{
		CitoMemoryStream ms = CitoMemoryStream.create(buffer, length);
		Packet_ClientIdentificationSerializer.deserialize(ms, instance);
		return instance;
	}

	/**
	 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
	 */
	public static Packet_ClientIdentification deserializeLength(CitoStream stream, int length, Packet_ClientIdentification instance)
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
				instance.mdProtocolVersion = ProtocolParser.readString(stream);
				continue;
			case 18:
				instance.username = ProtocolParser.readString(stream);
				continue;
			case 26:
				instance.verificationKey = ProtocolParser.readString(stream);
				continue;
			case 34:
				instance.serverPassword = ProtocolParser.readString(stream);
				continue;
			case 42:
				if (instance.requestPosition == null)
					instance.requestPosition = Packet_PositionAndOrientationSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_PositionAndOrientationSerializer.deserializeLengthDelimited(stream, instance.requestPosition);
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
	public static Packet_ClientIdentification deserializeLengthDelimited(CitoStream stream, Packet_ClientIdentification instance)
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
				instance.mdProtocolVersion = ProtocolParser.readString(stream);
				continue;
			case 18:
				instance.username = ProtocolParser.readString(stream);
				continue;
			case 26:
				instance.verificationKey = ProtocolParser.readString(stream);
				continue;
			case 34:
				instance.serverPassword = ProtocolParser.readString(stream);
				continue;
			case 42:
				if (instance.requestPosition == null)
					instance.requestPosition = Packet_PositionAndOrientationSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_PositionAndOrientationSerializer.deserializeLengthDelimited(stream, instance.requestPosition);
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
	public static Packet_ClientIdentification deserializeLengthDelimitedNew(CitoStream stream)
	{
		Packet_ClientIdentification instance = new Packet_ClientIdentification();
		Packet_ClientIdentificationSerializer.deserializeLengthDelimited(stream, instance);
		return instance;
	}

	/**
	 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
	 */
	public static void serialize(CitoStream stream, Packet_ClientIdentification instance)
	{
		if (instance.mdProtocolVersion != null) {
			stream.writeByte(ProtoPlatform.intToByte(10));
			ProtocolParser.writeBytes(stream, ProtoPlatform.stringToBytes(instance.mdProtocolVersion));
		}
		if (instance.username != null) {
			stream.writeByte(ProtoPlatform.intToByte(18));
			ProtocolParser.writeBytes(stream, ProtoPlatform.stringToBytes(instance.username));
		}
		if (instance.verificationKey != null) {
			stream.writeByte(ProtoPlatform.intToByte(26));
			ProtocolParser.writeBytes(stream, ProtoPlatform.stringToBytes(instance.verificationKey));
		}
		if (instance.serverPassword != null) {
			stream.writeByte(ProtoPlatform.intToByte(34));
			ProtocolParser.writeBytes(stream, ProtoPlatform.stringToBytes(instance.serverPassword));
		}
		if (instance.requestPosition != null) {
			stream.writeByte(ProtoPlatform.intToByte(42));
			CitoMemoryStream ms5 = new CitoMemoryStream();
			Packet_PositionAndOrientationSerializer.serialize(ms5, instance.requestPosition);
			int ms5Length = ms5.length();
			ProtocolParser.writeUInt32_(stream, ms5Length);
			stream.write(ms5.getBuffer(), 0, ms5Length);
		}
	}

	/**
	 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
	 */
	public static void serializeLengthDelimited(CitoStream stream, Packet_ClientIdentification instance)
	{
		byte[] data = Packet_ClientIdentificationSerializer.serializeToBytes(instance);
		ProtocolParser.writeUInt32_(stream, ProtoPlatform.arrayLength(data));
		stream.write(data, 0, ProtoPlatform.arrayLength(data));
	}

	/**
	 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
	 */
	public static byte[] serializeToBytes(Packet_ClientIdentification instance)
	{
		CitoMemoryStream ms = new CitoMemoryStream();
		Packet_ClientIdentificationSerializer.serialize(ms, instance);
		return ms.toArray();
	}
}
