// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class ModDrawTestModel extends ClientMod
{

	private void drawTestModel(Game game, float deltaTime)
	{
		if (!game.eNABLE_DRAW_TEST_CHARACTER) {
			return;
		}
		if (this.testmodel == null) {
			this.testmodel = new AnimatedModelRenderer();
			byte[] data = game.getFile("player.txt");
			int dataLength = game.getFileLength("player.txt");
			String dataString = game.platform.stringFromUtf8ByteArray(data, dataLength);
			AnimatedModel model = AnimatedModelSerializer.deserialize(game.platform, dataString);
			this.testmodel.start(game, model);
		}
		game.gLPushMatrix();
		game.gLTranslate(game.map.mapSizeX / 2, game.blockheight(game.map.mapSizeX / 2, game.map.mapSizeY / 2 - 2, 128), game.map.mapSizeY / 2 - 2);
		game.platform.bindTexture2d(game.getTexture("mineplayer.png"));
		this.testmodel.render(deltaTime, 0, true, true, 1);
		game.gLPopMatrix();
	}

	@Override
	public boolean onClientCommand(Game game, ClientCommandArgs args)
	{
		if (args.command.equals("testmodel")) {
			game.eNABLE_DRAW_TEST_CHARACTER = game.boolCommandArgument(args.arguments);
			return true;
		}
		return false;
	}

	@Override
	public void onNewFrameDraw3d(Game game, float deltaTime)
	{
		if (game.guistate == GuiState.MAP_LOADING) {
			return;
		}
		this.drawTestModel(game, deltaTime);
	}
	private AnimatedModelRenderer testmodel;
}
