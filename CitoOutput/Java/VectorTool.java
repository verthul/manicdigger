// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class VectorTool
{

	public static void toVectorInFixedSystem(float dx, float dy, float dz, float orientationx, float orientationy, Vector3Ref output)
	{
		if (dx == 0 && dy == 0 && dz == 0) {
			output.x = 0;
			output.y = 0;
			output.z = 0;
			return;
		}
		float xRot = orientationx;
		float yRot = orientationy;
		float x = dx * Platform.cos(yRot) + dy * Platform.sin(xRot) * Platform.sin(yRot) - dz * Platform.cos(xRot) * Platform.sin(yRot);
		float y = dy * Platform.cos(xRot) + dz * Platform.sin(xRot);
		float z = dx * Platform.sin(yRot) - dy * Platform.sin(xRot) * Platform.cos(yRot) + dz * Platform.cos(xRot) * Platform.cos(yRot);
		output.x = x;
		output.y = y;
		output.z = z;
	}
}
