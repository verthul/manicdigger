// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public abstract class CitoStream
{

	public abstract boolean canSeek();

	public abstract int position();

	public abstract int read(byte[] buffer, int read, int p);

	public abstract int readByte();

	public abstract void seek(int length, int seekOrigin);

	public abstract void seek_(int p, int seekOrigin);

	public abstract void write(byte[] val, int p, int p_3);

	public abstract void writeByte(byte p);
}
