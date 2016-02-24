// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class PacketHandlerCraftingRecipes extends ClientPacketHandler
{

	@Override
	public void handle(Game game, Packet_Server packet)
	{
		this.mod.d_CraftingRecipes = packet.craftingRecipes.craftingRecipes;
		this.mod.d_CraftingRecipesCount = packet.craftingRecipes.craftingRecipesCount;
	}
	ModGuiCrafting mod;
}
