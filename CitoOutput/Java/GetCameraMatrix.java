// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class GetCameraMatrix extends IGetCameraMatrix
{

	@Override
	public float[] getModelViewMatrix()
	{
		return this.lastmvmatrix;
	}

	@Override
	public float[] getProjectionMatrix()
	{
		return this.lastpmatrix;
	}
	float[] lastmvmatrix;
	float[] lastpmatrix;
}
