// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class ModDrawPlayers extends ClientMod
{
	public ModDrawPlayers()
	{
		this.one = 1;
	}

	final void drawPlayers(Game game, float dt)
	{
		game.totaltimeMilliseconds = game.platform.timeMillisecondsFromStart();
		for (int i = 0; i < game.entitiesCount; i++) {
			if (game.entities[i] == null) {
				continue;
			}
			if (game.entities[i].drawModel == null) {
				continue;
			}
			Entity p_ = game.entities[i];
			if (i == game.localPlayerId && !game.eNABLE_TPP_VIEW) {
				continue;
			}
			if (p_.networkPosition != null && !p_.networkPosition.positionLoaded) {
				continue;
			}
			if (!game.d_FrustumCulling.sphereInFrustum(p_.position.x, p_.position.y, p_.position.z, 3)) {
				continue;
			}
			if (p_.drawModel.currentTexture == -1) {
				continue;
			}
			int cx = game.platform.floatToInt(p_.position.x) / 16;
			int cy = game.platform.floatToInt(p_.position.z) / 16;
			int cz = game.platform.floatToInt(p_.position.y) / 16;
			if (game.map.isValidChunkPos(cx, cy, cz)) {
				if (!game.map.isChunkRendered(cx, cy, cz)) {
					continue;
				}
			}
			float shadow = this.one * game.getLight(game.platform.floatToInt(p_.position.x), game.platform.floatToInt(p_.position.z), game.platform.floatToInt(p_.position.y)) / 15;
			if (p_.playerDrawInfo == null) {
				p_.playerDrawInfo = new PlayerDrawInfo();
			}
			p_.playerDrawInfo.anim.light = shadow;
			float FeetPosX = p_.position.x;
			float FeetPosY = p_.position.y;
			float FeetPosZ = p_.position.z;
			AnimationHint animHint = game.entities[i].playerDrawInfo.animationHint_;
			float playerspeed_;
			if (i == game.localPlayerId) {
				if (game.player.playerDrawInfo == null) {
					game.player.playerDrawInfo = new PlayerDrawInfo();
				}
				Vector3Ref playerspeed = Vector3Ref.create(game.playervelocity.x / 60, game.playervelocity.y / 60, game.playervelocity.z / 60);
				float playerspeedf = playerspeed.length() * this.one * 15 / 10;
				game.player.playerDrawInfo.moves = playerspeedf != 0;
				playerspeed_ = playerspeedf;
			}
			else {
				playerspeed_ = game.length(p_.playerDrawInfo.velocityX, p_.playerDrawInfo.velocityY, p_.playerDrawInfo.velocityZ) / dt * this.one * 4 / 100;
			}
			{
				if (p_.drawModel.renderer == null) {
					p_.drawModel.renderer = new AnimatedModelRenderer();
					byte[] data = game.getFile(p_.drawModel.model_);
					int dataLength = game.getFileLength(p_.drawModel.model_);
					if (data != null) {
						String dataString = game.platform.stringFromUtf8ByteArray(data, dataLength);
						AnimatedModel model = AnimatedModelSerializer.deserialize(game.platform, dataString);
						p_.drawModel.renderer.start(game, model);
					}
				}
				game.gLPushMatrix();
				game.gLTranslate(FeetPosX, FeetPosY, FeetPosZ);
				game.gLRotate(PlayerInterpolate.radToDeg(-p_.position.roty + Game.getPi()), 0, 1, 0);
				game.platform.bindTexture2d(game.entities[i].drawModel.currentTexture);
				p_.drawModel.renderer.render(dt, PlayerInterpolate.radToDeg(p_.position.rotx + Game.getPi()), true, p_.playerDrawInfo.moves, shadow);
				game.gLPopMatrix();
			}
		}
	}

	@Override
	public void onNewFrameDraw3d(Game game, float deltaTime)
	{
		this.drawPlayers(game, deltaTime);
	}
	private float one;
}
