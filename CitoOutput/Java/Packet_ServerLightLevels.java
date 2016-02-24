// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class Packet_ServerLightLevels
{

	public final int[] getLightlevels()
	{
		return this.lightlevels;
	}

	public final int getLightlevelsCount()
	{
		return this.lightlevelsCount;
	}

	public final int getLightlevelsLength()
	{
		return this.lightlevelsLength;
	}
	int[] lightlevels;

	public final void lightlevelsAdd(int value)
	{
		if (this.lightlevelsCount >= this.lightlevelsLength) {
			int[] Lightlevels2 = new int[this.lightlevelsLength * 2];
			this.lightlevelsLength = this.lightlevelsLength * 2;
			for (int i = 0; i < this.lightlevelsCount; i++) {
				Lightlevels2[i] = this.lightlevels[i];
			}
			this.lightlevels = Lightlevels2;
		}
		this.lightlevels[this.lightlevelsCount] = value;
		this.lightlevelsCount++;
	}
	int lightlevelsCount;
	int lightlevelsLength;

	public final void setLightlevels(int[] value, int count, int length)
	{
		this.lightlevels = value;
		this.lightlevelsCount = count;
		this.lightlevelsLength = length;
	}
}
