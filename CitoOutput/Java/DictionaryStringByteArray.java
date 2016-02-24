// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

class DictionaryStringByteArray
{
	public DictionaryStringByteArray()
	{
		this.items = new StringByteArray[1024];
		this.itemsCount = 1024;
	}

	final byte[] get(String name)
	{
		for (int i = 0; i < this.itemsCount; i++) {
			if (this.items[i] == null) {
				continue;
			}
			if (Game.stringEquals(this.items[i].name, name)) {
				return this.items[i].data;
			}
		}
		return null;
	}

	final void set(String name, byte[] value)
	{
		for (int i = 0; i < this.itemsCount; i++) {
			if (this.items[i] == null) {
				continue;
			}
			if (Game.stringEquals(this.items[i].name, name)) {
				this.items[i].data = value;
				return;
			}
		}
		for (int i = 0; i < this.itemsCount; i++) {
			if (this.items[i] == null) {
				this.items[i] = new StringByteArray();
				this.items[i].name = name;
				this.items[i].data = value;
				return;
			}
		}
	}
	StringByteArray[] items;
	int itemsCount;
}
