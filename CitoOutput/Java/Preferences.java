// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class Preferences
{
	public Preferences()
	{
		this.items = new DictionaryStringString();
	}

	public final boolean getBool(String key, boolean default_)
	{
		String value = this.getString(key, null);
		if (value == null) {
			return default_;
		}
		if (value.equals("0")) {
			return false;
		}
		if (value.equals("1")) {
			return true;
		}
		return default_;
	}

	public final int getInt(String key, int default_)
	{
		if (this.getString(key, null) == null) {
			return default_;
		}
		FloatRef ret = new FloatRef();
		if (this.platform.floatTryParse(this.getString(key, null), ret)) {
			return this.platform.floatToInt(ret.value);
		}
		return default_;
	}

	public final String getKey(int i)
	{
		if (this.items.items[i] != null) {
			return this.items.items[i].key;
		}
		else {
			return null;
		}
	}

	public final int getKeysCount()
	{
		return this.items.count;
	}

	public final String getString(String key, String default_)
	{
		if (!this.items.containsKey(key)) {
			return default_;
		}
		return this.items.get(key);
	}

	final void remove(String key)
	{
		this.items.remove(key);
	}

	public final void setBool(String key, boolean value)
	{
		this.setString(key, value ? "1" : "0");
	}

	public final void setInt(String key, int value)
	{
		this.setString(key, this.platform.intToString(value));
	}

	public final void setString(String key, String value)
	{
		this.items.set(key, value);
	}
	DictionaryStringString items;
	GamePlatform platform;
}
