// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class DirectionUtils
{

	/**
	 * &lt;summary&gt;
	 * Enter at TileEnterDirection.Left -&gt; yields VehicleDirection12.UpLeftUp,
	 * VehicleDirection12.HorizontalRight,
	 * VehicleDirection12.DownLeftDown
	 * &lt;/summary&gt;
	 * &lt;param name="enter_at"&gt;&lt;/param&gt;
	 * &lt;returns&gt;&lt;/returns&gt;
	 */
	public static int[] possibleNewRails3(int enter_at)
	{
		int[] ret = new int[3];
		switch (enter_at) {
		case TileEnterDirection.LEFT:
			ret[0] = VehicleDirection12.UP_LEFT_UP;
			ret[1] = VehicleDirection12.HORIZONTAL_RIGHT;
			ret[2] = VehicleDirection12.DOWN_LEFT_DOWN;
			break;
		case TileEnterDirection.DOWN:
			ret[0] = VehicleDirection12.DOWN_LEFT_LEFT;
			ret[1] = VehicleDirection12.VERTICAL_UP;
			ret[2] = VehicleDirection12.DOWN_RIGHT_RIGHT;
			break;
		case TileEnterDirection.UP:
			ret[0] = VehicleDirection12.UP_LEFT_LEFT;
			ret[1] = VehicleDirection12.VERTICAL_DOWN;
			ret[2] = VehicleDirection12.UP_RIGHT_RIGHT;
			break;
		case TileEnterDirection.RIGHT:
			ret[0] = VehicleDirection12.UP_RIGHT_UP;
			ret[1] = VehicleDirection12.HORIZONTAL_LEFT;
			ret[2] = VehicleDirection12.DOWN_RIGHT_DOWN;
			break;
		default:
			return null;
		}
		return ret;
	}

	public static int railDirectionFlagsCount(int railDirectionFlags)
	{
		int count = 0;
		if ((railDirectionFlags & DirectionUtils.toRailDirectionFlags(RailDirection.DOWN_LEFT)) != 0) {
			count++;
		}
		if ((railDirectionFlags & DirectionUtils.toRailDirectionFlags(RailDirection.DOWN_RIGHT)) != 0) {
			count++;
		}
		if ((railDirectionFlags & DirectionUtils.toRailDirectionFlags(RailDirection.HORIZONTAL)) != 0) {
			count++;
		}
		if ((railDirectionFlags & DirectionUtils.toRailDirectionFlags(RailDirection.UP_LEFT)) != 0) {
			count++;
		}
		if ((railDirectionFlags & DirectionUtils.toRailDirectionFlags(RailDirection.UP_RIGHT)) != 0) {
			count++;
		}
		if ((railDirectionFlags & DirectionUtils.toRailDirectionFlags(RailDirection.VERTICAL)) != 0) {
			count++;
		}
		return count;
	}

	public static int resultEnter(int direction)
	{
		switch (direction) {
		case TileExitDirection.UP:
			return TileEnterDirection.DOWN;
		case TileExitDirection.DOWN:
			return TileEnterDirection.UP;
		case TileExitDirection.LEFT:
			return TileEnterDirection.RIGHT;
		case TileExitDirection.RIGHT:
			return TileEnterDirection.LEFT;
		default:
			return TileEnterDirection.DOWN;
		}
	}

	/**
	 * &lt;summary&gt;
	 * VehicleDirection12.UpRightRight -&gt; returns Direction4.Right
	 * &lt;/summary&gt;
	 * &lt;param name="direction"&gt;&lt;/param&gt;
	 * &lt;returns&gt;&lt;/returns&gt;
	 */
	public static int resultExit(int direction)
	{
		switch (direction) {
		case VehicleDirection12.HORIZONTAL_LEFT:
			return TileExitDirection.LEFT;
		case VehicleDirection12.HORIZONTAL_RIGHT:
			return TileExitDirection.RIGHT;
		case VehicleDirection12.VERTICAL_UP:
			return TileExitDirection.UP;
		case VehicleDirection12.VERTICAL_DOWN:
			return TileExitDirection.DOWN;
		case VehicleDirection12.UP_LEFT_UP:
			return TileExitDirection.UP;
		case VehicleDirection12.UP_LEFT_LEFT:
			return TileExitDirection.LEFT;
		case VehicleDirection12.UP_RIGHT_UP:
			return TileExitDirection.UP;
		case VehicleDirection12.UP_RIGHT_RIGHT:
			return TileExitDirection.RIGHT;
		case VehicleDirection12.DOWN_LEFT_DOWN:
			return TileExitDirection.DOWN;
		case VehicleDirection12.DOWN_LEFT_LEFT:
			return TileExitDirection.LEFT;
		case VehicleDirection12.DOWN_RIGHT_DOWN:
			return TileExitDirection.DOWN;
		case VehicleDirection12.DOWN_RIGHT_RIGHT:
			return TileExitDirection.RIGHT;
		default:
			return TileExitDirection.DOWN;
		}
	}

	public static int reverse(int direction)
	{
		switch (direction) {
		case VehicleDirection12.HORIZONTAL_LEFT:
			return VehicleDirection12.HORIZONTAL_RIGHT;
		case VehicleDirection12.HORIZONTAL_RIGHT:
			return VehicleDirection12.HORIZONTAL_LEFT;
		case VehicleDirection12.VERTICAL_UP:
			return VehicleDirection12.VERTICAL_DOWN;
		case VehicleDirection12.VERTICAL_DOWN:
			return VehicleDirection12.VERTICAL_UP;
		case VehicleDirection12.UP_LEFT_UP:
			return VehicleDirection12.UP_LEFT_LEFT;
		case VehicleDirection12.UP_LEFT_LEFT:
			return VehicleDirection12.UP_LEFT_UP;
		case VehicleDirection12.UP_RIGHT_UP:
			return VehicleDirection12.UP_RIGHT_RIGHT;
		case VehicleDirection12.UP_RIGHT_RIGHT:
			return VehicleDirection12.UP_RIGHT_UP;
		case VehicleDirection12.DOWN_LEFT_DOWN:
			return VehicleDirection12.DOWN_LEFT_LEFT;
		case VehicleDirection12.DOWN_LEFT_LEFT:
			return VehicleDirection12.DOWN_LEFT_DOWN;
		case VehicleDirection12.DOWN_RIGHT_DOWN:
			return VehicleDirection12.DOWN_RIGHT_RIGHT;
		case VehicleDirection12.DOWN_RIGHT_RIGHT:
			return VehicleDirection12.DOWN_RIGHT_DOWN;
		default:
			return VehicleDirection12.DOWN_LEFT_DOWN;
		}
	}

	public static int toRailDirection(int direction)
	{
		switch (direction) {
		case VehicleDirection12.HORIZONTAL_LEFT:
			return RailDirection.HORIZONTAL;
		case VehicleDirection12.HORIZONTAL_RIGHT:
			return RailDirection.HORIZONTAL;
		case VehicleDirection12.VERTICAL_UP:
			return RailDirection.VERTICAL;
		case VehicleDirection12.VERTICAL_DOWN:
			return RailDirection.VERTICAL;
		case VehicleDirection12.UP_LEFT_UP:
			return RailDirection.UP_LEFT;
		case VehicleDirection12.UP_LEFT_LEFT:
			return RailDirection.UP_LEFT;
		case VehicleDirection12.UP_RIGHT_UP:
			return RailDirection.UP_RIGHT;
		case VehicleDirection12.UP_RIGHT_RIGHT:
			return RailDirection.UP_RIGHT;
		case VehicleDirection12.DOWN_LEFT_DOWN:
			return RailDirection.DOWN_LEFT;
		case VehicleDirection12.DOWN_LEFT_LEFT:
			return RailDirection.DOWN_LEFT;
		case VehicleDirection12.DOWN_RIGHT_DOWN:
			return RailDirection.DOWN_RIGHT;
		case VehicleDirection12.DOWN_RIGHT_RIGHT:
			return RailDirection.DOWN_RIGHT;
		default:
			return RailDirection.DOWN_LEFT;
		}
	}

	public static int toRailDirectionFlags(int direction)
	{
		switch (direction) {
		case RailDirection.DOWN_LEFT:
			return 16;
		case RailDirection.DOWN_RIGHT:
			return 32;
		case RailDirection.HORIZONTAL:
			return 1;
		case RailDirection.UP_LEFT:
			return 4;
		case RailDirection.UP_RIGHT:
			return 8;
		case RailDirection.VERTICAL:
			return 2;
		default:
			return 0;
		}
	}

	public static int toVehicleDirection12Flags(int direction)
	{
		switch (direction) {
		case VehicleDirection12.HORIZONTAL_LEFT:
			return 1;
		case VehicleDirection12.HORIZONTAL_RIGHT:
			return 2;
		case VehicleDirection12.VERTICAL_UP:
			return 4;
		case VehicleDirection12.VERTICAL_DOWN:
			return 8;
		case VehicleDirection12.UP_LEFT_UP:
			return 16;
		case VehicleDirection12.UP_LEFT_LEFT:
			return 32;
		case VehicleDirection12.UP_RIGHT_UP:
			return 64;
		case VehicleDirection12.UP_RIGHT_RIGHT:
			return 128;
		case VehicleDirection12.DOWN_LEFT_DOWN:
			return 256;
		case VehicleDirection12.DOWN_LEFT_LEFT:
			return 512;
		case VehicleDirection12.DOWN_RIGHT_DOWN:
			return 1024;
		case VehicleDirection12.DOWN_RIGHT_RIGHT:
			return 2048;
		default:
			return 0;
		}
	}

	public static int toVehicleDirection12Flags_(int[] directions, int directionsCount)
	{
		int flags = 0;
		for (int i = 0; i < directionsCount; i++) {
			int d = directions[i];
			flags = flags | DirectionUtils.toVehicleDirection12Flags(d);
		}
		return flags;
	}
}
