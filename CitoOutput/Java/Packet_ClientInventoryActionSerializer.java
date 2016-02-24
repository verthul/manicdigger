// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class Packet_ClientInventoryActionSerializer
{

	/**
	 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
	 */
	public static Packet_ClientInventoryAction deserialize(CitoStream stream, Packet_ClientInventoryAction instance)
	{
		instance.action = 0;
		while (true) {
			int keyByte = stream.readByte();
			if (keyByte == -1)
				break;
			switch (keyByte) {
			case 8:
				instance.action = ProtocolParser.readUInt64(stream);
				continue;
			case 18:
				if (instance.a == null)
					instance.a = Packet_InventoryPositionSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_InventoryPositionSerializer.deserializeLengthDelimited(stream, instance.a);
				continue;
			case 26:
				if (instance.b == null)
					instance.b = Packet_InventoryPositionSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_InventoryPositionSerializer.deserializeLengthDelimited(stream, instance.b);
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
	public static Packet_ClientInventoryAction deserializeBuffer(byte[] buffer, int length, Packet_ClientInventoryAction instance)
	{
		CitoMemoryStream ms = CitoMemoryStream.create(buffer, length);
		Packet_ClientInventoryActionSerializer.deserialize(ms, instance);
		return instance;
	}

	/**
	 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
	 */
	public static Packet_ClientInventoryAction deserializeLength(CitoStream stream, int length, Packet_ClientInventoryAction instance)
	{
		instance.action = 0;
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
				instance.action = ProtocolParser.readUInt64(stream);
				continue;
			case 18:
				if (instance.a == null)
					instance.a = Packet_InventoryPositionSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_InventoryPositionSerializer.deserializeLengthDelimited(stream, instance.a);
				continue;
			case 26:
				if (instance.b == null)
					instance.b = Packet_InventoryPositionSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_InventoryPositionSerializer.deserializeLengthDelimited(stream, instance.b);
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
	public static Packet_ClientInventoryAction deserializeLengthDelimited(CitoStream stream, Packet_ClientInventoryAction instance)
	{
		instance.action = 0;
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
				instance.action = ProtocolParser.readUInt64(stream);
				continue;
			case 18:
				if (instance.a == null)
					instance.a = Packet_InventoryPositionSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_InventoryPositionSerializer.deserializeLengthDelimited(stream, instance.a);
				continue;
			case 26:
				if (instance.b == null)
					instance.b = Packet_InventoryPositionSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_InventoryPositionSerializer.deserializeLengthDelimited(stream, instance.b);
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
	public static Packet_ClientInventoryAction deserializeLengthDelimitedNew(CitoStream stream)
	{
		Packet_ClientInventoryAction instance = new Packet_ClientInventoryAction();
		Packet_ClientInventoryActionSerializer.deserializeLengthDelimited(stream, instance);
		return instance;
	}

	/**
	 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
	 */
	public static void serialize(CitoStream stream, Packet_ClientInventoryAction instance)
	{
		if (instance.action != 0) {
			stream.writeByte(ProtoPlatform.intToByte(8));
			ProtocolParser.writeUInt64(stream, instance.action);
		}
		if (instance.a != null) {
			stream.writeByte(ProtoPlatform.intToByte(18));
			CitoMemoryStream ms2 = new CitoMemoryStream();
			Packet_InventoryPositionSerializer.serialize(ms2, instance.a);
			int ms2Length = ms2.length();
			ProtocolParser.writeUInt32_(stream, ms2Length);
			stream.write(ms2.getBuffer(), 0, ms2Length);
		}
		if (instance.b != null) {
			stream.writeByte(ProtoPlatform.intToByte(26));
			CitoMemoryStream ms3 = new CitoMemoryStream();
			Packet_InventoryPositionSerializer.serialize(ms3, instance.b);
			int ms3Length = ms3.length();
			ProtocolParser.writeUInt32_(stream, ms3Length);
			stream.write(ms3.getBuffer(), 0, ms3Length);
		}
	}

	/**
	 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
	 */
	public static void serializeLengthDelimited(CitoStream stream, Packet_ClientInventoryAction instance)
	{
		byte[] data = Packet_ClientInventoryActionSerializer.serializeToBytes(instance);
		ProtocolParser.writeUInt32_(stream, ProtoPlatform.arrayLength(data));
		stream.write(data, 0, ProtoPlatform.arrayLength(data));
	}

	/**
	 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
	 */
	public static byte[] serializeToBytes(Packet_ClientInventoryAction instance)
	{
		CitoMemoryStream ms = new CitoMemoryStream();
		Packet_ClientInventoryActionSerializer.serialize(ms, instance);
		return ms.toArray();
	}
}
