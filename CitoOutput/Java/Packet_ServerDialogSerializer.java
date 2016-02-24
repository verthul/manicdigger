// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class Packet_ServerDialogSerializer
{

	/**
	 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
	 */
	public static Packet_ServerDialog deserialize(CitoStream stream, Packet_ServerDialog instance)
	{
		while (true) {
			int keyByte = stream.readByte();
			if (keyByte == -1)
				break;
			switch (keyByte) {
			case 10:
				instance.dialogId = ProtocolParser.readString(stream);
				continue;
			case 18:
				if (instance.dialog == null)
					instance.dialog = Packet_DialogSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_DialogSerializer.deserializeLengthDelimited(stream, instance.dialog);
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
	public static Packet_ServerDialog deserializeBuffer(byte[] buffer, int length, Packet_ServerDialog instance)
	{
		CitoMemoryStream ms = CitoMemoryStream.create(buffer, length);
		Packet_ServerDialogSerializer.deserialize(ms, instance);
		return instance;
	}

	/**
	 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
	 */
	public static Packet_ServerDialog deserializeLength(CitoStream stream, int length, Packet_ServerDialog instance)
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
				instance.dialogId = ProtocolParser.readString(stream);
				continue;
			case 18:
				if (instance.dialog == null)
					instance.dialog = Packet_DialogSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_DialogSerializer.deserializeLengthDelimited(stream, instance.dialog);
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
	public static Packet_ServerDialog deserializeLengthDelimited(CitoStream stream, Packet_ServerDialog instance)
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
				instance.dialogId = ProtocolParser.readString(stream);
				continue;
			case 18:
				if (instance.dialog == null)
					instance.dialog = Packet_DialogSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_DialogSerializer.deserializeLengthDelimited(stream, instance.dialog);
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
	public static Packet_ServerDialog deserializeLengthDelimitedNew(CitoStream stream)
	{
		Packet_ServerDialog instance = new Packet_ServerDialog();
		Packet_ServerDialogSerializer.deserializeLengthDelimited(stream, instance);
		return instance;
	}

	/**
	 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
	 */
	public static void serialize(CitoStream stream, Packet_ServerDialog instance)
	{
		if (instance.dialogId != null) {
			stream.writeByte(ProtoPlatform.intToByte(10));
			ProtocolParser.writeBytes(stream, ProtoPlatform.stringToBytes(instance.dialogId));
		}
		if (instance.dialog != null) {
			stream.writeByte(ProtoPlatform.intToByte(18));
			CitoMemoryStream ms2 = new CitoMemoryStream();
			Packet_DialogSerializer.serialize(ms2, instance.dialog);
			int ms2Length = ms2.length();
			ProtocolParser.writeUInt32_(stream, ms2Length);
			stream.write(ms2.getBuffer(), 0, ms2Length);
		}
	}

	/**
	 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
	 */
	public static void serializeLengthDelimited(CitoStream stream, Packet_ServerDialog instance)
	{
		byte[] data = Packet_ServerDialogSerializer.serializeToBytes(instance);
		ProtocolParser.writeUInt32_(stream, ProtoPlatform.arrayLength(data));
		stream.write(data, 0, ProtoPlatform.arrayLength(data));
	}

	/**
	 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
	 */
	public static byte[] serializeToBytes(Packet_ServerDialog instance)
	{
		CitoMemoryStream ms = new CitoMemoryStream();
		Packet_ServerDialogSerializer.serialize(ms, instance);
		return ms.toArray();
	}
}
