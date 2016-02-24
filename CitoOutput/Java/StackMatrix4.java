// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class StackMatrix4
{
	public StackMatrix4()
	{
		this.values = new float[1024][];
		for (int i = 0; i < 1024; i++) {
			this.values[i] = Mat4.create();
		}
	}

	final int count()
	{
		return this.count_;
	}

	final float[] peek()
	{
		return this.values[this.count_ - 1];
	}

	final float[] pop()
	{
		float[] ret = this.values[this.count_ - 1];
		this.count_--;
		return ret;
	}

	final void push(float[] p)
	{
		Mat4.copy(this.values[this.count_], p);
		this.count_++;
	}
	private int count_;
	private float[][] values;
}
