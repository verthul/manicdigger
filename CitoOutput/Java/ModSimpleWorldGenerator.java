// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class ModSimpleWorldGenerator extends ModSimple
{

	@Override
	public void generateChunk(int cx, int cy, int cz, int[] chunk)
	{
		int grass = this.m.getBlockTypeId("Grass");
		int dirt = this.m.getBlockTypeId("Dirt");
		int stone = this.m.getBlockTypeId("Stone");
		int adminium = this.m.getBlockTypeId("Adminium");
		for (int xx = 0; xx < 32; xx++) {
			for (int yy = 0; yy < 32; yy++) {
				for (int zz = 0; zz < 32; zz++) {
					int z = cz * 32 + zz;
					int height = 32;
					int block = 0;
					if (z > height) {
						block = 0;
					}
					else if (z == height) {
						block = grass;
					}
					else if (z > height - 5) {
						block = dirt;
					}
					else {
						block = stone;
					}
					if (z == 0) {
						block = adminium;
					}
					chunk[(zz * 32 + yy) * 32 + xx] = block;
				}
			}
		}
	}

	@Override
	public int getHeight()
	{
		return 33;
	}

	@Override
	public void start(ModManagerSimple manager)
	{
		this.m = manager;
	}
	private ModManagerSimple m;
}
