// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public abstract class IMapStorage2
{

	public abstract int getBlock(int x, int y, int z);

	public abstract int getMapSizeX();

	public abstract int getMapSizeY();

	public abstract int getMapSizeZ();

	public abstract void setBlock(int x, int y, int z, int tileType);
}
