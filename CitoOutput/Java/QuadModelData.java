// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class QuadModelData
{

	public static ModelData getQuadModelData()
	{
		ModelData m = new ModelData();
		float[] xyz = new float[12];
		for (int i = 0; i < 12; i++) {
			xyz[i] = CI_CONST_ARRAY_1[i];
		}
		m.setXyz(xyz);
		float[] uv = new float[8];
		for (int i = 0; i < 8; i++) {
			uv[i] = CI_CONST_ARRAY_2[i];
		}
		m.setUv(uv);
		m.setVerticesCount(4);
		m.setIndices(CI_CONST_ARRAY_3);
		m.setIndicesCount(6);
		return m;
	}

	public static ModelData getQuadModelData2(float sx, float sy, float sw, float sh, float dx, float dy, float dw, float dh, byte r, byte g, byte b, byte a)
	{
		ModelData m = new ModelData();
		float[] xyz = new float[12];
		xyz[0] = dx;
		xyz[1] = dy;
		xyz[2] = 0;
		xyz[3] = dx + dw;
		xyz[4] = dy;
		xyz[5] = 0;
		xyz[6] = dx + dw;
		xyz[7] = dy + dh;
		xyz[8] = 0;
		xyz[9] = dx;
		xyz[10] = dy + dh;
		xyz[11] = 0;
		m.setXyz(xyz);
		float[] uv = new float[8];
		uv[0] = sx;
		uv[1] = sy;
		uv[2] = sx + sw;
		uv[3] = sy;
		uv[4] = sx + sw;
		uv[5] = sy + sh;
		uv[6] = sx;
		uv[7] = sy + sh;
		m.setUv(uv);
		byte[] rgba = new byte[16];
		for (int i = 0; i < 4; i++) {
			rgba[i * 4 + 0] = r;
			rgba[i * 4 + 1] = g;
			rgba[i * 4 + 2] = b;
			rgba[i * 4 + 3] = a;
		}
		m.setRgba(rgba);
		m.setVerticesCount(4);
		m.setIndices(CI_CONST_ARRAY_3);
		m.setIndicesCount(6);
		return m;
	}
	private static final int[] CI_CONST_ARRAY_1 = { -1, -1, 0, 1, -1, 0, 1, 1, 0, -1, 1, 0 };
	private static final int[] CI_CONST_ARRAY_2 = { 0, 0, 1, 0, 1, 1, 0, 1 };
	private static final int[] CI_CONST_ARRAY_3 = { 0, 1, 2, 0, 2, 3 };
}
