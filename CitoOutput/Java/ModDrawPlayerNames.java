// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class ModDrawPlayerNames extends ClientMod
{

	@Override
	public void onNewFrameDraw3d(Game game, float deltaTime)
	{
		for (int i = 0; i < game.entitiesCount; i++) {
			Entity e = game.entities[i];
			if (e == null) {
				continue;
			}
			if (e.drawName == null) {
				continue;
			}
			if (i == game.localPlayerId) {
				continue;
			}
			if (e.networkPosition != null && !e.networkPosition.positionLoaded) {
				continue;
			}
			int kKey = i;
			DrawName p = game.entities[i].drawName;
			if (p.onlyWhenSelected) {
				continue;
			}
			float posX = p.textX + e.position.x;
			float posY = p.textY + e.position.y + e.drawModel.modelHeight + game.one * 7 / 10;
			float posZ = p.textZ + e.position.z;
			if (game.dist(game.player.position.x, game.player.position.y, game.player.position.z, posX, posY, posZ) < 20 || game.keyboardState[5] || game.keyboardState[6]) {
				String name = p.name;
				{
					float shadow = game.one * game.getLight(game.platform.floatToInt(posX), game.platform.floatToInt(posZ), game.platform.floatToInt(posY)) / 15;
					game.gLPushMatrix();
					game.gLTranslate(posX, posY, posZ);
					ModDrawSprites.billboard(game);
					float scale = game.one * 2 / 100;
					game.gLScale(scale, scale, scale);
					if (p.drawHealth) {
						game.draw2dTexture(game.whiteTexture(), -26, -11, 52, 12, null, 0, Game.colorFromArgb(255, 0, 0, 0), false);
						game.draw2dTexture(game.whiteTexture(), -25, -10, 50 * game.one * p.health, 10, null, 0, Game.colorFromArgb(255, 255, 0, 0), false);
					}
					FontCi font = new FontCi();
					font.family = "Arial";
					font.size = 14;
					game.draw2dText(name, font, -game.textSizeWidth(name, 14) / 2, 0, IntRef.create(Game.colorFromArgb(255, 255, 255, 255)), true);
					game.gLPopMatrix();
				}
			}
		}
	}
}
