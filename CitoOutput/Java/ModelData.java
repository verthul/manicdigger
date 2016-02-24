// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class ModelData
{

	public final int getIndicesCount()
	{
		return this.indicesCount;
	}

	public final int getRgbaCount()
	{
		return this.verticesCount * 4;
	}

	public final int getUvCount()
	{
		return this.verticesCount * 2;
	}

	public final int getVerticesCount()
	{
		return this.verticesCount;
	}

	public final int getXyzCount()
	{
		return this.verticesCount * 3;
	}

	public final void setIndicesCount(int value)
	{
		this.indicesCount = value;
	}

	public final void setVerticesCount(int value)
	{
		this.verticesCount = value;
	}

	public final int[] getIndices()
	{
		return this.indices;
	}

	public final int getMode()
	{
		return this.mode;
	}

	public final byte[] getRgba()
	{
		return this.rgba;
	}

	public final float[] getUv()
	{
		return this.uv;
	}

	public final float[] getXyz()
	{
		return this.xyz;
	}
	int[] indices;
	int indicesCount;
	int indicesMax;
	int mode;
	byte[] rgba;

	public final void setIndices(int[] p)
	{
		this.indices = p;
	}

	public final void setMode(int p)
	{
		this.mode = p;
	}

	public final void setRgba(byte[] p)
	{
		this.rgba = p;
	}

	public final void setUv(float[] p)
	{
		this.uv = p;
	}

	public final void setXyz(float[] p)
	{
		this.xyz = p;
	}
	float[] uv;
	int verticesCount;
	int verticesMax;
	float[] xyz;
}
