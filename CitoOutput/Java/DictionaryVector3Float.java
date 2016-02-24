// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class DictionaryVector3Float
{
	public DictionaryVector3Float()
	{
		this.itemsCount = 16384;
		this.items = new Vector3Float[this.itemsCount];
	}

	final void clear()
	{
		for (int i = 0; i < this.itemsCount; i++) {
			this.items[i] = null;
		}
	}

	final boolean containsKey(int x, int y, int z)
	{
		return this.itemIndex(x, y, z) != -1;
	}

	final int count()
	{
		int count = 0;
		for (int i = 0; i < this.itemsCount; i++) {
			if (this.items[i] != null) {
				count++;
			}
		}
		return count;
	}

	final float get(int x, int y, int z)
	{
		return this.items[this.itemIndex(x, y, z)].value;
	}

	private int itemIndex(int x, int y, int z)
	{
		for (int i = 0; i < this.itemsCount; i++) {
			if (this.items[i] == null) {
				continue;
			}
			Vector3Float item = this.items[i];
			if (item.x == x && item.y == y && item.z == z) {
				return i;
			}
		}
		return -1;
	}

	final void remove(int x, int y, int z)
	{
		if (this.itemIndex(x, y, z) == -1) {
			return;
		}
		this.items[this.itemIndex(x, y, z)] = null;
	}

	final void set(int x, int y, int z, float value)
	{
		int index = this.itemIndex(x, y, z);
		if (index != -1) {
			this.items[index].value = value;
		}
		else {
			for (int i = 0; i < this.itemsCount; i++) {
				if (this.items[i] == null) {
					Vector3Float item = new Vector3Float();
					item.x = x;
					item.y = y;
					item.z = z;
					item.value = value;
					this.items[i] = item;
					return;
				}
			}
		}
	}
	Vector3Float[] items;
	int itemsCount;
}
