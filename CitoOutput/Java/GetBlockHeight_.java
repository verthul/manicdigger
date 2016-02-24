// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class GetBlockHeight_ extends DelegateGetBlockHeight
{

	public static GetBlockHeight_ create(Game w_)
	{
		GetBlockHeight_ g = new GetBlockHeight_();
		g.w = w_;
		return g;
	}

	@Override
	public float getBlockHeight(int x, int y, int z)
	{
		return this.w.getblockheight(x, y, z);
	}
	Game w;
}
