// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class ClientSimple
{
	public ClientSimple()
	{
		this.inventory = new Packet_Inventory();
		this.inventory.setRightHand(new Packet_Item[10], 10, 10);
		for (int i = 0; i < 10; i++) {
			this.inventory.rightHand[i] = new Packet_Item();
		}
	}
	NetConnection connection;
	NetServer mainSocket;
	String name;
	boolean[][] chunksseen;
	boolean connected;
	float glX;
	float glY;
	float glZ;
	Packet_Inventory inventory;
	boolean inventoryDirty;
	Action_ notifyMapAction;
	int pingLastMilliseconds;
}
