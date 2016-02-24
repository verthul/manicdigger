// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class ModUnloadRendererChunks extends ClientMod
{
	public ModUnloadRendererChunks()
	{
		this.unloadxyztemp = new Vector3IntRef();
	}

	@Override
	public void onReadOnlyBackgroundThread(Game game_, float dt)
	{
		this.game = game_;
		this.chunksize = 16;
		this.mapsizexchunks = this.game.map.mapSizeX / this.chunksize;
		this.mapsizeychunks = this.game.map.mapSizeY / this.chunksize;
		this.mapsizezchunks = this.game.map.mapSizeZ / this.chunksize;
		int px = this.game.platform.floatToInt(this.game.player.position.x) / this.chunksize;
		int py = this.game.platform.floatToInt(this.game.player.position.z) / this.chunksize;
		int pz = this.game.platform.floatToInt(this.game.player.position.y) / this.chunksize;
		int chunksxy = this.mapAreaSize() / this.chunksize / 2;
		int chunksz = this.mapAreaSizeZ() / this.chunksize / 2;
		int startx = px - chunksxy;
		int endx = px + chunksxy;
		int starty = py - chunksxy;
		int endy = py + chunksxy;
		int startz = pz - chunksz;
		int endz = pz + chunksz;
		if (startx < 0) {
			startx = 0;
		}
		if (starty < 0) {
			starty = 0;
		}
		if (startz < 0) {
			startz = 0;
		}
		if (endx >= this.mapsizexchunks) {
			endx = this.mapsizexchunks - 1;
		}
		if (endy >= this.mapsizeychunks) {
			endy = this.mapsizeychunks - 1;
		}
		if (endz >= this.mapsizezchunks) {
			endz = this.mapsizezchunks - 1;
		}
		int mapsizexchunks_ = this.mapsizexchunks;
		int mapsizeychunks_ = this.mapsizeychunks;
		int mapsizezchunks_ = this.mapsizezchunks;
		int count;
		if (this.game.platform.isFastSystem()) {
			count = 1000;
		}
		else {
			count = 250;
		}
		for (int i = 0; i < count; i++) {
			this.unloadIterationXy++;
			if (this.unloadIterationXy >= mapsizexchunks_ * mapsizeychunks_ * mapsizezchunks_) {
				this.unloadIterationXy = 0;
			}
			MapUtilCi.posInt(this.unloadIterationXy, mapsizexchunks_, mapsizeychunks_, this.unloadxyztemp);
			int x = this.unloadxyztemp.x;
			int y = this.unloadxyztemp.y;
			int z = this.unloadxyztemp.z;
			int pos = MapUtilCi.index3d(x, y, z, mapsizexchunks_, mapsizeychunks_);
			boolean unloaded = false;
			Chunk c = this.game.map.chunks[pos];
			if (c == null || c.rendered == null || c.rendered.ids == null) {
				continue;
			}
			if (x < startx || y < starty || z < startz || x > endx || y > endy || z > endz) {
				int unloadChunkPos = pos;
				UnloadRendererChunksCommit commit = new UnloadRendererChunksCommit();
				commit.game = this.game;
				commit.unloadChunkPos = unloadChunkPos;
				this.game.queueActionCommit(commit);
			}
			unloaded = true;
			if (unloaded) {
				break;
			}
		}
	}

	private final int centerAreaSize()
	{
		return this.game.platform.floatToInt(this.game.d_Config3d.viewdistance) / 2;
	}
	private int chunksize;
	private Game game;

	private int mapAreaSize()
	{
		return this.game.platform.floatToInt(this.game.d_Config3d.viewdistance) * 2;
	}

	private int mapAreaSizeZ()
	{
		return this.mapAreaSize();
	}
	private int mapsizexchunks;
	private int mapsizeychunks;
	private int mapsizezchunks;
	private int unloadIterationXy;
	private Vector3IntRef unloadxyztemp;
}
