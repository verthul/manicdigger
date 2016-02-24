// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class ProtoPlatform
{

	public static int arrayLength(byte[] a)
	{
		int len;
		
            len = a.length;
        return len;
	}

	public static String bytesToString(byte[] bytes, int length)
	{
		String s;
		
            try
            {
                s = new String(bytes, "UTF-8");
            }
            catch (Exception e)
            {
                s = null;
            }
        return s;
	}

	public static byte intToByte(int a)
	{
		return (byte) a;
	}

	public static byte[] stringToBytes(String s)
	{
		byte[] b;
		
            try
            {
                b = s.getBytes("UTF-8");
            }
            catch (Exception e)
            {
                b = null;
            }
        return b;
	}

	public static int logical_right_shift(int x, int n)
	{
		int mask = ~(-1 << n) << 32 - n;
		return ~mask & (x >> n | mask);
	}
}
