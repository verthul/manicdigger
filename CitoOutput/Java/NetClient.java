// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public abstract class NetClient
{

	public abstract NetConnection connect(String ip, int port);

	public abstract NetIncomingMessage readMessage();

	public abstract void sendMessage(INetOutgoingMessage message, int method);

	public abstract void start();
}
