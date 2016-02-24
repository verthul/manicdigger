// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class MiscCi
{

	public static boolean readBool(String str)
	{
		if (str == null) {
			return false;
		}
		else {
			return !str.equals("0") && !str.equals("false") && !str.equals("False") && !str.equals("FALSE");
		}
	}

	public static byte[] ushortArrayToByteArray(int[] input, int inputLength)
	{
		int outputLength = inputLength * 2;
		byte[] output = new byte[outputLength];
		for (int i = 0; i < inputLength; i++) {
			output[i * 2] = Game.intToByte(input[i] & 255);
			output[i * 2 + 1] = Game.intToByte(input[i] >> 8 & 255);
		}
		return output;
	}

	public static float vec3Length(float x, float y, float z)
	{
		return Platform.sqrt(x * x + y * y + z * z);
	}
}
