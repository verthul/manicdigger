// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class EnetNetServer extends NetServer
{
	public EnetNetServer()
	{
		this.event_ = new EnetEventRef();
		this.messages = new QueueNetIncomingMessage();
	}
	private int port;

	@Override
	public NetIncomingMessage readMessage()
	{
		if (this.messages.count() > 0) {
			return this.messages.dequeue();
		}
		if (this.platform.enetHostService(this.host, 0, this.event_)) {
			do {
				switch (this.event_.e.type()) {
				case EnetEventType.CONNECT:
					{
						EnetPeer peer = this.event_.e.peer();
						peer.setUserData(this.clientid++);
						EnetNetConnection senderConnectionConnect = new EnetNetConnection();
						senderConnectionConnect.platform = this.platform;
						senderConnectionConnect.peer = this.event_.e.peer();
						NetIncomingMessage message = new NetIncomingMessage();
						message.senderConnection = senderConnectionConnect;
						message.type = NetworkMessageType.CONNECT;
						this.messages.enqueue(message);
					}
					break;
				case EnetEventType.RECEIVE:
					{
						byte[] data = this.event_.e.packet().getBytes();
						this.event_.e.packet().dispose();
						EnetNetConnection senderConnectionReceive = new EnetNetConnection();
						senderConnectionReceive.platform = this.platform;
						senderConnectionReceive.peer = this.event_.e.peer();
						NetIncomingMessage message = new NetIncomingMessage();
						message.senderConnection = senderConnectionReceive;
						message.message = data;
						message.type = NetworkMessageType.DATA;
						this.messages.enqueue(message);
					}
					break;
				case EnetEventType.DISCONNECT:
					{
						EnetNetConnection senderConnectionDisconnect = new EnetNetConnection();
						senderConnectionDisconnect.platform = this.platform;
						senderConnectionDisconnect.peer = this.event_.e.peer();
						NetIncomingMessage message = new NetIncomingMessage();
						message.senderConnection = senderConnectionDisconnect;
						message.type = NetworkMessageType.DISCONNECT;
						this.messages.enqueue(message);
					}
					break;
				}
			}
			while (this.platform.enetHostCheckEvents(this.host, this.event_));
		}
		if (this.messages.count() > 0) {
			return this.messages.dequeue();
		}
		return null;
	}

	@Override
	public void setPort(int port)
	{
		this.port = port;
	}

	@Override
	public void start()
	{
		this.host = this.platform.enetCreateHost();
		this.platform.enetHostInitializeServer(this.host, this.port, 256);
	}
	private int clientid;
	private EnetEventRef event_;
	private EnetHost host;
	private QueueNetIncomingMessage messages;
	GamePlatform platform;
}
