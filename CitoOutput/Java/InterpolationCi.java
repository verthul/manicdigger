// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class InterpolationCi
{

	public static int interpolateColor(GamePlatform platform, float progress, int[] colors, int colorsLength)
	{
		float one = 1;
		int colora = platform.floatToInt((colorsLength - 1) * progress);
		if (colora < 0) {
			colora = 0;
		}
		if (colora >= colorsLength) {
			colora = colorsLength - 1;
		}
		int colorb = colora + 1;
		if (colorb >= colorsLength) {
			colorb = colorsLength - 1;
		}
		int a = colors[colora];
		int b = colors[colorb];
		float p = (progress - one * colora / (colorsLength - 1)) * (colorsLength - 1);
		int A = platform.floatToInt(Game.colorA(a) + (Game.colorA(b) - Game.colorA(a)) * p);
		int R = platform.floatToInt(Game.colorR(a) + (Game.colorR(b) - Game.colorR(a)) * p);
		int G = platform.floatToInt(Game.colorG(a) + (Game.colorG(b) - Game.colorG(a)) * p);
		int B = platform.floatToInt(Game.colorB(a) + (Game.colorB(b) - Game.colorB(a)) * p);
		return Game.colorFromArgb(A, R, G, B);
	}
}
