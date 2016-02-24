// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class MainMenuTouchEventHandler extends TouchEventHandler
{

	public static MainMenuTouchEventHandler create(MainMenu l)
	{
		MainMenuTouchEventHandler h = new MainMenuTouchEventHandler();
		h.l = l;
		return h;
	}

	@Override
	public void onTouchEnd(TouchEventArgs e)
	{
		this.l.handleTouchEnd(e);
	}

	@Override
	public void onTouchMove(TouchEventArgs e)
	{
		this.l.handleTouchMove(e);
	}

	@Override
	public void onTouchStart(TouchEventArgs e)
	{
		this.l.handleTouchStart(e);
	}
	private MainMenu l;
}
