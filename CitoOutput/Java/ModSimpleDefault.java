// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class ModSimpleDefault extends ModSimple
{

	@Override
	public void onPlayerJoin(int playerId)
	{
		this.m.addToInventory(playerId, "Dirt", 0);
		this.m.addToInventory(playerId, "Stone", 0);
		this.m.addToInventory(playerId, "Wood", 0);
		this.m.addToInventory(playerId, "Brick", 0);
	}

	@Override
	public void start(ModManagerSimple manager)
	{
		this.m = manager;
		BlockTypeSimple empty = manager.createBlockType("Empty");
		empty.setDrawType(0);
		empty.setWalkableType(0);
		BlockTypeSimple stone = manager.createBlockType("Stone");
		stone.setDrawType(1);
		stone.setWalkableType(2);
		stone.setAllTextures("Stone");
		BlockTypeSimple dirt = manager.createBlockType("Dirt");
		dirt.setDrawType(1);
		dirt.setWalkableType(2);
		dirt.setAllTextures("Dirt");
		BlockTypeSimple grass = manager.createBlockType("Grass");
		grass.setDrawType(1);
		grass.setWalkableType(2);
		grass.setTextureTop("Grass");
		grass.setTextureBack("GrassSide");
		grass.setTextureFront("GrassSide");
		grass.setTextureLeft("GrassSide");
		grass.setTextureRight("GrassSide");
		grass.setTextureBottom("Dirt");
		BlockTypeSimple wood = manager.createBlockType("Wood");
		wood.setDrawType(1);
		wood.setWalkableType(2);
		wood.setAllTextures("OakWood");
		BlockTypeSimple brick = manager.createBlockType("Brick");
		brick.setDrawType(1);
		brick.setWalkableType(2);
		brick.setAllTextures("Brick");
		manager.createBlockType("Sponge");
		manager.createBlockType("Trampoline");
		BlockTypeSimple adminium = manager.createBlockType("Adminium");
		adminium.setDrawType(1);
		adminium.setWalkableType(2);
		adminium.setAllTextures("Adminium");
		manager.createBlockType("Compass");
		manager.createBlockType("Ladder");
		manager.createBlockType("EmptyHand");
		manager.createBlockType("CraftingTable");
		manager.createBlockType("Lava");
		manager.createBlockType("StationaryLava");
		manager.createBlockType("FillStart");
		manager.createBlockType("Cuboid");
		manager.createBlockType("FillArea");
		manager.createBlockType("Minecart");
		manager.createBlockType("Rail0");
	}
	private ModManagerSimple m;
}
