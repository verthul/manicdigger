// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class ModWalkSound extends ClientMod
{
	public ModWalkSound()
	{
		this.one = 1;
		this.walksoundtimer = 0;
		this.lastwalksound = 0;
		this.stepsoundduration = this.one * 4 / 10;
	}

	final int getSoundCount(String[] soundwalk)
	{
		int count = 0;
		for (int i = 0; i < 8; i++) {
			if (soundwalk[i] != null) {
				count++;
			}
		}
		return count;
	}

	@Override
	public void onNewFrameFixed(Game game, NewFrameEventArgs args)
	{
		if (game.followId() == null) {
			if (game.soundnow.value) {
				this.updateWalkSound(game, -1);
			}
			if (game.isplayeronground && game.controls.movedx != 0 || game.controls.movedy != 0) {
				this.updateWalkSound(game, args.getDt());
			}
		}
	}

	final void updateWalkSound(Game game, float dt)
	{
		if (dt == -1) {
			dt = this.stepsoundduration / 2;
		}
		this.walksoundtimer += dt;
		String[] soundwalk = this.soundwalkcurrent(game);
		if (this.getSoundCount(soundwalk) == 0) {
			return;
		}
		if (this.walksoundtimer >= this.stepsoundduration) {
			this.walksoundtimer = 0;
			this.lastwalksound++;
			if (this.lastwalksound >= this.getSoundCount(soundwalk)) {
				this.lastwalksound = 0;
			}
			if (game.rnd.next() % 100 < 40) {
				this.lastwalksound = game.rnd.next() % this.getSoundCount(soundwalk);
			}
			game.audioPlay(soundwalk[this.lastwalksound]);
		}
	}
	int lastwalksound;
	private float one;

	final String[] soundwalkcurrent(Game game)
	{
		int b = game.blockUnderPlayer();
		if (b != -1) {
			return game.d_Data.walkSound()[b];
		}
		return game.d_Data.walkSound()[0];
	}
	float stepsoundduration;
	float walksoundtimer;
}
