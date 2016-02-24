// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class ClientModManager1 extends ClientModManager
{

	@Override
	public AviWriterCi aviWriterCreate()
	{
		return this.game.platform.aviWriterCreate();
	}

	@Override
	public void displayNotification(String message)
	{
		this.game.addChatline(message);
	}

	@Override
	public void draw2dText(String text, float x, float y, float fontsize)
	{
		FontCi font = new FontCi();
		font.family = "Arial";
		font.size = fontsize;
		this.game.draw2dText(text, font, x, y, null, false);
	}

	@Override
	public void draw2dTexture(int textureid, float x1, float y1, float width, float height, IntRef inAtlasId, int color)
	{
		int a = Game.colorA(color);
		int r = Game.colorR(color);
		int g = Game.colorG(color);
		int b = Game.colorB(color);
		this.game.draw2dTexture(textureid, this.game.platform.floatToInt(x1), this.game.platform.floatToInt(y1), this.game.platform.floatToInt(width), this.game.platform.floatToInt(height), inAtlasId, 0, Game.colorFromArgb(a, r, g, b), false);
	}

	@Override
	public void draw2dTextures(Draw2dData[] todraw, int todrawLength, int textureId)
	{
		this.game.draw2dTextures(todraw, todrawLength, textureId);
	}

	@Override
	public void enableCameraControl(boolean enable)
	{
		this.game.enableCameraControl = enable;
	}

	@Override
	public int getFreemove()
	{
		return this.game.controls.getFreemove();
	}

	@Override
	public float getLocalOrientationX()
	{
		return this.game.player.position.rotx;
	}

	@Override
	public float getLocalOrientationY()
	{
		return this.game.player.position.roty;
	}

	@Override
	public float getLocalOrientationZ()
	{
		return this.game.player.position.rotz;
	}

	@Override
	public float getLocalPositionX()
	{
		return this.game.player.position.x;
	}

	@Override
	public float getLocalPositionY()
	{
		return this.game.player.position.y;
	}

	@Override
	public float getLocalPositionZ()
	{
		return this.game.player.position.z;
	}

	@Override
	public DictionaryStringString getPerformanceInfo()
	{
		return this.game.performanceinfo;
	}

	@Override
	public GamePlatform getPlatform()
	{
		return this.game.platform;
	}

	@Override
	public int getWindowHeight()
	{
		return this.game.platform.getCanvasHeight();
	}

	@Override
	public int getWindowWidth()
	{
		return this.game.platform.getCanvasWidth();
	}

	@Override
	public BitmapCi grabScreenshot()
	{
		return this.game.platform.grabScreenshot();
	}

	@Override
	public boolean isFreemoveAllowed()
	{
		return this.game.allowFreemove;
	}

	@Override
	public void makeScreenshot()
	{
		this.game.platform.saveScreenshot();
	}

	@Override
	public void orthoMode()
	{
		this.game.orthoMode(this.getWindowWidth(), this.getWindowHeight());
	}

	@Override
	public void perspectiveMode()
	{
		this.game.perspectiveMode();
	}

	@Override
	public void sendChatMessage(String message)
	{
		this.game.sendChat(message);
	}

	@Override
	public void setFreemove(int level)
	{
		this.game.controls.setFreemove(level);
	}

	@Override
	public void setLocalOrientation(float glx, float gly, float glz)
	{
		this.game.player.position.rotx = glx;
		this.game.player.position.roty = gly;
		this.game.player.position.rotz = glz;
	}

	@Override
	public void setLocalPosition(float glx, float gly, float glz)
	{
		this.game.player.position.x = glx;
		this.game.player.position.y = gly;
		this.game.player.position.z = glz;
	}

	@Override
	public void showGui(int level)
	{
		if (level == 0) {
			this.game.eNABLE_DRAW2D = false;
		}
		else {
			this.game.eNABLE_DRAW2D = true;
		}
	}

	@Override
	public int whiteTexture()
	{
		return this.game.whiteTexture();
	}
	Game game;
}
