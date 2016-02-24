// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class ModDrawSprites extends ClientMod
{

	public static void billboard(Game game)
	{
		float[] m = game.mvMatrix.peek();
		float d = game.platform.mathSqrt(m[0] * m[0] + m[1] * m[1] + m[2] * m[2]);
		m[0] = d;
		m[1] = 0;
		m[2] = 0;
		m[3] = 0;
		m[4] = 0;
		m[5] = d;
		m[6] = 0;
		m[7] = 0;
		m[8] = 0;
		m[9] = 0;
		m[10] = d;
		m[11] = 0;
		m[12] = m[12];
		m[13] = m[13];
		m[14] = m[14];
		m[15] = 1;
		Mat4.rotateX(m, m, Game.getPi());
		game.gLLoadMatrix(m);
	}

	@Override
	public void onNewFrameDraw3d(Game game, float deltaTime)
	{
		float one = 1;
		for (int i = 0; i < game.entitiesCount; i++) {
			Entity entity = game.entities[i];
			if (entity == null) {
				continue;
			}
			if (entity.sprite == null) {
				continue;
			}
			Sprite b = entity.sprite;
			game.gLMatrixModeModelView();
			game.gLPushMatrix();
			game.gLTranslate(b.positionX, b.positionY, b.positionZ);
			ModDrawSprites.billboard(game);
			game.gLScale(one * 2 / 100, one * 2 / 100, one * 2 / 100);
			game.gLTranslate(0 - b.size / 2, 0 - b.size / 2, 0);
			IntRef n = null;
			if (b.animationcount > 0) {
				float progress = one - entity.expires.timeLeft / entity.expires.totalTime;
				n = IntRef.create(game.platform.floatToInt(progress * (b.animationcount * b.animationcount - 1)));
			}
			game.draw2dTexture(game.getTexture(b.image), 0, 0, b.size, b.size, n, b.animationcount, Game.colorFromArgb(255, 255, 255, 255), true);
			game.gLPopMatrix();
		}
	}
}
