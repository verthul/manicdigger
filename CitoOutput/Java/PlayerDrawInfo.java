// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class PlayerDrawInfo
{
	public PlayerDrawInfo()
	{
		this.anim = new AnimationState();
		this.animationHint_ = new AnimationHint();
	}
	AnimationHint animationHint_;
	AnimationState anim;
	NetworkInterpolation interpolation;
	float lastcurposX;
	float lastcurposY;
	float lastcurposZ;
	float lastnetworkposX;
	float lastnetworkposY;
	float lastnetworkposZ;
	float lastnetworkrotx;
	float lastnetworkroty;
	float lastnetworkrotz;
	boolean moves;
	float velocityX;
	float velocityY;
	float velocityZ;
}
