// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class ModGuiPlayerStats extends ClientMod
{

	public final void drawPlayerHealth(Game game)
	{
		if (game.playerStats != null) {
			float progress = game.one * game.playerStats.currentHealth / game.playerStats.maxHealth;
			game.draw2dTexture(game.getTexture("ui_bar_background.png"), this.healthPosX, this.healthPosY, 220, 32, null, 0, Game.colorFromArgb(255, 255, 255, 255), false);
			game.draw2dTexturePart(game.getTexture("ui_bar_inner.png"), progress, 1, this.healthPosX, this.healthPosY, progress * 220, 32, Game.colorFromArgb(255, 255, 0, 0), false);
		}
	}

	public final void drawPlayerOxygen(Game game)
	{
		if (game.playerStats != null) {
			if (game.playerStats.currentOxygen < game.playerStats.maxOxygen) {
				float progress = game.one * game.playerStats.currentOxygen / game.playerStats.maxOxygen;
				game.draw2dTexture(game.getTexture("ui_bar_background.png"), this.oxygenPosX, this.oxygenPosY, 220, 32, null, 0, Game.colorFromArgb(255, 255, 255, 255), false);
				game.draw2dTexturePart(game.getTexture("ui_bar_inner.png"), progress, 1, this.oxygenPosX, this.oxygenPosY, progress * 220, 32, Game.colorFromArgb(255, 0, 0, 255), false);
			}
		}
	}

	@Override
	public void onNewFrameDraw2d(Game game, float deltaTime)
	{
		this.healthPosX = game.width() / 2 - 220 - 20;
		this.healthPosY = game.height() - 122;
		this.oxygenPosX = game.width() / 2 + 20;
		this.oxygenPosY = game.height() - 122;
		if (game.guistate != GuiState.MAP_LOADING) {
			this.drawPlayerHealth(game);
			this.drawPlayerOxygen(game);
		}
	}
	private int healthPosX;
	private int healthPosY;
	private int oxygenPosX;
	private int oxygenPosY;
}
