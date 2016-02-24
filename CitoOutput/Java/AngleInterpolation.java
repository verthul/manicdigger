// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class AngleInterpolation
{

	public static int interpolateAngle256(GamePlatform platform, int a, int b, float progress)
	{
		if (progress != 0 && b != a) {
			int diff = AngleInterpolation.normalizeAngle256(b - a);
			if (diff >= 128) {
				diff -= 256;
			}
			a += platform.floatToInt(progress * diff);
		}
		return AngleInterpolation.normalizeAngle256(a);
	}

	public static float interpolateAngle360(GamePlatform platform, float a, float b, float progress)
	{
		if (progress != 0 && b != a) {
			float diff = AngleInterpolation.normalizeAngle360(platform, b - a);
			if (diff >= 180) {
				diff -= 360;
			}
			a += progress * diff;
		}
		return AngleInterpolation.normalizeAngle360(platform, a);
	}

	private static int normalizeAngle256(int v)
	{
		return (v + 16383) % 256;
	}

	private static float normalizeAngle360(GamePlatform platform, float v)
	{
		return platform.floatModulo(v + 16200, 360);
	}
}
