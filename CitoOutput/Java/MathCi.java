// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class MathCi
{

	public static float absFloat(float b)
	{
		if (b >= 0) {
			return b;
		}
		else {
			return 0 - b;
		}
	}

	public static float clampFloat(float value, float min, float max)
	{
		float result = value;
		if (value > max) {
			result = max;
		}
		if (value < min) {
			result = min;
		}
		return result;
	}

	public static int clampInt(int value, int min, int max)
	{
		int result = value;
		if (value > max) {
			result = max;
		}
		if (value < min) {
			result = min;
		}
		return result;
	}

	public static float maxFloat(float a, float b)
	{
		if (a >= b) {
			return a;
		}
		else {
			return b;
		}
	}

	public static int maxInt(int a, int b)
	{
		if (a >= b) {
			return a;
		}
		else {
			return b;
		}
	}

	public static float minFloat(float a, float b)
	{
		if (a <= b) {
			return a;
		}
		else {
			return b;
		}
	}

	public static int minInt(int a, int b)
	{
		if (a <= b) {
			return a;
		}
		else {
			return b;
		}
	}

	public static int sign(float q)
	{
		if (q < 0) {
			return -1;
		}
		else if (q == 0) {
			return 0;
		}
		else {
			return 1;
		}
	}
}
