// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class PlayerInterpolate extends IInterpolation
{

	public static float degToRad(float deg)
	{
		return deg / 360 * 2 * Game.getPi();
	}

	@Override
	public InterpolatedObject interpolate(InterpolatedObject a, InterpolatedObject b, float progress)
	{
		PlayerInterpolationState aa = this.platform.castToPlayerInterpolationState(a);
		PlayerInterpolationState bb = this.platform.castToPlayerInterpolationState(b);
		PlayerInterpolationState cc = new PlayerInterpolationState();
		cc.positionX = aa.positionX + (bb.positionX - aa.positionX) * progress;
		cc.positionY = aa.positionY + (bb.positionY - aa.positionY) * progress;
		cc.positionZ = aa.positionZ + (bb.positionZ - aa.positionZ) * progress;
		cc.rotx = PlayerInterpolate.degToRad(AngleInterpolation.interpolateAngle360(this.platform, PlayerInterpolate.radToDeg(aa.rotx), PlayerInterpolate.radToDeg(bb.rotx), progress));
		cc.roty = PlayerInterpolate.degToRad(AngleInterpolation.interpolateAngle360(this.platform, PlayerInterpolate.radToDeg(aa.roty), PlayerInterpolate.radToDeg(bb.roty), progress));
		cc.rotz = PlayerInterpolate.degToRad(AngleInterpolation.interpolateAngle360(this.platform, PlayerInterpolate.radToDeg(aa.rotz), PlayerInterpolate.radToDeg(bb.rotz), progress));
		return cc;
	}

	public static float radToDeg(float rad)
	{
		return rad / (2 * Game.getPi()) * 360;
	}
	GamePlatform platform;
}
