// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class DictionaryStringString
{
	public DictionaryStringString()
	{
		this.start(64);
	}

	final boolean containsKey(String key)
	{
		for (int i = 0; i < this.count; i++) {
			if (this.items[i] == null) {
				continue;
			}
			if (Game.stringEquals(this.items[i].key, key)) {
				return true;
			}
		}
		return false;
	}

	final String get(String key)
	{
		for (int i = 0; i < this.count; i++) {
			if (this.items[i] == null) {
				continue;
			}
			if (Game.stringEquals(this.items[i].key, key)) {
				return this.items[i].value;
			}
		}
		return null;
	}

	final void remove(String key)
	{
		for (int i = 0; i < this.count; i++) {
			if (this.items[i] == null) {
				continue;
			}
			if (Game.stringEquals(this.items[i].key, key)) {
				this.items[i] = null;
			}
		}
	}

	public final void set(String key, String value)
	{
		for (int i = 0; i < this.count; i++) {
			if (this.items[i] == null) {
				continue;
			}
			if (Game.stringEquals(this.items[i].key, key)) {
				this.items[i].value = value;
				return;
			}
		}
		for (int i = 0; i < this.count; i++) {
			if (this.items[i] == null) {
				this.items[i] = new KeyValueStringString();
				this.items[i].key = key;
				this.items[i].value = value;
				return;
			}
		}
	}

	public final void start(int count_)
	{
		this.items = new KeyValueStringString[count_];
		this.count = count_;
	}
	int count;
	KeyValueStringString[] items;
}
