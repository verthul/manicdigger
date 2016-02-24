// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class Ping_
{
	public Ping_()
	{
		this.roundtripTimeMilliseconds = 0;
		this.ready = true;
		this.timeSendMilliseconds = 0;
		this.timeout = 10;
	}

	public final int getTimeoutValue()
	{
		return this.timeout;
	}

	public final boolean receive(GamePlatform platform)
	{
		if (this.ready) {
			return false;
		}
		this.roundtripTimeMilliseconds = platform.timeMillisecondsFromStart() - this.timeSendMilliseconds;
		this.ready = true;
		return true;
	}
	private int roundtripTimeMilliseconds;

	final int roundtripTimeTotalMilliseconds()
	{
		return this.roundtripTimeMilliseconds;
	}

	public final boolean send(GamePlatform platform)
	{
		if (!this.ready) {
			return false;
		}
		this.ready = false;
		this.timeSendMilliseconds = platform.timeMillisecondsFromStart();
		return true;
	}

	public final void setTimeoutValue(int value)
	{
		this.timeout = value;
	}

	public final boolean timeout(GamePlatform platform)
	{
		if ((platform.timeMillisecondsFromStart() - this.timeSendMilliseconds) / 1000 > this.timeout) {
			this.ready = true;
			return true;
		}
		return false;
	}
	private boolean ready;
	private int timeSendMilliseconds;
	private int timeout;
}
