// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class Packet_ServerEntity
{
	Packet_ServerEntityDrawArea drawArea;
	Packet_ServerEntityDrawBlock drawBlock;
	Packet_ServerEntityAnimatedModel drawModel;
	Packet_ServerEntityDrawName drawName_;
	Packet_ServerEntityDrawText drawText;

	public final Packet_ServerEntityDrawArea getDrawArea()
	{
		return this.drawArea;
	}

	public final Packet_ServerEntityDrawBlock getDrawBlock()
	{
		return this.drawBlock;
	}

	public final Packet_ServerEntityAnimatedModel getDrawModel()
	{
		return this.drawModel;
	}

	public final Packet_ServerEntityDrawName getDrawName_()
	{
		return this.drawName_;
	}

	public final Packet_ServerEntityDrawText getDrawText()
	{
		return this.drawText;
	}

	public final Packet_ServerPlayerStats getPlayerStats()
	{
		return this.playerStats;
	}

	public final Packet_PositionAndOrientation getPosition()
	{
		return this.position;
	}

	public final Packet_ServerEntityPush getPush()
	{
		return this.push;
	}

	public final boolean getUsable()
	{
		return this.usable;
	}
	Packet_ServerPlayerStats playerStats;
	Packet_PositionAndOrientation position;
	Packet_ServerEntityPush push;

	public final void setDrawArea(Packet_ServerEntityDrawArea value)
	{
		this.drawArea = value;
	}

	public final void setDrawBlock(Packet_ServerEntityDrawBlock value)
	{
		this.drawBlock = value;
	}

	public final void setDrawModel(Packet_ServerEntityAnimatedModel value)
	{
		this.drawModel = value;
	}

	public final void setDrawName_(Packet_ServerEntityDrawName value)
	{
		this.drawName_ = value;
	}

	public final void setDrawText(Packet_ServerEntityDrawText value)
	{
		this.drawText = value;
	}

	public final void setPlayerStats(Packet_ServerPlayerStats value)
	{
		this.playerStats = value;
	}

	public final void setPosition(Packet_PositionAndOrientation value)
	{
		this.position = value;
	}

	public final void setPush(Packet_ServerEntityPush value)
	{
		this.push = value;
	}

	public final void setUsable(boolean value)
	{
		this.usable = value;
	}
	boolean usable;
}
