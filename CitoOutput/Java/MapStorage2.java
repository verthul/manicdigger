// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class MapStorage2 extends IMapStorage2
{

	public static MapStorage2 create(Game game)
	{
		MapStorage2 s = new MapStorage2();
		s.game = game;
		return s;
	}

	@Override
	public int getBlock(int x, int y, int z)
	{
		return this.game.map.getBlock(x, y, z);
	}

	@Override
	public int getMapSizeX()
	{
		return this.game.map.mapSizeX;
	}

	@Override
	public int getMapSizeY()
	{
		return this.game.map.mapSizeY;
	}

	@Override
	public int getMapSizeZ()
	{
		return this.game.map.mapSizeZ;
	}

	@Override
	public void setBlock(int x, int y, int z, int tileType)
	{
		this.game.setBlock(x, y, z, tileType);
	}
	private Game game;
}
