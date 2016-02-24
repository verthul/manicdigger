// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class MenuWidget
{
	public MenuWidget()
	{
		this.visible = true;
		this.fontSize = 14;
		this.nextWidget = -1;
		this.hasKeyboardFocus = false;
	}

	public final void getFocus()
	{
		this.hasKeyboardFocus = true;
		if (this.type == WidgetType.TEXTBOX) {
			this.editing = true;
		}
	}

	public final void loseFocus()
	{
		this.hasKeyboardFocus = false;
		if (this.type == WidgetType.TEXTBOX) {
			this.editing = false;
		}
	}
	int buttonStyle;
	int color;
	String description;
	boolean editing;
	FontCi font;
	float fontSize;
	boolean hasKeyboardFocus;
	boolean hover;
	String id;
	String image;
	boolean isbutton;
	int nextWidget;
	boolean password;
	boolean pressed;
	boolean selected;
	float sizex;
	float sizey;
	String text;
	int type;
	boolean visible;
	float x;
	float y;
}
