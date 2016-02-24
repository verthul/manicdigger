// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class ClientPacketHandlerEntityPosition extends ClientPacketHandler
{

	@Override
	public void handle(Game game, Packet_Server packet)
	{
		Entity entity = game.entities[packet.entityPosition.id];
		EntityPosition_ pos = ClientPacketHandlerEntitySpawn.toClientEntityPosition(packet.entityPosition.positionAndOrientation);
		entity.networkPosition = pos;
		entity.networkPosition.positionLoaded = true;
		entity.networkPosition.lastUpdateMilliseconds = game.platform.timeMillisecondsFromStart();
		if (packet.entityPosition.id == game.localPlayerId) {
			game.player.position.x = pos.x;
			game.player.position.y = pos.y;
			game.player.position.z = pos.z;
			game.player.position.rotx = pos.rotx;
			game.player.position.roty = pos.roty;
			game.player.position.rotz = pos.rotz;
			entity.networkPosition = null;
		}
		else if (entity.push != null) {
			entity.push.xFloat = packet.entityPosition.positionAndOrientation.x;
			entity.push.yFloat = packet.entityPosition.positionAndOrientation.z;
			entity.push.zFloat = packet.entityPosition.positionAndOrientation.y;
		}
	}
}
