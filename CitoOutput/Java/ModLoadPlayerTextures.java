// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class ModLoadPlayerTextures extends ClientMod
{

	final void loadPlayerTextures(Game game)
	{
		if (!game.issingleplayer) {
			if (this.skinserverResponse.done) {
				this.skinserver = game.platform.stringFromUtf8ByteArray(this.skinserverResponse.value, this.skinserverResponse.valueLength);
			}
			else if (this.skinserverResponse.error) {
				this.skinserver = null;
			}
			else {
				return;
			}
		}
		for (int i = 0; i < game.entitiesCount; i++) {
			Entity e = game.entities[i];
			if (e == null) {
				continue;
			}
			if (e.drawModel == null) {
				continue;
			}
			if (e.drawModel.currentTexture != -1) {
				continue;
			}
			if (!game.issingleplayer && e.drawModel.downloadSkin && this.skinserver != null && e.drawModel.texture_ == null) {
				if (e.drawModel.skinDownloadResponse == null) {
					e.drawModel.skinDownloadResponse = new HttpResponseCi();
					String url = StringTools.stringAppend(game.platform, this.skinserver, StringTools.stringSubstringToEnd(game.platform, e.drawName.name, 2));
					url = StringTools.stringAppend(game.platform, url, ".png");
					game.platform.webClientDownloadDataAsync(url, e.drawModel.skinDownloadResponse);
					continue;
				}
				if (!e.drawModel.skinDownloadResponse.error) {
					if (!e.drawModel.skinDownloadResponse.done) {
						continue;
					}
					BitmapCi bmp_ = game.platform.bitmapCreateFromPng(e.drawModel.skinDownloadResponse.value, e.drawModel.skinDownloadResponse.valueLength);
					if (bmp_ != null) {
						e.drawModel.currentTexture = game.getTextureOrLoad(e.drawName.name, bmp_);
						game.platform.bitmapDelete(bmp_);
						continue;
					}
				}
			}
			if (e.drawModel.texture_ == null) {
				e.drawModel.currentTexture = game.getTexture("mineplayer.png");
				continue;
			}
			byte[] file = game.getFile(e.drawModel.texture_);
			if (file == null) {
				e.drawModel.currentTexture = 0;
				continue;
			}
			BitmapCi bmp = game.platform.bitmapCreateFromPng(file, game.platform.byteArrayLength(file));
			if (bmp == null) {
				e.drawModel.currentTexture = 0;
				continue;
			}
			e.drawModel.currentTexture = game.getTextureOrLoad(e.drawModel.texture_, bmp);
			game.platform.bitmapDelete(bmp);
		}
	}

	@Override
	public void onNewFrame(Game game, NewFrameEventArgs args)
	{
		if (game.guistate == GuiState.MAP_LOADING) {
			return;
		}
		if (!this.started) {
			this.started = true;
			if (!game.issingleplayer) {
				this.skinserverResponse = new HttpResponseCi();
				game.platform.webClientDownloadDataAsync("http://manicdigger.sourceforge.net/skinserver.txt", this.skinserverResponse);
			}
		}
		this.loadPlayerTextures(game);
	}
	String skinserver;
	HttpResponseCi skinserverResponse;
	private boolean started;
}
