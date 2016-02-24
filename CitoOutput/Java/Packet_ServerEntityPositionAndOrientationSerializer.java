// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class Packet_ServerEntityPositionAndOrientationSerializer
{

	/**
	 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
	 */
	public static Packet_ServerEntityPositionAndOrientation deserialize(CitoStream stream, Packet_ServerEntityPositionAndOrientation instance)
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
				if (instance.positionAndOrientation == null)
					instance.positionAndOrientation = Packet_PositionAndOrientationSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_PositionAndOrientationSerializer.deserializeLengthDelimited(stream, instance.positionAndOrientation);
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
	public static Packet_ServerEntityPositionAndOrientation deserializeBuffer(byte[] buffer, int length, Packet_ServerEntityPositionAndOrientation instance)
	{
		CitoMemoryStream ms = CitoMemoryStream.create(buffer, length);
		Packet_ServerEntityPositionAndOrientationSerializer.deserialize(ms, instance);
		return instance;
	}

	/**
	 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
	 */
	public static Packet_ServerEntityPositionAndOrientation deserializeLength(CitoStream stream, int length, Packet_ServerEntityPositionAndOrientation instance)
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
				if (instance.positionAndOrientation == null)
					instance.positionAndOrientation = Packet_PositionAndOrientationSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_PositionAndOrientationSerializer.deserializeLengthDelimited(stream, instance.positionAndOrientation);
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
	public static Packet_ServerEntityPositionAndOrientation deserializeLengthDelimited(CitoStream stream, Packet_ServerEntityPositionAndOrientation instance)
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
				if (instance.positionAndOrientation == null)
					instance.positionAndOrientation = Packet_PositionAndOrientationSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_PositionAndOrientationSerializer.deserializeLengthDelimited(stream, instance.positionAndOrientation);
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
	public static Packet_ServerEntityPositionAndOrientation deserializeLengthDelimitedNew(CitoStream stream)
	{
		Packet_ServerEntityPositionAndOrientation instance = new Packet_ServerEntityPositionAndOrientation();
		Packet_ServerEntityPositionAndOrientationSerializer.deserializeLengthDelimited(stream, instance);
		return instance;
	}

	/**
	 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
	 */
	public static void serialize(CitoStream stream, Packet_ServerEntityPositionAndOrientation instance)
	{
		stream.writeByte(ProtoPlatform.intToByte(8));
		ProtocolParser.writeUInt64(stream, instance.id);
		if (instance.positionAndOrientation != null) {
			stream.writeByte(ProtoPlatform.intToByte(18));
			CitoMemoryStream ms2 = new CitoMemoryStream();
			Packet_PositionAndOrientationSerializer.serialize(ms2, instance.positionAndOrientation);
			int ms2Length = ms2.length();
			ProtocolParser.writeUInt32_(stream, ms2Length);
			stream.write(ms2.getBuffer(), 0, ms2Length);
		}
	}

	/**
	 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
	 */
	public static void serializeLengthDelimited(CitoStream stream, Packet_ServerEntityPositionAndOrientation instance)
	{
		byte[] data = Packet_ServerEntityPositionAndOrientationSerializer.serializeToBytes(instance);
		ProtocolParser.writeUInt32_(stream, ProtoPlatform.arrayLength(data));
		stream.write(data, 0, ProtoPlatform.arrayLength(data));
	}

	/**
	 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
	 */
	public static byte[] serializeToBytes(Packet_ServerEntityPositionAndOrientation instance)
	{
		CitoMemoryStream ms = new CitoMemoryStream();
		Packet_ServerEntityPositionAndOrientationSerializer.serialize(ms, instance);
		return ms.toArray();
	}
}
