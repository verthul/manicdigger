// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class VecCito3i
{

	public final void add(int _x, int _y, int _z, VecCito3i result)
	{
		result.x = this.x + _x;
		result.y = this.y + _y;
		result.z = this.z + _z;
	}

	public static VecCito3i citoCtr(int _x, int _y, int _z)
	{
		VecCito3i v = new VecCito3i();
		v.x = _x;
		v.y = _y;
		v.z = _z;
		return v;
	}
	public int x;
	public int y;
	public int z;
}
