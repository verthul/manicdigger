// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class ModManagerSimple1 extends ModManagerSimple
{

	@Override
	public void addToInventory(int player, String block, int amount)
	{
		Packet_Inventory inv = this.server.clients[player].inventory;
		for (int i = 0; i < 10; i++) {
			if (inv.rightHand[i].blockId == 0) {
				inv.rightHand[i].blockId = this.getBlockTypeId(block);
				inv.rightHand[i].blockCount = amount;
				break;
			}
		}
		this.server.clients[player].inventoryDirty = true;
	}

	@Override
	public BlockTypeSimple createBlockType(String name)
	{
		BlockTypeSimple b = new BlockTypeSimple();
		b.setName(name);
		this.server.blockTypes[this.server.blockTypesCount++] = b.block;
		return b;
	}

	@Override
	public int getBlockTypeId(String p)
	{
		for (int i = 0; i < this.server.blockTypesCount; i++) {
			if (this.server.blockTypes[i] == null) {
				continue;
			}
			if (Game.stringEquals(this.server.blockTypes[i].name, p)) {
				return i;
			}
		}
		return -1;
	}

	public final void start(ServerSimple serverSimple)
	{
		this.server = serverSimple;
	}
	private ServerSimple server;
}
