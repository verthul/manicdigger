// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class Vector3Ref
{

	static Vector3Ref create(float x, float y, float z)
	{
		Vector3Ref v = new Vector3Ref();
		v.x = x;
		v.y = y;
		v.z = z;
		return v;
	}

	public final float getX()
	{
		return this.x;
	}

	public final float getY()
	{
		return this.y;
	}

	public final float getZ()
	{
		return this.z;
	}

	final float length()
	{
		return Platform.sqrt(this.x * this.x + this.y * this.y + this.z * this.z);
	}

	final void normalize()
	{
		float length = this.length();
		this.x = this.x / length;
		this.y = this.y / length;
		this.z = this.z / length;
	}
	float x;
	float y;
	float z;
}
