// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class IPEndPointCiDefault extends IPEndPointCi
{

	@Override
	public String addressToString()
	{
		return this.address;
	}

	public static IPEndPointCiDefault create(String address_)
	{
		IPEndPointCiDefault e = new IPEndPointCiDefault();
		e.address = address_;
		return e;
	}
	String address;
}
