// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class Packet_ClientDialogClickSerializer
{

	/**
	 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
	 */
	public static Packet_ClientDialogClick deserialize(CitoStream stream, Packet_ClientDialogClick instance)
	{
		if (instance.textBoxValue == null) {
			instance.textBoxValue = new String[1];
			instance.textBoxValueCount = 0;
			instance.textBoxValueLength = 1;
		}
		while (true) {
			int keyByte = stream.readByte();
			if (keyByte == -1)
				break;
			switch (keyByte) {
			case 10:
				instance.widgetId = ProtocolParser.readString(stream);
				continue;
			case 26:
				instance.textBoxValueAdd(ProtocolParser.readString(stream));
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
	public static Packet_ClientDialogClick deserializeBuffer(byte[] buffer, int length, Packet_ClientDialogClick instance)
	{
		CitoMemoryStream ms = CitoMemoryStream.create(buffer, length);
		Packet_ClientDialogClickSerializer.deserialize(ms, instance);
		return instance;
	}

	/**
	 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
	 */
	public static Packet_ClientDialogClick deserializeLength(CitoStream stream, int length, Packet_ClientDialogClick instance)
	{
		if (instance.textBoxValue == null) {
			instance.textBoxValue = new String[1];
			instance.textBoxValueCount = 0;
			instance.textBoxValueLength = 1;
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
				instance.widgetId = ProtocolParser.readString(stream);
				continue;
			case 26:
				instance.textBoxValueAdd(ProtocolParser.readString(stream));
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
	public static Packet_ClientDialogClick deserializeLengthDelimited(CitoStream stream, Packet_ClientDialogClick instance)
	{
		if (instance.textBoxValue == null) {
			instance.textBoxValue = new String[1];
			instance.textBoxValueCount = 0;
			instance.textBoxValueLength = 1;
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
				instance.widgetId = ProtocolParser.readString(stream);
				continue;
			case 26:
				instance.textBoxValueAdd(ProtocolParser.readString(stream));
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
	public static Packet_ClientDialogClick deserializeLengthDelimitedNew(CitoStream stream)
	{
		Packet_ClientDialogClick instance = new Packet_ClientDialogClick();
		Packet_ClientDialogClickSerializer.deserializeLengthDelimited(stream, instance);
		return instance;
	}

	/**
	 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
	 */
	public static void serialize(CitoStream stream, Packet_ClientDialogClick instance)
	{
		if (instance.widgetId != null) {
			stream.writeByte(ProtoPlatform.intToByte(10));
			ProtocolParser.writeBytes(stream, ProtoPlatform.stringToBytes(instance.widgetId));
		}
		if (instance.textBoxValue != null) {
			for (int k = 0; k < instance.textBoxValueCount; k++) {
				String i3 = instance.textBoxValue[k];
				stream.writeByte(ProtoPlatform.intToByte(26));
				ProtocolParser.writeBytes(stream, ProtoPlatform.stringToBytes(i3));
			}
		}
	}

	/**
	 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
	 */
	public static void serializeLengthDelimited(CitoStream stream, Packet_ClientDialogClick instance)
	{
		byte[] data = Packet_ClientDialogClickSerializer.serializeToBytes(instance);
		ProtocolParser.writeUInt32_(stream, ProtoPlatform.arrayLength(data));
		stream.write(data, 0, ProtoPlatform.arrayLength(data));
	}

	/**
	 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
	 */
	public static byte[] serializeToBytes(Packet_ClientDialogClick instance)
	{
		CitoMemoryStream ms = new CitoMemoryStream();
		Packet_ClientDialogClickSerializer.serialize(ms, instance);
		return ms.toArray();
	}
}
