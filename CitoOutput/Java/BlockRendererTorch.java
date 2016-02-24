// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class BlockRendererTorch
{

	public final void addTorch(GameData d_Data, Game d_TerainRenderer, ModelData m, int x, int y, int z, int type)
	{
		float one = 1;
		int curcolor = Game.colorFromArgb(255, 255, 255, 255);
		float torchsizexy = one * 16 / 100;
		float topx = one / 2 - torchsizexy / 2;
		float topy = one / 2 - torchsizexy / 2;
		float bottomx = one / 2 - torchsizexy / 2;
		float bottomy = one / 2 - torchsizexy / 2;
		topx += x;
		topy += y;
		bottomx += x;
		bottomy += y;
		if (type == TorchType.FRONT) {
			bottomx = x - torchsizexy;
		}
		if (type == TorchType.BACK) {
			bottomx = x + 1;
		}
		if (type == TorchType.LEFT) {
			bottomy = y - torchsizexy;
		}
		if (type == TorchType.RIGHT) {
			bottomy = y + 1;
		}
		Vector3Ref top00 = Vector3Ref.create(topx, z + one * 9 / 10, topy);
		Vector3Ref top01 = Vector3Ref.create(topx, z + one * 9 / 10, topy + torchsizexy);
		Vector3Ref top10 = Vector3Ref.create(topx + torchsizexy, z + one * 9 / 10, topy);
		Vector3Ref top11 = Vector3Ref.create(topx + torchsizexy, z + one * 9 / 10, topy + torchsizexy);
		if (type == TorchType.LEFT) {
			top01.y += -(one * 1 / 10);
			top11.y += -(one * 1 / 10);
		}
		if (type == TorchType.RIGHT) {
			top10.y += -(one * 1 / 10);
			top00.y += -(one * 1 / 10);
		}
		if (type == TorchType.FRONT) {
			top10.y += -(one * 1 / 10);
			top11.y += -(one * 1 / 10);
		}
		if (type == TorchType.BACK) {
			top01.y += -(one * 1 / 10);
			top00.y += -(one * 1 / 10);
		}
		Vector3Ref bottom00 = Vector3Ref.create(bottomx, z + 0, bottomy);
		Vector3Ref bottom01 = Vector3Ref.create(bottomx, z + 0, bottomy + torchsizexy);
		Vector3Ref bottom10 = Vector3Ref.create(bottomx + torchsizexy, z + 0, bottomy);
		Vector3Ref bottom11 = Vector3Ref.create(bottomx + torchsizexy, z + 0, bottomy + torchsizexy);
		{
			int sidetexture = this.topTexture;
			RectFRef texrec = TextureAtlas.textureCoords2d(sidetexture, d_TerainRenderer.texturesPacked());
			int lastelement = m.getVerticesCount();
			this.addVertex(m, top00.x, top00.y, top00.z, texrec.left(), texrec.top(), curcolor);
			this.addVertex(m, top01.x, top01.y, top01.z, texrec.left(), texrec.bottom(), curcolor);
			this.addVertex(m, top10.x, top10.y, top10.z, texrec.right(), texrec.top(), curcolor);
			this.addVertex(m, top11.x, top11.y, top11.z, texrec.right(), texrec.bottom(), curcolor);
			m.indices[m.indicesCount++] = lastelement + 0;
			m.indices[m.indicesCount++] = lastelement + 1;
			m.indices[m.indicesCount++] = lastelement + 2;
			m.indices[m.indicesCount++] = lastelement + 1;
			m.indices[m.indicesCount++] = lastelement + 3;
			m.indices[m.indicesCount++] = lastelement + 2;
		}
		{
			int sidetexture = this.sideTexture;
			RectFRef texrec = TextureAtlas.textureCoords2d(sidetexture, d_TerainRenderer.texturesPacked());
			int lastelement = m.getVerticesCount();
			this.addVertex(m, bottom00.x, bottom00.y, bottom00.z, texrec.left(), texrec.top(), curcolor);
			this.addVertex(m, bottom01.x, bottom01.y, bottom01.z, texrec.left(), texrec.bottom(), curcolor);
			this.addVertex(m, bottom10.x, bottom10.y, bottom10.z, texrec.right(), texrec.top(), curcolor);
			this.addVertex(m, bottom11.x, bottom11.y, bottom11.z, texrec.right(), texrec.bottom(), curcolor);
			m.indices[m.indicesCount++] = lastelement + 1;
			m.indices[m.indicesCount++] = lastelement + 0;
			m.indices[m.indicesCount++] = lastelement + 2;
			m.indices[m.indicesCount++] = lastelement + 3;
			m.indices[m.indicesCount++] = lastelement + 1;
			m.indices[m.indicesCount++] = lastelement + 2;
		}
		{
			int sidetexture = this.sideTexture;
			RectFRef texrec = TextureAtlas.textureCoords2d(sidetexture, d_TerainRenderer.texturesPacked());
			int lastelement = m.getVerticesCount();
			this.addVertex(m, bottom00.x, bottom00.y, bottom00.z, texrec.left(), texrec.bottom(), curcolor);
			this.addVertex(m, bottom01.x, bottom01.y, bottom01.z, texrec.right(), texrec.bottom(), curcolor);
			this.addVertex(m, top00.x, top00.y, top00.z, texrec.left(), texrec.top(), curcolor);
			this.addVertex(m, top01.x, top01.y, top01.z, texrec.right(), texrec.top(), curcolor);
			m.indices[m.indicesCount++] = lastelement + 0;
			m.indices[m.indicesCount++] = lastelement + 1;
			m.indices[m.indicesCount++] = lastelement + 2;
			m.indices[m.indicesCount++] = lastelement + 1;
			m.indices[m.indicesCount++] = lastelement + 3;
			m.indices[m.indicesCount++] = lastelement + 2;
		}
		{
			int sidetexture = this.sideTexture;
			RectFRef texrec = TextureAtlas.textureCoords2d(sidetexture, d_TerainRenderer.texturesPacked());
			int lastelement = m.getVerticesCount();
			this.addVertex(m, bottom10.x, bottom10.y, bottom10.z, texrec.right(), texrec.bottom(), curcolor);
			this.addVertex(m, bottom11.x, bottom11.y, bottom11.z, texrec.left(), texrec.bottom(), curcolor);
			this.addVertex(m, top10.x, top10.y, top10.z, texrec.right(), texrec.top(), curcolor);
			this.addVertex(m, top11.x, top11.y, top11.z, texrec.left(), texrec.top(), curcolor);
			m.indices[m.indicesCount++] = lastelement + 1;
			m.indices[m.indicesCount++] = lastelement + 0;
			m.indices[m.indicesCount++] = lastelement + 2;
			m.indices[m.indicesCount++] = lastelement + 3;
			m.indices[m.indicesCount++] = lastelement + 1;
			m.indices[m.indicesCount++] = lastelement + 2;
		}
		{
			int sidetexture = this.sideTexture;
			RectFRef texrec = TextureAtlas.textureCoords2d(sidetexture, d_TerainRenderer.texturesPacked());
			int lastelement = m.getVerticesCount();
			this.addVertex(m, bottom00.x, bottom00.y, bottom00.z, texrec.right(), texrec.bottom(), curcolor);
			this.addVertex(m, top00.x, top00.y, top00.z, texrec.right(), texrec.top(), curcolor);
			this.addVertex(m, bottom10.x, bottom10.y, bottom10.z, texrec.left(), texrec.bottom(), curcolor);
			this.addVertex(m, top10.x, top10.y, top10.z, texrec.left(), texrec.top(), curcolor);
			m.indices[m.indicesCount++] = lastelement + 0;
			m.indices[m.indicesCount++] = lastelement + 1;
			m.indices[m.indicesCount++] = lastelement + 2;
			m.indices[m.indicesCount++] = lastelement + 1;
			m.indices[m.indicesCount++] = lastelement + 3;
			m.indices[m.indicesCount++] = lastelement + 2;
		}
		{
			int sidetexture = this.sideTexture;
			RectFRef texrec = TextureAtlas.textureCoords2d(sidetexture, d_TerainRenderer.texturesPacked());
			int lastelement = m.getVerticesCount();
			this.addVertex(m, bottom01.x, bottom01.y, bottom01.z, texrec.left(), texrec.bottom(), curcolor);
			this.addVertex(m, top01.x, top01.y, top01.z, texrec.left(), texrec.top(), curcolor);
			this.addVertex(m, bottom11.x, bottom11.y, bottom11.z, texrec.right(), texrec.bottom(), curcolor);
			this.addVertex(m, top11.x, top11.y, top11.z, texrec.right(), texrec.top(), curcolor);
			m.indices[m.indicesCount++] = lastelement + 1;
			m.indices[m.indicesCount++] = lastelement + 0;
			m.indices[m.indicesCount++] = lastelement + 2;
			m.indices[m.indicesCount++] = lastelement + 3;
			m.indices[m.indicesCount++] = lastelement + 1;
			m.indices[m.indicesCount++] = lastelement + 2;
		}
	}

	public final void addVertex(ModelData model, float x, float y, float z, float u, float v, int color)
	{
		model.xyz[model.getXyzCount() + 0] = x;
		model.xyz[model.getXyzCount() + 1] = y;
		model.xyz[model.getXyzCount() + 2] = z;
		model.uv[model.getUvCount() + 0] = u;
		model.uv[model.getUvCount() + 1] = v;
		model.rgba[model.getRgbaCount() + 0] = Game.intToByte(Game.colorR(color));
		model.rgba[model.getRgbaCount() + 1] = Game.intToByte(Game.colorG(color));
		model.rgba[model.getRgbaCount() + 2] = Game.intToByte(Game.colorB(color));
		model.rgba[model.getRgbaCount() + 3] = Game.intToByte(Game.colorA(color));
		model.verticesCount++;
	}
	int sideTexture;
	int topTexture;
}
