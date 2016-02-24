// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class ScreenModifyWorld extends Screen
{
	public ScreenModifyWorld()
	{
		this.back = new MenuWidget();
		this.back.text = "Back";
		this.back.type = WidgetType.BUTTON;
		this.widgets[0] = this.back;
	}

	@Override
	public void onBackPressed()
	{
		this.menu.startSingleplayer();
	}

	@Override
	public void onButton(MenuWidget w)
	{
		if (w == this.back) {
			this.onBackPressed();
		}
	}

	@Override
	public void render(float dt)
	{
		GamePlatform p = this.menu.p;
		float scale = this.menu.getScale();
		this.menu.drawBackground();
		this.menu.drawText("Modify World", 14 * scale, this.menu.p.getCanvasWidth() / 2, 0, TextAlign.CENTER, TextBaseline.TOP);
		this.back.x = 40 * scale;
		this.back.y = p.getCanvasHeight() - 104 * scale;
		this.back.sizex = 256 * scale;
		this.back.sizey = 64 * scale;
		this.back.fontSize = 14 * scale;
		this.drawWidgets();
	}
	private MenuWidget back;
}
