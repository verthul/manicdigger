// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class ScreenConnectToIp extends Screen
{
	public ScreenConnectToIp()
	{
		this.buttonConnect = new MenuWidget();
		this.buttonConnect.text = "Connect";
		this.buttonConnect.type = WidgetType.BUTTON;
		this.buttonConnect.nextWidget = 3;
		this.textboxIp = new MenuWidget();
		this.textboxIp.type = WidgetType.TEXTBOX;
		this.textboxIp.text = "";
		this.textboxIp.description = "Ip";
		this.textboxIp.nextWidget = 2;
		this.textboxPort = new MenuWidget();
		this.textboxPort.type = WidgetType.TEXTBOX;
		this.textboxPort.text = "";
		this.textboxPort.description = "Port";
		this.textboxPort.nextWidget = 0;
		this.back = new MenuWidget();
		this.back.text = "Back";
		this.back.type = WidgetType.BUTTON;
		this.back.nextWidget = 1;
		this.title = "Connect to IP";
		this.widgets[0] = this.buttonConnect;
		this.widgets[1] = this.textboxIp;
		this.widgets[2] = this.textboxPort;
		this.widgets[3] = this.back;
		this.textboxIp.getFocus();
	}

	@Override
	public void loadTranslations()
	{
		this.buttonConnect.text = this.menu.lang.get("MainMenu_ConnectToIpConnect");
		this.textboxIp.description = this.menu.lang.get("MainMenu_ConnectToIpIp");
		this.textboxPort.description = this.menu.lang.get("MainMenu_ConnectToIpPort");
		this.title = this.menu.lang.get("MainMenu_MultiplayerConnectIP");
	}

	@Override
	public void onBackPressed()
	{
		this.menu.startMultiplayer();
	}

	@Override
	public void onButton(MenuWidget w)
	{
		if (w == this.buttonConnect) {
			FloatRef ret = new FloatRef();
			if (!Game.stringEquals(this.textboxIp.text, "") && this.menu.p.floatTryParse(this.textboxPort.text, ret)) {
				this.menu.startLogin(null, this.textboxIp.text, this.menu.p.intParse(this.textboxPort.text));
			}
		}
		if (w == this.back) {
			this.onBackPressed();
		}
	}

	@Override
	public void render(float dt)
	{
		if (!this.loaded) {
			this.preferences_ip = this.menu.p.getPreferences().getString("ConnectToIpIp", "127.0.0.1");
			this.preferences_port = this.menu.p.getPreferences().getString("ConnectToIpPort", "25565");
			this.textboxIp.text = this.preferences_ip;
			this.textboxPort.text = this.preferences_port;
			this.loaded = true;
		}
		if (!this.textboxIp.text.equals(this.preferences_ip) || !this.textboxPort.text.equals(this.preferences_port)) {
			this.preferences_ip = this.textboxIp.text;
			this.preferences_port = this.textboxPort.text;
			Preferences preferences = this.menu.p.getPreferences();
			preferences.setString("ConnectToIpIp", this.preferences_ip);
			preferences.setString("ConnectToIpPort", this.preferences_port);
			this.menu.p.setPreferences(preferences);
		}
		GamePlatform p = this.menu.p;
		float scale = this.menu.getScale();
		this.menu.drawBackground();
		float leftx = p.getCanvasWidth() / 2 - 400 * scale;
		float y = p.getCanvasHeight() / 2 - 250 * scale;
		String loginResultText = null;
		if (this.errorText != null) {
			this.menu.drawText(loginResultText, 14 * scale, leftx, y - 50 * scale, TextAlign.LEFT, TextBaseline.TOP);
		}
		this.menu.drawText(this.title, 14 * scale, leftx, y + 50 * scale, TextAlign.LEFT, TextBaseline.TOP);
		this.textboxIp.x = leftx;
		this.textboxIp.y = y + 100 * scale;
		this.textboxIp.sizex = 256 * scale;
		this.textboxIp.sizey = 64 * scale;
		this.textboxIp.fontSize = 14 * scale;
		this.textboxPort.x = leftx;
		this.textboxPort.y = y + 200 * scale;
		this.textboxPort.sizex = 256 * scale;
		this.textboxPort.sizey = 64 * scale;
		this.textboxPort.fontSize = 14 * scale;
		this.buttonConnect.x = leftx;
		this.buttonConnect.y = y + 400 * scale;
		this.buttonConnect.sizex = 256 * scale;
		this.buttonConnect.sizey = 64 * scale;
		this.buttonConnect.fontSize = 14 * scale;
		this.back.x = 40 * scale;
		this.back.y = p.getCanvasHeight() - 104 * scale;
		this.back.sizex = 256 * scale;
		this.back.sizey = 64 * scale;
		this.back.fontSize = 14 * scale;
		this.drawWidgets();
	}
	private MenuWidget back;
	private MenuWidget buttonConnect;
	private String errorText;
	private boolean loaded;
	private String preferences_ip;
	private String preferences_port;
	private MenuWidget textboxIp;
	private MenuWidget textboxPort;
	private String title;
}
