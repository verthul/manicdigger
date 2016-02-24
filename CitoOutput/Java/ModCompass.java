// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class ModCompass extends ClientMod
{
	public ModCompass()
	{
		this.one = 1;
		this.compassid = -1;
		this.needleid = -1;
		this.compassangle = 0;
		this.compassvertex = 1;
	}

	private boolean compassInActiveMaterials(Game game)
	{
		for (int i = 0; i < 10; i++) {
			if (game.materialSlots_(i) == game.d_Data.blockIdCompass()) {
				return true;
			}
		}
		return false;
	}

	public final void drawCompass(Game game)
	{
		if (!this.compassInActiveMaterials(game))
			return;
		if (this.compassid == -1) {
			this.compassid = game.getTexture("compass.png");
			this.needleid = game.getTexture("compassneedle.png");
		}
		float size = 175;
		float posX = game.width() - 100;
		float posY = 100;
		float playerorientation = -(game.player.position.roty / (2 * Game.getPi()) * 360);
		this.compassvertex += (playerorientation - this.compassangle) / 50;
		this.compassvertex *= this.one * 9 / 10;
		this.compassangle += this.compassvertex;
		game.draw2dTexture(this.compassid, posX - size / 2, posY - size / 2, size, size, null, 0, Game.colorFromArgb(255, 255, 255, 255), false);
		game.gLPushMatrix();
		game.gLTranslate(posX, posY, 0);
		game.gLRotate(this.compassangle, 0, 0, 90);
		game.gLTranslate(-size / 2, -size / 2, 0);
		game.draw2dTexture(this.needleid, 0, 0, size, size, null, 0, Game.colorFromArgb(255, 255, 255, 255), false);
		game.gLPopMatrix();
	}

	@Override
	public void onNewFrameDraw2d(Game game, float dt)
	{
		if (game.guistate == GuiState.MAP_LOADING) {
			return;
		}
		this.drawCompass(game);
	}
	private float compassangle;
	private int compassid;
	private float compassvertex;
	private int needleid;
	private float one;
}
