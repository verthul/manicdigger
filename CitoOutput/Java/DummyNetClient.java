// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class DummyNetClient extends NetClient
{

	@Override
	public NetConnection connect(String ip, int port)
	{
		return new DummyNetConnection();
	}

	@Override
	public NetIncomingMessage readMessage()
	{
		NetIncomingMessage msg = null;
		this.platform.monitorEnter(this.network.clientReceiveBufferLock);
		{
			if (this.network.clientReceiveBuffer.count() > 0) {
				msg = new NetIncomingMessage();
				ByteArray b = this.network.clientReceiveBuffer.dequeue();
				msg.message = b.data;
				msg.messageLength = b.length;
			}
		}
		this.platform.monitorExit(this.network.clientReceiveBufferLock);
		return msg;
	}

	@Override
	public void sendMessage(INetOutgoingMessage message, int method)
	{
		this.platform.monitorEnter(this.network.serverReceiveBufferLock);
		{
			INetOutgoingMessage msg = message;
			ByteArray b = new ByteArray();
			b.data = msg.message;
			b.length = msg.messageLength;
			this.network.serverReceiveBuffer.enqueue(b);
		}
		this.platform.monitorExit(this.network.serverReceiveBufferLock);
	}

	public final void setNetwork(DummyNetwork network_)
	{
		this.network = network_;
	}

	public final void setPlatform(GamePlatform gamePlatform)
	{
		this.platform = gamePlatform;
	}

	@Override
	public void start()
	{
	}
	DummyNetwork network;
	GamePlatform platform;
}
