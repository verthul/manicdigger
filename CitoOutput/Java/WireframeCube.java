// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class WireframeCube
{

	private static void addVertex(ModelData model, float x, float y, float z, float u, float v, int color)
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

	private static void drawLineLoop(ModelData m, Vector3Ref p0, Vector3Ref p1, Vector3Ref p2, Vector3Ref p3)
	{
		int startVertex = m.getVerticesCount();
		WireframeCube.addVertex(m, p0.x, p0.y, p0.z, 0, 0, Game.colorFromArgb(255, 255, 255, 255));
		WireframeCube.addVertex(m, p1.x, p1.y, p1.z, 0, 0, Game.colorFromArgb(255, 255, 255, 255));
		WireframeCube.addVertex(m, p2.x, p2.y, p2.z, 0, 0, Game.colorFromArgb(255, 255, 255, 255));
		WireframeCube.addVertex(m, p3.x, p3.y, p3.z, 0, 0, Game.colorFromArgb(255, 255, 255, 255));
		m.indices[m.indicesCount++] = startVertex + 0;
		m.indices[m.indicesCount++] = startVertex + 1;
		m.indices[m.indicesCount++] = startVertex + 1;
		m.indices[m.indicesCount++] = startVertex + 2;
		m.indices[m.indicesCount++] = startVertex + 2;
		m.indices[m.indicesCount++] = startVertex + 3;
		m.indices[m.indicesCount++] = startVertex + 3;
		m.indices[m.indicesCount++] = startVertex + 0;
	}

	public static ModelData get()
	{
		ModelData m = new ModelData();
		m.setMode(1);
		m.xyz = new float[72];
		m.uv = new float[48];
		m.rgba = new byte[96];
		m.indices = new int[48];
		WireframeCube.drawLineLoop(m, Vector3Ref.create(-1, -1, -1), Vector3Ref.create(-1, 1, -1), Vector3Ref.create(1, 1, -1), Vector3Ref.create(1, -1, -1));
		WireframeCube.drawLineLoop(m, Vector3Ref.create(-1, -1, -1), Vector3Ref.create(1, -1, -1), Vector3Ref.create(1, -1, 1), Vector3Ref.create(-1, -1, 1));
		WireframeCube.drawLineLoop(m, Vector3Ref.create(-1, -1, -1), Vector3Ref.create(-1, -1, 1), Vector3Ref.create(-1, 1, 1), Vector3Ref.create(-1, 1, -1));
		WireframeCube.drawLineLoop(m, Vector3Ref.create(-1, -1, 1), Vector3Ref.create(1, -1, 1), Vector3Ref.create(1, 1, 1), Vector3Ref.create(-1, 1, 1));
		WireframeCube.drawLineLoop(m, Vector3Ref.create(-1, 1, -1), Vector3Ref.create(-1, 1, 1), Vector3Ref.create(1, 1, 1), Vector3Ref.create(1, 1, -1));
		WireframeCube.drawLineLoop(m, Vector3Ref.create(1, -1, -1), Vector3Ref.create(1, 1, -1), Vector3Ref.create(1, 1, 1), Vector3Ref.create(1, -1, 1));
		return m;
	}
}
