// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class AnimatedModelRenderer
{
	public AnimatedModelRenderer()
	{
		this.one = 1;
		this.tempframes = new Keyframe[256];
		this.tempframesCount = new IntRef();
		this.tempVec3 = new float[3];
	}

	private void drawNode(String parent, float headDeg, float light)
	{
		for (int i = 0; i < this.m.nodesCount; i++) {
			Node n = this.m.nodes[i];
			if (n == null) {
				continue;
			}
			if (!n.parentName.equals(parent)) {
				continue;
			}
			this.game.gLPushMatrix();
			RectangleFloat[] r = new RectangleFloat[6];
			r = CuboidRenderer.cuboidNet(n.sizex, n.sizey, n.sizez, n.u, n.v);
			CuboidRenderer.cuboidNetNormalize(r, this.m.global.texw, this.m.global.texh);
			this.getAnimation(n, this.tempVec3, 5);
			if (this.tempVec3[0] != 0 && this.tempVec3[1] != 0 && this.tempVec3[2] != 0) {
				this.game.gLScale(this.tempVec3[0], this.tempVec3[1], this.tempVec3[2]);
			}
			this.getAnimation(n, this.tempVec3, 1);
			this.tempVec3[0] /= 16;
			this.tempVec3[1] /= 16;
			this.tempVec3[2] /= 16;
			if (!this.isZero(this.tempVec3)) {
				this.game.gLTranslate(this.tempVec3[0], this.tempVec3[1], this.tempVec3[2]);
			}
			this.getAnimation(n, this.tempVec3, 2);
			if (this.tempVec3[0] != 0) {
				this.game.gLRotate(this.tempVec3[0], 1, 0, 0);
			}
			if (this.tempVec3[1] != 0) {
				this.game.gLRotate(this.tempVec3[1], 0, 1, 0);
			}
			if (this.tempVec3[2] != 0) {
				this.game.gLRotate(this.tempVec3[2], 0, 0, 1);
			}
			if (n.head == 1) {
				this.game.gLRotate(headDeg, 1, 0, 0);
			}
			this.getAnimation(n, this.tempVec3, 4);
			this.tempVec3[0] /= 16;
			this.tempVec3[1] /= 16;
			this.tempVec3[2] /= 16;
			this.game.gLTranslate(this.tempVec3[0], this.tempVec3[1], this.tempVec3[2]);
			this.getAnimation(n, this.tempVec3, 3);
			this.tempVec3[0] /= 16;
			this.tempVec3[1] /= 16;
			this.tempVec3[2] /= 16;
			CuboidRenderer.drawCuboid2(this.game, 0 - this.tempVec3[0] / 2, 0 - this.tempVec3[1] / 2, 0 - this.tempVec3[2] / 2, this.tempVec3[0], this.tempVec3[1], this.tempVec3[2], r, light);
			this.drawNode(n.name, headDeg, light);
			this.game.gLPopMatrix();
		}
	}

	private void getAnimation(Node node, float[] ret, int type)
	{
		this.getFrames(node.name, type, this.tempframes, this.tempframesCount);
		int currentI = this.getFrameCurrent(this.tempframes, this.tempframesCount.value);
		if (currentI == -1) {
			this.getDefaultFrame(node, type, ret);
			return;
		}
		int nextI = (currentI + 1) % this.tempframesCount.value;
		Keyframe current = this.tempframes[currentI];
		Keyframe next = this.tempframes[nextI];
		float t;
		float length = this.m.animations[this.anim].length;
		if (next.frame == current.frame) {
			t = 0;
		}
		else if (next.frame > current.frame) {
			t = (this.frame - current.frame) / (next.frame - current.frame);
		}
		else {
			float end = 0;
			float begin = 0;
			if (this.frame >= current.frame) {
				end = this.frame - current.frame;
			}
			else {
				end = length - current.frame;
				begin = this.frame;
			}
			t = (end + begin) / (length - current.frame + next.frame);
		}
		ret[0] = this.lerp(current.x, next.x, t);
		ret[1] = this.lerp(current.y, next.y, t);
		ret[2] = this.lerp(current.z, next.z, t);
	}

	private void getDefaultFrame(Node node, int type, float[] ret)
	{
		switch (type) {
		case 1:
			{
				ret[0] = node.posx;
				ret[1] = node.posy;
				ret[2] = node.posz;
			}
			break;
		case 2:
			{
				ret[0] = node.rotatex;
				ret[1] = node.rotatey;
				ret[2] = node.rotatez;
			}
			break;
		case 3:
			{
				ret[0] = node.sizex;
				ret[1] = node.sizey;
				ret[2] = node.sizez;
			}
			break;
		case 4:
			{
				ret[0] = node.pivotx;
				ret[1] = node.pivoty;
				ret[2] = node.pivotz;
			}
			break;
		case 5:
			{
				ret[0] = node.scalex;
				ret[1] = node.scaley;
				ret[2] = node.scalez;
			}
			break;
		}
	}

	private int getFrameCurrent(Keyframe[] frames, int framesCount)
	{
		String animName = this.m.animations[this.anim].name;
		int current = -1;
		for (int i = 0; i < framesCount; i++) {
			Keyframe k = frames[i];
			if (k.frame <= this.frame) {
				if (current == -1) {
					current = i;
				}
				else {
					if (k.frame > frames[current].frame) {
						current = i;
					}
				}
			}
		}
		if (current == -1) {
			for (int i = 0; i < framesCount; i++) {
				Keyframe k = frames[i];
				if (current == -1 || k.frame > frames[current].frame) {
					current = i;
				}
			}
		}
		return current;
	}

	private void getFrames(String nodeName, int type, Keyframe[] frames, IntRef count)
	{
		count.value = 0;
		String animName = this.m.animations[this.anim].name;
		for (int i = 0; i < this.m.keyframesCount; i++) {
			Keyframe k = this.m.keyframes[i];
			if (k == null) {
				continue;
			}
			if (!k.nodeName.equals(nodeName)) {
				continue;
			}
			if (!k.animationName.equals(animName)) {
				continue;
			}
			if (k.keyframeType != type) {
				continue;
			}
			frames[count.value++] = k;
		}
	}

	private boolean isZero(float[] vec)
	{
		return vec[0] == 0 && vec[1] == 0 && vec[2] == 0;
	}

	private float lerp(float v0, float v1, float t)
	{
		return v0 + (v1 - v0) * t;
	}

	public final void render(float dt, float headDeg, boolean walkAnimation, boolean moves, float light)
	{
		if (this.m == null) {
			return;
		}
		if (this.m.animations == null) {
			return;
		}
		if (this.m.animations[this.anim] == null) {
			return;
		}
		float length = this.m.animations[this.anim].length;
		if (moves) {
			this.frame += dt * 60;
			this.frame = this.frame % length;
		}
		if (walkAnimation) {
			if (!moves) {
				if (this.frame != 0 && this.frame != length / 2 && this.frame != length) {
					if (this.frame < length / 2) {
						this.frame += dt * 60;
						if (this.frame > length / 2) {
							this.frame = length / 2;
						}
					}
					else {
						this.frame += dt * 60;
						if (this.frame > length) {
							this.frame = length;
						}
					}
				}
			}
		}
		this.drawNode("root", headDeg, light);
	}

	public final void start(Game game_, AnimatedModel model_)
	{
		this.game = game_;
		this.m = model_;
	}
	private int anim;
	private float frame;
	Game game;
	private AnimatedModel m;
	private float one;
	private float[] tempVec3;
	private Keyframe[] tempframes;
	private IntRef tempframesCount;
}
