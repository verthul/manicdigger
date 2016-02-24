// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class ModReloadAmmo extends ClientMod
{

	@Override
	public void onKeyDown(Game game, KeyEventArgs args)
	{
		if (!(game.guistate == GuiState.NORMAL && game.guiTyping == TypingState.NONE)) {
			return;
		}
		int eKey = args.getKeyCode();
		if (eKey == game.getKey(100)) {
			Packet_Item item = game.d_Inventory.rightHand[game.activeMaterial];
			if (item != null && item.itemClass == 0 && game.blocktypes[item.blockId].isPistol && game.reloadstartMilliseconds == 0) {
				int sound = game.rnd.next() % game.blocktypes[item.blockId].sounds.reloadCount;
				game.audioPlay(StringTools.stringAppend(game.platform, game.blocktypes[item.blockId].sounds.reload[sound], ".ogg"));
				game.reloadstartMilliseconds = game.platform.timeMillisecondsFromStart();
				game.reloadblock = item.blockId;
				game.sendPacketClient(ClientPackets.reload());
			}
		}
	}

	@Override
	public void onNewFrameFixed(Game game, NewFrameEventArgs args)
	{
		if (game.reloadstartMilliseconds != 0 && game.one * (game.platform.timeMillisecondsFromStart() - game.reloadstartMilliseconds) / 1000 > game.deserializeFloat(game.blocktypes[game.reloadblock].reloadDelayFloat)) {
			{
				int loaded = game.totalAmmo[game.reloadblock];
				loaded = MathCi.minInt(game.blocktypes[game.reloadblock].ammoMagazine, loaded);
				game.loadedAmmo[game.reloadblock] = loaded;
				game.reloadstartMilliseconds = 0;
				game.reloadblock = -1;
			}
		}
	}
}
