// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class Packet_ServerEntitySerializer
{

	/**
	 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
	 */
	public static Packet_ServerEntity deserialize(CitoStream stream, Packet_ServerEntity instance)
	{
		while (true) {
			int keyByte = stream.readByte();
			if (keyByte == -1)
				break;
			switch (keyByte) {
			case 10:
				if (instance.position == null)
					instance.position = Packet_PositionAndOrientationSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_PositionAndOrientationSerializer.deserializeLengthDelimited(stream, instance.position);
				continue;
			case 18:
				if (instance.drawModel == null)
					instance.drawModel = Packet_ServerEntityAnimatedModelSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerEntityAnimatedModelSerializer.deserializeLengthDelimited(stream, instance.drawModel);
				continue;
			case 26:
				if (instance.drawName_ == null)
					instance.drawName_ = Packet_ServerEntityDrawNameSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerEntityDrawNameSerializer.deserializeLengthDelimited(stream, instance.drawName_);
				continue;
			case 34:
				if (instance.drawText == null)
					instance.drawText = Packet_ServerEntityDrawTextSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerEntityDrawTextSerializer.deserializeLengthDelimited(stream, instance.drawText);
				continue;
			case 42:
				if (instance.drawBlock == null)
					instance.drawBlock = Packet_ServerEntityDrawBlockSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerEntityDrawBlockSerializer.deserializeLengthDelimited(stream, instance.drawBlock);
				continue;
			case 50:
				if (instance.push == null)
					instance.push = Packet_ServerEntityPushSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerEntityPushSerializer.deserializeLengthDelimited(stream, instance.push);
				continue;
			case 56:
				instance.usable = ProtocolParser.readBool(stream);
				continue;
			case 66:
				if (instance.playerStats == null)
					instance.playerStats = Packet_ServerPlayerStatsSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerPlayerStatsSerializer.deserializeLengthDelimited(stream, instance.playerStats);
				continue;
			case 74:
				if (instance.drawArea == null)
					instance.drawArea = Packet_ServerEntityDrawAreaSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerEntityDrawAreaSerializer.deserializeLengthDelimited(stream, instance.drawArea);
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
	public static Packet_ServerEntity deserializeBuffer(byte[] buffer, int length, Packet_ServerEntity instance)
	{
		CitoMemoryStream ms = CitoMemoryStream.create(buffer, length);
		Packet_ServerEntitySerializer.deserialize(ms, instance);
		return instance;
	}

	/**
	 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
	 */
	public static Packet_ServerEntity deserializeLength(CitoStream stream, int length, Packet_ServerEntity instance)
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
				if (instance.position == null)
					instance.position = Packet_PositionAndOrientationSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_PositionAndOrientationSerializer.deserializeLengthDelimited(stream, instance.position);
				continue;
			case 18:
				if (instance.drawModel == null)
					instance.drawModel = Packet_ServerEntityAnimatedModelSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerEntityAnimatedModelSerializer.deserializeLengthDelimited(stream, instance.drawModel);
				continue;
			case 26:
				if (instance.drawName_ == null)
					instance.drawName_ = Packet_ServerEntityDrawNameSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerEntityDrawNameSerializer.deserializeLengthDelimited(stream, instance.drawName_);
				continue;
			case 34:
				if (instance.drawText == null)
					instance.drawText = Packet_ServerEntityDrawTextSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerEntityDrawTextSerializer.deserializeLengthDelimited(stream, instance.drawText);
				continue;
			case 42:
				if (instance.drawBlock == null)
					instance.drawBlock = Packet_ServerEntityDrawBlockSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerEntityDrawBlockSerializer.deserializeLengthDelimited(stream, instance.drawBlock);
				continue;
			case 50:
				if (instance.push == null)
					instance.push = Packet_ServerEntityPushSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerEntityPushSerializer.deserializeLengthDelimited(stream, instance.push);
				continue;
			case 56:
				instance.usable = ProtocolParser.readBool(stream);
				continue;
			case 66:
				if (instance.playerStats == null)
					instance.playerStats = Packet_ServerPlayerStatsSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerPlayerStatsSerializer.deserializeLengthDelimited(stream, instance.playerStats);
				continue;
			case 74:
				if (instance.drawArea == null)
					instance.drawArea = Packet_ServerEntityDrawAreaSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerEntityDrawAreaSerializer.deserializeLengthDelimited(stream, instance.drawArea);
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
	public static Packet_ServerEntity deserializeLengthDelimited(CitoStream stream, Packet_ServerEntity instance)
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
				if (instance.position == null)
					instance.position = Packet_PositionAndOrientationSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_PositionAndOrientationSerializer.deserializeLengthDelimited(stream, instance.position);
				continue;
			case 18:
				if (instance.drawModel == null)
					instance.drawModel = Packet_ServerEntityAnimatedModelSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerEntityAnimatedModelSerializer.deserializeLengthDelimited(stream, instance.drawModel);
				continue;
			case 26:
				if (instance.drawName_ == null)
					instance.drawName_ = Packet_ServerEntityDrawNameSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerEntityDrawNameSerializer.deserializeLengthDelimited(stream, instance.drawName_);
				continue;
			case 34:
				if (instance.drawText == null)
					instance.drawText = Packet_ServerEntityDrawTextSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerEntityDrawTextSerializer.deserializeLengthDelimited(stream, instance.drawText);
				continue;
			case 42:
				if (instance.drawBlock == null)
					instance.drawBlock = Packet_ServerEntityDrawBlockSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerEntityDrawBlockSerializer.deserializeLengthDelimited(stream, instance.drawBlock);
				continue;
			case 50:
				if (instance.push == null)
					instance.push = Packet_ServerEntityPushSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerEntityPushSerializer.deserializeLengthDelimited(stream, instance.push);
				continue;
			case 56:
				instance.usable = ProtocolParser.readBool(stream);
				continue;
			case 66:
				if (instance.playerStats == null)
					instance.playerStats = Packet_ServerPlayerStatsSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerPlayerStatsSerializer.deserializeLengthDelimited(stream, instance.playerStats);
				continue;
			case 74:
				if (instance.drawArea == null)
					instance.drawArea = Packet_ServerEntityDrawAreaSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerEntityDrawAreaSerializer.deserializeLengthDelimited(stream, instance.drawArea);
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
	public static Packet_ServerEntity deserializeLengthDelimitedNew(CitoStream stream)
	{
		Packet_ServerEntity instance = new Packet_ServerEntity();
		Packet_ServerEntitySerializer.deserializeLengthDelimited(stream, instance);
		return instance;
	}

	/**
	 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
	 */
	public static void serialize(CitoStream stream, Packet_ServerEntity instance)
	{
		if (instance.position != null) {
			stream.writeByte(ProtoPlatform.intToByte(10));
			CitoMemoryStream ms1 = new CitoMemoryStream();
			Packet_PositionAndOrientationSerializer.serialize(ms1, instance.position);
			int ms1Length = ms1.length();
			ProtocolParser.writeUInt32_(stream, ms1Length);
			stream.write(ms1.getBuffer(), 0, ms1Length);
		}
		if (instance.drawModel != null) {
			stream.writeByte(ProtoPlatform.intToByte(18));
			CitoMemoryStream ms2 = new CitoMemoryStream();
			Packet_ServerEntityAnimatedModelSerializer.serialize(ms2, instance.drawModel);
			int ms2Length = ms2.length();
			ProtocolParser.writeUInt32_(stream, ms2Length);
			stream.write(ms2.getBuffer(), 0, ms2Length);
		}
		if (instance.drawName_ != null) {
			stream.writeByte(ProtoPlatform.intToByte(26));
			CitoMemoryStream ms3 = new CitoMemoryStream();
			Packet_ServerEntityDrawNameSerializer.serialize(ms3, instance.drawName_);
			int ms3Length = ms3.length();
			ProtocolParser.writeUInt32_(stream, ms3Length);
			stream.write(ms3.getBuffer(), 0, ms3Length);
		}
		if (instance.drawText != null) {
			stream.writeByte(ProtoPlatform.intToByte(34));
			CitoMemoryStream ms4 = new CitoMemoryStream();
			Packet_ServerEntityDrawTextSerializer.serialize(ms4, instance.drawText);
			int ms4Length = ms4.length();
			ProtocolParser.writeUInt32_(stream, ms4Length);
			stream.write(ms4.getBuffer(), 0, ms4Length);
		}
		if (instance.drawBlock != null) {
			stream.writeByte(ProtoPlatform.intToByte(42));
			CitoMemoryStream ms5 = new CitoMemoryStream();
			Packet_ServerEntityDrawBlockSerializer.serialize(ms5, instance.drawBlock);
			int ms5Length = ms5.length();
			ProtocolParser.writeUInt32_(stream, ms5Length);
			stream.write(ms5.getBuffer(), 0, ms5Length);
		}
		if (instance.push != null) {
			stream.writeByte(ProtoPlatform.intToByte(50));
			CitoMemoryStream ms6 = new CitoMemoryStream();
			Packet_ServerEntityPushSerializer.serialize(ms6, instance.push);
			int ms6Length = ms6.length();
			ProtocolParser.writeUInt32_(stream, ms6Length);
			stream.write(ms6.getBuffer(), 0, ms6Length);
		}
		stream.writeByte(ProtoPlatform.intToByte(56));
		ProtocolParser.writeBool(stream, instance.usable);
		if (instance.playerStats != null) {
			stream.writeByte(ProtoPlatform.intToByte(66));
			CitoMemoryStream ms8 = new CitoMemoryStream();
			Packet_ServerPlayerStatsSerializer.serialize(ms8, instance.playerStats);
			int ms8Length = ms8.length();
			ProtocolParser.writeUInt32_(stream, ms8Length);
			stream.write(ms8.getBuffer(), 0, ms8Length);
		}
		if (instance.drawArea != null) {
			stream.writeByte(ProtoPlatform.intToByte(74));
			CitoMemoryStream ms9 = new CitoMemoryStream();
			Packet_ServerEntityDrawAreaSerializer.serialize(ms9, instance.drawArea);
			int ms9Length = ms9.length();
			ProtocolParser.writeUInt32_(stream, ms9Length);
			stream.write(ms9.getBuffer(), 0, ms9Length);
		}
	}

	/**
	 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
	 */
	public static void serializeLengthDelimited(CitoStream stream, Packet_ServerEntity instance)
	{
		byte[] data = Packet_ServerEntitySerializer.serializeToBytes(instance);
		ProtocolParser.writeUInt32_(stream, ProtoPlatform.arrayLength(data));
		stream.write(data, 0, ProtoPlatform.arrayLength(data));
	}

	/**
	 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
	 */
	public static byte[] serializeToBytes(Packet_ServerEntity instance)
	{
		CitoMemoryStream ms = new CitoMemoryStream();
		Packet_ServerEntitySerializer.serialize(ms, instance);
		return ms.toArray();
	}
}
