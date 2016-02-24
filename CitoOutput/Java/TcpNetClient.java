// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class TcpNetClient extends NetClient
{
	public TcpNetClient()
	{
		this.incoming = new QueueByte();
		this.data = new byte[1024];
		this.connected = new BoolRef();
	}

	@Override
	public NetConnection connect(String ip, int port)
	{
		this.platform.tcpConnect(ip, port, this.connected);
		return null;
	}

	private void doSendPacket(INetOutgoingMessage msg)
	{
		byte[] packet = new byte[msg.messageLength + 4];
		this.writeInt(packet, 0, msg.messageLength);
		for (int i = 0; i < msg.messageLength; i++) {
			packet[i + 4] = msg.message[i];
		}
		this.platform.tcpSend(packet, msg.messageLength + 4);
	}

	private NetIncomingMessage getMessage()
	{
		if (this.incoming.count >= 4) {
			byte[] length = new byte[4];
			this.incoming.peekRange(length, 4);
			int messageLength = this.readInt(length, 0);
			if (this.incoming.count >= 4 + messageLength) {
				this.incoming.dequeueRange(new byte[4], 4);
				NetIncomingMessage msg = new NetIncomingMessage();
				msg.message = new byte[messageLength];
				msg.messageLength = messageLength;
				this.incoming.dequeueRange(msg.message, msg.messageLength);
				return msg;
			}
		}
		return null;
	}
	public static final int MAX_PACKET_LENGTH = 4096;

	private int readInt(byte[] readBuf, int readPos)
	{
		int n = (readBuf[readPos] & 0xff) << 24;
		n |= (readBuf[readPos + 1] & 0xff) << 16;
		n |= (readBuf[readPos + 2] & 0xff) << 8;
		n |= readBuf[readPos + 3] & 0xff;
		return n;
	}

	@Override
	public NetIncomingMessage readMessage()
	{
		if (this.connected.value) {
			while (this.tosend.count() > 0) {
				INetOutgoingMessage msg = this.tosend.dequeue();
				this.doSendPacket(msg);
			}
		}
		NetIncomingMessage message = this.getMessage();
		if (message != null) {
			return message;
		}
		for (int k = 0; k < 1; k++) {
			int received = this.platform.tcpReceive(this.data, 1024);
			if (received <= 0) {
				break;
			}
			for (int i = 0; i < received; i++) {
				this.incoming.enqueue(this.data[i]);
			}
		}
		message = this.getMessage();
		if (message != null) {
			return message;
		}
		return null;
	}

	@Override
	public void sendMessage(INetOutgoingMessage message, int method)
	{
		INetOutgoingMessage msg = message;
		if (!this.connected.value) {
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
		this.tosend = new QueueINetOutgoingMessage();
	}

	private void writeInt(byte[] writeBuf, int writePos, int n)
	{
		int a = n >> 24 & 255;
		int b = n >> 16 & 255;
		int c = n >> 8 & 255;
		int d = n & 255;
		writeBuf[writePos] = Game.intToByte(a);
		writeBuf[writePos + 1] = Game.intToByte(b);
		writeBuf[writePos + 2] = Game.intToByte(c);
		writeBuf[writePos + 3] = Game.intToByte(d);
	}
	private BoolRef connected;
	private byte[] data;
	private QueueByte incoming;
	GamePlatform platform;
	private QueueINetOutgoingMessage tosend;
}
