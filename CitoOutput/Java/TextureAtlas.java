// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class TextureAtlas
{

	public static RectFRef textureCoords2d(int textureId, int texturesPacked)
	{
		float one = 1;
		RectFRef r = new RectFRef();
		r.y = one / texturesPacked * textureId / texturesPacked;
		r.x = one / texturesPacked * textureId % texturesPacked;
		r.w = one / texturesPacked;
		r.h = one / texturesPacked;
		return r;
	}
}
