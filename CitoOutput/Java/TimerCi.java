// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class TimerCi
{
	public TimerCi()
	{
		this.interval = 1;
		this.maxDeltaTime = -1;
	}

	static TimerCi create(int interval_, int maxDeltaTime_)
	{
		TimerCi timer = new TimerCi();
		timer.interval = interval_;
		timer.maxDeltaTime = maxDeltaTime_;
		return timer;
	}

	public final void reset()
	{
		this.accumulator = 0;
	}

	public final int update(float dt)
	{
		this.accumulator += dt;
		float constDt = this.interval;
		if (this.maxDeltaTime != -1 && this.accumulator > this.maxDeltaTime) {
			this.accumulator = this.maxDeltaTime;
		}
		int updates = 0;
		while (this.accumulator >= constDt) {
			updates++;
			this.accumulator -= constDt;
		}
		return updates;
	}
	float accumulator;
	float interval;
	float maxDeltaTime;
}
