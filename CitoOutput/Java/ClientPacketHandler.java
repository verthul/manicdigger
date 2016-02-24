// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public abstract class ClientPacketHandler
{
	public ClientPacketHandler()
	{
		this.one = 1;
	}

	public abstract void handle(Game game, Packet_Server packet);
	float one;
}
