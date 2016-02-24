// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class Packet_ServerBulletSerializer
{

	/**
	 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
	 */
	public static Packet_ServerBullet deserialize(CitoStream stream, Packet_ServerBullet instance)
	{
		while (true) {
			int keyByte = stream.readByte();
			if (keyByte == -1)
				break;
			switch (keyByte) {
			case 8:
				instance.fromXFloat = ProtocolParser.readUInt64(stream);
				continue;
			case 16:
				instance.fromYFloat = ProtocolParser.readUInt64(stream);
				continue;
			case 24:
				instance.fromZFloat = ProtocolParser.readUInt64(stream);
				continue;
			case 32:
				instance.toXFloat = ProtocolParser.readUInt64(stream);
				continue;
			case 40:
				instance.toYFloat = ProtocolParser.readUInt64(stream);
				continue;
			case 48:
				instance.toZFloat = ProtocolParser.readUInt64(stream);
				continue;
			case 56:
				instance.speedFloat = ProtocolParser.readUInt64(stream);
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
	public static Packet_ServerBullet deserializeBuffer(byte[] buffer, int length, Packet_ServerBullet instance)
	{
		CitoMemoryStream ms = CitoMemoryStream.create(buffer, length);
		Packet_ServerBulletSerializer.deserialize(ms, instance);
		return instance;
	}

	/**
	 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
	 */
	public static Packet_ServerBullet deserializeLength(CitoStream stream, int length, Packet_ServerBullet instance)
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
				instance.fromXFloat = ProtocolParser.readUInt64(stream);
				continue;
			case 16:
				instance.fromYFloat = ProtocolParser.readUInt64(stream);
				continue;
			case 24:
				instance.fromZFloat = ProtocolParser.readUInt64(stream);
				continue;
			case 32:
				instance.toXFloat = ProtocolParser.readUInt64(stream);
				continue;
			case 40:
				instance.toYFloat = ProtocolParser.readUInt64(stream);
				continue;
			case 48:
				instance.toZFloat = ProtocolParser.readUInt64(stream);
				continue;
			case 56:
				instance.speedFloat = ProtocolParser.readUInt64(stream);
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
	public static Packet_ServerBullet deserializeLengthDelimited(CitoStream stream, Packet_ServerBullet instance)
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
				instance.fromXFloat = ProtocolParser.readUInt64(stream);
				continue;
			case 16:
				instance.fromYFloat = ProtocolParser.readUInt64(stream);
				continue;
			case 24:
				instance.fromZFloat = ProtocolParser.readUInt64(stream);
				continue;
			case 32:
				instance.toXFloat = ProtocolParser.readUInt64(stream);
				continue;
			case 40:
				instance.toYFloat = ProtocolParser.readUInt64(stream);
				continue;
			case 48:
				instance.toZFloat = ProtocolParser.readUInt64(stream);
				continue;
			case 56:
				instance.speedFloat = ProtocolParser.readUInt64(stream);
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
	public static Packet_ServerBullet deserializeLengthDelimitedNew(CitoStream stream)
	{
		Packet_ServerBullet instance = new Packet_ServerBullet();
		Packet_ServerBulletSerializer.deserializeLengthDelimited(stream, instance);
		return instance;
	}

	/**
	 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
	 */
	public static void serialize(CitoStream stream, Packet_ServerBullet instance)
	{
		stream.writeByte(ProtoPlatform.intToByte(8));
		ProtocolParser.writeUInt64(stream, instance.fromXFloat);
		stream.writeByte(ProtoPlatform.intToByte(16));
		ProtocolParser.writeUInt64(stream, instance.fromYFloat);
		stream.writeByte(ProtoPlatform.intToByte(24));
		ProtocolParser.writeUInt64(stream, instance.fromZFloat);
		stream.writeByte(ProtoPlatform.intToByte(32));
		ProtocolParser.writeUInt64(stream, instance.toXFloat);
		stream.writeByte(ProtoPlatform.intToByte(40));
		ProtocolParser.writeUInt64(stream, instance.toYFloat);
		stream.writeByte(ProtoPlatform.intToByte(48));
		ProtocolParser.writeUInt64(stream, instance.toZFloat);
		stream.writeByte(ProtoPlatform.intToByte(56));
		ProtocolParser.writeUInt64(stream, instance.speedFloat);
	}

	/**
	 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
	 */
	public static void serializeLengthDelimited(CitoStream stream, Packet_ServerBullet instance)
	{
		byte[] data = Packet_ServerBulletSerializer.serializeToBytes(instance);
		ProtocolParser.writeUInt32_(stream, ProtoPlatform.arrayLength(data));
		stream.write(data, 0, ProtoPlatform.arrayLength(data));
	}

	/**
	 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
	 */
	public static byte[] serializeToBytes(Packet_ServerBullet instance)
	{
		CitoMemoryStream ms = new CitoMemoryStream();
		Packet_ServerBulletSerializer.serialize(ms, instance);
		return ms.toArray();
	}
}
