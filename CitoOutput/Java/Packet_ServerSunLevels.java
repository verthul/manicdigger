// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class Packet_ServerSunLevels
{

	public final int[] getSunlevels()
	{
		return this.sunlevels;
	}

	public final int getSunlevelsCount()
	{
		return this.sunlevelsCount;
	}

	public final int getSunlevelsLength()
	{
		return this.sunlevelsLength;
	}

	public final void setSunlevels(int[] value, int count, int length)
	{
		this.sunlevels = value;
		this.sunlevelsCount = count;
		this.sunlevelsLength = length;
	}
	int[] sunlevels;

	public final void sunlevelsAdd(int value)
	{
		if (this.sunlevelsCount >= this.sunlevelsLength) {
			int[] Sunlevels2 = new int[this.sunlevelsLength * 2];
			this.sunlevelsLength = this.sunlevelsLength * 2;
			for (int i = 0; i < this.sunlevelsCount; i++) {
				Sunlevels2[i] = this.sunlevels[i];
			}
			this.sunlevels = Sunlevels2;
		}
		this.sunlevels[this.sunlevelsCount] = value;
		this.sunlevelsCount++;
	}
	int sunlevelsCount;
	int sunlevelsLength;
}
