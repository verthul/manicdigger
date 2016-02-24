// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class Config3d
{
	public Config3d()
	{
		this.eNABLE_BACKFACECULLING = true;
		this.eNABLE_TRANSPARENCY = true;
		this.eNABLE_MIPMAPS = true;
		this.eNABLE_VISIBILITY_CULLING = false;
		this.viewdistance = 128;
	}
	boolean eNABLE_BACKFACECULLING;
	boolean eNABLE_MIPMAPS;
	boolean eNABLE_TRANSPARENCY;
	boolean eNABLE_VISIBILITY_CULLING;

	public final boolean getEnableMipmaps()
	{
		return this.eNABLE_MIPMAPS;
	}

	public final boolean getEnableTransparency()
	{
		return this.eNABLE_TRANSPARENCY;
	}

	public final float getViewDistance()
	{
		return this.viewdistance;
	}

	public final void setEnableMipmaps(boolean value)
	{
		this.eNABLE_MIPMAPS = value;
	}

	public final void setEnableTransparency(boolean value)
	{
		this.eNABLE_TRANSPARENCY = value;
	}

	public final void setViewDistance(float value)
	{
		this.viewdistance = value;
	}
	float viewdistance;
}
