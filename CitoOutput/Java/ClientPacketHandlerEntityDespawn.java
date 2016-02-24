// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class ClientPacketHandlerEntityDespawn extends ClientPacketHandler
{

	@Override
	public void handle(Game game, Packet_Server packet)
	{
		if (game.entities[packet.entityDespawn.id] != null) {
			if (game.entities[packet.entityDespawn.id].drawModel != null && game.entities[packet.entityDespawn.id].drawModel.downloadSkin) {
				int currentTex = game.entities[packet.entityDespawn.id].drawModel.currentTexture;
				if (currentTex > 0 && currentTex != game.getTexture("mineplayer.png")) {
					game.entities[packet.entityDespawn.id].drawModel.currentTexture = -1;
					game.deleteTexture(game.entities[packet.entityDespawn.id].drawName.name);
				}
			}
		}
		game.entities[packet.entityDespawn.id] = null;
	}
}
