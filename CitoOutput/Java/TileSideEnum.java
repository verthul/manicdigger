// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class TileSideEnum
{
	public static final int BACK = 4;
	public static final int BOTTOM = 1;
	public static final int FRONT = 5;
	public static final int LEFT = 2;
	public static final int RIGHT = 3;
	public static final int SIDE_COUNT = 6;

	public static int toFlags(int nValue)
	{
		switch (nValue) {
		case 0:
			return 1;
		case 1:
			return 2;
		case 2:
			return 16;
		case 3:
			return 32;
		case 4:
			return 8;
		case 5:
			return 4;
		default:
			return 0;
		}
	}
	public static final int TOP = 0;
}
