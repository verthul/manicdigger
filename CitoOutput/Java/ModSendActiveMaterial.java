// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class ModSendActiveMaterial extends ClientMod
{

	@Override
	public void onNewFrameFixed(Game game, NewFrameEventArgs args)
	{
		Packet_Item activeitem = game.d_Inventory.rightHand[game.activeMaterial];
		int activeblock = 0;
		if (activeitem != null) {
			activeblock = activeitem.blockId;
		}
		if (activeblock != this.previousActiveMaterialBlock) {
			game.sendPacketClient(ClientPackets.activeMaterialSlot(game.activeMaterial));
		}
		this.previousActiveMaterialBlock = activeblock;
	}
	int previousActiveMaterialBlock;
}
