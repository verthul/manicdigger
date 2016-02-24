// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class KeyframeType
{

	public static String getName(int p)
	{
		if (p == 1) {
			return "pos";
		}
		if (p == 2) {
			return "rot";
		}
		if (p == 3) {
			return "siz";
		}
		if (p == 4) {
			return "piv";
		}
		if (p == 5) {
			return "sca";
		}
		return "";
	}

	public static int getValue(String p)
	{
		if (p.equals("pos")) {
			return 1;
		}
		if (p.equals("rot")) {
			return 2;
		}
		if (p.equals("siz")) {
			return 3;
		}
		if (p.equals("piv")) {
			return 4;
		}
		if (p.equals("sca")) {
			return 5;
		}
		return 0;
	}
	public static final int PIVOT = 4;
	public static final int POSITION = 1;
	public static final int ROTATION = 2;
	public static final int SCALE = 5;
	public static final int SIZE = 3;
}
