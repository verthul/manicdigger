// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class TerrainRendererCommit extends Action_
{

	public static TerrainRendererCommit create(ModDrawTerrain renderer)
	{
		TerrainRendererCommit c = new TerrainRendererCommit();
		c.renderer = renderer;
		return c;
	}

	@Override
	public void run()
	{
		this.renderer.mainThreadCommit();
	}
	private ModDrawTerrain renderer;
}
