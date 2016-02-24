// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class MainMenuKeyEventHandler extends KeyEventHandler
{

	public static MainMenuKeyEventHandler create(MainMenu l)
	{
		MainMenuKeyEventHandler h = new MainMenuKeyEventHandler();
		h.l = l;
		return h;
	}

	@Override
	public void onKeyDown(KeyEventArgs e)
	{
		this.l.handleKeyDown(e);
	}

	@Override
	public void onKeyPress(KeyPressEventArgs e)
	{
		this.l.handleKeyPress(e);
	}

	@Override
	public void onKeyUp(KeyEventArgs e)
	{
		this.l.handleKeyUp(e);
	}
	private MainMenu l;
}
