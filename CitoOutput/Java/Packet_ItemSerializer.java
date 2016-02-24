// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class Packet_ItemSerializer
{

	/**
	 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
	 */
	public static Packet_Item deserialize(CitoStream stream, Packet_Item instance)
	{
		instance.itemClass = 0;
		while (true) {
			int keyByte = stream.readByte();
			if (keyByte == -1)
				break;
			switch (keyByte) {
			case 8:
				instance.itemClass = ProtocolParser.readUInt64(stream);
				continue;
			case 18:
				instance.itemId = ProtocolParser.readString(stream);
				continue;
			case 24:
				instance.blockId = ProtocolParser.readUInt64(stream);
				continue;
			case 32:
				instance.blockCount = ProtocolParser.readUInt64(stream);
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
	public static Packet_Item deserializeBuffer(byte[] buffer, int length, Packet_Item instance)
	{
		CitoMemoryStream ms = CitoMemoryStream.create(buffer, length);
		Packet_ItemSerializer.deserialize(ms, instance);
		return instance;
	}

	/**
	 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
	 */
	public static Packet_Item deserializeLength(CitoStream stream, int length, Packet_Item instance)
	{
		instance.itemClass = 0;
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
				instance.itemClass = ProtocolParser.readUInt64(stream);
				continue;
			case 18:
				instance.itemId = ProtocolParser.readString(stream);
				continue;
			case 24:
				instance.blockId = ProtocolParser.readUInt64(stream);
				continue;
			case 32:
				instance.blockCount = ProtocolParser.readUInt64(stream);
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
	public static Packet_Item deserializeLengthDelimited(CitoStream stream, Packet_Item instance)
	{
		instance.itemClass = 0;
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
				instance.itemClass = ProtocolParser.readUInt64(stream);
				continue;
			case 18:
				instance.itemId = ProtocolParser.readString(stream);
				continue;
			case 24:
				instance.blockId = ProtocolParser.readUInt64(stream);
				continue;
			case 32:
				instance.blockCount = ProtocolParser.readUInt64(stream);
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
	public static Packet_Item deserializeLengthDelimitedNew(CitoStream stream)
	{
		Packet_Item instance = new Packet_Item();
		Packet_ItemSerializer.deserializeLengthDelimited(stream, instance);
		return instance;
	}

	/**
	 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
	 */
	public static void serialize(CitoStream stream, Packet_Item instance)
	{
		if (instance.itemClass != 0) {
			stream.writeByte(ProtoPlatform.intToByte(8));
			ProtocolParser.writeUInt64(stream, instance.itemClass);
		}
		if (instance.itemId != null) {
			stream.writeByte(ProtoPlatform.intToByte(18));
			ProtocolParser.writeBytes(stream, ProtoPlatform.stringToBytes(instance.itemId));
		}
		stream.writeByte(ProtoPlatform.intToByte(24));
		ProtocolParser.writeUInt64(stream, instance.blockId);
		stream.writeByte(ProtoPlatform.intToByte(32));
		ProtocolParser.writeUInt64(stream, instance.blockCount);
	}

	/**
	 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
	 */
	public static void serializeLengthDelimited(CitoStream stream, Packet_Item instance)
	{
		byte[] data = Packet_ItemSerializer.serializeToBytes(instance);
		ProtocolParser.writeUInt32_(stream, ProtoPlatform.arrayLength(data));
		stream.write(data, 0, ProtoPlatform.arrayLength(data));
	}

	/**
	 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
	 */
	public static byte[] serializeToBytes(Packet_Item instance)
	{
		CitoMemoryStream ms = new CitoMemoryStream();
		Packet_ItemSerializer.serialize(ms, instance);
		return ms.toArray();
	}
}
