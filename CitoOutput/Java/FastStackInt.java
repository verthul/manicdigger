// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class FastStackInt
{

	public final void clear()
	{
		this.count = 0;
	}

	final int count_()
	{
		return this.count;
	}

	public final void initialize(int maxCount)
	{
		this.valuesLength = maxCount;
		this.values = new int[maxCount];
	}

	public final int pop()
	{
		this.count--;
		return this.values[this.count];
	}

	public final void push(int value)
	{
		while (this.count >= this.valuesLength) {
			int[] values2 = new int[this.valuesLength * 2];
			for (int i = 0; i < this.valuesLength; i++) {
				values2[i] = this.values[i];
			}
			this.values = values2;
			this.valuesLength = this.valuesLength * 2;
		}
		this.values[this.count] = value;
		this.count++;
	}
	int count;
	private int[] values;
	private int valuesLength;
}
