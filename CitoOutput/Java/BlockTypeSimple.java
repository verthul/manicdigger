// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class BlockTypeSimple
{
	public BlockTypeSimple()
	{
		this.block = new Packet_BlockType();
	}

	public final void setAllTextures(String texture)
	{
		this.block.textureIdTop = texture;
		this.block.textureIdBottom = texture;
		this.block.textureIdFront = texture;
		this.block.textureIdBack = texture;
		this.block.textureIdLeft = texture;
		this.block.textureIdRight = texture;
		this.block.textureIdForInventory = texture;
	}

	public final void setDrawType(int p)
	{
		this.block.drawType = p;
	}

	public final void setName(String name)
	{
		this.block.name = name;
	}

	public final void setTextureBack(String p)
	{
		this.block.textureIdBack = p;
	}

	public final void setTextureBottom(String p)
	{
		this.block.textureIdBottom = p;
	}

	public final void setTextureFront(String p)
	{
		this.block.textureIdFront = p;
	}

	public final void setTextureLeft(String p)
	{
		this.block.textureIdLeft = p;
	}

	public final void setTextureRight(String p)
	{
		this.block.textureIdRight = p;
	}

	public final void setTextureTop(String p)
	{
		this.block.textureIdTop = p;
	}

	public final void setWalkableType(int p)
	{
		this.block.walkableType = p;
	}
	Packet_BlockType block;
}
