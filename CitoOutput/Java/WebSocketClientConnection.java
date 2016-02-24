// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class WebSocketClientConnection extends NetConnection
{

	@Override
	public boolean equalsConnection(NetConnection connection)
	{
		return true;
	}

	@Override
	public IPEndPointCi remoteEndPoint()
	{
		return IPEndPointCiDefault.create(this.address);
	}

	@Override
	public void sendMessage(INetOutgoingMessage msg, int method, int sequenceChannel)
	{
		this.platform.webSocketSend(msg.message, msg.messageLength);
	}

	@Override
	public void update()
	{
	}
	String address;
	GamePlatform platform;
}
