// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class MainMenu
{
	public MainMenu()
	{
		this.one = 1;
		this.textures = new DictionaryStringInt1024();
		this.textTextures = new TextTexture[256];
		this.textTexturesCount = 0;
		this.screen = new ScreenMain();
		this.screen.menu = this;
		this.loginClient = new LoginClientCi();
		this.assets = new AssetList();
		this.assetsLoadProgress = new FloatRef();
	}

	private void animate(float dt)
	{
		float maxDt = 1;
		if (dt > maxDt) {
			dt = maxDt;
		}
		if (this.xInv) {
			if (this.xRot <= -this.overlap) {
				this.xInv = false;
				this.xSpeed = this.minspeed + this.rnd.maxNext(5);
			}
			this.xRot -= this.xSpeed * dt;
		}
		else {
			if (this.xRot >= this.overlap) {
				this.xInv = true;
				this.xSpeed = this.minspeed + this.rnd.maxNext(5);
			}
			this.xRot += this.xSpeed * dt;
		}
		if (this.yInv) {
			if (this.yRot <= -this.overlap) {
				this.yInv = false;
				this.ySpeed = this.minspeed + this.rnd.maxNext(5);
			}
			this.yRot -= this.ySpeed * dt;
		}
		else {
			if (this.yRot >= this.overlap) {
				this.yInv = true;
				this.ySpeed = this.minspeed + this.rnd.maxNext(5);
			}
			this.yRot += this.ySpeed * dt;
		}
	}

	public final String charRepeat(int c, int length)
	{
		int[] charArray = new int[length];
		for (int i = 0; i < length; i++) {
			charArray[i] = c;
		}
		return this.p.charArrayToString(charArray, length);
	}

	public final String charToString(int a)
	{
		int[] arr = new int[1];
		arr[0] = a;
		return this.p.charArrayToString(arr, 1);
	}

	final void connectToGame(LoginData loginResultData, String username)
	{
		ConnectData connectData = new ConnectData();
		connectData.ip = loginResultData.serverAddress;
		connectData.port = loginResultData.port;
		connectData.auth = loginResultData.authCode;
		connectData.username = username;
		this.startGame(false, null, connectData);
	}

	public final void connectToSingleplayer(String filename)
	{
		this.startGame(true, filename, null);
	}

	final void createAccount(String user, String password, LoginResultRef loginResult)
	{
		if (user.equals("") || password.equals("")) {
			loginResult.value = LoginResult.FAILED;
		}
		else {
			loginResult.value = LoginResult.OK;
		}
	}

	public final void draw2dQuad(int textureid, float dx, float dy, float dw, float dh)
	{
		Mat4.identity_(this.mvMatrix);
		Mat4.translate(this.mvMatrix, this.mvMatrix, Vec3.fromValues(dx, dy, 0));
		Mat4.scale(this.mvMatrix, this.mvMatrix, Vec3.fromValues(dw, dh, 0));
		Mat4.scale(this.mvMatrix, this.mvMatrix, Vec3.fromValues(this.one / 2, this.one / 2, 0));
		Mat4.translate(this.mvMatrix, this.mvMatrix, Vec3.fromValues(this.one, this.one, 0));
		this.setMatrixUniforms();
		if (this.cubeModel == null) {
			this.cubeModel = this.p.createModel(QuadModelData.getQuadModelData());
		}
		this.p.bindTexture2d(textureid);
		this.p.drawModel(this.cubeModel);
	}

	final void drawBackground()
	{
		this.backgroundW = 512;
		this.backgroundH = 512;
		this.windowX = this.p.getCanvasWidth();
		this.windowY = this.p.getCanvasHeight();
		int countX = this.p.floatToInt((this.windowX + 2 * this.overlap) / this.backgroundW) + 1;
		int countY = this.p.floatToInt((this.windowY + 2 * this.overlap) / this.backgroundH) + 1;
		for (int x = 0; x < countX; x++) {
			for (int y = 0; y < countY; y++) {
				this.draw2dQuad(this.getTexture("background.png"), x * this.backgroundW + this.xRot - this.overlap, y * this.backgroundH + this.yRot - this.overlap, this.backgroundW, this.backgroundH);
			}
		}
	}

	final void drawButton(String text, float fontSize, float dx, float dy, float dw, float dh, boolean pressed)
	{
		this.draw2dQuad(pressed ? this.getTexture("button_sel.png") : this.getTexture("button.png"), dx, dy, dw, dh);
		if (text != null && !text.equals("")) {
			this.drawText(text, fontSize, dx + dw / 2, dy + dh / 2, TextAlign.CENTER, TextBaseline.MIDDLE);
		}
	}

	private void drawScene(float dt)
	{
		this.p.glViewport(0, 0, this.viewportWidth, this.viewportHeight);
		this.p.glClearColorBufferAndDepthBuffer();
		this.p.glDisableDepthTest();
		this.p.glDisableCullFace();
		{
		}
		{
			Mat4.identity_(this.pMatrix);
			Mat4.ortho(this.pMatrix, 0, this.p.getCanvasWidth(), this.p.getCanvasHeight(), 0, 0, 10);
		}
		this.screen.render(dt);
	}

	final void drawServerButton(String name, String motd, String gamemode, String playercount, float x, float y, float width, float height, String image)
	{
		this.draw2dQuad(this.getTexture("serverlist_entry_background.png"), x, y, width, height);
		this.draw2dQuad(this.getTexture(image), x, y, height, height);
		this.drawText(name, 14, x + 70, y + 5, TextAlign.LEFT, TextBaseline.TOP);
		this.drawText(gamemode, 12, x + width - 10, y + height - 5, TextAlign.RIGHT, TextBaseline.BOTTOM);
		this.drawText(playercount, 12, x + width - 10, y + 5, TextAlign.RIGHT, TextBaseline.TOP);
		this.drawText(motd, 12, x + 70, y + height - 5, TextAlign.LEFT, TextBaseline.BOTTOM);
	}

	final void drawText(String text, float fontSize, float x, float y, int align, int baseline)
	{
		TextTexture t = this.getTextTexture(text, fontSize);
		int dx = 0;
		int dy = 0;
		if (align == TextAlign.CENTER) {
			dx -= t.textwidth / 2;
		}
		if (align == TextAlign.RIGHT) {
			dx -= t.textwidth;
		}
		if (baseline == TextBaseline.MIDDLE) {
			dy -= t.textheight / 2;
		}
		if (baseline == TextBaseline.BOTTOM) {
			dy -= t.textheight;
		}
		this.draw2dQuad(t.texture, x + dx, y + dy, t.texturewidth, t.textureheight);
	}

	final void exit()
	{
		this.p.exit();
	}

	final byte[] getFile(String name)
	{
		String pLowercase = this.p.stringToLower(name);
		for (int i = 0; i < this.assets.count; i++) {
			if (this.assets.items[i].name.equals(pLowercase)) {
				return this.assets.items[i].data;
			}
		}
		return null;
	}

	final int getFileLength(String name)
	{
		String pLowercase = this.p.stringToLower(name);
		for (int i = 0; i < this.assets.count; i++) {
			if (this.assets.items[i].name.equals(pLowercase)) {
				return this.assets.items[i].dataLength;
			}
		}
		return 0;
	}

	final String[] getSavegames(IntRef length)
	{
		String[] files = this.p.directoryGetFiles(this.p.pathSavegames(), length);
		String[] savegames = new String[length.value];
		int count = 0;
		for (int i = 0; i < length.value; i++) {
			if (this.stringEndsWith(files[i], ".mddbs")) {
				savegames[count++] = files[i];
			}
		}
		length.value = count;
		return savegames;
	}

	public final float getScale()
	{
		float scale;
		if (this.p.isSmallScreen()) {
			scale = this.one * this.p.getCanvasWidth() / 1280;
		}
		else {
			scale = this.one;
		}
		return scale;
	}

	private TextTexture getTextTexture(String text, float fontSize)
	{
		for (int i = 0; i < this.textTexturesCount; i++) {
			TextTexture t = this.textTextures[i];
			if (t == null) {
				continue;
			}
			if (t.text.equals(text) && t.size == fontSize) {
				return t;
			}
		}
		TextTexture textTexture = new TextTexture();
		Text_ text_ = new Text_();
		text_.text = text;
		text_.fontsize = fontSize;
		text_.fontfamily = "Arial";
		text_.color = Game.colorFromArgb(255, 255, 255, 255);
		BitmapCi textBitmap = this.textColorRenderer.createTextTexture(text_);
		int texture = this.p.loadTextureFromBitmap(textBitmap);
		IntRef textWidth = new IntRef();
		IntRef textHeight = new IntRef();
		this.p.textSize(text, fontSize, textWidth, textHeight);
		textTexture.texture = texture;
		textTexture.texturewidth = this.p.floatToInt(this.p.bitmapGetWidth(textBitmap));
		textTexture.textureheight = this.p.floatToInt(this.p.bitmapGetHeight(textBitmap));
		textTexture.text = text;
		textTexture.size = fontSize;
		textTexture.textwidth = textWidth.value;
		textTexture.textheight = textHeight.value;
		this.p.bitmapDelete(textBitmap);
		this.textTextures[this.textTexturesCount++] = textTexture;
		return textTexture;
	}

	final int getTexture(String name)
	{
		if (!this.textures.contains(name)) {
			BoolRef found = new BoolRef();
			BitmapCi bmp = this.p.bitmapCreateFromPng(this.getFile(name), this.getFileLength(name));
			int texture = this.p.loadTextureFromBitmap(bmp);
			this.textures.set(name, texture);
			this.p.bitmapDelete(bmp);
		}
		return this.textures.get(name);
	}

	public final void handleKeyDown(KeyEventArgs e)
	{
		this.currentlyPressedKeys[e.getKeyCode()] = true;
		this.screen.onKeyDown(e);
	}

	public final void handleKeyPress(KeyPressEventArgs e)
	{
		if (e.getKeyChar() == 70 || e.getKeyChar() == 102) {
			this.filter += 1;
			if (this.filter == 3) {
				this.filter = 0;
			}
		}
		if (e.getKeyChar() == 96) {
			this.screen.onBackPressed();
		}
		this.screen.onKeyPress(e);
	}

	public final void handleKeyUp(KeyEventArgs e)
	{
		this.currentlyPressedKeys[e.getKeyCode()] = false;
		this.screen.onKeyUp(e);
	}

	public final void handleMouseDown(MouseEventArgs e)
	{
		this.mousePressed = true;
		this.previousMouseX = e.getX();
		this.previousMouseY = e.getY();
		this.screen.onMouseDown(e);
	}

	public final void handleMouseMove(MouseEventArgs e)
	{
		float dx = e.getMovementX();
		float dy = e.getMovementY();
		this.previousMouseX = e.getX();
		this.previousMouseY = e.getY();
		if (this.mousePressed) {
		}
		this.screen.onMouseMove(e);
	}

	public final void handleMouseUp(MouseEventArgs e)
	{
		this.mousePressed = false;
		this.screen.onMouseUp(e);
	}

	public final void handleMouseWheel(MouseWheelEventArgs e)
	{
		this.z += e.getDeltaPrecise() / 5;
		this.screen.onMouseWheel(e);
	}

	public final void handleTouchEnd(TouchEventArgs e)
	{
		this.screen.onTouchEnd(e);
	}

	public final void handleTouchMove(TouchEventArgs e)
	{
		this.screen.onTouchMove(e);
		if (e.getId() != this.touchId) {
			return;
		}
		float dx = e.getX() - this.previousTouchX;
		float dy = e.getY() - this.previousTouchY;
		this.previousTouchX = e.getX();
		this.previousTouchY = e.getY();
		this.ySpeed += dx / 10;
		this.xSpeed += dy / 10;
	}

	public final void handleTouchStart(TouchEventArgs e)
	{
		this.touchId = e.getId();
		this.previousTouchX = e.getX();
		this.previousTouchY = e.getY();
		this.screen.onTouchStart(e);
	}

	final void login(String user, String password, String serverHash, String token, LoginResultRef loginResult, LoginData loginResultData)
	{
		if (user.equals("") || password.equals("") && token.equals("")) {
			loginResult.value = LoginResult.FAILED;
		}
		else {
			this.loginClient.login(this.p, user, password, serverHash, token, loginResult, loginResultData);
		}
	}

	public final void onNewFrame(NewFrameEventArgs args)
	{
		if (!this.initialized) {
			this.initialized = true;
			this.p.initShaders();
			this.p.glClearColorRgbaf(0, 0, 0, 1);
			this.p.glEnableDepthTest();
		}
		this.viewportWidth = this.p.getCanvasWidth();
		this.viewportHeight = this.p.getCanvasHeight();
		this.drawScene(args.getDt());
		this.animate(args.getDt());
		this.loginClient.update(this.p);
	}

	private void setMatrixUniforms()
	{
		this.p.setMatrixUniformProjection(this.pMatrix);
		this.p.setMatrixUniformModelView(this.mvMatrix);
	}

	public final void start(GamePlatform p_)
	{
		this.p = p_;
		this.lang = new Language();
		this.lang.platform = this.p;
		this.lang.loadTranslations();
		this.p.setTitle(this.lang.gameName());
		this.textColorRenderer = new TextColorRenderer();
		this.textColorRenderer.platform = p_;
		p_.loadAssetsAsyc(this.assets, this.assetsLoadProgress);
		this.overlap = 200;
		this.minspeed = 20;
		this.rnd = this.p.randomCreate();
		this.xRot = 0;
		this.xInv = false;
		this.xSpeed = this.minspeed + this.rnd.maxNext(5);
		this.yRot = 0;
		this.yInv = false;
		this.ySpeed = this.minspeed + this.rnd.maxNext(5);
		this.z = -5;
		this.filter = 0;
		this.mvMatrix = Mat4.create();
		this.pMatrix = Mat4.create();
		this.currentlyPressedKeys = new boolean[256];
		this.p.addOnNewFrame(MainMenuNewFrameHandler.create(this));
		this.p.addOnKeyEvent(MainMenuKeyEventHandler.create(this));
		this.p.addOnMouseEvent(MainMenuMouseEventHandler.create(this));
		this.p.addOnTouchEvent(MainMenuTouchEventHandler.create(this));
	}

	final void startConnectToIp()
	{
		ScreenConnectToIp screenConnectToIp = new ScreenConnectToIp();
		this.screen = screenConnectToIp;
		this.screen.menu = this;
		this.screen.loadTranslations();
	}

	public final void startGame(boolean singleplayer, String singleplayerSavePath, ConnectData connectData)
	{
		ScreenGame screenGame = new ScreenGame();
		screenGame.menu = this;
		screenGame.start(this.p, singleplayer, singleplayerSavePath, connectData);
		this.screen = screenGame;
	}

	final void startLogin(String serverHash, String ip, int port)
	{
		ScreenLogin screenLogin = new ScreenLogin();
		screenLogin.serverHash = serverHash;
		screenLogin.serverIp = ip;
		screenLogin.serverPort = port;
		this.screen = screenLogin;
		this.screen.menu = this;
		this.screen.loadTranslations();
	}

	final void startMainMenu()
	{
		this.screen = new ScreenMain();
		this.screen.menu = this;
		this.p.exitMousePointerLock();
	}

	final void startModifyWorld()
	{
	}

	final void startMultiplayer()
	{
		this.screen = new ScreenMultiplayer();
		this.screen.menu = this;
		this.screen.loadTranslations();
	}

	final void startNewWorld()
	{
	}

	final void startSingleplayer()
	{
		this.screen = new ScreenSingleplayer();
		this.screen.menu = this;
		this.screen.loadTranslations();
	}

	public final boolean stringEndsWith(String s, String value)
	{
		return StringTools.stringSubstring(this.p, s, this.stringLength(s) - this.stringLength(value), this.stringLength(value)).equals(value);
	}

	public final int stringLength(String a)
	{
		IntRef length = new IntRef();
		this.p.stringToCharArray(a, length);
		return length.value;
	}
	AssetList assets;
	FloatRef assetsLoadProgress;
	int backgroundH;
	int backgroundW;
	private Model cubeModel;
	private boolean[] currentlyPressedKeys;

	private final float degToRad(float degrees)
	{
		return degrees * GlMatrixMath.pI() / 180;
	}
	private int filter;
	private boolean initialized;
	Language lang;
	private LoginClientCi loginClient;
	private int minspeed;
	private boolean mousePressed;
	private float[] mvMatrix;
	float one;
	private int overlap;
	GamePlatform p;
	private float[] pMatrix;
	private int previousMouseX;
	private int previousMouseY;
	private int previousTouchX;
	private int previousTouchY;
	private RandomCi rnd;
	private Screen screen;
	TextColorRenderer textColorRenderer;
	private TextTexture[] textTextures;
	private int textTexturesCount;
	DictionaryStringInt1024 textures;
	private int touchId;
	private int viewportHeight;
	private int viewportWidth;
	float windowX;
	float windowY;
	private boolean xInv;
	private float xRot;
	private float xSpeed;
	private boolean yInv;
	private float yRot;
	private float ySpeed;
	private float z;
}
