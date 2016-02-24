// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class Packet_ServerQueryAnswerSerializer
{

	/**
	 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
	 */
	public static Packet_ServerQueryAnswer deserialize(CitoStream stream, Packet_ServerQueryAnswer instance)
	{
		while (true) {
			int keyByte = stream.readByte();
			if (keyByte == -1)
				break;
			switch (keyByte) {
			case 10:
				instance.name = ProtocolParser.readString(stream);
				continue;
			case 18:
				instance.mOTD = ProtocolParser.readString(stream);
				continue;
			case 24:
				instance.playerCount = ProtocolParser.readUInt64(stream);
				continue;
			case 32:
				instance.maxPlayers = ProtocolParser.readUInt64(stream);
				continue;
			case 42:
				instance.playerList = ProtocolParser.readString(stream);
				continue;
			case 48:
				instance.port = ProtocolParser.readUInt64(stream);
				continue;
			case 58:
				instance.gameMode = ProtocolParser.readString(stream);
				continue;
			case 64:
				instance.password = ProtocolParser.readBool(stream);
				continue;
			case 74:
				instance.publicHash = ProtocolParser.readString(stream);
				continue;
			case 82:
				instance.serverVersion = ProtocolParser.readString(stream);
				continue;
			case 88:
				instance.mapSizeX = ProtocolParser.readUInt64(stream);
				continue;
			case 96:
				instance.mapSizeY = ProtocolParser.readUInt64(stream);
				continue;
			case 104:
				instance.mapSizeZ = ProtocolParser.readUInt64(stream);
				continue;
			case 114:
				instance.serverThumbnail = ProtocolParser.readBytes(stream);
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
	public static Packet_ServerQueryAnswer deserializeBuffer(byte[] buffer, int length, Packet_ServerQueryAnswer instance)
	{
		CitoMemoryStream ms = CitoMemoryStream.create(buffer, length);
		Packet_ServerQueryAnswerSerializer.deserialize(ms, instance);
		return instance;
	}

	/**
	 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
	 */
	public static Packet_ServerQueryAnswer deserializeLength(CitoStream stream, int length, Packet_ServerQueryAnswer instance)
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
			case 18:
				instance.mOTD = ProtocolParser.readString(stream);
				continue;
			case 24:
				instance.playerCount = ProtocolParser.readUInt64(stream);
				continue;
			case 32:
				instance.maxPlayers = ProtocolParser.readUInt64(stream);
				continue;
			case 42:
				instance.playerList = ProtocolParser.readString(stream);
				continue;
			case 48:
				instance.port = ProtocolParser.readUInt64(stream);
				continue;
			case 58:
				instance.gameMode = ProtocolParser.readString(stream);
				continue;
			case 64:
				instance.password = ProtocolParser.readBool(stream);
				continue;
			case 74:
				instance.publicHash = ProtocolParser.readString(stream);
				continue;
			case 82:
				instance.serverVersion = ProtocolParser.readString(stream);
				continue;
			case 88:
				instance.mapSizeX = ProtocolParser.readUInt64(stream);
				continue;
			case 96:
				instance.mapSizeY = ProtocolParser.readUInt64(stream);
				continue;
			case 104:
				instance.mapSizeZ = ProtocolParser.readUInt64(stream);
				continue;
			case 114:
				instance.serverThumbnail = ProtocolParser.readBytes(stream);
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
	public static Packet_ServerQueryAnswer deserializeLengthDelimited(CitoStream stream, Packet_ServerQueryAnswer instance)
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
			case 18:
				instance.mOTD = ProtocolParser.readString(stream);
				continue;
			case 24:
				instance.playerCount = ProtocolParser.readUInt64(stream);
				continue;
			case 32:
				instance.maxPlayers = ProtocolParser.readUInt64(stream);
				continue;
			case 42:
				instance.playerList = ProtocolParser.readString(stream);
				continue;
			case 48:
				instance.port = ProtocolParser.readUInt64(stream);
				continue;
			case 58:
				instance.gameMode = ProtocolParser.readString(stream);
				continue;
			case 64:
				instance.password = ProtocolParser.readBool(stream);
				continue;
			case 74:
				instance.publicHash = ProtocolParser.readString(stream);
				continue;
			case 82:
				instance.serverVersion = ProtocolParser.readString(stream);
				continue;
			case 88:
				instance.mapSizeX = ProtocolParser.readUInt64(stream);
				continue;
			case 96:
				instance.mapSizeY = ProtocolParser.readUInt64(stream);
				continue;
			case 104:
				instance.mapSizeZ = ProtocolParser.readUInt64(stream);
				continue;
			case 114:
				instance.serverThumbnail = ProtocolParser.readBytes(stream);
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
	public static Packet_ServerQueryAnswer deserializeLengthDelimitedNew(CitoStream stream)
	{
		Packet_ServerQueryAnswer instance = new Packet_ServerQueryAnswer();
		Packet_ServerQueryAnswerSerializer.deserializeLengthDelimited(stream, instance);
		return instance;
	}

	/**
	 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
	 */
	public static void serialize(CitoStream stream, Packet_ServerQueryAnswer instance)
	{
		if (instance.name != null) {
			stream.writeByte(ProtoPlatform.intToByte(10));
			ProtocolParser.writeBytes(stream, ProtoPlatform.stringToBytes(instance.name));
		}
		if (instance.mOTD != null) {
			stream.writeByte(ProtoPlatform.intToByte(18));
			ProtocolParser.writeBytes(stream, ProtoPlatform.stringToBytes(instance.mOTD));
		}
		stream.writeByte(ProtoPlatform.intToByte(24));
		ProtocolParser.writeUInt64(stream, instance.playerCount);
		stream.writeByte(ProtoPlatform.intToByte(32));
		ProtocolParser.writeUInt64(stream, instance.maxPlayers);
		if (instance.playerList != null) {
			stream.writeByte(ProtoPlatform.intToByte(42));
			ProtocolParser.writeBytes(stream, ProtoPlatform.stringToBytes(instance.playerList));
		}
		stream.writeByte(ProtoPlatform.intToByte(48));
		ProtocolParser.writeUInt64(stream, instance.port);
		if (instance.gameMode != null) {
			stream.writeByte(ProtoPlatform.intToByte(58));
			ProtocolParser.writeBytes(stream, ProtoPlatform.stringToBytes(instance.gameMode));
		}
		stream.writeByte(ProtoPlatform.intToByte(64));
		ProtocolParser.writeBool(stream, instance.password);
		if (instance.publicHash != null) {
			stream.writeByte(ProtoPlatform.intToByte(74));
			ProtocolParser.writeBytes(stream, ProtoPlatform.stringToBytes(instance.publicHash));
		}
		if (instance.serverVersion != null) {
			stream.writeByte(ProtoPlatform.intToByte(82));
			ProtocolParser.writeBytes(stream, ProtoPlatform.stringToBytes(instance.serverVersion));
		}
		stream.writeByte(ProtoPlatform.intToByte(88));
		ProtocolParser.writeUInt64(stream, instance.mapSizeX);
		stream.writeByte(ProtoPlatform.intToByte(96));
		ProtocolParser.writeUInt64(stream, instance.mapSizeY);
		stream.writeByte(ProtoPlatform.intToByte(104));
		ProtocolParser.writeUInt64(stream, instance.mapSizeZ);
		if (instance.serverThumbnail != null) {
			stream.writeByte(ProtoPlatform.intToByte(114));
			ProtocolParser.writeBytes(stream, instance.serverThumbnail);
		}
	}

	/**
	 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
	 */
	public static void serializeLengthDelimited(CitoStream stream, Packet_ServerQueryAnswer instance)
	{
		byte[] data = Packet_ServerQueryAnswerSerializer.serializeToBytes(instance);
		ProtocolParser.writeUInt32_(stream, ProtoPlatform.arrayLength(data));
		stream.write(data, 0, ProtoPlatform.arrayLength(data));
	}

	/**
	 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
	 */
	public static byte[] serializeToBytes(Packet_ServerQueryAnswer instance)
	{
		CitoMemoryStream ms = new CitoMemoryStream();
		Packet_ServerQueryAnswerSerializer.serialize(ms, instance);
		return ms.toArray();
	}
}
