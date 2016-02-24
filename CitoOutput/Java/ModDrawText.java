// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class ModDrawText extends ClientMod
{

	@Override
	public void onNewFrameDraw3d(Game game, float deltaTime)
	{
		for (int i = 0; i < game.entitiesCount; i++) {
			Entity e = game.entities[i];
			if (e == null) {
				continue;
			}
			if (e.drawText == null) {
				continue;
			}
			if (e.networkPosition != null && !e.networkPosition.positionLoaded) {
				continue;
			}
			int kKey = i;
			EntityDrawText p = game.entities[i].drawText;
			float posX = -game.platform.mathSin(e.position.roty) * p.dx + e.position.x;
			float posY = p.dy + e.position.y;
			float posZ = game.platform.mathCos(e.position.roty) * p.dz + e.position.z;
			if (game.dist(game.player.position.x, game.player.position.y, game.player.position.z, posX, posY, posZ) < 20 || game.keyboardState[5] || game.keyboardState[6]) {
				String text = p.text;
				{
					float shadow = game.one * game.getLight(game.platform.floatToInt(posX), game.platform.floatToInt(posZ), game.platform.floatToInt(posY)) / 15;
					game.gLPushMatrix();
					game.gLTranslate(posX, posY, posZ);
					game.gLRotate(180, 1, 0, 0);
					game.gLRotate(e.position.roty * 360 / (2 * Game.getPi()), 0, 1, 0);
					float scale = game.one * 5 / 1000;
					game.gLScale(scale, scale, scale);
					FontCi font = new FontCi();
					font.family = "Arial";
					font.size = 14;
					game.draw2dText(text, font, -game.textSizeWidth(text, 14) / 2, 0, IntRef.create(Game.colorFromArgb(255, 255, 255, 255)), true);
					game.gLPopMatrix();
				}
			}
		}
	}
}
