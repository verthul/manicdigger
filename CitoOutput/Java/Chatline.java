// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class Chatline
{

	static Chatline create(String text_, int timeMilliseconds_)
	{
		Chatline c = new Chatline();
		c.text = text_;
		c.timeMilliseconds = timeMilliseconds_;
		c.clickable = false;
		return c;
	}

	static Chatline createClickable(String text_, int timeMilliseconds_, String linkTarget_)
	{
		Chatline c = new Chatline();
		c.text = text_;
		c.timeMilliseconds = timeMilliseconds_;
		c.clickable = true;
		c.linkTarget = linkTarget_;
		return c;
	}
	boolean clickable;
	String linkTarget;
	String text;
	int timeMilliseconds;
}
