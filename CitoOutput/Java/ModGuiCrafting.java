// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class ModGuiCrafting extends ClientMod
{
	public ModGuiCrafting()
	{
		this.handler = new PacketHandlerCraftingRecipes();
		this.handler.mod = this;
	}

	final void craftingMouse(Game game)
	{
		if (this.currentRecipes == null) {
			return;
		}
		int menustartx = game.xcenter(600);
		int menustarty = game.ycenter(this.currentRecipesCount * 80);
		if (game.mouseCurrentY >= menustarty && game.mouseCurrentY < menustarty + this.currentRecipesCount * 80) {
			this.craftingselectedrecipe = (game.mouseCurrentY - menustarty) / 80;
		}
		else {
		}
		if (game.mouseleftclick) {
			if (this.currentRecipesCount != 0) {
				this.craftingRecipeSelected(game, this.craftingTableposx, this.craftingTableposy, this.craftingTableposz, IntRef.create(this.currentRecipes[this.craftingselectedrecipe]));
			}
			game.mouseleftclick = false;
			game.guiStateBackToGame();
		}
	}

	final void craftingRecipeSelected(Game game, int x, int y, int z, IntRef recipe)
	{
		if (recipe == null) {
			return;
		}
		game.sendPacketClient(ClientPackets.craft(x, y, z, recipe.value));
	}

	final void craftingRecipesStart(Game game, Packet_CraftingRecipe[] recipes, int recipesCount, int[] blocks, int blocksCount, int posx, int posy, int posz)
	{
		this.craftingrecipes2 = recipes;
		this.craftingrecipes2Count = recipesCount;
		this.craftingblocks = blocks;
		this.craftingblocksCount = blocksCount;
		this.craftingTableposx = posx;
		this.craftingTableposy = posy;
		this.craftingTableposz = posz;
		game.guistate = GuiState.CRAFTING_RECIPES;
		game.menustate = new MenuState();
		game.setFreeMouse(true);
	}

	final void drawCraftingRecipes(Game game)
	{
		this.currentRecipes = new int[1024];
		this.currentRecipesCount = 0;
		for (int i = 0; i < this.craftingrecipes2Count; i++) {
			Packet_CraftingRecipe r = this.craftingrecipes2[i];
			if (r == null) {
				continue;
			}
			boolean next = false;
			for (int k = 0; k < r.ingredientsCount; k++) {
				Packet_Ingredient ingredient = r.ingredients[k];
				if (ingredient == null) {
					continue;
				}
				if (this.craftingblocksFindAllCount(this.craftingblocks, this.craftingblocksCount, ingredient.type) < ingredient.amount) {
					next = true;
					break;
				}
			}
			if (!next) {
				this.currentRecipes[this.currentRecipesCount++] = i;
			}
		}
		int menustartx = game.xcenter(600);
		int menustarty = game.ycenter(this.currentRecipesCount * 80);
		if (this.currentRecipesCount == 0) {
			game.draw2dText1(game.language.noMaterialsForCrafting(), game.xcenter(200), game.ycenter(20), 12, null, false);
			return;
		}
		for (int i = 0; i < this.currentRecipesCount; i++) {
			Packet_CraftingRecipe r = this.craftingrecipes2[this.currentRecipes[i]];
			for (int ii = 0; ii < r.ingredientsCount; ii++) {
				int xx = menustartx + 20 + ii * 130;
				int yy = menustarty + i * 80;
				game.draw2dTexture(game.d_TerrainTextures.terrainTexture(), xx, yy, 32, 32, IntRef.create(game.textureIdForInventory[r.ingredients[ii].type]), game.texturesPacked(), Game.colorFromArgb(255, 255, 255, 255), false);
				game.draw2dText1(game.platform.stringFormat2("{0} {1}", game.platform.intToString(r.ingredients[ii].amount), game.blocktypes[r.ingredients[ii].type].name), xx + 50, yy, 12, IntRef.create(i == this.craftingselectedrecipe ? Game.colorFromArgb(255, 255, 0, 0) : Game.colorFromArgb(255, 255, 255, 255)), false);
			}
			{
				int xx = menustartx + 20 + 400;
				int yy = menustarty + i * 80;
				game.draw2dTexture(game.d_TerrainTextures.terrainTexture(), xx, yy, 32, 32, IntRef.create(game.textureIdForInventory[r.output.type]), game.texturesPacked(), Game.colorFromArgb(255, 255, 255, 255), false);
				game.draw2dText1(game.platform.stringFormat2("{0} {1}", game.platform.intToString(r.output.amount), game.blocktypes[r.output.type].name), xx + 50, yy, 12, IntRef.create(i == this.craftingselectedrecipe ? Game.colorFromArgb(255, 255, 0, 0) : Game.colorFromArgb(255, 255, 255, 255)), false);
			}
		}
	}

	@Override
	public void onKeyDown(Game game, KeyEventArgs args)
	{
		int eKey = args.getKeyCode();
		if (eKey == game.getKey(87) && game.guiTyping == TypingState.NONE) {
			if (!(game.selectedBlockPositionX == -1 && game.selectedBlockPositionY == -1 && game.selectedBlockPositionZ == -1)) {
				int posx = game.selectedBlockPositionX;
				int posy = game.selectedBlockPositionZ;
				int posz = game.selectedBlockPositionY;
				if (game.map.getBlock(posx, posy, posz) == game.d_Data.blockIdCraftingTable()) {
					IntRef tableCount = new IntRef();
					Vector3IntRef[] table = this.d_CraftingTableTool.getTable(posx, posy, posz, tableCount);
					IntRef onTableCount = new IntRef();
					int[] onTable = this.d_CraftingTableTool.getOnTable(table, tableCount.value, onTableCount);
					this.craftingRecipesStart(game, this.d_CraftingRecipes, this.d_CraftingRecipesCount, onTable, onTableCount.value, posx, posy, posz);
					args.setHandled(true);
				}
			}
		}
	}

	@Override
	public void onNewFrameDraw2d(Game game, float deltaTime)
	{
		if (this.d_CraftingTableTool == null) {
			this.d_CraftingTableTool = new CraftingTableTool();
			this.d_CraftingTableTool.d_Map = MapStorage2.create(game);
			this.d_CraftingTableTool.d_Data = game.d_Data;
		}
		game.packetHandlers[30] = this.handler;
		if (game.guistate != GuiState.CRAFTING_RECIPES) {
			return;
		}
		this.drawCraftingRecipes(game);
	}

	@Override
	public void onNewFrameFixed(Game game, NewFrameEventArgs args)
	{
		if (game.guistate != GuiState.CRAFTING_RECIPES) {
			return;
		}
		this.craftingMouse(game);
	}
	int craftingTableposx;
	int craftingTableposy;
	int craftingTableposz;
	int[] craftingblocks;
	int craftingblocksCount;

	private int craftingblocksFindAllCount(int[] craftingblocks_, int craftingblocksCount_, int p)
	{
		int count = 0;
		for (int i = 0; i < craftingblocksCount_; i++) {
			if (craftingblocks_[i] == p) {
				count++;
			}
		}
		return count;
	}
	Packet_CraftingRecipe[] craftingrecipes2;
	int craftingrecipes2Count;
	int craftingselectedrecipe;
	int[] currentRecipes;
	int currentRecipesCount;
	Packet_CraftingRecipe[] d_CraftingRecipes;
	int d_CraftingRecipesCount;
	CraftingTableTool d_CraftingTableTool;
	private PacketHandlerCraftingRecipes handler;
}
