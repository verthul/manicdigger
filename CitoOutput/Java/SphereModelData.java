// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class SphereModelData
{

	public static int[] calculateElements(float radius, float height, int segments, int rings)
	{
		int i = 0;
		int[] data = new int[segments * rings * 6];
		for (int y = 0; y < rings - 1; y++) {
			for (int x = 0; x < segments - 1; x++) {
				data[i++] = (y + 0) * segments + x;
				data[i++] = (y + 1) * segments + x;
				data[i++] = (y + 1) * segments + x + 1;
				data[i++] = (y + 1) * segments + x + 1;
				data[i++] = (y + 0) * segments + x + 1;
				data[i++] = (y + 0) * segments + x;
			}
		}
		return data;
	}

	private static float getPi()
	{
		float a = 3141592;
		return a / 1000000;
	}

	public static ModelData getSphereModelData(float radius, float height, int segments, int rings)
	{
		int i = 0;
		float[] xyz = new float[rings * segments * 3];
		float[] uv = new float[rings * segments * 2];
		byte[] rgba = new byte[rings * segments * 4];
		for (int y = 0; y < rings; y++) {
			float yFloat = y;
			float phiFloat = yFloat / (rings - 1) * SphereModelData.getPi();
			for (int x = 0; x < segments; x++) {
				float xFloat = x;
				float thetaFloat = xFloat / (segments - 1) * 2 * SphereModelData.getPi();
				float vxFloat = radius * Platform.sin(phiFloat) * Platform.cos(thetaFloat);
				float vyFloat = height * Platform.cos(phiFloat);
				float vzFloat = radius * Platform.sin(phiFloat) * Platform.sin(thetaFloat);
				float uFloat = xFloat / (segments - 1);
				float vFloat = yFloat / (rings - 1);
				xyz[i * 3 + 0] = vxFloat;
				xyz[i * 3 + 1] = vyFloat;
				xyz[i * 3 + 2] = vzFloat;
				uv[i * 2 + 0] = uFloat;
				uv[i * 2 + 1] = vFloat;
				rgba[i * 4 + 0] = -1;
				rgba[i * 4 + 1] = -1;
				rgba[i * 4 + 2] = -1;
				rgba[i * 4 + 3] = -1;
				i++;
			}
		}
		ModelData data = new ModelData();
		data.setVerticesCount(segments * rings);
		data.setIndicesCount(segments * rings * 6);
		data.setXyz(xyz);
		data.setUv(uv);
		data.setRgba(rgba);
		data.setIndices(SphereModelData.calculateElements(radius, height, segments, rings));
		return data;
	}
}
