// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class PredicateBox3DHit extends PredicateBox3D
{

	public static PredicateBox3DHit create(BlockOctreeSearcher s_)
	{
		PredicateBox3DHit p = new PredicateBox3DHit();
		p.s = s_;
		return p;
	}

	@Override
	public boolean hit(Box3D o)
	{
		return this.s.boxHit(o);
	}
	private BlockOctreeSearcher s;
}
