// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class ModelDataTool
{

	static void addIndex(ModelData model, int index)
	{
		if (model.indicesCount >= model.indicesMax) {
			int indicesCount = model.indicesCount;
			int[] indices = new int[indicesCount * 2];
			for (int i = 0; i < indicesCount; i++) {
				indices[i] = model.indices[i];
			}
			model.indices = indices;
			model.indicesMax = model.indicesMax * 2;
		}
		model.indices[model.indicesCount++] = index;
	}

	public static void addVertex(ModelData model, float x, float y, float z, float u, float v, int color)
	{
		if (model.verticesCount >= model.verticesMax) {
			int xyzCount = model.getXyzCount();
			float[] xyz = new float[xyzCount * 2];
			for (int i = 0; i < xyzCount; i++) {
				xyz[i] = model.xyz[i];
			}
			int uvCount = model.getUvCount();
			float[] uv = new float[uvCount * 2];
			for (int i = 0; i < uvCount; i++) {
				uv[i] = model.uv[i];
			}
			int rgbaCount = model.getRgbaCount();
			byte[] rgba = new byte[rgbaCount * 2];
			for (int i = 0; i < rgbaCount; i++) {
				rgba[i] = model.rgba[i];
			}
			model.xyz = xyz;
			model.uv = uv;
			model.rgba = rgba;
			model.verticesMax = model.verticesMax * 2;
		}
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
}
