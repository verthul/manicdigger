// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public abstract class IInventoryController
{

	public abstract void inventoryClick(Packet_InventoryPosition pos);

	public abstract void moveToInventory(Packet_InventoryPosition from);

	public abstract void wearItem(Packet_InventoryPosition from, Packet_InventoryPosition to);
}
