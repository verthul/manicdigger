// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class Unproject
{
	public Unproject()
	{
		this.finalMatrix = Mat4.create();
		this.inp = new float[4];
		this.out_ = new float[4];
	}

	private void multMatrixVec(float[] matrix, float[] inp__, float[] out__)
	{
		for (int i = 0; i < 4; i = i + 1) {
			out__[i] = inp__[0] * matrix[0 + i] + inp__[1] * matrix[4 + i] + inp__[2] * matrix[8 + i] + inp__[3] * matrix[12 + i];
		}
	}

	public final boolean unProject(int winX, int winY, int winZ, float[] model, float[] proj, float[] view, float[] objPos)
	{
		this.inp[0] = winX;
		this.inp[1] = winY;
		this.inp[2] = winZ;
		this.inp[3] = 1;
		Mat4.multiply(this.finalMatrix, proj, model);
		Mat4.invert(this.finalMatrix, this.finalMatrix);
		this.inp[0] = (this.inp[0] - view[0]) / view[2];
		this.inp[1] = (this.inp[1] - view[1]) / view[3];
		this.inp[0] = this.inp[0] * 2 - 1;
		this.inp[1] = this.inp[1] * 2 - 1;
		this.inp[2] = this.inp[2] * 2 - 1;
		this.multMatrixVec(this.finalMatrix, this.inp, this.out_);
		if (this.out_[3] == 0) {
			return false;
		}
		this.out_[0] /= this.out_[3];
		this.out_[1] /= this.out_[3];
		this.out_[2] /= this.out_[3];
		objPos[0] = this.out_[0];
		objPos[1] = this.out_[1];
		objPos[2] = this.out_[2];
		return true;
	}
	private float[] finalMatrix;
	private float[] inp;
	private float[] out_;
}
