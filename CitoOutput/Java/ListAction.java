// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class ListAction
{

	final void add(Action_ action)
	{
		this.items[this.count++] = action;
	}

	final void clear()
	{
		for (int i = 0; i < this.count; i++) {
			this.items[i] = null;
		}
		this.count = 0;
	}

	final int count()
	{
		return this.count;
	}

	public static ListAction create(int max_)
	{
		ListAction l = new ListAction();
		l.start(max_);
		return l;
	}

	final void removeAt(int index)
	{
		for (int i = index; i < this.count - 1; i++) {
			this.items[i] = this.items[i + 1];
		}
		this.count--;
	}

	public final void start(int max_)
	{
		this.max = max_;
		this.items = new Action_[max_];
		this.count = 0;
	}
	int count;
	Action_[] items;
	int max;
}
