// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class ModAudio extends ClientMod
{
	public ModAudio()
	{
		this.audioData = new DictionaryStringAudioData();
		this.wasLoaded = false;
	}

	private AudioData getAudioData(Game game, String sound)
	{
		if (!this.audioData.contains(sound)) {
			AudioData a = game.platform.audioDataCreate(game.getFile(sound), game.getFileLength(sound));
			this.audioData.set(sound, a);
		}
		return this.audioData.getById(this.audioData.getId(sound));
	}

	@Override
	public void onNewFrame(Game game, NewFrameEventArgs args)
	{
		if (game.assetsLoadProgress.value != 1) {
			return;
		}
		if (!this.wasLoaded) {
			this.wasLoaded = true;
			this.preload(game);
		}
		for (int i = 0; i < game.audio.soundsCount; i++) {
			Sound_ sound = game.audio.sounds[i];
			if (sound == null) {
				continue;
			}
			if (sound.audio != null) {
				continue;
			}
			AudioData data = this.getAudioData(game, sound.name);
			if (game.platform.audioDataLoaded(data)) {
				sound.audio = game.platform.audioCreate(data);
				game.platform.audioPlay(sound.audio);
			}
		}
		for (int i = 0; i < game.audio.soundsCount; i++) {
			Sound_ sound = game.audio.sounds[i];
			if (sound == null) {
				continue;
			}
			if (sound.audio == null) {
				continue;
			}
			game.platform.audioSetPosition(sound.audio, sound.x, sound.y, sound.z);
		}
		for (int i = 0; i < game.audio.soundsCount; i++) {
			Sound_ sound = game.audio.sounds[i];
			if (sound == null) {
				continue;
			}
			if (sound.audio == null) {
				continue;
			}
			if (sound.stop) {
				game.platform.audioDelete(sound.audio);
				game.audio.sounds[i] = null;
			}
		}
		for (int i = 0; i < game.audio.soundsCount; i++) {
			Sound_ sound = game.audio.sounds[i];
			if (sound == null) {
				continue;
			}
			if (sound.audio == null) {
				continue;
			}
			if (sound.loop) {
				if (game.platform.audioFinished(sound.audio) && sound.loop) {
					AudioData data = this.getAudioData(game, sound.name);
					if (game.platform.audioDataLoaded(data)) {
						sound.audio = game.platform.audioCreate(data);
						game.platform.audioPlay(sound.audio);
					}
				}
			}
			else {
				if (game.platform.audioFinished(sound.audio)) {
					game.audio.sounds[i] = null;
				}
			}
		}
	}

	private void preload(Game game)
	{
		for (int k = 0; k < game.assets.count; k++) {
			String s = game.assets.items[k].name;
			String sound = game.platform.stringReplace(s, ".ogg", "");
			if (s.equals(sound)) {
				continue;
			}
			this.getAudioData(game, s);
		}
	}
	private DictionaryStringAudioData audioData;
	private boolean wasLoaded;
}
