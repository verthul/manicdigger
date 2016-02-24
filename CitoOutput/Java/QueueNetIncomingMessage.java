// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class QueueNetIncomingMessage
{
	public QueueNetIncomingMessage()
	{
		this.items = new NetIncomingMessage[1];
		this.itemsSize = 1;
		this.count = 0;
	}

	final int count()
	{
		return this.count;
	}

	final NetIncomingMessage dequeue()
	{
		NetIncomingMessage ret = this.items[0];
		for (int i = 0; i < this.count - 1; i++) {
			this.items[i] = this.items[i + 1];
		}
		this.count--;
		return ret;
	}

	final void enqueue(NetIncomingMessage p)
	{
		if (this.count == this.itemsSize) {
			NetIncomingMessage[] items2 = new NetIncomingMessage[this.itemsSize * 2];
			for (int i = 0; i < this.itemsSize; i++) {
				items2[i] = this.items[i];
			}
			this.itemsSize = this.itemsSize * 2;
			this.items = items2;
		}
		this.items[this.count++] = p;
	}
	private int count;
	private NetIncomingMessage[] items;
	private int itemsSize;
}
