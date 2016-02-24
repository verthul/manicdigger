// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class Text_
{

	final boolean equals_(Text_ t)
	{
		return this.text.equals(t.text) && this.fontsize == t.fontsize && this.color == t.color && this.fontfamily.equals(t.fontfamily) && this.fontstyle == t.fontstyle;
	}

	public final int getColor()
	{
		return this.color;
	}

	public final String getFontFamily()
	{
		return this.fontfamily;
	}

	public final float getFontSize()
	{
		return this.fontsize;
	}

	public final int getFontStyle()
	{
		return this.fontstyle;
	}

	public final String getText()
	{
		return this.text;
	}

	public final void setColor(int value)
	{
		this.color = value;
	}

	public final void setFontFamily(String value)
	{
		this.fontfamily = value;
	}

	public final void setFontSize(float value)
	{
		this.fontsize = value;
	}

	public final void setFontStyle(int value)
	{
		this.fontstyle = value;
	}

	public final void setText(String value)
	{
		this.text = value;
	}
	int color;
	String fontfamily;
	float fontsize;
	int fontstyle;
	String text;
}
