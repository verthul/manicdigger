// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class ConnectData
{
	String auth;

	public static ConnectData fromUri(UriCi uri)
	{
		ConnectData c = new ConnectData();
		c = new ConnectData();
		c.ip = uri.getIp();
		c.port = 25565;
		c.username = "gamer";
		if (uri.getPort() != -1) {
			c.port = uri.getPort();
		}
		if (uri.getGet().containsKey("user")) {
			c.username = uri.getGet().get("user");
		}
		if (uri.getGet().containsKey("auth")) {
			c.auth = uri.getGet().get("auth");
		}
		if (uri.getGet().containsKey("serverPassword")) {
			c.isServePasswordProtected = MiscCi.readBool(uri.getGet().get("serverPassword"));
		}
		return c;
	}

	public final boolean getIsServePasswordProtected()
	{
		return this.isServePasswordProtected;
	}
	String ip;
	boolean isServePasswordProtected;
	int port;
	String serverPassword;

	public final void setIp(String value)
	{
		this.ip = value;
	}

	public final void setIsServePasswordProtected(boolean value)
	{
		this.isServePasswordProtected = value;
	}

	public final void setPort(int value)
	{
		this.port = value;
	}

	public final void setServerPassword(String value)
	{
		this.serverPassword = value;
	}

	public final void setUsername(String value)
	{
		this.username = value;
	}
	String username;
}
