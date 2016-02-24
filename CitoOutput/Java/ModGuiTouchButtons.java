// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class ModGuiTouchButtons extends GameScreen
{
	public ModGuiTouchButtons()
	{
		this.touchButtonsEnabled = false;
		this.buttonMenu = new MenuWidget();
		this.buttonMenu.image = "TouchMenu.png";
		this.buttonInventory = new MenuWidget();
		this.buttonInventory.image = "TouchInventory.png";
		this.buttonTalk = new MenuWidget();
		this.buttonTalk.image = "TouchTalk.png";
		this.buttonCamera = new MenuWidget();
		this.buttonCamera.image = "TouchCamera.png";
		this.widgets[0] = this.buttonMenu;
		this.widgets[1] = this.buttonInventory;
		this.widgets[2] = this.buttonTalk;
		this.widgets[3] = this.buttonCamera;
		this.touchIdMove = -1;
		this.touchIdRotate = -1;
	}

	@Override
	public void onButton(MenuWidget w)
	{
		if (w == this.buttonMenu) {
			this.game.showEscapeMenu();
		}
		if (w == this.buttonInventory) {
			this.game.showInventory();
		}
		if (w == this.buttonTalk) {
			if (this.game.guiTyping == TypingState.NONE) {
				this.game.startTyping();
				this.game.platform.showKeyboard(true);
			}
			else {
				this.game.stopTyping();
				this.game.platform.showKeyboard(false);
			}
		}
		if (w == this.buttonCamera) {
			this.game.cameraChange();
		}
	}

	@Override
	public void onNewFrameDraw2d(Game game_, float deltaTime)
	{
		if (!this.touchButtonsEnabled) {
			return;
		}
		this.game = game_;
		float dt = deltaTime;
		int buttonSize = 80;
		if (this.game.guistate != GuiState.NORMAL) {
			return;
		}
		this.buttonMenu.x = 16 * this.scale();
		this.buttonMenu.y = 16 * this.scale();
		this.buttonMenu.sizex = buttonSize * this.scale();
		this.buttonMenu.sizey = buttonSize * this.scale();
		this.buttonInventory.x = 16 * this.scale();
		this.buttonInventory.y = 112 * this.scale();
		this.buttonInventory.sizex = buttonSize * this.scale();
		this.buttonInventory.sizey = buttonSize * this.scale();
		this.buttonTalk.x = 16 * this.scale();
		this.buttonTalk.y = 208 * this.scale();
		this.buttonTalk.sizex = buttonSize * this.scale();
		this.buttonTalk.sizey = buttonSize * this.scale();
		this.buttonCamera.x = 16 * this.scale();
		this.buttonCamera.y = 304 * this.scale();
		this.buttonCamera.sizex = buttonSize * this.scale();
		this.buttonCamera.sizey = buttonSize * this.scale();
		if (!this.game.platform.isMousePointerLocked()) {
			if (this.game.cameratype == CameraType.FPP || this.game.cameratype == CameraType.TPP) {
				this.game.draw2dText1("Move", this.game.width() * 5 / 100, this.game.height() * 85 / 100, this.game.platform.floatToInt(this.scale() * 50), null, false);
				this.game.draw2dText1("Look", this.game.width() * 80 / 100, this.game.height() * 85 / 100, this.game.platform.floatToInt(this.scale() * 50), null, false);
			}
			this.drawWidgets();
		}
	}

	@Override
	public void onTouchEnd(Game game_, TouchEventArgs e)
	{
		this.screenOnTouchEnd(e);
		if (e.getHandled()) {
			return;
		}
		if (e.getId() == this.touchIdMove) {
			this.touchIdMove = -1;
			this.game.touchMoveDx = 0;
			this.game.touchMoveDy = 0;
		}
		if (e.getId() == this.touchIdRotate) {
			this.touchIdRotate = -1;
			this.game.touchOrientationDx = 0;
			this.game.touchOrientationDy = 0;
		}
	}

	@Override
	public void onTouchMove(Game game, TouchEventArgs e)
	{
		float one = 1;
		if (e.getId() == this.touchIdMove) {
			float range = game.width() * one / 20;
			game.touchMoveDx = e.getX() - this.touchMoveStartX;
			game.touchMoveDy = -(e.getY() - 1 - this.touchMoveStartY);
			float length = game.length(game.touchMoveDx, game.touchMoveDy, 0);
			if (e.getY() < game.height() * 50 / 100) {
				game.touchMoveDx = 0;
				game.touchMoveDy = 1;
			}
			else {
				if (length > 0) {
					game.touchMoveDx /= length;
					game.touchMoveDy /= length;
				}
			}
		}
		if (e.getId() == this.touchIdRotate) {
			game.touchOrientationDx += (e.getX() - this.touchRotateStartX) / (game.width() * one / 40);
			game.touchOrientationDy += (e.getY() - this.touchRotateStartY) / (game.width() * one / 40);
			this.touchRotateStartX = e.getX();
			this.touchRotateStartY = e.getY();
		}
	}

	@Override
	public void onTouchStart(Game game_, TouchEventArgs e)
	{
		this.touchButtonsEnabled = true;
		this.screenOnTouchStart(e);
		if (e.getHandled()) {
			return;
		}
		if (e.getX() <= this.game.width() / 2) {
			if (this.touchIdMove == -1) {
				this.touchIdMove = e.getId();
				this.touchMoveStartX = e.getX();
				this.touchMoveStartY = e.getY();
				this.game.touchMoveDx = 0;
				if (e.getY() < this.game.height() * 50 / 100) {
					this.game.touchMoveDy = 1;
				}
				else {
					this.game.touchMoveDy = 0;
				}
			}
		}
		if (this.touchIdMove != -1 && e.getId() != this.touchIdMove || e.getX() > this.game.width() / 2) {
			if (this.touchIdRotate == -1) {
				this.touchIdRotate = e.getId();
				this.touchRotateStartX = e.getX();
				this.touchRotateStartY = e.getY();
			}
		}
	}

	private float scale()
	{
		return this.game.scale();
	}
	private MenuWidget buttonCamera;
	private MenuWidget buttonInventory;
	private MenuWidget buttonMenu;
	private MenuWidget buttonTalk;
	private boolean touchButtonsEnabled;
	private int touchIdMove;
	private int touchIdRotate;
	private int touchMoveStartX;
	private int touchMoveStartY;
	private int touchRotateStartX;
	private int touchRotateStartY;
}
