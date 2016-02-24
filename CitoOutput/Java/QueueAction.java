// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class QueueAction
{
	public QueueAction()
	{
		this.start(128);
	}

	public final int count()
	{
		return this.count;
	}

	public static QueueAction create(int max_)
	{
		QueueAction queue = new QueueAction();
		queue.start(max_);
		return queue;
	}

	public final Action_ dequeue()
	{
		Action_ ret = this.items[this.start];
		this.items[this.start] = null;
		this.start++;
		this.start = this.start % this.max;
		this.count--;
		return ret;
	}

	public final void enqueue(Action_ value)
	{
		if (this.count == this.max) {
			this.resize(this.max * 2);
		}
		int pos = this.start + this.count;
		pos = pos % this.max;
		this.count++;
		this.items[pos] = value;
	}

	private void resize(int newSize)
	{
		Action_[] items2 = new Action_[newSize];
		for (int i = 0; i < this.max; i++) {
			items2[i] = this.items[(this.start + i) % this.max];
		}
		this.items = items2;
		this.start = 0;
		this.max = newSize;
	}

	private void start(int max_)
	{
		this.max = max_;
		this.items = new Action_[max_];
		this.count = 0;
	}
	int count;
	Action_[] items;
	int max;
	int start;
}
