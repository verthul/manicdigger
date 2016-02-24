// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class TextColorRenderer
{

	final BitmapCi createTextTexture(Text_ t)
	{
		IntRef partsCount = new IntRef();
		TextPart[] parts = this.decodeColors(t.text, t.color, partsCount);
		float totalwidth = 0;
		float totalheight = 0;
		int[] sizesX = new int[partsCount.value];
		int[] sizesY = new int[partsCount.value];
		for (int i = 0; i < partsCount.value; i++) {
			IntRef outWidth = new IntRef();
			IntRef outHeight = new IntRef();
			this.platform.textSize(parts[i].text, t.fontsize, outWidth, outHeight);
			sizesX[i] = outWidth.value;
			sizesY[i] = outHeight.value;
			totalwidth += outWidth.value;
			totalheight = MathCi.maxFloat(totalheight, outHeight.value);
		}
		int size2X = this.nextPowerOfTwo(this.platform.floatToInt(totalwidth) + 1);
		int size2Y = this.nextPowerOfTwo(this.platform.floatToInt(totalheight) + 1);
		BitmapCi bmp2 = this.platform.bitmapCreate(size2X, size2Y);
		int[] bmp2Pixels = new int[size2X * size2Y];
		float currentwidth = 0;
		for (int i = 0; i < partsCount.value; i++) {
			int sizeiX = sizesX[i];
			int sizeiY = sizesY[i];
			if (sizeiX == 0 || sizeiY == 0) {
				continue;
			}
			Text_ partText = new Text_();
			partText.text = parts[i].text;
			partText.color = parts[i].color;
			partText.fontsize = t.fontsize;
			partText.fontstyle = t.fontstyle;
			partText.fontfamily = t.fontfamily;
			BitmapCi partBmp = this.platform.createTextTexture(partText);
			int partWidth = this.platform.floatToInt(this.platform.bitmapGetWidth(partBmp));
			int partHeight = this.platform.floatToInt(this.platform.bitmapGetHeight(partBmp));
			int[] partBmpPixels = new int[partWidth * partHeight];
			this.platform.bitmapGetPixelsArgb(partBmp, partBmpPixels);
			for (int x = 0; x < partWidth; x++) {
				for (int y = 0; y < partHeight; y++) {
					if (x + currentwidth >= size2X) {
						continue;
					}
					if (y >= size2Y) {
						continue;
					}
					int c = partBmpPixels[MapUtilCi.index2d(x, y, partWidth)];
					if (Game.colorA(c) > 0) {
						bmp2Pixels[MapUtilCi.index2d(this.platform.floatToInt(currentwidth) + x, y, size2X)] = c;
					}
				}
			}
			currentwidth += sizeiX;
		}
		this.platform.bitmapSetPixelsArgb(bmp2, bmp2Pixels);
		return bmp2;
	}

	public final TextPart[] decodeColors(String s, int defaultcolor, IntRef retLength)
	{
		TextPart[] parts = new TextPart[256];
		int partsCount = 0;
		int currentcolor = defaultcolor;
		int[] currenttext = new int[256];
		int currenttextLength = 0;
		IntRef sLength = new IntRef();
		int[] sChars = this.platform.stringToCharArray(s, sLength);
		for (int i = 0; i < sLength.value; i++) {
			if (sChars[i] == 38) {
				if (i + 1 < sLength.value) {
					int color = this.hexToInt(sChars[i + 1]);
					if (color != -1) {
						if (currenttextLength != 0) {
							TextPart part = new TextPart();
							part.text = this.platform.charArrayToString(currenttext, currenttextLength);
							part.color = currentcolor;
							parts[partsCount++] = part;
						}
						for (int k = 0; k < currenttextLength; k++) {
							currenttext[k] = 0;
						}
						currenttextLength = 0;
						currentcolor = this.getColor(color);
						i++;
					}
					else {
						currenttext[currenttextLength++] = sChars[i];
					}
				}
				else {
					currenttext[currenttextLength++] = sChars[i];
				}
			}
			else {
				currenttext[currenttextLength++] = s.charAt(i);
			}
		}
		if (currenttextLength != 0) {
			TextPart part = new TextPart();
			part.text = this.platform.charArrayToString(currenttext, currenttextLength);
			part.color = currentcolor;
			parts[partsCount++] = part;
		}
		retLength.value = partsCount;
		return parts;
	}

	private int getColor(int currentcolor)
	{
		switch (currentcolor) {
		case 0:
			{
				return Game.colorFromArgb(255, 0, 0, 0);
			}
		case 1:
			{
				return Game.colorFromArgb(255, 0, 0, 191);
			}
		case 2:
			{
				return Game.colorFromArgb(255, 0, 191, 0);
			}
		case 3:
			{
				return Game.colorFromArgb(255, 0, 191, 191);
			}
		case 4:
			{
				return Game.colorFromArgb(255, 191, 0, 0);
			}
		case 5:
			{
				return Game.colorFromArgb(255, 191, 0, 191);
			}
		case 6:
			{
				return Game.colorFromArgb(255, 191, 191, 0);
			}
		case 7:
			{
				return Game.colorFromArgb(255, 191, 191, 191);
			}
		case 8:
			{
				return Game.colorFromArgb(255, 40, 40, 40);
			}
		case 9:
			{
				return Game.colorFromArgb(255, 64, 64, 255);
			}
		case 10:
			{
				return Game.colorFromArgb(255, 64, 255, 64);
			}
		case 11:
			{
				return Game.colorFromArgb(255, 64, 255, 255);
			}
		case 12:
			{
				return Game.colorFromArgb(255, 255, 64, 64);
			}
		case 13:
			{
				return Game.colorFromArgb(255, 255, 64, 255);
			}
		case 14:
			{
				return Game.colorFromArgb(255, 255, 255, 64);
			}
		case 15:
			{
				return Game.colorFromArgb(255, 255, 255, 255);
			}
		default:
			return Game.colorFromArgb(255, 255, 255, 255);
		}
	}

	private int hexToInt(int c)
	{
		if (c == 48) {
			return 0;
		}
		if (c == 49) {
			return 1;
		}
		if (c == 50) {
			return 2;
		}
		if (c == 51) {
			return 3;
		}
		if (c == 52) {
			return 4;
		}
		if (c == 53) {
			return 5;
		}
		if (c == 54) {
			return 6;
		}
		if (c == 55) {
			return 7;
		}
		if (c == 56) {
			return 8;
		}
		if (c == 57) {
			return 9;
		}
		if (c == 97) {
			return 10;
		}
		if (c == 98) {
			return 11;
		}
		if (c == 99) {
			return 12;
		}
		if (c == 100) {
			return 13;
		}
		if (c == 101) {
			return 14;
		}
		if (c == 102) {
			return 15;
		}
		return -1;
	}

	private int nextPowerOfTwo(int x)
	{
		x--;
		x |= x >> 1;
		x |= x >> 2;
		x |= x >> 4;
		x |= x >> 8;
		x++;
		return x;
	}
	GamePlatform platform;
}
