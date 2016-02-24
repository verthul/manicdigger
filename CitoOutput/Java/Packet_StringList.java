// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class Packet_StringList
{

	public final String[] getItems()
	{
		return this.items;
	}

	public final int getItemsCount()
	{
		return this.itemsCount;
	}

	public final int getItemsLength()
	{
		return this.itemsLength;
	}
	String[] items;

	public final void itemsAdd(String value)
	{
		if (this.itemsCount >= this.itemsLength) {
			String[] Items2 = new String[this.itemsLength * 2];
			this.itemsLength = this.itemsLength * 2;
			for (int i = 0; i < this.itemsCount; i++) {
				Items2[i] = this.items[i];
			}
			this.items = Items2;
		}
		this.items[this.itemsCount] = value;
		this.itemsCount++;
	}
	int itemsCount;
	int itemsLength;

	public final void setItems(String[] value, int count, int length)
	{
		this.items = value;
		this.itemsCount = count;
		this.itemsLength = length;
	}
}
