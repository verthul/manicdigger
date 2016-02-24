// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class OnCrashHandlerLeave extends OnCrashHandler
{

	public static OnCrashHandlerLeave create(Game game)
	{
		OnCrashHandlerLeave oncrash = new OnCrashHandlerLeave();
		oncrash.g = game;
		return oncrash;
	}

	@Override
	public void onCrash()
	{
		this.g.sendLeave(1);
	}
	private Game g;
}
