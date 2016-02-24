// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class TextureAtlasConverter
{

	public final BitmapCi[] atlas2dInto1d(GamePlatform p, BitmapCi atlas2d_, int tiles, int atlassizezlimit, IntRef retCount)
	{
		BitmapData_ orig = BitmapData_.createFromBitmap(p, atlas2d_);
		int tilesize = orig.width / tiles;
		int atlasescount = MathCi.maxInt(1, tiles * tiles * tilesize / atlassizezlimit);
		BitmapCi[] atlases = new BitmapCi[128];
		int atlasesCount = 0;
		BitmapData_ atlas1d = null;
		for (int i = 0; i < tiles * tiles; i++) {
			int x = i % tiles;
			int y = i / tiles;
			int tilesinatlas = tiles * tiles / atlasescount;
			if (i % tilesinatlas == 0) {
				if (atlas1d != null) {
					atlases[atlasesCount++] = atlas1d.toBitmap(p);
				}
				atlas1d = BitmapData_.create(tilesize, atlassizezlimit);
			}
			for (int xx = 0; xx < tilesize; xx++) {
				for (int yy = 0; yy < tilesize; yy++) {
					int c = orig.getPixel(x * tilesize + xx, y * tilesize + yy);
					atlas1d.setPixel(xx, i % tilesinatlas * tilesize + yy, c);
				}
			}
		}
		atlases[atlasesCount++] = atlas1d.toBitmap(p);
		retCount.value = atlasescount;
		return atlases;
	}
}
