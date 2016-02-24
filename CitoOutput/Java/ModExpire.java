// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class ModExpire extends ClientMod
{

	private void grenadeExplosion(Game game, int grenadeEntityId)
	{
		float LocalPlayerPositionX = game.player.position.x;
		float LocalPlayerPositionY = game.player.position.y;
		float LocalPlayerPositionZ = game.player.position.z;
		Entity grenadeEntity = game.entities[grenadeEntityId];
		Sprite grenadeSprite = grenadeEntity.sprite;
		Grenade_ grenade = grenadeEntity.grenade;
		game.audioPlayAt("grenadeexplosion.ogg", grenadeSprite.positionX, grenadeSprite.positionY, grenadeSprite.positionZ);
		{
			Entity entity = new Entity();
			Sprite spritenew = new Sprite();
			spritenew.image = "ani5.png";
			spritenew.positionX = grenadeSprite.positionX;
			spritenew.positionY = grenadeSprite.positionY + 1;
			spritenew.positionZ = grenadeSprite.positionZ;
			spritenew.size = 200;
			spritenew.animationcount = 4;
			entity.sprite = spritenew;
			entity.expires = Expires.create(1);
			game.entityAddLocal(entity);
		}
		{
			Packet_ServerExplosion explosion = new Packet_ServerExplosion();
			explosion.xFloat = game.serializeFloat(grenadeSprite.positionX);
			explosion.yFloat = game.serializeFloat(grenadeSprite.positionZ);
			explosion.zFloat = game.serializeFloat(grenadeSprite.positionY);
			explosion.rangeFloat = game.blocktypes[grenade.block].explosionRangeFloat;
			explosion.isRelativeToPlayerPosition = 0;
			explosion.timeFloat = game.blocktypes[grenade.block].explosionTimeFloat;
			Entity entity = new Entity();
			entity.push = explosion;
			entity.expires = new Expires();
			entity.expires.timeLeft = game.deserializeFloat(game.blocktypes[grenade.block].explosionTimeFloat);
			game.entityAddLocal(entity);
		}
		float dist = game.dist(LocalPlayerPositionX, LocalPlayerPositionY, LocalPlayerPositionZ, grenadeSprite.positionX, grenadeSprite.positionY, grenadeSprite.positionZ);
		float dmg = (1 - dist / game.deserializeFloat(game.blocktypes[grenade.block].explosionRangeFloat)) * game.deserializeFloat(game.blocktypes[grenade.block].damageBodyFloat);
		if (dmg > 0) {
			game.applyDamageToPlayer(game.platform.floatToInt(dmg), 3, grenade.sourcePlayer);
		}
	}

	@Override
	public void onNewFrameFixed(Game game, NewFrameEventArgs args)
	{
		for (int i = 0; i < game.entitiesCount; i++) {
			Entity entity = game.entities[i];
			if (entity == null) {
				continue;
			}
			if (entity.expires == null) {
				continue;
			}
			entity.expires.timeLeft -= args.getDt();
			if (entity.expires.timeLeft <= 0) {
				if (entity.grenade != null) {
					this.grenadeExplosion(game, i);
				}
				game.entities[i] = null;
			}
		}
	}
}
