// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class AnimatedModelBinding extends TableBinding
{

	private float floatParse(String s)
	{
		FloatRef ret = new FloatRef();
		this.p.floatTryParse(s, ret);
		return ret.value;
	}

	@Override
	public void get(String table, int index, DictionaryStringString items)
	{
		if (table.equals("nodes")) {
			Node k = this.m.nodes[index];
			items.set("name", k.name);
			items.set("paren", k.parentName);
			items.set("x", this.p.floatToString(k.posx));
			items.set("y", this.p.floatToString(k.posy));
			items.set("z", this.p.floatToString(k.posz));
			items.set("rotx", this.p.floatToString(k.rotatex));
			items.set("roty", this.p.floatToString(k.rotatey));
			items.set("rotz", this.p.floatToString(k.rotatez));
			items.set("sizex", this.p.floatToString(k.sizex));
			items.set("sizey", this.p.floatToString(k.sizey));
			items.set("sizez", this.p.floatToString(k.sizez));
			items.set("u", this.p.floatToString(k.u));
			items.set("v", this.p.floatToString(k.v));
			items.set("pivx", this.p.floatToString(k.pivotx));
			items.set("pivy", this.p.floatToString(k.pivoty));
			items.set("pivz", this.p.floatToString(k.pivotz));
			items.set("scalx", this.p.floatToString(k.scalex));
			items.set("scaly", this.p.floatToString(k.scaley));
			items.set("scalz", this.p.floatToString(k.scalez));
			items.set("head", this.p.floatToString(k.head));
		}
		if (table.equals("keyframes")) {
			Keyframe k = this.m.keyframes[index];
			items.set("anim", k.animationName);
			items.set("node", k.nodeName);
			items.set("frame", this.p.floatToString(k.frame));
			items.set("type", KeyframeType.getName(k.frame));
			items.set("x", this.p.floatToString(k.x));
			items.set("y", this.p.floatToString(k.y));
			items.set("z", this.p.floatToString(k.z));
		}
		if (table.equals("animations")) {
			Animation k = this.m.animations[index];
			items.set("name", k.name);
			items.set("len", this.p.floatToString(k.length));
		}
		if (table.equals("global")) {
			AnimationGlobal global = this.m.global;
			items.set("texw", this.p.floatToString(global.texw));
			items.set("texh", this.p.floatToString(global.texh));
		}
	}

	public final void getTables(String[] name, int[] count)
	{
		name[0] = "nodes";
		count[0] = this.m.nodesCount;
		name[1] = "keyframes";
		count[1] = this.m.keyframesCount;
		name[2] = "animations";
		count[2] = this.m.animationsCount;
		name[3] = "global";
		count[3] = 1;
	}

	private int intParse(String s)
	{
		return this.p.floatToInt(this.floatParse(s));
	}

	@Override
	public void set(String table, int index, String column, String value)
	{
		if (table.equals("nodes")) {
			if (index >= this.m.nodesCount) {
				this.m.nodesCount = index + 1;
			}
			if (this.m.nodes[index] == null) {
				this.m.nodes[index] = new Node();
			}
			Node k = this.m.nodes[index];
			if (column.equals("name")) {
				k.name = value;
			}
			if (column.equals("paren")) {
				k.parentName = value;
			}
			if (column.equals("x")) {
				k.posx = this.floatParse(value);
			}
			if (column.equals("y")) {
				k.posy = this.floatParse(value);
			}
			if (column.equals("z")) {
				k.posz = this.floatParse(value);
			}
			if (column.equals("rotx")) {
				k.rotatex = this.floatParse(value);
			}
			if (column.equals("roty")) {
				k.rotatey = this.floatParse(value);
			}
			if (column.equals("rotz")) {
				k.rotatez = this.floatParse(value);
			}
			if (column.equals("sizex")) {
				k.sizex = this.floatParse(value);
			}
			if (column.equals("sizey")) {
				k.sizey = this.floatParse(value);
			}
			if (column.equals("sizez")) {
				k.sizez = this.floatParse(value);
			}
			if (column.equals("u")) {
				k.u = this.floatParse(value);
			}
			if (column.equals("v")) {
				k.v = this.floatParse(value);
			}
			if (column.equals("pivx")) {
				k.pivotx = this.floatParse(value);
			}
			if (column.equals("pivy")) {
				k.pivoty = this.floatParse(value);
			}
			if (column.equals("pivz")) {
				k.pivotz = this.floatParse(value);
			}
			if (column.equals("scalx")) {
				k.scalex = this.floatParse(value);
			}
			if (column.equals("scaly")) {
				k.scaley = this.floatParse(value);
			}
			if (column.equals("scalz")) {
				k.scalez = this.floatParse(value);
			}
			if (column.equals("head")) {
				k.head = this.floatParse(value);
			}
		}
		if (table.equals("keyframes")) {
			if (index >= this.m.keyframesCount) {
				this.m.keyframesCount = index + 1;
			}
			if (this.m.keyframes[index] == null) {
				this.m.keyframes[index] = new Keyframe();
			}
			Keyframe k = this.m.keyframes[index];
			if (column.equals("anim")) {
				k.animationName = value;
			}
			if (column.equals("node")) {
				k.nodeName = value;
			}
			if (column.equals("frame")) {
				k.frame = this.intParse(value);
			}
			if (column.equals("type")) {
				k.keyframeType = KeyframeType.getValue(value);
			}
			if (column.equals("x")) {
				k.x = this.floatParse(value);
			}
			if (column.equals("y")) {
				k.y = this.floatParse(value);
			}
			if (column.equals("z")) {
				k.z = this.floatParse(value);
			}
		}
		if (table.equals("animations")) {
			if (index >= this.m.animationsCount) {
				this.m.animationsCount = index + 1;
			}
			if (this.m.animations[index] == null) {
				this.m.animations[index] = new Animation();
			}
			Animation k = this.m.animations[index];
			if (column.equals("name")) {
				k.name = value;
			}
			if (column.equals("len")) {
				k.length = this.intParse(value);
			}
		}
		if (table.equals("global")) {
			AnimationGlobal global = this.m.global;
			if (column.equals("texw")) {
				global.texw = this.intParse(value);
			}
			if (column.equals("texh")) {
				global.texh = this.intParse(value);
			}
		}
	}
	AnimatedModel m;
	GamePlatform p;
}
