// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class Packet_DialogSerializer
{

	/**
	 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
	 */
	public static Packet_Dialog deserialize(CitoStream stream, Packet_Dialog instance)
	{
		if (instance.widgets == null) {
			instance.widgets = new Packet_Widget[1];
			instance.widgetsCount = 0;
			instance.widgetsLength = 1;
		}
		while (true) {
			int keyByte = stream.readByte();
			if (keyByte == -1)
				break;
			switch (keyByte) {
			case 10:
				instance.widgetsAdd(Packet_WidgetSerializer.deserializeLengthDelimitedNew(stream));
				continue;
			case 16:
				instance.width = ProtocolParser.readUInt64(stream);
				continue;
			case 24:
				instance.height_ = ProtocolParser.readUInt64(stream);
				continue;
			case 32:
				instance.isModal = ProtocolParser.readUInt64(stream);
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
	public static Packet_Dialog deserializeBuffer(byte[] buffer, int length, Packet_Dialog instance)
	{
		CitoMemoryStream ms = CitoMemoryStream.create(buffer, length);
		Packet_DialogSerializer.deserialize(ms, instance);
		return instance;
	}

	/**
	 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
	 */
	public static Packet_Dialog deserializeLength(CitoStream stream, int length, Packet_Dialog instance)
	{
		if (instance.widgets == null) {
			instance.widgets = new Packet_Widget[1];
			instance.widgetsCount = 0;
			instance.widgetsLength = 1;
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
				instance.widgetsAdd(Packet_WidgetSerializer.deserializeLengthDelimitedNew(stream));
				continue;
			case 16:
				instance.width = ProtocolParser.readUInt64(stream);
				continue;
			case 24:
				instance.height_ = ProtocolParser.readUInt64(stream);
				continue;
			case 32:
				instance.isModal = ProtocolParser.readUInt64(stream);
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
	public static Packet_Dialog deserializeLengthDelimited(CitoStream stream, Packet_Dialog instance)
	{
		if (instance.widgets == null) {
			instance.widgets = new Packet_Widget[1];
			instance.widgetsCount = 0;
			instance.widgetsLength = 1;
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
				instance.widgetsAdd(Packet_WidgetSerializer.deserializeLengthDelimitedNew(stream));
				continue;
			case 16:
				instance.width = ProtocolParser.readUInt64(stream);
				continue;
			case 24:
				instance.height_ = ProtocolParser.readUInt64(stream);
				continue;
			case 32:
				instance.isModal = ProtocolParser.readUInt64(stream);
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
	public static Packet_Dialog deserializeLengthDelimitedNew(CitoStream stream)
	{
		Packet_Dialog instance = new Packet_Dialog();
		Packet_DialogSerializer.deserializeLengthDelimited(stream, instance);
		return instance;
	}

	/**
	 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
	 */
	public static void serialize(CitoStream stream, Packet_Dialog instance)
	{
		if (instance.widgets != null) {
			for (int k = 0; k < instance.widgetsCount; k++) {
				Packet_Widget i1 = instance.widgets[k];
				stream.writeByte(ProtoPlatform.intToByte(10));
				CitoMemoryStream ms1 = new CitoMemoryStream();
				Packet_WidgetSerializer.serialize(ms1, i1);
				int ms1Length = ms1.length();
				ProtocolParser.writeUInt32_(stream, ms1Length);
				stream.write(ms1.getBuffer(), 0, ms1Length);
			}
		}
		stream.writeByte(ProtoPlatform.intToByte(16));
		ProtocolParser.writeUInt64(stream, instance.width);
		stream.writeByte(ProtoPlatform.intToByte(24));
		ProtocolParser.writeUInt64(stream, instance.height_);
		stream.writeByte(ProtoPlatform.intToByte(32));
		ProtocolParser.writeUInt64(stream, instance.isModal);
	}

	/**
	 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
	 */
	public static void serializeLengthDelimited(CitoStream stream, Packet_Dialog instance)
	{
		byte[] data = Packet_DialogSerializer.serializeToBytes(instance);
		ProtocolParser.writeUInt32_(stream, ProtoPlatform.arrayLength(data));
		stream.write(data, 0, ProtoPlatform.arrayLength(data));
	}

	/**
	 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
	 */
	public static byte[] serializeToBytes(Packet_Dialog instance)
	{
		CitoMemoryStream ms = new CitoMemoryStream();
		Packet_DialogSerializer.serialize(ms, instance);
		return ms.toArray();
	}
}
