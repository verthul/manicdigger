// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

/**
 * &lt;summary&gt;
 * Storage of unknown fields
 * &lt;/summary&gt;
 */
public class KeyValue
{

	public static KeyValue create(Key key, byte[] value)
	{
		KeyValue k = new KeyValue();
		k.key_ = key;
		k.value = value;
		return k;
	}
	private Key key_;
	private byte[] value;
}
