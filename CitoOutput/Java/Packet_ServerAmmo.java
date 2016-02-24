// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class Packet_ServerAmmo
{

	public final Packet_IntInt[] getTotalAmmo()
	{
		return this.totalAmmo;
	}

	public final int getTotalAmmoCount()
	{
		return this.totalAmmoCount;
	}

	public final int getTotalAmmoLength()
	{
		return this.totalAmmoLength;
	}

	public final void setTotalAmmo(Packet_IntInt[] value, int count, int length)
	{
		this.totalAmmo = value;
		this.totalAmmoCount = count;
		this.totalAmmoLength = length;
	}
	Packet_IntInt[] totalAmmo;

	public final void totalAmmoAdd(Packet_IntInt value)
	{
		if (this.totalAmmoCount >= this.totalAmmoLength) {
			Packet_IntInt[] TotalAmmo2 = new Packet_IntInt[this.totalAmmoLength * 2];
			this.totalAmmoLength = this.totalAmmoLength * 2;
			for (int i = 0; i < this.totalAmmoCount; i++) {
				TotalAmmo2[i] = this.totalAmmo[i];
			}
			this.totalAmmo = TotalAmmo2;
		}
		this.totalAmmo[this.totalAmmoCount] = value;
		this.totalAmmoCount++;
	}
	int totalAmmoCount;
	int totalAmmoLength;
}
