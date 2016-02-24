// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class StringTools
{

	public static String stringAppend(GamePlatform p, String a, String b)
	{
		IntRef aLength = new IntRef();
		int[] aChars = p.stringToCharArray(a, aLength);
		IntRef bLength = new IntRef();
		int[] bChars = p.stringToCharArray(b, bLength);
		int[] cChars = new int[aLength.value + bLength.value];
		for (int i = 0; i < aLength.value; i++) {
			cChars[i] = aChars[i];
		}
		for (int i = 0; i < bLength.value; i++) {
			cChars[i + aLength.value] = bChars[i];
		}
		return p.charArrayToString(cChars, aLength.value + bLength.value);
	}

	public static int stringLength(GamePlatform p, String a)
	{
		IntRef aLength = new IntRef();
		int[] aChars = p.stringToCharArray(a, aLength);
		return aLength.value;
	}

	public static boolean stringStartsWith(GamePlatform p, String s, String b)
	{
		return StringTools.stringSubstring(p, s, 0, StringTools.stringLength(p, b)).equals(b);
	}

	public static String stringSubstring(GamePlatform p, String a, int start, int count)
	{
		IntRef aLength = new IntRef();
		int[] aChars = p.stringToCharArray(a, aLength);
		int[] bChars = new int[count];
		for (int i = 0; i < count; i++) {
			bChars[i] = aChars[start + i];
		}
		return p.charArrayToString(bChars, count);
	}

	public static String stringSubstringToEnd(GamePlatform p, String a, int start)
	{
		return StringTools.stringSubstring(p, a, start, StringTools.stringLength(p, a) - start);
	}
}
