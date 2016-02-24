// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class Controls
{

	/**
	 * &lt;summary&gt;
	 * Get the current player freemove mode
	 * &lt;/summary&gt;
	 * &lt;returns&gt;Freemove mode as defined in FreemoveLevelEnum&lt;/returns&gt;
	 */
	public final int getFreemove()
	{
		if (!this.freemove) {
			return 0;
		}
		if (this.noclip) {
			return 2;
		}
		else {
			return 1;
		}
	}

	/**
	 * &lt;summary&gt;
	 * Set player freemove mode to the given value
	 * &lt;/summary&gt;
	 * &lt;param name="level"&gt;Freemove mode as defined in FreemoveLevelEnum&lt;/param&gt;
	 */
	public final void setFreemove(int level)
	{
		if (level == 0) {
			this.freemove = false;
			this.noclip = false;
		}
		if (level == 1) {
			this.freemove = true;
			this.noclip = false;
		}
		if (level == 2) {
			this.freemove = true;
			this.noclip = true;
		}
	}
	boolean freemove;
	boolean movedown;
	float movedx;
	float movedy;
	boolean moveup;
	boolean noclip;
	boolean shiftkeydown;
	boolean wantsjump;
	boolean wantsjumphalf;
}
