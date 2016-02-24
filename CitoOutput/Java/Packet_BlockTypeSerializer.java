// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class Packet_BlockTypeSerializer
{

	/**
	 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
	 */
	public static Packet_BlockType deserialize(CitoStream stream, Packet_BlockType instance)
	{
		instance.drawType = 0;
		instance.walkableType = 0;
		instance.pistolType = 0;
		while (true) {
			int keyByte = stream.readByte();
			if (keyByte == -1)
				break;
			switch (keyByte) {
			case 10:
				instance.textureIdTop = ProtocolParser.readString(stream);
				continue;
			case 18:
				instance.textureIdBottom = ProtocolParser.readString(stream);
				continue;
			case 26:
				instance.textureIdFront = ProtocolParser.readString(stream);
				continue;
			case 34:
				instance.textureIdBack = ProtocolParser.readString(stream);
				continue;
			case 42:
				instance.textureIdLeft = ProtocolParser.readString(stream);
				continue;
			case 50:
				instance.textureIdRight = ProtocolParser.readString(stream);
				continue;
			case 58:
				instance.textureIdForInventory = ProtocolParser.readString(stream);
				continue;
			case 64:
				instance.drawType = ProtocolParser.readUInt64(stream);
				continue;
			case 72:
				instance.walkableType = ProtocolParser.readUInt64(stream);
				continue;
			case 80:
				instance.rail = ProtocolParser.readUInt64(stream);
				continue;
			case 88:
				instance.walkSpeedFloat = ProtocolParser.readUInt64(stream);
				continue;
			case 96:
				instance.isSlipperyWalk = ProtocolParser.readBool(stream);
				continue;
			case 106:
				if (instance.sounds == null)
					instance.sounds = Packet_SoundSetSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_SoundSetSerializer.deserializeLengthDelimited(stream, instance.sounds);
				continue;
			case 112:
				instance.lightRadius = ProtocolParser.readUInt64(stream);
				continue;
			case 120:
				instance.startInventoryAmount = ProtocolParser.readUInt64(stream);
				continue;
			default:
				break;
			}
			Key key = ProtocolParser.readKey_((byte) keyByte, stream);
			switch (key.getField()) {
			case 0:
				return null;
			case 16:
				if (key.getWireType() != 0)
					break;
				instance.strength = ProtocolParser.readUInt64(stream);
				continue;
			case 17:
				if (key.getWireType() != 2)
					break;
				instance.name = ProtocolParser.readString(stream);
				continue;
			case 18:
				if (key.getWireType() != 0)
					break;
				instance.isBuildable = ProtocolParser.readBool(stream);
				continue;
			case 19:
				if (key.getWireType() != 0)
					break;
				instance.isUsable = ProtocolParser.readBool(stream);
				continue;
			case 20:
				if (key.getWireType() != 0)
					break;
				instance.isTool = ProtocolParser.readBool(stream);
				continue;
			case 21:
				if (key.getWireType() != 2)
					break;
				instance.handimage = ProtocolParser.readString(stream);
				continue;
			case 22:
				if (key.getWireType() != 0)
					break;
				instance.isPistol = ProtocolParser.readBool(stream);
				continue;
			case 23:
				if (key.getWireType() != 0)
					break;
				instance.aimRadiusFloat = ProtocolParser.readUInt64(stream);
				continue;
			case 24:
				if (key.getWireType() != 0)
					break;
				instance.recoilFloat = ProtocolParser.readUInt64(stream);
				continue;
			case 25:
				if (key.getWireType() != 0)
					break;
				instance.delayFloat = ProtocolParser.readUInt64(stream);
				continue;
			case 26:
				if (key.getWireType() != 0)
					break;
				instance.bulletsPerShotFloat = ProtocolParser.readUInt64(stream);
				continue;
			case 27:
				if (key.getWireType() != 0)
					break;
				instance.walkSpeedWhenUsedFloat = ProtocolParser.readUInt64(stream);
				continue;
			case 28:
				if (key.getWireType() != 0)
					break;
				instance.ironSightsEnabled = ProtocolParser.readBool(stream);
				continue;
			case 29:
				if (key.getWireType() != 0)
					break;
				instance.ironSightsMoveSpeedFloat = ProtocolParser.readUInt64(stream);
				continue;
			case 30:
				if (key.getWireType() != 2)
					break;
				instance.ironSightsImage = ProtocolParser.readString(stream);
				continue;
			case 31:
				if (key.getWireType() != 0)
					break;
				instance.ironSightsAimRadiusFloat = ProtocolParser.readUInt64(stream);
				continue;
			case 32:
				if (key.getWireType() != 0)
					break;
				instance.ironSightsFovFloat = ProtocolParser.readUInt64(stream);
				continue;
			case 33:
				if (key.getWireType() != 0)
					break;
				instance.ammoMagazine = ProtocolParser.readUInt64(stream);
				continue;
			case 34:
				if (key.getWireType() != 0)
					break;
				instance.ammoTotal = ProtocolParser.readUInt64(stream);
				continue;
			case 35:
				if (key.getWireType() != 0)
					break;
				instance.reloadDelayFloat = ProtocolParser.readUInt64(stream);
				continue;
			case 36:
				if (key.getWireType() != 0)
					break;
				instance.explosionRangeFloat = ProtocolParser.readUInt64(stream);
				continue;
			case 37:
				if (key.getWireType() != 0)
					break;
				instance.explosionTimeFloat = ProtocolParser.readUInt64(stream);
				continue;
			case 38:
				if (key.getWireType() != 0)
					break;
				instance.projectileSpeedFloat = ProtocolParser.readUInt64(stream);
				continue;
			case 39:
				if (key.getWireType() != 0)
					break;
				instance.projectileBounce = ProtocolParser.readBool(stream);
				continue;
			case 40:
				if (key.getWireType() != 0)
					break;
				instance.damageBodyFloat = ProtocolParser.readUInt64(stream);
				continue;
			case 41:
				if (key.getWireType() != 0)
					break;
				instance.damageHeadFloat = ProtocolParser.readUInt64(stream);
				continue;
			case 42:
				if (key.getWireType() != 0)
					break;
				instance.pistolType = ProtocolParser.readUInt64(stream);
				continue;
			case 43:
				if (key.getWireType() != 0)
					break;
				instance.damageToPlayer = ProtocolParser.readUInt64(stream);
				continue;
			case 44:
				if (key.getWireType() != 0)
					break;
				instance.whenPlacedGetsConvertedTo = ProtocolParser.readUInt64(stream);
				continue;
			case 45:
				if (key.getWireType() != 0)
					break;
				instance.pickDistanceWhenUsedFloat = ProtocolParser.readUInt64(stream);
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
	public static Packet_BlockType deserializeBuffer(byte[] buffer, int length, Packet_BlockType instance)
	{
		CitoMemoryStream ms = CitoMemoryStream.create(buffer, length);
		Packet_BlockTypeSerializer.deserialize(ms, instance);
		return instance;
	}

	/**
	 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
	 */
	public static Packet_BlockType deserializeLength(CitoStream stream, int length, Packet_BlockType instance)
	{
		instance.drawType = 0;
		instance.walkableType = 0;
		instance.pistolType = 0;
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
				instance.textureIdTop = ProtocolParser.readString(stream);
				continue;
			case 18:
				instance.textureIdBottom = ProtocolParser.readString(stream);
				continue;
			case 26:
				instance.textureIdFront = ProtocolParser.readString(stream);
				continue;
			case 34:
				instance.textureIdBack = ProtocolParser.readString(stream);
				continue;
			case 42:
				instance.textureIdLeft = ProtocolParser.readString(stream);
				continue;
			case 50:
				instance.textureIdRight = ProtocolParser.readString(stream);
				continue;
			case 58:
				instance.textureIdForInventory = ProtocolParser.readString(stream);
				continue;
			case 64:
				instance.drawType = ProtocolParser.readUInt64(stream);
				continue;
			case 72:
				instance.walkableType = ProtocolParser.readUInt64(stream);
				continue;
			case 80:
				instance.rail = ProtocolParser.readUInt64(stream);
				continue;
			case 88:
				instance.walkSpeedFloat = ProtocolParser.readUInt64(stream);
				continue;
			case 96:
				instance.isSlipperyWalk = ProtocolParser.readBool(stream);
				continue;
			case 106:
				if (instance.sounds == null)
					instance.sounds = Packet_SoundSetSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_SoundSetSerializer.deserializeLengthDelimited(stream, instance.sounds);
				continue;
			case 112:
				instance.lightRadius = ProtocolParser.readUInt64(stream);
				continue;
			case 120:
				instance.startInventoryAmount = ProtocolParser.readUInt64(stream);
				continue;
			default:
				break;
			}
			Key key = ProtocolParser.readKey_((byte) keyByte, stream);
			switch (key.getField()) {
			case 0:
				return null;
			case 16:
				if (key.getWireType() != 0)
					break;
				instance.strength = ProtocolParser.readUInt64(stream);
				continue;
			case 17:
				if (key.getWireType() != 2)
					break;
				instance.name = ProtocolParser.readString(stream);
				continue;
			case 18:
				if (key.getWireType() != 0)
					break;
				instance.isBuildable = ProtocolParser.readBool(stream);
				continue;
			case 19:
				if (key.getWireType() != 0)
					break;
				instance.isUsable = ProtocolParser.readBool(stream);
				continue;
			case 20:
				if (key.getWireType() != 0)
					break;
				instance.isTool = ProtocolParser.readBool(stream);
				continue;
			case 21:
				if (key.getWireType() != 2)
					break;
				instance.handimage = ProtocolParser.readString(stream);
				continue;
			case 22:
				if (key.getWireType() != 0)
					break;
				instance.isPistol = ProtocolParser.readBool(stream);
				continue;
			case 23:
				if (key.getWireType() != 0)
					break;
				instance.aimRadiusFloat = ProtocolParser.readUInt64(stream);
				continue;
			case 24:
				if (key.getWireType() != 0)
					break;
				instance.recoilFloat = ProtocolParser.readUInt64(stream);
				continue;
			case 25:
				if (key.getWireType() != 0)
					break;
				instance.delayFloat = ProtocolParser.readUInt64(stream);
				continue;
			case 26:
				if (key.getWireType() != 0)
					break;
				instance.bulletsPerShotFloat = ProtocolParser.readUInt64(stream);
				continue;
			case 27:
				if (key.getWireType() != 0)
					break;
				instance.walkSpeedWhenUsedFloat = ProtocolParser.readUInt64(stream);
				continue;
			case 28:
				if (key.getWireType() != 0)
					break;
				instance.ironSightsEnabled = ProtocolParser.readBool(stream);
				continue;
			case 29:
				if (key.getWireType() != 0)
					break;
				instance.ironSightsMoveSpeedFloat = ProtocolParser.readUInt64(stream);
				continue;
			case 30:
				if (key.getWireType() != 2)
					break;
				instance.ironSightsImage = ProtocolParser.readString(stream);
				continue;
			case 31:
				if (key.getWireType() != 0)
					break;
				instance.ironSightsAimRadiusFloat = ProtocolParser.readUInt64(stream);
				continue;
			case 32:
				if (key.getWireType() != 0)
					break;
				instance.ironSightsFovFloat = ProtocolParser.readUInt64(stream);
				continue;
			case 33:
				if (key.getWireType() != 0)
					break;
				instance.ammoMagazine = ProtocolParser.readUInt64(stream);
				continue;
			case 34:
				if (key.getWireType() != 0)
					break;
				instance.ammoTotal = ProtocolParser.readUInt64(stream);
				continue;
			case 35:
				if (key.getWireType() != 0)
					break;
				instance.reloadDelayFloat = ProtocolParser.readUInt64(stream);
				continue;
			case 36:
				if (key.getWireType() != 0)
					break;
				instance.explosionRangeFloat = ProtocolParser.readUInt64(stream);
				continue;
			case 37:
				if (key.getWireType() != 0)
					break;
				instance.explosionTimeFloat = ProtocolParser.readUInt64(stream);
				continue;
			case 38:
				if (key.getWireType() != 0)
					break;
				instance.projectileSpeedFloat = ProtocolParser.readUInt64(stream);
				continue;
			case 39:
				if (key.getWireType() != 0)
					break;
				instance.projectileBounce = ProtocolParser.readBool(stream);
				continue;
			case 40:
				if (key.getWireType() != 0)
					break;
				instance.damageBodyFloat = ProtocolParser.readUInt64(stream);
				continue;
			case 41:
				if (key.getWireType() != 0)
					break;
				instance.damageHeadFloat = ProtocolParser.readUInt64(stream);
				continue;
			case 42:
				if (key.getWireType() != 0)
					break;
				instance.pistolType = ProtocolParser.readUInt64(stream);
				continue;
			case 43:
				if (key.getWireType() != 0)
					break;
				instance.damageToPlayer = ProtocolParser.readUInt64(stream);
				continue;
			case 44:
				if (key.getWireType() != 0)
					break;
				instance.whenPlacedGetsConvertedTo = ProtocolParser.readUInt64(stream);
				continue;
			case 45:
				if (key.getWireType() != 0)
					break;
				instance.pickDistanceWhenUsedFloat = ProtocolParser.readUInt64(stream);
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
	public static Packet_BlockType deserializeLengthDelimited(CitoStream stream, Packet_BlockType instance)
	{
		instance.drawType = 0;
		instance.walkableType = 0;
		instance.pistolType = 0;
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
				instance.textureIdTop = ProtocolParser.readString(stream);
				continue;
			case 18:
				instance.textureIdBottom = ProtocolParser.readString(stream);
				continue;
			case 26:
				instance.textureIdFront = ProtocolParser.readString(stream);
				continue;
			case 34:
				instance.textureIdBack = ProtocolParser.readString(stream);
				continue;
			case 42:
				instance.textureIdLeft = ProtocolParser.readString(stream);
				continue;
			case 50:
				instance.textureIdRight = ProtocolParser.readString(stream);
				continue;
			case 58:
				instance.textureIdForInventory = ProtocolParser.readString(stream);
				continue;
			case 64:
				instance.drawType = ProtocolParser.readUInt64(stream);
				continue;
			case 72:
				instance.walkableType = ProtocolParser.readUInt64(stream);
				continue;
			case 80:
				instance.rail = ProtocolParser.readUInt64(stream);
				continue;
			case 88:
				instance.walkSpeedFloat = ProtocolParser.readUInt64(stream);
				continue;
			case 96:
				instance.isSlipperyWalk = ProtocolParser.readBool(stream);
				continue;
			case 106:
				if (instance.sounds == null)
					instance.sounds = Packet_SoundSetSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_SoundSetSerializer.deserializeLengthDelimited(stream, instance.sounds);
				continue;
			case 112:
				instance.lightRadius = ProtocolParser.readUInt64(stream);
				continue;
			case 120:
				instance.startInventoryAmount = ProtocolParser.readUInt64(stream);
				continue;
			default:
				break;
			}
			Key key = ProtocolParser.readKey_((byte) keyByte, stream);
			switch (key.getField()) {
			case 0:
				return null;
			case 16:
				if (key.getWireType() != 0)
					break;
				instance.strength = ProtocolParser.readUInt64(stream);
				continue;
			case 17:
				if (key.getWireType() != 2)
					break;
				instance.name = ProtocolParser.readString(stream);
				continue;
			case 18:
				if (key.getWireType() != 0)
					break;
				instance.isBuildable = ProtocolParser.readBool(stream);
				continue;
			case 19:
				if (key.getWireType() != 0)
					break;
				instance.isUsable = ProtocolParser.readBool(stream);
				continue;
			case 20:
				if (key.getWireType() != 0)
					break;
				instance.isTool = ProtocolParser.readBool(stream);
				continue;
			case 21:
				if (key.getWireType() != 2)
					break;
				instance.handimage = ProtocolParser.readString(stream);
				continue;
			case 22:
				if (key.getWireType() != 0)
					break;
				instance.isPistol = ProtocolParser.readBool(stream);
				continue;
			case 23:
				if (key.getWireType() != 0)
					break;
				instance.aimRadiusFloat = ProtocolParser.readUInt64(stream);
				continue;
			case 24:
				if (key.getWireType() != 0)
					break;
				instance.recoilFloat = ProtocolParser.readUInt64(stream);
				continue;
			case 25:
				if (key.getWireType() != 0)
					break;
				instance.delayFloat = ProtocolParser.readUInt64(stream);
				continue;
			case 26:
				if (key.getWireType() != 0)
					break;
				instance.bulletsPerShotFloat = ProtocolParser.readUInt64(stream);
				continue;
			case 27:
				if (key.getWireType() != 0)
					break;
				instance.walkSpeedWhenUsedFloat = ProtocolParser.readUInt64(stream);
				continue;
			case 28:
				if (key.getWireType() != 0)
					break;
				instance.ironSightsEnabled = ProtocolParser.readBool(stream);
				continue;
			case 29:
				if (key.getWireType() != 0)
					break;
				instance.ironSightsMoveSpeedFloat = ProtocolParser.readUInt64(stream);
				continue;
			case 30:
				if (key.getWireType() != 2)
					break;
				instance.ironSightsImage = ProtocolParser.readString(stream);
				continue;
			case 31:
				if (key.getWireType() != 0)
					break;
				instance.ironSightsAimRadiusFloat = ProtocolParser.readUInt64(stream);
				continue;
			case 32:
				if (key.getWireType() != 0)
					break;
				instance.ironSightsFovFloat = ProtocolParser.readUInt64(stream);
				continue;
			case 33:
				if (key.getWireType() != 0)
					break;
				instance.ammoMagazine = ProtocolParser.readUInt64(stream);
				continue;
			case 34:
				if (key.getWireType() != 0)
					break;
				instance.ammoTotal = ProtocolParser.readUInt64(stream);
				continue;
			case 35:
				if (key.getWireType() != 0)
					break;
				instance.reloadDelayFloat = ProtocolParser.readUInt64(stream);
				continue;
			case 36:
				if (key.getWireType() != 0)
					break;
				instance.explosionRangeFloat = ProtocolParser.readUInt64(stream);
				continue;
			case 37:
				if (key.getWireType() != 0)
					break;
				instance.explosionTimeFloat = ProtocolParser.readUInt64(stream);
				continue;
			case 38:
				if (key.getWireType() != 0)
					break;
				instance.projectileSpeedFloat = ProtocolParser.readUInt64(stream);
				continue;
			case 39:
				if (key.getWireType() != 0)
					break;
				instance.projectileBounce = ProtocolParser.readBool(stream);
				continue;
			case 40:
				if (key.getWireType() != 0)
					break;
				instance.damageBodyFloat = ProtocolParser.readUInt64(stream);
				continue;
			case 41:
				if (key.getWireType() != 0)
					break;
				instance.damageHeadFloat = ProtocolParser.readUInt64(stream);
				continue;
			case 42:
				if (key.getWireType() != 0)
					break;
				instance.pistolType = ProtocolParser.readUInt64(stream);
				continue;
			case 43:
				if (key.getWireType() != 0)
					break;
				instance.damageToPlayer = ProtocolParser.readUInt64(stream);
				continue;
			case 44:
				if (key.getWireType() != 0)
					break;
				instance.whenPlacedGetsConvertedTo = ProtocolParser.readUInt64(stream);
				continue;
			case 45:
				if (key.getWireType() != 0)
					break;
				instance.pickDistanceWhenUsedFloat = ProtocolParser.readUInt64(stream);
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
	public static Packet_BlockType deserializeLengthDelimitedNew(CitoStream stream)
	{
		Packet_BlockType instance = new Packet_BlockType();
		Packet_BlockTypeSerializer.deserializeLengthDelimited(stream, instance);
		return instance;
	}

	/**
	 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
	 */
	public static void serialize(CitoStream stream, Packet_BlockType instance)
	{
		if (instance.textureIdTop != null) {
			stream.writeByte(ProtoPlatform.intToByte(10));
			ProtocolParser.writeBytes(stream, ProtoPlatform.stringToBytes(instance.textureIdTop));
		}
		if (instance.textureIdBottom != null) {
			stream.writeByte(ProtoPlatform.intToByte(18));
			ProtocolParser.writeBytes(stream, ProtoPlatform.stringToBytes(instance.textureIdBottom));
		}
		if (instance.textureIdFront != null) {
			stream.writeByte(ProtoPlatform.intToByte(26));
			ProtocolParser.writeBytes(stream, ProtoPlatform.stringToBytes(instance.textureIdFront));
		}
		if (instance.textureIdBack != null) {
			stream.writeByte(ProtoPlatform.intToByte(34));
			ProtocolParser.writeBytes(stream, ProtoPlatform.stringToBytes(instance.textureIdBack));
		}
		if (instance.textureIdLeft != null) {
			stream.writeByte(ProtoPlatform.intToByte(42));
			ProtocolParser.writeBytes(stream, ProtoPlatform.stringToBytes(instance.textureIdLeft));
		}
		if (instance.textureIdRight != null) {
			stream.writeByte(ProtoPlatform.intToByte(50));
			ProtocolParser.writeBytes(stream, ProtoPlatform.stringToBytes(instance.textureIdRight));
		}
		if (instance.textureIdForInventory != null) {
			stream.writeByte(ProtoPlatform.intToByte(58));
			ProtocolParser.writeBytes(stream, ProtoPlatform.stringToBytes(instance.textureIdForInventory));
		}
		if (instance.drawType != 0) {
			stream.writeByte(ProtoPlatform.intToByte(64));
			ProtocolParser.writeUInt64(stream, instance.drawType);
		}
		if (instance.walkableType != 0) {
			stream.writeByte(ProtoPlatform.intToByte(72));
			ProtocolParser.writeUInt64(stream, instance.walkableType);
		}
		stream.writeByte(ProtoPlatform.intToByte(80));
		ProtocolParser.writeUInt64(stream, instance.rail);
		stream.writeByte(ProtoPlatform.intToByte(88));
		ProtocolParser.writeUInt64(stream, instance.walkSpeedFloat);
		stream.writeByte(ProtoPlatform.intToByte(96));
		ProtocolParser.writeBool(stream, instance.isSlipperyWalk);
		if (instance.sounds != null) {
			stream.writeByte(ProtoPlatform.intToByte(106));
			CitoMemoryStream ms13 = new CitoMemoryStream();
			Packet_SoundSetSerializer.serialize(ms13, instance.sounds);
			int ms13Length = ms13.length();
			ProtocolParser.writeUInt32_(stream, ms13Length);
			stream.write(ms13.getBuffer(), 0, ms13Length);
		}
		stream.writeByte(ProtoPlatform.intToByte(112));
		ProtocolParser.writeUInt64(stream, instance.lightRadius);
		stream.writeByte(ProtoPlatform.intToByte(120));
		ProtocolParser.writeUInt64(stream, instance.startInventoryAmount);
		stream.writeByte(ProtoPlatform.intToByte(128));
		stream.writeByte(ProtoPlatform.intToByte(1));
		ProtocolParser.writeUInt64(stream, instance.strength);
		if (instance.name != null) {
			stream.writeByte(ProtoPlatform.intToByte(138));
			stream.writeByte(ProtoPlatform.intToByte(1));
			ProtocolParser.writeBytes(stream, ProtoPlatform.stringToBytes(instance.name));
		}
		stream.writeByte(ProtoPlatform.intToByte(144));
		stream.writeByte(ProtoPlatform.intToByte(1));
		ProtocolParser.writeBool(stream, instance.isBuildable);
		stream.writeByte(ProtoPlatform.intToByte(152));
		stream.writeByte(ProtoPlatform.intToByte(1));
		ProtocolParser.writeBool(stream, instance.isUsable);
		stream.writeByte(ProtoPlatform.intToByte(160));
		stream.writeByte(ProtoPlatform.intToByte(1));
		ProtocolParser.writeBool(stream, instance.isTool);
		if (instance.handimage != null) {
			stream.writeByte(ProtoPlatform.intToByte(170));
			stream.writeByte(ProtoPlatform.intToByte(1));
			ProtocolParser.writeBytes(stream, ProtoPlatform.stringToBytes(instance.handimage));
		}
		stream.writeByte(ProtoPlatform.intToByte(176));
		stream.writeByte(ProtoPlatform.intToByte(1));
		ProtocolParser.writeBool(stream, instance.isPistol);
		stream.writeByte(ProtoPlatform.intToByte(184));
		stream.writeByte(ProtoPlatform.intToByte(1));
		ProtocolParser.writeUInt64(stream, instance.aimRadiusFloat);
		stream.writeByte(ProtoPlatform.intToByte(192));
		stream.writeByte(ProtoPlatform.intToByte(1));
		ProtocolParser.writeUInt64(stream, instance.recoilFloat);
		stream.writeByte(ProtoPlatform.intToByte(200));
		stream.writeByte(ProtoPlatform.intToByte(1));
		ProtocolParser.writeUInt64(stream, instance.delayFloat);
		stream.writeByte(ProtoPlatform.intToByte(208));
		stream.writeByte(ProtoPlatform.intToByte(1));
		ProtocolParser.writeUInt64(stream, instance.bulletsPerShotFloat);
		stream.writeByte(ProtoPlatform.intToByte(216));
		stream.writeByte(ProtoPlatform.intToByte(1));
		ProtocolParser.writeUInt64(stream, instance.walkSpeedWhenUsedFloat);
		stream.writeByte(ProtoPlatform.intToByte(224));
		stream.writeByte(ProtoPlatform.intToByte(1));
		ProtocolParser.writeBool(stream, instance.ironSightsEnabled);
		stream.writeByte(ProtoPlatform.intToByte(232));
		stream.writeByte(ProtoPlatform.intToByte(1));
		ProtocolParser.writeUInt64(stream, instance.ironSightsMoveSpeedFloat);
		if (instance.ironSightsImage != null) {
			stream.writeByte(ProtoPlatform.intToByte(242));
			stream.writeByte(ProtoPlatform.intToByte(1));
			ProtocolParser.writeBytes(stream, ProtoPlatform.stringToBytes(instance.ironSightsImage));
		}
		stream.writeByte(ProtoPlatform.intToByte(248));
		stream.writeByte(ProtoPlatform.intToByte(1));
		ProtocolParser.writeUInt64(stream, instance.ironSightsAimRadiusFloat);
		stream.writeByte(ProtoPlatform.intToByte(128));
		stream.writeByte(ProtoPlatform.intToByte(2));
		ProtocolParser.writeUInt64(stream, instance.ironSightsFovFloat);
		stream.writeByte(ProtoPlatform.intToByte(136));
		stream.writeByte(ProtoPlatform.intToByte(2));
		ProtocolParser.writeUInt64(stream, instance.ammoMagazine);
		stream.writeByte(ProtoPlatform.intToByte(144));
		stream.writeByte(ProtoPlatform.intToByte(2));
		ProtocolParser.writeUInt64(stream, instance.ammoTotal);
		stream.writeByte(ProtoPlatform.intToByte(152));
		stream.writeByte(ProtoPlatform.intToByte(2));
		ProtocolParser.writeUInt64(stream, instance.reloadDelayFloat);
		stream.writeByte(ProtoPlatform.intToByte(160));
		stream.writeByte(ProtoPlatform.intToByte(2));
		ProtocolParser.writeUInt64(stream, instance.explosionRangeFloat);
		stream.writeByte(ProtoPlatform.intToByte(168));
		stream.writeByte(ProtoPlatform.intToByte(2));
		ProtocolParser.writeUInt64(stream, instance.explosionTimeFloat);
		stream.writeByte(ProtoPlatform.intToByte(176));
		stream.writeByte(ProtoPlatform.intToByte(2));
		ProtocolParser.writeUInt64(stream, instance.projectileSpeedFloat);
		stream.writeByte(ProtoPlatform.intToByte(184));
		stream.writeByte(ProtoPlatform.intToByte(2));
		ProtocolParser.writeBool(stream, instance.projectileBounce);
		stream.writeByte(ProtoPlatform.intToByte(192));
		stream.writeByte(ProtoPlatform.intToByte(2));
		ProtocolParser.writeUInt64(stream, instance.damageBodyFloat);
		stream.writeByte(ProtoPlatform.intToByte(200));
		stream.writeByte(ProtoPlatform.intToByte(2));
		ProtocolParser.writeUInt64(stream, instance.damageHeadFloat);
		if (instance.pistolType != 0) {
			stream.writeByte(ProtoPlatform.intToByte(208));
			stream.writeByte(ProtoPlatform.intToByte(2));
			ProtocolParser.writeUInt64(stream, instance.pistolType);
		}
		stream.writeByte(ProtoPlatform.intToByte(216));
		stream.writeByte(ProtoPlatform.intToByte(2));
		ProtocolParser.writeUInt64(stream, instance.damageToPlayer);
		stream.writeByte(ProtoPlatform.intToByte(224));
		stream.writeByte(ProtoPlatform.intToByte(2));
		ProtocolParser.writeUInt64(stream, instance.whenPlacedGetsConvertedTo);
		stream.writeByte(ProtoPlatform.intToByte(232));
		stream.writeByte(ProtoPlatform.intToByte(2));
		ProtocolParser.writeUInt64(stream, instance.pickDistanceWhenUsedFloat);
	}

	/**
	 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
	 */
	public static void serializeLengthDelimited(CitoStream stream, Packet_BlockType instance)
	{
		byte[] data = Packet_BlockTypeSerializer.serializeToBytes(instance);
		ProtocolParser.writeUInt32_(stream, ProtoPlatform.arrayLength(data));
		stream.write(data, 0, ProtoPlatform.arrayLength(data));
	}

	/**
	 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
	 */
	public static byte[] serializeToBytes(Packet_BlockType instance)
	{
		CitoMemoryStream ms = new CitoMemoryStream();
		Packet_BlockTypeSerializer.serialize(ms, instance);
		return ms.toArray();
	}
}
