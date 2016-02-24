// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class ScriptCharacterPhysics extends EntityScript
{
	public ScriptCharacterPhysics()
	{
		this.movedz = 0;
		this.curspeed = new Vector3Ref();
		this.jumpacceleration = 0;
		this.isplayeronground = false;
		this.acceleration = new Acceleration();
		this.jumpstartacceleration = 0;
		this.jumpstartaccelerationhalf = 0;
		this.movespeednow = 0;
		this.tmpPlayerPosition = new float[3];
		this.tmpBlockingBlockType = new IntRef();
		this.constGravity = 0.3f;
		this.constWaterGravityMultiplier = 3;
		this.constEnableAcceleration = true;
		this.constJump = 2.1f;
	}

	public static float boxPointDistance(float minX, float minY, float minZ, float maxX, float maxY, float maxZ, float pX, float pY, float pZ)
	{
		float dx = ScriptCharacterPhysics.max3(minX - pX, 0, pX - maxX);
		float dy = ScriptCharacterPhysics.max3(minY - pY, 0, pY - maxY);
		float dz = ScriptCharacterPhysics.max3(minZ - pZ, 0, pZ - maxZ);
		return ScriptCharacterPhysics.max3(dx, dy, dz);
	}

	private int floatToInt(float value)
	{
		return this.game.platform.floatToInt(value);
	}

	private boolean isEmptyPoint(float x, float y, float z, IntRef blockingBlocktype)
	{
		for (int xx = 0; xx < 3; xx++) {
			for (int yy = 0; yy < 3; yy++) {
				for (int zz = 0; zz < 3; zz++) {
					if (!this.isTileEmptyForPhysics(this.floatToInt(x + xx - 1), this.floatToInt(z + zz - 1), this.floatToInt(y + yy - 1))) {
						float minX = this.floatToInt(x + xx - 1);
						float minY = this.floatToInt(y + yy - 1);
						float minZ = this.floatToInt(z + zz - 1);
						float maxX = minX + 1;
						float maxY = minY + this.game.getblockheight(this.floatToInt(x + xx - 1), this.floatToInt(z + zz - 1), this.floatToInt(y + yy - 1));
						float maxZ = minZ + 1;
						if (ScriptCharacterPhysics.boxPointDistance(minX, minY, minZ, maxX, maxY, maxZ, x, y, z) < this.game.constWallDistance) {
							if (blockingBlocktype != null) {
								blockingBlocktype.value = this.game.map.getBlock(this.floatToInt(x + xx - 1), this.floatToInt(z + zz - 1), this.floatToInt(y + yy - 1));
							}
							return false;
						}
					}
				}
			}
		}
		return true;
	}

	private boolean isEmptySpaceForPlayer(boolean high, float x, float y, float z, IntRef blockingBlockType)
	{
		return this.isEmptyPoint(x, y, z, blockingBlockType) && this.isEmptyPoint(x, y + 1, z, blockingBlockType) && (!high || this.isEmptyPoint(x, y + 2, z, blockingBlockType));
	}

	public final boolean isTileEmptyForPhysics(int x, int y, int z)
	{
		if (z >= this.game.map.mapSizeZ) {
			return true;
		}
		boolean enableFreemove = false;
		if (x < 0 || y < 0 || z < 0) {
			return enableFreemove;
		}
		if (x >= this.game.map.mapSizeX || y >= this.game.map.mapSizeY) {
			return enableFreemove;
		}
		int block = this.game.map.getBlockValid(x, y, z);
		if (block == 0) {
			return true;
		}
		Packet_BlockType blocktype = this.game.blocktypes[block];
		return blocktype.walkableType == 1 || this.game.isEmptyForPhysics(blocktype) || this.game.isRail(blocktype);
	}

	public static float makeCloserToZero(float a, float b)
	{
		if (a > 0) {
			float c = a - b;
			if (c < 0) {
				c = 0;
			}
			return c;
		}
		else {
			float c = a + b;
			if (c > 0) {
				c = 0;
			}
			return c;
		}
	}

	private static float max3(float a, float b, float c)
	{
		return MathCi.maxFloat(MathCi.maxFloat(a, b), c);
	}

	@Override
	public void onNewFrameFixed(Game game_, int entity, float dt)
	{
		this.game = game_;
		if (this.game.guistate == GuiState.MAP_LOADING) {
			return;
		}
		this.movespeednow = this.game.moveSpeedNow();
		this.game.controls.movedx = MathCi.clampFloat(this.game.controls.movedx, -1, 1);
		this.game.controls.movedy = MathCi.clampFloat(this.game.controls.movedy, -1, 1);
		Controls move = this.game.controls;
		this.jumpstartacceleration = 13.333f * this.constGravity;
		this.jumpstartaccelerationhalf = 9 * this.constGravity;
		this.acceleration.setDefault();
		this.game.soundnow = new BoolRef();
		if (this.game.followId() != null && this.game.followId().value == this.game.localPlayerId) {
			move.movedx = 0;
			move.movedy = 0;
			move.moveup = false;
			move.wantsjump = false;
		}
		this.update(this.game.player.position, move, dt, this.game.soundnow, Vector3Ref.create(this.game.pushX, this.game.pushY, this.game.pushZ), this.game.entities[this.game.localPlayerId].drawModel.modelHeight);
	}

	private boolean standingOnHalfBlock(float x, float y, float z)
	{
		int under = this.game.map.getBlock(this.game.platform.floatToInt(x), this.game.platform.floatToInt(z), this.game.platform.floatToInt(y));
		return this.game.blocktypes[under].drawType == 11;
	}

	public final void update(EntityPosition_ stateplayerposition, Controls move, float dt, BoolRef soundnow, Vector3Ref push, float modelheight)
	{
		if (this.game.stopPlayerMove) {
			this.movedz = 0;
			this.game.stopPlayerMove = false;
		}
		if (!this.isplayeronground) {
			this.acceleration.acceleration1 = 0.99f;
			this.acceleration.acceleration2 = 0.2f;
			this.acceleration.acceleration3 = 70;
		}
		{
			int blockunderplayer = this.game.blockUnderPlayer();
			if (blockunderplayer != -1 && blockunderplayer == this.game.d_Data.blockIdTrampoline() && !this.isplayeronground && !this.game.controls.shiftkeydown) {
				this.game.controls.wantsjump = true;
				this.jumpstartacceleration = 20.666f * this.constGravity;
			}
		}
		{
			int blockunderplayer = this.game.blockUnderPlayer();
			if (blockunderplayer != -1 && this.game.d_Data.isSlipperyWalk()[blockunderplayer] || this.game.swimmingBody()) {
				this.acceleration.acceleration1 = 0.99f;
				this.acceleration.acceleration2 = 0.2f;
				this.acceleration.acceleration3 = 70;
			}
		}
		soundnow.value = false;
		Vector3Ref diff1ref = new Vector3Ref();
		VectorTool.toVectorInFixedSystem(move.movedx * this.movespeednow * dt, 0, move.movedy * this.movespeednow * dt, stateplayerposition.rotx, stateplayerposition.roty, diff1ref);
		Vector3Ref diff1 = new Vector3Ref();
		diff1.x = diff1ref.x;
		diff1.y = diff1ref.y;
		diff1.z = diff1ref.z;
		if (MiscCi.vec3Length(push.x, push.y, push.z) > 0.01f) {
			push.normalize();
			push.x *= 5;
			push.y *= 5;
			push.z *= 5;
		}
		diff1.x += push.x * dt;
		diff1.y += push.y * dt;
		diff1.z += push.z * dt;
		boolean loaded = false;
		int cx = this.game.platform.floatToInt(this.game.player.position.x / 16);
		int cy = this.game.platform.floatToInt(this.game.player.position.z / 16);
		int cz = this.game.platform.floatToInt(this.game.player.position.y / 16);
		if (this.game.map.isValidChunkPos(cx, cy, cz)) {
			if (this.game.map.chunks[MapUtilCi.index3d(cx, cy, cz, this.game.map.mapSizeX / 16, this.game.map.mapSizeY / 16)] != null) {
				loaded = true;
			}
		}
		else {
			loaded = true;
		}
		if (!move.freemove && loaded) {
			if (!this.game.swimmingBody()) {
				this.movedz += -this.constGravity;
			}
			else {
				this.movedz += -this.constGravity * this.constWaterGravityMultiplier;
			}
		}
		this.game.movedz = this.movedz;
		if (this.constEnableAcceleration) {
			this.curspeed.x *= this.acceleration.acceleration1;
			this.curspeed.y *= this.acceleration.acceleration1;
			this.curspeed.z *= this.acceleration.acceleration1;
			this.curspeed.x = ScriptCharacterPhysics.makeCloserToZero(this.curspeed.x, this.acceleration.acceleration2 * dt);
			this.curspeed.y = ScriptCharacterPhysics.makeCloserToZero(this.curspeed.y, this.acceleration.acceleration2 * dt);
			this.curspeed.z = ScriptCharacterPhysics.makeCloserToZero(this.curspeed.z, this.acceleration.acceleration2 * dt);
			diff1.y += move.moveup ? 2 * this.movespeednow * dt : 0;
			diff1.y -= move.movedown ? 2 * this.movespeednow * dt : 0;
			this.curspeed.x += diff1.x * this.acceleration.acceleration3 * dt;
			this.curspeed.y += diff1.y * this.acceleration.acceleration3 * dt;
			this.curspeed.z += diff1.z * this.acceleration.acceleration3 * dt;
			if (this.curspeed.length() > this.movespeednow) {
				this.curspeed.normalize();
				this.curspeed.x *= this.movespeednow;
				this.curspeed.y *= this.movespeednow;
				this.curspeed.z *= this.movespeednow;
			}
		}
		else {
			if (MiscCi.vec3Length(diff1.x, diff1.y, diff1.z) > 0) {
				diff1.normalize();
			}
			this.curspeed.x = diff1.x * this.movespeednow;
			this.curspeed.y = diff1.y * this.movespeednow;
			this.curspeed.z = diff1.z * this.movespeednow;
		}
		Vector3Ref newposition = Vector3Ref.create(0, 0, 0);
		if (!move.freemove) {
			newposition.x = stateplayerposition.x + this.curspeed.x;
			newposition.y = stateplayerposition.y + this.curspeed.y;
			newposition.z = stateplayerposition.z + this.curspeed.z;
			if (!this.game.swimmingBody()) {
				newposition.y = stateplayerposition.y;
			}
			float diffx = newposition.x - stateplayerposition.x;
			float diffy = newposition.y - stateplayerposition.y;
			float diffz = newposition.z - stateplayerposition.z;
			float difflength = MiscCi.vec3Length(diffx, diffy, diffz);
			if (difflength > 0) {
				diffx /= difflength;
				diffy /= difflength;
				diffz /= difflength;
				diffx *= this.curspeed.length();
				diffy *= this.curspeed.length();
				diffz *= this.curspeed.length();
			}
			newposition.x = stateplayerposition.x + diffx * dt;
			newposition.y = stateplayerposition.y + diffy * dt;
			newposition.z = stateplayerposition.z + diffz * dt;
		}
		else {
			newposition.x = stateplayerposition.x + this.curspeed.x * dt;
			newposition.y = stateplayerposition.y + this.curspeed.y * dt;
			newposition.z = stateplayerposition.z + this.curspeed.z * dt;
		}
		newposition.y += this.movedz * dt;
		Vector3Ref previousposition = Vector3Ref.create(stateplayerposition.x, stateplayerposition.y, stateplayerposition.z);
		if (!move.noclip) {
			float[] v = this.wallSlide(Vec3.fromValues(stateplayerposition.x, stateplayerposition.y, stateplayerposition.z), Vec3.fromValues(newposition.x, newposition.y, newposition.z), modelheight);
			stateplayerposition.x = v[0];
			stateplayerposition.y = v[1];
			stateplayerposition.z = v[2];
		}
		else {
			stateplayerposition.x = newposition.x;
			stateplayerposition.y = newposition.y;
			stateplayerposition.z = newposition.z;
		}
		if (!move.freemove) {
			if (this.isplayeronground || this.game.swimmingBody()) {
				this.jumpacceleration = 0;
				this.movedz = 0;
			}
			if ((move.wantsjump || move.wantsjumphalf) && (this.jumpacceleration == 0 && this.isplayeronground || this.game.swimmingBody()) && loaded && !this.game.swimmingEyes()) {
				this.jumpacceleration = move.wantsjumphalf ? this.jumpstartaccelerationhalf : this.jumpstartacceleration;
				soundnow.value = true;
			}
			if (this.jumpacceleration > 0) {
				this.isplayeronground = false;
				this.jumpacceleration = this.jumpacceleration / 2;
			}
			{
				this.movedz += this.jumpacceleration * this.constJump;
			}
		}
		else {
			this.isplayeronground = true;
		}
		this.game.isplayeronground = this.isplayeronground;
	}

	public final float[] wallSlide(float[] oldposition, float[] newposition, float modelheight)
	{
		boolean high = false;
		if (modelheight >= 2) {
			high = true;
		}
		oldposition[1] += this.game.constWallDistance;
		newposition[1] += this.game.constWallDistance;
		this.game.reachedwall = false;
		this.game.reachedwall_1blockhigh = false;
		this.game.reachedHalfBlock = false;
		this.tmpPlayerPosition[0] = oldposition[0];
		this.tmpPlayerPosition[1] = oldposition[1];
		this.tmpPlayerPosition[2] = oldposition[2];
		this.tmpBlockingBlockType.value = 0;
		if (this.isEmptySpaceForPlayer(high, newposition[0], this.tmpPlayerPosition[1], this.tmpPlayerPosition[2], this.tmpBlockingBlockType)) {
			this.tmpPlayerPosition[0] = newposition[0];
		}
		else {
			this.game.reachedwall = true;
			if (this.isEmptyPoint(newposition[0], this.tmpPlayerPosition[1] + 0.5f, this.tmpPlayerPosition[2], null)) {
				this.game.reachedwall_1blockhigh = true;
				if (this.game.blocktypes[this.tmpBlockingBlockType.value].drawType == 11) {
					this.game.reachedHalfBlock = true;
				}
				if (this.standingOnHalfBlock(newposition[0], this.tmpPlayerPosition[1], this.tmpPlayerPosition[2])) {
					this.game.reachedHalfBlock = true;
				}
			}
		}
		if (this.isEmptySpaceForPlayer(high, this.tmpPlayerPosition[0], newposition[1], this.tmpPlayerPosition[2], this.tmpBlockingBlockType)) {
			this.tmpPlayerPosition[1] = newposition[1];
		}
		if (this.isEmptySpaceForPlayer(high, this.tmpPlayerPosition[0], this.tmpPlayerPosition[1], newposition[2], this.tmpBlockingBlockType)) {
			this.tmpPlayerPosition[2] = newposition[2];
		}
		else {
			this.game.reachedwall = true;
			if (this.isEmptyPoint(this.tmpPlayerPosition[0], this.tmpPlayerPosition[1] + 0.5f, newposition[2], null)) {
				this.game.reachedwall_1blockhigh = true;
				if (this.game.blocktypes[this.tmpBlockingBlockType.value].drawType == 11) {
					this.game.reachedHalfBlock = true;
				}
				if (this.standingOnHalfBlock(this.tmpPlayerPosition[0], this.tmpPlayerPosition[1], newposition[2])) {
					this.game.reachedHalfBlock = true;
				}
			}
		}
		this.isplayeronground = this.tmpPlayerPosition[1] == oldposition[1] && newposition[1] < oldposition[1];
		this.tmpPlayerPosition[1] -= this.game.constWallDistance;
		return this.tmpPlayerPosition;
	}
	Acceleration acceleration;
	boolean constEnableAcceleration;
	float constGravity;
	float constJump;
	float constWaterGravityMultiplier;
	Vector3Ref curspeed;
	Game game;
	boolean isplayeronground;
	float jumpacceleration;
	float jumpstartacceleration;
	float jumpstartaccelerationhalf;
	float movedz;
	float movespeednow;
	private IntRef tmpBlockingBlockType;
	private float[] tmpPlayerPosition;
}
