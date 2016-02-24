// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class ModSendPosition extends ClientMod
{

	@Override
	public void onNewFrame(Game game, NewFrameEventArgs args)
	{
		if (game.spawned && game.platform.timeMillisecondsFromStart() - game.lastpositionsentMilliseconds > 100) {
			game.lastpositionsentMilliseconds = game.platform.timeMillisecondsFromStart();
			game.sendPacketClient(ClientPackets.positionAndOrientation(game, game.localPlayerId, game.player.position.x, game.player.position.y, game.player.position.z, game.player.position.rotx, game.player.position.roty, game.player.position.rotz, game.localstance));
		}
	}
}
