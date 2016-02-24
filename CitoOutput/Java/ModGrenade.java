// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class ModGrenade extends ClientMod
{
	public ModGrenade()
	{
		this.one = 1;
		this.projectilegravity = 20;
		this.bouncespeedmultiply = this.one * 5 / 10;
		this.walldistance = this.one * 3 / 10;
	}

	final Vector3Ref grenadeBounce(Game game, Vector3Ref oldposition, Vector3Ref newposition, Vector3Ref velocity, float dt)
	{
		boolean ismoving = velocity.length() > 100 * dt;
		float modelheight = this.walldistance;
		oldposition.y += this.walldistance;
		newposition.y += this.walldistance;
		Vector3IntRef oldpositioni = Vector3IntRef.create(game.mathFloor(oldposition.x), game.mathFloor(oldposition.z), game.mathFloor(oldposition.y));
		float playerpositionX = newposition.x;
		float playerpositionY = newposition.y;
		float playerpositionZ = newposition.z;
		{
			float qnewpositionX = newposition.x;
			float qnewpositionY = newposition.y;
			float qnewpositionZ = newposition.z + this.walldistance;
			boolean newempty = game.isTileEmptyForPhysics(game.mathFloor(qnewpositionX), game.mathFloor(qnewpositionZ), game.mathFloor(qnewpositionY)) && game.isTileEmptyForPhysics(game.mathFloor(qnewpositionX), game.mathFloor(qnewpositionZ), game.mathFloor(qnewpositionY) + 1);
			if (newposition.z - oldposition.z > 0) {
				if (!newempty) {
					velocity.z = -velocity.z;
					velocity.x *= this.bouncespeedmultiply;
					velocity.y *= this.bouncespeedmultiply;
					velocity.z *= this.bouncespeedmultiply;
					if (ismoving) {
						game.audioPlayAt("grenadebounce.ogg", newposition.x, newposition.y, newposition.z);
					}
				}
			}
		}
		{
			float qnewpositionX = newposition.x + this.walldistance;
			float qnewpositionY = newposition.y;
			float qnewpositionZ = newposition.z;
			boolean newempty = game.isTileEmptyForPhysics(game.mathFloor(qnewpositionX), game.mathFloor(qnewpositionZ), game.mathFloor(qnewpositionY)) && game.isTileEmptyForPhysics(game.mathFloor(qnewpositionX), game.mathFloor(qnewpositionZ), game.mathFloor(qnewpositionY) + 1);
			if (newposition.x - oldposition.x > 0) {
				if (!newempty) {
					velocity.x = -velocity.x;
					velocity.x *= this.bouncespeedmultiply;
					velocity.y *= this.bouncespeedmultiply;
					velocity.z *= this.bouncespeedmultiply;
					if (ismoving) {
						game.audioPlayAt("grenadebounce.ogg", newposition.x, newposition.y, newposition.z);
					}
				}
			}
		}
		{
			float qnewpositionX = newposition.x;
			float qnewpositionY = newposition.y - this.walldistance;
			float qnewpositionZ = newposition.z;
			int x = game.mathFloor(qnewpositionX);
			int y = game.mathFloor(qnewpositionZ);
			int z = game.mathFloor(qnewpositionY);
			float a_ = this.walldistance;
			boolean newfull = !game.isTileEmptyForPhysics(x, y, z) || qnewpositionX - game.mathFloor(qnewpositionX) <= a_ && !game.isTileEmptyForPhysics(x - 1, y, z) && game.isTileEmptyForPhysics(x - 1, y, z + 1) || qnewpositionX - game.mathFloor(qnewpositionX) >= 1 - a_ && !game.isTileEmptyForPhysics(x + 1, y, z) && game.isTileEmptyForPhysics(x + 1, y, z + 1) || qnewpositionZ - game.mathFloor(qnewpositionZ) <= a_ && !game.isTileEmptyForPhysics(x, y - 1, z) && game.isTileEmptyForPhysics(x, y - 1, z + 1) || qnewpositionZ - game.mathFloor(qnewpositionZ) >= 1 - a_ && !game.isTileEmptyForPhysics(x, y + 1, z) && game.isTileEmptyForPhysics(x, y + 1, z + 1);
			if (newposition.y - oldposition.y < 0) {
				if (newfull) {
					velocity.y = -velocity.y;
					velocity.x *= this.bouncespeedmultiply;
					velocity.y *= this.bouncespeedmultiply;
					velocity.z *= this.bouncespeedmultiply;
					if (ismoving) {
						game.audioPlayAt("grenadebounce.ogg", newposition.x, newposition.y, newposition.z);
					}
				}
			}
		}
		{
			float qnewpositionX = newposition.x;
			float qnewpositionY = newposition.y;
			float qnewpositionZ = newposition.z - this.walldistance;
			boolean newempty = game.isTileEmptyForPhysics(game.mathFloor(qnewpositionX), game.mathFloor(qnewpositionZ), game.mathFloor(qnewpositionY)) && game.isTileEmptyForPhysics(game.mathFloor(qnewpositionX), game.mathFloor(qnewpositionZ), game.mathFloor(qnewpositionY) + 1);
			if (newposition.z - oldposition.z < 0) {
				if (!newempty) {
					velocity.z = -velocity.z;
					velocity.x *= this.bouncespeedmultiply;
					velocity.y *= this.bouncespeedmultiply;
					velocity.z *= this.bouncespeedmultiply;
					if (ismoving) {
						game.audioPlayAt("grenadebounce.ogg", newposition.x, newposition.y, newposition.z);
					}
				}
			}
		}
		{
			float qnewpositionX = newposition.x - this.walldistance;
			float qnewpositionY = newposition.y;
			float qnewpositionZ = newposition.z;
			boolean newempty = game.isTileEmptyForPhysics(game.mathFloor(qnewpositionX), game.mathFloor(qnewpositionZ), game.mathFloor(qnewpositionY)) && game.isTileEmptyForPhysics(game.mathFloor(qnewpositionX), game.mathFloor(qnewpositionZ), game.mathFloor(qnewpositionY) + 1);
			if (newposition.x - oldposition.x < 0) {
				if (!newempty) {
					velocity.x = -velocity.x;
					velocity.x *= this.bouncespeedmultiply;
					velocity.y *= this.bouncespeedmultiply;
					velocity.z *= this.bouncespeedmultiply;
					if (ismoving) {
						game.audioPlayAt("grenadebounce.ogg", newposition.x, newposition.y, newposition.z);
					}
				}
			}
		}
		{
			float qnewpositionX = newposition.x;
			float qnewpositionY = newposition.y + modelheight;
			float qnewpositionZ = newposition.z;
			boolean newempty = game.isTileEmptyForPhysics(game.mathFloor(qnewpositionX), game.mathFloor(qnewpositionZ), game.mathFloor(qnewpositionY));
			if (newposition.y - oldposition.y > 0) {
				if (!newempty) {
					velocity.y = -velocity.y;
					velocity.x *= this.bouncespeedmultiply;
					velocity.y *= this.bouncespeedmultiply;
					velocity.z *= this.bouncespeedmultiply;
					if (ismoving) {
						game.audioPlayAt("grenadebounce.ogg", newposition.x, newposition.y, newposition.z);
					}
				}
			}
		}
		playerpositionY -= this.walldistance;
		return Vector3Ref.create(playerpositionX, playerpositionY, playerpositionZ);
	}

	@Override
	public void onNewFrameFixed(Game game, NewFrameEventArgs args)
	{
		for (int i = 0; i < game.entitiesCount; i++) {
			Entity entity = game.entities[i];
			if (entity == null) {
				continue;
			}
			if (entity.grenade == null) {
				continue;
			}
			this.updateGrenade(game, i, args.getDt());
		}
	}

	final void updateGrenade(Game game, int grenadeEntityId, float dt)
	{
		float LocalPlayerPositionX = game.player.position.x;
		float LocalPlayerPositionY = game.player.position.y;
		float LocalPlayerPositionZ = game.player.position.z;
		Entity grenadeEntity = game.entities[grenadeEntityId];
		Sprite grenadeSprite = grenadeEntity.sprite;
		Grenade_ grenade = grenadeEntity.grenade;
		float oldposX = grenadeEntity.sprite.positionX;
		float oldposY = grenadeSprite.positionY;
		float oldposZ = grenadeSprite.positionZ;
		float newposX = grenadeSprite.positionX + grenade.velocityX * dt;
		float newposY = grenadeSprite.positionY + grenade.velocityY * dt;
		float newposZ = grenadeSprite.positionZ + grenade.velocityZ * dt;
		grenade.velocityY += -this.projectilegravity * dt;
		Vector3Ref velocity = Vector3Ref.create(grenade.velocityX, grenade.velocityY, grenade.velocityZ);
		Vector3Ref bouncePosition = this.grenadeBounce(game, Vector3Ref.create(oldposX, oldposY, oldposZ), Vector3Ref.create(newposX, newposY, newposZ), velocity, dt);
		grenade.velocityX = velocity.x;
		grenade.velocityY = velocity.y;
		grenade.velocityZ = velocity.z;
		grenadeSprite.positionX = bouncePosition.x;
		grenadeSprite.positionY = bouncePosition.y;
		grenadeSprite.positionZ = bouncePosition.z;
	}
	private float bouncespeedmultiply;
	private float one;
	private float projectilegravity;
	private float walldistance;
}
