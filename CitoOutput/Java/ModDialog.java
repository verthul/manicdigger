// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class ModDialog extends ClientMod
{
	public ModDialog()
	{
		this.packetHandler = new ClientPacketHandlerDialog();
	}

	final void drawDialogs(Game game)
	{
		for (int i = 0; i < game.dialogsCount; i++) {
			if (game.dialogs[i] == null) {
				continue;
			}
			VisibleDialog d = game.dialogs[i];
			int x = game.width() / 2 - d.value.width / 2;
			int y = game.height() / 2 - d.value.height_ / 2;
			d.screen.screenx = x;
			d.screen.screeny = y;
			d.screen.drawWidgets();
		}
	}

	@Override
	public void onKeyDown(Game game, KeyEventArgs args)
	{
		for (int i = 0; i < game.dialogsCount; i++) {
			if (game.dialogs[i] == null) {
				continue;
			}
			game.dialogs[i].screen.onKeyDown(game, args);
		}
		if (game.guistate == GuiState.NORMAL) {
			if (args.getKeyCode() == game.getKey(50)) {
				for (int i = 0; i < game.dialogsCount; i++) {
					if (game.dialogs[i] == null) {
						continue;
					}
					VisibleDialog d = game.dialogs[i];
					if (d.value.isModal != 0) {
						game.dialogs[i] = null;
						return;
					}
				}
				game.showEscapeMenu();
				args.setHandled(true);
				return;
			}
		}
		if (game.guistate == GuiState.MODAL_DIALOG) {
			if (args.getKeyCode() == game.getKey(50)) {
				for (int i = 0; i < game.dialogsCount; i++) {
					if (game.dialogs[i] == null) {
						continue;
					}
					if (game.dialogs[i].value.isModal != 0) {
						game.dialogs[i] = null;
					}
				}
				game.sendPacketClient(ClientPackets.dialogClick("Esc", new String[0], 0));
				game.guiStateBackToGame();
				args.setHandled(true);
			}
			if (args.getKeyCode() == game.getKey(52)) {
				game.sendPacketClient(ClientPackets.dialogClick("Tab", new String[0], 0));
				args.setHandled(true);
			}
			return;
		}
	}

	@Override
	public void onKeyPress(Game game, KeyPressEventArgs args)
	{
		if (game.guistate != GuiState.MODAL_DIALOG && game.guistate != GuiState.NORMAL) {
			return;
		}
		if (game.isTyping) {
			return;
		}
		for (int i = 0; i < game.dialogsCount; i++) {
			if (game.dialogs[i] == null) {
				continue;
			}
			game.dialogs[i].screen.onKeyPress(game, args);
		}
		for (int k = 0; k < game.dialogsCount; k++) {
			if (game.dialogs[k] == null) {
				continue;
			}
			VisibleDialog d = game.dialogs[k];
			for (int i = 0; i < d.value.widgetsCount; i++) {
				Packet_Widget w = d.value.widgets[i];
				if (w == null) {
					continue;
				}
				String valid = "abcdefghijklmnopqrstuvwxyz1234567890\t ";
				if (game.platform.stringContains(valid, game.charToString(w.clickKey))) {
					if (args.getKeyChar() == w.clickKey) {
						game.sendPacketClient(ClientPackets.dialogClick(w.id, new String[0], 0));
						return;
					}
				}
			}
		}
	}

	@Override
	public void onKeyUp(Game game, KeyEventArgs args)
	{
		for (int i = 0; i < game.dialogsCount; i++) {
			if (game.dialogs[i] == null) {
				continue;
			}
			game.dialogs[i].screen.onKeyUp(game, args);
		}
	}

	@Override
	public void onMouseDown(Game game, MouseEventArgs args)
	{
		for (int i = 0; i < game.dialogsCount; i++) {
			if (game.dialogs[i] == null) {
				continue;
			}
			game.dialogs[i].screen.onMouseDown(game, args);
		}
	}

	@Override
	public void onMouseUp(Game game, MouseEventArgs args)
	{
		for (int i = 0; i < game.dialogsCount; i++) {
			if (game.dialogs[i] == null) {
				continue;
			}
			game.dialogs[i].screen.onMouseUp(game, args);
		}
	}

	@Override
	public void onNewFrameDraw2d(Game game, float deltaTime)
	{
		game.packetHandlers[52] = this.packetHandler;
		this.drawDialogs(game);
	}
	private ClientPacketHandler packetHandler;
}
