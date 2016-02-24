// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class Packet_CraftingRecipeSerializer
{

	/**
	 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
	 */
	public static Packet_CraftingRecipe deserialize(CitoStream stream, Packet_CraftingRecipe instance)
	{
		if (instance.ingredients == null) {
			instance.ingredients = new Packet_Ingredient[1];
			instance.ingredientsCount = 0;
			instance.ingredientsLength = 1;
		}
		while (true) {
			int keyByte = stream.readByte();
			if (keyByte == -1)
				break;
			switch (keyByte) {
			case 10:
				instance.ingredientsAdd(Packet_IngredientSerializer.deserializeLengthDelimitedNew(stream));
				continue;
			case 18:
				if (instance.output == null)
					instance.output = Packet_IngredientSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_IngredientSerializer.deserializeLengthDelimited(stream, instance.output);
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
	public static Packet_CraftingRecipe deserializeBuffer(byte[] buffer, int length, Packet_CraftingRecipe instance)
	{
		CitoMemoryStream ms = CitoMemoryStream.create(buffer, length);
		Packet_CraftingRecipeSerializer.deserialize(ms, instance);
		return instance;
	}

	/**
	 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
	 */
	public static Packet_CraftingRecipe deserializeLength(CitoStream stream, int length, Packet_CraftingRecipe instance)
	{
		if (instance.ingredients == null) {
			instance.ingredients = new Packet_Ingredient[1];
			instance.ingredientsCount = 0;
			instance.ingredientsLength = 1;
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
				instance.ingredientsAdd(Packet_IngredientSerializer.deserializeLengthDelimitedNew(stream));
				continue;
			case 18:
				if (instance.output == null)
					instance.output = Packet_IngredientSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_IngredientSerializer.deserializeLengthDelimited(stream, instance.output);
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
	public static Packet_CraftingRecipe deserializeLengthDelimited(CitoStream stream, Packet_CraftingRecipe instance)
	{
		if (instance.ingredients == null) {
			instance.ingredients = new Packet_Ingredient[1];
			instance.ingredientsCount = 0;
			instance.ingredientsLength = 1;
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
				instance.ingredientsAdd(Packet_IngredientSerializer.deserializeLengthDelimitedNew(stream));
				continue;
			case 18:
				if (instance.output == null)
					instance.output = Packet_IngredientSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_IngredientSerializer.deserializeLengthDelimited(stream, instance.output);
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
	public static Packet_CraftingRecipe deserializeLengthDelimitedNew(CitoStream stream)
	{
		Packet_CraftingRecipe instance = new Packet_CraftingRecipe();
		Packet_CraftingRecipeSerializer.deserializeLengthDelimited(stream, instance);
		return instance;
	}

	/**
	 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
	 */
	public static void serialize(CitoStream stream, Packet_CraftingRecipe instance)
	{
		if (instance.ingredients != null) {
			for (int k = 0; k < instance.ingredientsCount; k++) {
				Packet_Ingredient i1 = instance.ingredients[k];
				stream.writeByte(ProtoPlatform.intToByte(10));
				CitoMemoryStream ms1 = new CitoMemoryStream();
				Packet_IngredientSerializer.serialize(ms1, i1);
				int ms1Length = ms1.length();
				ProtocolParser.writeUInt32_(stream, ms1Length);
				stream.write(ms1.getBuffer(), 0, ms1Length);
			}
		}
		if (instance.output != null) {
			stream.writeByte(ProtoPlatform.intToByte(18));
			CitoMemoryStream ms2 = new CitoMemoryStream();
			Packet_IngredientSerializer.serialize(ms2, instance.output);
			int ms2Length = ms2.length();
			ProtocolParser.writeUInt32_(stream, ms2Length);
			stream.write(ms2.getBuffer(), 0, ms2Length);
		}
	}

	/**
	 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
	 */
	public static void serializeLengthDelimited(CitoStream stream, Packet_CraftingRecipe instance)
	{
		byte[] data = Packet_CraftingRecipeSerializer.serializeToBytes(instance);
		ProtocolParser.writeUInt32_(stream, ProtoPlatform.arrayLength(data));
		stream.write(data, 0, ProtoPlatform.arrayLength(data));
	}

	/**
	 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
	 */
	public static byte[] serializeToBytes(Packet_CraftingRecipe instance)
	{
		CitoMemoryStream ms = new CitoMemoryStream();
		Packet_CraftingRecipeSerializer.serialize(ms, instance);
		return ms.toArray();
	}
}
