// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class Packet_ClientSerializer
{

	/**
	 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
	 */
	public static Packet_Client deserialize(CitoStream stream, Packet_Client instance)
	{
		instance.id = 0;
		while (true) {
			int keyByte = stream.readByte();
			if (keyByte == -1)
				break;
			switch (keyByte) {
			case 8:
				instance.id = ProtocolParser.readUInt64(stream);
				continue;
			case 18:
				if (instance.identification == null)
					instance.identification = Packet_ClientIdentificationSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ClientIdentificationSerializer.deserializeLengthDelimited(stream, instance.identification);
				continue;
			case 26:
				if (instance.setBlock == null)
					instance.setBlock = Packet_ClientSetBlockSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ClientSetBlockSerializer.deserializeLengthDelimited(stream, instance.setBlock);
				continue;
			case 34:
				if (instance.positionAndOrientation == null)
					instance.positionAndOrientation = Packet_ClientPositionAndOrientationSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ClientPositionAndOrientationSerializer.deserializeLengthDelimited(stream, instance.positionAndOrientation);
				continue;
			case 42:
				if (instance.message == null)
					instance.message = Packet_ClientMessageSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ClientMessageSerializer.deserializeLengthDelimited(stream, instance.message);
				continue;
			case 50:
				if (instance.craft == null)
					instance.craft = Packet_ClientCraftSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ClientCraftSerializer.deserializeLengthDelimited(stream, instance.craft);
				continue;
			case 58:
				if (instance.requestBlob == null)
					instance.requestBlob = Packet_ClientRequestBlobSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ClientRequestBlobSerializer.deserializeLengthDelimited(stream, instance.requestBlob);
				continue;
			case 66:
				if (instance.inventoryAction == null)
					instance.inventoryAction = Packet_ClientInventoryActionSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ClientInventoryActionSerializer.deserializeLengthDelimited(stream, instance.inventoryAction);
				continue;
			case 74:
				if (instance.health == null)
					instance.health = Packet_ClientHealthSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ClientHealthSerializer.deserializeLengthDelimited(stream, instance.health);
				continue;
			case 82:
				if (instance.pingReply == null)
					instance.pingReply = Packet_ClientPingReplySerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ClientPingReplySerializer.deserializeLengthDelimited(stream, instance.pingReply);
				continue;
			case 90:
				if (instance.dialogClick_ == null)
					instance.dialogClick_ = Packet_ClientDialogClickSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ClientDialogClickSerializer.deserializeLengthDelimited(stream, instance.dialogClick_);
				continue;
			case 98:
				if (instance.shot == null)
					instance.shot = Packet_ClientShotSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ClientShotSerializer.deserializeLengthDelimited(stream, instance.shot);
				continue;
			case 106:
				if (instance.specialKey_ == null)
					instance.specialKey_ = Packet_ClientSpecialKeySerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ClientSpecialKeySerializer.deserializeLengthDelimited(stream, instance.specialKey_);
				continue;
			case 114:
				if (instance.activeMaterialSlot == null)
					instance.activeMaterialSlot = Packet_ClientActiveMaterialSlotSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ClientActiveMaterialSlotSerializer.deserializeLengthDelimited(stream, instance.activeMaterialSlot);
				continue;
			case 122:
				if (instance.leave == null)
					instance.leave = Packet_ClientLeaveSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ClientLeaveSerializer.deserializeLengthDelimited(stream, instance.leave);
				continue;
			default:
				break;
			}
			Key key = ProtocolParser.readKey_((byte) keyByte, stream);
			switch (key.getField()) {
			case 0:
				return null;
			case 31:
				if (key.getWireType() != 2)
					break;
				if (instance.fillArea == null)
					instance.fillArea = Packet_ClientFillAreaSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ClientFillAreaSerializer.deserializeLengthDelimited(stream, instance.fillArea);
				continue;
			case 16:
				if (key.getWireType() != 2)
					break;
				if (instance.reload == null)
					instance.reload = Packet_ClientReloadSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ClientReloadSerializer.deserializeLengthDelimited(stream, instance.reload);
				continue;
			case 17:
				if (key.getWireType() != 2)
					break;
				if (instance.oxygen == null)
					instance.oxygen = Packet_ClientOxygenSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ClientOxygenSerializer.deserializeLengthDelimited(stream, instance.oxygen);
				continue;
			case 18:
				if (key.getWireType() != 2)
					break;
				if (instance.death == null)
					instance.death = Packet_ClientDeathSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ClientDeathSerializer.deserializeLengthDelimited(stream, instance.death);
				continue;
			case 19:
				if (key.getWireType() != 2)
					break;
				if (instance.query == null)
					instance.query = Packet_ClientServerQuerySerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ClientServerQuerySerializer.deserializeLengthDelimited(stream, instance.query);
				continue;
			case 20:
				if (key.getWireType() != 2)
					break;
				if (instance.gameResolution == null)
					instance.gameResolution = Packet_ClientGameResolutionSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ClientGameResolutionSerializer.deserializeLengthDelimited(stream, instance.gameResolution);
				continue;
			case 21:
				if (key.getWireType() != 2)
					break;
				if (instance.entityInteraction == null)
					instance.entityInteraction = Packet_ClientEntityInteractionSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ClientEntityInteractionSerializer.deserializeLengthDelimited(stream, instance.entityInteraction);
				continue;
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
	public static Packet_Client deserializeBuffer(byte[] buffer, int length, Packet_Client instance)
	{
		CitoMemoryStream ms = CitoMemoryStream.create(buffer, length);
		Packet_ClientSerializer.deserialize(ms, instance);
		return instance;
	}

	/**
	 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
	 */
	public static Packet_Client deserializeLength(CitoStream stream, int length, Packet_Client instance)
	{
		instance.id = 0;
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
			case 18:
				if (instance.identification == null)
					instance.identification = Packet_ClientIdentificationSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ClientIdentificationSerializer.deserializeLengthDelimited(stream, instance.identification);
				continue;
			case 26:
				if (instance.setBlock == null)
					instance.setBlock = Packet_ClientSetBlockSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ClientSetBlockSerializer.deserializeLengthDelimited(stream, instance.setBlock);
				continue;
			case 34:
				if (instance.positionAndOrientation == null)
					instance.positionAndOrientation = Packet_ClientPositionAndOrientationSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ClientPositionAndOrientationSerializer.deserializeLengthDelimited(stream, instance.positionAndOrientation);
				continue;
			case 42:
				if (instance.message == null)
					instance.message = Packet_ClientMessageSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ClientMessageSerializer.deserializeLengthDelimited(stream, instance.message);
				continue;
			case 50:
				if (instance.craft == null)
					instance.craft = Packet_ClientCraftSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ClientCraftSerializer.deserializeLengthDelimited(stream, instance.craft);
				continue;
			case 58:
				if (instance.requestBlob == null)
					instance.requestBlob = Packet_ClientRequestBlobSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ClientRequestBlobSerializer.deserializeLengthDelimited(stream, instance.requestBlob);
				continue;
			case 66:
				if (instance.inventoryAction == null)
					instance.inventoryAction = Packet_ClientInventoryActionSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ClientInventoryActionSerializer.deserializeLengthDelimited(stream, instance.inventoryAction);
				continue;
			case 74:
				if (instance.health == null)
					instance.health = Packet_ClientHealthSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ClientHealthSerializer.deserializeLengthDelimited(stream, instance.health);
				continue;
			case 82:
				if (instance.pingReply == null)
					instance.pingReply = Packet_ClientPingReplySerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ClientPingReplySerializer.deserializeLengthDelimited(stream, instance.pingReply);
				continue;
			case 90:
				if (instance.dialogClick_ == null)
					instance.dialogClick_ = Packet_ClientDialogClickSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ClientDialogClickSerializer.deserializeLengthDelimited(stream, instance.dialogClick_);
				continue;
			case 98:
				if (instance.shot == null)
					instance.shot = Packet_ClientShotSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ClientShotSerializer.deserializeLengthDelimited(stream, instance.shot);
				continue;
			case 106:
				if (instance.specialKey_ == null)
					instance.specialKey_ = Packet_ClientSpecialKeySerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ClientSpecialKeySerializer.deserializeLengthDelimited(stream, instance.specialKey_);
				continue;
			case 114:
				if (instance.activeMaterialSlot == null)
					instance.activeMaterialSlot = Packet_ClientActiveMaterialSlotSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ClientActiveMaterialSlotSerializer.deserializeLengthDelimited(stream, instance.activeMaterialSlot);
				continue;
			case 122:
				if (instance.leave == null)
					instance.leave = Packet_ClientLeaveSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ClientLeaveSerializer.deserializeLengthDelimited(stream, instance.leave);
				continue;
			default:
				break;
			}
			Key key = ProtocolParser.readKey_((byte) keyByte, stream);
			switch (key.getField()) {
			case 0:
				return null;
			case 31:
				if (key.getWireType() != 2)
					break;
				if (instance.fillArea == null)
					instance.fillArea = Packet_ClientFillAreaSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ClientFillAreaSerializer.deserializeLengthDelimited(stream, instance.fillArea);
				continue;
			case 16:
				if (key.getWireType() != 2)
					break;
				if (instance.reload == null)
					instance.reload = Packet_ClientReloadSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ClientReloadSerializer.deserializeLengthDelimited(stream, instance.reload);
				continue;
			case 17:
				if (key.getWireType() != 2)
					break;
				if (instance.oxygen == null)
					instance.oxygen = Packet_ClientOxygenSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ClientOxygenSerializer.deserializeLengthDelimited(stream, instance.oxygen);
				continue;
			case 18:
				if (key.getWireType() != 2)
					break;
				if (instance.death == null)
					instance.death = Packet_ClientDeathSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ClientDeathSerializer.deserializeLengthDelimited(stream, instance.death);
				continue;
			case 19:
				if (key.getWireType() != 2)
					break;
				if (instance.query == null)
					instance.query = Packet_ClientServerQuerySerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ClientServerQuerySerializer.deserializeLengthDelimited(stream, instance.query);
				continue;
			case 20:
				if (key.getWireType() != 2)
					break;
				if (instance.gameResolution == null)
					instance.gameResolution = Packet_ClientGameResolutionSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ClientGameResolutionSerializer.deserializeLengthDelimited(stream, instance.gameResolution);
				continue;
			case 21:
				if (key.getWireType() != 2)
					break;
				if (instance.entityInteraction == null)
					instance.entityInteraction = Packet_ClientEntityInteractionSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ClientEntityInteractionSerializer.deserializeLengthDelimited(stream, instance.entityInteraction);
				continue;
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
	public static Packet_Client deserializeLengthDelimited(CitoStream stream, Packet_Client instance)
	{
		instance.id = 0;
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
			case 18:
				if (instance.identification == null)
					instance.identification = Packet_ClientIdentificationSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ClientIdentificationSerializer.deserializeLengthDelimited(stream, instance.identification);
				continue;
			case 26:
				if (instance.setBlock == null)
					instance.setBlock = Packet_ClientSetBlockSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ClientSetBlockSerializer.deserializeLengthDelimited(stream, instance.setBlock);
				continue;
			case 34:
				if (instance.positionAndOrientation == null)
					instance.positionAndOrientation = Packet_ClientPositionAndOrientationSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ClientPositionAndOrientationSerializer.deserializeLengthDelimited(stream, instance.positionAndOrientation);
				continue;
			case 42:
				if (instance.message == null)
					instance.message = Packet_ClientMessageSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ClientMessageSerializer.deserializeLengthDelimited(stream, instance.message);
				continue;
			case 50:
				if (instance.craft == null)
					instance.craft = Packet_ClientCraftSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ClientCraftSerializer.deserializeLengthDelimited(stream, instance.craft);
				continue;
			case 58:
				if (instance.requestBlob == null)
					instance.requestBlob = Packet_ClientRequestBlobSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ClientRequestBlobSerializer.deserializeLengthDelimited(stream, instance.requestBlob);
				continue;
			case 66:
				if (instance.inventoryAction == null)
					instance.inventoryAction = Packet_ClientInventoryActionSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ClientInventoryActionSerializer.deserializeLengthDelimited(stream, instance.inventoryAction);
				continue;
			case 74:
				if (instance.health == null)
					instance.health = Packet_ClientHealthSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ClientHealthSerializer.deserializeLengthDelimited(stream, instance.health);
				continue;
			case 82:
				if (instance.pingReply == null)
					instance.pingReply = Packet_ClientPingReplySerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ClientPingReplySerializer.deserializeLengthDelimited(stream, instance.pingReply);
				continue;
			case 90:
				if (instance.dialogClick_ == null)
					instance.dialogClick_ = Packet_ClientDialogClickSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ClientDialogClickSerializer.deserializeLengthDelimited(stream, instance.dialogClick_);
				continue;
			case 98:
				if (instance.shot == null)
					instance.shot = Packet_ClientShotSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ClientShotSerializer.deserializeLengthDelimited(stream, instance.shot);
				continue;
			case 106:
				if (instance.specialKey_ == null)
					instance.specialKey_ = Packet_ClientSpecialKeySerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ClientSpecialKeySerializer.deserializeLengthDelimited(stream, instance.specialKey_);
				continue;
			case 114:
				if (instance.activeMaterialSlot == null)
					instance.activeMaterialSlot = Packet_ClientActiveMaterialSlotSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ClientActiveMaterialSlotSerializer.deserializeLengthDelimited(stream, instance.activeMaterialSlot);
				continue;
			case 122:
				if (instance.leave == null)
					instance.leave = Packet_ClientLeaveSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ClientLeaveSerializer.deserializeLengthDelimited(stream, instance.leave);
				continue;
			default:
				break;
			}
			Key key = ProtocolParser.readKey_((byte) keyByte, stream);
			switch (key.getField()) {
			case 0:
				return null;
			case 31:
				if (key.getWireType() != 2)
					break;
				if (instance.fillArea == null)
					instance.fillArea = Packet_ClientFillAreaSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ClientFillAreaSerializer.deserializeLengthDelimited(stream, instance.fillArea);
				continue;
			case 16:
				if (key.getWireType() != 2)
					break;
				if (instance.reload == null)
					instance.reload = Packet_ClientReloadSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ClientReloadSerializer.deserializeLengthDelimited(stream, instance.reload);
				continue;
			case 17:
				if (key.getWireType() != 2)
					break;
				if (instance.oxygen == null)
					instance.oxygen = Packet_ClientOxygenSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ClientOxygenSerializer.deserializeLengthDelimited(stream, instance.oxygen);
				continue;
			case 18:
				if (key.getWireType() != 2)
					break;
				if (instance.death == null)
					instance.death = Packet_ClientDeathSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ClientDeathSerializer.deserializeLengthDelimited(stream, instance.death);
				continue;
			case 19:
				if (key.getWireType() != 2)
					break;
				if (instance.query == null)
					instance.query = Packet_ClientServerQuerySerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ClientServerQuerySerializer.deserializeLengthDelimited(stream, instance.query);
				continue;
			case 20:
				if (key.getWireType() != 2)
					break;
				if (instance.gameResolution == null)
					instance.gameResolution = Packet_ClientGameResolutionSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ClientGameResolutionSerializer.deserializeLengthDelimited(stream, instance.gameResolution);
				continue;
			case 21:
				if (key.getWireType() != 2)
					break;
				if (instance.entityInteraction == null)
					instance.entityInteraction = Packet_ClientEntityInteractionSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ClientEntityInteractionSerializer.deserializeLengthDelimited(stream, instance.entityInteraction);
				continue;
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
	public static Packet_Client deserializeLengthDelimitedNew(CitoStream stream)
	{
		Packet_Client instance = new Packet_Client();
		Packet_ClientSerializer.deserializeLengthDelimited(stream, instance);
		return instance;
	}

	/**
	 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
	 */
	public static void serialize(CitoStream stream, Packet_Client instance)
	{
		if (instance.id != 0) {
			stream.writeByte(ProtoPlatform.intToByte(8));
			ProtocolParser.writeUInt64(stream, instance.id);
		}
		if (instance.identification != null) {
			stream.writeByte(ProtoPlatform.intToByte(18));
			CitoMemoryStream ms2 = new CitoMemoryStream();
			Packet_ClientIdentificationSerializer.serialize(ms2, instance.identification);
			int ms2Length = ms2.length();
			ProtocolParser.writeUInt32_(stream, ms2Length);
			stream.write(ms2.getBuffer(), 0, ms2Length);
		}
		if (instance.setBlock != null) {
			stream.writeByte(ProtoPlatform.intToByte(26));
			CitoMemoryStream ms3 = new CitoMemoryStream();
			Packet_ClientSetBlockSerializer.serialize(ms3, instance.setBlock);
			int ms3Length = ms3.length();
			ProtocolParser.writeUInt32_(stream, ms3Length);
			stream.write(ms3.getBuffer(), 0, ms3Length);
		}
		if (instance.fillArea != null) {
			stream.writeByte(ProtoPlatform.intToByte(250));
			stream.writeByte(ProtoPlatform.intToByte(1));
			CitoMemoryStream ms31 = new CitoMemoryStream();
			Packet_ClientFillAreaSerializer.serialize(ms31, instance.fillArea);
			int ms31Length = ms31.length();
			ProtocolParser.writeUInt32_(stream, ms31Length);
			stream.write(ms31.getBuffer(), 0, ms31Length);
		}
		if (instance.positionAndOrientation != null) {
			stream.writeByte(ProtoPlatform.intToByte(34));
			CitoMemoryStream ms4 = new CitoMemoryStream();
			Packet_ClientPositionAndOrientationSerializer.serialize(ms4, instance.positionAndOrientation);
			int ms4Length = ms4.length();
			ProtocolParser.writeUInt32_(stream, ms4Length);
			stream.write(ms4.getBuffer(), 0, ms4Length);
		}
		if (instance.message != null) {
			stream.writeByte(ProtoPlatform.intToByte(42));
			CitoMemoryStream ms5 = new CitoMemoryStream();
			Packet_ClientMessageSerializer.serialize(ms5, instance.message);
			int ms5Length = ms5.length();
			ProtocolParser.writeUInt32_(stream, ms5Length);
			stream.write(ms5.getBuffer(), 0, ms5Length);
		}
		if (instance.craft != null) {
			stream.writeByte(ProtoPlatform.intToByte(50));
			CitoMemoryStream ms6 = new CitoMemoryStream();
			Packet_ClientCraftSerializer.serialize(ms6, instance.craft);
			int ms6Length = ms6.length();
			ProtocolParser.writeUInt32_(stream, ms6Length);
			stream.write(ms6.getBuffer(), 0, ms6Length);
		}
		if (instance.requestBlob != null) {
			stream.writeByte(ProtoPlatform.intToByte(58));
			CitoMemoryStream ms7 = new CitoMemoryStream();
			Packet_ClientRequestBlobSerializer.serialize(ms7, instance.requestBlob);
			int ms7Length = ms7.length();
			ProtocolParser.writeUInt32_(stream, ms7Length);
			stream.write(ms7.getBuffer(), 0, ms7Length);
		}
		if (instance.inventoryAction != null) {
			stream.writeByte(ProtoPlatform.intToByte(66));
			CitoMemoryStream ms8 = new CitoMemoryStream();
			Packet_ClientInventoryActionSerializer.serialize(ms8, instance.inventoryAction);
			int ms8Length = ms8.length();
			ProtocolParser.writeUInt32_(stream, ms8Length);
			stream.write(ms8.getBuffer(), 0, ms8Length);
		}
		if (instance.health != null) {
			stream.writeByte(ProtoPlatform.intToByte(74));
			CitoMemoryStream ms9 = new CitoMemoryStream();
			Packet_ClientHealthSerializer.serialize(ms9, instance.health);
			int ms9Length = ms9.length();
			ProtocolParser.writeUInt32_(stream, ms9Length);
			stream.write(ms9.getBuffer(), 0, ms9Length);
		}
		if (instance.pingReply != null) {
			stream.writeByte(ProtoPlatform.intToByte(82));
			CitoMemoryStream ms10 = new CitoMemoryStream();
			Packet_ClientPingReplySerializer.serialize(ms10, instance.pingReply);
			int ms10Length = ms10.length();
			ProtocolParser.writeUInt32_(stream, ms10Length);
			stream.write(ms10.getBuffer(), 0, ms10Length);
		}
		if (instance.dialogClick_ != null) {
			stream.writeByte(ProtoPlatform.intToByte(90));
			CitoMemoryStream ms11 = new CitoMemoryStream();
			Packet_ClientDialogClickSerializer.serialize(ms11, instance.dialogClick_);
			int ms11Length = ms11.length();
			ProtocolParser.writeUInt32_(stream, ms11Length);
			stream.write(ms11.getBuffer(), 0, ms11Length);
		}
		if (instance.shot != null) {
			stream.writeByte(ProtoPlatform.intToByte(98));
			CitoMemoryStream ms12 = new CitoMemoryStream();
			Packet_ClientShotSerializer.serialize(ms12, instance.shot);
			int ms12Length = ms12.length();
			ProtocolParser.writeUInt32_(stream, ms12Length);
			stream.write(ms12.getBuffer(), 0, ms12Length);
		}
		if (instance.specialKey_ != null) {
			stream.writeByte(ProtoPlatform.intToByte(106));
			CitoMemoryStream ms13 = new CitoMemoryStream();
			Packet_ClientSpecialKeySerializer.serialize(ms13, instance.specialKey_);
			int ms13Length = ms13.length();
			ProtocolParser.writeUInt32_(stream, ms13Length);
			stream.write(ms13.getBuffer(), 0, ms13Length);
		}
		if (instance.activeMaterialSlot != null) {
			stream.writeByte(ProtoPlatform.intToByte(114));
			CitoMemoryStream ms14 = new CitoMemoryStream();
			Packet_ClientActiveMaterialSlotSerializer.serialize(ms14, instance.activeMaterialSlot);
			int ms14Length = ms14.length();
			ProtocolParser.writeUInt32_(stream, ms14Length);
			stream.write(ms14.getBuffer(), 0, ms14Length);
		}
		if (instance.leave != null) {
			stream.writeByte(ProtoPlatform.intToByte(122));
			CitoMemoryStream ms15 = new CitoMemoryStream();
			Packet_ClientLeaveSerializer.serialize(ms15, instance.leave);
			int ms15Length = ms15.length();
			ProtocolParser.writeUInt32_(stream, ms15Length);
			stream.write(ms15.getBuffer(), 0, ms15Length);
		}
		if (instance.reload != null) {
			stream.writeByte(ProtoPlatform.intToByte(130));
			stream.writeByte(ProtoPlatform.intToByte(1));
			CitoMemoryStream ms16 = new CitoMemoryStream();
			Packet_ClientReloadSerializer.serialize(ms16, instance.reload);
			int ms16Length = ms16.length();
			ProtocolParser.writeUInt32_(stream, ms16Length);
			stream.write(ms16.getBuffer(), 0, ms16Length);
		}
		if (instance.oxygen != null) {
			stream.writeByte(ProtoPlatform.intToByte(138));
			stream.writeByte(ProtoPlatform.intToByte(1));
			CitoMemoryStream ms17 = new CitoMemoryStream();
			Packet_ClientOxygenSerializer.serialize(ms17, instance.oxygen);
			int ms17Length = ms17.length();
			ProtocolParser.writeUInt32_(stream, ms17Length);
			stream.write(ms17.getBuffer(), 0, ms17Length);
		}
		if (instance.death != null) {
			stream.writeByte(ProtoPlatform.intToByte(146));
			stream.writeByte(ProtoPlatform.intToByte(1));
			CitoMemoryStream ms18 = new CitoMemoryStream();
			Packet_ClientDeathSerializer.serialize(ms18, instance.death);
			int ms18Length = ms18.length();
			ProtocolParser.writeUInt32_(stream, ms18Length);
			stream.write(ms18.getBuffer(), 0, ms18Length);
		}
		if (instance.query != null) {
			stream.writeByte(ProtoPlatform.intToByte(154));
			stream.writeByte(ProtoPlatform.intToByte(1));
			CitoMemoryStream ms19 = new CitoMemoryStream();
			Packet_ClientServerQuerySerializer.serialize(ms19, instance.query);
			int ms19Length = ms19.length();
			ProtocolParser.writeUInt32_(stream, ms19Length);
			stream.write(ms19.getBuffer(), 0, ms19Length);
		}
		if (instance.gameResolution != null) {
			stream.writeByte(ProtoPlatform.intToByte(162));
			stream.writeByte(ProtoPlatform.intToByte(1));
			CitoMemoryStream ms20 = new CitoMemoryStream();
			Packet_ClientGameResolutionSerializer.serialize(ms20, instance.gameResolution);
			int ms20Length = ms20.length();
			ProtocolParser.writeUInt32_(stream, ms20Length);
			stream.write(ms20.getBuffer(), 0, ms20Length);
		}
		if (instance.entityInteraction != null) {
			stream.writeByte(ProtoPlatform.intToByte(170));
			stream.writeByte(ProtoPlatform.intToByte(1));
			CitoMemoryStream ms21 = new CitoMemoryStream();
			Packet_ClientEntityInteractionSerializer.serialize(ms21, instance.entityInteraction);
			int ms21Length = ms21.length();
			ProtocolParser.writeUInt32_(stream, ms21Length);
			stream.write(ms21.getBuffer(), 0, ms21Length);
		}
	}

	/**
	 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
	 */
	public static void serializeLengthDelimited(CitoStream stream, Packet_Client instance)
	{
		byte[] data = Packet_ClientSerializer.serializeToBytes(instance);
		ProtocolParser.writeUInt32_(stream, ProtoPlatform.arrayLength(data));
		stream.write(data, 0, ProtoPlatform.arrayLength(data));
	}

	/**
	 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
	 */
	public static byte[] serializeToBytes(Packet_Client instance)
	{
		CitoMemoryStream ms = new CitoMemoryStream();
		Packet_ClientSerializer.serialize(ms, instance);
		return ms.toArray();
	}
}
