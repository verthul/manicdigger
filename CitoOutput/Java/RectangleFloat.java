// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class RectangleFloat
{

	public final float bottom()
	{
		return this.y + this.height;
	}

	public static RectangleFloat create(float x_, float y_, float width_, float height_)
	{
		RectangleFloat r = new RectangleFloat();
		r.x = x_;
		r.y = y_;
		r.width = width_;
		r.height = height_;
		return r;
	}
	float height;
	float width;
	float x;
	float y;
}
