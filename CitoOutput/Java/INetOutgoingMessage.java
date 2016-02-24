// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class INetOutgoingMessage
{

	public final void write(byte[] source, int sourceCount)
	{
		this.messageLength = sourceCount;
		this.message = new byte[sourceCount];
		for (int i = 0; i < sourceCount; i++) {
			this.message[i] = source[i];
		}
	}
	byte[] message;
	int messageLength;
}
