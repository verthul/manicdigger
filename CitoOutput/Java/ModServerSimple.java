// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class ModServerSimple extends ClientMod
{

	@Override
	public void onReadOnlyBackgroundThread(Game game, float dt)
	{
		this.server.update();
	}
	ServerSimple server;
}
