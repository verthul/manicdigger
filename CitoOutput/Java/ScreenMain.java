// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class ScreenMain extends Screen
{
	public ScreenMain()
	{
		this.singleplayer = new MenuWidget();
		this.multiplayer = new MenuWidget();
		this.exit = new MenuWidget();
		this.widgets[0] = this.singleplayer;
		this.widgets[1] = this.multiplayer;
		this.widgets[2] = this.exit;
		this.queryStringChecked = false;
		this.cursorLoaded = false;
	}

	@Override
	public void onBackPressed()
	{
		this.menu.exit();
	}

	@Override
	public void onButton(MenuWidget w)
	{
		if (w == this.singleplayer) {
			this.menu.startSingleplayer();
		}
		if (w == this.multiplayer) {
			this.menu.startMultiplayer();
		}
		if (w == this.exit) {
			this.menu.exit();
		}
	}

	@Override
	public void onKeyDown(KeyEventArgs e)
	{
		if (e.getKeyCode() == 14) {
			this.menu.p.singlePlayerServerDisable();
			this.menu.startGame(true, this.menu.p.pathCombine(this.menu.p.pathSavegames(), "Default.mdss"), null);
		}
		if (e.getKeyCode() == 15) {
			this.menu.startGame(true, this.menu.p.pathCombine(this.menu.p.pathSavegames(), "Default.mddbs"), null);
		}
	}

	@Override
	public void render(float dt)
	{
		this.windowX = this.menu.p.getCanvasWidth();
		this.windowY = this.menu.p.getCanvasHeight();
		float scale = this.menu.getScale();
		if (this.menu.assetsLoadProgress.value != 1) {
			String s = this.menu.p.stringFormat(this.menu.lang.get("MainMenu_AssetsLoadProgress"), this.menu.p.floatToString(this.menu.p.floatToInt(this.menu.assetsLoadProgress.value * 100)));
			this.menu.drawText(s, 20 * scale, this.windowX / 2, this.windowY / 2, TextAlign.CENTER, TextBaseline.MIDDLE);
			return;
		}
		if (!this.cursorLoaded) {
			this.menu.p.setWindowCursor(0, 0, 32, 32, this.menu.getFile("mousecursor.png"), this.menu.getFileLength("mousecursor.png"));
			this.cursorLoaded = true;
		}
		this.useQueryStringIpAndPort(this.menu);
		this.menu.drawBackground();
		this.menu.draw2dQuad(this.menu.getTexture("logo.png"), this.windowX / 2 - 1024 * scale / 2, 0, 1024 * scale, 512 * scale);
		int buttonheight = 64;
		int buttonwidth = 256;
		int spacebetween = 5;
		int offsetfromborder = 50;
		this.singleplayer.text = this.menu.lang.get("MainMenu_Singleplayer");
		this.singleplayer.x = this.windowX / 2 - buttonwidth / 2 * scale;
		this.singleplayer.y = this.windowY - 3 * (buttonheight * scale + spacebetween) - offsetfromborder * scale;
		this.singleplayer.sizex = buttonwidth * scale;
		this.singleplayer.sizey = buttonheight * scale;
		this.multiplayer.text = this.menu.lang.get("MainMenu_Multiplayer");
		this.multiplayer.x = this.windowX / 2 - buttonwidth / 2 * scale;
		this.multiplayer.y = this.windowY - 2 * (buttonheight * scale + spacebetween) - offsetfromborder * scale;
		this.multiplayer.sizex = buttonwidth * scale;
		this.multiplayer.sizey = buttonheight * scale;
		this.exit.visible = this.menu.p.exitAvailable();
		this.exit.text = this.menu.lang.get("MainMenu_Quit");
		this.exit.x = this.windowX / 2 - buttonwidth / 2 * scale;
		this.exit.y = this.windowY - 1 * (buttonheight * scale + spacebetween) - offsetfromborder * scale;
		this.exit.sizex = buttonwidth * scale;
		this.exit.sizey = buttonheight * scale;
		this.drawWidgets();
	}

	private void useQueryStringIpAndPort(MainMenu menu)
	{
		if (this.queryStringChecked) {
			return;
		}
		this.queryStringChecked = true;
		String ip = menu.p.queryStringValue("ip");
		String port = menu.p.queryStringValue("port");
		int portInt = 25565;
		if (port != null && menu.p.floatTryParse(port, new FloatRef())) {
			portInt = menu.p.intParse(port);
		}
		if (ip != null) {
			menu.startLogin(null, ip, portInt);
		}
	}
	private boolean cursorLoaded;
	private MenuWidget exit;
	private MenuWidget multiplayer;
	private boolean queryStringChecked;
	private MenuWidget singleplayer;
	float windowX;
	float windowY;
}
