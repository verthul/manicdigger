// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class QueueINetOutgoingMessage
{
	public QueueINetOutgoingMessage()
	{
		this.items = new INetOutgoingMessage[1];
		this.itemsSize = 1;
		this.count = 0;
	}

	final int count()
	{
		return this.count;
	}

	final INetOutgoingMessage dequeue()
	{
		INetOutgoingMessage ret = this.items[0];
		for (int i = 0; i < this.count - 1; i++) {
			this.items[i] = this.items[i + 1];
		}
		this.count--;
		return ret;
	}

	final void enqueue(INetOutgoingMessage p)
	{
		if (this.count == this.itemsSize) {
			INetOutgoingMessage[] items2 = new INetOutgoingMessage[this.itemsSize * 2];
			for (int i = 0; i < this.itemsSize; i++) {
				items2[i] = this.items[i];
			}
			this.itemsSize = this.itemsSize * 2;
			this.items = items2;
		}
		this.items[this.count++] = p;
	}
	private int count;
	private INetOutgoingMessage[] items;
	private int itemsSize;
}
