// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class DummyNetwork
{
	public DummyNetwork()
	{
		this.clear();
	}

	public final void clear()
	{
		this.serverReceiveBuffer = new QueueByteArray();
		this.clientReceiveBuffer = new QueueByteArray();
	}
	QueueByteArray clientReceiveBuffer;
	MonitorObject clientReceiveBufferLock;
	QueueByteArray serverReceiveBuffer;
	MonitorObject serverReceiveBufferLock;

	public final void start(MonitorObject lock1, MonitorObject lock2)
	{
		this.serverReceiveBufferLock = lock1;
		this.clientReceiveBufferLock = lock2;
	}
}
