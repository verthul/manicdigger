// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class LightFlood
{
	public LightFlood()
	{
		this.q = new FastQueueInt();
		this.q.initialize(1024);
	}

	public final void floodLight(int[] chunk, byte[] light, int startx, int starty, int startz, int[] dataLightRadius, boolean[] dataTransparent)
	{
		int start = (startz * 16 + starty) * 16 + startx;
		if ((light[start] & 0xff) == 0) {
			return;
		}
		this.q.clear();
		this.q.push(start);
		for (;;) {
			if (this.q.count == 0) {
				break;
			}
			int vPos = this.q.pop();
			int vLight = light[vPos] & 0xff;
			if (vLight == 0) {
				continue;
			}
			int vBlock = chunk[vPos];
			if (!dataTransparent[vBlock] && dataLightRadius[vBlock] == 0) {
				continue;
			}
			int x = MapUtilCi.posX(vPos, 16, 16);
			int y = MapUtilCi.posY(vPos, 16, 16);
			int z = MapUtilCi.posZ(vPos, 16, 16);
			if (x < 15) {
				LightFlood.push(this.q, light, vLight, vPos + 1);
			}
			if (x > 0) {
				LightFlood.push(this.q, light, vLight, vPos + -1);
			}
			if (y < 15) {
				LightFlood.push(this.q, light, vLight, vPos + 16);
			}
			if (y > 0) {
				LightFlood.push(this.q, light, vLight, vPos + -16);
			}
			if (z < 15) {
				LightFlood.push(this.q, light, vLight, vPos + 256);
			}
			if (z > 0) {
				LightFlood.push(this.q, light, vLight, vPos + -256);
			}
		}
	}

	private static void push(FastQueueInt q_, byte[] light, int vLight, int newPos)
	{
		if ((light[newPos] & 0xff) < vLight - 1) {
			light[newPos] = Game.intToByte(vLight - 1);
			q_.push(newPos);
		}
	}
	public static final int X_MINUS = -1;
	public static final int X_PLUS = 1;
	public static final int Y_MINUS = -16;
	public static final int Y_PLUS = 16;
	public static final int Z_MINUS = -256;
	public static final int Z_PLUS = 256;
	private FastQueueInt q;
}
