// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class ModDrawLinesAroundSelectedBlock extends ClientMod
{
	public ModDrawLinesAroundSelectedBlock()
	{
		this.one = 1;
		this.lines = new DrawWireframeCube();
	}

	@Override
	public void onNewFrameDraw3d(Game game, float deltaTime)
	{
		if (game.eNABLE_DRAW2D) {
			float size = this.one * 102 / 100;
			if (game.selectedEntityId != -1) {
				Entity e = game.entities[game.selectedEntityId];
				if (e != null) {
					this.lines.drawWireframeCube_(game, e.position.x, e.position.y + e.drawModel.modelHeight / 2, e.position.z, size, size * e.drawModel.modelHeight, size);
				}
			}
			else {
				if (game.selectedBlockPositionX != -1) {
					int x = game.selectedBlockPositionX;
					int y = game.selectedBlockPositionY;
					int z = game.selectedBlockPositionZ;
					float pickcubeheight = game.getblockheight(game.platform.floatToInt(x), game.platform.floatToInt(z), game.platform.floatToInt(y));
					float posx = x + this.one / 2;
					float posy = y + pickcubeheight * this.one / 2;
					float posz = z + this.one / 2;
					float scalex = size;
					float scaley = size * pickcubeheight;
					float scalez = size;
					this.lines.drawWireframeCube_(game, posx, posy, posz, scalex, scaley, scalez);
				}
			}
		}
	}
	private DrawWireframeCube lines;
	private float one;
}
