// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class Player
{
	public Player()
	{
		this.animationHint_ = new AnimationHint();
		this.model_ = "player.txt";
		this.eyeHeight = this.defaultEyeHeight();
		this.modelHeight = this.defaultModelHeight();
		this.currentTexture = -1;
	}
	AnimationHint animationHint_;
	int currentTexture;

	public final float defaultEyeHeight()
	{
		float one = 1;
		return one * 15 / 10;
	}

	public final float defaultModelHeight()
	{
		float one = 1;
		return one * 17 / 10;
	}
	float eyeHeight;
	byte heading;
	int health;
	int lastUpdateMilliseconds;
	float modelHeight;
	String model_;
	int monsterType;
	String name;
	byte networkHeading;
	byte networkPitch;
	float networkX;
	float networkY;
	float networkZ;
	byte pitch;
	boolean positionLoaded;
	float positionX;
	float positionY;
	float positionZ;
	HttpResponseCi skinDownloadResponse;
	String texture;
	int type;
	boolean moves;
	PlayerDrawInfo playerDrawInfo;
}
