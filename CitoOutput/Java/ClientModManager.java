// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public abstract class ClientModManager
{

	public abstract AviWriterCi aviWriterCreate();

	public abstract void displayNotification(String message);

	public abstract void draw2dText(String text, float x, float y, float fontsize);

	public abstract void draw2dTexture(int textureid, float x1, float y1, float width, float height, IntRef inAtlasId, int color);

	public abstract void draw2dTextures(Draw2dData[] todraw, int todrawLength, int textureId);

	public abstract void enableCameraControl(boolean enable);

	public abstract int getFreemove();

	public abstract float getLocalOrientationX();

	public abstract float getLocalOrientationY();

	public abstract float getLocalOrientationZ();

	public abstract float getLocalPositionX();

	public abstract float getLocalPositionY();

	public abstract float getLocalPositionZ();

	public abstract DictionaryStringString getPerformanceInfo();

	public abstract GamePlatform getPlatform();

	public abstract int getWindowHeight();

	public abstract int getWindowWidth();

	public abstract BitmapCi grabScreenshot();

	public abstract boolean isFreemoveAllowed();

	public abstract void makeScreenshot();

	public abstract void orthoMode();

	public abstract void perspectiveMode();

	public abstract void sendChatMessage(String message);

	public abstract void setFreemove(int level);

	public abstract void setLocalOrientation(float glx, float gly, float glz);

	public abstract void setLocalPosition(float glx, float gly, float glz);

	public abstract void showGui(int level);

	public abstract int whiteTexture();
}
