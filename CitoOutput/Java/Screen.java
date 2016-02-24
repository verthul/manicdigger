// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class Screen
{
	public Screen()
	{
		this.widgetCount = 64;
		this.widgets = new MenuWidget[this.widgetCount];
	}

	private void allLoseFocus()
	{
		for (int i = 0; i < this.widgetCount; i++) {
			MenuWidget w = this.widgets[i];
			if (w != null) {
				w.loseFocus();
			}
		}
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
					text = StringTools.stringAppend(this.menu.p, "&2", text);
				}
				if (w.type == WidgetType.BUTTON) {
					if (w.buttonStyle == ButtonStyle.TEXT) {
						if (w.image != null) {
							this.menu.draw2dQuad(this.menu.getTexture(w.image), w.x, w.y, w.sizex, w.sizey);
						}
						this.menu.drawText(text, w.fontSize, w.x, w.y + w.sizey / 2, TextAlign.LEFT, TextBaseline.MIDDLE);
					}
					else if (w.buttonStyle == ButtonStyle.BUTTON) {
						this.menu.drawButton(text, w.fontSize, w.x, w.y, w.sizex, w.sizey, w.hover || w.hasKeyboardFocus);
						if (w.description != null) {
							this.menu.drawText(w.description, w.fontSize, w.x, w.y + w.sizey / 2, TextAlign.RIGHT, TextBaseline.MIDDLE);
						}
					}
					else {
						String[] strings = this.menu.p.stringSplit(w.text, "\n", new IntRef());
						if (w.selected) {
							strings[0] = StringTools.stringAppend(this.menu.p, "&2", strings[0]);
							strings[1] = StringTools.stringAppend(this.menu.p, "&2", strings[1]);
							strings[2] = StringTools.stringAppend(this.menu.p, "&2", strings[2]);
							strings[3] = StringTools.stringAppend(this.menu.p, "&2", strings[3]);
						}
						this.menu.drawServerButton(strings[0], strings[1], strings[2], strings[3], w.x, w.y, w.sizex, w.sizey, w.image);
						if (w.description != null) {
							this.menu.draw2dQuad(this.menu.getTexture("serverlist_entry_noresponse.png"), w.x - 38 * this.menu.getScale(), w.y, w.sizey / 2, w.sizey / 2);
						}
						if (!strings[4].equals(this.menu.p.getGameVersion())) {
							this.menu.draw2dQuad(this.menu.getTexture("serverlist_entry_differentversion.png"), w.x - 38 * this.menu.getScale(), w.y + w.sizey / 2, w.sizey / 2, w.sizey / 2);
						}
					}
				}
				if (w.type == WidgetType.TEXTBOX) {
					if (w.password) {
						text = this.menu.charRepeat(42, this.menu.stringLength(w.text));
					}
					if (w.editing) {
						text = StringTools.stringAppend(this.menu.p, text, "_");
					}
					if (w.buttonStyle == ButtonStyle.TEXT) {
						if (w.image != null) {
							this.menu.draw2dQuad(this.menu.getTexture(w.image), w.x, w.y, w.sizex, w.sizey);
						}
						this.menu.drawText(text, w.fontSize, w.x, w.y, TextAlign.LEFT, TextBaseline.TOP);
					}
					else {
						this.menu.drawButton(text, w.fontSize, w.x, w.y, w.sizex, w.sizey, w.hover || w.editing || w.hasKeyboardFocus);
					}
					if (w.description != null) {
						this.menu.drawText(w.description, w.fontSize, w.x, w.y + w.sizey / 2, TextAlign.RIGHT, TextBaseline.MIDDLE);
					}
				}
			}
		}
	}

	private void keyDown(KeyEventArgs e)
	{
		for (int i = 0; i < this.widgetCount; i++) {
			MenuWidget w = this.widgets[i];
			if (w == null) {
				continue;
			}
			if (w.hasKeyboardFocus) {
				if (e.getKeyCode() == 52 || e.getKeyCode() == 49) {
					if (w.type == WidgetType.BUTTON && e.getKeyCode() == 49) {
						this.onButton(w);
						return;
					}
					if (w.nextWidget != -1) {
						w.loseFocus();
						this.widgets[w.nextWidget].getFocus();
						return;
					}
				}
			}
			if (w.type == WidgetType.TEXTBOX) {
				if (w.editing) {
					int key = e.getKeyCode();
					if (e.getCtrlPressed() && key == 104) {
						if (this.menu.p.clipboardContainsText()) {
							w.text = StringTools.stringAppend(this.menu.p, w.text, this.menu.p.clipboardGetText());
						}
						return;
					}
					if (key == 53) {
						if (this.menu.stringLength(w.text) > 0) {
							w.text = StringTools.stringSubstring(this.menu.p, w.text, 0, this.menu.stringLength(w.text) - 1);
						}
						return;
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
						if (this.menu.p.isValidTypingChar(e.getKeyChar())) {
							w.text = StringTools.stringAppend(this.menu.p, w.text, this.menu.charToString(e.getKeyChar()));
						}
					}
				}
			}
		}
	}

	public void loadTranslations()
	{
	}

	private void mouseDown(int x, int y)
	{
		boolean editingChange = false;
		for (int i = 0; i < this.widgetCount; i++) {
			MenuWidget w = this.widgets[i];
			if (w != null) {
				if (w.type == WidgetType.BUTTON) {
					w.pressed = this.pointInRect(x, y, w.x, w.y, w.sizex, w.sizey);
				}
				if (w.type == WidgetType.TEXTBOX) {
					w.pressed = this.pointInRect(x, y, w.x, w.y, w.sizex, w.sizey);
					boolean wasEditing = w.editing;
					w.editing = w.pressed;
					if (w.editing && !wasEditing) {
						this.menu.p.showKeyboard(true);
						editingChange = true;
					}
					if (!w.editing && wasEditing && !editingChange) {
						this.menu.p.showKeyboard(false);
					}
				}
				if (w.pressed) {
					this.allLoseFocus();
					w.getFocus();
				}
			}
		}
	}

	private void mouseMove(MouseEventArgs e)
	{
		if (e.getEmulated() && !e.getForceUsage()) {
			return;
		}
		for (int i = 0; i < this.widgetCount; i++) {
			MenuWidget w = this.widgets[i];
			if (w != null) {
				w.hover = this.pointInRect(e.getX(), e.getY(), w.x, w.y, w.sizex, w.sizey);
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
					if (this.pointInRect(x, y, w.x, w.y, w.sizex, w.sizey)) {
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

	public void onKeyDown(KeyEventArgs e)
	{
		this.keyDown(e);
	}

	public void onKeyPress(KeyPressEventArgs e)
	{
		this.keyPress(e);
	}

	public void onKeyUp(KeyEventArgs e)
	{
	}

	public void onMouseDown(MouseEventArgs e)
	{
		this.mouseDown(e.getX(), e.getY());
	}

	public void onMouseMove(MouseEventArgs e)
	{
		this.mouseMove(e);
	}

	public void onMouseUp(MouseEventArgs e)
	{
		this.mouseUp(e.getX(), e.getY());
	}

	public void onMouseWheel(MouseWheelEventArgs e)
	{
	}

	public void onTouchEnd(TouchEventArgs e)
	{
		this.mouseUp(e.getX(), e.getY());
	}

	public void onTouchMove(TouchEventArgs e)
	{
	}

	public void onTouchStart(TouchEventArgs e)
	{
		this.mouseDown(e.getX(), e.getY());
	}

	public void render(float dt)
	{
	}
	int widgetCount;
	MainMenu menu;

	private boolean pointInRect(float x, float y, float rx, float ry, float rw, float rh)
	{
		return x >= rx && y >= ry && x < rx + rw && y < ry + rh;
	}
	MenuWidget[] widgets;
}
