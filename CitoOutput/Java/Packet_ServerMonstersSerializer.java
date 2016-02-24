// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class Packet_ServerMonstersSerializer
{

	/**
	 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
	 */
	public static Packet_ServerMonsters deserialize(CitoStream stream, Packet_ServerMonsters instance)
	{
		if (instance.monsters == null) {
			instance.monsters = new Packet_ServerMonster[1];
			instance.monstersCount = 0;
			instance.monstersLength = 1;
		}
		while (true) {
			int keyByte = stream.readByte();
			if (keyByte == -1)
				break;
			switch (keyByte) {
			case 10:
				instance.monstersAdd(Packet_ServerMonsterSerializer.deserializeLengthDelimitedNew(stream));
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
	public static Packet_ServerMonsters deserializeBuffer(byte[] buffer, int length, Packet_ServerMonsters instance)
	{
		CitoMemoryStream ms = CitoMemoryStream.create(buffer, length);
		Packet_ServerMonstersSerializer.deserialize(ms, instance);
		return instance;
	}

	/**
	 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
	 */
	public static Packet_ServerMonsters deserializeLength(CitoStream stream, int length, Packet_ServerMonsters instance)
	{
		if (instance.monsters == null) {
			instance.monsters = new Packet_ServerMonster[1];
			instance.monstersCount = 0;
			instance.monstersLength = 1;
		}
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
				instance.monstersAdd(Packet_ServerMonsterSerializer.deserializeLengthDelimitedNew(stream));
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
	public static Packet_ServerMonsters deserializeLengthDelimited(CitoStream stream, Packet_ServerMonsters instance)
	{
		if (instance.monsters == null) {
			instance.monsters = new Packet_ServerMonster[1];
			instance.monstersCount = 0;
			instance.monstersLength = 1;
		}
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
				instance.monstersAdd(Packet_ServerMonsterSerializer.deserializeLengthDelimitedNew(stream));
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
	public static Packet_ServerMonsters deserializeLengthDelimitedNew(CitoStream stream)
	{
		Packet_ServerMonsters instance = new Packet_ServerMonsters();
		Packet_ServerMonstersSerializer.deserializeLengthDelimited(stream, instance);
		return instance;
	}

	/**
	 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
	 */
	public static void serialize(CitoStream stream, Packet_ServerMonsters instance)
	{
		if (instance.monsters != null) {
			for (int k = 0; k < instance.monstersCount; k++) {
				Packet_ServerMonster i1 = instance.monsters[k];
				stream.writeByte(ProtoPlatform.intToByte(10));
				CitoMemoryStream ms1 = new CitoMemoryStream();
				Packet_ServerMonsterSerializer.serialize(ms1, i1);
				int ms1Length = ms1.length();
				ProtocolParser.writeUInt32_(stream, ms1Length);
				stream.write(ms1.getBuffer(), 0, ms1Length);
			}
		}
	}

	/**
	 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
	 */
	public static void serializeLengthDelimited(CitoStream stream, Packet_ServerMonsters instance)
	{
		byte[] data = Packet_ServerMonstersSerializer.serializeToBytes(instance);
		ProtocolParser.writeUInt32_(stream, ProtoPlatform.arrayLength(data));
		stream.write(data, 0, ProtoPlatform.arrayLength(data));
	}

	/**
	 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
	 */
	public static byte[] serializeToBytes(Packet_ServerMonsters instance)
	{
		CitoMemoryStream ms = new CitoMemoryStream();
		Packet_ServerMonstersSerializer.serialize(ms, instance);
		return ms.toArray();
	}
}
