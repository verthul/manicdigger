// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class ClientPacketHandlerDialog extends ClientPacketHandler
{

	private GameScreen convertDialog(Game game, Packet_Dialog p)
	{
		DialogScreen s = new DialogScreen();
		s.widgets = new MenuWidget[p.widgetsCount];
		s.widgetCount = p.widgetsCount;
		for (int i = 0; i < p.widgetsCount; i++) {
			Packet_Widget a = p.widgets[i];
			MenuWidget b = new MenuWidget();
			if (a.type == 1) {
				b.type = WidgetType.LABEL;
			}
			if (a.type == 0) {
				b.type = WidgetType.BUTTON;
			}
			if (a.type == 2) {
				b.type = WidgetType.TEXTBOX;
			}
			b.x = a.x;
			b.y = a.y;
			b.sizex = a.width;
			b.sizey = a.height_;
			b.text = a.text;
			if (b.text != null) {
				b.text = game.platform.stringReplace(b.text, "!SERVER_IP!", game.serverInfo.connectdata.ip);
			}
			if (b.text != null) {
				b.text = game.platform.stringReplace(b.text, "!SERVER_PORT!", game.platform.intToString(game.serverInfo.connectdata.port));
			}
			b.color = a.color;
			if (a.font != null) {
				b.font = new FontCi();
				b.font.family = game.validFont(a.font.familyName);
				b.font.size = game.deserializeFloat(a.font.sizeFloat);
				b.font.style = a.font.fontStyle;
			}
			b.id = a.id;
			b.isbutton = a.clickKey != 0;
			if (a.image.equals("Solid")) {
				b.image = null;
			}
			else if (a.image != null) {
				b.image = StringTools.stringAppend(game.platform, a.image, ".png");
			}
			s.widgets[i] = b;
		}
		for (int i = 0; i < s.widgetCount; i++) {
			if (s.widgets[i] == null) {
				continue;
			}
			if (s.widgets[i].type == WidgetType.TEXTBOX) {
				s.widgets[i].editing = true;
				break;
			}
		}
		return s;
	}

	@Override
	public void handle(Game game, Packet_Server packet)
	{
		Packet_ServerDialog d = packet.dialog;
		if (d.dialog == null) {
			if (game.getDialogId(d.dialogId) != -1 && game.dialogs[game.getDialogId(d.dialogId)].value.isModal != 0) {
				game.guiStateBackToGame();
			}
			if (game.getDialogId(d.dialogId) != -1) {
				game.dialogs[game.getDialogId(d.dialogId)] = null;
			}
			if (game.dialogsCount_() == 0) {
				game.setFreeMouse(false);
			}
		}
		else {
			VisibleDialog d2 = new VisibleDialog();
			d2.key = d.dialogId;
			d2.value = d.dialog;
			d2.screen = this.convertDialog(game, d2.value);
			d2.screen.game = game;
			if (game.getDialogId(d.dialogId) == -1) {
				for (int i = 0; i < game.dialogsCount; i++) {
					if (game.dialogs[i] == null) {
						game.dialogs[i] = d2;
						break;
					}
				}
			}
			else {
				game.dialogs[game.getDialogId(d.dialogId)] = d2;
			}
			if (d.dialog.isModal != 0) {
				game.guistate = GuiState.MODAL_DIALOG;
				game.setFreeMouse(true);
			}
		}
	}
}
