// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class BitmapData_
{

	public static BitmapData_ create(int width, int height)
	{
		BitmapData_ b = new BitmapData_();
		b.width = width;
		b.height = height;
		b.argb = new int[width * height];
		return b;
	}

	public static BitmapData_ createFromBitmap(GamePlatform p, BitmapCi atlas2d_)
	{
		BitmapData_ b = new BitmapData_();
		b.width = p.floatToInt(p.bitmapGetWidth(atlas2d_));
		b.height = p.floatToInt(p.bitmapGetHeight(atlas2d_));
		b.argb = new int[b.width * b.height];
		p.bitmapGetPixelsArgb(atlas2d_, b.argb);
		return b;
	}

	public final int getPixel(int x, int y)
	{
		return this.argb[x + y * this.width];
	}

	public final void setPixel(int x, int y, int color)
	{
		this.argb[x + y * this.width] = color;
	}

	public final BitmapCi toBitmap(GamePlatform p)
	{
		BitmapCi bmp = p.bitmapCreate(this.width, this.height);
		p.bitmapSetPixelsArgb(bmp, this.argb);
		return bmp;
	}
	int[] argb;
	int height;
	int width;
}
