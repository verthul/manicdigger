// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class CubeModelData
{

	public static ModelData getCubeModelData()
	{
		ModelData m = new ModelData();
		float[] xyz = new float[72];
		for (int i = 0; i < 72; i++) {
			xyz[i] = CI_CONST_ARRAY_1[i];
		}
		m.setXyz(xyz);
		float[] uv = new float[48];
		for (int i = 0; i < 48; i++) {
			uv[i] = CI_CONST_ARRAY_2[i];
		}
		m.setUv(uv);
		m.setVerticesCount(24);
		m.setIndices(CI_CONST_ARRAY_3);
		m.setIndicesCount(36);
		return m;
	}
	private static final int[] CI_CONST_ARRAY_1 = { -1, -1, 1, 1, -1, 1, 1, 1, 1, -1, 1, 1, -1, -1, -1, -1,
		1, -1, 1, 1, -1, 1, -1, -1, -1, 1, -1, -1, 1, 1, 1, 1,
		1, 1, 1, -1, -1, -1, -1, 1, -1, -1, 1, -1, 1, -1, -1, 1,
		1, -1, -1, 1, 1, -1, 1, 1, 1, 1, -1, 1, -1, -1, -1, -1,
		-1, 1, -1, 1, 1, -1, 1, -1 };
	private static final int[] CI_CONST_ARRAY_2 = { 0, 0, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 0, 0,
		0, 1, 0, 0, 1, 0, 1, 1, 1, 1, 0, 1, 0, 0, 1, 0,
		1, 0, 1, 1, 0, 1, 0, 0, 0, 0, 1, 0, 1, 1, 0, 1 };
	private static final int[] CI_CONST_ARRAY_3 = { 0, 1, 2, 0, 2, 3, 4, 5, 6, 4, 6, 7, 8, 9, 10, 8,
		10, 11, 12, 13, 14, 12, 14, 15, 16, 17, 18, 16, 18, 19, 20, 21,
		22, 20, 22, 23 };
}
