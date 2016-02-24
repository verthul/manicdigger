// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class RectFRef
{

	final float bottom()
	{
		return this.y + this.h;
	}

	public static RectFRef create(float x_, float y_, float w_, float h_)
	{
		RectFRef r = new RectFRef();
		r.x = x_;
		r.y = y_;
		r.w = w_;
		r.h = h_;
		return r;
	}

	final float left()
	{
		return this.x;
	}

	final float right()
	{
		return this.x + this.w;
	}

	final float top()
	{
		return this.y;
	}
	float h;
	float w;
	float x;
	float y;
}
