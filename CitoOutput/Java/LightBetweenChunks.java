// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class LightBetweenChunks
{
	public LightBetweenChunks()
	{
		this.chunksLight = new byte[27][];
		for (int i = 0; i < 27; i++) {
			this.chunksLight[i] = new byte[4096];
		}
		this.chunksData = new int[27][];
		for (int i = 0; i < 27; i++) {
			this.chunksData[i] = new int[4096];
		}
		this.flood = new LightFlood();
	}

	private void arrayFillByte(byte[] arr, int n, byte value)
	{
		for (int i = 0; i < n; i++) {
			arr[i] = value;
		}
	}

	private void arrayFillInt(int[] arr, int n, int value)
	{
		for (int i = 0; i < n; i++) {
			arr[i] = value;
		}
	}

	public final void calculateLightBetweenChunks(Game game, int cx, int cy, int cz, int[] dataLightRadius, boolean[] dataTransparent)
	{
		this.input(game, cx, cy, cz);
		this.floodBetweenChunks_(dataLightRadius, dataTransparent);
		this.output(game, cx, cy, cz);
	}

	private void floodBetweenChunks(byte[][] chunksLight_, byte[] cLight, byte[] dcLight, int cx, int cy, int cz, int dcx, int dcy, int dcz, int xx, int yy, int zz, int dxx, int dyy, int dzz, int[] dataLightRadius, boolean[] dataTransparent)
	{
		int sourceLight = cLight[(zz * 16 + yy) * 16 + xx] & 0xff;
		int targetLight = dcLight[(dzz * 16 + dyy) * 16 + dxx] & 0xff;
		if (targetLight < sourceLight - 1) {
			dcLight[(dzz * 16 + dyy) * 16 + dxx] = Game.intToByte(sourceLight - 1);
			this.flood.floodLight(this.chunksData[(dcz * 3 + dcy) * 3 + dcx], dcLight, dxx, dyy, dzz, dataLightRadius, dataTransparent);
		}
	}

	private void floodBetweenChunks_(int[] dataLightRadius, boolean[] dataTransparent)
	{
		for (int i = 0; i < 2; i++) {
			for (int x = 0; x < 3; x++) {
				for (int y = 0; y < 3; y++) {
					for (int z = 0; z < 3; z++) {
						byte[] clight = this.chunksLight[(z * 3 + y) * 3 + x];
						if (z < 2) {
							byte[] dclight = this.chunksLight[((z + 1) * 3 + y) * 3 + x];
							for (int xx = 0; xx < 16; xx++) {
								for (int yy = 0; yy < 16; yy++) {
									this.floodBetweenChunks(this.chunksLight, clight, dclight, x, y, z, x, y, z + 1, xx, yy, 15, xx, yy, 0, dataLightRadius, dataTransparent);
								}
							}
						}
						if (z > 0) {
							byte[] dclight = this.chunksLight[((z - 1) * 3 + y) * 3 + x];
							for (int xx = 0; xx < 16; xx++) {
								for (int yy = 0; yy < 16; yy++) {
									this.floodBetweenChunks(this.chunksLight, clight, dclight, x, y, z, x, y, z - 1, xx, yy, 0, xx, yy, 15, dataLightRadius, dataTransparent);
								}
							}
						}
						if (x < 2) {
							byte[] dclight = this.chunksLight[(z * 3 + y) * 3 + x + 1];
							for (int yy = 0; yy < 16; yy++) {
								for (int zz = 0; zz < 16; zz++) {
									this.floodBetweenChunks(this.chunksLight, clight, dclight, x, y, z, x + 1, y, z, 15, yy, zz, 0, yy, zz, dataLightRadius, dataTransparent);
								}
							}
						}
						if (x > 0) {
							byte[] dclight = this.chunksLight[(z * 3 + y) * 3 + x - 1];
							for (int yy = 0; yy < 16; yy++) {
								for (int zz = 0; zz < 16; zz++) {
									this.floodBetweenChunks(this.chunksLight, clight, dclight, x, y, z, x - 1, y, z, 0, yy, zz, 15, yy, zz, dataLightRadius, dataTransparent);
								}
							}
						}
						if (y < 2) {
							byte[] dclight = this.chunksLight[(z * 3 + y + 1) * 3 + x];
							for (int xx = 0; xx < 16; xx++) {
								for (int zz = 0; zz < 16; zz++) {
									this.floodBetweenChunks(this.chunksLight, clight, dclight, x, y, z, x, y + 1, z, xx, 15, zz, xx, 0, zz, dataLightRadius, dataTransparent);
								}
							}
						}
						if (y > 0) {
							byte[] dclight = this.chunksLight[(z * 3 + y - 1) * 3 + x];
							for (int xx = 0; xx < 16; xx++) {
								for (int zz = 0; zz < 16; zz++) {
									this.floodBetweenChunks(this.chunksLight, clight, dclight, x, y, z, x, y - 1, z, xx, 0, zz, xx, 15, zz, dataLightRadius, dataTransparent);
								}
							}
						}
					}
				}
			}
		}
	}

	private void input(Game game, int cx, int cy, int cz)
	{
		for (int x = 0; x < 3; x++) {
			for (int y = 0; y < 3; y++) {
				for (int z = 0; z < 3; z++) {
					int pcx = cx + x - 1;
					int pcy = cy + y - 1;
					int pcz = cz + z - 1;
					if (!game.map.isValidChunkPos(pcx, pcy, pcz)) {
						this.arrayFillInt(this.chunksData[(z * 3 + y) * 3 + x], 4096, 0);
						this.arrayFillByte(this.chunksLight[(z * 3 + y) * 3 + x], 4096, 0);
						continue;
					}
					Chunk p = game.map.getChunk_(pcx, pcy, pcz);
					int[] data = this.chunksData[(z * 3 + y) * 3 + x];
					if (p.data != null) {
						for (int i = 0; i < 4096; i++) {
							data[i] = p.data[i] & 0xff;
						}
					}
					if (p.dataInt != null) {
						for (int i = 0; i < 4096; i++) {
							data[i] = p.dataInt[i];
						}
					}
					byte[] light = this.chunksLight[(z * 3 + y) * 3 + x];
					for (int i = 0; i < 4096; i++) {
						light[i] = p.baseLight[i];
					}
				}
			}
		}
	}

	private void output(Game game, int cx, int cy, int cz)
	{
		Chunk chunk = game.map.getChunk_(cx, cy, cz);
		for (int x = 0; x < 18; x++) {
			for (int y = 0; y < 18; y++) {
				for (int z = 0; z < 18; z++) {
					int baseglobalx = 15 + x;
					int baseglobaly = 15 + y;
					int baseglobalz = 15 + z;
					byte light = 15;
					int basecx = baseglobalx / 16;
					int basecy = baseglobaly / 16;
					int basecz = baseglobalz / 16;
					{
						int basexx = baseglobalx % 16;
						int baseyy = baseglobaly % 16;
						int basezz = baseglobalz % 16;
						light = this.chunksLight[(basecz * 3 + basecy) * 3 + basecx][(basezz * 16 + baseyy) * 16 + basexx];
					}
					chunk.rendered.light[(z * 18 + y) * 18 + x] = light;
				}
			}
		}
	}
	private int[][] chunksData;
	private byte[][] chunksLight;
	private LightFlood flood;
}
