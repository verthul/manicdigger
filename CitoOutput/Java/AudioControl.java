// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class AudioControl
{
	public AudioControl()
	{
		this.soundsCount = 0;
		this.sounds = new Sound_[64];
		for (int i = 0; i < 64; i++) {
			this.sounds[i] = null;
		}
	}

	public final void add(Sound_ s)
	{
		for (int i = 0; i < this.soundsCount; i++) {
			if (this.sounds[i] == null) {
				this.sounds[i] = s;
				return;
			}
		}
		if (this.soundsCount < 64) {
			this.sounds[this.soundsCount++] = s;
		}
	}

	public final void clear()
	{
		for (int i = 0; i < this.soundsCount; i++) {
			this.sounds[i] = null;
		}
		this.soundsCount = 0;
	}

	public final void stopAll()
	{
		for (int i = 0; i < this.soundsCount; i++) {
			if (this.sounds[i] == null) {
				continue;
			}
			this.sounds[i].stop = true;
		}
	}
	Sound_[] sounds;
	int soundsCount;
}
