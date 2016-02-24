// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class LightBase
{
	public LightBase()
	{
		this.flood = new LightFlood();
		this.workData = new int[4096];
	}

	public final void calculateChunkBaseLight(Game game, int cx, int cy, int cz, int[] dataLightRadius, boolean[] transparentForLight)
	{
		Chunk chunk = game.map.getChunk_(cx, cy, cz);
		if (chunk.data != null) {
			for (int i = 0; i < 4096; i++) {
				this.workData[i] = chunk.data[i] & 0xff;
			}
		}
		if (chunk.dataInt != null) {
			for (int i = 0; i < 4096; i++) {
				this.workData[i] = chunk.dataInt[i];
			}
		}
		int sunlight = game.sunlight_;
		byte[] workLight = chunk.baseLight;
		for (int i = 0; i < 4096; i++) {
			workLight[i] = 0;
		}
		LightBase.sunlight(game, cx, cy, cz, workLight, dataLightRadius, sunlight);
		this.sunlightFlood(this.workData, workLight, dataLightRadius, transparentForLight);
		this.lightEmitting(this.workData, workLight, dataLightRadius, transparentForLight);
	}

	private static int getLightHeight(Game game, int cx, int cy, int xx, int yy)
	{
		int[] chunk = game.d_Heightmap.chunks[MapUtilCi.index2d(cx, cy, game.map.mapSizeX / 16)];
		if (chunk == null) {
			return 0;
		}
		return chunk[MapUtilCi.index2d(xx % 16, yy % 16, 16)];
	}

	private void lightEmitting(int[] workportion, byte[] worklight, int[] dataLightRadius, boolean[] dataTransparent)
	{
		for (int pos = 0; pos < 4096; pos++) {
			if (workportion[pos] >= 10) {
				if (dataLightRadius[workportion[pos]] != 0) {
					if (dataLightRadius[workportion[pos]] > (worklight[pos] & 0xff)) {
						int xx = MapUtilCi.posX(pos, 16, 16);
						int yy = MapUtilCi.posY(pos, 16, 16);
						int zz = MapUtilCi.posZ(pos, 16, 16);
						int l = dataLightRadius[workportion[pos]];
						worklight[pos] = Game.intToByte(MathCi.maxInt(l, worklight[pos] & 0xff));
						this.flood.floodLight(workportion, worklight, xx, yy, zz, dataLightRadius, dataTransparent);
					}
				}
			}
		}
	}

	private static void sunlight(Game game, int cx, int cy, int cz, byte[] worklight, int[] dataLightRadius, int sunlight)
	{
		int baseheight = cz * 16;
		for (int xx = 0; xx < 16; xx++) {
			for (int yy = 0; yy < 16; yy++) {
				int height = LightBase.getLightHeight(game, cx, cy, xx, yy);
				int h = height - baseheight;
				if (h < 0) {
					h = 0;
				}
				if (h > 16) {
					continue;
				}
				int pos = (h * 16 + yy) * 16 + xx;
				for (int zz = h; zz < 16; zz++) {
					worklight[pos] = Game.intToByte(sunlight);
					pos += 256;
				}
			}
		}
	}

	private void sunlightFlood(int[] workportion, byte[] worklight, int[] dataLightRadius, boolean[] dataTransparent)
	{
		for (int xx = 0; xx < 16; xx++) {
			for (int yy = 0; yy < 16; yy++) {
				for (int zz = 0; zz < 16; zz++) {
					int pos = (zz * 16 + yy) * 16 + xx;
					if (!dataTransparent[workportion[pos]]) {
						continue;
					}
					int curlight = worklight[pos] & 0xff;
					int posXPlus1 = pos + 1;
					int posYPlus1 = pos + 16;
					if (xx + 1 < 16 && (worklight[posXPlus1] & 0xff) != curlight && dataTransparent[workportion[posXPlus1]]) {
						this.flood.floodLight(workportion, worklight, xx, yy, zz, dataLightRadius, dataTransparent);
						this.flood.floodLight(workportion, worklight, xx + 1, yy, zz, dataLightRadius, dataTransparent);
					}
					if (yy + 1 < 16 && (worklight[posYPlus1] & 0xff) != curlight && dataTransparent[workportion[posYPlus1]]) {
						this.flood.floodLight(workportion, worklight, xx, yy, zz, dataLightRadius, dataTransparent);
						this.flood.floodLight(workportion, worklight, xx, yy + 1, zz, dataLightRadius, dataTransparent);
					}
				}
			}
		}
	}
	private LightFlood flood;
	private int[] workData;
}
