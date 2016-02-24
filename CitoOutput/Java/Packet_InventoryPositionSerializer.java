// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class Packet_InventoryPositionSerializer
{

	/**
	 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
	 */
	public static Packet_InventoryPosition deserialize(CitoStream stream, Packet_InventoryPosition instance)
	{
		instance.type = 0;
		while (true) {
			int keyByte = stream.readByte();
			if (keyByte == -1)
				break;
			switch (keyByte) {
			case 8:
				instance.type = ProtocolParser.readUInt64(stream);
				continue;
			case 16:
				instance.areaX = ProtocolParser.readUInt64(stream);
				continue;
			case 24:
				instance.areaY = ProtocolParser.readUInt64(stream);
				continue;
			case 32:
				instance.materialId = ProtocolParser.readUInt64(stream);
				continue;
			case 40:
				instance.wearPlace = ProtocolParser.readUInt64(stream);
				continue;
			case 48:
				instance.activeMaterial = ProtocolParser.readUInt64(stream);
				continue;
			case 56:
				instance.groundPositionX = ProtocolParser.readUInt64(stream);
				continue;
			case 64:
				instance.groundPositionY = ProtocolParser.readUInt64(stream);
				continue;
			case 72:
				instance.groundPositionZ = ProtocolParser.readUInt64(stream);
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
	public static Packet_InventoryPosition deserializeBuffer(byte[] buffer, int length, Packet_InventoryPosition instance)
	{
		CitoMemoryStream ms = CitoMemoryStream.create(buffer, length);
		Packet_InventoryPositionSerializer.deserialize(ms, instance);
		return instance;
	}

	/**
	 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
	 */
	public static Packet_InventoryPosition deserializeLength(CitoStream stream, int length, Packet_InventoryPosition instance)
	{
		instance.type = 0;
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
				instance.type = ProtocolParser.readUInt64(stream);
				continue;
			case 16:
				instance.areaX = ProtocolParser.readUInt64(stream);
				continue;
			case 24:
				instance.areaY = ProtocolParser.readUInt64(stream);
				continue;
			case 32:
				instance.materialId = ProtocolParser.readUInt64(stream);
				continue;
			case 40:
				instance.wearPlace = ProtocolParser.readUInt64(stream);
				continue;
			case 48:
				instance.activeMaterial = ProtocolParser.readUInt64(stream);
				continue;
			case 56:
				instance.groundPositionX = ProtocolParser.readUInt64(stream);
				continue;
			case 64:
				instance.groundPositionY = ProtocolParser.readUInt64(stream);
				continue;
			case 72:
				instance.groundPositionZ = ProtocolParser.readUInt64(stream);
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
	public static Packet_InventoryPosition deserializeLengthDelimited(CitoStream stream, Packet_InventoryPosition instance)
	{
		instance.type = 0;
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
				instance.type = ProtocolParser.readUInt64(stream);
				continue;
			case 16:
				instance.areaX = ProtocolParser.readUInt64(stream);
				continue;
			case 24:
				instance.areaY = ProtocolParser.readUInt64(stream);
				continue;
			case 32:
				instance.materialId = ProtocolParser.readUInt64(stream);
				continue;
			case 40:
				instance.wearPlace = ProtocolParser.readUInt64(stream);
				continue;
			case 48:
				instance.activeMaterial = ProtocolParser.readUInt64(stream);
				continue;
			case 56:
				instance.groundPositionX = ProtocolParser.readUInt64(stream);
				continue;
			case 64:
				instance.groundPositionY = ProtocolParser.readUInt64(stream);
				continue;
			case 72:
				instance.groundPositionZ = ProtocolParser.readUInt64(stream);
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
	public static Packet_InventoryPosition deserializeLengthDelimitedNew(CitoStream stream)
	{
		Packet_InventoryPosition instance = new Packet_InventoryPosition();
		Packet_InventoryPositionSerializer.deserializeLengthDelimited(stream, instance);
		return instance;
	}

	/**
	 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
	 */
	public static void serialize(CitoStream stream, Packet_InventoryPosition instance)
	{
		if (instance.type != 0) {
			stream.writeByte(ProtoPlatform.intToByte(8));
			ProtocolParser.writeUInt64(stream, instance.type);
		}
		stream.writeByte(ProtoPlatform.intToByte(16));
		ProtocolParser.writeUInt64(stream, instance.areaX);
		stream.writeByte(ProtoPlatform.intToByte(24));
		ProtocolParser.writeUInt64(stream, instance.areaY);
		stream.writeByte(ProtoPlatform.intToByte(32));
		ProtocolParser.writeUInt64(stream, instance.materialId);
		stream.writeByte(ProtoPlatform.intToByte(40));
		ProtocolParser.writeUInt64(stream, instance.wearPlace);
		stream.writeByte(ProtoPlatform.intToByte(48));
		ProtocolParser.writeUInt64(stream, instance.activeMaterial);
		stream.writeByte(ProtoPlatform.intToByte(56));
		ProtocolParser.writeUInt64(stream, instance.groundPositionX);
		stream.writeByte(ProtoPlatform.intToByte(64));
		ProtocolParser.writeUInt64(stream, instance.groundPositionY);
		stream.writeByte(ProtoPlatform.intToByte(72));
		ProtocolParser.writeUInt64(stream, instance.groundPositionZ);
	}

	/**
	 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
	 */
	public static void serializeLengthDelimited(CitoStream stream, Packet_InventoryPosition instance)
	{
		byte[] data = Packet_InventoryPositionSerializer.serializeToBytes(instance);
		ProtocolParser.writeUInt32_(stream, ProtoPlatform.arrayLength(data));
		stream.write(data, 0, ProtoPlatform.arrayLength(data));
	}

	/**
	 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
	 */
	public static byte[] serializeToBytes(Packet_InventoryPosition instance)
	{
		CitoMemoryStream ms = new CitoMemoryStream();
		Packet_InventoryPositionSerializer.serialize(ms, instance);
		return ms.toArray();
	}
}
