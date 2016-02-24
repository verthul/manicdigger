// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class KeyEventArgs
{

	public final boolean getAltPressed()
	{
		return this.modifierAlt;
	}

	public final boolean getCtrlPressed()
	{
		return this.modifierCtrl;
	}

	public final boolean getHandled()
	{
		return this.handled;
	}

	public final int getKeyCode()
	{
		return this.keyCode;
	}

	public final boolean getShiftPressed()
	{
		return this.modifierShift;
	}

	public final void setAltPressed(boolean value)
	{
		this.modifierAlt = value;
	}

	public final void setCtrlPressed(boolean value)
	{
		this.modifierCtrl = value;
	}

	public final void setHandled(boolean value)
	{
		this.handled = value;
	}

	public final void setKeyCode(int value)
	{
		this.keyCode = value;
	}

	public final void setShiftPressed(boolean value)
	{
		this.modifierShift = value;
	}
	private boolean handled;
	private int keyCode;
	private boolean modifierAlt;
	private boolean modifierCtrl;
	private boolean modifierShift;
}
