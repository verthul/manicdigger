// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class Chunk
{
	public Chunk()
	{
		this.baseLightDirty = true;
	}

	public final boolean chunkHasData()
	{
		return this.data != null || this.dataInt != null;
	}

	public final int getBlockInChunk(int pos)
	{
		if (this.dataInt != null) {
			return this.dataInt[pos];
		}
		else {
			return this.data[pos] & 0xff;
		}
	}

	public final void setBlockInChunk(int pos, int block)
	{
		if (this.dataInt == null) {
			if (block < 255) {
				this.data[pos] = Game.intToByte(block);
			}
			else {
				int n = 4096;
				this.dataInt = new int[n];
				for (int i = 0; i < n; i++) {
					this.dataInt[i] = this.data[i] & 0xff;
				}
				this.data = null;
				this.dataInt[pos] = block;
			}
		}
		else {
			this.dataInt[pos] = block;
		}
	}
	byte[] baseLight;
	boolean baseLightDirty;
	byte[] data;
	int[] dataInt;
	RenderedChunk rendered;
}
