// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class IntRef
{

	public static IntRef create(int value_)
	{
		IntRef intref = new IntRef();
		intref.value = value_;
		return intref;
	}

	public final int getValue()
	{
		return this.value;
	}

	public final void setValue(int value_)
	{
		this.value = value_;
	}
	int value;
}
