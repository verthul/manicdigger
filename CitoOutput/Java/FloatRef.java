// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class FloatRef
{

	public static FloatRef create(float value_)
	{
		FloatRef f = new FloatRef();
		f.value = value_;
		return f;
	}

	public final float getValue()
	{
		return this.value;
	}

	public final void setValue(float value_)
	{
		this.value = value_;
	}
	float value;
}
