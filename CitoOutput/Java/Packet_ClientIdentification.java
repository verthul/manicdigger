// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class Packet_ClientIdentification
{

	public final String getMdProtocolVersion()
	{
		return this.mdProtocolVersion;
	}

	public final Packet_PositionAndOrientation getRequestPosition()
	{
		return this.requestPosition;
	}

	public final String getServerPassword()
	{
		return this.serverPassword;
	}

	public final String getUsername()
	{
		return this.username;
	}

	public final String getVerificationKey()
	{
		return this.verificationKey;
	}
	String mdProtocolVersion;
	Packet_PositionAndOrientation requestPosition;
	String serverPassword;

	public final void setMdProtocolVersion(String value)
	{
		this.mdProtocolVersion = value;
	}

	public final void setRequestPosition(Packet_PositionAndOrientation value)
	{
		this.requestPosition = value;
	}

	public final void setServerPassword(String value)
	{
		this.serverPassword = value;
	}

	public final void setUsername(String value)
	{
		this.username = value;
	}

	public final void setVerificationKey(String value)
	{
		this.verificationKey = value;
	}
	String username;
	String verificationKey;
}
