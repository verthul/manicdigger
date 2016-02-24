// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class Key
{

	public static Key create(int field, int wireType)
	{
		Key k = new Key();
		k.field = field;
		k.wireType = wireType;
		return k;
	}
	private int field;

	public final int getField()
	{
		return this.field;
	}

	public final int getWireType()
	{
		return this.wireType;
	}

	public final void setField(int value)
	{
		this.field = value;
	}

	public final void setWireType(int value)
	{
		this.wireType = value;
	}
	private int wireType;
}
