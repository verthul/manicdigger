// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class GameScreen extends ClientMod
{
	public GameScreen()
	{
		this.widgetCount = 64;
		this.widgets = new MenuWidget[this.widgetCount];
	}

	public final String charRepeat(int c, int length)
	{
		int[] charArray = new int[length];
		for (int i = 0; i < length; i++) {
			charArray[i] = c;
		}
		return this.game.platform.charArrayToString(charArray, length);
	}

	public final String charToString(int a)
	{
		int[] arr = new int[1];
		arr[0] = a;
		return this.game.platform.charArrayToString(arr, 1);
	}

	public final void drawWidgets()
	{
		for (int i = 0; i < this.widgetCount; i++) {
			MenuWidget w = this.widgets[i];
			if (w != null) {
				if (!w.visible) {
					continue;
				}
				String text = w.text;
				if (w.selected) {
					text = StringTools.stringAppend(this.game.platform, "&2", text);
				}
				if (w.type == WidgetType.BUTTON) {
					if (w.buttonStyle == ButtonStyle.TEXT) {
					}
					else {
						if (w.image != null) {
							this.game.draw2dBitmapFile(w.image, this.screenx + w.x, this.screeny + w.y, w.sizex, w.sizey);
						}
						else {
							this.game.draw2dTexture(this.game.whiteTexture(), this.screenx + w.x, this.screeny + w.y, w.sizex, w.sizey, null, 0, w.color, false);
						}
						this.game.draw2dText1(text, this.screenx + this.game.platform.floatToInt(w.x), this.screeny + this.game.platform.floatToInt(w.y + w.sizey / 2), this.game.platform.floatToInt(w.fontSize), null, false);
					}
				}
				if (w.type == WidgetType.TEXTBOX) {
					if (w.password) {
						text = this.charRepeat(42, StringTools.stringLength(this.game.platform, w.text));
					}
					if (w.editing) {
						text = StringTools.stringAppend(this.game.platform, text, "_");
					}
					{
						this.game.draw2dText(text, w.font, this.screenx + w.x, this.screeny + w.y, null, false);
					}
					{
					}
				}
				if (w.type == WidgetType.LABEL) {
					this.game.draw2dText(text, w.font, this.screenx + w.x, this.screeny + w.y, IntRef.create(Game.colorFromArgb(255, 0, 0, 0)), false);
				}
				if (w.description != null) {
				}
			}
		}
	}

	private void keyDown(KeyEventArgs e)
	{
		for (int i = 0; i < this.widgetCount; i++) {
			MenuWidget w = this.widgets[i];
			if (w != null) {
				if (w.type == WidgetType.TEXTBOX) {
					if (w.editing) {
						int key = e.getKeyCode();
						if (e.getCtrlPressed() && key == 104) {
							if (this.game.platform.clipboardContainsText()) {
								w.text = StringTools.stringAppend(this.game.platform, w.text, this.game.platform.clipboardGetText());
							}
							return;
						}
						if (key == 53) {
							if (StringTools.stringLength(this.game.platform, w.text) > 0) {
								w.text = StringTools.stringSubstring(this.game.platform, w.text, 0, StringTools.stringLength(this.game.platform, w.text) - 1);
							}
							return;
						}
					}
				}
			}
		}
	}

	private void keyPress(KeyPressEventArgs e)
	{
		for (int i = 0; i < this.widgetCount; i++) {
			MenuWidget w = this.widgets[i];
			if (w != null) {
				if (w.type == WidgetType.TEXTBOX) {
					if (w.editing) {
						if (this.game.platform.isValidTypingChar(e.getKeyChar())) {
							w.text = StringTools.stringAppend(this.game.platform, w.text, this.charToString(e.getKeyChar()));
						}
					}
				}
			}
		}
	}

	private boolean mouseDown(int x, int y)
	{
		boolean handled = false;
		boolean editingChange = false;
		for (int i = 0; i < this.widgetCount; i++) {
			MenuWidget w = this.widgets[i];
			if (w != null) {
				if (w.type == WidgetType.BUTTON) {
					w.pressed = this.pointInRect(x, y, this.screenx + w.x, this.screeny + w.y, w.sizex, w.sizey);
					if (w.pressed) {
						handled = true;
					}
				}
				if (w.type == WidgetType.TEXTBOX) {
					w.pressed = this.pointInRect(x, y, this.screenx + w.x, this.screeny + w.y, w.sizex, w.sizey);
					if (w.pressed) {
						handled = true;
					}
					boolean wasEditing = w.editing;
					w.editing = w.pressed;
					if (w.editing && !wasEditing) {
						this.game.platform.showKeyboard(true);
						editingChange = true;
					}
					if (!w.editing && wasEditing && !editingChange) {
						this.game.platform.showKeyboard(false);
					}
				}
			}
		}
		return handled;
	}

	private void mouseMove(MouseEventArgs e)
	{
		if (e.getEmulated() && !e.getForceUsage()) {
			return;
		}
		for (int i = 0; i < this.widgetCount; i++) {
			MenuWidget w = this.widgets[i];
			if (w != null) {
				w.hover = this.pointInRect(e.getX(), e.getY(), this.screenx + w.x, this.screeny + w.y, w.sizex, w.sizey);
			}
		}
	}

	private void mouseUp(int x, int y)
	{
		for (int i = 0; i < this.widgetCount; i++) {
			MenuWidget w = this.widgets[i];
			if (w != null) {
				w.pressed = false;
			}
		}
		for (int i = 0; i < this.widgetCount; i++) {
			MenuWidget w = this.widgets[i];
			if (w != null) {
				if (w.type == WidgetType.BUTTON) {
					if (this.pointInRect(x, y, this.screenx + w.x, this.screeny + w.y, w.sizex, w.sizey)) {
						this.onButton(w);
					}
				}
			}
		}
	}

	public void onBackPressed()
	{
	}

	public void onButton(MenuWidget w)
	{
	}

	@Override
	public void onKeyDown(Game game_, KeyEventArgs args)
	{
		this.keyDown(args);
	}

	@Override
	public void onKeyPress(Game game_, KeyPressEventArgs args)
	{
		this.keyPress(args);
	}

	@Override
	public void onMouseDown(Game game_, MouseEventArgs args)
	{
		this.mouseDown(args.getX(), args.getY());
	}

	@Override
	public void onMouseMove(Game game_, MouseEventArgs args)
	{
		this.mouseMove(args);
	}

	@Override
	public void onMouseUp(Game game_, MouseEventArgs args)
	{
		this.mouseUp(args.getX(), args.getY());
	}

	public void onMouseWheel(MouseWheelEventArgs e)
	{
	}

	@Override
	public void onTouchEnd(Game game_, TouchEventArgs e)
	{
		this.screenOnTouchEnd(e);
	}

	@Override
	public void onTouchStart(Game game_, TouchEventArgs e)
	{
		this.screenOnTouchStart(e);
	}

	public final void screenOnTouchEnd(TouchEventArgs e)
	{
		this.mouseUp(e.getX(), e.getY());
	}

	public final void screenOnTouchStart(TouchEventArgs e)
	{
		e.setHandled(this.mouseDown(e.getX(), e.getY()));
	}
	int widgetCount;
	Game game;

	private boolean pointInRect(float x, float y, float rx, float ry, float rw, float rh)
	{
		return x >= rx && y >= ry && x < rx + rw && y < ry + rh;
	}
	int screenx;
	int screeny;
	MenuWidget[] widgets;
}
