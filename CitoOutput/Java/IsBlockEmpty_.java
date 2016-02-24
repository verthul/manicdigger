// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class IsBlockEmpty_ extends DelegateIsBlockEmpty
{

	public static IsBlockEmpty_ create(Game w_)
	{
		IsBlockEmpty_ g = new IsBlockEmpty_();
		g.w = w_;
		return g;
	}

	@Override
	public boolean isBlockEmpty(int x, int y, int z)
	{
		return this.w.isTileEmptyForPhysics(x, y, z);
	}
	private Game w;
}
