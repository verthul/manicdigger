// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class MainMenuMouseEventHandler extends MouseEventHandler
{

	public static MainMenuMouseEventHandler create(MainMenu l)
	{
		MainMenuMouseEventHandler h = new MainMenuMouseEventHandler();
		h.l = l;
		return h;
	}

	@Override
	public void onMouseDown(MouseEventArgs e)
	{
		this.l.handleMouseDown(e);
	}

	@Override
	public void onMouseMove(MouseEventArgs e)
	{
		this.l.handleMouseMove(e);
	}

	@Override
	public void onMouseUp(MouseEventArgs e)
	{
		this.l.handleMouseUp(e);
	}

	@Override
	public void onMouseWheel(MouseWheelEventArgs e)
	{
		this.l.handleMouseWheel(e);
	}
	private MainMenu l;
}
