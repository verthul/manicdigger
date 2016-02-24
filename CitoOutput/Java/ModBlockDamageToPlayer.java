// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class ModBlockDamageToPlayer extends ClientMod
{
	public ModBlockDamageToPlayer()
	{
		this.one = 1;
		this.blockDamageToPlayerTimer = TimerCi.create(1, 2);
	}
	public static final int BLOCK_DAMAGE_TO_PLAYER_EVERY = 1;
	private TimerCi blockDamageToPlayerTimer;

	@Override
	public void onNewFrameFixed(Game game, NewFrameEventArgs args)
	{
		if (game.guistate == GuiState.MAP_LOADING) {
			return;
		}
		if (game.followId() == null) {
			this.updateBlockDamageToPlayer(game, args.getDt());
		}
	}

	final void updateBlockDamageToPlayer(Game game, float dt)
	{
		float pX = game.player.position.x;
		float pY = game.player.position.y;
		float pZ = game.player.position.z;
		pY += game.entities[game.localPlayerId].drawModel.eyeHeight;
		int block1 = 0;
		int block2 = 0;
		if (game.map.isValidPos(game.mathFloor(pX), game.mathFloor(pZ), game.mathFloor(pY))) {
			block1 = game.map.getBlock(game.platform.floatToInt(pX), game.platform.floatToInt(pZ), game.platform.floatToInt(pY));
		}
		if (game.map.isValidPos(game.mathFloor(pX), game.mathFloor(pZ), game.mathFloor(pY) - 1)) {
			block2 = game.map.getBlock(game.platform.floatToInt(pX), game.platform.floatToInt(pZ), game.platform.floatToInt(pY) - 1);
		}
		int damage = game.d_Data.damageToPlayer()[block1] + game.d_Data.damageToPlayer()[block2];
		if (damage > 0) {
			int hurtingBlock = block1;
			if (hurtingBlock == 0 || game.d_Data.damageToPlayer()[hurtingBlock] == 0) {
				hurtingBlock = block2;
			}
			int times = this.blockDamageToPlayerTimer.update(dt);
			for (int i = 0; i < times; i++) {
				game.applyDamageToPlayer(damage, 1, hurtingBlock);
			}
		}
		int deltaTime = game.platform.floatToInt(this.one * (game.platform.timeMillisecondsFromStart() - game.lastOxygenTickMilliseconds));
		if (deltaTime >= 1000) {
			if (game.waterSwimmingEyes()) {
				game.playerStats.currentOxygen -= 1;
				if (game.playerStats.currentOxygen <= 0) {
					game.playerStats.currentOxygen = 0;
					int dmg = game.platform.floatToInt(this.one * game.playerStats.maxHealth / 10);
					if (dmg < 1) {
						dmg = 1;
					}
					game.applyDamageToPlayer(dmg, 2, block1);
				}
			}
			else {
				game.playerStats.currentOxygen = game.playerStats.maxOxygen;
			}
			if (GameVersionHelper.serverVersionAtLeast(game.platform, game.serverGameVersion, 2014, 3, 31)) {
				game.sendPacketClient(ClientPackets.oxygen(game.playerStats.currentOxygen));
			}
			game.lastOxygenTickMilliseconds = game.platform.timeMillisecondsFromStart();
		}
	}
	private float one;
}
