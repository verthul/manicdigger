// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class Packet_PositionItemSerializer
{

	/**
	 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
	 */
	public static Packet_PositionItem deserialize(CitoStream stream, Packet_PositionItem instance)
	{
		while (true) {
			int keyByte = stream.readByte();
			if (keyByte == -1)
				break;
			switch (keyByte) {
			case 10:
				instance.key_ = ProtocolParser.readString(stream);
				continue;
			case 18:
				if (instance.value_ == null)
					instance.value_ = Packet_ItemSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ItemSerializer.deserializeLengthDelimited(stream, instance.value_);
				continue;
			case 24:
				instance.x = ProtocolParser.readUInt64(stream);
				continue;
			case 32:
				instance.y = ProtocolParser.readUInt64(stream);
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
	public static Packet_PositionItem deserializeBuffer(byte[] buffer, int length, Packet_PositionItem instance)
	{
		CitoMemoryStream ms = CitoMemoryStream.create(buffer, length);
		Packet_PositionItemSerializer.deserialize(ms, instance);
		return instance;
	}

	/**
	 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
	 */
	public static Packet_PositionItem deserializeLength(CitoStream stream, int length, Packet_PositionItem instance)
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
				instance.key_ = ProtocolParser.readString(stream);
				continue;
			case 18:
				if (instance.value_ == null)
					instance.value_ = Packet_ItemSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ItemSerializer.deserializeLengthDelimited(stream, instance.value_);
				continue;
			case 24:
				instance.x = ProtocolParser.readUInt64(stream);
				continue;
			case 32:
				instance.y = ProtocolParser.readUInt64(stream);
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
	public static Packet_PositionItem deserializeLengthDelimited(CitoStream stream, Packet_PositionItem instance)
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
				instance.key_ = ProtocolParser.readString(stream);
				continue;
			case 18:
				if (instance.value_ == null)
					instance.value_ = Packet_ItemSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ItemSerializer.deserializeLengthDelimited(stream, instance.value_);
				continue;
			case 24:
				instance.x = ProtocolParser.readUInt64(stream);
				continue;
			case 32:
				instance.y = ProtocolParser.readUInt64(stream);
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
	public static Packet_PositionItem deserializeLengthDelimitedNew(CitoStream stream)
	{
		Packet_PositionItem instance = new Packet_PositionItem();
		Packet_PositionItemSerializer.deserializeLengthDelimited(stream, instance);
		return instance;
	}

	/**
	 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
	 */
	public static void serialize(CitoStream stream, Packet_PositionItem instance)
	{
		if (instance.key_ != null) {
			stream.writeByte(ProtoPlatform.intToByte(10));
			ProtocolParser.writeBytes(stream, ProtoPlatform.stringToBytes(instance.key_));
		}
		if (instance.value_ != null) {
			stream.writeByte(ProtoPlatform.intToByte(18));
			CitoMemoryStream ms2 = new CitoMemoryStream();
			Packet_ItemSerializer.serialize(ms2, instance.value_);
			int ms2Length = ms2.length();
			ProtocolParser.writeUInt32_(stream, ms2Length);
			stream.write(ms2.getBuffer(), 0, ms2Length);
		}
		stream.writeByte(ProtoPlatform.intToByte(24));
		ProtocolParser.writeUInt64(stream, instance.x);
		stream.writeByte(ProtoPlatform.intToByte(32));
		ProtocolParser.writeUInt64(stream, instance.y);
	}

	/**
	 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
	 */
	public static void serializeLengthDelimited(CitoStream stream, Packet_PositionItem instance)
	{
		byte[] data = Packet_PositionItemSerializer.serializeToBytes(instance);
		ProtocolParser.writeUInt32_(stream, ProtoPlatform.arrayLength(data));
		stream.write(data, 0, ProtoPlatform.arrayLength(data));
	}

	/**
	 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
	 */
	public static byte[] serializeToBytes(Packet_PositionItem instance)
	{
		CitoMemoryStream ms = new CitoMemoryStream();
		Packet_PositionItemSerializer.serialize(ms, instance);
		return ms.toArray();
	}
}
