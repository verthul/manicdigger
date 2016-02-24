// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class ClientInventoryController extends IInventoryController
{

	public static ClientInventoryController create(Game game)
	{
		ClientInventoryController c = new ClientInventoryController();
		c.g = game;
		return c;
	}

	@Override
	public void inventoryClick(Packet_InventoryPosition pos)
	{
		this.g.inventoryClick(pos);
	}

	@Override
	public void moveToInventory(Packet_InventoryPosition from)
	{
		this.g.moveToInventory(from);
	}

	@Override
	public void wearItem(Packet_InventoryPosition from, Packet_InventoryPosition to)
	{
		this.g.wearItem(from, to);
	}
	private Game g;
}
