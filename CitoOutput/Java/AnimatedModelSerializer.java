// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class AnimatedModelSerializer
{

	public static AnimatedModel deserialize(GamePlatform p, String data)
	{
		AnimatedModel model = new AnimatedModel();
		model.nodes = new Node[256];
		model.keyframes = new Keyframe[1024];
		model.animations = new Animation[128];
		AnimatedModelBinding b = new AnimatedModelBinding();
		b.p = p;
		b.m = model;
		TableSerializer s = new TableSerializer();
		s.deserialize(p, data, b);
		return model;
	}

	public static String serialize(GamePlatform p, AnimatedModel m)
	{
		return null;
	}
}
