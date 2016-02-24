// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class MainMenuNewFrameHandler extends NewFrameHandler
{

	public static MainMenuNewFrameHandler create(MainMenu l)
	{
		MainMenuNewFrameHandler h = new MainMenuNewFrameHandler();
		h.l = l;
		return h;
	}

	@Override
	public void onNewFrame(NewFrameEventArgs args)
	{
		this.l.onNewFrame(args);
	}
	private MainMenu l;
}
