// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class ModSkySphereAnimated extends ClientMod
{
	public ModSkySphereAnimated()
	{
		this.stars = new ModSkySphereStatic();
	}

	public final void draw(Game game, float fov)
	{
		int size = 1000;
		if (game.fancySkysphere) {
			this.skymodel = this.getSphereModelData2(this.skymodel, game.platform, size, size, 64, 64, this.skyPixels, this.glowPixels, game.sunPositionX, game.sunPositionY, game.sunPositionZ);
		}
		else {
			this.skymodel = this.getSphereModelData2(this.skymodel, game.platform, size, size, 20, 20, this.skyPixels, this.glowPixels, game.sunPositionX, game.sunPositionY, game.sunPositionZ);
		}
		game.set3dProjection(size * 2, fov);
		game.gLMatrixModeModelView();
		game.gLPushMatrix();
		game.gLTranslate(game.player.position.x, game.player.position.y, game.player.position.z);
		game.platform.bindTexture2d(0);
		game.drawModelData(this.skymodel);
		game.gLPopMatrix();
		game.set3dProjection(game.zfar(), fov);
	}

	final void drawSkySphere(Game game)
	{
		if (!this.started) {
			this.started = true;
			BitmapCi skyBmp = game.platform.bitmapCreateFromPng(game.getFile("sky.png"), game.getFileLength("sky.png"));
			BitmapCi glowBmp = game.platform.bitmapCreateFromPng(game.getFile("glow.png"), game.getFileLength("glow.png"));
			this.skyPixels = new int[1048576];
			this.glowPixels = new int[1048576];
			game.platform.bitmapGetPixelsArgb(skyBmp, this.skyPixels);
			game.platform.bitmapGetPixelsArgb(glowBmp, this.glowPixels);
			game.platform.bitmapDelete(skyBmp);
			game.platform.bitmapDelete(glowBmp);
		}
		game.platform.gLDisableAlphaTest();
		game.platform.glDisableDepthTest();
		this.draw(game, game.currentfov());
		game.platform.gLEnableAlphaTest();
		game.platform.glEnableDepthTest();
	}

	public final ModelData getSphereModelData2(ModelData data, GamePlatform platform, float radius, float height, int segments, int rings, int[] skyPixels_, int[] glowPixels_, float sunX, float sunY, float sunZ)
	{
		int i = 0;
		if (data == null) {
			data = new ModelData();
			data.xyz = new float[rings * segments * 3];
			data.uv = new float[rings * segments * 2];
			data.rgba = new byte[rings * segments * 4];
			data.setVerticesCount(segments * rings);
			data.setIndicesCount(segments * rings * 6);
			data.setIndices(SphereModelData.calculateElements(radius, height, segments, rings));
		}
		for (int y = 0; y < rings; y++) {
			float yFloat = y;
			float phiFloat = yFloat / (rings - 1) * Game.getPi();
			for (int x = 0; x < segments; x++) {
				float xFloat = x;
				float theta = xFloat / (segments - 1) * 2 * Game.getPi();
				float vx = radius * Platform.sin(phiFloat) * Platform.cos(theta);
				float vy = height * Platform.cos(phiFloat);
				float vz = radius * Platform.sin(phiFloat) * Platform.sin(theta);
				float u = xFloat / (segments - 1);
				float v = yFloat / (rings - 1);
				data.xyz[i * 3 + 0] = vx;
				data.xyz[i * 3 + 1] = vy;
				data.xyz[i * 3 + 2] = vz;
				data.uv[i * 2 + 0] = u;
				data.uv[i * 2 + 1] = v;
				float vertexLength = platform.mathSqrt(vx * vx + vy * vy + vz * vz);
				float vertexXNormalized = vx / vertexLength;
				float vertexYNormalized = vy / vertexLength;
				float vertexZNormalized = vz / vertexLength;
				float sunLength = platform.mathSqrt(sunX * sunX + sunY * sunY + sunZ * sunZ);
				if (sunLength == 0) {
					sunLength = 1;
				}
				float sunXNormalized = sunX / sunLength;
				float sunYNormalized = sunY / sunLength;
				float sunZNormalized = sunZ / sunLength;
				float dx = vertexXNormalized - sunXNormalized;
				float dy = vertexYNormalized - sunYNormalized;
				float dz = vertexZNormalized - sunZNormalized;
				float proximityToSun = 1 - platform.mathSqrt(dx * dx + dy * dy + dz * dz) / 2;
				float one = 1;
				int skyColor = ModSkySphereAnimated.texture2d(platform, skyPixels_, (sunYNormalized + 2) / 4, 1 - (vertexYNormalized + 1) / 2);
				float skyColorA = one * Game.colorA(skyColor) / 255;
				float skyColorR = one * Game.colorR(skyColor) / 255;
				float skyColorG = one * Game.colorG(skyColor) / 255;
				float skyColorB = one * Game.colorB(skyColor) / 255;
				int glowColor = ModSkySphereAnimated.texture2d(platform, glowPixels_, (sunYNormalized + one) / 2, 1 - proximityToSun);
				float glowColorA = one * Game.colorA(glowColor) / 255;
				float glowColorR = one * Game.colorR(glowColor) / 255;
				float glowColorG = one * Game.colorG(glowColor) / 255;
				float glowColorB = one * Game.colorB(glowColor) / 255;
				float colorR = skyColorR + glowColorR * glowColorA;
				float colorG = skyColorG + glowColorG * glowColorA;
				float colorB = skyColorB + glowColorB * glowColorA;
				float colorA = skyColorA;
				if (colorR > 1) {
					colorR = 1;
				}
				if (colorG > 1) {
					colorG = 1;
				}
				if (colorB > 1) {
					colorB = 1;
				}
				if (colorA > 1) {
					colorA = 1;
				}
				data.rgba[i * 4 + 0] = Game.intToByte(platform.floatToInt(colorR * 255));
				data.rgba[i * 4 + 1] = Game.intToByte(platform.floatToInt(colorG * 255));
				data.rgba[i * 4 + 2] = Game.intToByte(platform.floatToInt(colorB * 255));
				data.rgba[i * 4 + 3] = Game.intToByte(platform.floatToInt(colorA * 255));
				i++;
			}
		}
		return data;
	}

	@Override
	public void onNewFrameDraw3d(Game game, float deltaTime)
	{
		game.skySphereNight = true;
		this.stars.onNewFrameDraw3d(game, deltaTime);
		game.platform.glDisableFog();
		this.drawSkySphere(game);
		game.setFog();
	}

	private static int texture2d(GamePlatform platform, int[] pixelsArgb, float x, float y)
	{
		int px = platform.floatToInt(x * 511);
		int py = platform.floatToInt(y * 511);
		px = ModSkySphereAnimated.positive_modulo(px, 511);
		py = ModSkySphereAnimated.positive_modulo(py, 511);
		return pixelsArgb[MapUtilCi.index2d(px, py, 512)];
	}
	private int[] glowPixels;

	private static int positive_modulo(int i, int n)
	{
		return (i % n + n) % n;
	}
	private int[] skyPixels;
	private ModelData skymodel;
	private ClientMod stars;
	boolean started;
}
