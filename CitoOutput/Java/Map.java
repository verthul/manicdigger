// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class Map
{

	public final void copyChunk(Chunk chunk, int[] output)
	{
		int n = 4096;
		if (chunk.dataInt != null) {
			for (int i = 0; i < n; i++) {
				output[i] = chunk.dataInt[i];
			}
		}
		else {
			for (int i = 0; i < n; i++) {
				output[i] = chunk.data[i] & 0xff;
			}
		}
	}

	public final void fillChunk(Chunk destination, int destinationchunksize, int sourcex, int sourcey, int sourcez, int[] source, int sourcechunksizeX, int sourcechunksizeY, int sourcechunksizeZ)
	{
		for (int x = 0; x < destinationchunksize; x++) {
			for (int y = 0; y < destinationchunksize; y++) {
				for (int z = 0; z < destinationchunksize; z++) {
					{
						destination.setBlockInChunk((z * destinationchunksize + y) * destinationchunksize + x, source[((z + sourcez) * sourcechunksizeY + y + sourcey) * sourcechunksizeX + x + sourcex]);
					}
				}
			}
		}
	}

	public final int getBlock(int x, int y, int z)
	{
		if (!this.isValidPos(x, y, z)) {
			return 0;
		}
		return this.getBlockValid(x, y, z);
	}

	public final int getBlockValid(int x, int y, int z)
	{
		int cx = x >> 4;
		int cy = y >> 4;
		int cz = z >> 4;
		int chunkpos = (cz * (this.mapSizeY >> 4) + cy) * (this.mapSizeX >> 4) + cx;
		if (this.chunks[chunkpos] == null) {
			return 0;
		}
		else {
			int pos = ((z & 15) * 16 + (y & 15)) * 16 + (x & 15);
			return this.chunks[chunkpos].getBlockInChunk(pos);
		}
	}

	public final Chunk getChunk(int x, int y, int z)
	{
		x = x / 16;
		y = y / 16;
		z = z / 16;
		return this.getChunk_(x, y, z);
	}

	public final Chunk getChunk_(int cx, int cy, int cz)
	{
		int mapsizexchunks = this.mapSizeX / 16;
		int mapsizeychunks = this.mapSizeY / 16;
		Chunk chunk = this.chunks[(cz * mapsizeychunks + cy) * mapsizexchunks + cx];
		if (chunk == null) {
			Chunk c = new Chunk();
			c.data = new byte[4096];
			c.baseLight = new byte[4096];
			this.chunks[(cz * mapsizeychunks + cy) * mapsizexchunks + cx] = c;
			return this.chunks[(cz * mapsizeychunks + cy) * mapsizexchunks + cx];
		}
		return chunk;
	}

	public final void getMapPortion(int[] outPortion, int x, int y, int z, int portionsizex, int portionsizey, int portionsizez)
	{
		int outPortionCount = portionsizex * portionsizey * portionsizez;
		for (int i = 0; i < outPortionCount; i++) {
			outPortion[i] = 0;
		}
		int mapchunksx = this.mapSizeX / 16;
		int mapchunksy = this.mapSizeY / 16;
		int mapchunksz = this.mapSizeZ / 16;
		int mapsizechunks = mapchunksx * mapchunksy * mapchunksz;
		for (int xx = 0; xx < portionsizex; xx++) {
			for (int yy = 0; yy < portionsizey; yy++) {
				for (int zz = 0; zz < portionsizez; zz++) {
					int cx = x + xx >> 4;
					int cy = y + yy >> 4;
					int cz = z + zz >> 4;
					int cpos = (cz * mapchunksy + cy) * mapchunksx + cx;
					if (cpos < 0 || cpos >= mapsizechunks) {
						continue;
					}
					Chunk chunk = this.chunks[cpos];
					if (chunk == null || !chunk.chunkHasData()) {
						continue;
					}
					int chunkGlobalX = cx << 4;
					int chunkGlobalY = cy << 4;
					int chunkGlobalZ = cz << 4;
					int inChunkX = x + xx - chunkGlobalX;
					int inChunkY = y + yy - chunkGlobalY;
					int inChunkZ = z + zz - chunkGlobalZ;
					int pos = ((inChunkZ << 4) + inChunkY << 4) + inChunkX;
					int block = chunk.getBlockInChunk(pos);
					outPortion[(zz * portionsizey + yy) * portionsizex + xx] = block;
				}
			}
		}
	}

	public final boolean isChunkRendered(int cx, int cy, int cz)
	{
		Chunk c = this.chunks[MapUtilCi.index3d(cx, cy, cz, this.mapsizexchunks(), this.mapsizeychunks())];
		if (c == null) {
			return false;
		}
		return c.rendered != null && c.rendered.ids != null;
	}

	public final boolean isValidChunkPos(int cx, int cy, int cz)
	{
		return cx >= 0 && cy >= 0 && cz >= 0 && cx < this.mapSizeX / 16 && cy < this.mapSizeY / 16 && cz < this.mapSizeZ / 16;
	}

	public final boolean isValidPos(int x, int y, int z)
	{
		if (x < 0 || y < 0 || z < 0) {
			return false;
		}
		if (x >= this.mapSizeX || y >= this.mapSizeY || z >= this.mapSizeZ) {
			return false;
		}
		return true;
	}
	int mapSizeX;
	int mapSizeY;
	int mapSizeZ;

	public final int maybeGetLight(int x, int y, int z)
	{
		int light = -1;
		int cx = x / 16;
		int cy = y / 16;
		int cz = z / 16;
		if (this.isValidPos(x, y, z) && this.isValidChunkPos(cx, cy, cz)) {
			Chunk c = this.chunks[MapUtilCi.index3d(cx, cy, cz, this.mapsizexchunks(), this.mapsizeychunks())];
			if (c == null || c.rendered == null || c.rendered.light == null) {
				light = -1;
			}
			else {
				light = c.rendered.light[MapUtilCi.index3d(x % 16 + 1, y % 16 + 1, z % 16 + 1, 18, 18)] & 0xff;
			}
		}
		return light;
	}

	public final void reset(int sizex, int sizey, int sizez)
	{
		this.mapSizeX = sizex;
		this.mapSizeY = sizey;
		this.mapSizeZ = sizez;
		this.chunks = new Chunk[sizex / 16 * sizey / 16 * sizez / 16];
	}

	public final void setBlockDirty(int x, int y, int z)
	{
		Vector3IntRef[] around = ModDrawTerrain.blocksAround7(Vector3IntRef.create(x, y, z));
		for (int i = 0; i < 7; i++) {
			Vector3IntRef a = around[i];
			int xx = a.x;
			int yy = a.y;
			int zz = a.z;
			if (xx < 0 || yy < 0 || zz < 0 || xx >= this.mapSizeX || yy >= this.mapSizeY || zz >= this.mapSizeZ) {
				return;
			}
			this.setChunkDirty(xx / 16, yy / 16, zz / 16, true, true);
		}
	}

	public final void setBlockRaw(int x, int y, int z, int tileType)
	{
		Chunk chunk = this.getChunk(x, y, z);
		int pos = (z % 16 * 16 + y % 16) * 16 + x % 16;
		chunk.setBlockInChunk(pos, tileType);
	}

	public final void setChunkDirty(int cx, int cy, int cz, boolean dirty, boolean blockschanged)
	{
		if (!this.isValidChunkPos(cx, cy, cz)) {
			return;
		}
		Chunk c = this.chunks[MapUtilCi.index3d(cx, cy, cz, this.mapsizexchunks(), this.mapsizeychunks())];
		if (c == null) {
			return;
		}
		if (c.rendered == null) {
			c.rendered = new RenderedChunk();
		}
		c.rendered.dirty = dirty;
		if (blockschanged) {
			c.baseLightDirty = true;
		}
	}

	public final void setChunksAroundDirty(int cx, int cy, int cz)
	{
		if (this.isValidChunkPos(cx, cy, cz)) {
			this.setChunkDirty(cx - 1, cy, cz, true, false);
		}
		if (this.isValidChunkPos(cx - 1, cy, cz)) {
			this.setChunkDirty(cx - 1, cy, cz, true, false);
		}
		if (this.isValidChunkPos(cx + 1, cy, cz)) {
			this.setChunkDirty(cx + 1, cy, cz, true, false);
		}
		if (this.isValidChunkPos(cx, cy - 1, cz)) {
			this.setChunkDirty(cx, cy - 1, cz, true, false);
		}
		if (this.isValidChunkPos(cx, cy + 1, cz)) {
			this.setChunkDirty(cx, cy + 1, cz, true, false);
		}
		if (this.isValidChunkPos(cx, cy, cz - 1)) {
			this.setChunkDirty(cx, cy, cz - 1, true, false);
		}
		if (this.isValidChunkPos(cx, cy, cz + 1)) {
			this.setChunkDirty(cx, cy, cz + 1, true, false);
		}
	}

	public final void setMapPortion(int x, int y, int z, int[] chunk, int sizeX, int sizeY, int sizeZ)
	{
		int chunksizex = sizeX;
		int chunksizey = sizeY;
		int chunksizez = sizeZ;
		int chunksize = 16;
		Chunk[] localchunks = new Chunk[chunksizex / chunksize * chunksizey / chunksize * chunksizez / chunksize];
		for (int cx = 0; cx < chunksizex / chunksize; cx++) {
			for (int cy = 0; cy < chunksizey / chunksize; cy++) {
				for (int cz = 0; cz < chunksizex / chunksize; cz++) {
					localchunks[(cz * chunksizey / chunksize + cy) * chunksizex / chunksize + cx] = this.getChunk(x + cx * chunksize, y + cy * chunksize, z + cz * chunksize);
					this.fillChunk(localchunks[(cz * chunksizey / chunksize + cy) * chunksizex / chunksize + cx], chunksize, cx * chunksize, cy * chunksize, cz * chunksize, chunk, sizeX, sizeY, sizeZ);
				}
			}
		}
		for (int xxx = 0; xxx < chunksizex; xxx += chunksize) {
			for (int yyy = 0; yyy < chunksizex; yyy += chunksize) {
				for (int zzz = 0; zzz < chunksizex; zzz += chunksize) {
					this.setChunkDirty((x + xxx) / chunksize, (y + yyy) / chunksize, (z + zzz) / chunksize, true, true);
					this.setChunksAroundDirty((x + xxx) / chunksize, (y + yyy) / chunksize, (z + zzz) / chunksize);
				}
			}
		}
	}
	Chunk[] chunks;

	public final int mapsizexchunks()
	{
		return this.mapSizeX >> 4;
	}

	public final int mapsizeychunks()
	{
		return this.mapSizeY >> 4;
	}

	public final int mapsizezchunks()
	{
		return this.mapSizeZ >> 4;
	}
}
