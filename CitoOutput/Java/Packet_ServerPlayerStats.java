// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class Packet_ServerPlayerStats
{
	int currentHealth;
	int currentOxygen;

	public final int getCurrentHealth()
	{
		return this.currentHealth;
	}

	public final int getCurrentOxygen()
	{
		return this.currentOxygen;
	}

	public final int getMaxHealth()
	{
		return this.maxHealth;
	}

	public final int getMaxOxygen()
	{
		return this.maxOxygen;
	}
	int maxHealth;
	int maxOxygen;

	public final void setCurrentHealth(int value)
	{
		this.currentHealth = value;
	}

	public final void setCurrentOxygen(int value)
	{
		this.currentOxygen = value;
	}

	public final void setMaxHealth(int value)
	{
		this.maxHealth = value;
	}

	public final void setMaxOxygen(int value)
	{
		this.maxOxygen = value;
	}
}
