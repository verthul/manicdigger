// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class Kamera
{
	public Kamera()
	{
		this.one = 1;
		this.distance = 5;
		this.angle = 45;
		this.minimumDistance = 2;
		this.tt = 0;
		this.maximumAngle = 89;
		this.minimumAngle = 0;
		this.center = new Vector3Ref();
	}
	float angle;
	Vector3Ref center;

	public final float getAngle()
	{
		return this.angle;
	}

	private float getCameraHeightFromCenter(GamePlatform platform)
	{
		return platform.mathSin(this.angle * Game.getPi() / 180) * this.distance;
	}

	public final void getCenter(Vector3Ref ret)
	{
		ret.x = this.center.x;
		ret.y = this.center.y;
		ret.z = this.center.z;
	}

	public final float getDistance()
	{
		return this.distance;
	}

	private float getFlatDistance(GamePlatform platform)
	{
		return platform.mathCos(this.angle * Game.getPi() / 180) * this.distance;
	}

	public final void getPosition(GamePlatform platform, Vector3Ref ret)
	{
		float cx = platform.mathCos(this.tt * this.one / 2) * this.getFlatDistance(platform) + this.center.x;
		float cy = platform.mathSin(this.tt * this.one / 2) * this.getFlatDistance(platform) + this.center.z;
		ret.x = cx;
		ret.y = this.center.y + this.getCameraHeightFromCenter(platform);
		ret.z = cy;
	}

	public final float getT()
	{
		return this.tt;
	}
	int maximumAngle;
	int minimumAngle;
	float minimumDistance;

	public final void move(CameraMove camera_move, float p)
	{
		p *= 2;
		p *= 2;
		if (camera_move.turnLeft) {
			this.turnLeft(p);
		}
		if (camera_move.turnRight) {
			this.turnRight(p);
		}
		if (camera_move.distanceUp) {
			this.setDistance(this.getDistance() + p);
		}
		if (camera_move.distanceDown) {
			this.setDistance(this.getDistance() - p);
		}
		if (camera_move.angleUp) {
			this.angle += p * 10;
		}
		if (camera_move.angleDown) {
			this.angle -= p * 10;
		}
		this.setDistance(camera_move.distance);
		this.setValidAngle();
	}

	public final void setAngle(float value)
	{
		this.angle = value;
	}

	public final void setDistance(float value)
	{
		this.distance = value;
		if (this.distance < this.minimumDistance) {
			this.distance = this.minimumDistance;
		}
	}

	public final void setT(float value)
	{
		this.tt = value;
	}

	private void setValidAngle()
	{
		if (this.angle > this.maximumAngle) {
			this.angle = this.maximumAngle;
		}
		if (this.angle < this.minimumAngle) {
			this.angle = this.minimumAngle;
		}
	}

	public final void turnLeft(float p)
	{
		this.tt += p;
	}

	public final void turnRight(float p)
	{
		this.tt -= p;
	}

	public final void turnUp(float p)
	{
		this.angle += p;
		this.setValidAngle();
	}
	private float distance;
	private float one;
	float tt;
}
