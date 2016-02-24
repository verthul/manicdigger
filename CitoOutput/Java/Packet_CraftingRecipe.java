// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class Packet_CraftingRecipe
{

	public final Packet_Ingredient[] getIngredients()
	{
		return this.ingredients;
	}

	public final int getIngredientsCount()
	{
		return this.ingredientsCount;
	}

	public final int getIngredientsLength()
	{
		return this.ingredientsLength;
	}

	public final Packet_Ingredient getOutput()
	{
		return this.output;
	}
	Packet_Ingredient[] ingredients;

	public final void ingredientsAdd(Packet_Ingredient value)
	{
		if (this.ingredientsCount >= this.ingredientsLength) {
			Packet_Ingredient[] Ingredients2 = new Packet_Ingredient[this.ingredientsLength * 2];
			this.ingredientsLength = this.ingredientsLength * 2;
			for (int i = 0; i < this.ingredientsCount; i++) {
				Ingredients2[i] = this.ingredients[i];
			}
			this.ingredients = Ingredients2;
		}
		this.ingredients[this.ingredientsCount] = value;
		this.ingredientsCount++;
	}
	int ingredientsCount;
	int ingredientsLength;
	Packet_Ingredient output;

	public final void setIngredients(Packet_Ingredient[] value, int count, int length)
	{
		this.ingredients = value;
		this.ingredientsCount = count;
		this.ingredientsLength = length;
	}

	public final void setOutput(Packet_Ingredient value)
	{
		this.output = value;
	}
}
