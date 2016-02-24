// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class Box3D
{

	public final void addPoint(float x, float y, float z)
	{
		if (this.minEdge == null || this.maxEdge == null || this.minEdge[0] == 0 && this.minEdge[1] == 0 && this.minEdge[2] == 0 && this.maxEdge[0] == 0 && this.maxEdge[1] == 0 && this.maxEdge[2] == 0) {
			this.minEdge = Vec3.fromValues(x, y, z);
			this.maxEdge = Vec3.fromValues(x, y, z);
		}
		this.minEdge[0] = MathCi.minFloat(this.minEdge[0], x);
		this.minEdge[1] = MathCi.minFloat(this.minEdge[1], y);
		this.minEdge[2] = MathCi.minFloat(this.minEdge[2], z);
		this.maxEdge[0] = MathCi.maxFloat(this.maxEdge[0], x);
		this.maxEdge[1] = MathCi.maxFloat(this.maxEdge[1], y);
		this.maxEdge[2] = MathCi.maxFloat(this.maxEdge[2], z);
	}

	public final float[] center()
	{
		return null;
	}

	static Box3D create(int x, int y, int z, int size)
	{
		Box3D b = new Box3D();
		b.set(x, y, z, size);
		return b;
	}

	public final float lengthX()
	{
		return this.maxEdge[0] - this.minEdge[0];
	}

	public final float lengthY()
	{
		return this.maxEdge[1] - this.minEdge[1];
	}

	public final float lengthZ()
	{
		return this.maxEdge[2] - this.minEdge[2];
	}
	float[] maxEdge;
	float[] minEdge;

	public final void set(float x, float y, float z, float size)
	{
		if (this.minEdge == null) {
			this.minEdge = new float[3];
			this.maxEdge = new float[3];
		}
		this.minEdge[0] = x;
		this.minEdge[1] = y;
		this.minEdge[2] = z;
		this.maxEdge[0] = x + size;
		this.maxEdge[1] = y + size;
		this.maxEdge[2] = z + size;
	}
}
