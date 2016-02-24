// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class Entity
{
	public Entity()
	{
		this.scripts = new EntityScript[8];
		this.scriptsCount = 0;
	}
	Bullet_ bullet;
	EntityDrawArea drawArea;
	EntityDrawModel drawModel;
	DrawName drawName;
	EntityDrawText drawText;
	Expires expires;
	Grenade_ grenade;
	Minecart minecart;
	EntityPosition_ networkPosition;
	PlayerDrawInfo playerDrawInfo;
	Packet_ServerPlayerStats playerStats;
	EntityPosition_ position;
	Packet_ServerExplosion push;
	EntityScript[] scripts;
	int scriptsCount;
	Sprite sprite;
	boolean usable;
}
