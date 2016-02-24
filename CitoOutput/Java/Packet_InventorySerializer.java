// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class Packet_InventorySerializer
{

	/**
	 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
	 */
	public static Packet_Inventory deserialize(CitoStream stream, Packet_Inventory instance)
	{
		if (instance.items == null) {
			instance.items = new Packet_PositionItem[1];
			instance.itemsCount = 0;
			instance.itemsLength = 1;
		}
		if (instance.rightHand == null) {
			instance.rightHand = new Packet_Item[1];
			instance.rightHandCount = 0;
			instance.rightHandLength = 1;
		}
		while (true) {
			int keyByte = stream.readByte();
			if (keyByte == -1)
				break;
			switch (keyByte) {
			case 26:
				if (instance.mainArmor == null)
					instance.mainArmor = Packet_ItemSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ItemSerializer.deserializeLengthDelimited(stream, instance.mainArmor);
				continue;
			case 34:
				if (instance.boots == null)
					instance.boots = Packet_ItemSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ItemSerializer.deserializeLengthDelimited(stream, instance.boots);
				continue;
			case 42:
				if (instance.helmet == null)
					instance.helmet = Packet_ItemSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ItemSerializer.deserializeLengthDelimited(stream, instance.helmet);
				continue;
			case 50:
				if (instance.gauntlet == null)
					instance.gauntlet = Packet_ItemSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ItemSerializer.deserializeLengthDelimited(stream, instance.gauntlet);
				continue;
			case 58:
				instance.itemsAdd(Packet_PositionItemSerializer.deserializeLengthDelimitedNew(stream));
				continue;
			case 66:
				if (instance.dragDropItem == null)
					instance.dragDropItem = Packet_ItemSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ItemSerializer.deserializeLengthDelimited(stream, instance.dragDropItem);
				continue;
			case 74:
				instance.rightHandAdd(Packet_ItemSerializer.deserializeLengthDelimitedNew(stream));
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
	public static Packet_Inventory deserializeBuffer(byte[] buffer, int length, Packet_Inventory instance)
	{
		CitoMemoryStream ms = CitoMemoryStream.create(buffer, length);
		Packet_InventorySerializer.deserialize(ms, instance);
		return instance;
	}

	/**
	 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
	 */
	public static Packet_Inventory deserializeLength(CitoStream stream, int length, Packet_Inventory instance)
	{
		if (instance.items == null) {
			instance.items = new Packet_PositionItem[1];
			instance.itemsCount = 0;
			instance.itemsLength = 1;
		}
		if (instance.rightHand == null) {
			instance.rightHand = new Packet_Item[1];
			instance.rightHandCount = 0;
			instance.rightHandLength = 1;
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
			case 26:
				if (instance.mainArmor == null)
					instance.mainArmor = Packet_ItemSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ItemSerializer.deserializeLengthDelimited(stream, instance.mainArmor);
				continue;
			case 34:
				if (instance.boots == null)
					instance.boots = Packet_ItemSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ItemSerializer.deserializeLengthDelimited(stream, instance.boots);
				continue;
			case 42:
				if (instance.helmet == null)
					instance.helmet = Packet_ItemSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ItemSerializer.deserializeLengthDelimited(stream, instance.helmet);
				continue;
			case 50:
				if (instance.gauntlet == null)
					instance.gauntlet = Packet_ItemSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ItemSerializer.deserializeLengthDelimited(stream, instance.gauntlet);
				continue;
			case 58:
				instance.itemsAdd(Packet_PositionItemSerializer.deserializeLengthDelimitedNew(stream));
				continue;
			case 66:
				if (instance.dragDropItem == null)
					instance.dragDropItem = Packet_ItemSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ItemSerializer.deserializeLengthDelimited(stream, instance.dragDropItem);
				continue;
			case 74:
				instance.rightHandAdd(Packet_ItemSerializer.deserializeLengthDelimitedNew(stream));
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
	public static Packet_Inventory deserializeLengthDelimited(CitoStream stream, Packet_Inventory instance)
	{
		if (instance.items == null) {
			instance.items = new Packet_PositionItem[1];
			instance.itemsCount = 0;
			instance.itemsLength = 1;
		}
		if (instance.rightHand == null) {
			instance.rightHand = new Packet_Item[1];
			instance.rightHandCount = 0;
			instance.rightHandLength = 1;
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
			case 26:
				if (instance.mainArmor == null)
					instance.mainArmor = Packet_ItemSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ItemSerializer.deserializeLengthDelimited(stream, instance.mainArmor);
				continue;
			case 34:
				if (instance.boots == null)
					instance.boots = Packet_ItemSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ItemSerializer.deserializeLengthDelimited(stream, instance.boots);
				continue;
			case 42:
				if (instance.helmet == null)
					instance.helmet = Packet_ItemSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ItemSerializer.deserializeLengthDelimited(stream, instance.helmet);
				continue;
			case 50:
				if (instance.gauntlet == null)
					instance.gauntlet = Packet_ItemSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ItemSerializer.deserializeLengthDelimited(stream, instance.gauntlet);
				continue;
			case 58:
				instance.itemsAdd(Packet_PositionItemSerializer.deserializeLengthDelimitedNew(stream));
				continue;
			case 66:
				if (instance.dragDropItem == null)
					instance.dragDropItem = Packet_ItemSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ItemSerializer.deserializeLengthDelimited(stream, instance.dragDropItem);
				continue;
			case 74:
				instance.rightHandAdd(Packet_ItemSerializer.deserializeLengthDelimitedNew(stream));
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
	public static Packet_Inventory deserializeLengthDelimitedNew(CitoStream stream)
	{
		Packet_Inventory instance = new Packet_Inventory();
		Packet_InventorySerializer.deserializeLengthDelimited(stream, instance);
		return instance;
	}

	/**
	 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
	 */
	public static void serialize(CitoStream stream, Packet_Inventory instance)
	{
		if (instance.mainArmor != null) {
			stream.writeByte(ProtoPlatform.intToByte(26));
			CitoMemoryStream ms3 = new CitoMemoryStream();
			Packet_ItemSerializer.serialize(ms3, instance.mainArmor);
			int ms3Length = ms3.length();
			ProtocolParser.writeUInt32_(stream, ms3Length);
			stream.write(ms3.getBuffer(), 0, ms3Length);
		}
		if (instance.boots != null) {
			stream.writeByte(ProtoPlatform.intToByte(34));
			CitoMemoryStream ms4 = new CitoMemoryStream();
			Packet_ItemSerializer.serialize(ms4, instance.boots);
			int ms4Length = ms4.length();
			ProtocolParser.writeUInt32_(stream, ms4Length);
			stream.write(ms4.getBuffer(), 0, ms4Length);
		}
		if (instance.helmet != null) {
			stream.writeByte(ProtoPlatform.intToByte(42));
			CitoMemoryStream ms5 = new CitoMemoryStream();
			Packet_ItemSerializer.serialize(ms5, instance.helmet);
			int ms5Length = ms5.length();
			ProtocolParser.writeUInt32_(stream, ms5Length);
			stream.write(ms5.getBuffer(), 0, ms5Length);
		}
		if (instance.gauntlet != null) {
			stream.writeByte(ProtoPlatform.intToByte(50));
			CitoMemoryStream ms6 = new CitoMemoryStream();
			Packet_ItemSerializer.serialize(ms6, instance.gauntlet);
			int ms6Length = ms6.length();
			ProtocolParser.writeUInt32_(stream, ms6Length);
			stream.write(ms6.getBuffer(), 0, ms6Length);
		}
		if (instance.items != null) {
			for (int k = 0; k < instance.itemsCount; k++) {
				Packet_PositionItem i7 = instance.items[k];
				stream.writeByte(ProtoPlatform.intToByte(58));
				CitoMemoryStream ms7 = new CitoMemoryStream();
				Packet_PositionItemSerializer.serialize(ms7, i7);
				int ms7Length = ms7.length();
				ProtocolParser.writeUInt32_(stream, ms7Length);
				stream.write(ms7.getBuffer(), 0, ms7Length);
			}
		}
		if (instance.dragDropItem != null) {
			stream.writeByte(ProtoPlatform.intToByte(66));
			CitoMemoryStream ms8 = new CitoMemoryStream();
			Packet_ItemSerializer.serialize(ms8, instance.dragDropItem);
			int ms8Length = ms8.length();
			ProtocolParser.writeUInt32_(stream, ms8Length);
			stream.write(ms8.getBuffer(), 0, ms8Length);
		}
		if (instance.rightHand != null) {
			for (int k = 0; k < instance.rightHandCount; k++) {
				Packet_Item i9 = instance.rightHand[k];
				stream.writeByte(ProtoPlatform.intToByte(74));
				CitoMemoryStream ms9 = new CitoMemoryStream();
				Packet_ItemSerializer.serialize(ms9, i9);
				int ms9Length = ms9.length();
				ProtocolParser.writeUInt32_(stream, ms9Length);
				stream.write(ms9.getBuffer(), 0, ms9Length);
			}
		}
	}

	/**
	 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
	 */
	public static void serializeLengthDelimited(CitoStream stream, Packet_Inventory instance)
	{
		byte[] data = Packet_InventorySerializer.serializeToBytes(instance);
		ProtocolParser.writeUInt32_(stream, ProtoPlatform.arrayLength(data));
		stream.write(data, 0, ProtoPlatform.arrayLength(data));
	}

	/**
	 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
	 */
	public static byte[] serializeToBytes(Packet_Inventory instance)
	{
		CitoMemoryStream ms = new CitoMemoryStream();
		Packet_InventorySerializer.serialize(ms, instance);
		return ms.toArray();
	}
}
