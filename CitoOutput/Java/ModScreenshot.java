// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class ModScreenshot extends ClientMod
{
	public ModScreenshot()
	{
		this.takeScreenshot = false;
		this.screenshotFlashFramesLeft = 0;
	}

	final void drawScreenshotFlash(Game game)
	{
		game.draw2dTexture(game.whiteTexture(), 0, 0, game.platform.getCanvasWidth(), game.platform.getCanvasHeight(), null, 0, Game.colorFromArgb(255, 255, 255, 255), false);
		String screenshottext = "&0Screenshot";
		IntRef textWidth = new IntRef();
		IntRef textHeight = new IntRef();
		game.platform.textSize(screenshottext, 50, textWidth, textHeight);
		FontCi font = new FontCi();
		font.family = "Arial";
		font.size = 50;
		game.draw2dText(screenshottext, font, game.xcenter(textWidth.value), game.ycenter(textHeight.value), null, false);
	}

	@Override
	public void onKeyDown(Game game, KeyEventArgs args)
	{
		if (args.getKeyCode() == game.getKey(21)) {
			this.takeScreenshot = true;
			args.setHandled(true);
		}
	}

	@Override
	public void onNewFrameDraw2d(Game game, float deltaTime)
	{
		if (this.takeScreenshot) {
			this.takeScreenshot = false;
			game.platform.saveScreenshot();
			this.screenshotFlashFramesLeft = 5;
		}
		if (this.screenshotFlashFramesLeft > 0) {
			this.drawScreenshotFlash(game);
			this.screenshotFlashFramesLeft--;
		}
	}
	private int screenshotFlashFramesLeft;
	private boolean takeScreenshot;
}
