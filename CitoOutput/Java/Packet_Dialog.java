// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class Packet_Dialog
{

	public final int getHeight_()
	{
		return this.height_;
	}

	public final int getIsModal()
	{
		return this.isModal;
	}

	public final Packet_Widget[] getWidgets()
	{
		return this.widgets;
	}

	public final int getWidgetsCount()
	{
		return this.widgetsCount;
	}

	public final int getWidgetsLength()
	{
		return this.widgetsLength;
	}

	public final int getWidth()
	{
		return this.width;
	}
	int height_;
	int isModal;

	public final void setHeight_(int value)
	{
		this.height_ = value;
	}

	public final void setIsModal(int value)
	{
		this.isModal = value;
	}

	public final void setWidgets(Packet_Widget[] value, int count, int length)
	{
		this.widgets = value;
		this.widgetsCount = count;
		this.widgetsLength = length;
	}

	public final void setWidth(int value)
	{
		this.width = value;
	}
	Packet_Widget[] widgets;

	public final void widgetsAdd(Packet_Widget value)
	{
		if (this.widgetsCount >= this.widgetsLength) {
			Packet_Widget[] Widgets2 = new Packet_Widget[this.widgetsLength * 2];
			this.widgetsLength = this.widgetsLength * 2;
			for (int i = 0; i < this.widgetsCount; i++) {
				Widgets2[i] = this.widgets[i];
			}
			this.widgets = Widgets2;
		}
		this.widgets[this.widgetsCount] = value;
		this.widgetsCount++;
	}
	int widgetsCount;
	int widgetsLength;
	int width;
}
