// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class Packet_ServerExplosionSerializer
{

	/**
	 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
	 */
	public static Packet_ServerExplosion deserialize(CitoStream stream, Packet_ServerExplosion instance)
	{
		while (true) {
			int keyByte = stream.readByte();
			if (keyByte == -1)
				break;
			switch (keyByte) {
			case 8:
				instance.xFloat = ProtocolParser.readUInt64(stream);
				continue;
			case 16:
				instance.yFloat = ProtocolParser.readUInt64(stream);
				continue;
			case 24:
				instance.zFloat = ProtocolParser.readUInt64(stream);
				continue;
			case 32:
				instance.isRelativeToPlayerPosition = ProtocolParser.readUInt64(stream);
				continue;
			case 40:
				instance.rangeFloat = ProtocolParser.readUInt64(stream);
				continue;
			case 48:
				instance.timeFloat = ProtocolParser.readUInt64(stream);
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
	public static Packet_ServerExplosion deserializeBuffer(byte[] buffer, int length, Packet_ServerExplosion instance)
	{
		CitoMemoryStream ms = CitoMemoryStream.create(buffer, length);
		Packet_ServerExplosionSerializer.deserialize(ms, instance);
		return instance;
	}

	/**
	 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
	 */
	public static Packet_ServerExplosion deserializeLength(CitoStream stream, int length, Packet_ServerExplosion instance)
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
				instance.xFloat = ProtocolParser.readUInt64(stream);
				continue;
			case 16:
				instance.yFloat = ProtocolParser.readUInt64(stream);
				continue;
			case 24:
				instance.zFloat = ProtocolParser.readUInt64(stream);
				continue;
			case 32:
				instance.isRelativeToPlayerPosition = ProtocolParser.readUInt64(stream);
				continue;
			case 40:
				instance.rangeFloat = ProtocolParser.readUInt64(stream);
				continue;
			case 48:
				instance.timeFloat = ProtocolParser.readUInt64(stream);
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
	public static Packet_ServerExplosion deserializeLengthDelimited(CitoStream stream, Packet_ServerExplosion instance)
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
				instance.xFloat = ProtocolParser.readUInt64(stream);
				continue;
			case 16:
				instance.yFloat = ProtocolParser.readUInt64(stream);
				continue;
			case 24:
				instance.zFloat = ProtocolParser.readUInt64(stream);
				continue;
			case 32:
				instance.isRelativeToPlayerPosition = ProtocolParser.readUInt64(stream);
				continue;
			case 40:
				instance.rangeFloat = ProtocolParser.readUInt64(stream);
				continue;
			case 48:
				instance.timeFloat = ProtocolParser.readUInt64(stream);
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
	public static Packet_ServerExplosion deserializeLengthDelimitedNew(CitoStream stream)
	{
		Packet_ServerExplosion instance = new Packet_ServerExplosion();
		Packet_ServerExplosionSerializer.deserializeLengthDelimited(stream, instance);
		return instance;
	}

	/**
	 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
	 */
	public static void serialize(CitoStream stream, Packet_ServerExplosion instance)
	{
		stream.writeByte(ProtoPlatform.intToByte(8));
		ProtocolParser.writeUInt64(stream, instance.xFloat);
		stream.writeByte(ProtoPlatform.intToByte(16));
		ProtocolParser.writeUInt64(stream, instance.yFloat);
		stream.writeByte(ProtoPlatform.intToByte(24));
		ProtocolParser.writeUInt64(stream, instance.zFloat);
		stream.writeByte(ProtoPlatform.intToByte(32));
		ProtocolParser.writeUInt64(stream, instance.isRelativeToPlayerPosition);
		stream.writeByte(ProtoPlatform.intToByte(40));
		ProtocolParser.writeUInt64(stream, instance.rangeFloat);
		stream.writeByte(ProtoPlatform.intToByte(48));
		ProtocolParser.writeUInt64(stream, instance.timeFloat);
	}

	/**
	 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
	 */
	public static void serializeLengthDelimited(CitoStream stream, Packet_ServerExplosion instance)
	{
		byte[] data = Packet_ServerExplosionSerializer.serializeToBytes(instance);
		ProtocolParser.writeUInt32_(stream, ProtoPlatform.arrayLength(data));
		stream.write(data, 0, ProtoPlatform.arrayLength(data));
	}

	/**
	 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
	 */
	public static byte[] serializeToBytes(Packet_ServerExplosion instance)
	{
		CitoMemoryStream ms = new CitoMemoryStream();
		Packet_ServerExplosionSerializer.serialize(ms, instance);
		return ms.toArray();
	}
}
