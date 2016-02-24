// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class DummyNetConnection extends NetConnection
{

	@Override
	public boolean equalsConnection(NetConnection connection)
	{
		return true;
	}

	@Override
	public IPEndPointCi remoteEndPoint()
	{
		return new DummyIpEndPoint();
	}

	@Override
	public void sendMessage(INetOutgoingMessage msg, int method, int sequenceChannel)
	{
		this.platform.monitorEnter(this.network.clientReceiveBufferLock);
		{
			INetOutgoingMessage msg2 = msg;
			ByteArray b = new ByteArray();
			b.data = msg2.message;
			b.length = msg2.messageLength;
			this.network.clientReceiveBuffer.enqueue(b);
		}
		this.platform.monitorExit(this.network.clientReceiveBufferLock);
	}

	@Override
	public void update()
	{
	}
	DummyNetwork network;
	GamePlatform platform;
}
