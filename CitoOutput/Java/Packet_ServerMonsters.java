// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class Packet_ServerMonsters
{

	public final Packet_ServerMonster[] getMonsters()
	{
		return this.monsters;
	}

	public final int getMonstersCount()
	{
		return this.monstersCount;
	}

	public final int getMonstersLength()
	{
		return this.monstersLength;
	}
	Packet_ServerMonster[] monsters;

	public final void monstersAdd(Packet_ServerMonster value)
	{
		if (this.monstersCount >= this.monstersLength) {
			Packet_ServerMonster[] Monsters2 = new Packet_ServerMonster[this.monstersLength * 2];
			this.monstersLength = this.monstersLength * 2;
			for (int i = 0; i < this.monstersCount; i++) {
				Monsters2[i] = this.monsters[i];
			}
			this.monsters = Monsters2;
		}
		this.monsters[this.monstersCount] = value;
		this.monstersCount++;
	}
	int monstersCount;
	int monstersLength;

	public final void setMonsters(Packet_ServerMonster[] value, int count, int length)
	{
		this.monsters = value;
		this.monstersCount = count;
		this.monstersLength = length;
	}
}
