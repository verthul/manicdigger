// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class Packet_ServerBlobInitialize
{

	public final String getMd5()
	{
		return this.md5;
	}

	public final String getName()
	{
		return this.name;
	}
	String md5;
	/**
	 * &lt;summary&gt;
	 * &lt;para&gt;[ProtoMember(1, IsRequired = false)]&lt;/para&gt;
	 * &lt;para&gt;optional byte[] hash; //todo, currently ignored.&lt;/para&gt;
	 * &lt;/summary&gt;
	 */
	String name;

	public final void setMd5(String value)
	{
		this.md5 = value;
	}

	public final void setName(String value)
	{
		this.name = value;
	}
}
