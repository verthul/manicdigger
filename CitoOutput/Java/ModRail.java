// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class ModRail extends ClientMod
{
	public ModRail()
	{
		this.one = 1;
		this.railheight = this.one * 3 / 10;
	}

	final int bestNewDirection(int dirVehicleDirection12Flags, boolean turnleft, boolean turnright, BoolRef retFound)
	{
		retFound.value = true;
		if (turnright) {
			if ((dirVehicleDirection12Flags & 2048) != 0) {
				return VehicleDirection12.DOWN_RIGHT_RIGHT;
			}
			if ((dirVehicleDirection12Flags & 64) != 0) {
				return VehicleDirection12.UP_RIGHT_UP;
			}
			if ((dirVehicleDirection12Flags & 32) != 0) {
				return VehicleDirection12.UP_LEFT_LEFT;
			}
			if ((dirVehicleDirection12Flags & 256) != 0) {
				return VehicleDirection12.DOWN_LEFT_DOWN;
			}
		}
		if (turnleft) {
			if ((dirVehicleDirection12Flags & 1024) != 0) {
				return VehicleDirection12.DOWN_RIGHT_DOWN;
			}
			if ((dirVehicleDirection12Flags & 128) != 0) {
				return VehicleDirection12.UP_RIGHT_RIGHT;
			}
			if ((dirVehicleDirection12Flags & 16) != 0) {
				return VehicleDirection12.UP_LEFT_UP;
			}
			if ((dirVehicleDirection12Flags & 512) != 0) {
				return VehicleDirection12.DOWN_LEFT_LEFT;
			}
		}
		if ((dirVehicleDirection12Flags & 8) != 0) {
			return VehicleDirection12.VERTICAL_DOWN;
		}
		if ((dirVehicleDirection12Flags & 4) != 0) {
			return VehicleDirection12.VERTICAL_UP;
		}
		if ((dirVehicleDirection12Flags & 1) != 0) {
			return VehicleDirection12.HORIZONTAL_LEFT;
		}
		if ((dirVehicleDirection12Flags & 2) != 0) {
			return VehicleDirection12.HORIZONTAL_RIGHT;
		}
		if ((dirVehicleDirection12Flags & 256) != 0) {
			return VehicleDirection12.DOWN_LEFT_DOWN;
		}
		if ((dirVehicleDirection12Flags & 512) != 0) {
			return VehicleDirection12.DOWN_LEFT_LEFT;
		}
		if ((dirVehicleDirection12Flags & 1024) != 0) {
			return VehicleDirection12.DOWN_RIGHT_DOWN;
		}
		if ((dirVehicleDirection12Flags & 2048) != 0) {
			return VehicleDirection12.DOWN_RIGHT_RIGHT;
		}
		if ((dirVehicleDirection12Flags & 32) != 0) {
			return VehicleDirection12.UP_LEFT_LEFT;
		}
		if ((dirVehicleDirection12Flags & 16) != 0) {
			return VehicleDirection12.UP_LEFT_UP;
		}
		if ((dirVehicleDirection12Flags & 128) != 0) {
			return VehicleDirection12.UP_RIGHT_RIGHT;
		}
		if ((dirVehicleDirection12Flags & 64) != 0) {
			return VehicleDirection12.UP_RIGHT_UP;
		}
		retFound.value = false;
		return VehicleDirection12.DOWN_LEFT_DOWN;
	}

	final Vector3Ref currentRailPos(Game game)
	{
		int slope = this.d_RailMapUtil.getRailSlope(this.currentrailblockX, this.currentrailblockY, this.currentrailblockZ);
		float aX = this.currentrailblockX;
		float aY = this.currentrailblockY;
		float aZ = this.currentrailblockZ;
		float x_correction = 0;
		float y_correction = 0;
		float z_correction = 0;
		float half = this.one / 2;
		switch (this.currentdirection) {
		case VehicleDirection12.HORIZONTAL_RIGHT:
			x_correction += this.currentrailblockprogress;
			y_correction += half;
			if (slope == RailSlope.TWO_RIGHT_RAISED)
				z_correction += this.currentrailblockprogress;
			if (slope == RailSlope.TWO_LEFT_RAISED)
				z_correction += 1 - this.currentrailblockprogress;
			break;
		case VehicleDirection12.HORIZONTAL_LEFT:
			x_correction += 1 - this.currentrailblockprogress;
			y_correction += half;
			if (slope == RailSlope.TWO_RIGHT_RAISED)
				z_correction += 1 - this.currentrailblockprogress;
			if (slope == RailSlope.TWO_LEFT_RAISED)
				z_correction += this.currentrailblockprogress;
			break;
		case VehicleDirection12.VERTICAL_DOWN:
			x_correction += half;
			y_correction += this.currentrailblockprogress;
			if (slope == RailSlope.TWO_DOWN_RAISED)
				z_correction += this.currentrailblockprogress;
			if (slope == RailSlope.TWO_UP_RAISED)
				z_correction += 1 - this.currentrailblockprogress;
			break;
		case VehicleDirection12.VERTICAL_UP:
			x_correction += half;
			y_correction += 1 - this.currentrailblockprogress;
			if (slope == RailSlope.TWO_DOWN_RAISED)
				z_correction += 1 - this.currentrailblockprogress;
			if (slope == RailSlope.TWO_UP_RAISED)
				z_correction += this.currentrailblockprogress;
			break;
		case VehicleDirection12.UP_LEFT_LEFT:
			x_correction += half * (1 - this.currentrailblockprogress);
			y_correction += half * this.currentrailblockprogress;
			break;
		case VehicleDirection12.UP_LEFT_UP:
			x_correction += half * this.currentrailblockprogress;
			y_correction += half - half * this.currentrailblockprogress;
			break;
		case VehicleDirection12.UP_RIGHT_RIGHT:
			x_correction += half + half * this.currentrailblockprogress;
			y_correction += half * this.currentrailblockprogress;
			break;
		case VehicleDirection12.UP_RIGHT_UP:
			x_correction += 1 - half * this.currentrailblockprogress;
			y_correction += half - half * this.currentrailblockprogress;
			break;
		case VehicleDirection12.DOWN_LEFT_LEFT:
			x_correction += half * (1 - this.currentrailblockprogress);
			y_correction += 1 - half * this.currentrailblockprogress;
			break;
		case VehicleDirection12.DOWN_LEFT_DOWN:
			x_correction += half * this.currentrailblockprogress;
			y_correction += half + half * this.currentrailblockprogress;
			break;
		case VehicleDirection12.DOWN_RIGHT_RIGHT:
			x_correction += half + half * this.currentrailblockprogress;
			y_correction += 1 - half * this.currentrailblockprogress;
			break;
		case VehicleDirection12.DOWN_RIGHT_DOWN:
			x_correction += 1 - half * this.currentrailblockprogress;
			y_correction += half + half * this.currentrailblockprogress;
			break;
		}
		return Vector3Ref.create(aX + x_correction, aZ + this.railheight + 1 + z_correction, aY + y_correction);
	}

	final void exitVehicle(Game game)
	{
		game.setCharacterEyesHeight(this.originalmodelheight);
		this.railriding = false;
		game.controls.setFreemove(0);
		game.enable_move = true;
	}

	final int getUpDownMove(Game game, int railblockX, int railblockY, int railblockZ, int dir)
	{
		if (!game.map.isValidPos(railblockX, railblockY, railblockZ)) {
			return 0;
		}
		int slope = this.d_RailMapUtil.getRailSlope(railblockX, railblockY, railblockZ);
		if (slope == RailSlope.TWO_DOWN_RAISED && dir == TileEnterDirection.UP) {
			return 1;
		}
		if (slope == RailSlope.TWO_UP_RAISED && dir == TileEnterDirection.DOWN) {
			return 1;
		}
		if (slope == RailSlope.TWO_LEFT_RAISED && dir == TileEnterDirection.RIGHT) {
			return 1;
		}
		if (slope == RailSlope.TWO_RIGHT_RAISED && dir == TileEnterDirection.LEFT) {
			return 1;
		}
		if (slope == RailSlope.TWO_DOWN_RAISED && dir == TileEnterDirection.DOWN) {
			return 2;
		}
		if (slope == RailSlope.TWO_UP_RAISED && dir == TileEnterDirection.UP) {
			return 2;
		}
		if (slope == RailSlope.TWO_LEFT_RAISED && dir == TileEnterDirection.LEFT) {
			return 2;
		}
		if (slope == RailSlope.TWO_RIGHT_RAISED && dir == TileEnterDirection.RIGHT) {
			return 2;
		}
		return 0;
	}

	public static Vector3IntRef nextTile(int direction, int currentTileX, int currentTileY, int currentTileZ)
	{
		return ModRail.nextTile_(DirectionUtils.resultExit(direction), currentTileX, currentTileY, currentTileZ);
	}

	public static Vector3IntRef nextTile_(int direction, int currentTileX, int currentTileY, int currentTileZ)
	{
		switch (direction) {
		case TileExitDirection.LEFT:
			return Vector3IntRef.create(currentTileX - 1, currentTileY, currentTileZ);
		case TileExitDirection.RIGHT:
			return Vector3IntRef.create(currentTileX + 1, currentTileY, currentTileZ);
		case TileExitDirection.UP:
			return Vector3IntRef.create(currentTileX, currentTileY - 1, currentTileZ);
		case TileExitDirection.DOWN:
			return Vector3IntRef.create(currentTileX, currentTileY + 1, currentTileZ);
		default:
			return null;
		}
	}

	@Override
	public void onNewFrameFixed(Game game, NewFrameEventArgs args)
	{
		if (this.d_RailMapUtil == null) {
			this.d_RailMapUtil = new RailMapUtil();
			this.d_RailMapUtil.game = game;
		}
		this.railOnNewFrame(game, args.getDt());
	}

	final int possibleRails(Game game, TileEnterData enter)
	{
		int possible_railsVehicleDirection12Flags = 0;
		if (game.map.isValidPos(enter.blockPositionX, enter.blockPositionY, enter.blockPositionZ)) {
			int newpositionrail = game.d_Data.rail()[game.map.getBlock(enter.blockPositionX, enter.blockPositionY, enter.blockPositionZ)];
			int[] all_possible_rails = new int[3];
			int all_possible_railsCount = 0;
			int[] possibleRails3 = DirectionUtils.possibleNewRails3(enter.enterDirection);
			for (int i = 0; i < 3; i++) {
				int z = possibleRails3[i];
				if ((newpositionrail & DirectionUtils.toRailDirectionFlags(DirectionUtils.toRailDirection(z))) != 0) {
					all_possible_rails[all_possible_railsCount++] = z;
				}
			}
			possible_railsVehicleDirection12Flags = DirectionUtils.toVehicleDirection12Flags_(all_possible_rails, all_possible_railsCount);
		}
		return possible_railsVehicleDirection12Flags;
	}

	final void railOnNewFrame(Game game, float dt)
	{
		if (this.localMinecart == null) {
			this.localMinecart = new Entity();
			this.localMinecart.minecart = new Minecart();
			game.entityAddLocal(this.localMinecart);
		}
		this.localMinecart.minecart.enabled = this.railriding;
		if (this.railriding) {
			Minecart m = this.localMinecart.minecart;
			m.positionX = game.player.position.x;
			m.positionY = game.player.position.y;
			m.positionZ = game.player.position.z;
			m.direction = this.currentdirection;
			m.lastdirection = this.lastdirection;
			m.progress = this.currentrailblockprogress;
		}
		game.localplayeranimationhint.inVehicle = this.railriding;
		game.localplayeranimationhint.drawFixX = 0;
		game.localplayeranimationhint.drawFixY = this.railriding ? -this.one * 7 / 10 : 0;
		game.localplayeranimationhint.drawFixZ = 0;
		boolean turnright = game.keyboardState[game.getKey(86)];
		boolean turnleft = game.keyboardState[game.getKey(83)];
		this.railSound(game);
		if (this.railriding) {
			game.controls.setFreemove(1);
			game.enable_move = false;
			Vector3Ref railPos = this.currentRailPos(game);
			game.player.position.x = railPos.x;
			game.player.position.y = railPos.y;
			game.player.position.z = railPos.z;
			this.currentrailblockprogress += this.currentvehiclespeed * dt;
			if (this.currentrailblockprogress >= 1) {
				this.lastdirection = this.currentdirection;
				this.currentrailblockprogress = 0;
				TileEnterData newenter = new TileEnterData();
				Vector3IntRef nexttile = ModRail.nextTile(this.currentdirection, this.currentrailblockX, this.currentrailblockY, this.currentrailblockZ);
				newenter.blockPositionX = nexttile.x;
				newenter.blockPositionY = nexttile.y;
				newenter.blockPositionZ = nexttile.z;
				if (this.getUpDownMove(game, this.currentrailblockX, this.currentrailblockY, this.currentrailblockZ, DirectionUtils.resultEnter(DirectionUtils.resultExit(this.currentdirection))) == 1) {
					newenter.blockPositionZ++;
				}
				if (this.getUpDownMove(game, newenter.blockPositionX, newenter.blockPositionY, newenter.blockPositionZ - 1, DirectionUtils.resultEnter(DirectionUtils.resultExit(this.currentdirection))) == 2) {
					newenter.blockPositionZ--;
				}
				newenter.enterDirection = DirectionUtils.resultEnter(DirectionUtils.resultExit(this.currentdirection));
				BoolRef newdirFound = new BoolRef();
				int newdir = this.bestNewDirection(this.possibleRails(game, newenter), turnleft, turnright, newdirFound);
				if (!newdirFound.value) {
					this.currentdirection = DirectionUtils.reverse(this.currentdirection);
				}
				else {
					this.currentdirection = newdir;
					this.currentrailblockX = game.platform.floatToInt(newenter.blockPositionX);
					this.currentrailblockY = game.platform.floatToInt(newenter.blockPositionY);
					this.currentrailblockZ = game.platform.floatToInt(newenter.blockPositionZ);
				}
			}
		}
		if (game.keyboardState[game.getKey(105)] && game.guiTyping != TypingState.TYPING) {
			this.currentvehiclespeed += 1 * dt;
		}
		if (game.keyboardState[game.getKey(101)] && game.guiTyping != TypingState.TYPING) {
			this.currentvehiclespeed -= 5 * dt;
		}
		if (this.currentvehiclespeed < 0) {
			this.currentvehiclespeed = 0;
		}
		if (!this.wasqpressed && game.keyboardState[game.getKey(99)] && game.guiTyping != TypingState.TYPING) {
			this.reverse();
		}
		if (!this.wasepressed && game.keyboardState[game.getKey(87)] && !this.railriding && game.controls.getFreemove() == 0 && game.guiTyping != TypingState.TYPING) {
			this.currentrailblockX = game.platform.floatToInt(game.player.position.x);
			this.currentrailblockY = game.platform.floatToInt(game.player.position.z);
			this.currentrailblockZ = game.platform.floatToInt(game.player.position.y) - 1;
			if (!game.map.isValidPos(this.currentrailblockX, this.currentrailblockY, this.currentrailblockZ)) {
				this.exitVehicle(game);
			}
			else {
				int railunderplayer = game.d_Data.rail()[game.map.getBlock(this.currentrailblockX, this.currentrailblockY, this.currentrailblockZ)];
				this.railriding = true;
				this.originalmodelheight = game.getCharacterEyesHeight();
				game.setCharacterEyesHeight(this.minecartheight());
				this.currentvehiclespeed = 0;
				if ((railunderplayer & 1) != 0) {
					this.currentdirection = VehicleDirection12.HORIZONTAL_RIGHT;
				}
				else if ((railunderplayer & 2) != 0) {
					this.currentdirection = VehicleDirection12.VERTICAL_UP;
				}
				else if ((railunderplayer & 4) != 0) {
					this.currentdirection = VehicleDirection12.UP_LEFT_UP;
				}
				else if ((railunderplayer & 8) != 0) {
					this.currentdirection = VehicleDirection12.UP_RIGHT_UP;
				}
				else if ((railunderplayer & 16) != 0) {
					this.currentdirection = VehicleDirection12.DOWN_LEFT_LEFT;
				}
				else if ((railunderplayer & 32) != 0) {
					this.currentdirection = VehicleDirection12.DOWN_RIGHT_RIGHT;
				}
				else {
					this.exitVehicle(game);
				}
				this.lastdirection = this.currentdirection;
			}
		}
		else if (!this.wasepressed && game.keyboardState[game.getKey(87)] && this.railriding && game.guiTyping != TypingState.TYPING) {
			this.exitVehicle(game);
			game.player.position.y += this.one * 7 / 10;
		}
		this.wasqpressed = game.keyboardState[game.getKey(99)] && game.guiTyping != TypingState.TYPING;
		this.wasepressed = game.keyboardState[game.getKey(87)] && game.guiTyping != TypingState.TYPING;
	}

	final void railSound(Game game)
	{
		float railsoundpersecond = this.currentvehiclespeed;
		if (railsoundpersecond > 10) {
			railsoundpersecond = 10;
		}
		game.audioPlayLoop("railnoise.wav", this.railriding && railsoundpersecond > this.one * 1 / 10, false);
		if (!this.railriding) {
			return;
		}
		if (game.platform.timeMillisecondsFromStart() - this.lastrailsoundtimeMilliseconds > 1000 / railsoundpersecond) {
			game.audioPlay(game.platform.stringFormat("rail{0}.wav", game.platform.intToString(this.lastrailsound + 1)));
			this.lastrailsoundtimeMilliseconds = game.platform.timeMillisecondsFromStart();
			this.lastrailsound++;
			if (this.lastrailsound >= 4) {
				this.lastrailsound = 0;
			}
		}
	}

	final void reverse()
	{
		this.currentdirection = DirectionUtils.reverse(this.currentdirection);
		this.currentrailblockprogress = 1 - this.currentrailblockprogress;
		this.lastdirection = this.currentdirection;
	}
	int currentdirection;
	int currentrailblockX;
	int currentrailblockY;
	int currentrailblockZ;
	float currentrailblockprogress;
	float currentvehiclespeed;
	RailMapUtil d_RailMapUtil;
	int lastdirection;
	private int lastrailsound;
	private int lastrailsoundtimeMilliseconds;
	Entity localMinecart;

	final float minecartheight()
	{
		return this.one / 2;
	}
	private float one;
	float originalmodelheight;
	float railheight;
	boolean railriding;
	boolean wasepressed;
	boolean wasqpressed;
}
