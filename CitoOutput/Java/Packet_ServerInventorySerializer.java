// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class Packet_ServerInventorySerializer
{

	/**
	 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
	 */
	public static Packet_ServerInventory deserialize(CitoStream stream, Packet_ServerInventory instance)
	{
		while (true) {
			int keyByte = stream.readByte();
			if (keyByte == -1)
				break;
			switch (keyByte) {
			case 34:
				if (instance.inventory == null)
					instance.inventory = Packet_InventorySerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_InventorySerializer.deserializeLengthDelimited(stream, instance.inventory);
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
	public static Packet_ServerInventory deserializeBuffer(byte[] buffer, int length, Packet_ServerInventory instance)
	{
		CitoMemoryStream ms = CitoMemoryStream.create(buffer, length);
		Packet_ServerInventorySerializer.deserialize(ms, instance);
		return instance;
	}

	/**
	 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
	 */
	public static Packet_ServerInventory deserializeLength(CitoStream stream, int length, Packet_ServerInventory instance)
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
			case 34:
				if (instance.inventory == null)
					instance.inventory = Packet_InventorySerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_InventorySerializer.deserializeLengthDelimited(stream, instance.inventory);
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
	public static Packet_ServerInventory deserializeLengthDelimited(CitoStream stream, Packet_ServerInventory instance)
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
			case 34:
				if (instance.inventory == null)
					instance.inventory = Packet_InventorySerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_InventorySerializer.deserializeLengthDelimited(stream, instance.inventory);
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
	public static Packet_ServerInventory deserializeLengthDelimitedNew(CitoStream stream)
	{
		Packet_ServerInventory instance = new Packet_ServerInventory();
		Packet_ServerInventorySerializer.deserializeLengthDelimited(stream, instance);
		return instance;
	}

	/**
	 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
	 */
	public static void serialize(CitoStream stream, Packet_ServerInventory instance)
	{
		if (instance.inventory != null) {
			stream.writeByte(ProtoPlatform.intToByte(34));
			CitoMemoryStream ms4 = new CitoMemoryStream();
			Packet_InventorySerializer.serialize(ms4, instance.inventory);
			int ms4Length = ms4.length();
			ProtocolParser.writeUInt32_(stream, ms4Length);
			stream.write(ms4.getBuffer(), 0, ms4Length);
		}
	}

	/**
	 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
	 */
	public static void serializeLengthDelimited(CitoStream stream, Packet_ServerInventory instance)
	{
		byte[] data = Packet_ServerInventorySerializer.serializeToBytes(instance);
		ProtocolParser.writeUInt32_(stream, ProtoPlatform.arrayLength(data));
		stream.write(data, 0, ProtoPlatform.arrayLength(data));
	}

	/**
	 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
	 */
	public static byte[] serializeToBytes(Packet_ServerInventory instance)
	{
		CitoMemoryStream ms = new CitoMemoryStream();
		Packet_ServerInventorySerializer.serialize(ms, instance);
		return ms.toArray();
	}
}
