// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

class NotifyMapAction extends Action_
{

	private void loadAndSendChunk(int x, int y, int z)
	{
		ClientSimple c = this.server.clients[this.clientId];
		int pos = MapUtilCi.index2d(x, y, this.server.mapSizeX / 32);
		if (c.chunksseen[pos] == null) {
			c.chunksseen[pos] = new boolean[this.server.mapSizeZ / 32];
		}
		c.chunksseen[pos][z] = true;
		int[] chunk = new int[32768];
		for (int i = 0; i < this.server.modsCount; i++) {
			this.server.mods[i].generateChunk(x, y, z, chunk);
		}
		byte[] chunkBytes = MiscCi.ushortArrayToByteArray(chunk, 32768);
		IntRef compressedLength = new IntRef();
		byte[] chunkCompressed = this.server.platform.gzipCompress(chunkBytes, 65536, compressedLength);
		this.server.queueMainThreadAction(SendPacketAction.create(this.server, this.clientId, ServerPackets.chunkPart(chunkCompressed)));
		this.server.queueMainThreadAction(SendPacketAction.create(this.server, this.clientId, ServerPackets.chunk_(x * 32, y * 32, z * 32, 32)));
	}

	private void nearestDirty(int clientid, int playerx, int playery, int playerz, int[] retNearest)
	{
		int nearestdist = 2147483647;
		retNearest[0] = -1;
		retNearest[1] = -1;
		retNearest[2] = -1;
		int px = playerx / 32;
		int py = playery / 32;
		int pz = playerz / 32;
		int chunksxy = this.mapAreaSize() / 32 / 2;
		int chunksz = this.mapAreaSizeZ() / 32 / 2;
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
		ClientSimple client = this.server.clients[clientid];
		for (int x = startx; x <= endx; x++) {
			for (int y = starty; y <= endy; y++) {
				int pos = MapUtilCi.index2d(x, y, this.server.mapSizeX / 32);
				if (client.chunksseen[pos] == null) {
					client.chunksseen[pos] = new boolean[this.server.mapSizeZ / 32];
				}
				for (int z = startz; z <= endz; z++) {
					boolean[] column = client.chunksseen[pos];
					if (column[z]) {
						continue;
					}
					{
						int dx = px - x;
						int dy = py - y;
						int dz = pz - z;
						int dist = dx * dx + dy * dy + dz * dz;
						if (dist < nearestdist) {
							nearestdist = dist;
							retNearest[0] = x;
							retNearest[1] = y;
							retNearest[2] = z;
						}
					}
				}
			}
		}
	}

	@Override
	public void run()
	{
		int[] nearest = new int[3];
		ClientSimple client = this.server.clients[this.clientId];
		int x = this.server.platform.floatToInt(client.glX);
		int y = this.server.platform.floatToInt(client.glZ);
		int z = this.server.platform.floatToInt(client.glY);
		this.nearestDirty(this.clientId, x, y, z, nearest);
		if (nearest[0] != -1) {
			this.loadAndSendChunk(nearest[0], nearest[1], nearest[2]);
		}
		this.server.clients[this.clientId].notifyMapAction = null;
	}
	int clientId;

	private int mapAreaSize()
	{
		return this.server.chunkdrawdistance * 32 * 2;
	}

	private int mapAreaSizeZ()
	{
		return this.mapAreaSize();
	}

	private int mapsizexchunks()
	{
		return this.server.mapSizeX / 32;
	}

	private int mapsizeychunks()
	{
		return this.server.mapSizeY / 32;
	}

	private int mapsizezchunks()
	{
		return this.server.mapSizeZ / 32;
	}
	ServerSimple server;
}
