// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class MapUtilCi
{

	public static int index2d(int x, int y, int sizex)
	{
		return x + y * sizex;
	}

	public static int index3d(int x, int y, int h, int sizex, int sizey)
	{
		return (h * sizey + y) * sizex + x;
	}

	public static void pos(int index, int sizex, int sizey, Vector3Ref ret)
	{
		int x = index % sizex;
		int y = index / sizex % sizey;
		int h = index / (sizex * sizey);
		ret.x = x;
		ret.y = y;
		ret.z = h;
	}

	static void posInt(int index, int sizex, int sizey, Vector3IntRef ret)
	{
		int x = index % sizex;
		int y = index / sizex % sizey;
		int h = index / (sizex * sizey);
		ret.x = x;
		ret.y = y;
		ret.z = h;
	}

	public static int posX(int index, int sizex, int sizey)
	{
		return index % sizex;
	}

	public static int posY(int index, int sizex, int sizey)
	{
		return index / sizex % sizey;
	}

	public static int posZ(int index, int sizex, int sizey)
	{
		return index / (sizex * sizey);
	}
}
