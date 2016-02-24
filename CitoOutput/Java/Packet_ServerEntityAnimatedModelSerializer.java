// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class Packet_ServerEntityAnimatedModelSerializer
{

	/**
	 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
	 */
	public static Packet_ServerEntityAnimatedModel deserialize(CitoStream stream, Packet_ServerEntityAnimatedModel instance)
	{
		while (true) {
			int keyByte = stream.readByte();
			if (keyByte == -1)
				break;
			switch (keyByte) {
			case 10:
				instance.model_ = ProtocolParser.readString(stream);
				continue;
			case 18:
				instance.texture_ = ProtocolParser.readString(stream);
				continue;
			case 24:
				instance.eyeHeight = ProtocolParser.readUInt64(stream);
				continue;
			case 32:
				instance.modelHeight = ProtocolParser.readUInt64(stream);
				continue;
			case 40:
				instance.downloadSkin = ProtocolParser.readUInt64(stream);
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
	public static Packet_ServerEntityAnimatedModel deserializeBuffer(byte[] buffer, int length, Packet_ServerEntityAnimatedModel instance)
	{
		CitoMemoryStream ms = CitoMemoryStream.create(buffer, length);
		Packet_ServerEntityAnimatedModelSerializer.deserialize(ms, instance);
		return instance;
	}

	/**
	 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
	 */
	public static Packet_ServerEntityAnimatedModel deserializeLength(CitoStream stream, int length, Packet_ServerEntityAnimatedModel instance)
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
				instance.model_ = ProtocolParser.readString(stream);
				continue;
			case 18:
				instance.texture_ = ProtocolParser.readString(stream);
				continue;
			case 24:
				instance.eyeHeight = ProtocolParser.readUInt64(stream);
				continue;
			case 32:
				instance.modelHeight = ProtocolParser.readUInt64(stream);
				continue;
			case 40:
				instance.downloadSkin = ProtocolParser.readUInt64(stream);
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
	public static Packet_ServerEntityAnimatedModel deserializeLengthDelimited(CitoStream stream, Packet_ServerEntityAnimatedModel instance)
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
				instance.model_ = ProtocolParser.readString(stream);
				continue;
			case 18:
				instance.texture_ = ProtocolParser.readString(stream);
				continue;
			case 24:
				instance.eyeHeight = ProtocolParser.readUInt64(stream);
				continue;
			case 32:
				instance.modelHeight = ProtocolParser.readUInt64(stream);
				continue;
			case 40:
				instance.downloadSkin = ProtocolParser.readUInt64(stream);
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
	public static Packet_ServerEntityAnimatedModel deserializeLengthDelimitedNew(CitoStream stream)
	{
		Packet_ServerEntityAnimatedModel instance = new Packet_ServerEntityAnimatedModel();
		Packet_ServerEntityAnimatedModelSerializer.deserializeLengthDelimited(stream, instance);
		return instance;
	}

	/**
	 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
	 */
	public static void serialize(CitoStream stream, Packet_ServerEntityAnimatedModel instance)
	{
		if (instance.model_ != null) {
			stream.writeByte(ProtoPlatform.intToByte(10));
			ProtocolParser.writeBytes(stream, ProtoPlatform.stringToBytes(instance.model_));
		}
		if (instance.texture_ != null) {
			stream.writeByte(ProtoPlatform.intToByte(18));
			ProtocolParser.writeBytes(stream, ProtoPlatform.stringToBytes(instance.texture_));
		}
		stream.writeByte(ProtoPlatform.intToByte(24));
		ProtocolParser.writeUInt64(stream, instance.eyeHeight);
		stream.writeByte(ProtoPlatform.intToByte(32));
		ProtocolParser.writeUInt64(stream, instance.modelHeight);
		stream.writeByte(ProtoPlatform.intToByte(40));
		ProtocolParser.writeUInt64(stream, instance.downloadSkin);
	}

	/**
	 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
	 */
	public static void serializeLengthDelimited(CitoStream stream, Packet_ServerEntityAnimatedModel instance)
	{
		byte[] data = Packet_ServerEntityAnimatedModelSerializer.serializeToBytes(instance);
		ProtocolParser.writeUInt32_(stream, ProtoPlatform.arrayLength(data));
		stream.write(data, 0, ProtoPlatform.arrayLength(data));
	}

	/**
	 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
	 */
	public static byte[] serializeToBytes(Packet_ServerEntityAnimatedModel instance)
	{
		CitoMemoryStream ms = new CitoMemoryStream();
		Packet_ServerEntityAnimatedModelSerializer.serialize(ms, instance);
		return ms.toArray();
	}
}
