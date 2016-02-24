// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class TextureAtlasCi
{

	public static void textureCoords2d(int textureId, int texturesPacked, RectFRef r)
	{
		float one = 1;
		r.y = one / texturesPacked * textureId / texturesPacked;
		r.x = one / texturesPacked * textureId % texturesPacked;
		r.w = one / texturesPacked;
		r.h = one / texturesPacked;
	}
}
