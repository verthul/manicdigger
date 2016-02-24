// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public abstract class NetServer
{

	public abstract NetIncomingMessage readMessage();

	public abstract void setPort(int port);

	public abstract void start();
}
