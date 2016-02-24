// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class ModSkySphereStatic extends ClientMod
{
	public ModSkySphereStatic()
	{
		this.skyTexture = -1;
		this.skyspheretexture = -1;
		this.skyspherenighttexture = -1;
	}

	public final void draw(Game game, float fov)
	{
		if (this.skyTexture == -1) {
			game.platform.throwException("InvalidOperationException");
		}
		int size = 1000;
		if (this.skymodel == null) {
			this.skymodel = game.platform.createModel(SphereModelData.getSphereModelData(size, size, 20, 20));
		}
		game.set3dProjection(size * 2, fov);
		game.gLMatrixModeModelView();
		game.gLPushMatrix();
		game.gLTranslate(game.player.position.x, game.player.position.y, game.player.position.z);
		game.platform.bindTexture2d(this.skyTexture);
		game.drawModel(this.skymodel);
		game.gLPopMatrix();
		game.set3dProjection(game.zfar(), fov);
	}

	final void drawSkySphere(Game game)
	{
		if (this.skyspheretexture == -1) {
			BitmapCi skysphereBmp = game.platform.bitmapCreateFromPng(game.getFile("skysphere.png"), game.getFileLength("skysphere.png"));
			BitmapCi skysphereNightBmp = game.platform.bitmapCreateFromPng(game.getFile("skyspherenight.png"), game.getFileLength("skyspherenight.png"));
			this.skyspheretexture = game.platform.loadTextureFromBitmap(skysphereBmp);
			this.skyspherenighttexture = game.platform.loadTextureFromBitmap(skysphereNightBmp);
			game.platform.bitmapDelete(skysphereBmp);
			game.platform.bitmapDelete(skysphereNightBmp);
		}
		int texture = game.skySphereNight ? this.skyspherenighttexture : this.skyspheretexture;
		if (game.shadowssimple) {
			texture = this.skyspheretexture;
		}
		this.skyTexture = texture;
		this.draw(game, game.currentfov());
	}

	@Override
	public void onNewFrameDraw3d(Game game, float deltaTime)
	{
		game.platform.glDisableFog();
		this.drawSkySphere(game);
		game.setFog();
	}
	int skyTexture;
	private Model skymodel;
	int skyspherenighttexture;
	int skyspheretexture;
}
