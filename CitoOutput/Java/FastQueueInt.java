// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class FastQueueInt
{

	public final void clear()
	{
		this.count = 0;
	}
	int count;

	public final void initialize(int maxCount)
	{
		this.maxCount = maxCount;
		this.values = new int[maxCount];
		this.count = 0;
		this.start = 0;
		this.end = 0;
	}

	public final int pop()
	{
		int value = this.values[this.start];
		this.count--;
		this.start++;
		if (this.start >= this.maxCount) {
			this.start = 0;
		}
		return value;
	}

	public final void push(int value)
	{
		this.values[this.end] = value;
		this.count++;
		this.end++;
		if (this.end >= this.maxCount) {
			this.end = 0;
		}
	}
	private int end;
	private int maxCount;
	private int start;
	private int[] values;
}
