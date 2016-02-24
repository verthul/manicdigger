// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class ModPush extends ClientMod
{

	@Override
	public void onNewFrameFixed(Game game, NewFrameEventArgs args)
	{
		game.pushX = 0;
		game.pushY = 0;
		game.pushZ = 0;
		float LocalPlayerPositionX = game.player.position.x;
		float LocalPlayerPositionY = game.player.position.y;
		float LocalPlayerPositionZ = game.player.position.z;
		for (int i = 0; i < game.entitiesCount; i++) {
			Entity entity = game.entities[i];
			if (entity == null) {
				continue;
			}
			if (entity.push == null) {
				continue;
			}
			if (entity.networkPosition != null && !entity.networkPosition.positionLoaded) {
				continue;
			}
			float kposX = game.deserializeFloat(entity.push.xFloat);
			float kposY = game.deserializeFloat(entity.push.zFloat);
			float kposZ = game.deserializeFloat(entity.push.yFloat);
			if (entity.push.isRelativeToPlayerPosition != 0) {
				kposX += LocalPlayerPositionX;
				kposY += LocalPlayerPositionY;
				kposZ += LocalPlayerPositionZ;
			}
			float dist = game.dist(kposX, kposY, kposZ, LocalPlayerPositionX, LocalPlayerPositionY, LocalPlayerPositionZ);
			if (dist < game.deserializeFloat(entity.push.rangeFloat)) {
				float diffX = LocalPlayerPositionX - kposX;
				float diffY = LocalPlayerPositionY - kposY;
				float diffZ = LocalPlayerPositionZ - kposZ;
				game.pushX += diffX;
				game.pushY += diffY;
				game.pushZ += diffZ;
			}
		}
	}
}
