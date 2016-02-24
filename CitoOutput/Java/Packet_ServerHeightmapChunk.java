// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

/**
 * &lt;summary&gt;
 * &lt;para&gt;needed for drawing shadows.&lt;/para&gt;
 * &lt;para&gt;sent before any chunks or blocks in the column.&lt;/para&gt;
 * &lt;/summary&gt;
 */
public class Packet_ServerHeightmapChunk
{
	byte[] compressedHeightmap;

	public final byte[] getCompressedHeightmap()
	{
		return this.compressedHeightmap;
	}

	public final int getSizeX()
	{
		return this.sizeX;
	}

	public final int getSizeY()
	{
		return this.sizeY;
	}

	public final int getX()
	{
		return this.x;
	}

	public final int getY()
	{
		return this.y;
	}

	public final void setCompressedHeightmap(byte[] value)
	{
		this.compressedHeightmap = value;
	}

	public final void setSizeX(int value)
	{
		this.sizeX = value;
	}

	public final void setSizeY(int value)
	{
		this.sizeY = value;
	}

	public final void setX(int value)
	{
		this.x = value;
	}

	public final void setY(int value)
	{
		this.y = value;
	}
	int sizeX;
	int sizeY;
	int x;
	int y;
}
