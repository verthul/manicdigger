// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class TerrainChunkTesselatorCi
{
	public TerrainChunkTesselatorCi()
	{
		this.enableSmoothLight = true;
		this.eNABLE_TEXTURE_TILING = true;
		this._colorWhite = Game.colorFromArgb(255, 255, 255, 255);
		this.blockShadow = 0.6f;
		this.option_DarkenBlockSides = true;
		this.option_DoNotDrawEdges = true;
		this.occ = 0.7f;
		this.halfocc = 0.4f;
		this.tmpnPos = new int[7];
		this.tmpshadowration = new int[9];
		this.tmpoccupied = new boolean[9];
		this.tmpfShadowRation = new float[4];
		this.tmpv = new VecCito3i();
		this.ref_blockCornerHeight = new float[4];
		this.c_OcclusionNeighbors = new VecCito3i[6][];
		for (int i = 0; i < 6; i++) {
			this.c_OcclusionNeighbors[i] = new VecCito3i[9];
		}
		this.c_OcclusionNeighbors[0][8] = VecCito3i.citoCtr(0, 0, 1);
		this.c_OcclusionNeighbors[0][0] = VecCito3i.citoCtr(0, -1, 1);
		this.c_OcclusionNeighbors[0][1] = VecCito3i.citoCtr(0, 1, 1);
		this.c_OcclusionNeighbors[0][2] = VecCito3i.citoCtr(-1, 0, 1);
		this.c_OcclusionNeighbors[0][3] = VecCito3i.citoCtr(1, 0, 1);
		this.c_OcclusionNeighbors[0][4] = VecCito3i.citoCtr(-1, -1, 1);
		this.c_OcclusionNeighbors[0][5] = VecCito3i.citoCtr(1, -1, 1);
		this.c_OcclusionNeighbors[0][6] = VecCito3i.citoCtr(-1, 1, 1);
		this.c_OcclusionNeighbors[0][7] = VecCito3i.citoCtr(1, 1, 1);
		this.c_OcclusionNeighbors[2][8] = VecCito3i.citoCtr(-1, 0, 0);
		this.c_OcclusionNeighbors[2][0] = VecCito3i.citoCtr(-1, 0, 1);
		this.c_OcclusionNeighbors[2][1] = VecCito3i.citoCtr(-1, 0, -1);
		this.c_OcclusionNeighbors[2][2] = VecCito3i.citoCtr(-1, -1, 0);
		this.c_OcclusionNeighbors[2][3] = VecCito3i.citoCtr(-1, 1, 0);
		this.c_OcclusionNeighbors[2][4] = VecCito3i.citoCtr(-1, -1, 1);
		this.c_OcclusionNeighbors[2][5] = VecCito3i.citoCtr(-1, 1, 1);
		this.c_OcclusionNeighbors[2][6] = VecCito3i.citoCtr(-1, -1, -1);
		this.c_OcclusionNeighbors[2][7] = VecCito3i.citoCtr(-1, 1, -1);
		this.c_OcclusionNeighbors[1][8] = VecCito3i.citoCtr(0, 0, -1);
		this.c_OcclusionNeighbors[1][0] = VecCito3i.citoCtr(0, 1, -1);
		this.c_OcclusionNeighbors[1][1] = VecCito3i.citoCtr(0, -1, -1);
		this.c_OcclusionNeighbors[1][2] = VecCito3i.citoCtr(-1, 0, -1);
		this.c_OcclusionNeighbors[1][3] = VecCito3i.citoCtr(1, 0, -1);
		this.c_OcclusionNeighbors[1][4] = VecCito3i.citoCtr(-1, 1, -1);
		this.c_OcclusionNeighbors[1][5] = VecCito3i.citoCtr(1, 1, -1);
		this.c_OcclusionNeighbors[1][6] = VecCito3i.citoCtr(-1, -1, -1);
		this.c_OcclusionNeighbors[1][7] = VecCito3i.citoCtr(1, -1, -1);
		this.c_OcclusionNeighbors[3][8] = VecCito3i.citoCtr(1, 0, 0);
		this.c_OcclusionNeighbors[3][0] = VecCito3i.citoCtr(1, 0, 1);
		this.c_OcclusionNeighbors[3][1] = VecCito3i.citoCtr(1, 0, -1);
		this.c_OcclusionNeighbors[3][2] = VecCito3i.citoCtr(1, 1, 0);
		this.c_OcclusionNeighbors[3][3] = VecCito3i.citoCtr(1, -1, 0);
		this.c_OcclusionNeighbors[3][4] = VecCito3i.citoCtr(1, 1, 1);
		this.c_OcclusionNeighbors[3][5] = VecCito3i.citoCtr(1, -1, 1);
		this.c_OcclusionNeighbors[3][6] = VecCito3i.citoCtr(1, 1, -1);
		this.c_OcclusionNeighbors[3][7] = VecCito3i.citoCtr(1, -1, -1);
		this.c_OcclusionNeighbors[4][8] = VecCito3i.citoCtr(0, -1, 0);
		this.c_OcclusionNeighbors[4][0] = VecCito3i.citoCtr(0, -1, 1);
		this.c_OcclusionNeighbors[4][1] = VecCito3i.citoCtr(0, -1, -1);
		this.c_OcclusionNeighbors[4][2] = VecCito3i.citoCtr(1, -1, 0);
		this.c_OcclusionNeighbors[4][3] = VecCito3i.citoCtr(-1, -1, 0);
		this.c_OcclusionNeighbors[4][4] = VecCito3i.citoCtr(1, -1, 1);
		this.c_OcclusionNeighbors[4][5] = VecCito3i.citoCtr(-1, -1, 1);
		this.c_OcclusionNeighbors[4][6] = VecCito3i.citoCtr(1, -1, -1);
		this.c_OcclusionNeighbors[4][7] = VecCito3i.citoCtr(-1, -1, -1);
		this.c_OcclusionNeighbors[5][8] = VecCito3i.citoCtr(0, 1, 0);
		this.c_OcclusionNeighbors[5][0] = VecCito3i.citoCtr(0, 1, 1);
		this.c_OcclusionNeighbors[5][1] = VecCito3i.citoCtr(0, 1, -1);
		this.c_OcclusionNeighbors[5][2] = VecCito3i.citoCtr(-1, 1, 0);
		this.c_OcclusionNeighbors[5][3] = VecCito3i.citoCtr(1, 1, 0);
		this.c_OcclusionNeighbors[5][4] = VecCito3i.citoCtr(-1, 1, 1);
		this.c_OcclusionNeighbors[5][5] = VecCito3i.citoCtr(1, 1, 1);
		this.c_OcclusionNeighbors[5][6] = VecCito3i.citoCtr(-1, 1, -1);
		this.c_OcclusionNeighbors[5][7] = VecCito3i.citoCtr(1, 1, -1);
	}

	public final void addTorch(int x, int y, int z, int type, int tt)
	{
		TerrainChunkTesselatorCi d_TerainRenderer = this;
		int curcolor = this._colorWhite;
		float torchsizexy = 0.16f;
		float topx = 0.5f - torchsizexy / 2;
		float topy = 0.5f - torchsizexy / 2;
		float bottomx = 0.5f - torchsizexy / 2;
		float bottomy = 0.5f - torchsizexy / 2;
		topx += x;
		topy += y;
		bottomx += x;
		bottomy += y;
		if (type == 3) {
			bottomx = x - torchsizexy;
		}
		if (type == 4) {
			bottomx = x + 1;
		}
		if (type == 1) {
			bottomy = y - torchsizexy;
		}
		if (type == 2) {
			bottomy = y + 1;
		}
		Vector3Ref top00 = Vector3Ref.create(topx, z + 0.9f, topy);
		Vector3Ref top01 = Vector3Ref.create(topx, z + 0.9f, topy + torchsizexy);
		Vector3Ref top10 = Vector3Ref.create(topx + torchsizexy, z + 0.9f, topy);
		Vector3Ref top11 = Vector3Ref.create(topx + torchsizexy, z + 0.9f, topy + torchsizexy);
		if (type == 1) {
			top01.y += -0.1f;
			top11.y += -0.1f;
		}
		if (type == 2) {
			top10.y += -0.1f;
			top00.y += -0.1f;
		}
		if (type == 3) {
			top10.y += -0.1f;
			top11.y += -0.1f;
		}
		if (type == 4) {
			top01.y += -0.1f;
			top00.y += -0.1f;
		}
		Vector3Ref bottom00 = Vector3Ref.create(bottomx, z + 0, bottomy);
		Vector3Ref bottom01 = Vector3Ref.create(bottomx, z + 0, bottomy + torchsizexy);
		Vector3Ref bottom10 = Vector3Ref.create(bottomx + torchsizexy, z + 0, bottomy);
		Vector3Ref bottom11 = Vector3Ref.create(bottomx + torchsizexy, z + 0, bottomy + torchsizexy);
		{
			int sidetexture = this.torchTopTexture;
			float texrecTop = this.terrainTexturesPerAtlasInverse * sidetexture % this.terrainTexturesPerAtlas;
			float texrecBottom = texrecTop + this._texrecHeight;
			ModelData toreturn = this.getModelData(tt, sidetexture);
			int lastelement = toreturn.verticesCount;
			ModelDataTool.addVertex(toreturn, top00.x, top00.y, top00.z, this._texrecLeft, texrecTop, curcolor);
			ModelDataTool.addVertex(toreturn, top01.x, top01.y, top01.z, this._texrecLeft, texrecBottom, curcolor);
			ModelDataTool.addVertex(toreturn, top10.x, top10.y, top10.z, this._texrecRight, texrecTop, curcolor);
			ModelDataTool.addVertex(toreturn, top11.x, top11.y, top11.z, this._texrecRight, texrecBottom, curcolor);
			ModelDataTool.addIndex(toreturn, lastelement + 0);
			ModelDataTool.addIndex(toreturn, lastelement + 1);
			ModelDataTool.addIndex(toreturn, lastelement + 2);
			ModelDataTool.addIndex(toreturn, lastelement + 1);
			ModelDataTool.addIndex(toreturn, lastelement + 3);
			ModelDataTool.addIndex(toreturn, lastelement + 2);
		}
		{
			int sidetexture = this.torchSideTexture;
			float texrecTop = this.terrainTexturesPerAtlasInverse * sidetexture % this.terrainTexturesPerAtlas;
			float texrecBottom = texrecTop + this._texrecHeight;
			ModelData toreturn = this.getModelData(tt, sidetexture);
			int lastelement = toreturn.verticesCount;
			ModelDataTool.addVertex(toreturn, bottom00.x, bottom00.y, bottom00.z, this._texrecLeft, texrecTop, curcolor);
			ModelDataTool.addVertex(toreturn, bottom01.x, bottom01.y, bottom01.z, this._texrecLeft, texrecBottom, curcolor);
			ModelDataTool.addVertex(toreturn, bottom10.x, bottom10.y, bottom10.z, this._texrecRight, texrecTop, curcolor);
			ModelDataTool.addVertex(toreturn, bottom11.x, bottom11.y, bottom11.z, this._texrecRight, texrecBottom, curcolor);
			ModelDataTool.addIndex(toreturn, lastelement + 1);
			ModelDataTool.addIndex(toreturn, lastelement + 0);
			ModelDataTool.addIndex(toreturn, lastelement + 2);
			ModelDataTool.addIndex(toreturn, lastelement + 3);
			ModelDataTool.addIndex(toreturn, lastelement + 1);
			ModelDataTool.addIndex(toreturn, lastelement + 2);
		}
		{
			int sidetexture = this.torchSideTexture;
			float texrecTop = this.terrainTexturesPerAtlasInverse * sidetexture % this.terrainTexturesPerAtlas;
			float texrecBottom = texrecTop + this._texrecHeight;
			ModelData toreturn = this.getModelData(tt, sidetexture);
			int lastelement = toreturn.verticesCount;
			ModelDataTool.addVertex(toreturn, bottom00.x, bottom00.y, bottom00.z, this._texrecLeft, texrecBottom, curcolor);
			ModelDataTool.addVertex(toreturn, bottom01.x, bottom01.y, bottom01.z, this._texrecRight, texrecBottom, curcolor);
			ModelDataTool.addVertex(toreturn, top00.x, top00.y, top00.z, this._texrecLeft, texrecTop, curcolor);
			ModelDataTool.addVertex(toreturn, top01.x, top01.y, top01.z, this._texrecRight, texrecTop, curcolor);
			ModelDataTool.addIndex(toreturn, lastelement + 0);
			ModelDataTool.addIndex(toreturn, lastelement + 1);
			ModelDataTool.addIndex(toreturn, lastelement + 2);
			ModelDataTool.addIndex(toreturn, lastelement + 1);
			ModelDataTool.addIndex(toreturn, lastelement + 3);
			ModelDataTool.addIndex(toreturn, lastelement + 2);
		}
		{
			int sidetexture = this.torchSideTexture;
			float texrecTop = this.terrainTexturesPerAtlasInverse * sidetexture % this.terrainTexturesPerAtlas;
			float texrecBottom = texrecTop + this._texrecHeight;
			ModelData toreturn = this.getModelData(tt, sidetexture);
			int lastelement = toreturn.verticesCount;
			ModelDataTool.addVertex(toreturn, bottom10.x, bottom10.y, bottom10.z, this._texrecRight, texrecBottom, curcolor);
			ModelDataTool.addVertex(toreturn, bottom11.x, bottom11.y, bottom11.z, this._texrecLeft, texrecBottom, curcolor);
			ModelDataTool.addVertex(toreturn, top10.x, top10.y, top10.z, this._texrecRight, texrecTop, curcolor);
			ModelDataTool.addVertex(toreturn, top11.x, top11.y, top11.z, this._texrecLeft, texrecTop, curcolor);
			ModelDataTool.addIndex(toreturn, lastelement + 1);
			ModelDataTool.addIndex(toreturn, lastelement + 0);
			ModelDataTool.addIndex(toreturn, lastelement + 2);
			ModelDataTool.addIndex(toreturn, lastelement + 3);
			ModelDataTool.addIndex(toreturn, lastelement + 1);
			ModelDataTool.addIndex(toreturn, lastelement + 2);
		}
		{
			int sidetexture = this.torchSideTexture;
			float texrecTop = this.terrainTexturesPerAtlasInverse * sidetexture % this.terrainTexturesPerAtlas;
			float texrecBottom = texrecTop + this._texrecHeight;
			ModelData toreturn = this.getModelData(tt, sidetexture);
			int lastelement = toreturn.verticesCount;
			ModelDataTool.addVertex(toreturn, bottom00.x, bottom00.y, bottom00.z, this._texrecRight, texrecBottom, curcolor);
			ModelDataTool.addVertex(toreturn, top00.x, top00.y, top00.z, this._texrecRight, texrecTop, curcolor);
			ModelDataTool.addVertex(toreturn, bottom10.x, bottom10.y, bottom10.z, this._texrecLeft, texrecBottom, curcolor);
			ModelDataTool.addVertex(toreturn, top10.x, top10.y, top10.z, this._texrecLeft, texrecTop, curcolor);
			ModelDataTool.addIndex(toreturn, lastelement + 0);
			ModelDataTool.addIndex(toreturn, lastelement + 1);
			ModelDataTool.addIndex(toreturn, lastelement + 2);
			ModelDataTool.addIndex(toreturn, lastelement + 1);
			ModelDataTool.addIndex(toreturn, lastelement + 3);
			ModelDataTool.addIndex(toreturn, lastelement + 2);
		}
		{
			int sidetexture = this.torchSideTexture;
			float texrecTop = this.terrainTexturesPerAtlasInverse * sidetexture % this.terrainTexturesPerAtlas;
			float texrecBottom = texrecTop + this._texrecHeight;
			ModelData toreturn = this.getModelData(tt, sidetexture);
			int lastelement = toreturn.verticesCount;
			ModelDataTool.addVertex(toreturn, bottom01.x, bottom01.y, bottom01.z, this._texrecLeft, texrecBottom, curcolor);
			ModelDataTool.addVertex(toreturn, top01.x, top01.y, top01.z, this._texrecLeft, texrecTop, curcolor);
			ModelDataTool.addVertex(toreturn, bottom11.x, bottom11.y, bottom11.z, this._texrecRight, texrecBottom, curcolor);
			ModelDataTool.addVertex(toreturn, top11.x, top11.y, top11.z, this._texrecRight, texrecTop, curcolor);
			ModelDataTool.addIndex(toreturn, lastelement + 1);
			ModelDataTool.addIndex(toreturn, lastelement + 0);
			ModelDataTool.addIndex(toreturn, lastelement + 2);
			ModelDataTool.addIndex(toreturn, lastelement + 3);
			ModelDataTool.addIndex(toreturn, lastelement + 1);
			ModelDataTool.addIndex(toreturn, lastelement + 2);
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
	float atiArtifactFix;
	float blockShadow;

	private void buildBlockFace(int x, int y, int z, int tileType, float vOffsetX, float vOffsetY, float vOffsetZ, float vScaleX, float vScaleY, float vScaleZ, int[] currentChunk, int tileSide)
	{
		int xx = x % 16 + 1;
		int yy = y % 16 + 1;
		int zz = z % 16 + 1;
		VecCito3i[] vNeighbors = this.c_OcclusionNeighbors[tileSide];
		int[] shadowration = this.tmpshadowration;
		boolean[] occupied = this.tmpoccupied;
		int shadowratio = this.getShadowRatio(vNeighbors[8].x + xx, vNeighbors[8].y + yy, vNeighbors[8].z + zz);
		float[] fShadowRation = this.tmpfShadowRation;
		float shadowratiomain = this.lightlevels[shadowratio];
		fShadowRation[0] = shadowratiomain;
		fShadowRation[1] = shadowratiomain;
		fShadowRation[2] = shadowratiomain;
		fShadowRation[3] = shadowratiomain;
		if (this.enableSmoothLight) {
			for (int i = 0; i < 9; i++) {
				int vPosX = vNeighbors[i].x + xx;
				int vPosY = vNeighbors[i].y + yy;
				int vPosZ = vNeighbors[i].z + zz;
				int nBlockType = currentChunk[(vPosZ * 18 + vPosY) * 18 + vPosX];
				if (nBlockType != 0) {
					occupied[i] = !this.isTransparentForLight(nBlockType);
					shadowration[i] = shadowratio;
				}
				else {
					occupied[i] = false;
					shadowration[i] = this.getShadowRatio(vPosX, vPosY, vPosZ);
				}
			}
			this.calcShadowRation(0, 2, 4, 0, fShadowRation, occupied, shadowration);
			this.calcShadowRation(0, 3, 5, 1, fShadowRation, occupied, shadowration);
			this.calcShadowRation(1, 2, 6, 2, fShadowRation, occupied, shadowration);
			this.calcShadowRation(1, 3, 7, 3, fShadowRation, occupied, shadowration);
		}
		else {
		}
		this.drawBlockFace(x, y, z, tileType, tileSide, vOffsetX, vOffsetY, vOffsetZ, vScaleX, vScaleY, vScaleZ, vNeighbors, fShadowRation);
	}

	public final void buildBlockPolygons(int x, int y, int z)
	{
		for (int xx = 0; xx < 16; xx++) {
			for (int yy = 0; yy < 16; yy++) {
				for (int zz = 0; zz < 16; zz++) {
					if ((this.currentChunkDraw16[(zz * 16 + yy) * 16 + xx] & 0xff) != 0) {
						int xxx = x * 16 + xx;
						int yyy = y * 16 + yy;
						int zzz = z * 16 + zz;
						this.buildSingleBlockPolygon(xxx, yyy, zzz, this.currentChunk18);
					}
				}
			}
		}
	}

	public final void buildSingleBlockPolygon(int x, int y, int z, int[] currentChunk)
	{
		for (int i = 0; i < 4; i++) {
			this.ref_blockCornerHeight[i] = 0;
		}
		int xx = x % 16 + 1;
		int yy = y % 16 + 1;
		int zz = z % 16 + 1;
		int nToDraw = this.getToDrawFlags(xx, yy, zz);
		int tiletype = currentChunk[(zz * 18 + yy) * 18 + xx];
		float vOffsetX = 0;
		float vOffsetY = 0;
		float vOffsetZ = 0;
		float vScaleX = 1;
		float vScaleY = 1;
		float vScaleZ = 1;
		if (!this.isvalid(tiletype)) {
			return;
		}
		if (nToDraw == 0) {
			return;
		}
		if (this.option_DoNotDrawEdges) {
			if (z == 0) {
				nToDraw &= ~2;
			}
			if (x == 0) {
				nToDraw &= ~16;
			}
			if (x == this.mapsizex - 1) {
				nToDraw &= ~32;
			}
			if (y == 0) {
				nToDraw &= ~8;
			}
			if (y == this.mapsizey - 1) {
				nToDraw &= ~4;
			}
		}
		if (this.isFlower(tiletype)) {
			nToDraw = 20;
			vScaleX = 0.9f;
			vScaleY = 0.9f;
			vScaleZ = 1f;
			this.buildBlockFace(x, y, z, tiletype, 0.5f, 0.05f, 0f, vScaleX, vScaleY, vScaleZ, currentChunk, 2);
			this.buildBlockFace(x, y, z, tiletype, 0.05f, 0.5f, 0f, vScaleX, vScaleY, vScaleZ, currentChunk, 4);
			return;
		}
		else if (this.game.blocktypes[tiletype].drawType == 13) {
			float fScale = 0.875f;
			float fOffset = (1f - fScale) / 2f;
			float vLROffsetX = fOffset;
			float vLROffsetY = 0;
			float vLROffsetZ = 0;
			float vLRScaleX = fScale;
			float vLRScaleY = 1f;
			float vLRScaleZ = 1f;
			float vFBOffsetX = 0;
			float vFBOffsetY = fOffset;
			float vFBOffsetZ = 0;
			float vFBScaleX = 1f;
			float vFBScaleY = fScale;
			float vFBScaleZ = 1f;
			this.buildBlockFace(x, y, z, tiletype, vLROffsetX, vLROffsetY, vLROffsetZ, vLRScaleX, vLRScaleY, vLRScaleZ, currentChunk, 2);
			this.buildBlockFace(x, y, z, tiletype, vLROffsetX, vLROffsetY, vLROffsetZ, vLRScaleX, vLRScaleY, vLRScaleZ, currentChunk, 3);
			this.buildBlockFace(x, y, z, tiletype, vFBOffsetX, vFBOffsetY, vFBOffsetZ, vFBScaleX, vFBScaleY, vFBScaleZ, currentChunk, 5);
			this.buildBlockFace(x, y, z, tiletype, vFBOffsetX, vFBOffsetY, vFBOffsetZ, vFBScaleX, vFBScaleY, vFBScaleZ, currentChunk, 4);
			nToDraw = nToDraw & 3;
		}
		else if (this.game.blocktypes[tiletype].drawType == 6 || this.game.blocktypes[tiletype].drawType == 7) {
			boolean blnDrawn = false;
			float fOffset = 0.025f;
			if (currentChunk[(zz * 18 + yy) * 18 + xx - 1] == 0 && currentChunk[(zz * 18 + yy) * 18 + xx + 1] == 0) {
				nToDraw = 8;
				vOffsetX = 0;
				vOffsetY = fOffset;
				vOffsetZ = 0;
				blnDrawn = true;
			}
			if (!blnDrawn || currentChunk[(zz * 18 + yy - 1) * 18 + xx] == 0 && currentChunk[(zz * 18 + yy + 1) * 18 + xx] == 0) {
				vOffsetX = fOffset;
				vOffsetY = 0;
				vOffsetZ = 0;
				nToDraw = 16;
			}
		}
		else if (this.game.blocktypes[tiletype].drawType == 10 || this.game.blocktypes[tiletype].drawType == 8) {
			boolean blnSideDrawn = false;
			if (currentChunk[(zz * 18 + yy) * 18 + xx - 1] != 0 || currentChunk[(zz * 18 + yy) * 18 + xx + 1] != 0) {
				this.buildBlockFace(x, y, z, tiletype, 0, -0.5f, 0, vScaleX, vScaleY, vScaleZ, currentChunk, 5);
				blnSideDrawn = true;
			}
			if (!blnSideDrawn || currentChunk[(zz * 18 + yy - 1) * 18 + xx] != 0 || currentChunk[(zz * 18 + yy + 1) * 18 + xx] != 0) {
				this.buildBlockFace(x, y, z, tiletype, 0.5f, 0, 0, vScaleX, vScaleY, vScaleZ, currentChunk, 2);
			}
			return;
		}
		else if (this.game.blocktypes[tiletype].drawType == 9) {
			vOffsetX = 0.025f;
			vOffsetY = 0.025f;
			vOffsetZ = 0;
			vScaleX = 0.95f;
			vScaleY = 0.95f;
			vScaleZ = 1f;
			nToDraw = 0;
			int ladderAtPositionMatchWall = this.getBestLadderWall(xx, yy, zz, currentChunk);
			if (ladderAtPositionMatchWall < 0) {
				int ladderbelow = this.getBestLadderInDirection(xx, yy, zz, currentChunk, -1);
				int ladderabove = this.getBestLadderInDirection(xx, yy, zz, currentChunk, 1);
				if (ladderbelow != 0) {
					ladderAtPositionMatchWall = this.getBestLadderWall(xx, yy, zz + ladderbelow, currentChunk);
				}
				else if (ladderabove != 0) {
					ladderAtPositionMatchWall = this.getBestLadderWall(xx, yy, zz + ladderabove, currentChunk);
				}
			}
			switch (ladderAtPositionMatchWall) {
			case 1:
				nToDraw |= 4;
				break;
			case 2:
				nToDraw |= 16;
				break;
			case 3:
				nToDraw |= 32;
				break;
			default:
				nToDraw |= 8;
				break;
			}
		}
		else if (this.game.blocktypes[tiletype].drawType == 11) {
			vScaleX = 1;
			vScaleY = 1;
			vScaleZ = 0.5f;
		}
		else if (this.game.blocktypes[tiletype].drawType == 12) {
			vScaleX = 1;
			vScaleY = 1;
			vScaleZ = 0.05f;
		}
		else if (this.game.blocktypes[tiletype].drawType == 4) {
			int type = 0;
			if (this.canSupportTorch(currentChunk[(zz * 18 + yy) * 18 + xx - 1])) {
				type = 3;
			}
			if (this.canSupportTorch(currentChunk[(zz * 18 + yy) * 18 + xx + 1])) {
				type = 4;
			}
			if (this.canSupportTorch(currentChunk[(zz * 18 + yy - 1) * 18 + xx])) {
				type = 1;
			}
			if (this.canSupportTorch(currentChunk[(zz * 18 + yy + 1) * 18 + xx])) {
				type = 2;
			}
			this.torchSideTexture = this.textureId(tiletype, 2);
			this.torchTopTexture = this.textureId(tiletype, 0);
			this.addTorch(x, y, z, type, tiletype);
			return;
		}
		else if (tiletype == 8) {
			if (currentChunk[((zz - 1) * 18 + yy) * 18 + xx] == 8) {
				vOffsetX = 0;
				vOffsetY = 0;
				vOffsetZ = -0.1f;
			}
			else {
				vScaleX = 1;
				vScaleY = 1;
				vScaleZ = 0.9f;
			}
		}
		else {
			int rail = this.rail(tiletype);
			if (rail != 0) {
				int slope = this.getRailSlope(xx, yy, zz);
				float fSlopeMod = 1f;
				vScaleX = 1f;
				vScaleY = 1f;
				vScaleZ = 0.3f;
				if (slope == 2) {
					this.ref_blockCornerHeight[1] = fSlopeMod;
					this.ref_blockCornerHeight[3] = fSlopeMod;
				}
				else if (slope == 1) {
					this.ref_blockCornerHeight[0] = fSlopeMod;
					this.ref_blockCornerHeight[2] = fSlopeMod;
				}
				else if (slope == 3) {
					this.ref_blockCornerHeight[0] = fSlopeMod;
					this.ref_blockCornerHeight[1] = fSlopeMod;
				}
				else if (slope == 4) {
					this.ref_blockCornerHeight[2] = fSlopeMod;
					this.ref_blockCornerHeight[3] = fSlopeMod;
				}
			}
		}
		for (int i = 0; i < 6; i++) {
			if ((nToDraw & TileSideEnum.toFlags(i)) != 0) {
				this.buildBlockFace(x, y, z, tiletype, vOffsetX, vOffsetY, vOffsetZ, vScaleX, vScaleY, vScaleZ, currentChunk, i);
			}
		}
	}

	private void calcShadowRation(int nDir1, int nDir2, int nDirBetween, int nCorner, float[] fShadowRation, boolean[] occupied, int[] shadowRationInt)
	{
		if (occupied[nDir1] && occupied[nDir2]) {
			fShadowRation[nCorner] *= this.halfocc;
		}
		else {
			byte facesconsidered = 1;
			if (!occupied[nDir1]) {
				fShadowRation[nCorner] += this.lightlevels[shadowRationInt[nDir1]];
				(facesconsidered & 0xff)++;
			}
			if (!occupied[nDir2]) {
				fShadowRation[nCorner] += this.lightlevels[shadowRationInt[nDir2]];
				(facesconsidered & 0xff)++;
			}
			if (!occupied[nDirBetween]) {
				fShadowRation[nCorner] += this.lightlevels[shadowRationInt[nDirBetween]];
				(facesconsidered & 0xff)++;
			}
			fShadowRation[nCorner] /= facesconsidered;
			if (occupied[nDir1] || occupied[nDir2] || occupied[nDirBetween]) {
				fShadowRation[nCorner] *= this.occ;
			}
		}
	}

	public final void calculateTilingCount(int[] currentChunk, int startx, int starty, int startz)
	{
		for (int i = 0; i < 4096; i++) {
			if (this.currentChunkDrawCount16[i] == null) {
				this.currentChunkDrawCount16[i] = new byte[6];
			}
			this.currentChunkDrawCount16[i][0] = 0;
			this.currentChunkDrawCount16[i][1] = 0;
			this.currentChunkDrawCount16[i][2] = 0;
			this.currentChunkDrawCount16[i][3] = 0;
			this.currentChunkDrawCount16[i][4] = 0;
			this.currentChunkDrawCount16[i][5] = 0;
		}
		{
			int[] currentChunk_ = currentChunk;
			for (int zz = 1; zz < 17; zz++) {
				for (int yy = 1; yy < 17; yy++) {
					int pos = (zz * 18 + yy) * 18 + 0;
					for (int xx = 1; xx < 17; xx++) {
						int tt = currentChunk_[pos + xx];
						if (tt == 0) {
							continue;
						}
						int x = startx + xx - 1;
						int y = starty + yy - 1;
						int z = startz + zz - 1;
						int draw = this.currentChunkDraw16[((zz - 1) * 16 + yy - 1) * 16 + xx - 1] & 0xff;
						if (draw == 0) {
							continue;
						}
						if ((draw & 1) != 0) {
							int shadowratioTop = this.getShadowRatio(xx, yy, zz + 1);
							this.currentChunkDrawCount16[((zz - 1) * 16 + yy - 1) * 16 + xx - 1][0] = 1;
						}
						if ((draw & 2) != 0) {
							int shadowratioTop = this.getShadowRatio(xx, yy, zz - 1);
							this.currentChunkDrawCount16[((zz - 1) * 16 + yy - 1) * 16 + xx - 1][1] = 1;
						}
						if ((draw & 4) != 0) {
							int shadowratioTop = this.getShadowRatio(xx - 1, yy, zz);
							this.currentChunkDrawCount16[((zz - 1) * 16 + yy - 1) * 16 + xx - 1][2] = 1;
						}
						if ((draw & 8) != 0) {
							int shadowratioTop = this.getShadowRatio(xx + 1, yy, zz);
							this.currentChunkDrawCount16[((zz - 1) * 16 + yy - 1) * 16 + xx - 1][3] = 1;
						}
						if ((draw & 16) != 0) {
							int shadowratioTop = this.getShadowRatio(xx, yy - 1, zz);
							this.currentChunkDrawCount16[((zz - 1) * 16 + yy - 1) * 16 + xx - 1][4] = 1;
						}
						if ((draw & 32) != 0) {
							int shadowratioTop = this.getShadowRatio(xx, yy + 1, zz);
							this.currentChunkDrawCount16[((zz - 1) * 16 + yy - 1) * 16 + xx - 1][5] = 1;
						}
					}
				}
			}
		}
	}

	public final void calculateVisibleFaces(int[] currentChunk)
	{
		int movez = 324;
		for (int zz = 1; zz < 17; zz++) {
			for (int yy = 1; yy < 17; yy++) {
				int posstart = (zz * 18 + yy) * 18 + 0;
				for (int xx = 1; xx < 17; xx++) {
					int pos = posstart + xx;
					int tt = currentChunk[pos];
					if (tt == 0) {
						continue;
					}
					int draw = 0;
					int[] nPos = this.tmpnPos;
					nPos[0] = pos + movez;
					nPos[1] = pos - movez;
					nPos[5] = pos + 18;
					nPos[4] = pos - 18;
					nPos[2] = pos - 1;
					nPos[3] = pos + 1;
					boolean blnIsFluid = this.isFluid[tt];
					boolean blnIsLowered = this.isLowered[tt];
					draw |= this.getFaceVisibility(0, currentChunk, nPos, blnIsFluid, blnIsLowered);
					draw |= this.getFaceVisibility(1, currentChunk, nPos, blnIsFluid, blnIsLowered);
					draw |= this.getFaceVisibility(2, currentChunk, nPos, blnIsFluid, blnIsLowered);
					draw |= this.getFaceVisibility(3, currentChunk, nPos, blnIsFluid, blnIsLowered);
					draw |= this.getFaceVisibility(4, currentChunk, nPos, blnIsFluid, blnIsLowered);
					draw |= this.getFaceVisibility(5, currentChunk, nPos, blnIsFluid, blnIsLowered);
					if (blnIsLowered && draw > 0) {
						if (!TileSideFlagsEnum.hasFlag(draw, 1)) {
							if (TileSideFlagsEnum.hasFlag(draw, 60)) {
								draw |= 1;
							}
						}
						int nRail = this.rail(tt);
						if (nRail > 0) {
							int nSlope = this.getRailSlope(xx, yy, zz);
							switch (nSlope) {
							case 4:
								draw |= 52;
								break;
							case 3:
								draw |= 56;
								break;
							case 1:
								draw |= 28;
								break;
							case 2:
								draw |= 44;
								break;
							}
						}
					}
					this.currentChunkDraw16[((zz - 1) * 16 + yy - 1) * 16 + xx - 1] = Game.intToByte(draw);
				}
			}
		}
	}

	public final boolean canSupportTorch(int blocktype)
	{
		return blocktype != 0 && this.game.blocktypes[blocktype].drawType != 4;
	}

	private int colorMultiply(int color, float fValue)
	{
		return Game.colorFromArgb(Game.colorA(color), this.game.platform.floatToInt(Game.colorR(color) * fValue), this.game.platform.floatToInt(Game.colorG(color) * fValue), this.game.platform.floatToInt(Game.colorB(color) * fValue));
	}

	private void drawBlockFace(int x, int y, int z, int tileType, int tileSide, float vOffsetX, float vOffsetY, float vOffsetZ, float vScaleX, float vScaleY, float vScaleZ, VecCito3i[] vNeighbors, float[] fShadowRation)
	{
		int color = this._colorWhite;
		if (this.option_DarkenBlockSides) {
			switch (tileSide) {
			case 1:
			case 2:
			case 3:
				color = this.colorMultiply(color, this.blockShadow);
				break;
			}
		}
		int sidetexture = this.textureId(tileType, tileSide);
		ModelData toreturn = this.getModelData(tileType, sidetexture);
		float texrecTop = this.terrainTexturesPerAtlasInverse * sidetexture % this.terrainTexturesPerAtlas + this.atiArtifactFix * this.terrainTexturesPerAtlasInverse;
		float texrecBottom = texrecTop + this._texrecHeight;
		int lastelement = toreturn.verticesCount;
		VecCito3i v = this.tmpv;
		float fSlopeModifier = 0f;
		vNeighbors[5].add(1, 1, 1, v);
		fSlopeModifier = this.getCornerHeightModifier(tileSide, 1);
		float xPos = x + vOffsetX + v.x * 0.5f * vScaleX;
		float zPos = z + vOffsetZ + v.z * 0.5f * vScaleZ + fSlopeModifier;
		float yPos = y + vOffsetY + v.y * 0.5f * vScaleY;
		ModelDataTool.addVertex(toreturn, xPos, zPos, yPos, this._texrecRight, texrecTop, this.colorMultiply(color, fShadowRation[1]));
		vNeighbors[4].add(1, 1, 1, v);
		fSlopeModifier = this.getCornerHeightModifier(tileSide, 0);
		xPos = x + vOffsetX + v.x * 0.5f * vScaleX;
		zPos = z + vOffsetZ + v.z * 0.5f * vScaleZ + fSlopeModifier;
		yPos = y + vOffsetY + v.y * 0.5f * vScaleY;
		ModelDataTool.addVertex(toreturn, xPos, zPos, yPos, this._texrecLeft, texrecTop, this.colorMultiply(color, fShadowRation[0]));
		vNeighbors[7].add(1, 1, 1, v);
		fSlopeModifier = this.getCornerHeightModifier(tileSide, 3);
		xPos = x + vOffsetX + v.x * 0.5f * vScaleX;
		zPos = z + vOffsetZ + v.z * 0.5f * vScaleZ + fSlopeModifier;
		yPos = y + vOffsetY + v.y * 0.5f * vScaleY;
		ModelDataTool.addVertex(toreturn, xPos, zPos, yPos, this._texrecRight, texrecBottom, this.colorMultiply(color, fShadowRation[3]));
		vNeighbors[6].add(1, 1, 1, v);
		fSlopeModifier = this.getCornerHeightModifier(tileSide, 2);
		xPos = x + vOffsetX + v.x * 0.5f * vScaleX;
		zPos = z + vOffsetZ + v.z * 0.5f * vScaleZ + fSlopeModifier;
		yPos = y + vOffsetY + v.y * 0.5f * vScaleY;
		ModelDataTool.addVertex(toreturn, xPos, zPos, yPos, this._texrecLeft, texrecBottom, this.colorMultiply(color, fShadowRation[2]));
		{
			ModelDataTool.addIndex(toreturn, lastelement + 0);
			ModelDataTool.addIndex(toreturn, lastelement + 1);
			ModelDataTool.addIndex(toreturn, lastelement + 2);
			ModelDataTool.addIndex(toreturn, lastelement + 1);
			ModelDataTool.addIndex(toreturn, lastelement + 3);
			ModelDataTool.addIndex(toreturn, lastelement + 2);
		}
	}
	boolean eNABLE_TEXTURE_TILING;
	boolean enableSmoothLight;

	private float getCornerHeightModifier(int side, int corner)
	{
		int nIndex = -1;
		switch (side) {
		case 1:
			{
				nIndex = -1;
				break;
			}
		case 3:
			switch (corner) {
			case 1:
				nIndex = 1;
				break;
			case 0:
				nIndex = 3;
				break;
			}
			break;
		case 2:
			switch (corner) {
			case 0:
				nIndex = 0;
				break;
			case 1:
				nIndex = 2;
				break;
			}
			break;
		case 5:
			switch (corner) {
			case 0:
				nIndex = 2;
				break;
			case 1:
				nIndex = 3;
				break;
			}
			break;
		case 4:
			switch (corner) {
			case 0:
				nIndex = 1;
				break;
			case 1:
				nIndex = 0;
				break;
			}
			break;
		case 0:
			nIndex = corner;
			break;
		}
		if (nIndex != -1) {
			return this.ref_blockCornerHeight[nIndex];
		}
		else {
			return 0f;
		}
	}

	private int getFaceVisibility(int nSide, int[] currentChunk, int[] nPos, boolean blnIsFluid, boolean blnIsLowered)
	{
		int nReturn = 0;
		int nIndex = nPos[nSide];
		int tt2 = currentChunk[nIndex];
		if (tt2 == 0 || this.istransparent[tt2] && !this.isLowered[tt2] || this.isFluid[tt2] && !blnIsFluid) {
			nReturn |= TileSideEnum.toFlags(nSide);
		}
		else if (blnIsFluid && nSide != 1) {
			if (this.isFluid[currentChunk[nPos[1]]]) {
				if (!this.isFluid[tt2]) {
					int movez = 324;
					int nPos2 = nPos[nSide] - movez;
					if (nPos2 > 0 && this.isFluid[currentChunk[nPos2]]) {
						nReturn |= TileSideEnum.toFlags(nSide);
					}
				}
			}
			else {
			}
		}
		if (this.isLowered[tt2] && nSide != 0) {
			if (!blnIsLowered) {
				nReturn |= TileSideEnum.toFlags(nSide);
			}
			else if (nSide == 1) {
				nReturn |= 2;
			}
			else {
				nReturn |= 1;
			}
		}
		return nReturn;
	}

	public final VerticesIndicesToLoad[] getFinalVerticesIndices(int x, int y, int z, IntRef retCount)
	{
		VerticesIndicesToLoad[] ret = new VerticesIndicesToLoad[this.toreturnatlas1dLength + this.toreturnatlas1dLength];
		retCount.value = 0;
		for (int i = 0; i < this.toreturnatlas1dLength; i++) {
			if (this.toreturnatlas1d[i].indicesCount > 0) {
				ret[retCount.value++] = this.getVerticesIndices(this.toreturnatlas1d[i], x, y, z, this.game.d_TerrainTextures.terrainTextures1d()[i % this.game.d_TerrainTextures.terrainTexturesPerAtlas()], false);
			}
		}
		for (int i = 0; i < this.toreturnatlas1dLength; i++) {
			if (this.toreturnatlas1dtransparent[i].indicesCount > 0) {
				ret[retCount.value++] = this.getVerticesIndices(this.toreturnatlas1dtransparent[i], x, y, z, this.game.d_TerrainTextures.terrainTextures1d()[i % this.game.d_TerrainTextures.terrainTexturesPerAtlas()], true);
			}
		}
		return ret;
	}

	public final ModelData getModelData(int tiletype, int textureid)
	{
		if (this.isFluid[tiletype] || this.istransparent[tiletype] && !this.isLowered[tiletype]) {
			return this.toreturnatlas1dtransparent[textureid / this.game.terrainTexturesPerAtlas];
		}
		else {
			return this.toreturnatlas1d[textureid / this.game.terrainTexturesPerAtlas];
		}
	}

	public final int getRailSlope(int xx, int yy, int zz)
	{
		int tiletype = this.currentChunk18[(zz * 18 + yy) * 18 + xx];
		int rail = this.rail(tiletype);
		int blocknear;
		{
			blocknear = this.currentChunk18[(zz * 18 + yy) * 18 + xx + 1];
			if (rail == 1 && blocknear != 0 && this.rail(blocknear) == 0) {
				return 2;
			}
		}
		{
			blocknear = this.currentChunk18[(zz * 18 + yy) * 18 + xx - 1];
			if (rail == 1 && blocknear != 0 && this.rail(blocknear) == 0) {
				return 1;
			}
		}
		{
			blocknear = this.currentChunk18[(zz * 18 + yy - 1) * 18 + xx];
			if (rail == 2 && blocknear != 0 && this.rail(blocknear) == 0) {
				return 3;
			}
		}
		{
			blocknear = this.currentChunk18[(zz * 18 + yy + 1) * 18 + xx];
			if (rail == 2 && blocknear != 0 && this.rail(blocknear) == 0) {
				return 4;
			}
		}
		return 0;
	}

	public final int getShadowRatio(int xx, int yy, int zz)
	{
		return this.currentChunkShadows18[(zz * 18 + yy) * 18 + xx] & 0xff;
	}

	public final int getShadowRatioOld(int xx, int yy, int zz, int globalx, int globaly, int globalz)
	{
		return this.getShadowRatio(xx, yy, zz);
	}

	public final int getShadowRatioVec(VecCito3i v)
	{
		return this.getShadowRatio(v.x, v.y, v.z);
	}

	public final int getTilingCount(int[] currentChunk, int xx, int yy, int zz, int tt, int x, int y, int z, int shadowratio, int dir, int dirflags)
	{
		if (!this.eNABLE_TEXTURE_TILING) {
			return 1;
		}
		if (this.istransparent[currentChunk[(zz * 18 + yy) * 18 + xx]] && !this.isTransparentFully(currentChunk[(zz * 18 + yy) * 18 + xx])) {
			return 1;
		}
		if (dir == 0 || dir == 1) {
			int shadowz = dir == 0 ? 1 : -1;
			int newxx = xx + 1;
			for (;;) {
				if (newxx >= 17) {
					break;
				}
				if (currentChunk[(zz * 18 + yy) * 18 + newxx] != tt) {
					break;
				}
				int shadowratio2 = this.getShadowRatioOld(newxx, yy, zz + shadowz, x + newxx - xx, y, z + shadowz);
				if (shadowratio != shadowratio2) {
					break;
				}
				if ((this.currentChunkDraw16[((zz - 1) * 16 + yy - 1) * 16 + newxx - 1] & 0xff & dirflags) == 0) {
					break;
				}
				this.currentChunkDrawCount16[((zz - 1) * 16 + yy - 1) * 16 + newxx - 1][dir] = 0;
				this.currentChunkDraw16[((zz - 1) * 16 + yy - 1) * 16 + newxx - 1] &= Game.intToByte(~dirflags);
				newxx++;
			}
			return newxx - xx;
		}
		else if (dir == 5 || dir == 4) {
			int shadowx = dir == 5 ? -1 : 1;
			int newyy = yy + 1;
			for (;;) {
				if (newyy >= 17) {
					break;
				}
				if (currentChunk[(zz * 18 + newyy) * 18 + xx] != tt) {
					break;
				}
				int shadowratio2 = this.getShadowRatioOld(xx + shadowx, newyy, zz, x + shadowx, y + newyy - yy, z);
				if (shadowratio != shadowratio2) {
					break;
				}
				if ((this.currentChunkDraw16[((zz - 1) * 16 + newyy - 1) * 16 + xx - 1] & 0xff & dirflags) == 0) {
					break;
				}
				this.currentChunkDrawCount16[((zz - 1) * 16 + newyy - 1) * 16 + xx - 1][dir] = 0;
				this.currentChunkDraw16[((zz - 1) * 16 + newyy - 1) * 16 + xx - 1] &= Game.intToByte(~dirflags);
				newyy++;
			}
			return newyy - yy;
		}
		else {
			int shadowy = dir == 2 ? -1 : 1;
			int newxx = xx + 1;
			for (;;) {
				if (newxx >= 17) {
					break;
				}
				if (currentChunk[(zz * 18 + yy) * 18 + newxx] != tt) {
					break;
				}
				int shadowratio2 = this.getShadowRatioOld(newxx, yy + shadowy, zz, x + newxx - xx, y + shadowy, z);
				if (shadowratio != shadowratio2) {
					break;
				}
				if ((this.currentChunkDraw16[((zz - 1) * 16 + yy - 1) * 16 + newxx - 1] & 0xff & dirflags) == 0) {
					break;
				}
				this.currentChunkDrawCount16[((zz - 1) * 16 + yy - 1) * 16 + newxx - 1][dir] = 0;
				this.currentChunkDraw16[((zz - 1) * 16 + yy - 1) * 16 + newxx - 1] &= Game.intToByte(~dirflags);
				newxx++;
			}
			return newxx - xx;
		}
	}

	private int getToDrawFlags(int xx, int yy, int zz)
	{
		int nToDraw = 0;
		byte[] drawFlags = this.currentChunkDrawCount16[((zz - 1) * 16 + yy - 1) * 16 + xx - 1];
		nToDraw = this.setVisibleFlag(drawFlags, 0, nToDraw, 1);
		nToDraw = this.setVisibleFlag(drawFlags, 1, nToDraw, 2);
		nToDraw = this.setVisibleFlag(drawFlags, 2, nToDraw, 4);
		nToDraw = this.setVisibleFlag(drawFlags, 3, nToDraw, 8);
		nToDraw = this.setVisibleFlag(drawFlags, 4, nToDraw, 16);
		nToDraw = this.setVisibleFlag(drawFlags, 5, nToDraw, 32);
		return nToDraw;
	}

	public final VerticesIndicesToLoad getVerticesIndices(ModelData m, int x, int y, int z, int texture, boolean transparent)
	{
		VerticesIndicesToLoad v = new VerticesIndicesToLoad();
		v.modelData = m;
		v.positionX = x * 16;
		v.positionY = y * 16;
		v.positionZ = z * 16;
		v.texture = texture;
		v.transparent = transparent;
		return v;
	}

	public final boolean isFlower(int tiletype)
	{
		return this.game.blocktypes[tiletype].drawType == 5;
	}

	public final boolean isTransparentForLight(int block)
	{
		Packet_BlockType b = this.game.blocktypes[block];
		return b.drawType != 1 && b.drawType != 8;
	}

	public final boolean isTransparentFully(int p)
	{
		Packet_BlockType b = this.game.blocktypes[p];
		return b.drawType != 1 && b.drawType != 5 && b.drawType != 6 && b.drawType != 7 && b.drawType != 8;
	}

	public final VerticesIndicesToLoad[] makeChunk(int x, int y, int z, int[] chunk18, byte[] shadows18, float[] lightlevels_, IntRef retCount)
	{
		this.currentChunk18 = chunk18;
		this.currentChunkShadows18 = shadows18;
		this.lightlevels = lightlevels_;
		for (int i = 0; i < 1024; i++) {
			Packet_BlockType b = this.game.blocktypes[i];
			if (b == null) {
				continue;
			}
			this.istransparent[i] = b.drawType != 1 && b.drawType != 3;
			if (b.drawType == 11 || b.drawType == 12 || b.getRail() != 0) {
				this.isLowered[i] = true;
			}
			this.isFluid[i] = b.drawType == 3;
		}
		if (x < 0 || y < 0 || z < 0) {
			retCount.value = 0;
			return new VerticesIndicesToLoad[0];
		}
		if (!this.started) {
			this.game.platform.throwException("not started");
		}
		if (x >= this.mapsizex / 16 || y >= this.mapsizey / 16 || z >= this.mapsizez / 16) {
			retCount.value = 0;
			return new VerticesIndicesToLoad[0];
		}
		for (int i = 0; i < this.toreturnatlas1dLength; i++) {
			this.toreturnatlas1d[i].verticesCount = 0;
			this.toreturnatlas1d[i].indicesCount = 0;
			this.toreturnatlas1dtransparent[i].verticesCount = 0;
			this.toreturnatlas1dtransparent[i].indicesCount = 0;
		}
		this.calculateVisibleFaces(this.currentChunk18);
		this.calculateTilingCount(this.currentChunk18, x * 16, y * 16, z * 16);
		this.buildBlockPolygons(x, y, z);
		VerticesIndicesToLoad[] ret = this.getFinalVerticesIndices(x, y, z, retCount);
		return ret;
	}

	private int max(int a, int b)
	{
		if (a > b) {
			return a;
		}
		else {
			return b;
		}
	}

	private final float min(float a, float b)
	{
		if (a < b) {
			return a;
		}
		else {
			return b;
		}
	}

	public final int rail(int tiletype)
	{
		return this.game.blocktypes[tiletype].rail;
	}

	private int setVisibleFlag(byte[] drawFlags, int tileSideIndex, int nCurrentFlags, int nFlagToSet)
	{
		if ((drawFlags[tileSideIndex] & 0xff) > 0) {
			return nCurrentFlags | nFlagToSet;
		}
		else {
			return nCurrentFlags;
		}
	}

	public final void start()
	{
		this.currentChunk18 = new int[5832];
		this.currentChunkShadows18 = new byte[5832];
		this.currentChunkDraw16 = new byte[4096];
		this.currentChunkDrawCount16 = new byte[4096][];
		this.mapsizex = this.game.map.mapSizeX;
		this.mapsizey = this.game.map.mapSizeY;
		this.mapsizez = this.game.map.mapSizeZ;
		this.started = true;
		this.istransparent = new boolean[1024];
		for (int i = 0; i < 1024; i++) {
			this.istransparent[i] = false;
		}
		this.isLowered = new boolean[1024];
		for (int i = 0; i < 1024; i++) {
			this.isLowered[i] = false;
		}
		this.isFluid = new boolean[1024];
		for (int i = 0; i < 1024; i++) {
			this.isFluid[i] = false;
		}
		this.maxlightInverse = 1f / 15;
		this.terrainTexturesPerAtlas = this.game.terrainTexturesPerAtlas;
		this.terrainTexturesPerAtlasInverse = 1f / this.game.terrainTexturesPerAtlas;
		if (this.game.platform.isFastSystem()) {
			this.atiArtifactFix = 1 / 32f * 0.25f;
		}
		else {
			this.atiArtifactFix = 1 / 32f * 1.5f;
		}
		this._texrecWidth = 1 - this.atiArtifactFix * 2;
		this._texrecHeight = this.terrainTexturesPerAtlasInverse * (1 - this.atiArtifactFix * 2);
		this._texrecLeft = this.atiArtifactFix;
		this._texrecRight = this._texrecLeft + this._texrecWidth;
		this.toreturnatlas1dLength = this.max(1, 1024 / this.game.terrainTexturesPerAtlas);
		this.toreturnatlas1d = new ModelData[this.toreturnatlas1dLength];
		this.toreturnatlas1dtransparent = new ModelData[this.toreturnatlas1dLength];
		for (int i = 0; i < this.toreturnatlas1dLength; i++) {
			this.toreturnatlas1d[i] = new ModelData();
			int max = 1024;
			this.toreturnatlas1d[i].xyz = new float[max * 3];
			this.toreturnatlas1d[i].uv = new float[max * 2];
			this.toreturnatlas1d[i].rgba = new byte[max * 4];
			this.toreturnatlas1d[i].indices = new int[max];
			this.toreturnatlas1d[i].verticesMax = max;
			this.toreturnatlas1d[i].indicesMax = max;
			this.toreturnatlas1dtransparent[i] = new ModelData();
			this.toreturnatlas1dtransparent[i].xyz = new float[max * 3];
			this.toreturnatlas1dtransparent[i].uv = new float[max * 2];
			this.toreturnatlas1dtransparent[i].rgba = new byte[max * 4];
			this.toreturnatlas1dtransparent[i].indices = new int[max];
			this.toreturnatlas1dtransparent[i].verticesMax = max;
			this.toreturnatlas1dtransparent[i].indicesMax = max;
		}
	}

	public final int textureId(int tiletype, int side)
	{
		return this.game.textureId[tiletype][side];
	}
	int torchSideTexture;
	int torchTopTexture;
	int _colorWhite;
	float _texrecHeight;
	float _texrecLeft;
	float _texrecRight;
	float _texrecWidth;
	private VecCito3i[][] c_OcclusionNeighbors;
	int[] currentChunk18;
	byte[] currentChunkDraw16;
	byte[][] currentChunkDrawCount16;
	byte[] currentChunkShadows18;
	Game game;

	public final int getBestLadderInDirection(int x, int y, int z, int[] currentChunk, int dir)
	{
		int dz = dir;
		int result = 0;
		{
			while (((z + dz) * 18 + y) * 18 + x >= 0 && ((z + dz) * 18 + y) * 18 + x < 5832 && currentChunk[((z + dz) * 18 + y) * 18 + x] == 152) {
				result = dz;
				if (this.getBestLadderWall(x, y, z + dz, currentChunk) != -1)
					return result;
				dz += dir;
			}
		}
		return 0;
	}

	public final int getBestLadderWall(int x, int y, int z, int[] currentChunk)
	{
		boolean front = false;
		boolean back = false;
		boolean left = false;
		int wallscount = 0;
		if (currentChunk[(z * 18 + y - 1) * 18 + x] != 0) {
			front = true;
			wallscount++;
		}
		if (currentChunk[(z * 18 + y + 1) * 18 + x] != 0) {
			back = true;
			wallscount++;
		}
		int c = currentChunk[(z * 18 + y) * 18 + x - 1];
		if (c != 0) {
			left = true;
			wallscount++;
		}
		if (currentChunk[(z * 18 + y) * 18 + x + 1] != 0) {
			wallscount++;
		}
		if (wallscount != 1) {
			return -1;
		}
		else {
			if (front) {
				return 0;
			}
			else if (back) {
				return 1;
			}
			else if (left) {
				return 2;
			}
			else {
				return 3;
			}
		}
	}
	float halfocc;
	boolean[] isFluid;
	boolean[] isLowered;
	boolean[] istransparent;

	public final boolean isvalid(int tt)
	{
		return this.game.blocktypes[tt].name != null;
	}
	float[] lightlevels;
	int mapsizex;
	int mapsizey;
	int mapsizez;
	float maxlightInverse;
	float occ;
	boolean option_DarkenBlockSides;
	boolean option_DoNotDrawEdges;
	private float[] ref_blockCornerHeight;
	boolean started;
	int terrainTexturesPerAtlas;
	float terrainTexturesPerAtlasInverse;
	private float[] tmpfShadowRation;
	private int[] tmpnPos;
	private boolean[] tmpoccupied;
	private int[] tmpshadowration;
	private VecCito3i tmpv;
	ModelData[] toreturnatlas1d;
	private int toreturnatlas1dLength;
	ModelData[] toreturnatlas1dtransparent;
}
