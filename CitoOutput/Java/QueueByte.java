// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class QueueByte
{
	public QueueByte()
	{
		this.max = 5242880;
		this.items = new byte[this.max];
	}

	public final byte dequeue()
	{
		byte ret = this.items[this.start];
		this.start++;
		this.start = this.start % this.max;
		this.count--;
		return ret;
	}

	public final void dequeueRange(byte[] data, int length)
	{
		for (int i = 0; i < length; i++) {
			data[i] = this.dequeue();
		}
	}

	public final void enqueue(byte value)
	{
		int pos = this.start + this.count;
		pos = pos % this.max;
		this.count++;
		this.items[pos] = value;
	}

	public final int getCount()
	{
		return this.count;
	}

	final void peekRange(byte[] data, int length)
	{
		for (int i = 0; i < length; i++) {
			data[i] = this.items[(this.start + i) % this.max];
		}
	}
	int count;
	private byte[] items;
	int max;
	int start;
}
