// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class ScreenGame extends Screen
{
	public ScreenGame()
	{
		this.game = new Game();
	}

	private void connect(GamePlatform platform)
	{
		if (this.singleplayer) {
			if (platform.singlePlayerServerAvailable()) {
				platform.singlePlayerServerStart(this.singleplayerSavePath);
			}
			else {
				this.serverSimple = new ServerSimple();
				DummyNetwork network = platform.singlePlayerServerGetNetwork();
				network.start(platform.monitorCreate(), platform.monitorCreate());
				DummyNetServer server = new DummyNetServer();
				server.network = network;
				server.platform = platform;
				server.start();
				this.serverSimple.start(server, this.singleplayerSavePath, platform);
				this.serverSimpleMod = new ModServerSimple();
				this.serverSimpleMod.server = this.serverSimple;
				this.game.addMod(this.serverSimpleMod);
				platform.singlePlayerServerGetNetwork().serverReceiveBuffer.enqueue(new ByteArray());
			}
			this.connectData = new ConnectData();
			this.connectData.username = "Local";
			this.game.connectdata = this.connectData;
			DummyNetClient netclient = new DummyNetClient();
			netclient.setPlatform(platform);
			netclient.setNetwork(platform.singlePlayerServerGetNetwork());
			this.game.main = netclient;
		}
		else {
			this.game.connectdata = this.connectData;
			if (platform.enetAvailable()) {
				EnetNetClient client = new EnetNetClient();
				client.setPlatform(platform);
				this.game.main = client;
			}
			else if (platform.tcpAvailable()) {
				TcpNetClient client = new TcpNetClient();
				client.setPlatform(platform);
				this.game.main = client;
			}
			else if (platform.webSocketAvailable()) {
				WebSocketClient client = new WebSocketClient();
				client.setPlatform(platform);
				this.game.main = client;
			}
			else {
				platform.throwException("Network not implemented");
			}
		}
	}

	@Override
	public void onBackPressed()
	{
		this.game.onBackPressed();
	}

	@Override
	public void onKeyDown(KeyEventArgs e)
	{
		this.game.keyDown(e.getKeyCode());
	}

	@Override
	public void onKeyPress(KeyPressEventArgs e)
	{
		this.game.keyPress(e.getKeyChar());
	}

	@Override
	public void onKeyUp(KeyEventArgs e)
	{
		this.game.keyUp(e.getKeyCode());
	}

	@Override
	public void onMouseDown(MouseEventArgs e)
	{
		if (!this.game.platform.focused()) {
			return;
		}
		this.game.mouseDown(e);
	}

	@Override
	public void onMouseMove(MouseEventArgs e)
	{
		if (!this.game.platform.focused()) {
			return;
		}
		this.game.mouseMove(e);
	}

	@Override
	public void onMouseUp(MouseEventArgs e)
	{
		if (!this.game.platform.focused()) {
			return;
		}
		this.game.mouseUp(e);
	}

	@Override
	public void onMouseWheel(MouseWheelEventArgs e)
	{
		this.game.mouseWheelChanged(e);
	}

	@Override
	public void onTouchEnd(TouchEventArgs e)
	{
		this.game.onTouchEnd(e);
	}

	@Override
	public void onTouchMove(TouchEventArgs e)
	{
		this.game.onTouchMove(e);
	}

	@Override
	public void onTouchStart(TouchEventArgs e)
	{
		this.game.onTouchStart(e);
	}

	@Override
	public void render(float dt)
	{
		if (this.game.reconnect) {
			this.game.dispose();
			this.menu.startGame(this.singleplayer, this.singleplayerSavePath, this.connectData);
			return;
		}
		if (this.game.exitToMainMenu) {
			this.game.dispose();
			if (this.game.getRedirect() != null) {
				QueryClient qclient = new QueryClient();
				qclient.setPlatform(this.platform);
				qclient.performQuery(this.game.getRedirect().getIP(), this.game.getRedirect().getPort());
				if (qclient.queryPerformed && !qclient.querySuccess) {
					this.platform.messageBoxShowError(qclient.getServerMessage(), "Redirection error");
					this.menu.startMainMenu();
					return;
				}
				QueryResult qresult = qclient.getResult();
				LoginClientCi lic = new LoginClientCi();
				LoginData lidata = new LoginData();
				String token = this.platform.stringSplit(qresult.publicHash, "=", new IntRef())[1];
				lic.login(this.platform, this.connectData.username, "", token, this.platform.getPreferences().getString("Password", ""), new LoginResultRef(), lidata);
				while (lic.loginResult.value == LoginResult.CONNECTING) {
					lic.update(this.platform);
				}
				if (!lidata.serverCorrect) {
					this.platform.messageBoxShowError("Invalid server address!", "Redirection error!");
					this.menu.startMainMenu();
				}
				else if (!lidata.passwordCorrect) {
					this.menu.startLogin(token, null, 0);
				}
				else if (lidata.serverAddress != null && !lidata.serverAddress.equals("")) {
					this.menu.connectToGame(lidata, this.connectData.username);
				}
			}
			else {
				this.menu.startMainMenu();
			}
			return;
		}
		this.game.onRenderFrame(dt);
	}

	public final void start(GamePlatform platform_, boolean singleplayer_, String singleplayerSavePath_, ConnectData connectData_)
	{
		this.platform = platform_;
		this.singleplayer = singleplayer_;
		this.singleplayerSavePath = singleplayerSavePath_;
		this.connectData = connectData_;
		this.game.platform = this.platform;
		this.game.issingleplayer = this.singleplayer;
		this.game.assets = this.menu.assets;
		this.game.assetsLoadProgress = this.menu.assetsLoadProgress;
		this.game.start();
		this.connect(this.platform);
	}
	private ConnectData connectData;
	private Game game;
	private GamePlatform platform;
	private ServerSimple serverSimple;
	private ModServerSimple serverSimpleMod;
	private boolean singleplayer;
	private String singleplayerSavePath;
}
