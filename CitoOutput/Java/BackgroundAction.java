// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class BackgroundAction extends Action_
{
	public BackgroundAction()
	{
		this.game = null;
		this.i = -1;
		this.dt = 1;
		this.active = false;
		this.finished = false;
	}

	@Override
	public void run()
	{
		this.game.clientmods[this.i].onReadOnlyBackgroundThread(this.game, this.dt);
		this.finished = true;
	}
	boolean active;
	float dt;
	boolean finished;
	Game game;
	int i;
}
