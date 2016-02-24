// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class DictionaryStringAudioSample
{
	public DictionaryStringAudioSample()
	{
		this.max = 1024;
		this.count = 0;
		this.keys = new String[this.max];
		this.values = new AudioSampleCi[this.max];
	}

	public final boolean contains(String key)
	{
		int index = this.getIndex(key);
		return index != -1;
	}

	public final AudioSampleCi get(String key)
	{
		int index = this.getIndex(key);
		return this.values[index];
	}

	public final int getIndex(String key)
	{
		for (int i = 0; i < this.count; i++) {
			if (this.keys[i].equals(key)) {
				return i;
			}
		}
		return -1;
	}

	public final void set(String key, AudioSampleCi value)
	{
		int index = this.getIndex(key);
		if (index != -1) {
			this.values[index] = value;
			return;
		}
		this.keys[this.count] = key;
		this.values[this.count] = value;
		this.count++;
	}
	private int count;
	private String[] keys;
	private int max;
	private AudioSampleCi[] values;
}
