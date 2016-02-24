// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class Packet_ServerCraftingRecipes
{
	Packet_CraftingRecipe[] craftingRecipes;

	public final void craftingRecipesAdd(Packet_CraftingRecipe value)
	{
		if (this.craftingRecipesCount >= this.craftingRecipesLength) {
			Packet_CraftingRecipe[] CraftingRecipes2 = new Packet_CraftingRecipe[this.craftingRecipesLength * 2];
			this.craftingRecipesLength = this.craftingRecipesLength * 2;
			for (int i = 0; i < this.craftingRecipesCount; i++) {
				CraftingRecipes2[i] = this.craftingRecipes[i];
			}
			this.craftingRecipes = CraftingRecipes2;
		}
		this.craftingRecipes[this.craftingRecipesCount] = value;
		this.craftingRecipesCount++;
	}
	int craftingRecipesCount;
	int craftingRecipesLength;

	public final Packet_CraftingRecipe[] getCraftingRecipes()
	{
		return this.craftingRecipes;
	}

	public final int getCraftingRecipesCount()
	{
		return this.craftingRecipesCount;
	}

	public final int getCraftingRecipesLength()
	{
		return this.craftingRecipesLength;
	}

	public final void setCraftingRecipes(Packet_CraftingRecipe[] value, int count, int length)
	{
		this.craftingRecipes = value;
		this.craftingRecipesCount = count;
		this.craftingRecipesLength = length;
	}
}
