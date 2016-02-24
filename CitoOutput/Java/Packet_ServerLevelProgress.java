// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class Packet_ServerLevelProgress
{

	public final int getPercentComplete()
	{
		return this.percentComplete;
	}

	public final int getPercentCompleteSubitem()
	{
		return this.percentCompleteSubitem;
	}

	public final String getStatus()
	{
		return this.status;
	}
	/**
	 * &lt;summary&gt;
	 * &lt;para&gt;[ProtoMember(1, IsRequired = false)]&lt;/para&gt;
	 * &lt;para&gt;optional byte[] Chunk;&lt;/para&gt;
	 * &lt;/summary&gt;
	 */
	int percentComplete;
	int percentCompleteSubitem;

	public final void setPercentComplete(int value)
	{
		this.percentComplete = value;
	}

	public final void setPercentCompleteSubitem(int value)
	{
		this.percentCompleteSubitem = value;
	}

	public final void setStatus(String value)
	{
		this.status = value;
	}
	String status;
}
