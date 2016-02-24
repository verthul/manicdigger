// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class EnetNetClient extends NetClient
{

	@Override
	public NetConnection connect(String ip, int port)
	{
		this.peer = this.platform.enetHostConnect(this.host, ip, port, 1234, 200);
		this.connected = true;
		return null;
	}

	private void doSendPacket(INetOutgoingMessage msg)
	{
		INetOutgoingMessage msg1 = msg;
		this.platform.enetPeerSend(this.peer, 0, msg1.message, msg1.messageLength, 1);
	}

	@Override
	public NetIncomingMessage readMessage()
	{
		if (!this.connected) {
			return null;
		}
		if (this.messages.count() > 0) {
			return this.messages.dequeue();
		}
		if (this.connected2) {
			while (this.tosend.count() > 0) {
				INetOutgoingMessage msg = this.tosend.dequeue();
				this.doSendPacket(msg);
			}
		}
		EnetEventRef event_ = new EnetEventRef();
		if (this.platform.enetHostService(this.host, 0, event_)) {
			do {
				switch (event_.e.type()) {
				case EnetEventType.CONNECT:
					this.connected2 = true;
					break;
				case EnetEventType.RECEIVE:
					byte[] data = event_.e.packet().getBytes();
					int dataLength = event_.e.packet().getBytesCount();
					event_.e.packet().dispose();
					NetIncomingMessage msg = new NetIncomingMessage();
					msg.message = data;
					msg.messageLength = dataLength;
					this.messages.enqueue(msg);
					break;
				}
			}
			while (this.platform.enetHostCheckEvents(this.host, event_));
		}
		if (this.messages.count() > 0) {
			return this.messages.dequeue();
		}
		return null;
	}

	@Override
	public void sendMessage(INetOutgoingMessage message, int method)
	{
		INetOutgoingMessage msg = message;
		if (!this.connected2) {
			this.tosend.enqueue(msg);
			return;
		}
		this.doSendPacket(msg);
	}

	public final void setPlatform(GamePlatform platform_)
	{
		this.platform = platform_;
	}

	@Override
	public void start()
	{
		this.host = this.platform.enetCreateHost();
		this.platform.enetHostInitialize(this.host, null, 1, 0, 0, 0);
		this.tosend = new QueueINetOutgoingMessage();
		this.messages = new QueueNetIncomingMessage();
	}
	private boolean connected;
	private boolean connected2;
	private EnetHost host;
	private QueueNetIncomingMessage messages;
	private EnetPeer peer;
	GamePlatform platform;
	private QueueINetOutgoingMessage tosend;
}
