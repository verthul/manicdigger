// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class ScreenSingleplayer extends Screen
{
	public ScreenSingleplayer()
	{
		this.play = new MenuWidget();
		this.play.text = "Play";
		this.newWorld = new MenuWidget();
		this.newWorld.text = "New World";
		this.modify = new MenuWidget();
		this.modify.text = "Modify";
		this.back = new MenuWidget();
		this.back.text = "Back";
		this.back.type = WidgetType.BUTTON;
		this.open = new MenuWidget();
		this.open.text = "Create or open...";
		this.open.type = WidgetType.BUTTON;
		this.title = "Singleplayer";
		this.widgets[0] = this.play;
		this.widgets[1] = this.newWorld;
		this.widgets[2] = this.modify;
		this.widgets[3] = this.back;
		this.widgets[4] = this.open;
		this.worldButtons = new MenuWidget[10];
		for (int i = 0; i < 10; i++) {
			this.worldButtons[i] = new MenuWidget();
			this.worldButtons[i].visible = false;
			this.widgets[5 + i] = this.worldButtons[i];
		}
	}

	@Override
	public void loadTranslations()
	{
		this.back.text = this.menu.lang.get("MainMenu_ButtonBack");
		this.open.text = this.menu.lang.get("MainMenu_SingleplayerButtonCreate");
		this.title = this.menu.lang.get("MainMenu_Singleplayer");
	}

	@Override
	public void onBackPressed()
	{
		this.menu.startMainMenu();
	}

	@Override
	public void onButton(MenuWidget w)
	{
		for (int i = 0; i < 10; i++) {
			this.worldButtons[i].selected = false;
		}
		for (int i = 0; i < 10; i++) {
			if (this.worldButtons[i] == w) {
				this.worldButtons[i].selected = true;
			}
		}
		if (w == this.newWorld) {
			this.menu.startNewWorld();
		}
		if (w == this.play) {
		}
		if (w == this.modify) {
			this.menu.startModifyWorld();
		}
		if (w == this.back) {
			this.onBackPressed();
		}
		if (w == this.open) {
			String extension;
			if (this.menu.p.singlePlayerServerAvailable()) {
				extension = "mddbs";
			}
			else {
				extension = "mdss";
			}
			String result = this.menu.p.fileOpenDialog(extension, "Manic Digger Savegame", this.menu.p.pathSavegames());
			if (result != null) {
				this.menu.connectToSingleplayer(result);
			}
		}
	}

	@Override
	public void render(float dt)
	{
		GamePlatform p = this.menu.p;
		float scale = this.menu.getScale();
		this.menu.drawBackground();
		this.menu.drawText(this.title, 20 * scale, p.getCanvasWidth() / 2, 10, TextAlign.CENTER, TextBaseline.TOP);
		float leftx = p.getCanvasWidth() / 2 - 128 * scale;
		float y = p.getCanvasHeight() / 2 + 0 * scale;
		this.play.x = leftx;
		this.play.y = y + 100 * scale;
		this.play.sizex = 256 * scale;
		this.play.sizey = 64 * scale;
		this.play.fontSize = 14 * scale;
		this.newWorld.x = leftx;
		this.newWorld.y = y + 170 * scale;
		this.newWorld.sizex = 256 * scale;
		this.newWorld.sizey = 64 * scale;
		this.newWorld.fontSize = 14 * scale;
		this.modify.x = leftx;
		this.modify.y = y + 240 * scale;
		this.modify.sizex = 256 * scale;
		this.modify.sizey = 64 * scale;
		this.modify.fontSize = 14 * scale;
		this.back.x = 40 * scale;
		this.back.y = p.getCanvasHeight() - 104 * scale;
		this.back.sizex = 256 * scale;
		this.back.sizey = 64 * scale;
		this.back.fontSize = 14 * scale;
		this.open.x = leftx;
		this.open.y = y + 0 * scale;
		this.open.sizex = 256 * scale;
		this.open.sizey = 64 * scale;
		this.open.fontSize = 14 * scale;
		if (this.savegames == null) {
			IntRef savegamesCount_ = new IntRef();
			this.savegames = this.menu.getSavegames(savegamesCount_);
			this.savegamesCount = savegamesCount_.value;
		}
		for (int i = 0; i < 10; i++) {
			this.worldButtons[i].visible = false;
		}
		for (int i = 0; i < this.savegamesCount; i++) {
			this.worldButtons[i].visible = true;
			this.worldButtons[i].text = this.menu.p.fileName(this.savegames[i]);
			this.worldButtons[i].x = leftx;
			this.worldButtons[i].y = 100 + 100 * scale * i;
			this.worldButtons[i].sizex = 256 * scale;
			this.worldButtons[i].sizey = 64 * scale;
			this.worldButtons[i].fontSize = 14 * scale;
		}
		this.open.visible = this.menu.p.singlePlayerServerAvailable();
		this.play.visible = false;
		this.newWorld.visible = false;
		this.modify.visible = false;
		for (int i = 0; i < this.savegamesCount; i++) {
			this.worldButtons[i].visible = false;
		}
		this.drawWidgets();
		if (!this.menu.p.singlePlayerServerAvailable()) {
			this.menu.drawText("Singleplayer is only available on desktop (Windows, Linux, Mac) version of game.", 16 * scale, this.menu.p.getCanvasWidth() / 2, this.menu.p.getCanvasHeight() / 2, TextAlign.CENTER, TextBaseline.MIDDLE);
		}
	}
	private MenuWidget back;
	private MenuWidget modify;
	private MenuWidget newWorld;
	private MenuWidget open;
	private MenuWidget play;
	private String[] savegames;
	private int savegamesCount;
	private String title;
	private MenuWidget[] worldButtons;
}
