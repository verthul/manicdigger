// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class ModDraw2dMisc extends ClientMod
{

	final void drawAim(Game game)
	{
		if (game.cameratype == CameraType.OVERHEAD) {
			return;
		}
		int aimwidth = 32;
		int aimheight = 32;
		game.platform.bindTexture2d(0);
		if (game.currentAimRadius() > 1) {
			float fov_ = game.currentfov();
			game.circle3i(game.width() / 2, game.height() / 2, game.currentAimRadius() * game.fov / fov_);
		}
		game.draw2dBitmapFile("target.png", game.width() / 2 - aimwidth / 2, game.height() / 2 - aimheight / 2, aimwidth, aimheight);
	}

	final void drawAmmo(Game game)
	{
		Packet_Item item = game.d_Inventory.rightHand[game.activeMaterial];
		if (item != null && item.itemClass == 0) {
			if (game.blocktypes[item.blockId].isPistol) {
				int loaded = game.loadedAmmo[item.blockId];
				int total = game.totalAmmo[item.blockId];
				String s = game.platform.stringFormat2("{0}/{1}", game.platform.intToString(loaded), game.platform.intToString(total - loaded));
				FontCi font = new FontCi();
				font.family = "Arial";
				font.size = 18;
				game.draw2dText(s, font, game.width() - game.textSizeWidth(s, 18) - 50, game.height() - game.textSizeHeight(s, 18) - 50, loaded == 0 ? IntRef.create(Game.colorFromArgb(255, 255, 0, 0)) : IntRef.create(Game.colorFromArgb(255, 255, 255, 255)), false);
				if (loaded == 0) {
					font.size = 14;
					String pressR = "Press R to reload";
					game.draw2dText(pressR, font, game.width() - game.textSizeWidth(pressR, 14) - 50, game.height() - game.textSizeHeight(s, 14) - 80, IntRef.create(Game.colorFromArgb(255, 255, 0, 0)), false);
				}
			}
		}
	}

	public final void drawBlockInfo(Game game)
	{
		if (!game.drawblockinfo) {
			return;
		}
		int x = game.selectedBlockPositionX;
		int y = game.selectedBlockPositionZ;
		int z = game.selectedBlockPositionY;
		if (!game.map.isValidPos(x, y, z)) {
			return;
		}
		int blocktype = game.map.getBlock(x, y, z);
		if (!game.isValid(blocktype)) {
			return;
		}
		game.currentAttackedBlock = Vector3IntRef.create(x, y, z);
		this.drawEnemyHealthBlock(game);
	}

	private void drawDisconnected(Game game)
	{
		float one = 1;
		float lagSeconds = one * (game.platform.timeMillisecondsFromStart() - game.lastReceivedMilliseconds) / 1000;
		if (lagSeconds >= 10 && lagSeconds < 86400 && game.invalidVersionDrawMessage == null && !(game.issingleplayer && !game.platform.singlePlayerServerLoaded())) {
			game.draw2dBitmapFile("disconnected.png", game.width() - 100, 50, 50, 50);
			FontCi font = new FontCi();
			font.family = "Arial";
			font.size = 12;
			game.draw2dText(game.platform.intToString(game.platform.floatToInt(lagSeconds)), font, game.width() - 100, 110, null, false);
			game.draw2dText("Press F6 to reconnect", font, game.width() / 2 - 100, 50, null, false);
		}
	}

	final void drawEnemyHealthBlock(Game game)
	{
		if (game.currentAttackedBlock != null) {
			int x = game.currentAttackedBlock.x;
			int y = game.currentAttackedBlock.y;
			int z = game.currentAttackedBlock.z;
			int blocktype = game.map.getBlock(x, y, z);
			float health = game.getCurrentBlockHealth(x, y, z);
			float progress = health / game.d_Data.strength()[blocktype];
			if (game.isUsableBlock(blocktype)) {
				this.drawEnemyHealthUseInfo(game, game.language.get(StringTools.stringAppend(game.platform, "Block_", game.blocktypes[blocktype].name)), progress, true);
			}
			this.drawEnemyHealthCommon(game, game.language.get(StringTools.stringAppend(game.platform, "Block_", game.blocktypes[blocktype].name)), progress);
		}
		if (game.currentlyAttackedEntity != -1) {
			Entity e = game.entities[game.currentlyAttackedEntity];
			if (e == null) {
				return;
			}
			float health;
			if (e.playerStats != null) {
				health = game.one * e.playerStats.currentHealth / e.playerStats.maxHealth;
			}
			else {
				health = 1;
			}
			String name = "Unknown";
			if (e.drawName != null) {
				name = e.drawName.name;
			}
			if (e.usable) {
				this.drawEnemyHealthUseInfo(game, game.language.get(name), health, true);
			}
			this.drawEnemyHealthCommon(game, game.language.get(name), health);
		}
	}

	final void drawEnemyHealthCommon(Game game, String name, float progress)
	{
		this.drawEnemyHealthUseInfo(game, name, 1, false);
	}

	final void drawEnemyHealthUseInfo(Game game, String name, float progress, boolean useInfo)
	{
		int y = useInfo ? 55 : 35;
		game.draw2dTexture(game.whiteTexture(), game.xcenter(300), 40, 300, y, null, 0, Game.colorFromArgb(255, 0, 0, 0), false);
		game.draw2dTexture(game.whiteTexture(), game.xcenter(300), 40, 300 * progress, y, null, 0, Game.colorFromArgb(255, 255, 0, 0), false);
		FontCi font = new FontCi();
		font.family = "Arial";
		font.size = 14;
		IntRef w = new IntRef();
		IntRef h = new IntRef();
		game.platform.textSize(name, 14, w, h);
		game.draw2dText(name, font, game.xcenter(w.value), 40, null, false);
		if (useInfo) {
			name = game.platform.stringFormat(game.language.pressToUse(), "E");
			game.platform.textSize(name, 10, w, h);
			FontCi font2 = new FontCi();
			font2.family = "Arial";
			font2.size = 10;
			game.draw2dText(name, font2, game.xcenter(w.value), 70, null, false);
		}
	}

	private void drawLocalPosition(Game game)
	{
		float one = 1;
		if (game.eNABLE_DRAWPOSITION) {
			float heading = one * game.headingByte(game.player.position.rotx, game.player.position.roty, game.player.position.rotz);
			float pitch = one * game.pitchByte(game.player.position.rotx, game.player.position.roty, game.player.position.rotz);
			String postext = game.platform.stringFormat("X: {0}", game.platform.intToString(game.mathFloor(game.player.position.x)));
			postext = StringTools.stringAppend(game.platform, postext, ",\tY: ");
			postext = StringTools.stringAppend(game.platform, postext, game.platform.intToString(game.mathFloor(game.player.position.z)));
			postext = StringTools.stringAppend(game.platform, postext, ",\tZ: ");
			postext = StringTools.stringAppend(game.platform, postext, game.platform.intToString(game.mathFloor(game.player.position.y)));
			postext = StringTools.stringAppend(game.platform, postext, "\nHeading: ");
			postext = StringTools.stringAppend(game.platform, postext, game.platform.intToString(game.mathFloor(heading)));
			postext = StringTools.stringAppend(game.platform, postext, "\nPitch: ");
			postext = StringTools.stringAppend(game.platform, postext, game.platform.intToString(game.mathFloor(pitch)));
			FontCi font = new FontCi();
			font.family = "Arial";
			font.size = 11;
			game.draw2dText(postext, font, 100, 460, null, false);
		}
	}

	final void drawMouseCursor(Game game)
	{
		if (!game.getFreeMouse()) {
			return;
		}
		if (!game.platform.mouseCursorIsVisible()) {
			game.draw2dBitmapFile("mousecursor.png", game.mouseCurrentX, game.mouseCurrentY, 32, 32);
		}
	}

	@Override
	public void onNewFrameDraw2d(Game game, float deltaTime)
	{
		if (game.guistate == GuiState.NORMAL) {
			this.drawAim(game);
		}
		if (game.guistate != GuiState.MAP_LOADING) {
			this.drawEnemyHealthBlock(game);
			this.drawAmmo(game);
			this.drawLocalPosition(game);
			this.drawBlockInfo(game);
		}
		this.drawMouseCursor(game);
		this.drawDisconnected(game);
	}
}
