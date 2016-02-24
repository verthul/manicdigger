// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class Packet_ServerMonster
{

	public final int getHealth()
	{
		return this.health;
	}

	public final int getId()
	{
		return this.id;
	}

	public final int getMonsterType()
	{
		return this.monsterType;
	}

	public final Packet_PositionAndOrientation getPositionAndOrientation()
	{
		return this.positionAndOrientation;
	}
	int health;
	int id;
	int monsterType;
	Packet_PositionAndOrientation positionAndOrientation;

	public final void setHealth(int value)
	{
		this.health = value;
	}

	public final void setId(int value)
	{
		this.id = value;
	}

	public final void setMonsterType(int value)
	{
		this.monsterType = value;
	}

	public final void setPositionAndOrientation(Packet_PositionAndOrientation value)
	{
		this.positionAndOrientation = value;
	}
}
