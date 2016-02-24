// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class Packet_ServerCraftingRecipesSerializer
{

	/**
	 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
	 */
	public static Packet_ServerCraftingRecipes deserialize(CitoStream stream, Packet_ServerCraftingRecipes instance)
	{
		if (instance.craftingRecipes == null) {
			instance.craftingRecipes = new Packet_CraftingRecipe[1];
			instance.craftingRecipesCount = 0;
			instance.craftingRecipesLength = 1;
		}
		while (true) {
			int keyByte = stream.readByte();
			if (keyByte == -1)
				break;
			switch (keyByte) {
			case 10:
				instance.craftingRecipesAdd(Packet_CraftingRecipeSerializer.deserializeLengthDelimitedNew(stream));
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
	public static Packet_ServerCraftingRecipes deserializeBuffer(byte[] buffer, int length, Packet_ServerCraftingRecipes instance)
	{
		CitoMemoryStream ms = CitoMemoryStream.create(buffer, length);
		Packet_ServerCraftingRecipesSerializer.deserialize(ms, instance);
		return instance;
	}

	/**
	 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
	 */
	public static Packet_ServerCraftingRecipes deserializeLength(CitoStream stream, int length, Packet_ServerCraftingRecipes instance)
	{
		if (instance.craftingRecipes == null) {
			instance.craftingRecipes = new Packet_CraftingRecipe[1];
			instance.craftingRecipesCount = 0;
			instance.craftingRecipesLength = 1;
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
				instance.craftingRecipesAdd(Packet_CraftingRecipeSerializer.deserializeLengthDelimitedNew(stream));
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
	public static Packet_ServerCraftingRecipes deserializeLengthDelimited(CitoStream stream, Packet_ServerCraftingRecipes instance)
	{
		if (instance.craftingRecipes == null) {
			instance.craftingRecipes = new Packet_CraftingRecipe[1];
			instance.craftingRecipesCount = 0;
			instance.craftingRecipesLength = 1;
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
				instance.craftingRecipesAdd(Packet_CraftingRecipeSerializer.deserializeLengthDelimitedNew(stream));
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
	public static Packet_ServerCraftingRecipes deserializeLengthDelimitedNew(CitoStream stream)
	{
		Packet_ServerCraftingRecipes instance = new Packet_ServerCraftingRecipes();
		Packet_ServerCraftingRecipesSerializer.deserializeLengthDelimited(stream, instance);
		return instance;
	}

	/**
	 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
	 */
	public static void serialize(CitoStream stream, Packet_ServerCraftingRecipes instance)
	{
		if (instance.craftingRecipes != null) {
			for (int k = 0; k < instance.craftingRecipesCount; k++) {
				Packet_CraftingRecipe i1 = instance.craftingRecipes[k];
				stream.writeByte(ProtoPlatform.intToByte(10));
				CitoMemoryStream ms1 = new CitoMemoryStream();
				Packet_CraftingRecipeSerializer.serialize(ms1, i1);
				int ms1Length = ms1.length();
				ProtocolParser.writeUInt32_(stream, ms1Length);
				stream.write(ms1.getBuffer(), 0, ms1Length);
			}
		}
	}

	/**
	 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
	 */
	public static void serializeLengthDelimited(CitoStream stream, Packet_ServerCraftingRecipes instance)
	{
		byte[] data = Packet_ServerCraftingRecipesSerializer.serializeToBytes(instance);
		ProtocolParser.writeUInt32_(stream, ProtoPlatform.arrayLength(data));
		stream.write(data, 0, ProtoPlatform.arrayLength(data));
	}

	/**
	 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
	 */
	public static byte[] serializeToBytes(Packet_ServerCraftingRecipes instance)
	{
		CitoMemoryStream ms = new CitoMemoryStream();
		Packet_ServerCraftingRecipesSerializer.serialize(ms, instance);
		return ms.toArray();
	}
}
