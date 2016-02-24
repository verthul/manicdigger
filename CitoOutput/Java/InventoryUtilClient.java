// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class InventoryUtilClient
{
	public InventoryUtilClient()
	{
		this.cellCountX = 12;
		this.cellCountY = 42;
	}
	int cellCountX;
	int cellCountY;

	final IntRef freeHand(int ActiveMaterial_)
	{
		IntRef freehand = null;
		if (this.d_Inventory.rightHand[ActiveMaterial_] == null)
			return IntRef.create(ActiveMaterial_);
		for (int i = 0; i < 10; i++) {
			if (this.d_Inventory.rightHand[i] == null) {
				return freehand;
			}
		}
		return null;
	}

	public final boolean isValidCell(PointRef p)
	{
		return !(p.x < 0 || p.y < 0 || p.x >= this.cellCountX || p.y >= this.cellCountY);
	}

	final PointRef itemAtCell(PointRef p)
	{
		for (int i = 0; i < this.d_Inventory.itemsCount; i++) {
			Packet_PositionItem k = this.d_Inventory.items[i];
			Packet_Item item = k.value_;
			for (int x = 0; x < this.d_Items.itemSizeX(item); x++) {
				for (int y = 0; y < this.d_Items.itemSizeY(item); y++) {
					int px = k.x + x;
					int py = k.y + y;
					if (p.x == px && p.y == py) {
						return PointRef.create(k.x, k.y);
					}
				}
			}
		}
		return null;
	}

	final Packet_Item itemAtWearPlace(int wearPlace, int activeMaterial)
	{
		switch (wearPlace) {
		case 0:
			return this.d_Inventory.rightHand[activeMaterial];
		case 1:
			return this.d_Inventory.mainArmor;
		case 2:
			return this.d_Inventory.boots;
		case 3:
			return this.d_Inventory.helmet;
		case 4:
			return this.d_Inventory.gauntlet;
		default:
			return null;
		}
	}

	final PointRef[] itemsAtArea(int pX, int pY, int sizeX, int sizeY, IntRef retCount)
	{
		PointRef[] itemsAtArea = new PointRef[256];
		int itemsAtAreaCount = 0;
		for (int xx = 0; xx < sizeX; xx++) {
			for (int yy = 0; yy < sizeY; yy++) {
				PointRef cell = PointRef.create(pX + xx, pY + yy);
				if (!this.isValidCell(cell)) {
					return null;
				}
				if (this.itemAtCell(cell) != null) {
					boolean contains = false;
					for (int i = 0; i < itemsAtAreaCount; i++) {
						if (itemsAtArea[i] == null) {
							continue;
						}
						if (itemsAtArea[i].x == this.itemAtCell(cell).x && itemsAtArea[i].y == this.itemAtCell(cell).y) {
							contains = true;
						}
					}
					if (!contains) {
						itemsAtArea[itemsAtAreaCount++] = this.itemAtCell(cell);
					}
				}
			}
		}
		retCount.value = itemsAtAreaCount;
		return itemsAtArea;
	}
	Packet_Inventory d_Inventory;
	GameDataItemsClient d_Items;
}
