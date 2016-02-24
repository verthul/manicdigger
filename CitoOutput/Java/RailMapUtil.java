// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class RailMapUtil
{

	public final int getRailSlope(int x, int y, int z)
	{
		int tiletype = this.game.map.getBlock(x, y, z);
		int railDirectionFlags = this.game.blocktypes[tiletype].rail;
		int blocknear;
		if (x < this.game.map.mapSizeX - 1) {
			blocknear = this.game.map.getBlock(x + 1, y, z);
			if (railDirectionFlags == 1 && blocknear != 0 && this.game.blocktypes[blocknear].rail == 0) {
				return RailSlope.TWO_RIGHT_RAISED;
			}
		}
		if (x > 0) {
			blocknear = this.game.map.getBlock(x - 1, y, z);
			if (railDirectionFlags == 1 && blocknear != 0 && this.game.blocktypes[blocknear].rail == 0) {
				return RailSlope.TWO_LEFT_RAISED;
			}
		}
		if (y > 0) {
			blocknear = this.game.map.getBlock(x, y - 1, z);
			if (railDirectionFlags == 2 && blocknear != 0 && this.game.blocktypes[blocknear].rail == 0) {
				return RailSlope.TWO_UP_RAISED;
			}
		}
		if (y < this.game.map.mapSizeY - 1) {
			blocknear = this.game.map.getBlock(x, y + 1, z);
			if (railDirectionFlags == 2 && blocknear != 0 && this.game.blocktypes[blocknear].rail == 0) {
				return RailSlope.TWO_DOWN_RAISED;
			}
		}
		return RailSlope.FLAT;
	}
	Game game;
}
