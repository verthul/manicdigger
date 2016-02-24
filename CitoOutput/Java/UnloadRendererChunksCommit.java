// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class UnloadRendererChunksCommit extends Action_
{

	@Override
	public void run()
	{
		if (this.unloadChunkPos != -1) {
			Chunk c = this.game.map.chunks[this.unloadChunkPos];
			for (int k = 0; k < c.rendered.idsCount; k++) {
				int loadedSubmesh = c.rendered.ids[k];
				this.game.d_Batcher.remove(loadedSubmesh);
			}
			c.rendered.ids = null;
			c.rendered.dirty = true;
			c.rendered.light = null;
			this.unloadChunkPos = -1;
		}
	}
	Game game;
	int unloadChunkPos;
}
