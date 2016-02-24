// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class CuboidRenderer
{

	public static void addVertex(ModelData model, float x, float y, float z, float u, float v, int color)
	{
		model.xyz[model.getXyzCount() + 0] = x;
		model.xyz[model.getXyzCount() + 1] = y;
		model.xyz[model.getXyzCount() + 2] = z;
		model.uv[model.getUvCount() + 0] = u;
		model.uv[model.getUvCount() + 1] = v;
		model.rgba[model.getRgbaCount() + 0] = Game.intToByte(Game.colorR(color));
		model.rgba[model.getRgbaCount() + 1] = Game.intToByte(Game.colorG(color));
		model.rgba[model.getRgbaCount() + 2] = Game.intToByte(Game.colorB(color));
		model.rgba[model.getRgbaCount() + 3] = Game.intToByte(Game.colorA(color));
		model.verticesCount++;
	}

	public static RectangleFloat[] cuboidNet(float tsizex, float tsizey, float tsizez, float tstartx, float tstarty)
	{
		RectangleFloat[] coords = new RectangleFloat[6];
		{
			coords[0] = RectangleFloat.create(tsizez + tstartx, tsizez + tstarty, tsizex, tsizey);
			coords[1] = RectangleFloat.create(2 * tsizez + tsizex + tstartx, tsizez + tstarty, tsizex, tsizey);
			coords[2] = RectangleFloat.create(tstartx, tsizez + tstarty, tsizez, tsizey);
			coords[3] = RectangleFloat.create(tsizez + tsizex + tstartx, tsizez + tstarty, tsizez, tsizey);
			coords[4] = RectangleFloat.create(tsizez + tstartx, tstarty, tsizex, tsizez);
			coords[5] = RectangleFloat.create(tsizez + tsizex + tstartx, tstarty, tsizex, tsizez);
		}
		return coords;
	}

	public static void cuboidNetNormalize(RectangleFloat[] coords, float texturewidth, float textureheight)
	{
		float AtiArtifactFix = 0.15f;
		for (int i = 0; i < 6; i++) {
			float x = (coords[i].x + AtiArtifactFix) / texturewidth;
			float y = (coords[i].y + AtiArtifactFix) / textureheight;
			float w = (coords[i].x + coords[i].width - AtiArtifactFix) / texturewidth - x;
			float h = (coords[i].y + coords[i].height - AtiArtifactFix) / textureheight - y;
			coords[i] = RectangleFloat.create(x, y, w, h);
		}
	}

	public static void drawCuboid(Game game, float posX, float posY, float posZ, float sizeX, float sizeY, float sizeZ, RectangleFloat[] texturecoords, float light)
	{
		ModelData data = new ModelData();
		data.xyz = new float[72];
		data.uv = new float[48];
		data.rgba = new byte[96];
		int light255 = game.platform.floatToInt(light * 255);
		int color = Game.colorFromArgb(255, light255, light255, light255);
		RectangleFloat rect;
		rect = texturecoords[0];
		CuboidRenderer.addVertex(data, posX, posY, posZ, rect.x, rect.bottom(), color);
		CuboidRenderer.addVertex(data, posX, posY, posZ + sizeZ, rect.x + rect.width, rect.bottom(), color);
		CuboidRenderer.addVertex(data, posX, posY + sizeY, posZ + sizeZ, rect.x + rect.width, rect.y, color);
		CuboidRenderer.addVertex(data, posX, posY + sizeY, posZ, rect.x, rect.y, color);
		rect = texturecoords[1];
		CuboidRenderer.addVertex(data, posX + sizeX, posY, posZ, rect.x, rect.bottom(), color);
		CuboidRenderer.addVertex(data, posX + sizeX, posY, posZ + sizeZ, rect.x + rect.width, rect.bottom(), color);
		CuboidRenderer.addVertex(data, posX + sizeX, posY + sizeY, posZ + sizeZ, rect.x + rect.width, rect.y, color);
		CuboidRenderer.addVertex(data, posX + sizeX, posY + sizeY, posZ, rect.x, rect.y, color);
		rect = texturecoords[2];
		CuboidRenderer.addVertex(data, posX + sizeX, posY, posZ, rect.x, rect.bottom(), color);
		CuboidRenderer.addVertex(data, posX, posY, posZ, rect.x + rect.width, rect.bottom(), color);
		CuboidRenderer.addVertex(data, posX, posY + sizeY, posZ, rect.x + rect.width, rect.y, color);
		CuboidRenderer.addVertex(data, posX + sizeX, posY + sizeY, posZ, rect.x, rect.y, color);
		rect = texturecoords[3];
		CuboidRenderer.addVertex(data, posX + sizeX, posY, posZ + sizeZ, rect.x + rect.width, rect.bottom(), color);
		CuboidRenderer.addVertex(data, posX, posY, posZ + sizeZ, rect.x, rect.bottom(), color);
		CuboidRenderer.addVertex(data, posX, posY + sizeY, posZ + sizeZ, rect.x, rect.y, color);
		CuboidRenderer.addVertex(data, posX + sizeX, posY + sizeY, posZ + sizeZ, rect.x + rect.width, rect.y, color);
		rect = texturecoords[4];
		CuboidRenderer.addVertex(data, posX, posY + sizeY, posZ, rect.x, rect.bottom(), color);
		CuboidRenderer.addVertex(data, posX, posY + sizeY, posZ + sizeZ, rect.x + rect.width, rect.bottom(), color);
		CuboidRenderer.addVertex(data, posX + sizeX, posY + sizeY, posZ + sizeZ, rect.x + rect.width, rect.y, color);
		CuboidRenderer.addVertex(data, posX + sizeX, posY + sizeY, posZ, rect.x, rect.y, color);
		rect = texturecoords[5];
		CuboidRenderer.addVertex(data, posX, posY, posZ, rect.x, rect.bottom(), color);
		CuboidRenderer.addVertex(data, posX, posY, posZ + sizeZ, rect.x + rect.width, rect.bottom(), color);
		CuboidRenderer.addVertex(data, posX + sizeX, posY, posZ + sizeZ, rect.x + rect.width, rect.y, color);
		CuboidRenderer.addVertex(data, posX + sizeX, posY, posZ, rect.x, rect.y, color);
		data.indices = new int[36];
		for (int i = 0; i < 6; i++) {
			data.indices[i * 6 + 0] = i * 4 + 3;
			data.indices[i * 6 + 1] = i * 4 + 2;
			data.indices[i * 6 + 2] = i * 4 + 0;
			data.indices[i * 6 + 3] = i * 4 + 2;
			data.indices[i * 6 + 4] = i * 4 + 1;
			data.indices[i * 6 + 5] = i * 4 + 0;
		}
		data.indicesCount = 36;
		game.platform.glDisableCullFace();
		game.drawModelData(data);
		game.platform.glEnableCullFace();
	}

	public static void drawCuboid2(Game game, float posX, float posY, float posZ, float sizeX, float sizeY, float sizeZ, RectangleFloat[] texturecoords, float light)
	{
		ModelData data = new ModelData();
		data.xyz = new float[72];
		data.uv = new float[48];
		data.rgba = new byte[96];
		int light255 = game.platform.floatToInt(light * 255);
		int color = Game.colorFromArgb(255, light255, light255, light255);
		RectangleFloat rect;
		rect = texturecoords[2];
		CuboidRenderer.addVertex(data, posX, posY, posZ, rect.x, rect.bottom(), color);
		CuboidRenderer.addVertex(data, posX, posY, posZ + sizeZ, rect.x + rect.width, rect.bottom(), color);
		CuboidRenderer.addVertex(data, posX, posY + sizeY, posZ + sizeZ, rect.x + rect.width, rect.y, color);
		CuboidRenderer.addVertex(data, posX, posY + sizeY, posZ, rect.x, rect.y, color);
		rect = texturecoords[3];
		CuboidRenderer.addVertex(data, posX + sizeX, posY, posZ + sizeZ, rect.x, rect.bottom(), color);
		CuboidRenderer.addVertex(data, posX + sizeX, posY, posZ, rect.x + rect.width, rect.bottom(), color);
		CuboidRenderer.addVertex(data, posX + sizeX, posY + sizeY, posZ, rect.x + rect.width, rect.y, color);
		CuboidRenderer.addVertex(data, posX + sizeX, posY + sizeY, posZ + sizeZ, rect.x, rect.y, color);
		rect = texturecoords[1];
		CuboidRenderer.addVertex(data, posX + sizeX, posY, posZ, rect.x, rect.bottom(), color);
		CuboidRenderer.addVertex(data, posX, posY, posZ, rect.x + rect.width, rect.bottom(), color);
		CuboidRenderer.addVertex(data, posX, posY + sizeY, posZ, rect.x + rect.width, rect.y, color);
		CuboidRenderer.addVertex(data, posX + sizeX, posY + sizeY, posZ, rect.x, rect.y, color);
		rect = texturecoords[0];
		CuboidRenderer.addVertex(data, posX + sizeX, posY, posZ + sizeZ, rect.x + rect.width, rect.bottom(), color);
		CuboidRenderer.addVertex(data, posX, posY, posZ + sizeZ, rect.x, rect.bottom(), color);
		CuboidRenderer.addVertex(data, posX, posY + sizeY, posZ + sizeZ, rect.x, rect.y, color);
		CuboidRenderer.addVertex(data, posX + sizeX, posY + sizeY, posZ + sizeZ, rect.x + rect.width, rect.y, color);
		rect = texturecoords[4];
		CuboidRenderer.addVertex(data, posX, posY + sizeY, posZ, rect.x, rect.y, color);
		CuboidRenderer.addVertex(data, posX, posY + sizeY, posZ + sizeZ, rect.x, rect.bottom(), color);
		CuboidRenderer.addVertex(data, posX + sizeX, posY + sizeY, posZ + sizeZ, rect.x + rect.width, rect.bottom(), color);
		CuboidRenderer.addVertex(data, posX + sizeX, posY + sizeY, posZ, rect.x + rect.width, rect.y, color);
		rect = texturecoords[5];
		CuboidRenderer.addVertex(data, posX, posY, posZ, rect.x, rect.y, color);
		CuboidRenderer.addVertex(data, posX, posY, posZ + sizeZ, rect.x, rect.bottom(), color);
		CuboidRenderer.addVertex(data, posX + sizeX, posY, posZ + sizeZ, rect.x + rect.width, rect.bottom(), color);
		CuboidRenderer.addVertex(data, posX + sizeX, posY, posZ, rect.x + rect.width, rect.y, color);
		data.indices = new int[36];
		for (int i = 0; i < 6; i++) {
			data.indices[i * 6 + 0] = i * 4 + 3;
			data.indices[i * 6 + 1] = i * 4 + 2;
			data.indices[i * 6 + 2] = i * 4 + 0;
			data.indices[i * 6 + 3] = i * 4 + 2;
			data.indices[i * 6 + 4] = i * 4 + 1;
			data.indices[i * 6 + 5] = i * 4 + 0;
		}
		data.indicesCount = 36;
		game.platform.glDisableCullFace();
		game.drawModelData(data);
		game.platform.glEnableCullFace();
	}
}
