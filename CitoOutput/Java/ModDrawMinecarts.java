// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class ModDrawMinecarts extends ClientMod
{
	public ModDrawMinecarts()
	{
		this.minecarttexture = -1;
	}

	public final void draw(Game game, float positionX, float positionY, float positionZ, int dir, int lastdir, float progress)
	{
		float one = 1;
		if (this.minecarttexture == -1) {
			this.minecarttexture = game.getTexture("minecart.png");
		}
		game.gLPushMatrix();
		float pX = positionX;
		float pY = positionY;
		float pZ = positionZ;
		pY += -(one * 7 / 10);
		game.gLTranslate(pX, pY, pZ);
		float currot = this.vehiclerotation(dir);
		float lastrot = this.vehiclerotation(lastdir);
		float rot = AngleInterpolation.interpolateAngle360(game.platform, lastrot, currot, progress);
		game.gLRotate(-rot - 90, 0, 1, 0);
		RectangleFloat[] cc = CuboidRenderer.cuboidNet(8, 8, 8, 0, 0);
		CuboidRenderer.cuboidNetNormalize(cc, 32, 16);
		game.platform.bindTexture2d(this.minecarttexture);
		CuboidRenderer.drawCuboid(game, -(one * 5 / 10), -(one * 3 / 10), -(one * 5 / 10), 1, 1, 1, cc, 1);
		game.gLPopMatrix();
	}

	@Override
	public void onNewFrameDraw3d(Game game, float deltaTime)
	{
		for (int i = 0; i < game.entitiesCount; i++) {
			if (game.entities[i] == null) {
				continue;
			}
			if (game.entities[i].minecart == null) {
				continue;
			}
			Minecart m = game.entities[i].minecart;
			if (!m.enabled) {
				continue;
			}
			this.draw(game, m.positionX, m.positionY, m.positionZ, m.direction, m.lastdirection, m.progress);
		}
	}
	private int minecarttexture;

	private float vehiclerotation(int dir)
	{
		switch (dir) {
		case VehicleDirection12.VERTICAL_UP:
			return 0;
		case VehicleDirection12.DOWN_RIGHT_RIGHT:
		case VehicleDirection12.UP_LEFT_UP:
			return 45;
		case VehicleDirection12.HORIZONTAL_RIGHT:
			return 90;
		case VehicleDirection12.UP_RIGHT_RIGHT:
		case VehicleDirection12.DOWN_LEFT_DOWN:
			return 135;
		case VehicleDirection12.VERTICAL_DOWN:
			return 180;
		case VehicleDirection12.UP_LEFT_LEFT:
		case VehicleDirection12.DOWN_RIGHT_DOWN:
			return 225;
		case VehicleDirection12.HORIZONTAL_LEFT:
			return 270;
		case VehicleDirection12.UP_RIGHT_UP:
		case VehicleDirection12.DOWN_LEFT_LEFT:
			return 315;
		default:
			return 0;
		}
	}
}
