// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class ModDebugChunk extends ClientMod
{
	public ModDebugChunk()
	{
		this.draw = false;
		this.lines = new DrawWireframeCube();
	}

	@Override
	public boolean onClientCommand(Game game, ClientCommandArgs args)
	{
		if (args.command.equals("chunk")) {
			this.draw = !this.draw;
			return true;
		}
		return false;
	}

	@Override
	public void onNewFrameDraw3d(Game game, float deltaTime)
	{
		if (this.draw) {
			this.lines.drawWireframeCube_(game, game.platform.floatToInt(game.player.position.x / 16) * 16 + 8, game.platform.floatToInt(game.player.position.y / 16) * 16 + 8, game.platform.floatToInt(game.player.position.z / 16) * 16 + 8, 16, 16, 16);
		}
	}
	private boolean draw;
	private DrawWireframeCube lines;
}
