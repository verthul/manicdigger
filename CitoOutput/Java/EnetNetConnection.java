// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class EnetNetConnection extends NetConnection
{

	@Override
	public boolean equalsConnection(NetConnection connection)
	{
		return this.peer.userData() == this.platform.castToEnetNetConnection(connection).peer.userData();
	}

	@Override
	public IPEndPointCi remoteEndPoint()
	{
		return IPEndPointCiDefault.create(this.peer.getRemoteAddress().addressToString());
	}

	@Override
	public void sendMessage(INetOutgoingMessage msg, int method, int sequenceChannel)
	{
		INetOutgoingMessage msg1 = msg;
		this.platform.enetPeerSend(this.peer, 0, msg1.message, msg1.messageLength, 1);
	}

	@Override
	public void update()
	{
	}
	EnetPeer peer;
	GamePlatform platform;
}
