// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class ModCamera extends ClientMod
{
	public ModCamera()
	{
		this.overheadCamera_cameraEye = new Vector3Ref();
		this.upVec3 = Vec3.fromValues(0, 1, 0);
	}

	final float[] fppCamera(Game game)
	{
		Vector3Ref forward = new Vector3Ref();
		VectorTool.toVectorInFixedSystem(0, 0, 1, game.player.position.rotx, game.player.position.roty, forward);
		Vector3Ref cameraEye = new Vector3Ref();
		Vector3Ref cameraTarget = new Vector3Ref();
		float playerEyeX = game.player.position.x;
		float playerEyeY = game.player.position.y + game.getCharacterEyesHeight();
		float playerEyeZ = game.player.position.z;
		if (!game.eNABLE_TPP_VIEW) {
			cameraEye.x = playerEyeX;
			cameraEye.y = playerEyeY;
			cameraEye.z = playerEyeZ;
			cameraTarget.x = playerEyeX + forward.x;
			cameraTarget.y = playerEyeY + forward.y;
			cameraTarget.z = playerEyeZ + forward.z;
		}
		else {
			cameraEye.x = playerEyeX + forward.x * -game.tppcameradistance;
			cameraEye.y = playerEyeY + forward.y * -game.tppcameradistance;
			cameraEye.z = playerEyeZ + forward.z * -game.tppcameradistance;
			cameraTarget.x = playerEyeX;
			cameraTarget.y = playerEyeY;
			cameraTarget.z = playerEyeZ;
			FloatRef currentTppcameradistance = FloatRef.create(game.tppcameradistance);
			this.limitThirdPersonCameraToWalls(game, cameraEye, cameraTarget, currentTppcameradistance);
		}
		float[] ret = new float[16];
		Mat4.lookAt(ret, Vec3.fromValues(cameraEye.x, cameraEye.y, cameraEye.z), Vec3.fromValues(cameraTarget.x, cameraTarget.y, cameraTarget.z), this.upVec3);
		game.cameraEyeX = cameraEye.x;
		game.cameraEyeY = cameraEye.y;
		game.cameraEyeZ = cameraEye.z;
		return ret;
	}

	final void limitThirdPersonCameraToWalls(Game game, Vector3Ref eye, Vector3Ref target, FloatRef curtppcameradistance)
	{
		float one = 1;
		Vector3Ref ray_start_point = target;
		Vector3Ref raytarget = eye;
		Line3D pick = new Line3D();
		float raydirX = raytarget.x - ray_start_point.x;
		float raydirY = raytarget.y - ray_start_point.y;
		float raydirZ = raytarget.z - ray_start_point.z;
		float raydirLength1 = game.length(raydirX, raydirY, raydirZ);
		raydirX /= raydirLength1;
		raydirY /= raydirLength1;
		raydirZ /= raydirLength1;
		raydirX = raydirX * (game.tppcameradistance + 1);
		raydirY = raydirY * (game.tppcameradistance + 1);
		raydirZ = raydirZ * (game.tppcameradistance + 1);
		pick.start = Vec3.fromValues(ray_start_point.x, ray_start_point.y, ray_start_point.z);
		pick.end = new float[3];
		pick.end[0] = ray_start_point.x + raydirX;
		pick.end[1] = ray_start_point.y + raydirY;
		pick.end[2] = ray_start_point.z + raydirZ;
		IntRef pick2Count = new IntRef();
		BlockPosSide[] pick2 = game.pick(game.s, pick, pick2Count);
		if (pick2Count.value > 0) {
			BlockPosSide pick2nearest = game.nearest(pick2, pick2Count.value, ray_start_point.x, ray_start_point.y, ray_start_point.z);
			float pickX = pick2nearest.blockPos[0] - target.x;
			float pickY = pick2nearest.blockPos[1] - target.y;
			float pickZ = pick2nearest.blockPos[2] - target.z;
			float pickdistance = game.length(pickX, pickY, pickZ);
			curtppcameradistance.value = MathCi.minFloat(pickdistance - 1, curtppcameradistance.value);
			if (curtppcameradistance.value < one * 3 / 10) {
				curtppcameradistance.value = one * 3 / 10;
			}
		}
		float cameraDirectionX = target.x - eye.x;
		float cameraDirectionY = target.y - eye.y;
		float cameraDirectionZ = target.z - eye.z;
		float raydirLength = game.length(raydirX, raydirY, raydirZ);
		raydirX /= raydirLength;
		raydirY /= raydirLength;
		raydirZ /= raydirLength;
		eye.x = target.x + raydirX * curtppcameradistance.value;
		eye.y = target.y + raydirY * curtppcameradistance.value;
		eye.z = target.z + raydirZ * curtppcameradistance.value;
	}

	@Override
	public void onBeforeNewFrameDraw3d(Game game, float deltaTime)
	{
		if (game.overheadcamera) {
			game.camera = this.overheadCamera(game);
		}
		else {
			game.camera = this.fppCamera(game);
		}
	}

	final float[] overheadCamera(Game game)
	{
		game.overheadcameraK.getPosition(game.platform, this.overheadCamera_cameraEye);
		Vector3Ref cameraEye = this.overheadCamera_cameraEye;
		Vector3Ref cameraTarget = Vector3Ref.create(game.overheadcameraK.center.x, game.overheadcameraK.center.y + game.getCharacterEyesHeight(), game.overheadcameraK.center.z);
		FloatRef currentOverheadcameradistance = FloatRef.create(game.overheadcameradistance);
		this.limitThirdPersonCameraToWalls(game, cameraEye, cameraTarget, currentOverheadcameradistance);
		float[] ret = new float[16];
		Mat4.lookAt(ret, Vec3.fromValues(cameraEye.x, cameraEye.y, cameraEye.z), Vec3.fromValues(cameraTarget.x, cameraTarget.y, cameraTarget.z), this.upVec3);
		game.cameraEyeX = cameraEye.x;
		game.cameraEyeY = cameraEye.y;
		game.cameraEyeZ = cameraEye.z;
		return ret;
	}
	Vector3Ref overheadCamera_cameraEye;
	private float[] upVec3;
}
