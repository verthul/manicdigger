// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class TaskScheduler
{
	public TaskScheduler()
	{
		this.actions = null;
	}

	public final void update(Game game, float dt)
	{
		if (this.actions == null) {
			this.actions = new BackgroundAction[game.clientmodsCount];
			for (int i = 0; i < game.clientmodsCount; i++) {
				this.actions[i] = new BackgroundAction();
			}
		}
		if (game.platform.multithreadingAvailable()) {
			for (int i = 0; i < game.clientmodsCount; i++) {
				game.clientmods[i].onReadOnlyMainThread(game, dt);
			}
			boolean allDone = true;
			for (int i = 0; i < game.clientmodsCount; i++) {
				if (this.actions[i] != null && this.actions[i].active && !this.actions[i].finished) {
					allDone = false;
				}
			}
			if (allDone) {
				for (int i = 0; i < game.clientmodsCount; i++) {
					game.clientmods[i].onReadWriteMainThread(game, dt);
				}
				for (int i = 0; i < game.commitActions.count; i++) {
					game.commitActions.items[i].run();
				}
				game.commitActions.clear();
				for (int i = 0; i < game.clientmodsCount; i++) {
					BackgroundAction a = this.actions[i];
					a.game = game;
					a.dt = dt;
					a.i = i;
					a.active = true;
					a.finished = false;
					game.platform.queueUserWorkItem(a);
				}
			}
		}
		else {
			for (int i = 0; i < game.clientmodsCount; i++) {
				game.clientmods[i].onReadOnlyMainThread(game, dt);
			}
			for (int i = 0; i < game.clientmodsCount; i++) {
				game.clientmods[i].onReadOnlyBackgroundThread(game, dt);
			}
			for (int i = 0; i < game.clientmodsCount; i++) {
				game.clientmods[i].onReadWriteMainThread(game, dt);
			}
			for (int i = 0; i < game.commitActions.count; i++) {
				game.commitActions.items[i].run();
			}
			game.commitActions.clear();
		}
	}
	private BackgroundAction[] actions;
}
