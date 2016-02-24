// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class Packet_WidgetSerializer
{

	/**
	 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
	 */
	public static Packet_Widget deserialize(CitoStream stream, Packet_Widget instance)
	{
		instance.type = 0;
		while (true) {
			int keyByte = stream.readByte();
			if (keyByte == -1)
				break;
			switch (keyByte) {
			case 10:
				instance.id = ProtocolParser.readString(stream);
				continue;
			case 16:
				instance.click = ProtocolParser.readUInt64(stream);
				continue;
			case 24:
				instance.x = ProtocolParser.readUInt64(stream);
				continue;
			case 32:
				instance.y = ProtocolParser.readUInt64(stream);
				continue;
			case 40:
				instance.width = ProtocolParser.readUInt64(stream);
				continue;
			case 48:
				instance.height_ = ProtocolParser.readUInt64(stream);
				continue;
			case 58:
				instance.text = ProtocolParser.readString(stream);
				continue;
			case 64:
				instance.clickKey = ProtocolParser.readUInt64(stream);
				continue;
			case 74:
				instance.image = ProtocolParser.readString(stream);
				continue;
			case 80:
				instance.color = ProtocolParser.readUInt64(stream);
				continue;
			case 90:
				if (instance.font == null)
					instance.font = Packet_DialogFontSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_DialogFontSerializer.deserializeLengthDelimited(stream, instance.font);
				continue;
			case 96:
				instance.type = ProtocolParser.readUInt64(stream);
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
	public static Packet_Widget deserializeBuffer(byte[] buffer, int length, Packet_Widget instance)
	{
		CitoMemoryStream ms = CitoMemoryStream.create(buffer, length);
		Packet_WidgetSerializer.deserialize(ms, instance);
		return instance;
	}

	/**
	 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
	 */
	public static Packet_Widget deserializeLength(CitoStream stream, int length, Packet_Widget instance)
	{
		instance.type = 0;
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
				instance.id = ProtocolParser.readString(stream);
				continue;
			case 16:
				instance.click = ProtocolParser.readUInt64(stream);
				continue;
			case 24:
				instance.x = ProtocolParser.readUInt64(stream);
				continue;
			case 32:
				instance.y = ProtocolParser.readUInt64(stream);
				continue;
			case 40:
				instance.width = ProtocolParser.readUInt64(stream);
				continue;
			case 48:
				instance.height_ = ProtocolParser.readUInt64(stream);
				continue;
			case 58:
				instance.text = ProtocolParser.readString(stream);
				continue;
			case 64:
				instance.clickKey = ProtocolParser.readUInt64(stream);
				continue;
			case 74:
				instance.image = ProtocolParser.readString(stream);
				continue;
			case 80:
				instance.color = ProtocolParser.readUInt64(stream);
				continue;
			case 90:
				if (instance.font == null)
					instance.font = Packet_DialogFontSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_DialogFontSerializer.deserializeLengthDelimited(stream, instance.font);
				continue;
			case 96:
				instance.type = ProtocolParser.readUInt64(stream);
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
	public static Packet_Widget deserializeLengthDelimited(CitoStream stream, Packet_Widget instance)
	{
		instance.type = 0;
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
				instance.id = ProtocolParser.readString(stream);
				continue;
			case 16:
				instance.click = ProtocolParser.readUInt64(stream);
				continue;
			case 24:
				instance.x = ProtocolParser.readUInt64(stream);
				continue;
			case 32:
				instance.y = ProtocolParser.readUInt64(stream);
				continue;
			case 40:
				instance.width = ProtocolParser.readUInt64(stream);
				continue;
			case 48:
				instance.height_ = ProtocolParser.readUInt64(stream);
				continue;
			case 58:
				instance.text = ProtocolParser.readString(stream);
				continue;
			case 64:
				instance.clickKey = ProtocolParser.readUInt64(stream);
				continue;
			case 74:
				instance.image = ProtocolParser.readString(stream);
				continue;
			case 80:
				instance.color = ProtocolParser.readUInt64(stream);
				continue;
			case 90:
				if (instance.font == null)
					instance.font = Packet_DialogFontSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_DialogFontSerializer.deserializeLengthDelimited(stream, instance.font);
				continue;
			case 96:
				instance.type = ProtocolParser.readUInt64(stream);
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
	public static Packet_Widget deserializeLengthDelimitedNew(CitoStream stream)
	{
		Packet_Widget instance = new Packet_Widget();
		Packet_WidgetSerializer.deserializeLengthDelimited(stream, instance);
		return instance;
	}

	/**
	 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
	 */
	public static void serialize(CitoStream stream, Packet_Widget instance)
	{
		if (instance.id != null) {
			stream.writeByte(ProtoPlatform.intToByte(10));
			ProtocolParser.writeBytes(stream, ProtoPlatform.stringToBytes(instance.id));
		}
		stream.writeByte(ProtoPlatform.intToByte(16));
		ProtocolParser.writeUInt64(stream, instance.click);
		stream.writeByte(ProtoPlatform.intToByte(24));
		ProtocolParser.writeUInt64(stream, instance.x);
		stream.writeByte(ProtoPlatform.intToByte(32));
		ProtocolParser.writeUInt64(stream, instance.y);
		stream.writeByte(ProtoPlatform.intToByte(40));
		ProtocolParser.writeUInt64(stream, instance.width);
		stream.writeByte(ProtoPlatform.intToByte(48));
		ProtocolParser.writeUInt64(stream, instance.height_);
		if (instance.text != null) {
			stream.writeByte(ProtoPlatform.intToByte(58));
			ProtocolParser.writeBytes(stream, ProtoPlatform.stringToBytes(instance.text));
		}
		stream.writeByte(ProtoPlatform.intToByte(64));
		ProtocolParser.writeUInt64(stream, instance.clickKey);
		if (instance.image != null) {
			stream.writeByte(ProtoPlatform.intToByte(74));
			ProtocolParser.writeBytes(stream, ProtoPlatform.stringToBytes(instance.image));
		}
		stream.writeByte(ProtoPlatform.intToByte(80));
		ProtocolParser.writeUInt64(stream, instance.color);
		if (instance.font != null) {
			stream.writeByte(ProtoPlatform.intToByte(90));
			CitoMemoryStream ms11 = new CitoMemoryStream();
			Packet_DialogFontSerializer.serialize(ms11, instance.font);
			int ms11Length = ms11.length();
			ProtocolParser.writeUInt32_(stream, ms11Length);
			stream.write(ms11.getBuffer(), 0, ms11Length);
		}
		if (instance.type != 0) {
			stream.writeByte(ProtoPlatform.intToByte(96));
			ProtocolParser.writeUInt64(stream, instance.type);
		}
	}

	/**
	 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
	 */
	public static void serializeLengthDelimited(CitoStream stream, Packet_Widget instance)
	{
		byte[] data = Packet_WidgetSerializer.serializeToBytes(instance);
		ProtocolParser.writeUInt32_(stream, ProtoPlatform.arrayLength(data));
		stream.write(data, 0, ProtoPlatform.arrayLength(data));
	}

	/**
	 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
	 */
	public static byte[] serializeToBytes(Packet_Widget instance)
	{
		CitoMemoryStream ms = new CitoMemoryStream();
		Packet_WidgetSerializer.serialize(ms, instance);
		return ms.toArray();
	}
}
