// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class ModClearInactivePlayersDrawInfo extends ClientMod
{

	@Override
	public void onNewFrameFixed(Game game, NewFrameEventArgs args)
	{
		float one = 1;
		int now = game.platform.timeMillisecondsFromStart();
		for (int i = 0; i < 64; i++) {
			if (game.entities[i] == null) {
				continue;
			}
			if (game.entities[i].playerDrawInfo == null) {
				continue;
			}
			if (game.entities[i].networkPosition == null) {
				continue;
			}
			int kKey = i;
			Entity p = game.entities[i];
			if (one * (now - p.networkPosition.lastUpdateMilliseconds) / 1000 > 2) {
				p.playerDrawInfo = null;
				p.networkPosition.positionLoaded = false;
			}
		}
	}
}
