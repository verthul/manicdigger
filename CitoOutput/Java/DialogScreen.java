// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class DialogScreen extends GameScreen
{

	@Override
	public void onButton(MenuWidget w)
	{
		if (w.isbutton) {
			String[] textValues = new String[this.widgetCount];
			for (int i = 0; i < this.widgetCount; i++) {
				String s = this.widgets[i].text;
				if (s == null) {
					s = "";
				}
				textValues[i] = s;
			}
			this.game.sendPacketClient(ClientPackets.dialogClick(w.id, textValues, this.widgetCount));
		}
	}
}
