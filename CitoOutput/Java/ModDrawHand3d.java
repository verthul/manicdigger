// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class ModDrawHand3d extends ClientMod
{
	public ModDrawHand3d()
	{
		this.one = 1;
		this.attackt = 0;
		this.buildt = 0;
		this.range = this.one * 7 / 100;
		this.speed = 5;
		this.animperiod = Game.getPi() / (this.speed / 2);
		this.zzzposz = 0;
		this.t_ = 0;
		this.zzzx = -27;
		this.zzzy = -this.one * 137 / 10;
		this.zzzposx = -this.one * 2 / 10;
		this.zzzposy = -this.one * 4 / 10;
		this.attack = -1;
		this.build = false;
		this.slowdownTimerSpecial = 32000;
		this.d_BlockRendererTorch = new BlockRendererTorch();
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

	private void drawCube(ModelData m, int x, int y, int z, int c)
	{
		{
			int sidetexture = this.getWeaponTextureId(0);
			RectFRef texrec = TextureAtlas.textureCoords2d(sidetexture, this.texturesPacked());
			int lastelement = m.getVerticesCount();
			this.addVertex(m, x + 0, z + 1, y + 0, texrec.left(), texrec.top(), c);
			this.addVertex(m, x + 0, z + 1, y + 1, texrec.left(), texrec.bottom(), c);
			this.addVertex(m, x + 1, z + 1, y + 0, texrec.right(), texrec.top(), c);
			this.addVertex(m, x + 1, z + 1, y + 1, texrec.right(), texrec.bottom(), c);
			m.indices[m.indicesCount++] = lastelement + 0;
			m.indices[m.indicesCount++] = lastelement + 1;
			m.indices[m.indicesCount++] = lastelement + 2;
			m.indices[m.indicesCount++] = lastelement + 1;
			m.indices[m.indicesCount++] = lastelement + 3;
			m.indices[m.indicesCount++] = lastelement + 2;
		}
		{
			int sidetexture = this.getWeaponTextureId(1);
			RectFRef texrec = TextureAtlas.textureCoords2d(sidetexture, this.texturesPacked());
			int lastelement = m.getVerticesCount();
			this.addVertex(m, x + 0, z, y + 0, texrec.left(), texrec.top(), c);
			this.addVertex(m, x + 0, z, y + 1, texrec.left(), texrec.bottom(), c);
			this.addVertex(m, x + 1, z, y + 0, texrec.right(), texrec.top(), c);
			this.addVertex(m, x + 1, z, y + 1, texrec.right(), texrec.bottom(), c);
			m.indices[m.indicesCount++] = lastelement + 1;
			m.indices[m.indicesCount++] = lastelement + 0;
			m.indices[m.indicesCount++] = lastelement + 2;
			m.indices[m.indicesCount++] = lastelement + 3;
			m.indices[m.indicesCount++] = lastelement + 1;
			m.indices[m.indicesCount++] = lastelement + 2;
		}
		{
			int sidetexture = this.getWeaponTextureId(2);
			RectFRef texrec = TextureAtlas.textureCoords2d(sidetexture, this.texturesPacked());
			int lastelement = m.getVerticesCount();
			this.addVertex(m, x + 0, z + 0, y + 0, texrec.left(), texrec.bottom(), c);
			this.addVertex(m, x + 0, z + 0, y + 1, texrec.right(), texrec.bottom(), c);
			this.addVertex(m, x + 0, z + 1, y + 0, texrec.left(), texrec.top(), c);
			this.addVertex(m, x + 0, z + 1, y + 1, texrec.right(), texrec.top(), c);
			m.indices[m.indicesCount++] = lastelement + 0;
			m.indices[m.indicesCount++] = lastelement + 1;
			m.indices[m.indicesCount++] = lastelement + 2;
			m.indices[m.indicesCount++] = lastelement + 1;
			m.indices[m.indicesCount++] = lastelement + 3;
			m.indices[m.indicesCount++] = lastelement + 2;
		}
		{
			int sidetexture = this.getWeaponTextureId(3);
			RectFRef texrec = TextureAtlas.textureCoords2d(sidetexture, this.texturesPacked());
			int lastelement = m.getVerticesCount();
			this.addVertex(m, x + 1, z + 0, y + 0, texrec.left(), texrec.bottom(), c);
			this.addVertex(m, x + 1, z + 0, y + 1, texrec.right(), texrec.bottom(), c);
			this.addVertex(m, x + 1, z + 1, y + 0, texrec.left(), texrec.top(), c);
			this.addVertex(m, x + 1, z + 1, y + 1, texrec.right(), texrec.top(), c);
			m.indices[m.indicesCount++] = lastelement + 1;
			m.indices[m.indicesCount++] = lastelement + 0;
			m.indices[m.indicesCount++] = lastelement + 2;
			m.indices[m.indicesCount++] = lastelement + 3;
			m.indices[m.indicesCount++] = lastelement + 1;
			m.indices[m.indicesCount++] = lastelement + 2;
		}
		{
			int sidetexture = this.getWeaponTextureId(4);
			RectFRef texrec = TextureAtlas.textureCoords2d(sidetexture, this.texturesPacked());
			int lastelement = m.getVerticesCount();
			this.addVertex(m, x + 0, z + 0, y + 0, texrec.left(), texrec.bottom(), c);
			this.addVertex(m, x + 0, z + 1, y + 0, texrec.left(), texrec.top(), c);
			this.addVertex(m, x + 1, z + 0, y + 0, texrec.right(), texrec.bottom(), c);
			this.addVertex(m, x + 1, z + 1, y + 0, texrec.right(), texrec.top(), c);
			m.indices[m.indicesCount++] = lastelement + 0;
			m.indices[m.indicesCount++] = lastelement + 1;
			m.indices[m.indicesCount++] = lastelement + 2;
			m.indices[m.indicesCount++] = lastelement + 1;
			m.indices[m.indicesCount++] = lastelement + 3;
			m.indices[m.indicesCount++] = lastelement + 2;
		}
		{
			int sidetexture = this.getWeaponTextureId(5);
			RectFRef texrec = TextureAtlas.textureCoords2d(sidetexture, this.texturesPacked());
			int lastelement = m.getVerticesCount();
			this.addVertex(m, x + 0, z + 0, y + 1, texrec.left(), texrec.bottom(), c);
			this.addVertex(m, x + 0, z + 1, y + 1, texrec.left(), texrec.top(), c);
			this.addVertex(m, x + 1, z + 0, y + 1, texrec.right(), texrec.bottom(), c);
			this.addVertex(m, x + 1, z + 1, y + 1, texrec.right(), texrec.top(), c);
			m.indices[m.indicesCount++] = lastelement + 1;
			m.indices[m.indicesCount++] = lastelement + 0;
			m.indices[m.indicesCount++] = lastelement + 2;
			m.indices[m.indicesCount++] = lastelement + 3;
			m.indices[m.indicesCount++] = lastelement + 1;
			m.indices[m.indicesCount++] = lastelement + 2;
		}
	}

	public final void drawWeapon(float dt)
	{
		int light;
		if (this.isTorch()) {
			light = 255;
		}
		else {
			light = this.game.platform.floatToInt(this.light() * 256);
			if (light > 255) {
				light = 255;
			}
			if (light < 0) {
				light = 0;
			}
		}
		this.game.platform.bindTexture2d(this.terrainTexture());
		Packet_Item item = this.game.d_Inventory.rightHand[this.game.activeMaterial];
		int curmaterial;
		if (item == null) {
			curmaterial = 0;
		}
		else {
			curmaterial = item.blockId == 151 ? 128 : item.blockId;
		}
		float curlight = this.light();
		if (curmaterial != this.oldMaterial || curlight != this.oldLight || this.modelData == null || this.game.handRedraw) {
			this.game.handRedraw = false;
			this.modelData = new ModelData();
			this.modelData.indices = new int[128];
			this.modelData.xyz = new float[128];
			this.modelData.uv = new float[128];
			this.modelData.rgba = new byte[128];
			int x = 0;
			int y = 0;
			int z = 0;
			if (this.isEmptyHand() || this.isCompass()) {
				this.d_BlockRendererTorch.topTexture = this.getWeaponTextureId(0);
				this.d_BlockRendererTorch.sideTexture = this.getWeaponTextureId(2);
				this.d_BlockRendererTorch.addTorch(this.game.d_Data, this.game, this.modelData, x, y, z, TorchType.NORMAL);
			}
			else if (this.isTorch()) {
				this.d_BlockRendererTorch.topTexture = this.getWeaponTextureId(0);
				this.d_BlockRendererTorch.sideTexture = this.getWeaponTextureId(2);
				this.d_BlockRendererTorch.addTorch(this.game.d_Data, this.game, this.modelData, x, y, z, TorchType.NORMAL);
			}
			else {
				this.drawCube(this.modelData, x, y, z, Game.colorFromArgb(255, light, light, light));
			}
		}
		this.oldMaterial = curmaterial;
		this.oldLight = curlight;
		this.game.platform.glClearDepthBuffer();
		this.game.gLMatrixModeModelView();
		this.game.gLPushMatrix();
		this.game.gLLoadIdentity();
		this.game.gLTranslate(this.one * 3 / 10 + this.zzzposz - this.attackt * 5, -(this.one * 15 / 10) + this.zzzposx - this.buildt * 10, -(this.one * 15 / 10) + this.zzzposy);
		this.game.gLRotate(30 + this.zzzx - this.attackt * 300, 1, 0, 0);
		this.game.gLRotate(60 + this.zzzy, 0, 1, 0);
		this.game.gLScale(this.one * 8 / 10, this.one * 8 / 10, this.one * 8 / 10);
		boolean move = !(this.oldplayerposX == this.game.player.position.x && this.oldplayerposY == this.game.player.position.y && this.oldplayerposZ == this.game.player.position.z);
		this.oldplayerposX = this.game.player.position.x;
		this.oldplayerposY = this.game.player.position.y;
		this.oldplayerposZ = this.game.player.position.z;
		if (move) {
			this.t_ += dt;
			this.slowdownTimer = this.slowdownTimerSpecial;
		}
		else {
			if (this.slowdownTimer == this.slowdownTimerSpecial) {
				this.slowdownTimer = this.animperiod / 2 - this.t_ % (this.animperiod / 2);
			}
			this.slowdownTimer -= dt;
			if (this.slowdownTimer < 0) {
				this.t_ = 0;
			}
			else {
				this.t_ += dt;
			}
		}
		this.zzzposx = this.rot(this.t_);
		this.zzzposz = this.rot2(this.t_);
		if (this.attack != -1) {
			this.attack += dt * 7;
			if (this.attack > Game.getPi() / 2) {
				this.attack = -1;
				if (this.build) {
					this.buildt = 0;
				}
				else {
					this.attackt = 0;
				}
			}
			else {
				if (this.build) {
					this.buildt = this.rot(this.attack / 5);
					this.attackt = 0;
				}
				else {
					this.attackt = this.rot(this.attack / 5);
					this.buildt = 0;
				}
			}
		}
		this.game.platform.glEnableTexture2d();
		this.game.platform.bindTexture2d(this.terrainTexture());
		this.game.drawModelData(this.modelData);
		this.game.gLPopMatrix();
	}

	public final int getWeaponTextureId(int side)
	{
		Packet_Item item = this.game.d_Inventory.rightHand[this.game.activeMaterial];
		if (item == null || this.isCompass() || item != null && item.blockId == 0) {
			if (side == 0) {
				return this.game.textureId[this.game.d_Data.blockIdEmptyHand()][0];
			}
			return this.game.textureId[this.game.d_Data.blockIdEmptyHand()][2];
		}
		if (item.itemClass == 0) {
			return this.game.textureId[item.blockId][side];
		}
		else {
			return 0;
		}
	}

	public final boolean isCompass()
	{
		Packet_Item item = this.game.d_Inventory.rightHand[this.game.activeMaterial];
		return item != null && item.itemClass == 0 && item.blockId == this.game.d_Data.blockIdCompass();
	}

	public final boolean isEmptyHand()
	{
		Packet_Item item = this.game.d_Inventory.rightHand[this.game.activeMaterial];
		return item == null || item.blockId == 0;
	}

	public final boolean isTorch()
	{
		Packet_Item item = this.game.d_Inventory.rightHand[this.game.activeMaterial];
		return item != null && item.itemClass == 0 && this.game.blocktypes[item.blockId].drawType == 4;
	}

	public final float light()
	{
		float posx = this.game.player.position.x;
		float posy = this.game.player.position.y;
		float posz = this.game.player.position.z;
		int light = this.game.getLight(this.game.platform.floatToInt(posx), this.game.platform.floatToInt(posz), this.game.platform.floatToInt(posy));
		return this.one * light / 15;
	}

	@Override
	public void onNewFrameDraw3d(Game game_, float deltaTime)
	{
		if (ModDrawHand2d.shouldDrawHand(game_)) {
			String img = ModDrawHand2d.handImage2d(game_);
			if (img == null) {
				this.game = game_;
				if (this.game.handSetAttackBuild) {
					this.setAttack(true, true);
					this.game.handSetAttackBuild = false;
				}
				if (this.game.handSetAttackDestroy) {
					this.setAttack(true, false);
					this.game.handSetAttackDestroy = false;
				}
				this.drawWeapon(deltaTime);
			}
		}
	}

	public final void setAttack(boolean isattack, boolean build)
	{
		this.build = build;
		if (isattack) {
			if (this.attack == -1) {
				this.attack = 0;
			}
		}
		else {
			this.attack = -1;
		}
	}
	private float animperiod;
	private float attack;
	private float attackt;
	private boolean build;
	private float buildt;
	BlockRendererTorch d_BlockRendererTorch;
	Game game;
	private ModelData modelData;
	private float oldLight;
	private int oldMaterial;
	private float oldplayerposX;
	private float oldplayerposY;
	private float oldplayerposZ;
	private float one;
	private float range;

	private float rot(float t)
	{
		return this.game.platform.mathSin(t * 2 * this.speed) * this.range;
	}

	private float rot2(float t)
	{
		return this.game.platform.mathSin((t + Game.getPi()) * this.speed) * this.range;
	}
	private float slowdownTimer;
	private float slowdownTimerSpecial;
	private float speed;
	private float t_;

	public final int terrainTexture()
	{
		return this.game.terrainTexture;
	}

	public final int texturesPacked()
	{
		return this.game.texturesPacked();
	}
	private float zzzposx;
	private float zzzposy;
	private float zzzposz;
	private float zzzx;
	private float zzzy;
}
