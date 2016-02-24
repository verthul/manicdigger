// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class Packet_ServerIdentification
{
	int assignedClientId;
	int disableShadows;

	public final int getAssignedClientId()
	{
		return this.assignedClientId;
	}

	public final int getDisableShadows()
	{
		return this.disableShadows;
	}

	public final int getMapSizeX()
	{
		return this.mapSizeX;
	}

	public final int getMapSizeY()
	{
		return this.mapSizeY;
	}

	public final int getMapSizeZ()
	{
		return this.mapSizeZ;
	}

	public final String getMdProtocolVersion()
	{
		return this.mdProtocolVersion;
	}

	public final int getPlayerAreaSize()
	{
		return this.playerAreaSize;
	}

	public final int getRenderHint_()
	{
		return this.renderHint_;
	}

	public final Packet_StringList getRequiredBlobMd5()
	{
		return this.requiredBlobMd5;
	}

	public final Packet_StringList getRequiredBlobName()
	{
		return this.requiredBlobName;
	}

	public final String getServerMotd()
	{
		return this.serverMotd;
	}

	public final String getServerName()
	{
		return this.serverName;
	}
	int mapSizeX;
	int mapSizeY;
	int mapSizeZ;
	String mdProtocolVersion;
	int playerAreaSize;
	int renderHint_;
	Packet_StringList requiredBlobMd5;
	Packet_StringList requiredBlobName;
	String serverMotd;
	String serverName;

	public final void setAssignedClientId(int value)
	{
		this.assignedClientId = value;
	}

	public final void setDisableShadows(int value)
	{
		this.disableShadows = value;
	}

	public final void setMapSizeX(int value)
	{
		this.mapSizeX = value;
	}

	public final void setMapSizeY(int value)
	{
		this.mapSizeY = value;
	}

	public final void setMapSizeZ(int value)
	{
		this.mapSizeZ = value;
	}

	public final void setMdProtocolVersion(String value)
	{
		this.mdProtocolVersion = value;
	}

	public final void setPlayerAreaSize(int value)
	{
		this.playerAreaSize = value;
	}

	public final void setRenderHint_(int value)
	{
		this.renderHint_ = value;
	}

	public final void setRequiredBlobMd5(Packet_StringList value)
	{
		this.requiredBlobMd5 = value;
	}

	public final void setRequiredBlobName(Packet_StringList value)
	{
		this.requiredBlobName = value;
	}

	public final void setServerMotd(String value)
	{
		this.serverMotd = value;
	}

	public final void setServerName(String value)
	{
		this.serverName = value;
	}
}
