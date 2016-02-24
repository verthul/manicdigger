// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class HttpResponseCi
{

	public final boolean getDone()
	{
		return this.done;
	}

	public final boolean getError()
	{
		return this.error;
	}

	final String getString(GamePlatform platform)
	{
		return platform.stringFromUtf8ByteArray(this.value, this.valueLength);
	}

	public final byte[] getValue()
	{
		return this.value;
	}

	public final int getValueLength()
	{
		return this.valueLength;
	}

	public final void setDone(boolean value_)
	{
		this.done = value_;
	}

	public final void setError(boolean value_)
	{
		this.error = value_;
	}

	public final void setValue(byte[] value_)
	{
		this.value = value_;
	}

	public final void setValueLength(int value_)
	{
		this.valueLength = value_;
	}
	boolean done;
	boolean error;
	byte[] value;
	int valueLength;
}
