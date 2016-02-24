// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class BlockPosSide
{
	public BlockPosSide()
	{
	}

	public static BlockPosSide create(int x, int y, int z)
	{
		BlockPosSide p = new BlockPosSide();
		p.blockPos = Vec3.fromValues(x, y, z);
		return p;
	}

	public final float[] current()
	{
		return this.blockPos;
	}

	public final float[] translated()
	{
		float[] translated = new float[3];
		translated[0] = this.blockPos[0];
		translated[1] = this.blockPos[1];
		translated[2] = this.blockPos[2];
		if (this.collisionPos == null) {
			return translated;
		}
		if (this.collisionPos[0] == this.blockPos[0]) {
			translated[0] = translated[0] - 1;
		}
		if (this.collisionPos[1] == this.blockPos[1]) {
			translated[1] = translated[1] - 1;
		}
		if (this.collisionPos[2] == this.blockPos[2]) {
			translated[2] = translated[2] - 1;
		}
		if (this.collisionPos[0] == this.blockPos[0] + 1) {
			translated[0] = translated[0] + 1;
		}
		if (this.collisionPos[1] == this.blockPos[1] + 1) {
			translated[1] = translated[1] + 1;
		}
		if (this.collisionPos[2] == this.blockPos[2] + 1) {
			translated[2] = translated[2] + 1;
		}
		return translated;
	}
	float[] blockPos;
	float[] collisionPos;
}
