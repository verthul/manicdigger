// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class ModCameraKeys extends ClientMod
{

	@Override
	public void onNewFrameFixed(Game game, NewFrameEventArgs args)
	{
		float one = 1;
		float dt = args.getDt();
		if (game.guistate == GuiState.MAP_LOADING) {
			return;
		}
		boolean angleup = false;
		boolean angledown = false;
		float overheadcameraanglemovearea = one * 5 / 100;
		float overheadcameraspeed = 3;
		game.controls.wantsjump = game.guistate == GuiState.NORMAL && game.guiTyping == TypingState.NONE && game.keyboardState[game.getKey(51)];
		game.controls.wantsjumphalf = false;
		game.controls.shiftkeydown = game.guistate == GuiState.NORMAL && game.guiTyping == TypingState.NONE && game.keyboardState[game.getKey(1)];
		game.controls.movedx = 0;
		game.controls.movedy = 0;
		game.controls.moveup = false;
		game.controls.movedown = false;
		if (game.guistate == GuiState.NORMAL) {
			if (game.guiTyping == TypingState.NONE) {
				if (game.reachedwall_1blockhigh && (game.autoJumpEnabled || !game.platform.isMousePointerLocked())) {
					game.controls.wantsjump = true;
				}
				if (game.reachedHalfBlock) {
					game.controls.wantsjumphalf = true;
				}
				if (game.overheadcamera) {
					CameraMove m = new CameraMove();
					if (game.keyboardState[game.getKey(83)]) {
						game.overheadcameraK.turnRight(dt * overheadcameraspeed);
					}
					if (game.keyboardState[game.getKey(86)]) {
						game.overheadcameraK.turnLeft(dt * overheadcameraspeed);
					}
					if (game.keyboardState[game.getKey(105)]) {
						angleup = true;
					}
					if (game.keyboardState[game.getKey(101)]) {
						angledown = true;
					}
					game.overheadcameraK.center.x = game.player.position.x;
					game.overheadcameraK.center.y = game.player.position.y;
					game.overheadcameraK.center.z = game.player.position.z;
					m.distance = game.overheadcameradistance;
					m.angleUp = angleup;
					m.angleDown = angledown;
					game.overheadcameraK.move(m, dt);
					float toDest = game.dist(game.player.position.x, game.player.position.y, game.player.position.z, game.playerdestination.x + one / 2, game.playerdestination.y - one / 2, game.playerdestination.z + one / 2);
					if (toDest >= 1) {
						game.controls.movedy += 1;
						if (game.reachedwall) {
							game.controls.wantsjump = true;
						}
						float qX = game.playerdestination.x - game.player.position.x;
						float qY = game.playerdestination.y - game.player.position.y;
						float qZ = game.playerdestination.z - game.player.position.z;
						float angle = game.vectorAngleGet(qX, qY, qZ);
						game.player.position.roty = Game.getPi() / 2 + angle;
						game.player.position.rotx = Game.getPi();
					}
				}
				else if (game.enable_move) {
					if (game.keyboardState[game.getKey(105)]) {
						game.controls.movedy += 1;
					}
					if (game.keyboardState[game.getKey(101)]) {
						game.controls.movedy += -1;
					}
					if (game.keyboardState[game.getKey(83)]) {
						game.controls.movedx += -1;
						game.localplayeranimationhint.leanleft = true;
						game.localstance = 1;
					}
					else {
						game.localplayeranimationhint.leanleft = false;
					}
					if (game.keyboardState[game.getKey(86)]) {
						game.controls.movedx += 1;
						game.localplayeranimationhint.leanright = true;
						game.localstance = 2;
					}
					else {
						game.localplayeranimationhint.leanright = false;
					}
					if (!game.localplayeranimationhint.leanleft && !game.localplayeranimationhint.leanright) {
						game.localstance = 0;
					}
					game.controls.movedx += game.touchMoveDx;
					game.controls.movedy += game.touchMoveDy;
				}
			}
			if (game.controls.getFreemove() != 0 || game.swimmingEyes()) {
				if (game.guiTyping == TypingState.NONE && game.keyboardState[game.getKey(51)]) {
					game.controls.moveup = true;
				}
				if (game.guiTyping == TypingState.NONE && game.keyboardState[game.getKey(3)]) {
					game.controls.movedown = true;
				}
			}
		}
	}
}
