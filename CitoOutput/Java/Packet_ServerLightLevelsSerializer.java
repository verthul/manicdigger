// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class Packet_ServerLightLevelsSerializer
{

	/**
	 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
	 */
	public static Packet_ServerLightLevels deserialize(CitoStream stream, Packet_ServerLightLevels instance)
	{
		if (instance.lightlevels == null) {
			instance.lightlevels = new int[1];
			instance.lightlevelsCount = 0;
			instance.lightlevelsLength = 1;
		}
		while (true) {
			int keyByte = stream.readByte();
			if (keyByte == -1)
				break;
			switch (keyByte) {
			case 8:
				instance.lightlevelsAdd(ProtocolParser.readUInt64(stream));
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
	public static Packet_ServerLightLevels deserializeBuffer(byte[] buffer, int length, Packet_ServerLightLevels instance)
	{
		CitoMemoryStream ms = CitoMemoryStream.create(buffer, length);
		Packet_ServerLightLevelsSerializer.deserialize(ms, instance);
		return instance;
	}

	/**
	 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
	 */
	public static Packet_ServerLightLevels deserializeLength(CitoStream stream, int length, Packet_ServerLightLevels instance)
	{
		if (instance.lightlevels == null) {
			instance.lightlevels = new int[1];
			instance.lightlevelsCount = 0;
			instance.lightlevelsLength = 1;
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
			case 8:
				instance.lightlevelsAdd(ProtocolParser.readUInt64(stream));
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
	public static Packet_ServerLightLevels deserializeLengthDelimited(CitoStream stream, Packet_ServerLightLevels instance)
	{
		if (instance.lightlevels == null) {
			instance.lightlevels = new int[1];
			instance.lightlevelsCount = 0;
			instance.lightlevelsLength = 1;
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
			case 8:
				instance.lightlevelsAdd(ProtocolParser.readUInt64(stream));
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
	public static Packet_ServerLightLevels deserializeLengthDelimitedNew(CitoStream stream)
	{
		Packet_ServerLightLevels instance = new Packet_ServerLightLevels();
		Packet_ServerLightLevelsSerializer.deserializeLengthDelimited(stream, instance);
		return instance;
	}

	/**
	 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
	 */
	public static void serialize(CitoStream stream, Packet_ServerLightLevels instance)
	{
		if (instance.lightlevels != null) {
			for (int k = 0; k < instance.lightlevelsCount; k++) {
				int i1 = instance.lightlevels[k];
				stream.writeByte(ProtoPlatform.intToByte(8));
				ProtocolParser.writeUInt64(stream, i1);
			}
		}
	}

	/**
	 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
	 */
	public static void serializeLengthDelimited(CitoStream stream, Packet_ServerLightLevels instance)
	{
		byte[] data = Packet_ServerLightLevelsSerializer.serializeToBytes(instance);
		ProtocolParser.writeUInt32_(stream, ProtoPlatform.arrayLength(data));
		stream.write(data, 0, ProtoPlatform.arrayLength(data));
	}

	/**
	 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
	 */
	public static byte[] serializeToBytes(Packet_ServerLightLevels instance)
	{
		CitoMemoryStream ms = new CitoMemoryStream();
		Packet_ServerLightLevelsSerializer.serialize(ms, instance);
		return ms.toArray();
	}
}
