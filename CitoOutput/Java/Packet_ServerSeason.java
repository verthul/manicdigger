// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class Packet_ServerSeason
{
	/**
	 * &lt;summary&gt;1-24*4&lt;/summary&gt;
	 */
	int dayNightCycleSpeedup;

	public final int getDayNightCycleSpeedup()
	{
		return this.dayNightCycleSpeedup;
	}

	public final int getHour()
	{
		return this.hour;
	}

	public final int getMoon()
	{
		return this.moon;
	}
	/**
	 * &lt;summary&gt;optional int32 Season;&lt;/summary&gt;
	 */
	int hour;
	/**
	 * &lt;summary&gt;used for predicting sun speed.&lt;/summary&gt;
	 */
	int moon;

	public final void setDayNightCycleSpeedup(int value)
	{
		this.dayNightCycleSpeedup = value;
	}

	public final void setHour(int value)
	{
		this.hour = value;
	}

	public final void setMoon(int value)
	{
		this.moon = value;
	}
}
