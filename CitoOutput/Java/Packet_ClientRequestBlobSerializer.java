// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class Packet_ClientRequestBlobSerializer
{

	/**
	 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
	 */
	public static Packet_ClientRequestBlob deserialize(CitoStream stream, Packet_ClientRequestBlob instance)
	{
		while (true) {
			int keyByte = stream.readByte();
			if (keyByte == -1)
				break;
			switch (keyByte) {
			case 10:
				if (instance.requestedMd5 == null)
					instance.requestedMd5 = Packet_StringListSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_StringListSerializer.deserializeLengthDelimited(stream, instance.requestedMd5);
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
	public static Packet_ClientRequestBlob deserializeBuffer(byte[] buffer, int length, Packet_ClientRequestBlob instance)
	{
		CitoMemoryStream ms = CitoMemoryStream.create(buffer, length);
		Packet_ClientRequestBlobSerializer.deserialize(ms, instance);
		return instance;
	}

	/**
	 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
	 */
	public static Packet_ClientRequestBlob deserializeLength(CitoStream stream, int length, Packet_ClientRequestBlob instance)
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
				if (instance.requestedMd5 == null)
					instance.requestedMd5 = Packet_StringListSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_StringListSerializer.deserializeLengthDelimited(stream, instance.requestedMd5);
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
	public static Packet_ClientRequestBlob deserializeLengthDelimited(CitoStream stream, Packet_ClientRequestBlob instance)
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
				if (instance.requestedMd5 == null)
					instance.requestedMd5 = Packet_StringListSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_StringListSerializer.deserializeLengthDelimited(stream, instance.requestedMd5);
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
	public static Packet_ClientRequestBlob deserializeLengthDelimitedNew(CitoStream stream)
	{
		Packet_ClientRequestBlob instance = new Packet_ClientRequestBlob();
		Packet_ClientRequestBlobSerializer.deserializeLengthDelimited(stream, instance);
		return instance;
	}

	/**
	 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
	 */
	public static void serialize(CitoStream stream, Packet_ClientRequestBlob instance)
	{
		if (instance.requestedMd5 != null) {
			stream.writeByte(ProtoPlatform.intToByte(10));
			CitoMemoryStream ms1 = new CitoMemoryStream();
			Packet_StringListSerializer.serialize(ms1, instance.requestedMd5);
			int ms1Length = ms1.length();
			ProtocolParser.writeUInt32_(stream, ms1Length);
			stream.write(ms1.getBuffer(), 0, ms1Length);
		}
	}

	/**
	 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
	 */
	public static void serializeLengthDelimited(CitoStream stream, Packet_ClientRequestBlob instance)
	{
		byte[] data = Packet_ClientRequestBlobSerializer.serializeToBytes(instance);
		ProtocolParser.writeUInt32_(stream, ProtoPlatform.arrayLength(data));
		stream.write(data, 0, ProtoPlatform.arrayLength(data));
	}

	/**
	 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
	 */
	public static byte[] serializeToBytes(Packet_ClientRequestBlob instance)
	{
		CitoMemoryStream ms = new CitoMemoryStream();
		Packet_ClientRequestBlobSerializer.serialize(ms, instance);
		return ms.toArray();
	}
}
