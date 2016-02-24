// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class Packet_ServerEntityDrawTextSerializer
{

	/**
	 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
	 */
	public static Packet_ServerEntityDrawText deserialize(CitoStream stream, Packet_ServerEntityDrawText instance)
	{
		while (true) {
			int keyByte = stream.readByte();
			if (keyByte == -1)
				break;
			switch (keyByte) {
			case 10:
				instance.text = ProtocolParser.readString(stream);
				continue;
			case 16:
				instance.dx = ProtocolParser.readUInt64(stream);
				continue;
			case 24:
				instance.dy = ProtocolParser.readUInt64(stream);
				continue;
			case 32:
				instance.dz = ProtocolParser.readUInt64(stream);
				continue;
			case 40:
				instance.rotx = ProtocolParser.readUInt64(stream);
				continue;
			case 48:
				instance.roty = ProtocolParser.readUInt64(stream);
				continue;
			case 56:
				instance.rotz = ProtocolParser.readUInt64(stream);
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
	public static Packet_ServerEntityDrawText deserializeBuffer(byte[] buffer, int length, Packet_ServerEntityDrawText instance)
	{
		CitoMemoryStream ms = CitoMemoryStream.create(buffer, length);
		Packet_ServerEntityDrawTextSerializer.deserialize(ms, instance);
		return instance;
	}

	/**
	 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
	 */
	public static Packet_ServerEntityDrawText deserializeLength(CitoStream stream, int length, Packet_ServerEntityDrawText instance)
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
				instance.text = ProtocolParser.readString(stream);
				continue;
			case 16:
				instance.dx = ProtocolParser.readUInt64(stream);
				continue;
			case 24:
				instance.dy = ProtocolParser.readUInt64(stream);
				continue;
			case 32:
				instance.dz = ProtocolParser.readUInt64(stream);
				continue;
			case 40:
				instance.rotx = ProtocolParser.readUInt64(stream);
				continue;
			case 48:
				instance.roty = ProtocolParser.readUInt64(stream);
				continue;
			case 56:
				instance.rotz = ProtocolParser.readUInt64(stream);
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
	public static Packet_ServerEntityDrawText deserializeLengthDelimited(CitoStream stream, Packet_ServerEntityDrawText instance)
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
				instance.text = ProtocolParser.readString(stream);
				continue;
			case 16:
				instance.dx = ProtocolParser.readUInt64(stream);
				continue;
			case 24:
				instance.dy = ProtocolParser.readUInt64(stream);
				continue;
			case 32:
				instance.dz = ProtocolParser.readUInt64(stream);
				continue;
			case 40:
				instance.rotx = ProtocolParser.readUInt64(stream);
				continue;
			case 48:
				instance.roty = ProtocolParser.readUInt64(stream);
				continue;
			case 56:
				instance.rotz = ProtocolParser.readUInt64(stream);
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
	public static Packet_ServerEntityDrawText deserializeLengthDelimitedNew(CitoStream stream)
	{
		Packet_ServerEntityDrawText instance = new Packet_ServerEntityDrawText();
		Packet_ServerEntityDrawTextSerializer.deserializeLengthDelimited(stream, instance);
		return instance;
	}

	/**
	 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
	 */
	public static void serialize(CitoStream stream, Packet_ServerEntityDrawText instance)
	{
		if (instance.text != null) {
			stream.writeByte(ProtoPlatform.intToByte(10));
			ProtocolParser.writeBytes(stream, ProtoPlatform.stringToBytes(instance.text));
		}
		stream.writeByte(ProtoPlatform.intToByte(16));
		ProtocolParser.writeUInt64(stream, instance.dx);
		stream.writeByte(ProtoPlatform.intToByte(24));
		ProtocolParser.writeUInt64(stream, instance.dy);
		stream.writeByte(ProtoPlatform.intToByte(32));
		ProtocolParser.writeUInt64(stream, instance.dz);
		stream.writeByte(ProtoPlatform.intToByte(40));
		ProtocolParser.writeUInt64(stream, instance.rotx);
		stream.writeByte(ProtoPlatform.intToByte(48));
		ProtocolParser.writeUInt64(stream, instance.roty);
		stream.writeByte(ProtoPlatform.intToByte(56));
		ProtocolParser.writeUInt64(stream, instance.rotz);
	}

	/**
	 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
	 */
	public static void serializeLengthDelimited(CitoStream stream, Packet_ServerEntityDrawText instance)
	{
		byte[] data = Packet_ServerEntityDrawTextSerializer.serializeToBytes(instance);
		ProtocolParser.writeUInt32_(stream, ProtoPlatform.arrayLength(data));
		stream.write(data, 0, ProtoPlatform.arrayLength(data));
	}

	/**
	 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
	 */
	public static byte[] serializeToBytes(Packet_ServerEntityDrawText instance)
	{
		CitoMemoryStream ms = new CitoMemoryStream();
		Packet_ServerEntityDrawTextSerializer.serialize(ms, instance);
		return ms.toArray();
	}
}
