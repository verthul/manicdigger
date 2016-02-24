// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class ModDrawArea extends ClientMod
{

	@Override
	public void onHitEntity(Game game, OnUseEntityArgs e)
	{
		Entity entity = game.entities[e.entityId];
		if (entity == null) {
			return;
		}
		if (entity.drawArea == null) {
			return;
		}
		entity.drawArea.visible = !entity.drawArea.visible;
	}

	@Override
	public void onNewFrameDraw3d(Game game, float deltaTime)
	{
		if (game.eNABLE_DRAW2D) {
			for (int i = 0; i < game.entitiesCount; i++) {
				Entity e = game.entities[i];
				if (e == null) {
					continue;
				}
				if (e.drawArea == null) {
					continue;
				}
				if (!e.drawArea.visible) {
					continue;
				}
				int x = e.drawArea.x + e.drawArea.sizex / 2;
				int y = e.drawArea.y + e.drawArea.sizey / 2;
				int z = e.drawArea.z + e.drawArea.sizez / 2;
				float scalex = e.drawArea.sizex;
				float scaley = e.drawArea.sizey;
				float scalez = e.drawArea.sizez;
				this.lines.drawWireframeCube_(game, x, y, z, scalex, scaley, scalez);
			}
		}
	}

	@Override
	public void onNewFrameFixed(Game game, NewFrameEventArgs args)
	{
		this.lines = new DrawWireframeCube();
	}
	private DrawWireframeCube lines;
}
