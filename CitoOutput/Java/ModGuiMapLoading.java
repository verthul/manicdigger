// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class ModGuiMapLoading extends ClientMod
{

	private void drawBackground(Game game)
	{
		this.backgroundW = 512;
		this.backgroundH = 512;
		int countX = game.platform.floatToInt(this.width / this.backgroundW) + 1;
		int countY = game.platform.floatToInt(this.height / this.backgroundH) + 1;
		for (int x = 0; x < countX; x++) {
			for (int y = 0; y < countY; y++) {
				game.draw2dTexture(game.getTexture("background.png"), x * this.backgroundW, y * this.backgroundH, this.backgroundW, this.backgroundH, null, 0, Game.colorFromArgb(255, 255, 255, 255), false);
			}
		}
	}
	private int height;

	@Override
	public void onNewFrameDraw2d(Game game, float deltaTime)
	{
		if (game.guistate != GuiState.MAP_LOADING) {
			return;
		}
		GamePlatform platform = game.platform;
		float one = 1;
		this.width = platform.getCanvasWidth();
		this.height = platform.getCanvasHeight();
		this.drawBackground(game);
		String connecting = game.language.connecting();
		if (game.issingleplayer && !platform.singlePlayerServerLoaded()) {
			connecting = "Starting game...";
		}
		if (game.maploadingprogress.progressStatus != null) {
			connecting = game.maploadingprogress.progressStatus;
		}
		if (game.invalidVersionDrawMessage != null) {
			game.draw2dText(game.invalidVersionDrawMessage, game.fontMapLoading, game.xcenter(game.textSizeWidth(game.invalidVersionDrawMessage, 14)), this.height / 2 - 50, null, false);
			String connect = "Click to connect";
			game.draw2dText(connect, game.fontMapLoading, game.xcenter(game.textSizeWidth(connect, 14)), this.height / 2 + 50, null, false);
			return;
		}
		IntRef serverNameWidth = new IntRef();
		IntRef serverNameHeight = new IntRef();
		platform.textSize(game.serverInfo.serverName, 14, serverNameWidth, serverNameHeight);
		game.draw2dText(game.serverInfo.serverName, game.fontMapLoading, game.xcenter(serverNameWidth.value), this.height / 2 - 150, null, false);
		if (game.serverInfo.serverMotd != null) {
			IntRef serverMotdWidth = new IntRef();
			IntRef serverMotdHeight = new IntRef();
			platform.textSize(game.serverInfo.serverMotd, 14, serverMotdWidth, serverMotdHeight);
			game.draw2dText(game.serverInfo.serverMotd, game.fontMapLoading, game.xcenter(serverMotdWidth.value), this.height / 2 - 100, null, false);
		}
		IntRef connectingWidth = new IntRef();
		IntRef connectingHeight = new IntRef();
		platform.textSize(connecting, 14, connectingWidth, connectingHeight);
		game.draw2dText(connecting, game.fontMapLoading, game.xcenter(connectingWidth.value), this.height / 2 - 50, null, false);
		String progress = platform.stringFormat(game.language.connectingProgressPercent(), platform.intToString(game.maploadingprogress.progressPercent));
		String progress1 = platform.stringFormat(game.language.connectingProgressKilobytes(), platform.intToString(game.maploadingprogress.progressBytes / 1024));
		if (game.maploadingprogress.progressPercent > 0) {
			IntRef progressWidth = new IntRef();
			IntRef progressHeight = new IntRef();
			platform.textSize(progress, 14, progressWidth, progressHeight);
			game.draw2dText(progress, game.fontMapLoading, game.xcenter(progressWidth.value), this.height / 2 - 20, null, false);
			IntRef progress1Width = new IntRef();
			IntRef progress1Height = new IntRef();
			platform.textSize(progress1, 14, progress1Width, progress1Height);
			game.draw2dText(progress1, game.fontMapLoading, game.xcenter(progress1Width.value), this.height / 2 + 10, null, false);
			float progressratio = one * game.maploadingprogress.progressPercent / 100;
			int sizex = 400;
			int sizey = 40;
			game.draw2dTexture(game.whiteTexture(), game.xcenter(sizex), this.height / 2 + 70, sizex, sizey, null, 0, Game.colorFromArgb(255, 0, 0, 0), false);
			int red = Game.colorFromArgb(255, 255, 0, 0);
			int yellow = Game.colorFromArgb(255, 255, 255, 0);
			int green = Game.colorFromArgb(255, 0, 255, 0);
			int[] colors = new int[3];
			colors[0] = red;
			colors[1] = yellow;
			colors[2] = green;
			int c = InterpolationCi.interpolateColor(platform, progressratio, colors, 3);
			game.draw2dTexture(game.whiteTexture(), game.xcenter(sizex), this.height / 2 + 70, progressratio * sizex, sizey, null, 0, c, false);
		}
	}
	private int width;
	private int backgroundH;
	private int backgroundW;
}
