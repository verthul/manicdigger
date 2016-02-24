// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class GameDataItemsClient
{

	public final boolean canWear(int selectedWear, Packet_Item item)
	{
		if (item == null) {
			return true;
		}
		if (item == null) {
			return true;
		}
		switch (selectedWear) {
		case 0:
			return item.itemClass == 0;
		case 1:
			return false;
		case 2:
			return false;
		case 3:
			return false;
		case 4:
			return false;
		default:
			return false;
		}
	}

	public final String itemGraphics(Packet_Item item)
	{
		return null;
	}

	public final String itemInfo(Packet_Item item)
	{
		if (item.itemClass == 0) {
			return this.game.language.get(StringTools.stringAppend(this.game.platform, "Block_", this.game.blocktypes[item.blockId].name));
		}
		this.game.platform.throwException("ItemClass");
		return "ItemClass";
	}

	public final int itemSizeX(Packet_Item item)
	{
		if (item.itemClass == 0) {
			return 1;
		}
		this.game.platform.throwException("ItemClass");
		return 1;
	}

	public final int itemSizeY(Packet_Item item)
	{
		if (item.itemClass == 0) {
			return 1;
		}
		this.game.platform.throwException("ItemClass");
		return 1;
	}

	public final Packet_Item stack(Packet_Item itemA, Packet_Item itemB)
	{
		if (itemA.itemClass == 0 && itemB.itemClass == 0) {
			Packet_Item ret = new Packet_Item();
			ret.itemClass = itemA.itemClass;
			ret.blockId = itemA.blockId;
			ret.blockCount = itemA.blockCount + itemB.blockCount;
			return ret;
		}
		else {
			return null;
		}
	}

	public final int[] textureIdForInventory()
	{
		return this.game.textureIdForInventory;
	}
	Game game;
}
