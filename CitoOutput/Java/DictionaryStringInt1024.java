// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class DictionaryStringInt1024
{
	public DictionaryStringInt1024()
	{
		this.items = new KeyValueStringInt[1024];
		this.count = 0;
	}

	/**
	 * &lt;summary&gt;
	 * Check if the dictionary contains the specified key.
	 * This method is case-sensitive.
	 * &lt;/summary&gt;
	 * &lt;param name="key"&gt;Key&lt;/param&gt;
	 * &lt;returns&gt;&lt;b&gt;true&lt;/b&gt; if key is found&lt;/returns&gt;
	 */
	final boolean contains(String key)
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

	/**
	 * &lt;summary&gt;
	 * Get the specified key.
	 * This method is case-sensitive.
	 * &lt;/summary&gt;
	 * &lt;param name="key"&gt;Key&lt;/param&gt;
	 * &lt;returns&gt;&lt;b&gt;Stored value&lt;/b&gt; when key is found in collection, &lt;b&gt;-1&lt;/b&gt; otherwise.&lt;/returns&gt;
	 */
	final int get(String key)
	{
		for (int i = 0; i < this.count; i++) {
			if (this.items[i] == null) {
				continue;
			}
			if (Game.stringEquals(this.items[i].key, key)) {
				return this.items[i].value;
			}
		}
		return -1;
	}

	/**
	 * &lt;summary&gt;
	 * Remove the specified key.
	 * This method is case-sensitive.
	 * &lt;/summary&gt;
	 * &lt;param name="key"&gt;Key&lt;/param&gt;
	 * &lt;returns&gt;&lt;b&gt;true&lt;/b&gt; if key is found in collection, &lt;b&gt;false&lt;/b&gt; otherwise.&lt;/returns&gt;
	 */
	public final boolean remove(String key)
	{
		for (int i = 0; i < this.count; i++) {
			if (this.items[i] == null) {
				continue;
			}
			if (Game.stringEquals(this.items[i].key, key)) {
				this.items[i] = null;
				return true;
			}
		}
		return false;
	}

	/**
	 * &lt;summary&gt;
	 * Set the specified key to the specified value.
	 * &lt;/summary&gt;
	 * &lt;param name="key"&gt;Key&lt;/param&gt;
	 * &lt;param name="value"&gt;Value to set&lt;/param&gt;
	 */
	public final void set(String key, int value)
	{
		for (int i = 0; i < this.count; i++) {
			if (this.items[i] == null) {
				continue;
			}
			if (this.items[i].key.equals(key)) {
				this.items[i].value = value;
				return;
			}
		}
		for (int i = 0; i < this.count; i++) {
			if (this.items[i] == null) {
				this.items[i] = new KeyValueStringInt();
				this.items[i].key = key;
				this.items[i].value = value;
				return;
			}
		}
		KeyValueStringInt k = new KeyValueStringInt();
		k.key = key;
		k.value = value;
		this.items[this.count++] = k;
	}
	int count;
	KeyValueStringInt[] items;
}
