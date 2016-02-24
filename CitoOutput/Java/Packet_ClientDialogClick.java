// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class Packet_ClientDialogClick
{

	public final String[] getTextBoxValue()
	{
		return this.textBoxValue;
	}

	public final int getTextBoxValueCount()
	{
		return this.textBoxValueCount;
	}

	public final int getTextBoxValueLength()
	{
		return this.textBoxValueLength;
	}

	public final String getWidgetId()
	{
		return this.widgetId;
	}

	public final void setTextBoxValue(String[] value, int count, int length)
	{
		this.textBoxValue = value;
		this.textBoxValueCount = count;
		this.textBoxValueLength = length;
	}

	public final void setWidgetId(String value)
	{
		this.widgetId = value;
	}
	String[] textBoxValue;

	public final void textBoxValueAdd(String value)
	{
		if (this.textBoxValueCount >= this.textBoxValueLength) {
			String[] TextBoxValue2 = new String[this.textBoxValueLength * 2];
			this.textBoxValueLength = this.textBoxValueLength * 2;
			for (int i = 0; i < this.textBoxValueCount; i++) {
				TextBoxValue2[i] = this.textBoxValue[i];
			}
			this.textBoxValue = TextBoxValue2;
		}
		this.textBoxValue[this.textBoxValueCount] = value;
		this.textBoxValueCount++;
	}
	int textBoxValueCount;
	int textBoxValueLength;
	String widgetId;
}
