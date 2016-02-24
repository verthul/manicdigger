// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class ModDrawHand2d extends ClientMod
{

	public static String handImage2d(Game game)
	{
		Packet_Item item = game.d_Inventory.rightHand[game.activeMaterial];
		String img = null;
		if (item != null) {
			img = game.blocktypes[item.blockId].handimage;
			if (game.ironSights) {
				img = game.blocktypes[item.blockId].ironSightsImage;
			}
		}
		return img;
	}

	@Override
	public void onNewFrameDraw3d(Game game, float deltaTime)
	{
		if (ModDrawHand2d.shouldDrawHand(game)) {
			String img = ModDrawHand2d.handImage2d(game);
			if (img != null) {
				game.orthoMode(game.width(), game.height());
				if (!this.lasthandimage.equals(img)) {
					this.lasthandimage = img;
					byte[] file = game.getFile(img);
					BitmapCi bmp = game.platform.bitmapCreateFromPng(file, game.platform.byteArrayLength(file));
					if (bmp != null) {
						game.handTexture = game.platform.loadTextureFromBitmap(bmp);
						game.platform.bitmapDelete(bmp);
					}
				}
				game.draw2dTexture(game.handTexture, game.width() / 2, game.height() - 512, 512, 512, null, 0, Game.colorFromArgb(255, 255, 255, 255), false);
				game.perspectiveMode();
			}
		}
	}

	public static boolean shouldDrawHand(Game game)
	{
		return !game.eNABLE_TPP_VIEW && game.eNABLE_DRAW2D;
	}
	String lasthandimage;
}
