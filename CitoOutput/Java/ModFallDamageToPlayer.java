// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class ModFallDamageToPlayer extends ClientMod
{
	public ModFallDamageToPlayer()
	{
		this.one = 1;
		this.fallSoundPlaying = false;
	}

	@Override
	public void onNewFrameFixed(Game game, NewFrameEventArgs args)
	{
		if (game.guistate == GuiState.MAP_LOADING) {
			return;
		}
		if (game.controls.getFreemove() != 0) {
			if (this.fallSoundPlaying) {
				this.setFallSoundActive(game, false);
			}
			return;
		}
		if (game.followId() == null) {
			this.updateFallDamageToPlayer(game, args.getDt());
		}
	}

	final void setFallSoundActive(Game game, boolean active)
	{
		game.audioPlayLoop("fallloop.wav", active, true);
		this.fallSoundPlaying = active;
	}

	final void updateFallDamageToPlayer(Game game, float dt)
	{
		float movedz = game.movedz;
		float fallspeed = movedz / -game.basemovespeed;
		int posX = game.getPlayerEyesBlockX();
		int posY = game.getPlayerEyesBlockY();
		int posZ = game.getPlayerEyesBlockZ();
		if (game.blockheight(posX, posY, posZ) < posZ - 8 || fallspeed > 3) {
			this.setFallSoundActive(game, fallspeed > 2);
		}
		else {
			this.setFallSoundActive(game, false);
		}
		if (game.map.isValidPos(posX, posY, posZ - 3)) {
			int blockBelow = game.map.getBlock(posX, posY, posZ - 3);
			if (blockBelow != 0 && !game.isWater(blockBelow)) {
				float severity = 0;
				if (fallspeed < 4) {
					return;
				}
				else if (fallspeed < this.one * 45 / 10) {
					severity = this.one * 3 / 10;
				}
				else if (fallspeed < 5) {
					severity = this.one * 5 / 10;
				}
				else if (fallspeed < this.one * 55 / 10) {
					severity = this.one * 6 / 10;
				}
				else if (fallspeed < 6) {
					severity = this.one * 8 / 10;
				}
				else {
					severity = 1;
				}
				if (this.one * (game.platform.timeMillisecondsFromStart() - this.lastfalldamagetimeMilliseconds) / 1000 < 1) {
					return;
				}
				this.lastfalldamagetimeMilliseconds = game.platform.timeMillisecondsFromStart();
				game.applyDamageToPlayer(game.platform.floatToInt(severity * game.playerStats.maxHealth), 0, 0);
			}
		}
	}
	private boolean fallSoundPlaying;
	private int lastfalldamagetimeMilliseconds;
	private float one;
}
