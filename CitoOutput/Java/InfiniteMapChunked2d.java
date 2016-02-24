// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class InfiniteMapChunked2d
{

	public final void clearChunk(int x, int y)
	{
		int px = x / 16;
		int py = y / 16;
		this.chunks[MapUtilCi.index2d(px, py, this.d_Map.map.mapSizeX / 16)] = null;
	}

	public final int getBlock(int x, int y)
	{
		int[] chunk = this.getChunk(x, y);
		return chunk[MapUtilCi.index2d(x % 16, y % 16, 16)];
	}

	public final int[] getChunk(int x, int y)
	{
		int[] chunk = null;
		int kx = x / 16;
		int ky = y / 16;
		if (this.chunks[MapUtilCi.index2d(kx, ky, this.d_Map.map.mapSizeX / 16)] == null) {
			chunk = new int[256];
			for (int i = 0; i < 256; i++) {
				chunk[i] = 0;
			}
			this.chunks[MapUtilCi.index2d(kx, ky, this.d_Map.map.mapSizeX / 16)] = chunk;
		}
		chunk = this.chunks[MapUtilCi.index2d(kx, ky, this.d_Map.map.mapSizeX / 16)];
		return chunk;
	}

	public final void restart()
	{
		int n = this.d_Map.map.mapSizeX / 16 * this.d_Map.map.mapSizeY / 16;
		this.chunks = new int[n][];
		for (int i = 0; i < n; i++) {
			this.chunks[i] = null;
		}
	}

	public final void setBlock(int x, int y, int blocktype)
	{
		this.getChunk(x, y)[MapUtilCi.index2d(x % 16, y % 16, 16)] = blocktype;
	}
	int[][] chunks;
	public static final int CHUNKSIZE = 16;
	Game d_Map;
}
