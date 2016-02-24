// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class Packet_SoundSet
{
	String[] break1;

	public final void break1Add(String value)
	{
		if (this.break1Count >= this.break1Length) {
			String[] Break12 = new String[this.break1Length * 2];
			this.break1Length = this.break1Length * 2;
			for (int i = 0; i < this.break1Count; i++) {
				Break12[i] = this.break1[i];
			}
			this.break1 = Break12;
		}
		this.break1[this.break1Count] = value;
		this.break1Count++;
	}
	int break1Count;
	int break1Length;
	String[] build;

	public final void buildAdd(String value)
	{
		if (this.buildCount >= this.buildLength) {
			String[] Build2 = new String[this.buildLength * 2];
			this.buildLength = this.buildLength * 2;
			for (int i = 0; i < this.buildCount; i++) {
				Build2[i] = this.build[i];
			}
			this.build = Build2;
		}
		this.build[this.buildCount] = value;
		this.buildCount++;
	}
	int buildCount;
	int buildLength;
	String[] clone;

	public final void cloneAdd(String value)
	{
		if (this.cloneCount >= this.cloneLength) {
			String[] Clone2 = new String[this.cloneLength * 2];
			this.cloneLength = this.cloneLength * 2;
			for (int i = 0; i < this.cloneCount; i++) {
				Clone2[i] = this.clone[i];
			}
			this.clone = Clone2;
		}
		this.clone[this.cloneCount] = value;
		this.cloneCount++;
	}
	int cloneCount;
	int cloneLength;

	public final String[] getBreak1()
	{
		return this.break1;
	}

	public final int getBreak1Count()
	{
		return this.break1Count;
	}

	public final int getBreak1Length()
	{
		return this.break1Length;
	}

	public final String[] getBuild()
	{
		return this.build;
	}

	public final int getBuildCount()
	{
		return this.buildCount;
	}

	public final int getBuildLength()
	{
		return this.buildLength;
	}

	public final String[] getClone()
	{
		return this.clone;
	}

	public final int getCloneCount()
	{
		return this.cloneCount;
	}

	public final int getCloneLength()
	{
		return this.cloneLength;
	}

	public final String[] getReload()
	{
		return this.reload;
	}

	public final int getReloadCount()
	{
		return this.reloadCount;
	}

	public final int getReloadLength()
	{
		return this.reloadLength;
	}

	public final String[] getShoot()
	{
		return this.shoot;
	}

	public final int getShootCount()
	{
		return this.shootCount;
	}

	public final String[] getShootEnd()
	{
		return this.shootEnd;
	}

	public final int getShootEndCount()
	{
		return this.shootEndCount;
	}

	public final int getShootEndLength()
	{
		return this.shootEndLength;
	}

	public final int getShootLength()
	{
		return this.shootLength;
	}

	public final String[] getWalk()
	{
		return this.walk;
	}

	public final int getWalkCount()
	{
		return this.walkCount;
	}

	public final int getWalkLength()
	{
		return this.walkLength;
	}
	String[] reload;

	public final void reloadAdd(String value)
	{
		if (this.reloadCount >= this.reloadLength) {
			String[] Reload2 = new String[this.reloadLength * 2];
			this.reloadLength = this.reloadLength * 2;
			for (int i = 0; i < this.reloadCount; i++) {
				Reload2[i] = this.reload[i];
			}
			this.reload = Reload2;
		}
		this.reload[this.reloadCount] = value;
		this.reloadCount++;
	}
	int reloadCount;
	int reloadLength;

	public final void setBreak1(String[] value, int count, int length)
	{
		this.break1 = value;
		this.break1Count = count;
		this.break1Length = length;
	}

	public final void setBuild(String[] value, int count, int length)
	{
		this.build = value;
		this.buildCount = count;
		this.buildLength = length;
	}

	public final void setClone(String[] value, int count, int length)
	{
		this.clone = value;
		this.cloneCount = count;
		this.cloneLength = length;
	}

	public final void setReload(String[] value, int count, int length)
	{
		this.reload = value;
		this.reloadCount = count;
		this.reloadLength = length;
	}

	public final void setShoot(String[] value, int count, int length)
	{
		this.shoot = value;
		this.shootCount = count;
		this.shootLength = length;
	}

	public final void setShootEnd(String[] value, int count, int length)
	{
		this.shootEnd = value;
		this.shootEndCount = count;
		this.shootEndLength = length;
	}

	public final void setWalk(String[] value, int count, int length)
	{
		this.walk = value;
		this.walkCount = count;
		this.walkLength = length;
	}
	String[] shoot;

	public final void shootAdd(String value)
	{
		if (this.shootCount >= this.shootLength) {
			String[] Shoot2 = new String[this.shootLength * 2];
			this.shootLength = this.shootLength * 2;
			for (int i = 0; i < this.shootCount; i++) {
				Shoot2[i] = this.shoot[i];
			}
			this.shoot = Shoot2;
		}
		this.shoot[this.shootCount] = value;
		this.shootCount++;
	}
	int shootCount;
	String[] shootEnd;

	public final void shootEndAdd(String value)
	{
		if (this.shootEndCount >= this.shootEndLength) {
			String[] ShootEnd2 = new String[this.shootEndLength * 2];
			this.shootEndLength = this.shootEndLength * 2;
			for (int i = 0; i < this.shootEndCount; i++) {
				ShootEnd2[i] = this.shootEnd[i];
			}
			this.shootEnd = ShootEnd2;
		}
		this.shootEnd[this.shootEndCount] = value;
		this.shootEndCount++;
	}
	int shootEndCount;
	int shootEndLength;
	int shootLength;
	String[] walk;

	public final void walkAdd(String value)
	{
		if (this.walkCount >= this.walkLength) {
			String[] Walk2 = new String[this.walkLength * 2];
			this.walkLength = this.walkLength * 2;
			for (int i = 0; i < this.walkCount; i++) {
				Walk2[i] = this.walk[i];
			}
			this.walk = Walk2;
		}
		this.walk[this.walkCount] = value;
		this.walkCount++;
	}
	int walkCount;
	int walkLength;
}
