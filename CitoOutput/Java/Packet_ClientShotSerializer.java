// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class Packet_ClientShotSerializer
{

	/**
	 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
	 */
	public static Packet_ClientShot deserialize(CitoStream stream, Packet_ClientShot instance)
	{
		while (true) {
			int keyByte = stream.readByte();
			if (keyByte == -1)
				break;
			switch (keyByte) {
			case 8:
				instance.fromX = ProtocolParser.readUInt64(stream);
				continue;
			case 16:
				instance.fromY = ProtocolParser.readUInt64(stream);
				continue;
			case 24:
				instance.fromZ = ProtocolParser.readUInt64(stream);
				continue;
			case 32:
				instance.toX = ProtocolParser.readUInt64(stream);
				continue;
			case 40:
				instance.toY = ProtocolParser.readUInt64(stream);
				continue;
			case 48:
				instance.toZ = ProtocolParser.readUInt64(stream);
				continue;
			case 56:
				instance.weaponBlock = ProtocolParser.readUInt64(stream);
				continue;
			case 64:
				instance.hitPlayer = ProtocolParser.readUInt64(stream);
				continue;
			case 72:
				instance.isHitHead = ProtocolParser.readUInt64(stream);
				continue;
			case 80:
				instance.explodesAfter = ProtocolParser.readUInt64(stream);
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
	public static Packet_ClientShot deserializeBuffer(byte[] buffer, int length, Packet_ClientShot instance)
	{
		CitoMemoryStream ms = CitoMemoryStream.create(buffer, length);
		Packet_ClientShotSerializer.deserialize(ms, instance);
		return instance;
	}

	/**
	 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
	 */
	public static Packet_ClientShot deserializeLength(CitoStream stream, int length, Packet_ClientShot instance)
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
				instance.fromX = ProtocolParser.readUInt64(stream);
				continue;
			case 16:
				instance.fromY = ProtocolParser.readUInt64(stream);
				continue;
			case 24:
				instance.fromZ = ProtocolParser.readUInt64(stream);
				continue;
			case 32:
				instance.toX = ProtocolParser.readUInt64(stream);
				continue;
			case 40:
				instance.toY = ProtocolParser.readUInt64(stream);
				continue;
			case 48:
				instance.toZ = ProtocolParser.readUInt64(stream);
				continue;
			case 56:
				instance.weaponBlock = ProtocolParser.readUInt64(stream);
				continue;
			case 64:
				instance.hitPlayer = ProtocolParser.readUInt64(stream);
				continue;
			case 72:
				instance.isHitHead = ProtocolParser.readUInt64(stream);
				continue;
			case 80:
				instance.explodesAfter = ProtocolParser.readUInt64(stream);
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
	public static Packet_ClientShot deserializeLengthDelimited(CitoStream stream, Packet_ClientShot instance)
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
				instance.fromX = ProtocolParser.readUInt64(stream);
				continue;
			case 16:
				instance.fromY = ProtocolParser.readUInt64(stream);
				continue;
			case 24:
				instance.fromZ = ProtocolParser.readUInt64(stream);
				continue;
			case 32:
				instance.toX = ProtocolParser.readUInt64(stream);
				continue;
			case 40:
				instance.toY = ProtocolParser.readUInt64(stream);
				continue;
			case 48:
				instance.toZ = ProtocolParser.readUInt64(stream);
				continue;
			case 56:
				instance.weaponBlock = ProtocolParser.readUInt64(stream);
				continue;
			case 64:
				instance.hitPlayer = ProtocolParser.readUInt64(stream);
				continue;
			case 72:
				instance.isHitHead = ProtocolParser.readUInt64(stream);
				continue;
			case 80:
				instance.explodesAfter = ProtocolParser.readUInt64(stream);
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
	public static Packet_ClientShot deserializeLengthDelimitedNew(CitoStream stream)
	{
		Packet_ClientShot instance = new Packet_ClientShot();
		Packet_ClientShotSerializer.deserializeLengthDelimited(stream, instance);
		return instance;
	}

	/**
	 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
	 */
	public static void serialize(CitoStream stream, Packet_ClientShot instance)
	{
		stream.writeByte(ProtoPlatform.intToByte(8));
		ProtocolParser.writeUInt64(stream, instance.fromX);
		stream.writeByte(ProtoPlatform.intToByte(16));
		ProtocolParser.writeUInt64(stream, instance.fromY);
		stream.writeByte(ProtoPlatform.intToByte(24));
		ProtocolParser.writeUInt64(stream, instance.fromZ);
		stream.writeByte(ProtoPlatform.intToByte(32));
		ProtocolParser.writeUInt64(stream, instance.toX);
		stream.writeByte(ProtoPlatform.intToByte(40));
		ProtocolParser.writeUInt64(stream, instance.toY);
		stream.writeByte(ProtoPlatform.intToByte(48));
		ProtocolParser.writeUInt64(stream, instance.toZ);
		stream.writeByte(ProtoPlatform.intToByte(56));
		ProtocolParser.writeUInt64(stream, instance.weaponBlock);
		stream.writeByte(ProtoPlatform.intToByte(64));
		ProtocolParser.writeUInt64(stream, instance.hitPlayer);
		stream.writeByte(ProtoPlatform.intToByte(72));
		ProtocolParser.writeUInt64(stream, instance.isHitHead);
		stream.writeByte(ProtoPlatform.intToByte(80));
		ProtocolParser.writeUInt64(stream, instance.explodesAfter);
	}

	/**
	 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
	 */
	public static void serializeLengthDelimited(CitoStream stream, Packet_ClientShot instance)
	{
		byte[] data = Packet_ClientShotSerializer.serializeToBytes(instance);
		ProtocolParser.writeUInt32_(stream, ProtoPlatform.arrayLength(data));
		stream.write(data, 0, ProtoPlatform.arrayLength(data));
	}

	/**
	 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
	 */
	public static byte[] serializeToBytes(Packet_ClientShot instance)
	{
		CitoMemoryStream ms = new CitoMemoryStream();
		Packet_ClientShotSerializer.serialize(ms, instance);
		return ms.toArray();
	}
}
