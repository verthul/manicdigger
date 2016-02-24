// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class Packet_SoundSetSerializer
{

	/**
	 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
	 */
	public static Packet_SoundSet deserialize(CitoStream stream, Packet_SoundSet instance)
	{
		if (instance.walk == null) {
			instance.walk = new String[1];
			instance.walkCount = 0;
			instance.walkLength = 1;
		}
		if (instance.break1 == null) {
			instance.break1 = new String[1];
			instance.break1Count = 0;
			instance.break1Length = 1;
		}
		if (instance.build == null) {
			instance.build = new String[1];
			instance.buildCount = 0;
			instance.buildLength = 1;
		}
		if (instance.clone == null) {
			instance.clone = new String[1];
			instance.cloneCount = 0;
			instance.cloneLength = 1;
		}
		if (instance.shoot == null) {
			instance.shoot = new String[1];
			instance.shootCount = 0;
			instance.shootLength = 1;
		}
		if (instance.shootEnd == null) {
			instance.shootEnd = new String[1];
			instance.shootEndCount = 0;
			instance.shootEndLength = 1;
		}
		if (instance.reload == null) {
			instance.reload = new String[1];
			instance.reloadCount = 0;
			instance.reloadLength = 1;
		}
		while (true) {
			int keyByte = stream.readByte();
			if (keyByte == -1)
				break;
			switch (keyByte) {
			case 10:
				instance.walkAdd(ProtocolParser.readString(stream));
				continue;
			case 18:
				instance.break1Add(ProtocolParser.readString(stream));
				continue;
			case 26:
				instance.buildAdd(ProtocolParser.readString(stream));
				continue;
			case 34:
				instance.cloneAdd(ProtocolParser.readString(stream));
				continue;
			case 42:
				instance.shootAdd(ProtocolParser.readString(stream));
				continue;
			case 50:
				instance.shootEndAdd(ProtocolParser.readString(stream));
				continue;
			case 58:
				instance.reloadAdd(ProtocolParser.readString(stream));
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
	public static Packet_SoundSet deserializeBuffer(byte[] buffer, int length, Packet_SoundSet instance)
	{
		CitoMemoryStream ms = CitoMemoryStream.create(buffer, length);
		Packet_SoundSetSerializer.deserialize(ms, instance);
		return instance;
	}

	/**
	 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
	 */
	public static Packet_SoundSet deserializeLength(CitoStream stream, int length, Packet_SoundSet instance)
	{
		if (instance.walk == null) {
			instance.walk = new String[1];
			instance.walkCount = 0;
			instance.walkLength = 1;
		}
		if (instance.break1 == null) {
			instance.break1 = new String[1];
			instance.break1Count = 0;
			instance.break1Length = 1;
		}
		if (instance.build == null) {
			instance.build = new String[1];
			instance.buildCount = 0;
			instance.buildLength = 1;
		}
		if (instance.clone == null) {
			instance.clone = new String[1];
			instance.cloneCount = 0;
			instance.cloneLength = 1;
		}
		if (instance.shoot == null) {
			instance.shoot = new String[1];
			instance.shootCount = 0;
			instance.shootLength = 1;
		}
		if (instance.shootEnd == null) {
			instance.shootEnd = new String[1];
			instance.shootEndCount = 0;
			instance.shootEndLength = 1;
		}
		if (instance.reload == null) {
			instance.reload = new String[1];
			instance.reloadCount = 0;
			instance.reloadLength = 1;
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
			case 10:
				instance.walkAdd(ProtocolParser.readString(stream));
				continue;
			case 18:
				instance.break1Add(ProtocolParser.readString(stream));
				continue;
			case 26:
				instance.buildAdd(ProtocolParser.readString(stream));
				continue;
			case 34:
				instance.cloneAdd(ProtocolParser.readString(stream));
				continue;
			case 42:
				instance.shootAdd(ProtocolParser.readString(stream));
				continue;
			case 50:
				instance.shootEndAdd(ProtocolParser.readString(stream));
				continue;
			case 58:
				instance.reloadAdd(ProtocolParser.readString(stream));
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
	public static Packet_SoundSet deserializeLengthDelimited(CitoStream stream, Packet_SoundSet instance)
	{
		if (instance.walk == null) {
			instance.walk = new String[1];
			instance.walkCount = 0;
			instance.walkLength = 1;
		}
		if (instance.break1 == null) {
			instance.break1 = new String[1];
			instance.break1Count = 0;
			instance.break1Length = 1;
		}
		if (instance.build == null) {
			instance.build = new String[1];
			instance.buildCount = 0;
			instance.buildLength = 1;
		}
		if (instance.clone == null) {
			instance.clone = new String[1];
			instance.cloneCount = 0;
			instance.cloneLength = 1;
		}
		if (instance.shoot == null) {
			instance.shoot = new String[1];
			instance.shootCount = 0;
			instance.shootLength = 1;
		}
		if (instance.shootEnd == null) {
			instance.shootEnd = new String[1];
			instance.shootEndCount = 0;
			instance.shootEndLength = 1;
		}
		if (instance.reload == null) {
			instance.reload = new String[1];
			instance.reloadCount = 0;
			instance.reloadLength = 1;
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
			case 10:
				instance.walkAdd(ProtocolParser.readString(stream));
				continue;
			case 18:
				instance.break1Add(ProtocolParser.readString(stream));
				continue;
			case 26:
				instance.buildAdd(ProtocolParser.readString(stream));
				continue;
			case 34:
				instance.cloneAdd(ProtocolParser.readString(stream));
				continue;
			case 42:
				instance.shootAdd(ProtocolParser.readString(stream));
				continue;
			case 50:
				instance.shootEndAdd(ProtocolParser.readString(stream));
				continue;
			case 58:
				instance.reloadAdd(ProtocolParser.readString(stream));
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
	public static Packet_SoundSet deserializeLengthDelimitedNew(CitoStream stream)
	{
		Packet_SoundSet instance = new Packet_SoundSet();
		Packet_SoundSetSerializer.deserializeLengthDelimited(stream, instance);
		return instance;
	}

	/**
	 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
	 */
	public static void serialize(CitoStream stream, Packet_SoundSet instance)
	{
		if (instance.walk != null) {
			for (int k = 0; k < instance.walkCount; k++) {
				String i1 = instance.walk[k];
				stream.writeByte(ProtoPlatform.intToByte(10));
				ProtocolParser.writeBytes(stream, ProtoPlatform.stringToBytes(i1));
			}
		}
		if (instance.break1 != null) {
			for (int k = 0; k < instance.break1Count; k++) {
				String i2 = instance.break1[k];
				stream.writeByte(ProtoPlatform.intToByte(18));
				ProtocolParser.writeBytes(stream, ProtoPlatform.stringToBytes(i2));
			}
		}
		if (instance.build != null) {
			for (int k = 0; k < instance.buildCount; k++) {
				String i3 = instance.build[k];
				stream.writeByte(ProtoPlatform.intToByte(26));
				ProtocolParser.writeBytes(stream, ProtoPlatform.stringToBytes(i3));
			}
		}
		if (instance.clone != null) {
			for (int k = 0; k < instance.cloneCount; k++) {
				String i4 = instance.clone[k];
				stream.writeByte(ProtoPlatform.intToByte(34));
				ProtocolParser.writeBytes(stream, ProtoPlatform.stringToBytes(i4));
			}
		}
		if (instance.shoot != null) {
			for (int k = 0; k < instance.shootCount; k++) {
				String i5 = instance.shoot[k];
				stream.writeByte(ProtoPlatform.intToByte(42));
				ProtocolParser.writeBytes(stream, ProtoPlatform.stringToBytes(i5));
			}
		}
		if (instance.shootEnd != null) {
			for (int k = 0; k < instance.shootEndCount; k++) {
				String i6 = instance.shootEnd[k];
				stream.writeByte(ProtoPlatform.intToByte(50));
				ProtocolParser.writeBytes(stream, ProtoPlatform.stringToBytes(i6));
			}
		}
		if (instance.reload != null) {
			for (int k = 0; k < instance.reloadCount; k++) {
				String i7 = instance.reload[k];
				stream.writeByte(ProtoPlatform.intToByte(58));
				ProtocolParser.writeBytes(stream, ProtoPlatform.stringToBytes(i7));
			}
		}
	}

	/**
	 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
	 */
	public static void serializeLengthDelimited(CitoStream stream, Packet_SoundSet instance)
	{
		byte[] data = Packet_SoundSetSerializer.serializeToBytes(instance);
		ProtocolParser.writeUInt32_(stream, ProtoPlatform.arrayLength(data));
		stream.write(data, 0, ProtoPlatform.arrayLength(data));
	}

	/**
	 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
	 */
	public static byte[] serializeToBytes(Packet_SoundSet instance)
	{
		CitoMemoryStream ms = new CitoMemoryStream();
		Packet_SoundSetSerializer.serialize(ms, instance);
		return ms.toArray();
	}
}
