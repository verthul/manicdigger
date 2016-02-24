// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class Packet_ServerIdentificationSerializer
{

	/**
	 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
	 */
	public static Packet_ServerIdentification deserialize(CitoStream stream, Packet_ServerIdentification instance)
	{
		while (true) {
			int keyByte = stream.readByte();
			if (keyByte == -1)
				break;
			switch (keyByte) {
			case 10:
				instance.mdProtocolVersion = ProtocolParser.readString(stream);
				continue;
			case 16:
				instance.assignedClientId = ProtocolParser.readUInt64(stream);
				continue;
			case 26:
				instance.serverName = ProtocolParser.readString(stream);
				continue;
			case 34:
				instance.serverMotd = ProtocolParser.readString(stream);
				continue;
			case 56:
				instance.mapSizeX = ProtocolParser.readUInt64(stream);
				continue;
			case 64:
				instance.mapSizeY = ProtocolParser.readUInt64(stream);
				continue;
			case 72:
				instance.mapSizeZ = ProtocolParser.readUInt64(stream);
				continue;
			case 88:
				instance.disableShadows = ProtocolParser.readUInt64(stream);
				continue;
			case 96:
				instance.playerAreaSize = ProtocolParser.readUInt64(stream);
				continue;
			case 104:
				instance.renderHint_ = ProtocolParser.readUInt64(stream);
				continue;
			case 114:
				if (instance.requiredBlobMd5 == null)
					instance.requiredBlobMd5 = Packet_StringListSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_StringListSerializer.deserializeLengthDelimited(stream, instance.requiredBlobMd5);
				continue;
			case 122:
				if (instance.requiredBlobName == null)
					instance.requiredBlobName = Packet_StringListSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_StringListSerializer.deserializeLengthDelimited(stream, instance.requiredBlobName);
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
	public static Packet_ServerIdentification deserializeBuffer(byte[] buffer, int length, Packet_ServerIdentification instance)
	{
		CitoMemoryStream ms = CitoMemoryStream.create(buffer, length);
		Packet_ServerIdentificationSerializer.deserialize(ms, instance);
		return instance;
	}

	/**
	 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
	 */
	public static Packet_ServerIdentification deserializeLength(CitoStream stream, int length, Packet_ServerIdentification instance)
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
				instance.mdProtocolVersion = ProtocolParser.readString(stream);
				continue;
			case 16:
				instance.assignedClientId = ProtocolParser.readUInt64(stream);
				continue;
			case 26:
				instance.serverName = ProtocolParser.readString(stream);
				continue;
			case 34:
				instance.serverMotd = ProtocolParser.readString(stream);
				continue;
			case 56:
				instance.mapSizeX = ProtocolParser.readUInt64(stream);
				continue;
			case 64:
				instance.mapSizeY = ProtocolParser.readUInt64(stream);
				continue;
			case 72:
				instance.mapSizeZ = ProtocolParser.readUInt64(stream);
				continue;
			case 88:
				instance.disableShadows = ProtocolParser.readUInt64(stream);
				continue;
			case 96:
				instance.playerAreaSize = ProtocolParser.readUInt64(stream);
				continue;
			case 104:
				instance.renderHint_ = ProtocolParser.readUInt64(stream);
				continue;
			case 114:
				if (instance.requiredBlobMd5 == null)
					instance.requiredBlobMd5 = Packet_StringListSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_StringListSerializer.deserializeLengthDelimited(stream, instance.requiredBlobMd5);
				continue;
			case 122:
				if (instance.requiredBlobName == null)
					instance.requiredBlobName = Packet_StringListSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_StringListSerializer.deserializeLengthDelimited(stream, instance.requiredBlobName);
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
	public static Packet_ServerIdentification deserializeLengthDelimited(CitoStream stream, Packet_ServerIdentification instance)
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
				instance.mdProtocolVersion = ProtocolParser.readString(stream);
				continue;
			case 16:
				instance.assignedClientId = ProtocolParser.readUInt64(stream);
				continue;
			case 26:
				instance.serverName = ProtocolParser.readString(stream);
				continue;
			case 34:
				instance.serverMotd = ProtocolParser.readString(stream);
				continue;
			case 56:
				instance.mapSizeX = ProtocolParser.readUInt64(stream);
				continue;
			case 64:
				instance.mapSizeY = ProtocolParser.readUInt64(stream);
				continue;
			case 72:
				instance.mapSizeZ = ProtocolParser.readUInt64(stream);
				continue;
			case 88:
				instance.disableShadows = ProtocolParser.readUInt64(stream);
				continue;
			case 96:
				instance.playerAreaSize = ProtocolParser.readUInt64(stream);
				continue;
			case 104:
				instance.renderHint_ = ProtocolParser.readUInt64(stream);
				continue;
			case 114:
				if (instance.requiredBlobMd5 == null)
					instance.requiredBlobMd5 = Packet_StringListSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_StringListSerializer.deserializeLengthDelimited(stream, instance.requiredBlobMd5);
				continue;
			case 122:
				if (instance.requiredBlobName == null)
					instance.requiredBlobName = Packet_StringListSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_StringListSerializer.deserializeLengthDelimited(stream, instance.requiredBlobName);
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
	public static Packet_ServerIdentification deserializeLengthDelimitedNew(CitoStream stream)
	{
		Packet_ServerIdentification instance = new Packet_ServerIdentification();
		Packet_ServerIdentificationSerializer.deserializeLengthDelimited(stream, instance);
		return instance;
	}

	/**
	 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
	 */
	public static void serialize(CitoStream stream, Packet_ServerIdentification instance)
	{
		if (instance.mdProtocolVersion != null) {
			stream.writeByte(ProtoPlatform.intToByte(10));
			ProtocolParser.writeBytes(stream, ProtoPlatform.stringToBytes(instance.mdProtocolVersion));
		}
		stream.writeByte(ProtoPlatform.intToByte(16));
		ProtocolParser.writeUInt64(stream, instance.assignedClientId);
		if (instance.serverName != null) {
			stream.writeByte(ProtoPlatform.intToByte(26));
			ProtocolParser.writeBytes(stream, ProtoPlatform.stringToBytes(instance.serverName));
		}
		if (instance.serverMotd != null) {
			stream.writeByte(ProtoPlatform.intToByte(34));
			ProtocolParser.writeBytes(stream, ProtoPlatform.stringToBytes(instance.serverMotd));
		}
		stream.writeByte(ProtoPlatform.intToByte(56));
		ProtocolParser.writeUInt64(stream, instance.mapSizeX);
		stream.writeByte(ProtoPlatform.intToByte(64));
		ProtocolParser.writeUInt64(stream, instance.mapSizeY);
		stream.writeByte(ProtoPlatform.intToByte(72));
		ProtocolParser.writeUInt64(stream, instance.mapSizeZ);
		stream.writeByte(ProtoPlatform.intToByte(88));
		ProtocolParser.writeUInt64(stream, instance.disableShadows);
		stream.writeByte(ProtoPlatform.intToByte(96));
		ProtocolParser.writeUInt64(stream, instance.playerAreaSize);
		stream.writeByte(ProtoPlatform.intToByte(104));
		ProtocolParser.writeUInt64(stream, instance.renderHint_);
		if (instance.requiredBlobMd5 != null) {
			stream.writeByte(ProtoPlatform.intToByte(114));
			CitoMemoryStream ms14 = new CitoMemoryStream();
			Packet_StringListSerializer.serialize(ms14, instance.requiredBlobMd5);
			int ms14Length = ms14.length();
			ProtocolParser.writeUInt32_(stream, ms14Length);
			stream.write(ms14.getBuffer(), 0, ms14Length);
		}
		if (instance.requiredBlobName != null) {
			stream.writeByte(ProtoPlatform.intToByte(122));
			CitoMemoryStream ms15 = new CitoMemoryStream();
			Packet_StringListSerializer.serialize(ms15, instance.requiredBlobName);
			int ms15Length = ms15.length();
			ProtocolParser.writeUInt32_(stream, ms15Length);
			stream.write(ms15.getBuffer(), 0, ms15Length);
		}
	}

	/**
	 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
	 */
	public static void serializeLengthDelimited(CitoStream stream, Packet_ServerIdentification instance)
	{
		byte[] data = Packet_ServerIdentificationSerializer.serializeToBytes(instance);
		ProtocolParser.writeUInt32_(stream, ProtoPlatform.arrayLength(data));
		stream.write(data, 0, ProtoPlatform.arrayLength(data));
	}

	/**
	 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
	 */
	public static byte[] serializeToBytes(Packet_ServerIdentification instance)
	{
		CitoMemoryStream ms = new CitoMemoryStream();
		Packet_ServerIdentificationSerializer.serialize(ms, instance);
		return ms.toArray();
	}
}
