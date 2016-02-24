// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class DummyNetServer extends NetServer
{
	public DummyNetServer()
	{
		this.connectedClient = new DummyNetConnection();
	}

	@Override
	public NetIncomingMessage readMessage()
	{
		this.connectedClient.network = this.network;
		this.connectedClient.platform = this.platform;
		NetIncomingMessage msg = null;
		this.platform.monitorEnter(this.network.serverReceiveBufferLock);
		{
			if (this.network.serverReceiveBuffer.count() > 0) {
				if (!this.receivedAnyMessage) {
					this.receivedAnyMessage = true;
					msg = new NetIncomingMessage();
					msg.type = NetworkMessageType.CONNECT;
					msg.senderConnection = this.connectedClient;
				}
				else {
					msg = new NetIncomingMessage();
					ByteArray b = this.network.serverReceiveBuffer.dequeue();
					msg.message = b.data;
					msg.messageLength = b.length;
					msg.senderConnection = this.connectedClient;
				}
			}
		}
		this.platform.monitorExit(this.network.serverReceiveBufferLock);
		return msg;
	}

	public final void setNetwork(DummyNetwork dummyNetwork)
	{
		this.network = dummyNetwork;
	}

	public final void setPlatform(GamePlatform gamePlatform)
	{
		this.platform = gamePlatform;
	}

	@Override
	public void setPort(int port)
	{
	}

	@Override
	public void start()
	{
	}
	private DummyNetConnection connectedClient;
	DummyNetwork network;
	GamePlatform platform;
	private boolean receivedAnyMessage;
}
