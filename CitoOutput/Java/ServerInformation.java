// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class ServerInformation
{
	public ServerInformation()
	{
		this.serverName = "";
		this.serverMotd = "";
		this.connectdata = new ConnectData();
		this.serverPing = new Ping_();
	}
	String serverMotd;
	String serverName;
	Ping_ serverPing;
	ConnectData connectdata;
}
