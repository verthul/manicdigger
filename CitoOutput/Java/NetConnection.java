// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public abstract class NetConnection
{

	public abstract boolean equalsConnection(NetConnection connection);

	public abstract IPEndPointCi remoteEndPoint();

	public abstract void sendMessage(INetOutgoingMessage msg, int method, int sequenceChannel);

	public abstract void update();
}
