// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class ModGuiTextEditor extends GameScreen
{
	public ModGuiTextEditor()
	{
		this.buffer = new int[128][];
		for (int i = 0; i < 128; i++) {
			this.buffer[i] = new int[80];
		}
		this.startX = 100;
		this.startY = 100;
		this.charSize = 12;
		this.font = new FontCi();
		this.font.family = "Courier New";
		this.font.size = 12;
	}

	private final String bufferToString()
	{
		String s = "";
		for (int i = 0; i < 128; i++) {
			String line = this.lineToString(this.buffer[i]);
			s = StringTools.stringAppend(this.game.platform, s, line);
		}
		return s;
	}

	private int lineLength(int[] line)
	{
		for (int i = 0; i < 80; i++) {
			if (line[i] == 0) {
				return i;
			}
		}
		return 80;
	}

	private String lineToString(int[] line)
	{
		if (line == null) {
			return "";
		}
		return this.game.platform.charArrayToString(line, this.lineLength(line));
	}

	@Override
	public void onKeyDown(Game game_, KeyEventArgs e)
	{
		if (e.getKeyCode() == this.game.getKey(18)) {
			this.visible = !this.visible;
		}
		if (!this.visible) {
			return;
		}
		if (e.getKeyCode() == 50) {
			this.visible = false;
		}
		if (e.getKeyCode() == 47) {
			this.cursorColumn--;
		}
		if (e.getKeyCode() == 48) {
			this.cursorColumn++;
		}
		if (e.getKeyCode() == 45) {
			this.cursorLine--;
		}
		if (e.getKeyCode() == 46) {
			this.cursorLine++;
		}
		if (e.getKeyCode() == 53) {
			this.cursorColumn--;
			e.setKeyCode(55);
		}
		if (this.cursorColumn < 0) {
			this.cursorColumn = 0;
		}
		if (this.cursorLine < 0) {
			this.cursorLine = 0;
		}
		if (this.cursorColumn >= 80) {
			this.cursorColumn = 80;
		}
		if (this.cursorLine > 128) {
			this.cursorLine = 128;
		}
		if (this.cursorColumn > this.lineLength(this.buffer[this.cursorLine])) {
			this.cursorColumn = this.lineLength(this.buffer[this.cursorLine]);
		}
		if (e.getKeyCode() == 55) {
			for (int i = this.cursorColumn; i < 79; i++) {
				this.buffer[this.cursorLine][i] = this.buffer[this.cursorLine][i + 1];
			}
		}
		e.setHandled(true);
	}

	@Override
	public void onKeyPress(Game game_, KeyPressEventArgs e)
	{
		if (!this.visible) {
			return;
		}
		if (e.getKeyChar() == 8) {
			return;
		}
		for (int i = 79; i > this.cursorColumn; i--) {
			this.buffer[this.cursorLine][i] = this.buffer[this.cursorLine][i - 1];
		}
		this.buffer[this.cursorLine][this.cursorColumn] = e.getKeyChar();
		this.cursorColumn++;
		e.setHandled(true);
	}

	@Override
	public void onNewFrameDraw2d(Game game, float deltaTime)
	{
		float dt = deltaTime;
		if (!this.visible) {
			return;
		}
		game.draw2dTexture(game.whiteTexture(), this.startX, this.startY, 80 * this.charSize, 128 * this.charSize, null, 0, Game.colorFromArgb(255, 100, 100, 100), false);
		for (int i = 0; i < 128; i++) {
			game.draw2dText(this.lineToString(this.buffer[i]), this.font, this.startX, this.startY + this.charSize * i, null, false);
		}
		int[] spaces = new int[80];
		for (int i = 0; i < 80; i++) {
			spaces[i] = 32;
		}
		spaces[this.cursorColumn] = 95;
		String spacesString = game.platform.charArrayToString(spaces, this.cursorColumn + 1);
		game.draw2dText(spacesString, this.font, this.startX, this.startY + this.cursorLine * this.charSize, null, false);
	}
	private int[][] buffer;
	private int charSize;
	private int cursorColumn;
	private int cursorLine;
	private FontCi font;
	private int startX;
	private int startY;
	private boolean visible;
}
