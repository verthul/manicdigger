// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class ModGuiEscapeMenu extends ClientMod
{
	public ModGuiEscapeMenu()
	{
		this.one = 1;
		this.fonts = new String[4];
		this.fonts[0] = "Nice";
		this.fonts[1] = "Simple";
		this.fonts[2] = "BlackBackground";
		this.fonts[3] = "Default";
		this.fontsLength = 4;
		this.fontValues = new int[4];
		this.fontValues[0] = 0;
		this.fontValues[1] = 1;
		this.fontValues[2] = 2;
		this.fontValues[3] = 3;
		this.widgets = new Button[1024];
		this.keyselectid = -1;
	}

	private void addWidget(Button b)
	{
		this.widgets[this.widgetsCount++] = b;
	}

	private void escapeMenuMouse1()
	{
		for (int i = 0; i < this.widgetsCount; i++) {
			Button w = this.widgets[i];
			w.selected = this.rectContains(w.x, w.y, w.width, w.height, this.game.mouseCurrentX, this.game.mouseCurrentY);
			if (w.selected && this.game.mouseleftclick) {
				this.handleButtonClick(w);
				break;
			}
		}
	}

	private String fontString()
	{
		return this.fonts[this.game.options.font];
	}

	private void graphicsHandleClick(Button b)
	{
		OptionsCi options = this.game.options;
		if (b == this.graphicsOptionSmoothShadows) {
			options.smoothshadows = !options.smoothshadows;
			this.game.d_TerrainChunkTesselator.enableSmoothLight = options.smoothshadows;
			if (options.smoothshadows) {
				options.blockShadowSave = this.one * 7 / 10;
				this.game.d_TerrainChunkTesselator.blockShadow = options.blockShadowSave;
			}
			else {
				options.blockShadowSave = this.one * 6 / 10;
				this.game.d_TerrainChunkTesselator.blockShadow = options.blockShadowSave;
			}
			this.game.redrawAllBlocks();
		}
		if (b == this.graphicsOptionDarkenSides) {
			options.enableBlockShadow = !options.enableBlockShadow;
			this.game.d_TerrainChunkTesselator.option_DarkenBlockSides = options.enableBlockShadow;
			this.game.redrawAllBlocks();
		}
		if (b == this.graphicsViewDistanceOption) {
			this.game.toggleFog();
		}
		if (b == this.graphicsOptionFramerate) {
			this.game.toggleVsync();
		}
		if (b == this.graphicsOptionResolution) {
			this.toggleResolution();
		}
		if (b == this.graphicsOptionFullscreen) {
			options.fullscreen = !options.fullscreen;
		}
		if (b == this.graphicsUseServerTexturesOption) {
			options.useServerTextures = !options.useServerTextures;
		}
		if (b == this.graphicsFontOption) {
			this.toggleFont();
		}
		if (b == this.graphicsReturnToOptionsMenu) {
			this.useFullscreen();
			this.useResolution();
			this.setEscapeMenuState(EscapeMenuState.OPTIONS);
		}
	}

	private void graphicsSet()
	{
		OptionsCi options = this.game.options;
		Language language = this.game.language;
		this.graphicsOptionSmoothShadows = new Button();
		this.graphicsOptionSmoothShadows.text = this.game.platform.stringFormat(language.optionSmoothShadows(), options.smoothshadows ? language.on() : language.off());
		this.graphicsOptionDarkenSides = new Button();
		this.graphicsOptionDarkenSides.text = this.game.platform.stringFormat(language.get("OptionDarkenSides"), options.enableBlockShadow ? language.on() : language.off());
		this.graphicsViewDistanceOption = new Button();
		this.graphicsViewDistanceOption.text = this.game.platform.stringFormat(language.viewDistanceOption(), this.game.platform.intToString(this.game.platform.floatToInt(this.game.d_Config3d.viewdistance)));
		this.graphicsOptionFramerate = new Button();
		this.graphicsOptionFramerate.text = this.game.platform.stringFormat(language.optionFramerate(), this.vsyncString());
		this.graphicsOptionResolution = new Button();
		this.graphicsOptionResolution.text = this.game.platform.stringFormat(language.optionResolution(), this.resolutionString());
		this.graphicsOptionFullscreen = new Button();
		this.graphicsOptionFullscreen.text = this.game.platform.stringFormat(language.optionFullscreen(), options.fullscreen ? language.on() : language.off());
		this.graphicsUseServerTexturesOption = new Button();
		this.graphicsUseServerTexturesOption.text = this.game.platform.stringFormat(language.useServerTexturesOption(), options.useServerTextures ? language.on() : language.off());
		this.graphicsFontOption = new Button();
		this.graphicsFontOption.text = this.game.platform.stringFormat(language.fontOption(), this.fontString());
		this.graphicsReturnToOptionsMenu = new Button();
		this.graphicsReturnToOptionsMenu.text = language.returnToOptionsMenu();
		this.widgetsClear();
		this.addWidget(this.graphicsOptionSmoothShadows);
		this.addWidget(this.graphicsOptionDarkenSides);
		this.addWidget(this.graphicsViewDistanceOption);
		this.addWidget(this.graphicsOptionFramerate);
		this.addWidget(this.graphicsOptionResolution);
		this.addWidget(this.graphicsOptionFullscreen);
		this.addWidget(this.graphicsUseServerTexturesOption);
		this.addWidget(this.graphicsFontOption);
		this.addWidget(this.graphicsReturnToOptionsMenu);
	}

	private void handleButtonClick(Button w)
	{
		this.mainHandleClick(w);
		this.optionsHandleClick(w);
		this.graphicsHandleClick(w);
		this.otherHandleClick(w);
		this.keysHandleClick(w);
	}

	private KeyHelp keyHelpCreate(String text, int defaultKey)
	{
		KeyHelp h = new KeyHelp();
		h.text = text;
		h.defaultKey = defaultKey;
		return h;
	}

	private String keyName(int key)
	{
		return this.game.platform.keyName(key);
	}

	private void keysHandleClick(Button b)
	{
		if (this.keyButtons != null) {
			for (int i = 0; i < 1024; i++) {
				if (this.keyButtons[i] == b) {
					this.keyselectid = i;
				}
			}
		}
		if (b == this.keysDefaultKeys) {
			this.game.options.keys = new int[256];
		}
		if (b == this.keysReturnToOptionsMenu) {
			this.setEscapeMenuState(EscapeMenuState.OPTIONS);
		}
	}

	private void keysSet()
	{
		Language language = this.game.language;
		this.keyButtons = new Button[1024];
		for (int i = 0; i < 1024; i++) {
			this.keyButtons[i] = null;
		}
		KeyHelp[] helps = this.keyhelps();
		for (int i = 0; i < 1024; i++) {
			if (helps[i] == null) {
				break;
			}
			int defaultkey = helps[i].defaultKey;
			int key = defaultkey;
			if (this.game.options.keys[defaultkey] != 0) {
				key = this.game.options.keys[defaultkey];
			}
			this.keyButtons[i] = new Button();
			this.keyButtons[i].text = this.game.platform.stringFormat2(language.keyChange(), helps[i].text, this.keyName(key));
			this.addWidget(this.keyButtons[i]);
		}
		this.keysDefaultKeys = new Button();
		this.keysDefaultKeys.text = language.defaultKeys();
		this.keysReturnToOptionsMenu = new Button();
		this.keysReturnToOptionsMenu.text = language.returnToOptionsMenu();
		this.addWidget(this.keysDefaultKeys);
		this.addWidget(this.keysReturnToOptionsMenu);
	}

	public final void loadOptions()
	{
		OptionsCi o = this.loadOptions_();
		if (o == null) {
			return;
		}
		this.game.options = o;
		OptionsCi options = o;
		this.game.font = this.fontValues[options.font];
		this.game.updateTextRendererFont();
		this.game.d_Config3d.viewdistance = options.drawDistance;
		this.game.audioEnabled = options.enableSound;
		this.game.autoJumpEnabled = options.enableAutoJump;
		if (!options.clientLanguage.equals("")) {
			this.game.language.overrideLanguage = options.clientLanguage;
		}
		this.game.d_TerrainChunkTesselator.enableSmoothLight = options.smoothshadows;
		this.game.d_TerrainChunkTesselator.blockShadow = options.blockShadowSave;
		this.game.d_TerrainChunkTesselator.option_DarkenBlockSides = options.enableBlockShadow;
		this.game.eNABLE_LAG = options.framerate;
		this.useFullscreen();
		this.game.useVsync();
		this.useResolution();
	}

	private OptionsCi loadOptions_()
	{
		OptionsCi options = new OptionsCi();
		Preferences preferences = this.game.platform.getPreferences();
		options.shadows = preferences.getBool("Shadows", true);
		options.font = preferences.getInt("Font", 0);
		options.drawDistance = preferences.getInt("DrawDistance", this.game.platform.isFastSystem() ? 128 : 32);
		options.useServerTextures = preferences.getBool("UseServerTextures", true);
		options.enableSound = preferences.getBool("EnableSound", true);
		options.enableAutoJump = preferences.getBool("EnableAutoJump", false);
		options.clientLanguage = preferences.getString("ClientLanguage", "");
		options.framerate = preferences.getInt("Framerate", 0);
		options.resolution = preferences.getInt("Resolution", 0);
		options.fullscreen = preferences.getBool("Fullscreen", false);
		options.smoothshadows = preferences.getBool("Smoothshadows", true);
		options.blockShadowSave = this.one * preferences.getInt("BlockShadowSave", 70) / 100;
		options.enableBlockShadow = preferences.getBool("EnableBlockShadow", true);
		for (int i = 0; i < 256; i++) {
			String preferencesKey = StringTools.stringAppend(this.game.platform, "Key", this.game.platform.intToString(i));
			int value = preferences.getInt(preferencesKey, 0);
			if (value != 0) {
				options.keys[i] = value;
			}
		}
		return options;
	}

	private void mainHandleClick(Button b)
	{
		if (b == this.buttonMainReturnToGame) {
			this.game.guiStateBackToGame();
		}
		if (b == this.buttonMainOptions) {
			this.setEscapeMenuState(EscapeMenuState.OPTIONS);
		}
		if (b == this.buttonMainExit) {
			this.game.sendLeave(0);
			this.game.exitToMainMenu_();
		}
	}

	private void mainSet()
	{
		Language language = this.game.language;
		this.buttonMainReturnToGame = new Button();
		this.buttonMainReturnToGame.text = language.returnToGame();
		this.buttonMainOptions = new Button();
		this.buttonMainOptions.text = language.options();
		this.buttonMainExit = new Button();
		this.buttonMainExit.text = language.exit();
		this.widgetsClear();
		this.addWidget(this.buttonMainReturnToGame);
		this.addWidget(this.buttonMainOptions);
		this.addWidget(this.buttonMainExit);
	}

	private void makeSimpleOptions(int fontsize, int textheight)
	{
		int starty = this.game.ycenter(this.widgetsCount * textheight);
		for (int i = 0; i < this.widgetsCount; i++) {
			String s = this.widgets[i].text;
			float sizeWidth = this.game.textSizeWidth(s, fontsize);
			float sizeHeight = this.game.textSizeHeight(s, fontsize);
			int Width = this.game.platform.floatToInt(sizeWidth) + 10;
			int Height = this.game.platform.floatToInt(sizeHeight);
			int X = this.game.xcenter(sizeWidth);
			int Y = starty + textheight * i;
			this.widgets[i].x = X;
			this.widgets[i].y = Y;
			this.widgets[i].width = Width;
			this.widgets[i].height = Height;
			this.widgets[i].fontsize = fontsize;
			if (i == this.keyselectid) {
				this.widgets[i].fontcolor = Game.colorFromArgb(255, 0, 255, 0);
				this.widgets[i].fontcolorselected = Game.colorFromArgb(255, 0, 255, 0);
			}
		}
	}

	@Override
	public void onKeyDown(Game game_, KeyEventArgs args)
	{
		int eKey = args.getKeyCode();
		if (eKey == this.game.getKey(50)) {
			if (this.escapemenustate == EscapeMenuState.GRAPHICS || this.escapemenustate == EscapeMenuState.KEYS || this.escapemenustate == EscapeMenuState.OTHER) {
				this.setEscapeMenuState(EscapeMenuState.OPTIONS);
			}
			else if (this.escapemenustate == EscapeMenuState.OPTIONS) {
				this.saveOptions();
				this.setEscapeMenuState(EscapeMenuState.MAIN);
			}
			else {
				this.setEscapeMenuState(EscapeMenuState.MAIN);
				this.game.guiStateBackToGame();
			}
			args.setHandled(true);
		}
		if (this.escapemenustate == EscapeMenuState.KEYS) {
			if (this.keyselectid != -1) {
				this.game.options.keys[this.keyhelps()[this.keyselectid].defaultKey] = eKey;
				this.keyselectid = -1;
				args.setHandled(true);
			}
		}
		if (eKey == this.game.getKey(20)) {
			if (this.game.platform.getWindowState() == WindowState.FULLSCREEN) {
				this.game.platform.setWindowState(WindowState.NORMAL);
				this.restoreResolution();
				this.saveOptions();
			}
			else {
				this.game.platform.setWindowState(WindowState.FULLSCREEN);
				this.useResolution();
				this.saveOptions();
			}
			args.setHandled(true);
		}
	}

	@Override
	public void onNewFrameDraw2d(Game game_, float deltaTime)
	{
		this.game = game_;
		if (!this.loaded) {
			this.loaded = true;
			this.loadOptions();
		}
		if (this.game.escapeMenuRestart) {
			this.game.escapeMenuRestart = false;
			this.setEscapeMenuState(EscapeMenuState.MAIN);
		}
		if (this.game.guistate != GuiState.ESCAPE_MENU) {
			return;
		}
		this.setEscapeMenuState(this.escapemenustate);
		this.escapeMenuMouse1();
		for (int i = 0; i < this.widgetsCount; i++) {
			Button w = this.widgets[i];
			this.game.draw2dText1(w.text, w.x, w.y, w.fontsize, IntRef.create(w.selected ? w.fontcolorselected : w.fontcolor), false);
		}
	}

	private void optionsHandleClick(Button b)
	{
		if (b == this.optionsGraphics) {
			this.setEscapeMenuState(EscapeMenuState.GRAPHICS);
		}
		if (b == this.optionsKeys) {
			this.setEscapeMenuState(EscapeMenuState.KEYS);
		}
		if (b == this.optionsOther) {
			this.setEscapeMenuState(EscapeMenuState.OTHER);
		}
		if (b == this.optionsReturnToMainMenu) {
			this.saveOptions();
			this.setEscapeMenuState(EscapeMenuState.MAIN);
		}
	}

	private void optionsSet()
	{
		Language language = this.game.language;
		this.optionsGraphics = new Button();
		this.optionsGraphics.text = language.graphics();
		this.optionsKeys = new Button();
		this.optionsKeys.text = language.keys();
		this.optionsOther = new Button();
		this.optionsOther.text = language.other();
		this.optionsReturnToMainMenu = new Button();
		this.optionsReturnToMainMenu.text = language.returnToMainMenu();
		this.widgetsClear();
		this.addWidget(this.optionsGraphics);
		this.addWidget(this.optionsKeys);
		this.addWidget(this.optionsOther);
		this.addWidget(this.optionsReturnToMainMenu);
	}

	private void otherHandleClick(Button b)
	{
		if (b == this.otherSoundOption) {
			this.game.audioEnabled = !this.game.audioEnabled;
		}
		if (b == this.otherAutoJumpOption) {
			this.game.autoJumpEnabled = !this.game.autoJumpEnabled;
		}
		if (b == this.otherLanguageSetting) {
			this.game.language.nextLanguage();
		}
		if (b == this.otherReturnToOptionsMenu) {
			this.setEscapeMenuState(EscapeMenuState.OPTIONS);
		}
	}

	private void otherSet()
	{
		Language language = this.game.language;
		this.otherSoundOption = new Button();
		this.otherSoundOption.text = this.game.platform.stringFormat(language.soundOption(), this.game.audioEnabled ? language.on() : language.off());
		this.otherAutoJumpOption = new Button();
		this.otherAutoJumpOption.text = this.game.platform.stringFormat(language.autoJumpOption(), this.game.autoJumpEnabled ? language.on() : language.off());
		this.otherLanguageSetting = new Button();
		this.otherLanguageSetting.text = this.game.platform.stringFormat(language.clientLanguageOption(), language.getUsedLanguage());
		this.otherReturnToOptionsMenu = new Button();
		this.otherReturnToOptionsMenu.text = language.returnToOptionsMenu();
		this.widgetsClear();
		this.addWidget(this.otherSoundOption);
		this.addWidget(this.otherAutoJumpOption);
		this.addWidget(this.otherLanguageSetting);
		this.addWidget(this.otherReturnToOptionsMenu);
	}

	private boolean rectContains(int x, int y, int w, int h, int px, int py)
	{
		return px >= x && py >= y && px < x + w && py < y + h;
	}

	private String resolutionString()
	{
		IntRef resolutionsCount = new IntRef();
		DisplayResolutionCi res = this.game.platform.getDisplayResolutions(resolutionsCount)[this.game.options.resolution];
		return this.game.platform.stringFormat4("{0}x{1}, {2}, {3} Hz", this.game.platform.intToString(res.width), this.game.platform.intToString(res.height), this.game.platform.intToString(res.bitsPerPixel), this.game.platform.intToString(this.game.platform.floatToInt(res.refreshRate)));
	}

	public final void restoreResolution()
	{
		if (this.changedResolution) {
			this.game.platform.changeResolution(this.originalResolutionWidth, this.originalResolutionHeight, 32, -1);
			this.changedResolution = false;
		}
	}

	public final void saveOptions()
	{
		OptionsCi options = this.game.options;
		options.font = this.game.font;
		options.shadows = true;
		options.drawDistance = this.game.platform.floatToInt(this.game.d_Config3d.viewdistance);
		options.enableSound = this.game.audioEnabled;
		options.enableAutoJump = this.game.autoJumpEnabled;
		if (this.game.language.overrideLanguage != null) {
			options.clientLanguage = this.game.language.overrideLanguage;
		}
		options.framerate = this.game.eNABLE_LAG;
		options.fullscreen = this.game.platform.getWindowState() == WindowState.FULLSCREEN;
		options.smoothshadows = this.game.d_TerrainChunkTesselator.enableSmoothLight;
		options.enableBlockShadow = this.game.d_TerrainChunkTesselator.option_DarkenBlockSides;
		this.saveOptions_(options);
	}

	private void saveOptions_(OptionsCi options)
	{
		Preferences preferences = this.game.platform.getPreferences();
		preferences.setBool("Shadows", options.shadows);
		preferences.setInt("Font", options.font);
		preferences.setInt("DrawDistance", options.drawDistance);
		preferences.setBool("UseServerTextures", options.useServerTextures);
		preferences.setBool("EnableSound", options.enableSound);
		preferences.setBool("EnableAutoJump", options.enableAutoJump);
		if (!options.clientLanguage.equals("")) {
			preferences.setString("ClientLanguage", options.clientLanguage);
		}
		preferences.setInt("Framerate", options.framerate);
		preferences.setInt("Resolution", options.resolution);
		preferences.setBool("Fullscreen", options.fullscreen);
		preferences.setBool("Smoothshadows", options.smoothshadows);
		preferences.setInt("BlockShadowSave", this.game.platform.floatToInt(options.blockShadowSave * 100));
		preferences.setBool("EnableBlockShadow", options.enableBlockShadow);
		for (int i = 0; i < 256; i++) {
			int value = options.keys[i];
			String preferencesKey = StringTools.stringAppend(this.game.platform, "Key", this.game.platform.intToString(i));
			if (value != 0) {
				preferences.setInt(preferencesKey, value);
			}
			else {
				preferences.remove(preferencesKey);
			}
		}
		this.game.platform.setPreferences(preferences);
	}

	private void setEscapeMenuState(int state)
	{
		Language language = this.game.language;
		this.escapemenustate = state;
		this.widgetsClear();
		if (state == EscapeMenuState.MAIN) {
			this.mainSet();
			this.makeSimpleOptions(20, 50);
		}
		else if (state == EscapeMenuState.OPTIONS) {
			this.optionsSet();
			this.makeSimpleOptions(20, 50);
		}
		else if (state == EscapeMenuState.GRAPHICS) {
			this.graphicsSet();
			this.makeSimpleOptions(20, 50);
		}
		else if (state == EscapeMenuState.OTHER) {
			this.otherSet();
			this.makeSimpleOptions(20, 50);
		}
		else if (state == EscapeMenuState.KEYS) {
			this.keysSet();
			int fontsize = 12;
			int textheight = 20;
			this.makeSimpleOptions(fontsize, textheight);
		}
	}

	private void toggleFont()
	{
		OptionsCi options = this.game.options;
		options.font++;
		if (options.font >= this.fontsLength) {
			options.font = 0;
		}
		this.game.font = this.fontValues[options.font];
		this.game.updateTextRendererFont();
		for (int i = 0; i < this.game.cachedTextTexturesMax; i++) {
			this.game.cachedTextTextures[i] = null;
		}
	}

	private void toggleResolution()
	{
		OptionsCi options = this.game.options;
		options.resolution++;
		IntRef resolutionsCount = new IntRef();
		this.game.platform.getDisplayResolutions(resolutionsCount);
		if (options.resolution >= resolutionsCount.value) {
			options.resolution = 0;
		}
	}

	private void useFullscreen()
	{
		if (this.game.options.fullscreen) {
			if (!this.changedResolution) {
				this.originalResolutionWidth = this.game.platform.getDisplayResolutionDefault().width;
				this.originalResolutionHeight = this.game.platform.getDisplayResolutionDefault().height;
				this.changedResolution = true;
			}
			this.game.platform.setWindowState(WindowState.FULLSCREEN);
			this.useResolution();
		}
		else {
			this.game.platform.setWindowState(WindowState.NORMAL);
			this.restoreResolution();
		}
	}

	public final void useResolution()
	{
		OptionsCi options = this.game.options;
		IntRef resolutionsCount = new IntRef();
		DisplayResolutionCi[] resolutions = this.game.platform.getDisplayResolutions(resolutionsCount);
		if (resolutions == null) {
			return;
		}
		if (options.resolution >= resolutionsCount.value) {
			options.resolution = 0;
		}
		DisplayResolutionCi res = resolutions[options.resolution];
		if (this.game.platform.getWindowState() == WindowState.FULLSCREEN) {
			this.game.platform.changeResolution(res.width, res.height, res.bitsPerPixel, res.refreshRate);
			this.game.platform.setWindowState(WindowState.NORMAL);
			this.game.platform.setWindowState(WindowState.FULLSCREEN);
		}
		else {
		}
	}

	private String vsyncString()
	{
		if (this.game.eNABLE_LAG == 0) {
			return "Vsync";
		}
		else if (this.game.eNABLE_LAG == 1) {
			return "Unlimited";
		}
		else if (this.game.eNABLE_LAG == 2) {
			return "Lag";
		}
		else
			return null;
	}

	private void widgetsClear()
	{
		this.widgetsCount = 0;
	}
	private Button buttonMainExit;
	private Button buttonMainOptions;
	private Button buttonMainReturnToGame;
	private boolean changedResolution;
	private int escapemenustate;
	private int[] fontValues;
	private String[] fonts;
	private int fontsLength;
	Game game;
	private Button graphicsFontOption;
	private Button graphicsOptionDarkenSides;
	private Button graphicsOptionFramerate;
	private Button graphicsOptionFullscreen;
	private Button graphicsOptionResolution;
	private Button graphicsOptionSmoothShadows;
	private Button graphicsReturnToOptionsMenu;
	private Button graphicsUseServerTexturesOption;
	private Button graphicsViewDistanceOption;
	private Button[] keyButtons;

	private KeyHelp[] keyhelps()
	{
		int n = 1024;
		KeyHelp[] helps = new KeyHelp[n];
		for (int i = 0; i < n; i++) {
			helps[i] = null;
		}
		Language language = this.game.language;
		int count = 0;
		helps[count++] = this.keyHelpCreate(language.keyMoveFoward(), 105);
		helps[count++] = this.keyHelpCreate(language.keyMoveBack(), 101);
		helps[count++] = this.keyHelpCreate(language.keyMoveLeft(), 83);
		helps[count++] = this.keyHelpCreate(language.keyMoveRight(), 86);
		helps[count++] = this.keyHelpCreate(language.keyJump(), 51);
		helps[count++] = this.keyHelpCreate(language.keyShowMaterialSelector(), 84);
		helps[count++] = this.keyHelpCreate(language.keySetSpawnPosition(), 98);
		helps[count++] = this.keyHelpCreate(language.keyRespawn(), 97);
		helps[count++] = this.keyHelpCreate(language.keyReloadWeapon(), 100);
		helps[count++] = this.keyHelpCreate(language.keyToggleFogDistance(), 88);
		helps[count++] = this.keyHelpCreate(this.game.platform.stringFormat(language.keyMoveSpeed(), "1"), 10);
		helps[count++] = this.keyHelpCreate(this.game.platform.stringFormat(language.keyMoveSpeed(), "10"), 11);
		helps[count++] = this.keyHelpCreate(language.keyFreeMove(), 12);
		helps[count++] = this.keyHelpCreate(language.keyThirdPersonCamera(), 14);
		helps[count++] = this.keyHelpCreate(language.keyTextEditor(), 18);
		helps[count++] = this.keyHelpCreate(language.keyFullscreen(), 20);
		helps[count++] = this.keyHelpCreate(language.keyScreenshot(), 21);
		helps[count++] = this.keyHelpCreate(language.keyPlayersList(), 52);
		helps[count++] = this.keyHelpCreate(language.keyChat(), 102);
		helps[count++] = this.keyHelpCreate(language.keyTeamChat(), 107);
		helps[count++] = this.keyHelpCreate(language.keyCraft(), 85);
		helps[count++] = this.keyHelpCreate(language.keyBlockInfo(), 91);
		helps[count++] = this.keyHelpCreate(language.keyUse(), 87);
		helps[count++] = this.keyHelpCreate(language.keyReverseMinecart(), 99);
		return helps;
	}
	private Button keysDefaultKeys;
	private Button keysReturnToOptionsMenu;
	private int keyselectid;
	private boolean loaded;
	private float one;
	private Button optionsGraphics;
	private Button optionsKeys;
	private Button optionsOther;
	private Button optionsReturnToMainMenu;
	private int originalResolutionHeight;
	private int originalResolutionWidth;
	private Button otherAutoJumpOption;
	private Button otherLanguageSetting;
	private Button otherReturnToOptionsMenu;
	private Button otherSoundOption;
	private Button[] widgets;
	private int widgetsCount;
}
