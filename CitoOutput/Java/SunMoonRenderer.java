// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class SunMoonRenderer extends ClientMod
{
	public SunMoonRenderer()
	{
		this.one = 1;
		this.hour = 6;
		this.t = 0;
		this.suntexture = -1;
		this.moontexture = -1;
		this.imageSize = 96;
		this.day_length_in_seconds = 30;
	}

	public final int getHour()
	{
		return this.hour;
	}
	int imageSize;

	@Override
	public void onNewFrameDraw3d(Game game, float dt)
	{
		GamePlatform platform = game.platform;
		game.gLMatrixModeModelView();
		if (this.suntexture == -1) {
			this.suntexture = game.getTexture("sun.png");
			this.moontexture = game.getTexture("moon.png");
		}
		this.updateSunMoonPosition(game, dt);
		float posX;
		float posY;
		float posZ;
		if (!game.isNight) {
			posX = game.sunPositionX;
			posY = game.sunPositionY;
			posZ = game.sunPositionZ;
		}
		else {
			posX = game.moonPositionX;
			posY = game.moonPositionY;
			posZ = game.moonPositionZ;
		}
		posX += game.player.position.x;
		posY += game.player.position.y;
		posZ += game.player.position.z;
		game.gLPushMatrix();
		game.gLTranslate(posX, posY, posZ);
		ModDrawSprites.billboard(game);
		game.gLScale(this.one * 2 / 100, this.one * 2 / 100, this.one * 2 / 100);
		game.draw2dTexture(game.isNight ? this.moontexture : this.suntexture, 0, 0, this.imageSize, this.imageSize, null, 0, Game.colorFromArgb(255, 255, 255, 255), false);
		game.gLPopMatrix();
	}

	public final void setHour(int value)
	{
		this.hour = value;
		this.t = (this.hour - 6) / (this.one * 24) * 2 * Game.getPi();
	}

	private void updateSunMoonPosition(Game game, float dt)
	{
		this.t += dt * 2 * Game.getPi() / this.day_length_in_seconds;
		game.isNight = (this.t + 2 * Game.getPi()) % (2 * Game.getPi()) > Game.getPi();
		game.sunPositionX = game.platform.mathCos(this.t) * 20;
		game.sunPositionY = game.platform.mathSin(this.t) * 20;
		game.sunPositionZ = game.platform.mathSin(this.t) * 20;
		game.moonPositionX = game.platform.mathCos(-this.t) * 20;
		game.moonPositionY = game.platform.mathSin(-this.t) * 20;
		game.moonPositionZ = game.platform.mathSin(this.t) * 20;
	}
	float day_length_in_seconds;
	private int hour;
	private int moontexture;
	private float one;
	private int suntexture;
	private float t;
}
