// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class ListConnectedPlayer
{
	public ListConnectedPlayer()
	{
		this.items = new ConnectedPlayer[1024];
		this.count = 0;
	}

	final void add(ConnectedPlayer connectedPlayer)
	{
		this.items[this.count++] = connectedPlayer;
	}

	final void removeAt(int at)
	{
		for (int i = at; i < this.count - 1; i++) {
			this.items[i] = this.items[i + 1];
		}
		this.count--;
	}
	int count;
	ConnectedPlayer[] items;
}
