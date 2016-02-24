// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class TileSideFlagsEnum
{
	public static final int BACK = 32;
	public static final int BOTTOM = 2;
	public static final int FRONT = 16;

	public static boolean hasFlag(int nFlagA, int nFlagB)
	{
		return (nFlagA & nFlagB) != 0;
	}
	public static final int LEFT = 8;
	public static final int NONE = 0;
	public static final int RIGHT = 4;
	public static final int TOP = 1;
}
