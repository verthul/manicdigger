// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class Packet_Inventory
{
	Packet_Item boots;
	Packet_Item dragDropItem;
	Packet_Item gauntlet;

	public final Packet_Item getBoots()
	{
		return this.boots;
	}

	public final Packet_Item getDragDropItem()
	{
		return this.dragDropItem;
	}

	public final Packet_Item getGauntlet()
	{
		return this.gauntlet;
	}

	public final Packet_Item getHelmet()
	{
		return this.helmet;
	}

	public final Packet_PositionItem[] getItems()
	{
		return this.items;
	}

	public final int getItemsCount()
	{
		return this.itemsCount;
	}

	public final int getItemsLength()
	{
		return this.itemsLength;
	}

	public final Packet_Item getMainArmor()
	{
		return this.mainArmor;
	}

	public final Packet_Item[] getRightHand()
	{
		return this.rightHand;
	}

	public final int getRightHandCount()
	{
		return this.rightHandCount;
	}

	public final int getRightHandLength()
	{
		return this.rightHandLength;
	}
	Packet_Item helmet;
	Packet_PositionItem[] items;

	public final void itemsAdd(Packet_PositionItem value)
	{
		if (this.itemsCount >= this.itemsLength) {
			Packet_PositionItem[] Items2 = new Packet_PositionItem[this.itemsLength * 2];
			this.itemsLength = this.itemsLength * 2;
			for (int i = 0; i < this.itemsCount; i++) {
				Items2[i] = this.items[i];
			}
			this.items = Items2;
		}
		this.items[this.itemsCount] = value;
		this.itemsCount++;
	}
	int itemsCount;
	int itemsLength;
	Packet_Item mainArmor;
	Packet_Item[] rightHand;

	public final void rightHandAdd(Packet_Item value)
	{
		if (this.rightHandCount >= this.rightHandLength) {
			Packet_Item[] RightHand2 = new Packet_Item[this.rightHandLength * 2];
			this.rightHandLength = this.rightHandLength * 2;
			for (int i = 0; i < this.rightHandCount; i++) {
				RightHand2[i] = this.rightHand[i];
			}
			this.rightHand = RightHand2;
		}
		this.rightHand[this.rightHandCount] = value;
		this.rightHandCount++;
	}
	int rightHandCount;
	int rightHandLength;

	public final void setBoots(Packet_Item value)
	{
		this.boots = value;
	}

	public final void setDragDropItem(Packet_Item value)
	{
		this.dragDropItem = value;
	}

	public final void setGauntlet(Packet_Item value)
	{
		this.gauntlet = value;
	}

	public final void setHelmet(Packet_Item value)
	{
		this.helmet = value;
	}

	public final void setItems(Packet_PositionItem[] value, int count, int length)
	{
		this.items = value;
		this.itemsCount = count;
		this.itemsLength = length;
	}

	public final void setMainArmor(Packet_Item value)
	{
		this.mainArmor = value;
	}

	public final void setRightHand(Packet_Item[] value, int count, int length)
	{
		this.rightHand = value;
		this.rightHandCount = count;
		this.rightHandLength = length;
	}
}
