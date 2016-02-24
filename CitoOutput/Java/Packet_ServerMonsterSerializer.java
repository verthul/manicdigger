// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class Packet_ServerMonsterSerializer
{

	/**
	 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
	 */
	public static Packet_ServerMonster deserialize(CitoStream stream, Packet_ServerMonster instance)
	{
		while (true) {
			int keyByte = stream.readByte();
			if (keyByte == -1)
				break;
			switch (keyByte) {
			case 8:
				instance.id = ProtocolParser.readUInt64(stream);
				continue;
			case 16:
				instance.monsterType = ProtocolParser.readUInt64(stream);
				continue;
			case 26:
				if (instance.positionAndOrientation == null)
					instance.positionAndOrientation = Packet_PositionAndOrientationSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_PositionAndOrientationSerializer.deserializeLengthDelimited(stream, instance.positionAndOrientation);
				continue;
			case 32:
				instance.health = ProtocolParser.readUInt64(stream);
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
	public static Packet_ServerMonster deserializeBuffer(byte[] buffer, int length, Packet_ServerMonster instance)
	{
		CitoMemoryStream ms = CitoMemoryStream.create(buffer, length);
		Packet_ServerMonsterSerializer.deserialize(ms, instance);
		return instance;
	}

	/**
	 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
	 */
	public static Packet_ServerMonster deserializeLength(CitoStream stream, int length, Packet_ServerMonster instance)
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
			case 16:
				instance.monsterType = ProtocolParser.readUInt64(stream);
				continue;
			case 26:
				if (instance.positionAndOrientation == null)
					instance.positionAndOrientation = Packet_PositionAndOrientationSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_PositionAndOrientationSerializer.deserializeLengthDelimited(stream, instance.positionAndOrientation);
				continue;
			case 32:
				instance.health = ProtocolParser.readUInt64(stream);
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
	public static Packet_ServerMonster deserializeLengthDelimited(CitoStream stream, Packet_ServerMonster instance)
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
			case 16:
				instance.monsterType = ProtocolParser.readUInt64(stream);
				continue;
			case 26:
				if (instance.positionAndOrientation == null)
					instance.positionAndOrientation = Packet_PositionAndOrientationSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_PositionAndOrientationSerializer.deserializeLengthDelimited(stream, instance.positionAndOrientation);
				continue;
			case 32:
				instance.health = ProtocolParser.readUInt64(stream);
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
	public static Packet_ServerMonster deserializeLengthDelimitedNew(CitoStream stream)
	{
		Packet_ServerMonster instance = new Packet_ServerMonster();
		Packet_ServerMonsterSerializer.deserializeLengthDelimited(stream, instance);
		return instance;
	}

	/**
	 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
	 */
	public static void serialize(CitoStream stream, Packet_ServerMonster instance)
	{
		stream.writeByte(ProtoPlatform.intToByte(8));
		ProtocolParser.writeUInt64(stream, instance.id);
		stream.writeByte(ProtoPlatform.intToByte(16));
		ProtocolParser.writeUInt64(stream, instance.monsterType);
		if (instance.positionAndOrientation != null) {
			stream.writeByte(ProtoPlatform.intToByte(26));
			CitoMemoryStream ms3 = new CitoMemoryStream();
			Packet_PositionAndOrientationSerializer.serialize(ms3, instance.positionAndOrientation);
			int ms3Length = ms3.length();
			ProtocolParser.writeUInt32_(stream, ms3Length);
			stream.write(ms3.getBuffer(), 0, ms3Length);
		}
		stream.writeByte(ProtoPlatform.intToByte(32));
		ProtocolParser.writeUInt64(stream, instance.health);
	}

	/**
	 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
	 */
	public static void serializeLengthDelimited(CitoStream stream, Packet_ServerMonster instance)
	{
		byte[] data = Packet_ServerMonsterSerializer.serializeToBytes(instance);
		ProtocolParser.writeUInt32_(stream, ProtoPlatform.arrayLength(data));
		stream.write(data, 0, ProtoPlatform.arrayLength(data));
	}

	/**
	 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
	 */
	public static byte[] serializeToBytes(Packet_ServerMonster instance)
	{
		CitoMemoryStream ms = new CitoMemoryStream();
		Packet_ServerMonsterSerializer.serialize(ms, instance);
		return ms.toArray();
	}
}
