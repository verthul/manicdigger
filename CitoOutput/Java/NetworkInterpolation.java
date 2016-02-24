// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class NetworkInterpolation extends INetworkInterpolation
{
	public NetworkInterpolation()
	{
		this.received = new Packet_[128];
		this.dELAYMILLISECONDS = 200;
		this.eXTRAPOLATION_TIMEMILLISECONDS = 200;
	}

	@Override
	public void addNetworkPacket(InterpolatedObject c, int timeMilliseconds)
	{
		Packet_ p = new Packet_();
		p.content = c;
		p.timestampMilliseconds = timeMilliseconds;
		int max = 100;
		if (this.receivedCount >= max) {
			for (int i = 0; i < max - 1; i++) {
				this.received[i] = this.received[i + 1];
			}
			this.receivedCount = max - 1;
		}
		this.received[this.receivedCount++] = p;
	}
	int dELAYMILLISECONDS;
	boolean eXTRAPOLATE;
	int eXTRAPOLATION_TIMEMILLISECONDS;

	@Override
	public InterpolatedObject interpolatedState(int timeMilliseconds)
	{
		int curtimeMilliseconds = timeMilliseconds;
		int interpolationtimeMilliseconds = curtimeMilliseconds - this.dELAYMILLISECONDS;
		int p1;
		int p2;
		if (this.receivedCount == 0) {
			return null;
		}
		InterpolatedObject result;
		if (this.receivedCount > 0 && interpolationtimeMilliseconds < this.received[0].timestampMilliseconds) {
			p1 = 0;
			p2 = 0;
		}
		else if (this.eXTRAPOLATE && this.receivedCount >= 2 && interpolationtimeMilliseconds > this.received[this.receivedCount - 1].timestampMilliseconds) {
			p1 = this.receivedCount - 2;
			p2 = this.receivedCount - 1;
			interpolationtimeMilliseconds = MathCi.minInt(interpolationtimeMilliseconds, this.received[this.receivedCount - 1].timestampMilliseconds + this.eXTRAPOLATION_TIMEMILLISECONDS);
		}
		else {
			p1 = 0;
			for (int i = 0; i < this.receivedCount; i++) {
				if (this.received[i].timestampMilliseconds <= interpolationtimeMilliseconds) {
					p1 = i;
				}
			}
			p2 = p1;
			if (this.receivedCount - 1 > p1) {
				p2++;
			}
		}
		if (p1 == p2) {
			result = this.received[p1].content;
		}
		else {
			float one = 1;
			result = this.req.interpolate(this.received[p1].content, this.received[p2].content, one * (interpolationtimeMilliseconds - this.received[p1].timestampMilliseconds) / (this.received[p2].timestampMilliseconds - this.received[p1].timestampMilliseconds));
		}
		return result;
	}
	private Packet_[] received;
	private int receivedCount;
	IInterpolation req;
}
