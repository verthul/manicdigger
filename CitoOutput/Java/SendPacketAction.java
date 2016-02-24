// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class SendPacketAction extends Action_
{

	public static SendPacketAction create(ServerSimple server_, int client_, Packet_Server packet_)
	{
		SendPacketAction a = new SendPacketAction();
		a.server = server_;
		a.client = client_;
		a.packet = packet_;
		return a;
	}

	@Override
	public void run()
	{
		this.server.sendPacket(this.client, this.packet);
	}
	int client;
	Packet_Server packet;
	ServerSimple server;
}
