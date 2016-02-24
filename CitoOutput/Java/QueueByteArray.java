// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class QueueByteArray
{
	public QueueByteArray()
	{
		this.items = new ByteArray[1];
		this.itemsSize = 1;
		this.count = 0;
	}

	final int count()
	{
		return this.count;
	}

	final ByteArray dequeue()
	{
		ByteArray ret = this.items[0];
		for (int i = 0; i < this.count - 1; i++) {
			this.items[i] = this.items[i + 1];
		}
		this.count--;
		return ret;
	}

	final void enqueue(ByteArray p)
	{
		if (this.count == this.itemsSize) {
			ByteArray[] items2 = new ByteArray[this.itemsSize * 2];
			for (int i = 0; i < this.itemsSize; i++) {
				items2[i] = this.items[i];
			}
			this.itemsSize = this.itemsSize * 2;
			this.items = items2;
		}
		this.items[this.count++] = p;
	}
	private int count;
	private ByteArray[] items;
	private int itemsSize;
}
