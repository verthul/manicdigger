// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class MeshBatcher
{
	public MeshBatcher()
	{
		int modelsMax = 16384;
		this.models = new ListInfo[modelsMax];
		for (int i = 0; i < modelsMax; i++) {
			this.models[i] = new ListInfo();
		}
		this.modelsCount = 0;
		this.bindTexture = true;
		this.glTextures = new int[10];
		this.glTexturesLength = 10;
		this.empty = new int[modelsMax];
		this.emptyCount = 0;
	}

	public final int add(ModelData modelData, boolean transparent, int texture, float centerX, float centerY, float centerZ, float radius)
	{
		int id;
		if (this.emptyCount > 0) {
			id = this.empty[this.emptyCount - 1];
			this.emptyCount--;
		}
		else {
			id = this.modelsCount;
			this.modelsCount++;
		}
		Model model = this.game.platform.createModel(modelData);
		ListInfo li = this.models[id];
		li.indicescount = modelData.getIndicesCount();
		li.centerX = centerX;
		li.centerY = centerY;
		li.centerZ = centerZ;
		li.radius = radius;
		li.transparent = transparent;
		li.empty = false;
		li.texture = this.getTextureId(texture);
		li.model = model;
		return id;
	}

	private int arrayIndexOf(int[] glTextures, int length, int glTexture)
	{
		for (int i = 0; i < length; i++) {
			if (glTextures[i] == glTexture) {
				return i;
			}
		}
		return -1;
	}
	boolean bindTexture;

	public final void clear()
	{
		int count = this.modelsCount;
		for (int i = 0; i < count; i++) {
			if (!this.models[i].empty) {
				this.remove(i);
			}
		}
	}

	public final void draw(float playerPositionX, float playerPositionY, float playerPositionZ)
	{
		this.updateCulling();
		this.sortListsByTexture();
		for (int i = 0; i < 10; i++) {
			if (this.tocallSolid[i].count == 0) {
				continue;
			}
			if (this.bindTexture) {
				this.game.platform.bindTexture2d(this.glTextures[i]);
			}
			this.game.drawModels(this.tocallSolid[i].lists, this.tocallSolid[i].count);
		}
		this.game.platform.glDisableCullFace();
		for (int i = 0; i < 10; i++) {
			if (this.tocallTransparent[i].count == 0) {
				continue;
			}
			if (this.bindTexture) {
				this.game.platform.bindTexture2d(this.glTextures[i]);
			}
			this.game.drawModels(this.tocallTransparent[i].lists, this.tocallTransparent[i].count);
		}
		this.game.platform.glEnableCullFace();
	}

	private int getTextureId(int glTexture)
	{
		int id = this.arrayIndexOf(this.glTextures, this.glTexturesLength, glTexture);
		if (id != -1) {
			return id;
		}
		id = this.arrayIndexOf(this.glTextures, this.glTexturesLength, 0);
		if (id != -1) {
			this.glTextures[id] = glTexture;
			return id;
		}
		int increase = 10;
		int[] glTextures2 = new int[this.glTexturesLength + increase];
		for (int i = 0; i < this.glTexturesLength; i++) {
			glTextures2[i] = this.glTextures[i];
		}
		this.glTextures = glTextures2;
		this.glTexturesLength = this.glTexturesLength + increase;
		this.glTextures[this.glTexturesLength - increase] = glTexture;
		return this.glTexturesLength - increase;
	}

	public final void remove(int id)
	{
		this.game.platform.deleteModel(this.models[id].model);
		this.models[id].empty = true;
		this.empty[this.emptyCount++] = id;
	}

	private void sortListsByTexture()
	{
		if (this.tocallSolid == null) {
			this.tocallSolid = new ToCall[10];
			this.tocallTransparent = new ToCall[10];
			for (int i = 0; i < 10; i++) {
				this.tocallSolid[i] = new ToCall();
				this.tocallTransparent[i] = new ToCall();
			}
			for (int i = 0; i < 10; i++) {
				int max = 256;
				this.tocallSolid[i].lists = new Model[max];
				this.tocallSolid[i].max = max;
				this.tocallTransparent[i].lists = new Model[max];
				this.tocallTransparent[i].max = max;
			}
		}
		for (int i = 0; i < 10; i++) {
			this.tocallSolid[i].count = 0;
			this.tocallTransparent[i].count = 0;
		}
		for (int i = 0; i < this.modelsCount; i++) {
			ListInfo li = this.models[i];
			if (!li.render) {
				continue;
			}
			if (li.empty) {
				continue;
			}
			ToCall tocall;
			if (!li.transparent) {
				tocall = this.tocallSolid[li.texture];
			}
			else {
				tocall = this.tocallTransparent[li.texture];
			}
			if (tocall.count >= tocall.max) {
				Model[] old = tocall.lists;
				Model[] new_ = new Model[tocall.max * 2];
				for (int k = 0; k < tocall.max; k++) {
					new_[k] = old[k];
				}
				tocall.lists = new_;
				tocall.max = tocall.max * 2;
			}
			tocall.lists[tocall.count++] = this.models[i].model;
		}
	}

	public final int totalTriangleCount()
	{
		int sum = 0;
		int count = this.modelsCount;
		for (int i = 0; i < count; i++) {
			if (!this.models[i].empty) {
				ListInfo li = this.models[i];
				if (li.render) {
					sum += li.indicescount;
				}
			}
		}
		return sum / 3;
	}

	private void updateCulling()
	{
		int licount = this.modelsCount;
		for (int i = 0; i < licount; i++) {
			ListInfo li = this.models[i];
			float centerX = li.centerX;
			float centerY = li.centerY;
			float centerZ = li.centerZ;
			li.render = this.d_FrustumCulling.sphereInFrustum(centerX, centerY, centerZ, li.radius);
		}
	}
	FrustumCulling d_FrustumCulling;
	private int[] empty;
	private int emptyCount;
	Game game;
	private int[] glTextures;
	private int glTexturesLength;
	private ListInfo[] models;
	private int modelsCount;
	public static final int TEXTURES_COUNT = 10;
	private ToCall[] tocallSolid;
	private ToCall[] tocallTransparent;
}
