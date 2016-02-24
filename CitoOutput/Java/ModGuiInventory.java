// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class ModGuiInventory extends ClientMod
{
	public ModGuiInventory()
	{
		this.wearPlaceStart = new PointRef[5];
		{
			this.wearPlaceStart[0] = PointRef.create(34, 100);
			this.wearPlaceStart[1] = PointRef.create(74, 100);
			this.wearPlaceStart[2] = PointRef.create(194, 100);
			this.wearPlaceStart[3] = PointRef.create(114, 100);
			this.wearPlaceStart[4] = PointRef.create(154, 100);
		}
		this.wearPlaceCells = new PointRef[5];
		{
			this.wearPlaceCells[0] = PointRef.create(1, 1);
			this.wearPlaceCells[1] = PointRef.create(1, 1);
			this.wearPlaceCells[2] = PointRef.create(1, 1);
			this.wearPlaceCells[3] = PointRef.create(1, 1);
			this.wearPlaceCells[4] = PointRef.create(1, 1);
		}
		this.cellCountInPageX = 12;
		this.cellCountInPageY = 7;
		this.cellCountTotalX = 12;
		this.cellCountTotalY = 42;
		this.cellDrawSize = 40;
	}

	public final int activeMaterialCellSize()
	{
		return this.game.platform.floatToInt(48 * this.game.scale());
	}
	private int cellCountInPageX;
	private int cellCountInPageY;
	private int cellCountTotalX;
	private int cellCountTotalY;
	int cellDrawSize;

	public final int cellsStartX()
	{
		return 33 + this.inventoryStartX();
	}

	public final int cellsStartY()
	{
		return 180 + this.inventoryStartY();
	}

	private void drawItem(int screenposX, int screenposY, Packet_Item item, int drawsizeX, int drawsizeY)
	{
		if (item == null) {
			return;
		}
		int sizex = this.dataItems.itemSizeX(item);
		int sizey = this.dataItems.itemSizeY(item);
		if (drawsizeX == 0 || drawsizeX == -1) {
			drawsizeX = this.cellDrawSize * sizex;
			drawsizeY = this.cellDrawSize * sizey;
		}
		if (item.itemClass == 0) {
			if (item.blockId == 0) {
				return;
			}
			this.game.draw2dTexture(this.game.terrainTexture, screenposX, screenposY, drawsizeX, drawsizeY, IntRef.create(this.dataItems.textureIdForInventory()[item.blockId]), this.game.texturesPacked(), Game.colorFromArgb(255, 255, 255, 255), false);
			if (item.blockCount > 1) {
				FontCi font = new FontCi();
				font.size = 8;
				font.family = "Arial";
				this.game.draw2dText(this.game.platform.intToString(item.blockCount), font, screenposX, screenposY, null, false);
			}
		}
		else {
			this.game.draw2dBitmapFile(this.dataItems.itemGraphics(item), screenposX, screenposY, drawsizeX, drawsizeY);
		}
	}

	public final void drawItemInfo(int screenposX, int screenposY, Packet_Item item)
	{
		int sizex = this.dataItems.itemSizeX(item);
		int sizey = this.dataItems.itemSizeY(item);
		IntRef tw = new IntRef();
		IntRef th = new IntRef();
		float one = 1;
		this.game.platform.textSize(this.dataItems.itemInfo(item), 11 + one / 2, tw, th);
		tw.value += 6;
		th.value += 4;
		int w = this.game.platform.floatToInt(tw.value + this.cellDrawSize * sizex);
		int h = this.game.platform.floatToInt(th.value < this.cellDrawSize * sizey ? this.cellDrawSize * sizey + 4 : th.value);
		if (screenposX < w + 20) {
			screenposX = w + 20;
		}
		if (screenposY < h + 20) {
			screenposY = h + 20;
		}
		if (screenposX > this.game.width() - (w + 20)) {
			screenposX = this.game.width() - (w + 20);
		}
		if (screenposY > this.game.height() - (h + 20)) {
			screenposY = this.game.height() - (h + 20);
		}
		this.game.draw2dTexture(this.game.whiteTexture(), screenposX - w, screenposY - h, w, h, null, 0, Game.colorFromArgb(255, 0, 0, 0), false);
		this.game.draw2dTexture(this.game.whiteTexture(), screenposX - w + 2, screenposY - h + 2, w - 4, h - 4, null, 0, Game.colorFromArgb(255, 105, 105, 105), false);
		FontCi font = new FontCi();
		font.family = "Arial";
		font.size = 10;
		this.game.draw2dText(this.dataItems.itemInfo(item), font, screenposX - tw.value + 4, screenposY - h + 2, null, false);
		Packet_Item item2 = new Packet_Item();
		item2.blockId = item.blockId;
		this.drawItem(screenposX - w + 2, screenposY - h + 2, item2, 0, 0);
	}

	public final void drawMaterialSelector()
	{
		this.game.draw2dBitmapFile("materials.png", this.materialSelectorBackgroundStartX(), this.materialSelectorBackgroundStartY(), this.game.platform.floatToInt(1024 * this.game.scale()), this.game.platform.floatToInt(128 * this.game.scale()));
		int materialSelectorStartX_ = this.materialSelectorStartX();
		int materialSelectorStartY_ = this.materialSelectorStartY();
		for (int i = 0; i < 10; i++) {
			Packet_Item item = this.game.d_Inventory.rightHand[i];
			if (item != null) {
				this.drawItem(materialSelectorStartX_ + i * this.activeMaterialCellSize(), materialSelectorStartY_, item, this.activeMaterialCellSize(), this.activeMaterialCellSize());
			}
		}
		this.game.draw2dBitmapFile("activematerial.png", this.materialSelectorStartX() + this.activeMaterialCellSize() * this.game.activeMaterial, this.materialSelectorStartY(), this.activeMaterialCellSize() * 64 / 48, this.activeMaterialCellSize() * 64 / 48);
	}

	private Packet_Item getItem(Packet_Inventory inventory, int x, int y)
	{
		for (int i = 0; i < inventory.itemsCount; i++) {
			if (inventory.items[i].x == x && inventory.items[i].y == y) {
				return inventory.items[i].value_;
			}
		}
		return null;
	}

	public final int inventoryStartX()
	{
		return this.game.width() / 2 - 280;
	}

	public final int inventoryStartY()
	{
		return this.game.height() / 2 - 300;
	}

	public final boolean isMouseOverCells()
	{
		return this.selectedCellOrScrollbar(this.game.mouseCurrentX, this.game.mouseCurrentY);
	}

	private int materialSelectorBackgroundStartX()
	{
		return this.game.platform.floatToInt(this.game.width() / 2 - 256 * this.game.scale());
	}

	private int materialSelectorBackgroundStartY()
	{
		return this.game.platform.floatToInt(this.game.height() - 90 * this.game.scale());
	}

	private int materialSelectorStartX()
	{
		return this.game.platform.floatToInt(this.materialSelectorBackgroundStartX() + 17 * this.game.scale());
	}

	private int materialSelectorStartY()
	{
		return this.game.platform.floatToInt(this.materialSelectorBackgroundStartY() + 17 * this.game.scale());
	}

	@Override
	public void onKeyPress(Game game_, KeyPressEventArgs args)
	{
		if (this.game.guistate != GuiState.INVENTORY) {
			return;
		}
		int keyChar = args.getKeyChar();
		if (keyChar == 49) {
			this.game.activeMaterial = 0;
		}
		if (keyChar == 50) {
			this.game.activeMaterial = 1;
		}
		if (keyChar == 51) {
			this.game.activeMaterial = 2;
		}
		if (keyChar == 52) {
			this.game.activeMaterial = 3;
		}
		if (keyChar == 53) {
			this.game.activeMaterial = 4;
		}
		if (keyChar == 54) {
			this.game.activeMaterial = 5;
		}
		if (keyChar == 55) {
			this.game.activeMaterial = 6;
		}
		if (keyChar == 56) {
			this.game.activeMaterial = 7;
		}
		if (keyChar == 57) {
			this.game.activeMaterial = 8;
		}
		if (keyChar == 48) {
			this.game.activeMaterial = 9;
		}
	}

	@Override
	public void onMouseDown(Game game_, MouseEventArgs args)
	{
		if (this.game.guistate != GuiState.INVENTORY) {
			return;
		}
		PointRef scaledMouse = PointRef.create(args.getX(), args.getY());
		if (this.selectedMaterialSelectorSlot(scaledMouse) != null) {
			this.game.activeMaterial = this.selectedMaterialSelectorSlot(scaledMouse).value;
			{
				Packet_InventoryPosition p = new Packet_InventoryPosition();
				p.type = 2;
				p.materialId = this.game.activeMaterial;
				this.controller.inventoryClick(p);
			}
			args.setHandled(true);
			return;
		}
		if (this.game.guistate != GuiState.INVENTORY) {
			return;
		}
		PointRef cellInPage = this.selectedCell(scaledMouse);
		if (cellInPage != null) {
			if (args.getButton() == 0) {
				Packet_InventoryPosition p = new Packet_InventoryPosition();
				p.type = 0;
				p.areaX = cellInPage.x;
				p.areaY = cellInPage.y + this.scrollLine;
				this.controller.inventoryClick(p);
				args.setHandled(true);
				return;
			}
			else {
				{
					Packet_InventoryPosition p = new Packet_InventoryPosition();
					p.type = 0;
					p.areaX = cellInPage.x;
					p.areaY = cellInPage.y + this.scrollLine;
					this.controller.inventoryClick(p);
				}
				{
					Packet_InventoryPosition p = new Packet_InventoryPosition();
					p.type = 3;
					p.wearPlace = 0;
					p.activeMaterial = this.game.activeMaterial;
					this.controller.inventoryClick(p);
				}
				{
					Packet_InventoryPosition p = new Packet_InventoryPosition();
					p.type = 0;
					p.areaX = cellInPage.x;
					p.areaY = cellInPage.y + this.scrollLine;
					this.controller.inventoryClick(p);
				}
			}
			if (this.game.guistate == GuiState.INVENTORY) {
				args.setHandled(true);
				return;
			}
		}
		if (this.selectedWearPlace(scaledMouse) != null) {
			Packet_InventoryPosition p = new Packet_InventoryPosition();
			p.type = 3;
			p.wearPlace = this.selectedWearPlace(scaledMouse).value;
			p.activeMaterial = this.game.activeMaterial;
			this.controller.inventoryClick(p);
			args.setHandled(true);
			return;
		}
		if (scaledMouse.x >= this.scrollUpButtonX() && scaledMouse.x < this.scrollUpButtonX() + this.scrollButtonSize() && scaledMouse.y >= this.scrollUpButtonY() && scaledMouse.y < this.scrollUpButtonY() + this.scrollButtonSize()) {
			this.scrollUp();
			this.scrollingUpTimeMilliseconds = this.game.platform.timeMillisecondsFromStart();
			args.setHandled(true);
			return;
		}
		if (scaledMouse.x >= this.scrollDownButtonX() && scaledMouse.x < this.scrollDownButtonX() + this.scrollButtonSize() && scaledMouse.y >= this.scrollDownButtonY() && scaledMouse.y < this.scrollDownButtonY() + this.scrollButtonSize()) {
			this.scrollDown();
			this.scrollingDownTimeMilliseconds = this.game.platform.timeMillisecondsFromStart();
			args.setHandled(true);
			return;
		}
		this.game.guiStateBackToGame();
		return;
	}

	@Override
	public void onMouseUp(Game game_, MouseEventArgs args)
	{
		if (this.game.guistate != GuiState.INVENTORY) {
			return;
		}
		this.scrollingUpTimeMilliseconds = 0;
		this.scrollingDownTimeMilliseconds = 0;
	}

	@Override
	public void onMouseWheelChanged(Game game_, MouseWheelEventArgs args)
	{
		float delta = args.getDeltaPrecise();
		if ((game_.guistate == GuiState.NORMAL || game_.guistate == GuiState.INVENTORY && !this.isMouseOverCells()) && !game_.keyboardState[game_.getKey(1)]) {
			game_.activeMaterial -= game_.platform.floatToInt(delta);
			game_.activeMaterial = game_.activeMaterial % 10;
			while (game_.activeMaterial < 0) {
				game_.activeMaterial += 10;
			}
		}
		if (this.isMouseOverCells() && this.game.guistate == GuiState.INVENTORY) {
			if (delta > 0) {
				this.scrollUp();
			}
			if (delta < 0) {
				this.scrollDown();
			}
		}
	}

	@Override
	public void onNewFrameDraw2d(Game game_, float deltaTime)
	{
		this.game = game_;
		if (this.dataItems == null) {
			this.dataItems = new GameDataItemsClient();
			this.dataItems.game = game_;
			this.controller = ClientInventoryController.create(game_);
			this.inventoryUtil = this.game.d_InventoryUtil;
		}
		if (this.game.guistate == GuiState.MAP_LOADING) {
			return;
		}
		this.drawMaterialSelector();
		if (this.game.guistate != GuiState.INVENTORY) {
			return;
		}
		if (this.scrollingUpTimeMilliseconds != 0 && this.game.platform.timeMillisecondsFromStart() - this.scrollingUpTimeMilliseconds > 250) {
			this.scrollingUpTimeMilliseconds = this.game.platform.timeMillisecondsFromStart();
			this.scrollUp();
		}
		if (this.scrollingDownTimeMilliseconds != 0 && this.game.platform.timeMillisecondsFromStart() - this.scrollingDownTimeMilliseconds > 250) {
			this.scrollingDownTimeMilliseconds = this.game.platform.timeMillisecondsFromStart();
			this.scrollDown();
		}
		PointRef scaledMouse = PointRef.create(this.game.mouseCurrentX, this.game.mouseCurrentY);
		this.game.draw2dBitmapFile("inventory.png", this.inventoryStartX(), this.inventoryStartY(), 1024, 1024);
		for (int i = 0; i < this.game.d_Inventory.itemsCount; i++) {
			Packet_PositionItem k = this.game.d_Inventory.items[i];
			if (k == null) {
				continue;
			}
			int screeny = k.y - this.scrollLine;
			if (screeny >= 0 && screeny < this.cellCountInPageY) {
				this.drawItem(this.cellsStartX() + k.x * this.cellDrawSize, this.cellsStartY() + screeny * this.cellDrawSize, k.value_, 0, 0);
			}
		}
		if (this.game.d_Inventory.dragDropItem != null) {
			PointRef selectedInPage = this.selectedCell(scaledMouse);
			if (selectedInPage != null) {
				int x = selectedInPage.x * this.cellDrawSize + this.cellsStartX();
				int y = selectedInPage.y * this.cellDrawSize + this.cellsStartY();
				int sizex = this.dataItems.itemSizeX(this.game.d_Inventory.dragDropItem);
				int sizey = this.dataItems.itemSizeY(this.game.d_Inventory.dragDropItem);
				if (selectedInPage.x + sizex <= this.cellCountInPageX && selectedInPage.y + sizey <= this.cellCountInPageY) {
					int c;
					IntRef itemsAtAreaCount = new IntRef();
					PointRef[] itemsAtArea = this.inventoryUtil.itemsAtArea(selectedInPage.x, selectedInPage.y + this.scrollLine, sizex, sizey, itemsAtAreaCount);
					if (itemsAtArea == null || itemsAtAreaCount.value > 1) {
						c = Game.colorFromArgb(100, 255, 0, 0);
					}
					else {
						c = Game.colorFromArgb(100, 0, 255, 0);
					}
					this.game.draw2dTexture(this.game.whiteTexture(), x, y, this.cellDrawSize * sizex, this.cellDrawSize * sizey, null, 0, c, false);
				}
			}
			IntRef selectedWear = this.selectedWearPlace(scaledMouse);
			if (selectedWear != null) {
				PointRef p = PointRef.create(this.wearPlaceStart[selectedWear.value].x + this.inventoryStartX(), this.wearPlaceStart[selectedWear.value].y + this.inventoryStartY());
				PointRef size = this.wearPlaceCells[selectedWear.value];
				int c;
				Packet_Item itemsAtArea = this.inventoryUtil.itemAtWearPlace(selectedWear.value, this.game.activeMaterial);
				if (!this.dataItems.canWear(selectedWear.value, this.game.d_Inventory.dragDropItem)) {
					c = Game.colorFromArgb(100, 255, 0, 0);
				}
				else {
					c = Game.colorFromArgb(100, 0, 255, 0);
				}
				this.game.draw2dTexture(this.game.whiteTexture(), p.x, p.y, this.cellDrawSize * size.x, this.cellDrawSize * size.y, null, 0, c, false);
			}
		}
		this.drawMaterialSelector();
		this.drawItem(this.wearPlaceStart[0].x + this.inventoryStartX(), this.wearPlaceStart[0].y + this.inventoryStartY(), this.game.d_Inventory.rightHand[this.game.activeMaterial], 0, 0);
		this.drawItem(this.wearPlaceStart[1].x + this.inventoryStartX(), this.wearPlaceStart[1].y + this.inventoryStartY(), this.game.d_Inventory.mainArmor, 0, 0);
		this.drawItem(this.wearPlaceStart[2].x + this.inventoryStartX(), this.wearPlaceStart[2].y + this.inventoryStartY(), this.game.d_Inventory.boots, 0, 0);
		this.drawItem(this.wearPlaceStart[3].x + this.inventoryStartX(), this.wearPlaceStart[3].y + this.inventoryStartY(), this.game.d_Inventory.helmet, 0, 0);
		this.drawItem(this.wearPlaceStart[4].x + this.inventoryStartX(), this.wearPlaceStart[4].y + this.inventoryStartY(), this.game.d_Inventory.gauntlet, 0, 0);
		if (this.selectedCell(scaledMouse) != null) {
			PointRef selected = this.selectedCell(scaledMouse);
			selected.y += this.scrollLine;
			PointRef itemAtCell = this.inventoryUtil.itemAtCell(selected);
			if (itemAtCell != null) {
				Packet_Item item = this.getItem(this.game.d_Inventory, itemAtCell.x, itemAtCell.y);
				if (item != null) {
					int x = selected.x * this.cellDrawSize + this.cellsStartX();
					int y = selected.y * this.cellDrawSize + this.cellsStartY();
					this.drawItemInfo(scaledMouse.x, scaledMouse.y, item);
				}
			}
		}
		if (this.selectedWearPlace(scaledMouse) != null) {
			int selected = this.selectedWearPlace(scaledMouse).value;
			Packet_Item itemAtWearPlace = this.inventoryUtil.itemAtWearPlace(selected, this.game.activeMaterial);
			if (itemAtWearPlace != null) {
				this.drawItemInfo(scaledMouse.x, scaledMouse.y, itemAtWearPlace);
			}
		}
		if (this.selectedMaterialSelectorSlot(scaledMouse) != null) {
			int selected = this.selectedMaterialSelectorSlot(scaledMouse).value;
			Packet_Item item = this.game.d_Inventory.rightHand[selected];
			if (item != null) {
				this.drawItemInfo(scaledMouse.x, scaledMouse.y, item);
			}
		}
		if (this.game.d_Inventory.dragDropItem != null) {
			this.drawItem(scaledMouse.x, scaledMouse.y, this.game.d_Inventory.dragDropItem, 0, 0);
		}
	}

	@Override
	public void onTouchStart(Game game_, TouchEventArgs e)
	{
		MouseEventArgs args = new MouseEventArgs();
		args.setX(e.getX());
		args.setY(e.getY());
		this.onMouseDown(game_, args);
		e.setHandled(args.getHandled());
	}

	private int scrollButtonSize()
	{
		return this.cellDrawSize;
	}

	public final void scrollDown()
	{
		this.scrollLine++;
		int max = this.cellCountTotalY - this.cellCountInPageY;
		if (this.scrollLine >= max) {
			this.scrollLine = max;
		}
	}

	private int scrollDownButtonX()
	{
		return this.cellsStartX() + this.cellCountInPageX * this.cellDrawSize;
	}

	private int scrollDownButtonY()
	{
		return this.cellsStartY() + (this.cellCountInPageY - 1) * this.cellDrawSize;
	}
	int scrollLine;

	public final void scrollUp()
	{
		this.scrollLine--;
		if (this.scrollLine < 0) {
			this.scrollLine = 0;
		}
	}

	private int scrollUpButtonX()
	{
		return this.cellsStartX() + this.cellCountInPageX * this.cellDrawSize;
	}

	private int scrollUpButtonY()
	{
		return this.cellsStartY();
	}
	private int scrollingDownTimeMilliseconds;
	private int scrollingUpTimeMilliseconds;

	private PointRef selectedCell(PointRef scaledMouse)
	{
		if (scaledMouse.x < this.cellsStartX() || scaledMouse.y < this.cellsStartY() || scaledMouse.x > this.cellsStartX() + this.cellCountInPageX * this.cellDrawSize || scaledMouse.y > this.cellsStartY() + this.cellCountInPageY * this.cellDrawSize) {
			return null;
		}
		PointRef cell = PointRef.create((scaledMouse.x - this.cellsStartX()) / this.cellDrawSize, (scaledMouse.y - this.cellsStartY()) / this.cellDrawSize);
		return cell;
	}

	private boolean selectedCellOrScrollbar(int scaledMouseX, int scaledMouseY)
	{
		if (scaledMouseX < this.cellsStartX() || scaledMouseY < this.cellsStartY() || scaledMouseX > this.cellsStartX() + (this.cellCountInPageX + 1) * this.cellDrawSize || scaledMouseY > this.cellsStartY() + this.cellCountInPageY * this.cellDrawSize) {
			return false;
		}
		return true;
	}

	private IntRef selectedMaterialSelectorSlot(PointRef scaledMouse)
	{
		if (scaledMouse.x >= this.materialSelectorStartX() && scaledMouse.y >= this.materialSelectorStartY() && scaledMouse.x < this.materialSelectorStartX() + 10 * this.activeMaterialCellSize() && scaledMouse.y < this.materialSelectorStartY() + 10 * this.activeMaterialCellSize()) {
			return IntRef.create((scaledMouse.x - this.materialSelectorStartX()) / this.activeMaterialCellSize());
		}
		return null;
	}

	private IntRef selectedWearPlace(PointRef scaledMouse)
	{
		for (int i = 0; i < 5; i++) {
			PointRef p = this.wearPlaceStart[i];
			p.x += this.inventoryStartX();
			p.y += this.inventoryStartY();
			PointRef cells = this.wearPlaceCells[i];
			if (scaledMouse.x >= p.x && scaledMouse.y >= p.y && scaledMouse.x < p.x + cells.x * this.cellDrawSize && scaledMouse.y < p.y + cells.y * this.cellDrawSize) {
				return IntRef.create(i);
			}
		}
		return null;
	}
	IInventoryController controller;
	GameDataItemsClient dataItems;
	Game game;
	InventoryUtilClient inventoryUtil;
	private PointRef[] wearPlaceCells;
	private PointRef[] wearPlaceStart;
}
