// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class DictionaryStringAudioData
{
	public DictionaryStringAudioData()
	{
		this.keys = new String[1024];
		for (int i = 0; i < 1024; i++) {
			this.keys[i] = null;
		}
		this.values = new AudioData[1024];
		for (int i = 0; i < 1024; i++) {
			this.values[i] = null;
		}
	}

	final boolean contains(String key)
	{
		int id = this.getId(key);
		return id != -1;
	}

	final AudioData getById(int id)
	{
		return this.values[id];
	}

	final int getId(String key)
	{
		for (int i = 0; i < 1024; i++) {
			if (this.keys[i].equals(key)) {
				return i;
			}
		}
		return -1;
	}

	final int set(String key, AudioData bmp)
	{
		int id = this.getId(key);
		if (id != -1) {
			this.values[id] = bmp;
			return id;
		}
		for (int i = 0; i < 1024; i++) {
			if (this.keys[i] == null) {
				this.keys[i] = key;
				this.values[i] = bmp;
				return i;
			}
		}
		return -1;
	}
	String[] keys;
	AudioData[] values;
}
