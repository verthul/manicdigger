// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class ScreenMultiplayer extends Screen
{
	public ScreenMultiplayer()
	{
		this.widgetCount = 1088;
		this.widgets = new MenuWidget[this.widgetCount];
		this.back = new MenuWidget();
		this.back.text = "Back";
		this.back.type = WidgetType.BUTTON;
		this.back.nextWidget = 1;
		this.connect = new MenuWidget();
		this.connect.text = "Connect";
		this.connect.type = WidgetType.BUTTON;
		this.connect.nextWidget = 3;
		this.connectToIp = new MenuWidget();
		this.connectToIp.text = "Connect to IP";
		this.connectToIp.type = WidgetType.BUTTON;
		this.connectToIp.nextWidget = 2;
		this.refresh = new MenuWidget();
		this.refresh.text = "Refresh";
		this.refresh.type = WidgetType.BUTTON;
		this.refresh.nextWidget = 0;
		this.page = 0;
		this.pageUp = new MenuWidget();
		this.pageUp.text = "";
		this.pageUp.type = WidgetType.BUTTON;
		this.pageUp.buttonStyle = ButtonStyle.TEXT;
		this.pageUp.visible = false;
		this.pageDown = new MenuWidget();
		this.pageDown.text = "";
		this.pageDown.type = WidgetType.BUTTON;
		this.pageDown.buttonStyle = ButtonStyle.TEXT;
		this.pageDown.visible = false;
		this.loggedInName = new MenuWidget();
		this.loggedInName.text = "";
		this.loggedInName.type = WidgetType.BUTTON;
		this.loggedInName.buttonStyle = ButtonStyle.TEXT;
		this.logout = new MenuWidget();
		this.logout.text = "";
		this.logout.type = WidgetType.BUTTON;
		this.logout.buttonStyle = ButtonStyle.BUTTON;
		this.title = "Multiplayer";
		this.widgets[0] = this.back;
		this.widgets[1] = this.connect;
		this.widgets[2] = this.refresh;
		this.widgets[3] = this.connectToIp;
		this.widgets[4] = this.pageUp;
		this.widgets[5] = this.pageDown;
		this.widgets[6] = this.loggedInName;
		this.widgets[7] = this.logout;
		this.serverListAddress = new HttpResponseCi();
		this.serverListCsv = new HttpResponseCi();
		this.serversOnList = new ServerOnList[1024];
		this.thumbResponses = new ThumbnailResponseCi[1024];
		this.serverButtons = new MenuWidget[1024];
		for (int i = 0; i < 1024; i++) {
			MenuWidget b = new MenuWidget();
			b = new MenuWidget();
			b.text = "Invalid";
			b.type = WidgetType.BUTTON;
			b.visible = false;
			b.image = "serverlist_entry_noimage.png";
			this.serverButtons[i] = b;
			this.widgets[8 + i] = b;
		}
		this.loading = true;
	}

	@Override
	public void loadTranslations()
	{
		this.back.text = this.menu.lang.get("MainMenu_ButtonBack");
		this.connect.text = this.menu.lang.get("MainMenu_MultiplayerConnect");
		this.connectToIp.text = this.menu.lang.get("MainMenu_MultiplayerConnectIP");
		this.refresh.text = this.menu.lang.get("MainMenu_MultiplayerRefresh");
		this.title = this.menu.lang.get("MainMenu_Multiplayer");
	}

	@Override
	public void onBackPressed()
	{
		this.menu.startMainMenu();
	}

	@Override
	public void onButton(MenuWidget w)
	{
		for (int i = 0; i < 1024; i++) {
			this.serverButtons[i].selected = false;
			if (this.serverButtons[i] == w) {
				this.serverButtons[i].selected = true;
				if (this.serversOnList[i + this.serversPerPage * this.page] != null) {
					this.selectedServerHash = this.serversOnList[i + this.serversPerPage * this.page].hash;
				}
			}
		}
		if (w == this.pageUp) {
			this.pageUp_();
		}
		if (w == this.pageDown) {
			this.pageDown_();
		}
		if (w == this.back) {
			this.onBackPressed();
		}
		if (w == this.connect) {
			if (this.selectedServerHash != null) {
				this.menu.startLogin(this.selectedServerHash, null, 0);
			}
		}
		if (w == this.connectToIp) {
			this.menu.startConnectToIp();
		}
		if (w == this.refresh) {
			this.loaded = false;
			this.loading = true;
		}
		if (w == this.logout) {
			Preferences pref = this.menu.p.getPreferences();
			pref.remove("Username");
			pref.remove("Password");
			this.menu.p.setPreferences(pref);
			this.loggedInName.text = "";
		}
	}

	@Override
	public void onMouseWheel(MouseWheelEventArgs e)
	{
		if (e.getDelta() < 0) {
			this.pageUp_();
		}
		else if (e.getDelta() > 0) {
			this.pageDown_();
		}
	}

	public final void pageDown_()
	{
		if (this.page > 0) {
			this.page--;
		}
	}

	public final void pageUp_()
	{
		if (this.pageUp.visible && this.page < 1024 / this.serversPerPage - 1) {
			this.page++;
		}
	}

	@Override
	public void render(float dt)
	{
		if (!this.loaded) {
			this.menu.p.webClientDownloadDataAsync("http://manicdigger.sourceforge.net/serverlistcsv.php", this.serverListAddress);
			this.loaded = true;
		}
		if (this.serverListAddress.done) {
			this.serverListAddress.done = false;
			this.menu.p.webClientDownloadDataAsync(this.serverListAddress.getString(this.menu.p), this.serverListCsv);
		}
		if (this.serverListCsv.done) {
			this.loading = false;
			this.serverListCsv.done = false;
			for (int i = 0; i < 1024; i++) {
				this.serversOnList[i] = null;
				this.thumbResponses[i] = null;
			}
			IntRef serversCount = new IntRef();
			String[] servers = this.menu.p.stringSplit(this.serverListCsv.getString(this.menu.p), "\n", serversCount);
			for (int i = 0; i < serversCount.value; i++) {
				IntRef ssCount = new IntRef();
				String[] ss = this.menu.p.stringSplit(servers[i], "\t", ssCount);
				if (ssCount.value < 10) {
					continue;
				}
				ServerOnList s = new ServerOnList();
				s.hash = ss[0];
				s.name = this.menu.p.decodeHTMLEntities(ss[1]);
				s.motd = this.menu.p.decodeHTMLEntities(ss[2]);
				s.port = this.menu.p.intParse(ss[3]);
				s.ip = ss[4];
				s.version = ss[5];
				s.users = this.menu.p.intParse(ss[6]);
				s.max = this.menu.p.intParse(ss[7]);
				s.gamemode = ss[8];
				s.players = ss[9];
				this.serversOnList[i] = s;
			}
		}
		GamePlatform p = this.menu.p;
		float scale = this.menu.getScale();
		this.back.x = 40 * scale;
		this.back.y = p.getCanvasHeight() - 104 * scale;
		this.back.sizex = 256 * scale;
		this.back.sizey = 64 * scale;
		this.back.fontSize = 14 * scale;
		this.connect.x = p.getCanvasWidth() / 2 - 300 * scale;
		this.connect.y = p.getCanvasHeight() - 104 * scale;
		this.connect.sizex = 256 * scale;
		this.connect.sizey = 64 * scale;
		this.connect.fontSize = 14 * scale;
		this.connectToIp.x = p.getCanvasWidth() / 2 - 0 * scale;
		this.connectToIp.y = p.getCanvasHeight() - 104 * scale;
		this.connectToIp.sizex = 256 * scale;
		this.connectToIp.sizey = 64 * scale;
		this.connectToIp.fontSize = 14 * scale;
		this.refresh.x = p.getCanvasWidth() / 2 + 350 * scale;
		this.refresh.y = p.getCanvasHeight() - 104 * scale;
		this.refresh.sizex = 256 * scale;
		this.refresh.sizey = 64 * scale;
		this.refresh.fontSize = 14 * scale;
		this.pageUp.x = p.getCanvasWidth() - 94 * scale;
		this.pageUp.y = 100 * scale + (this.serversPerPage - 1) * 70 * scale;
		this.pageUp.sizex = 64 * scale;
		this.pageUp.sizey = 64 * scale;
		this.pageUp.image = "serverlist_nav_down.png";
		this.pageDown.x = p.getCanvasWidth() - 94 * scale;
		this.pageDown.y = 100 * scale;
		this.pageDown.sizex = 64 * scale;
		this.pageDown.sizey = 64 * scale;
		this.pageDown.image = "serverlist_nav_up.png";
		this.loggedInName.x = p.getCanvasWidth() - 228 * scale;
		this.loggedInName.y = 32 * scale;
		this.loggedInName.sizex = 128 * scale;
		this.loggedInName.sizey = 32 * scale;
		this.loggedInName.fontSize = 12 * scale;
		if (this.loggedInName.text.equals("")) {
			if (!p.getPreferences().getString("Password", "").equals("")) {
				this.loggedInName.text = p.getPreferences().getString("Username", "Invalid");
			}
		}
		this.logout.visible = !this.loggedInName.text.equals("");
		this.logout.x = p.getCanvasWidth() - 228 * scale;
		this.logout.y = 62 * scale;
		this.logout.sizex = 128 * scale;
		this.logout.sizey = 32 * scale;
		this.logout.fontSize = 12 * scale;
		this.logout.text = "Logout";
		this.menu.drawBackground();
		this.menu.drawText(this.title, 20 * scale, p.getCanvasWidth() / 2, 10, TextAlign.CENTER, TextBaseline.TOP);
		this.menu.drawText(p.intToString(this.page + 1), 14 * scale, p.getCanvasWidth() - 68 * scale, p.getCanvasHeight() / 2, TextAlign.CENTER, TextBaseline.MIDDLE);
		if (this.loading) {
			this.menu.drawText(this.menu.lang.get("MainMenu_MultiplayerLoading"), 14 * scale, 100 * scale, 50 * scale, TextAlign.LEFT, TextBaseline.TOP);
		}
		this.updateThumbnails();
		for (int i = 0; i < 1024; i++) {
			this.serverButtons[i].visible = false;
		}
		this.serversPerPage = this.menu.p.floatToInt((this.menu.p.getCanvasHeight() - 200 * scale) / 70 * scale);
		if (this.serversPerPage <= 0) {
			this.serversPerPage = 1;
		}
		for (int i = 0; i < this.serversPerPage; i++) {
			int index = i + this.serversPerPage * this.page;
			if (index > 1024) {
				this.page = 0;
				index = i + this.serversPerPage * this.page;
			}
			ServerOnList s = this.serversOnList[index];
			if (s == null) {
				continue;
			}
			String t = this.menu.p.stringFormat2("{1}", this.menu.p.intToString(index), s.name);
			t = this.menu.p.stringFormat2("{0}\n{1}", t, s.motd);
			t = this.menu.p.stringFormat2("{0}\n{1}", t, s.gamemode);
			t = this.menu.p.stringFormat2("{0}\n{1}", t, this.menu.p.intToString(s.users));
			t = this.menu.p.stringFormat2("{0}/{1}", t, this.menu.p.intToString(s.max));
			t = this.menu.p.stringFormat2("{0}\n{1}", t, s.version);
			this.serverButtons[i].text = t;
			this.serverButtons[i].x = 100 * scale;
			this.serverButtons[i].y = 100 * scale + i * 70 * scale;
			this.serverButtons[i].sizex = p.getCanvasWidth() - 200 * scale;
			this.serverButtons[i].sizey = 64 * scale;
			this.serverButtons[i].visible = true;
			this.serverButtons[i].buttonStyle = ButtonStyle.SERVER_ENTRY;
			if (s.thumbnailError) {
				this.serverButtons[i].description = "Server did not respond to query!";
			}
			else {
				this.serverButtons[i].description = null;
			}
			if (s.thumbnailFetched && !s.thumbnailError) {
				this.serverButtons[i].image = this.menu.p.stringFormat("serverlist_entry_{0}.png", s.hash);
			}
			else {
				this.serverButtons[i].image = "serverlist_entry_noimage.png";
			}
		}
		this.updateScrollButtons();
		this.drawWidgets();
	}

	public final void updateScrollButtons()
	{
		boolean maxpage = false;
		if ((this.page + 1) * this.serversPerPage >= 1024) {
			maxpage = true;
		}
		else {
			if (this.serversOnList[(this.page + 1) * this.serversPerPage] == null) {
				maxpage = true;
			}
		}
		if (this.page == 0) {
			this.pageDown.visible = false;
		}
		else {
			this.pageDown.visible = true;
		}
		if (maxpage) {
			this.pageUp.visible = false;
		}
		else {
			this.pageUp.visible = true;
		}
	}

	public final void updateThumbnails()
	{
		for (int i = 0; i < 1024; i++) {
			ServerOnList server = this.serversOnList[i];
			if (server == null) {
				continue;
			}
			if (server.thumbnailFetched) {
				continue;
			}
			if (!server.thumbnailDownloading) {
				this.thumbResponses[i] = new ThumbnailResponseCi();
				this.menu.p.thumbnailDownloadAsync(server.ip, server.port, this.thumbResponses[i]);
				server.thumbnailDownloading = true;
			}
			else {
				if (this.thumbResponses[i] != null) {
					if (this.thumbResponses[i].done) {
						BitmapCi bmp = this.menu.p.bitmapCreateFromPng(this.thumbResponses[i].data, this.thumbResponses[i].dataLength);
						if (bmp != null) {
							int texture = this.menu.p.loadTextureFromBitmap(bmp);
							this.menu.textures.set(this.menu.p.stringFormat("serverlist_entry_{0}.png", server.hash), texture);
							this.menu.p.bitmapDelete(bmp);
						}
						server.thumbnailDownloading = false;
						server.thumbnailFetched = true;
					}
					if (this.thumbResponses[i].error) {
						server.thumbnailDownloading = false;
						server.thumbnailError = true;
						server.thumbnailFetched = true;
					}
				}
				else {
					server.thumbnailDownloading = false;
					server.thumbnailError = true;
					server.thumbnailFetched = true;
				}
			}
		}
	}
	private MenuWidget back;
	private MenuWidget connect;
	private MenuWidget connectToIp;
	private boolean loaded;
	private boolean loading;
	private MenuWidget loggedInName;
	private MenuWidget logout;
	private int page;
	private MenuWidget pageDown;
	private MenuWidget pageUp;
	private MenuWidget refresh;
	private String selectedServerHash;
	private MenuWidget[] serverButtons;
	private HttpResponseCi serverListAddress;
	private HttpResponseCi serverListCsv;
	private ServerOnList[] serversOnList;
	private int serversPerPage;
	private ThumbnailResponseCi[] thumbResponses;
	private String title;
}
