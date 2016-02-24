// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class DrawWireframeCube
{
	public DrawWireframeCube()
	{
		this.one = 1;
	}

	public final void drawWireframeCube_(Game game, float posx, float posy, float posz, float scalex, float scaley, float scalez)
	{
		game.platform.gLLineWidth(2);
		game.platform.bindTexture2d(0);
		if (this.wireframeCube == null) {
			ModelData data = WireframeCube.get();
			this.wireframeCube = game.platform.createModel(data);
		}
		game.gLPushMatrix();
		game.gLTranslate(posx, posy, posz);
		float half = this.one / 2;
		game.gLScale(scalex * half, scaley * half, scalez * half);
		game.drawModel(this.wireframeCube);
		game.gLPopMatrix();
	}
	private float one;
	private Model wireframeCube;
}
