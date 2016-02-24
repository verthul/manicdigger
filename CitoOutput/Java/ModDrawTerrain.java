// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class ModDrawTerrain extends ClientMod
{
	public ModDrawTerrain()
	{
		this.currentChunk = new int[5832];
		this.currentChunkShadows = new byte[5832];
		this.tempnearestpos = new int[3];
		this.ids = new int[1024];
		this.idsCount = 0;
		this.redraw = new TerrainRendererRedraw[128];
		this.redrawCount = 0;
		this.calculateShadowslightRadius = new int[1024];
		this.calculateShadowsisTransparentForLight = new boolean[1024];
		this.lightBase = new LightBase();
		this.lightBetweenChunks = new LightBetweenChunks();
		this.lastPerformanceInfoupdateMilliseconds = 0;
		this.lastchunkupdates = 0;
		this.started = false;
	}

	public static Vector3IntRef[] blocksAround7(Vector3IntRef pos)
	{
		Vector3IntRef[] arr = new Vector3IntRef[7];
		arr[0] = pos;
		arr[1] = Vector3IntRef.create(pos.x + 1, pos.y + 0, pos.z + 0);
		arr[2] = Vector3IntRef.create(pos.x - 1, pos.y + 0, pos.z + 0);
		arr[3] = Vector3IntRef.create(pos.x + 0, pos.y + 1, pos.z + 0);
		arr[4] = Vector3IntRef.create(pos.x + 0, pos.y - 1, pos.z + 0);
		arr[5] = Vector3IntRef.create(pos.x + 0, pos.y + 0, pos.z + 1);
		arr[6] = Vector3IntRef.create(pos.x + 0, pos.y + 0, pos.z - 1);
		return arr;
	}

	private void calculateShadows(int cx, int cy, int cz)
	{
		for (int i = 0; i < 1024; i++) {
			if (this.game.blocktypes[i] == null) {
				continue;
			}
			this.calculateShadowslightRadius[i] = this.game.blocktypes[i].lightRadius;
			this.calculateShadowsisTransparentForLight[i] = this.isTransparentForLight(i);
		}
		for (int xx = 0; xx < 3; xx++) {
			for (int yy = 0; yy < 3; yy++) {
				for (int zz = 0; zz < 3; zz++) {
					int cx1 = cx + xx - 1;
					int cy1 = cy + yy - 1;
					int cz1 = cz + zz - 1;
					if (!this.game.map.isValidChunkPos(cx1, cy1, cz1)) {
						continue;
					}
					Chunk c = this.game.map.getChunk(cx1 * this.chunksize, cy1 * this.chunksize, cz1 * this.chunksize);
					if (c.baseLightDirty) {
						this.lightBase.calculateChunkBaseLight(this.game, cx1, cy1, cz1, this.calculateShadowslightRadius, this.calculateShadowsisTransparentForLight);
						c.baseLightDirty = false;
					}
				}
			}
		}
		Chunk chunk = this.game.map.getChunk(cx * this.chunksize, cy * this.chunksize, cz * this.chunksize);
		if (chunk.rendered.light == null) {
			chunk.rendered.light = new byte[5832];
			for (int i = 0; i < 5832; i++) {
				chunk.rendered.light[i] = 15;
			}
		}
		this.lightBetweenChunks.calculateLightBetweenChunks(this.game, cx, cy, cz, this.calculateShadowslightRadius, this.calculateShadowsisTransparentForLight);
		for (int i = 0; i < 5832; i++) {
			this.currentChunkShadows[i] = chunk.rendered.light[i];
		}
	}
	private boolean[] calculateShadowsisTransparentForLight;
	private int[] calculateShadowslightRadius;

	public final int chunkUpdates()
	{
		return this.chunkupdates;
	}

	final void clear()
	{
		this.game.d_Batcher.clear();
	}

	@Override
	public void dispose(Game game_)
	{
		this.clear();
	}

	private void doRedraw(TerrainRendererRedraw r)
	{
		this.idsCount = 0;
		Chunk c = r.c;
		if (c.rendered.ids != null) {
			for (int i = 0; i < c.rendered.idsCount; i++) {
				int loadedSubmesh = c.rendered.ids[i];
				this.game.d_Batcher.remove(loadedSubmesh);
			}
		}
		for (int i = 0; i < r.dataCount; i++) {
			VerticesIndicesToLoad submesh = r.data[i];
			if (submesh.modelData.getIndicesCount() != 0) {
				float centerVecX = submesh.positionX + this.chunksize / 2;
				float centerVecY = submesh.positionZ + this.chunksize / 2;
				float centerVecZ = submesh.positionY + this.chunksize / 2;
				float radius = this.sqrt3half * this.chunksize;
				this.ids[this.idsCount++] = this.game.d_Batcher.add(submesh.modelData, submesh.transparent, submesh.texture, centerVecX, centerVecY, centerVecZ, radius);
			}
		}
		int[] idsarr = new int[this.idsCount];
		for (int i = 0; i < this.idsCount; i++) {
			idsarr[i] = this.ids[i];
		}
		c.rendered.ids = idsarr;
		c.rendered.idsCount = this.idsCount;
	}

	public final void drawTerrain()
	{
		this.game.d_Batcher.draw(this.game.player.position.x, this.game.player.position.y, this.game.player.position.z);
	}

	private void getExtendedChunk(int x, int y, int z)
	{
		this.game.map.getMapPortion(this.currentChunk, x * this.chunksize - 1, y * this.chunksize - 1, z * this.chunksize - 1, this.chunksize + 2, this.chunksize + 2, this.chunksize + 2);
	}

	private boolean isSolidChunk(int[] currentChunk, int length)
	{
		int block = currentChunk[0];
		for (int i = 0; i < length; i++) {
			if (currentChunk[i] != currentChunk[0]) {
				return false;
			}
		}
		return true;
	}

	public final boolean isTransparentForLight(int block)
	{
		Packet_BlockType b = this.game.blocktypes[block];
		return b.drawType != 1 && b.drawType != 8;
	}

	public final void mainThreadCommit()
	{
		for (int i = 0; i < this.redrawCount; i++) {
			this.doRedraw(this.redraw[i]);
			this.redraw[i] = null;
		}
		this.redrawCount = 0;
	}

	private ModelData modelDataClone(ModelData source)
	{
		ModelData dest = new ModelData();
		dest.xyz = new float[source.getXyzCount()];
		for (int i = 0; i < source.getXyzCount(); i++) {
			dest.xyz[i] = source.xyz[i];
		}
		dest.uv = new float[source.getUvCount()];
		for (int i = 0; i < source.getUvCount(); i++) {
			dest.uv[i] = source.uv[i];
		}
		dest.rgba = new byte[source.getRgbaCount()];
		for (int i = 0; i < source.getRgbaCount(); i++) {
			dest.rgba[i] = source.rgba[i];
		}
		dest.indices = new int[source.getIndicesCount()];
		for (int i = 0; i < source.getIndicesCount(); i++) {
			dest.indices[i] = source.indices[i];
		}
		dest.setVerticesCount(source.getVerticesCount());
		dest.setIndicesCount(source.getIndicesCount());
		return dest;
	}

	private void nearestDirty(int[] nearestpos)
	{
		int nearestdist = 2147483647;
		nearestpos[0] = -1;
		nearestpos[1] = -1;
		nearestpos[2] = -1;
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
		if (endx >= this.mapsizexchunks()) {
			endx = this.mapsizexchunks() - 1;
		}
		if (endy >= this.mapsizeychunks()) {
			endy = this.mapsizeychunks() - 1;
		}
		if (endz >= this.mapsizezchunks()) {
			endz = this.mapsizezchunks() - 1;
		}
		int mapsizexchunks_ = this.mapsizexchunks();
		int mapsizeychunks_ = this.mapsizeychunks();
		for (int x = startx; x <= endx; x++) {
			for (int y = starty; y <= endy; y++) {
				for (int z = startz; z <= endz; z++) {
					Chunk c = this.game.map.chunks[(z * mapsizeychunks_ + y) * mapsizexchunks_ + x];
					if (c == null || c.rendered == null) {
						continue;
					}
					if (c.rendered.dirty) {
						int dx = px - x;
						int dy = py - y;
						int dz = pz - z;
						int dist = dx * dx + dy * dy + dz * dz;
						if (dist < nearestdist) {
							nearestdist = dist;
							nearestpos[0] = x;
							nearestpos[1] = y;
							nearestpos[2] = z;
						}
					}
				}
			}
		}
	}

	@Override
	public void onNewFrameDraw3d(Game game_, float deltaTime)
	{
		this.game = game_;
		if (!this.started) {
			this.started = true;
		}
		if (this.game.shouldRedrawAllBlocks) {
			this.game.shouldRedrawAllBlocks = false;
			this.redrawAllBlocks();
		}
		this.drawTerrain();
		this.updatePerformanceInfo(deltaTime);
	}

	@Override
	public void onReadOnlyBackgroundThread(Game game_, float dt)
	{
		this.game = game_;
		this.updateTerrain();
		game_.queueActionCommit(TerrainRendererCommit.create(this));
	}

	public final void redrawAllBlocks()
	{
		if (!this.terrainRendererStarted) {
			this.startTerrain();
		}
		int chunksLength = this.game.map.mapSizeX / this.chunksize * this.game.map.mapSizeY / this.chunksize * this.game.map.mapSizeZ / this.chunksize;
		for (int i = 0; i < chunksLength; i++) {
			Chunk c = this.game.map.chunks[i];
			if (c == null) {
				continue;
			}
			if (c.rendered == null) {
				c.rendered = new RenderedChunk();
			}
			c.rendered.dirty = true;
			c.baseLightDirty = true;
		}
	}

	private void redrawChunk(int x, int y, int z)
	{
		Chunk c = this.game.map.chunks[MapUtilCi.index3d(x, y, z, this.mapsizexchunks(), this.mapsizeychunks())];
		if (c == null) {
			return;
		}
		if (c.rendered == null) {
			c.rendered = new RenderedChunk();
		}
		c.rendered.dirty = false;
		this.chunkupdates++;
		this.getExtendedChunk(x, y, z);
		TerrainRendererRedraw r = new TerrainRendererRedraw();
		r.c = c;
		VerticesIndicesToLoad[] a = null;
		IntRef retCount = new IntRef();
		if (!this.isSolidChunk(this.currentChunk, (this.chunksize + 2) * (this.chunksize + 2) * (this.chunksize + 2))) {
			this.calculateShadows(x, y, z);
			a = this.game.d_TerrainChunkTesselator.makeChunk(x, y, z, this.currentChunk, this.currentChunkShadows, this.game.mLightLevels, retCount);
		}
		r.data = new VerticesIndicesToLoad[retCount.value];
		for (int i = 0; i < retCount.value; i++) {
			r.data[i] = this.verticesIndicesToLoadClone(a[i]);
		}
		r.dataCount = retCount.value;
		this.redraw[this.redrawCount++] = r;
	}

	public final void startTerrain()
	{
		this.sqrt3half = this.game.platform.mathSqrt(3) / 2;
		this.game.d_TerrainChunkTesselator.start();
		this.terrainRendererStarted = true;
		this.chunksize = 16;
	}

	public final int trianglesCount()
	{
		return this.game.d_Batcher.totalTriangleCount();
	}

	final void updatePerformanceInfo(float dt)
	{
		float elapsed = 1f * (this.game.platform.timeMillisecondsFromStart() - this.lastPerformanceInfoupdateMilliseconds) / 1000;
		int triangles = this.trianglesCount();
		if (elapsed >= 1) {
			this.lastPerformanceInfoupdateMilliseconds = this.game.platform.timeMillisecondsFromStart();
			int chunkupdates_ = this.chunkUpdates();
			this.game.performanceinfo.set("chunk updates", this.game.platform.stringFormat(this.game.language.chunkUpdates(), this.game.platform.intToString(chunkupdates_ - this.lastchunkupdates)));
			this.lastchunkupdates = this.chunkUpdates();
			this.game.performanceinfo.set("triangles", this.game.platform.stringFormat(this.game.language.triangles(), this.game.platform.intToString(triangles)));
		}
	}

	public final void updateTerrain()
	{
		if (!this.terrainRendererStarted) {
			return;
		}
		if (!(this.game.lastplacedblockX == -1 && this.game.lastplacedblockY == -1 && this.game.lastplacedblockZ == -1)) {
			HashSetVector3IntRef ChunksToRedraw = new HashSetVector3IntRef();
			Vector3IntRef[] around = ModDrawTerrain.blocksAround7(Vector3IntRef.create(this.game.lastplacedblockX, this.game.lastplacedblockY, this.game.lastplacedblockZ));
			for (int i = 0; i < 7; i++) {
				Vector3IntRef a = around[i];
				ChunksToRedraw.set(Vector3IntRef.create(a.x / this.chunksize, a.y / this.chunksize, a.z / this.chunksize));
			}
			for (int i = 0; i < ChunksToRedraw.max; i++) {
				if (ChunksToRedraw.values[i] == null) {
					break;
				}
				int[] c = new int[3];
				int xx = ChunksToRedraw.values[i].x;
				int yy = ChunksToRedraw.values[i].y;
				int zz = ChunksToRedraw.values[i].z;
				if (xx >= 0 && yy >= 0 && zz >= 0 && xx < this.game.map.mapSizeX / this.chunksize && yy < this.game.map.mapSizeY / this.chunksize && zz < this.game.map.mapSizeZ / this.chunksize) {
					Chunk chunk = this.game.map.chunks[(zz * this.mapsizeychunks() + yy) * this.mapsizexchunks() + xx];
					if (chunk == null || chunk.rendered == null) {
						continue;
					}
					if (chunk.rendered.dirty) {
						this.redrawChunk(xx, yy, zz);
					}
				}
			}
			this.game.lastplacedblockX = -1;
			this.game.lastplacedblockY = -1;
			this.game.lastplacedblockZ = -1;
		}
		int updated = 0;
		for (;;) {
			this.nearestDirty(this.tempnearestpos);
			if (this.tempnearestpos[0] == -1 && this.tempnearestpos[1] == -1 && this.tempnearestpos[2] == -1) {
				break;
			}
			this.redrawChunk(this.tempnearestpos[0], this.tempnearestpos[1], this.tempnearestpos[2]);
			{
				break;
			}
		}
	}

	private VerticesIndicesToLoad verticesIndicesToLoadClone(VerticesIndicesToLoad source)
	{
		VerticesIndicesToLoad dest = new VerticesIndicesToLoad();
		dest.modelData = this.modelDataClone(source.modelData);
		dest.positionX = source.positionX;
		dest.positionY = source.positionY;
		dest.positionZ = source.positionZ;
		dest.texture = source.texture;
		dest.transparent = source.transparent;
		return dest;
	}

	private final int centerAreaSize()
	{
		return this.game.platform.floatToInt(this.game.d_Config3d.viewdistance) / 2;
	}
	private int chunksize;
	private int chunkupdates;
	private int[] currentChunk;
	private byte[] currentChunkShadows;
	Game game;
	private int[] ids;
	private int idsCount;
	private int lastPerformanceInfoupdateMilliseconds;
	private int lastchunkupdates;
	private LightBase lightBase;
	private LightBetweenChunks lightBetweenChunks;

	private int mapAreaSize()
	{
		return this.game.platform.floatToInt(this.game.d_Config3d.viewdistance) * 2;
	}

	private int mapAreaSizeZ()
	{
		return this.mapAreaSize();
	}

	private int mapsizexchunks()
	{
		return this.game.map.mapsizexchunks();
	}

	private int mapsizeychunks()
	{
		return this.game.map.mapsizeychunks();
	}

	private int mapsizezchunks()
	{
		return this.game.map.mapsizezchunks();
	}

	public final int maxlight()
	{
		return 15;
	}
	private TerrainRendererRedraw[] redraw;
	private int redrawCount;
	private float sqrt3half;
	private boolean started;
	private int[] tempnearestpos;
	private boolean terrainRendererStarted;
}
