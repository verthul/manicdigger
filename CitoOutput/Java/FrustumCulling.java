// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class FrustumCulling
{

	/**
	 * &lt;summary&gt;
	 * Calculating the frustum planes.
	 * &lt;/summary&gt;
	 * &lt;remarks&gt;
	 * From the current OpenGL modelview and projection matrices,
	 * calculate the frustum plane equations (Ax+By+Cz+D=0, n=(A,B,C))
	 * The equations can then be used to see on which side points are.
	 * &lt;/remarks&gt;
	 */
	public final void calcFrustumEquations()
	{
		float t;
		float[] matModelView = this.d_GetCameraMatrix.getModelViewMatrix();
		float[] matProjection = this.d_GetCameraMatrix.getProjectionMatrix();
		float[] matFrustum = Mat4.create();
		Mat4.multiply(matFrustum, matProjection, matModelView);
		{
			float[] clip1 = matFrustum;
			{
				this.frustum00 = clip1[3] - clip1[0];
				this.frustum01 = clip1[7] - clip1[4];
				this.frustum02 = clip1[11] - clip1[8];
				this.frustum03 = clip1[15] - clip1[12];
				t = this.platform.mathSqrt(this.frustum00 * this.frustum00 + this.frustum01 * this.frustum01 + this.frustum02 * this.frustum02);
				this.frustum00 /= t;
				this.frustum01 /= t;
				this.frustum02 /= t;
				this.frustum03 /= t;
				this.frustum10 = clip1[3] + clip1[0];
				this.frustum11 = clip1[7] + clip1[4];
				this.frustum12 = clip1[11] + clip1[8];
				this.frustum13 = clip1[15] + clip1[12];
				t = this.platform.mathSqrt(this.frustum10 * this.frustum10 + this.frustum11 * this.frustum11 + this.frustum12 * this.frustum12);
				this.frustum10 /= t;
				this.frustum11 /= t;
				this.frustum12 /= t;
				this.frustum13 /= t;
				this.frustum20 = clip1[3] + clip1[1];
				this.frustum21 = clip1[7] + clip1[5];
				this.frustum22 = clip1[11] + clip1[9];
				this.frustum23 = clip1[15] + clip1[13];
				t = this.platform.mathSqrt(this.frustum20 * this.frustum20 + this.frustum21 * this.frustum21 + this.frustum22 * this.frustum22);
				this.frustum20 /= t;
				this.frustum21 /= t;
				this.frustum22 /= t;
				this.frustum23 /= t;
				this.frustum30 = clip1[3] - clip1[1];
				this.frustum31 = clip1[7] - clip1[5];
				this.frustum32 = clip1[11] - clip1[9];
				this.frustum33 = clip1[15] - clip1[13];
				t = this.platform.mathSqrt(this.frustum30 * this.frustum30 + this.frustum31 * this.frustum31 + this.frustum32 * this.frustum32);
				this.frustum30 /= t;
				this.frustum31 /= t;
				this.frustum32 /= t;
				this.frustum33 /= t;
				this.frustum40 = clip1[3] - clip1[2];
				this.frustum41 = clip1[7] - clip1[6];
				this.frustum42 = clip1[11] - clip1[10];
				this.frustum43 = clip1[15] - clip1[14];
				t = this.platform.mathSqrt(this.frustum40 * this.frustum40 + this.frustum41 * this.frustum41 + this.frustum42 * this.frustum42);
				this.frustum40 /= t;
				this.frustum41 /= t;
				this.frustum42 /= t;
				this.frustum43 /= t;
				this.frustum50 = clip1[3] + clip1[2];
				this.frustum51 = clip1[7] + clip1[6];
				this.frustum52 = clip1[11] + clip1[10];
				this.frustum53 = clip1[15] + clip1[14];
				t = this.platform.mathSqrt(this.frustum50 * this.frustum50 + this.frustum51 * this.frustum51 + this.frustum52 * this.frustum52);
				this.frustum50 /= t;
				this.frustum51 /= t;
				this.frustum52 /= t;
				this.frustum53 /= t;
			}
		}
	}

	public final boolean sphereInFrustum(float x, float y, float z, float radius)
	{
		float d = 0;
		d = this.frustum00 * x + this.frustum01 * y + this.frustum02 * z + this.frustum03;
		if (d <= -radius)
			return false;
		d = this.frustum10 * x + this.frustum11 * y + this.frustum12 * z + this.frustum13;
		if (d <= -radius)
			return false;
		d = this.frustum20 * x + this.frustum21 * y + this.frustum22 * z + this.frustum23;
		if (d <= -radius)
			return false;
		d = this.frustum30 * x + this.frustum31 * y + this.frustum32 * z + this.frustum33;
		if (d <= -radius)
			return false;
		d = this.frustum40 * x + this.frustum41 * y + this.frustum42 * z + this.frustum43;
		if (d <= -radius)
			return false;
		d = this.frustum50 * x + this.frustum51 * y + this.frustum52 * z + this.frustum53;
		if (d <= -radius)
			return false;
		return true;
	}
	IGetCameraMatrix d_GetCameraMatrix;
	private float frustum00;
	private float frustum01;
	private float frustum02;
	private float frustum03;
	private float frustum10;
	private float frustum11;
	private float frustum12;
	private float frustum13;
	private float frustum20;
	private float frustum21;
	private float frustum22;
	private float frustum23;
	private float frustum30;
	private float frustum31;
	private float frustum32;
	private float frustum33;
	private float frustum40;
	private float frustum41;
	private float frustum42;
	private float frustum43;
	private float frustum50;
	private float frustum51;
	private float frustum52;
	private float frustum53;
	GamePlatform platform;
}
