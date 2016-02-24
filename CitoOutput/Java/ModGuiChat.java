// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class ModGuiChat extends ClientMod
{
	public ModGuiChat()
	{
		this.one = 1;
		this.chatFontSize = 11;
		this.chatScreenExpireTimeSeconds = 20;
		this.chatLinesMaxToDraw = 10;
		this.font = new FontCi();
		this.font.family = "Arial";
		this.font.size = this.chatFontSize;
		this.chatlines2 = new Chatline[1024];
	}
	float chatFontSize;
	int chatLinesMaxToDraw;
	int chatPageScroll;
	int chatScreenExpireTimeSeconds;

	public final String doAutocomplete(String text)
	{
		if (!this.game.platform.stringEmpty(text)) {
			for (int i = 0; i < this.game.entitiesCount; i++) {
				Entity entity = this.game.entities[i];
				if (entity == null) {
					continue;
				}
				if (entity.drawName == null) {
					continue;
				}
				if (!entity.drawName.clientAutoComplete) {
					continue;
				}
				DrawName p = entity.drawName;
				if (this.game.platform.stringStartsWithIgnoreCase(StringTools.stringSubstringToEnd(this.game.platform, p.name, 2), text)) {
					return StringTools.stringSubstringToEnd(this.game.platform, p.name, 2);
				}
			}
		}
		return "";
	}

	public final void drawChatLines(boolean all)
	{
		this.chatlines2Count = 0;
		int timeNow = this.game.platform.timeMillisecondsFromStart();
		int scroll;
		if (!all) {
			scroll = 0;
		}
		else {
			scroll = this.chatPageScroll;
		}
		int first = this.game.chatLinesCount - this.chatLinesMaxToDraw * (scroll + 1);
		if (first < 0) {
			first = 0;
		}
		int count = this.game.chatLinesCount;
		if (count > this.chatLinesMaxToDraw) {
			count = this.chatLinesMaxToDraw;
		}
		for (int i = first; i < first + count; i++) {
			Chatline c = this.game.chatLines[i];
			if (all || this.one * (timeNow - c.timeMilliseconds) / 1000 < this.chatScreenExpireTimeSeconds) {
				this.chatlines2[this.chatlines2Count++] = c;
			}
		}
		this.font.size = this.chatFontSize * this.game.scale();
		float dx = 20;
		for (int i = 0; i < this.chatlines2Count; i++) {
			if (this.chatlines2[i].clickable) {
				this.font.style = 3;
			}
			else {
				this.font.style = 1;
			}
			this.game.draw2dText(this.chatlines2[i].text, this.font, dx * this.game.scale(), (90 + i * 25) * this.game.scale(), null, false);
		}
		if (this.chatPageScroll != 0) {
			this.game.draw2dText(this.game.platform.stringFormat("&7Page: {0}", this.game.platform.intToString(this.chatPageScroll)), this.font, dx * this.game.scale(), 65 * this.game.scale(), null, false);
		}
	}

	public final void drawTypingBuffer()
	{
		this.font.size = this.chatFontSize * this.game.scale();
		String s = this.game.guiTypingBuffer;
		if (this.game.isTeamchat) {
			s = this.game.platform.stringFormat("To team: {0}", s);
		}
		if (this.game.platform.isSmallScreen()) {
			this.game.draw2dText(this.game.platform.stringFormat("{0}_", s), this.font, 50 * this.game.scale(), this.game.platform.getCanvasHeight() / 2 - 100 * this.game.scale(), null, true);
		}
		else {
			this.game.draw2dText(this.game.platform.stringFormat("{0}_", s), this.font, 50 * this.game.scale(), this.game.platform.getCanvasHeight() - 100 * this.game.scale(), null, true);
		}
	}

	@Override
	public void onKeyDown(Game game_, KeyEventArgs args)
	{
		if (this.game.guistate != GuiState.NORMAL) {
			return;
		}
		int eKey = args.getKeyCode();
		if (eKey == this.game.getKey(116) && this.game.isShiftPressed && this.game.guiTyping == TypingState.NONE) {
			this.game.guiTyping = TypingState.TYPING;
			this.game.isTyping = true;
			this.game.guiTypingBuffer = "";
			this.game.isTeamchat = false;
			args.setHandled(true);
			return;
		}
		if (eKey == this.game.getKey(56) && this.game.guiTyping == TypingState.TYPING) {
			this.chatPageScroll++;
			args.setHandled(true);
		}
		if (eKey == this.game.getKey(57) && this.game.guiTyping == TypingState.TYPING) {
			this.chatPageScroll--;
			args.setHandled(true);
		}
		this.chatPageScroll = MathCi.clampInt(this.chatPageScroll, 0, this.game.chatLinesCount / this.chatLinesMaxToDraw);
		if (eKey == this.game.getKey(49) || eKey == this.game.getKey(82)) {
			if (this.game.guiTyping == TypingState.TYPING) {
				this.game.typinglog[this.game.typinglogCount++] = this.game.guiTypingBuffer;
				this.game.typinglogpos = this.game.typinglogCount;
				this.game.clientCommand(this.game.guiTypingBuffer);
				this.game.guiTypingBuffer = "";
				this.game.isTyping = false;
				this.game.guiTyping = TypingState.NONE;
				this.game.platform.showKeyboard(false);
			}
			else if (this.game.guiTyping == TypingState.NONE) {
				this.game.startTyping();
			}
			else if (this.game.guiTyping == TypingState.READY) {
				this.game.platform.consoleWriteLine("Keyboard_KeyDown ready");
			}
			args.setHandled(true);
			return;
		}
		if (this.game.guiTyping == TypingState.TYPING) {
			int key = eKey;
			if (key == this.game.getKey(53)) {
				if (StringTools.stringLength(this.game.platform, this.game.guiTypingBuffer) > 0) {
					this.game.guiTypingBuffer = StringTools.stringSubstring(this.game.platform, this.game.guiTypingBuffer, 0, StringTools.stringLength(this.game.platform, this.game.guiTypingBuffer) - 1);
				}
				args.setHandled(true);
				return;
			}
			if (this.game.keyboardStateRaw[this.game.getKey(3)] || this.game.keyboardStateRaw[this.game.getKey(4)]) {
				if (key == this.game.getKey(104)) {
					if (this.game.platform.clipboardContainsText()) {
						this.game.guiTypingBuffer = StringTools.stringAppend(this.game.platform, this.game.guiTypingBuffer, this.game.platform.clipboardGetText());
					}
					args.setHandled(true);
					return;
				}
			}
			if (key == this.game.getKey(45)) {
				this.game.typinglogpos--;
				if (this.game.typinglogpos < 0) {
					this.game.typinglogpos = 0;
				}
				if (this.game.typinglogpos >= 0 && this.game.typinglogpos < this.game.typinglogCount) {
					this.game.guiTypingBuffer = this.game.typinglog[this.game.typinglogpos];
				}
				args.setHandled(true);
			}
			if (key == this.game.getKey(46)) {
				this.game.typinglogpos++;
				if (this.game.typinglogpos > this.game.typinglogCount) {
					this.game.typinglogpos = this.game.typinglogCount;
				}
				if (this.game.typinglogpos >= 0 && this.game.typinglogpos < this.game.typinglogCount) {
					this.game.guiTypingBuffer = this.game.typinglog[this.game.typinglogpos];
				}
				if (this.game.typinglogpos == this.game.typinglogCount) {
					this.game.guiTypingBuffer = "";
				}
				args.setHandled(true);
			}
			if (eKey == this.game.getKey(52) && !this.game.platform.stringTrim(this.game.guiTypingBuffer).equals("")) {
				IntRef partsLength = new IntRef();
				String[] parts = this.game.platform.stringSplit(this.game.guiTypingBuffer, " ", partsLength);
				String completed = this.doAutocomplete(parts[partsLength.value - 1]);
				if (completed.equals("")) {
					args.setHandled(true);
					return;
				}
				else if (partsLength.value == 1) {
					this.game.guiTypingBuffer = StringTools.stringAppend(this.game.platform, completed, ": ");
				}
				else {
					parts[partsLength.value - 1] = completed;
					this.game.guiTypingBuffer = StringTools.stringAppend(this.game.platform, this.game.platform.stringJoin(parts, " "), " ");
				}
				args.setHandled(true);
				return;
			}
			args.setHandled(true);
			return;
		}
	}

	@Override
	public void onKeyPress(Game game_, KeyPressEventArgs args)
	{
		if (this.game.guistate != GuiState.NORMAL) {
			return;
		}
		int eKeyChar = args.getKeyChar();
		int chart = 116;
		int charT = 84;
		int chary = 121;
		int charY = 89;
		if ((eKeyChar == chart || eKeyChar == charT) && this.game.guiTyping == TypingState.NONE) {
			this.game.guiTyping = TypingState.TYPING;
			this.game.guiTypingBuffer = "";
			this.game.isTeamchat = false;
			return;
		}
		if ((eKeyChar == chary || eKeyChar == charY) && this.game.guiTyping == TypingState.NONE) {
			this.game.guiTyping = TypingState.TYPING;
			this.game.guiTypingBuffer = "";
			this.game.isTeamchat = true;
			return;
		}
		if (this.game.guiTyping == TypingState.TYPING) {
			int c = eKeyChar;
			if (this.game.platform.isValidTypingChar(c)) {
				this.game.guiTypingBuffer = StringTools.stringAppend(this.game.platform, this.game.guiTypingBuffer, this.game.charToString(c));
			}
		}
	}

	@Override
	public void onMouseDown(Game game_, MouseEventArgs args)
	{
		for (int i = 0; i < this.chatlines2Count; i++) {
			float dx = 20;
			if (!this.game.platform.isMousePointerLocked()) {
				dx += 100;
			}
			float chatlineStartX = dx * this.game.scale();
			float chatlineStartY = (90 + i * 25) * this.game.scale();
			float chatlineSizeX = 500 * this.game.scale();
			float chatlineSizeY = 20 * this.game.scale();
			if (args.getX() > chatlineStartX && args.getX() < chatlineStartX + chatlineSizeX) {
				if (args.getY() > chatlineStartY && args.getY() < chatlineStartY + chatlineSizeY) {
					if (this.chatlines2[i].clickable) {
						this.game.platform.openLinkInBrowser(this.chatlines2[i].linkTarget);
					}
				}
			}
		}
	}

	@Override
	public void onNewFrameDraw2d(Game game_, float deltaTime)
	{
		this.game = game_;
		if (this.game.guistate == GuiState.MAP_LOADING) {
			return;
		}
		this.drawChatLines(this.game.guiTyping == TypingState.TYPING);
		if (this.game.guiTyping == TypingState.TYPING) {
			this.drawTypingBuffer();
		}
	}
	private Chatline[] chatlines2;
	private int chatlines2Count;
	private FontCi font;
	Game game;
	float one;
}
