// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class WebSocketClient extends NetClient
{
	public WebSocketClient()
	{
		this.incomingData = new byte[16384];
	}

	@Override
	public NetConnection connect(String ip, int port)
	{
		this.p.webSocketConnect(ip, port);
		this.c.address = this.p.stringFormat2("{0}:{1}", ip, this.p.intToString(port));
		this.c.platform = this.p;
		return this.c;
	}

	@Override
	public NetIncomingMessage readMessage()
	{
		int received = this.p.webSocketReceive(this.incomingData, 16384);
		if (received == -1) {
			return null;
		}
		else {
			NetIncomingMessage msg = new NetIncomingMessage();
			msg.message = this.incomingData;
			msg.messageLength = received;
			msg.senderConnection = this.c;
			return msg;
		}
	}

	@Override
	public void sendMessage(INetOutgoingMessage message, int method)
	{
		this.c.sendMessage(message, method, 0);
	}

	final void setPlatform(GamePlatform platform)
	{
		this.p = platform;
	}

	@Override
	public void start()
	{
		this.c = new WebSocketClientConnection();
	}
	private WebSocketClientConnection c;
	private byte[] incomingData;
	private GamePlatform p;
}
