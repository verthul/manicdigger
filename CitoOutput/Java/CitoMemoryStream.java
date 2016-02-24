// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class CitoMemoryStream extends CitoStream
{
	public CitoMemoryStream()
	{
		this.buffer_ = new byte[1];
		this.count_ = 0;
		this.bufferlength = 1;
		this.position_ = 0;
	}

	@Override
	public boolean canSeek()
	{
		return false;
	}

	public static CitoMemoryStream create(byte[] buffer, int length)
	{
		CitoMemoryStream m = new CitoMemoryStream();
		m.buffer_ = buffer;
		m.count_ = length;
		m.bufferlength = length;
		m.position_ = 0;
		return m;
	}

	public final byte[] getBuffer()
	{
		return this.buffer_;
	}

	public final int length()
	{
		return this.count_;
	}

	@Override
	public int position()
	{
		return this.position_;
	}

	@Override
	public int read(byte[] buffer, int offset, int count)
	{
		for (int i = 0; i < count; i++) {
			if (this.position_ + i >= this.count_) {
				this.position_ += i;
				return i;
			}
			buffer[offset + i] = this.buffer_[this.position_ + i];
		}
		this.position_ += count;
		return count;
	}

	@Override
	public int readByte()
	{
		if (this.position_ >= this.count_) {
			return -1;
		}
		return this.buffer_[this.position_++] & 0xff;
	}

	@Override
	public void seek(int length, int seekOrigin)
	{
		switch (seekOrigin) {
		case CitoSeekOrigin.CURRENT:
			this.position_ += length;
			break;
		}
	}

	@Override
	public void seek_(int p, int seekOrigin)
	{
	}

	public final byte[] toArray()
	{
		return this.buffer_;
	}

	@Override
	public void write(byte[] buffer, int offset, int count)
	{
		for (int i = 0; i < count; i++) {
			this.writeByte(buffer[offset + i]);
		}
	}

	@Override
	public void writeByte(byte p)
	{
		if (this.position_ >= this.bufferlength) {
			byte[] buffer2 = new byte[this.bufferlength * 2];
			for (int i = 0; i < this.bufferlength; i++) {
				buffer2[i] = this.buffer_[i];
			}
			this.buffer_ = buffer2;
			this.bufferlength = this.bufferlength * 2;
		}
		this.buffer_[this.position_] = p;
		if (this.position_ == this.count_) {
			this.count_++;
		}
		this.position_++;
	}
	private byte[] buffer_;
	private int bufferlength;
	private int count_;
	private int position_;
}
