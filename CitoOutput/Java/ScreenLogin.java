// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class ScreenLogin extends Screen
{
	public ScreenLogin()
	{
		this.login = new MenuWidget();
		this.login.text = "Login";
		this.login.type = WidgetType.BUTTON;
		this.login.nextWidget = 9;
		this.loginUsername = new MenuWidget();
		this.loginUsername.type = WidgetType.TEXTBOX;
		this.loginUsername.text = "";
		this.loginUsername.description = "Username";
		this.loginUsername.nextWidget = 2;
		this.loginPassword = new MenuWidget();
		this.loginPassword.type = WidgetType.TEXTBOX;
		this.loginPassword.text = "";
		this.loginPassword.description = "Password";
		this.loginPassword.password = true;
		this.loginPassword.nextWidget = 3;
		this.loginRememberMe = new MenuWidget();
		this.loginRememberMe.text = "Yes";
		this.loginRememberMe.type = WidgetType.BUTTON;
		this.loginRememberMe.description = "Remember me";
		this.loginRememberMe.nextWidget = 0;
		this.createAccount = new MenuWidget();
		this.createAccount.text = "Create account";
		this.createAccount.type = WidgetType.BUTTON;
		this.createAccountUsername = new MenuWidget();
		this.createAccountUsername.text = "";
		this.createAccountUsername.type = WidgetType.TEXTBOX;
		this.createAccountUsername.description = "Username";
		this.createAccountPassword = new MenuWidget();
		this.createAccountPassword.text = "";
		this.createAccountPassword.type = WidgetType.TEXTBOX;
		this.createAccountPassword.description = "Password";
		this.createAccountPassword.password = true;
		this.createAccountRememberMe = new MenuWidget();
		this.createAccountRememberMe.text = "Yes";
		this.createAccountRememberMe.type = WidgetType.BUTTON;
		this.createAccountRememberMe.description = "Remember me";
		this.back = new MenuWidget();
		this.back.text = "Back";
		this.back.type = WidgetType.BUTTON;
		this.back.nextWidget = 1;
		this.title = "Login";
		this.widgets[0] = this.login;
		this.widgets[1] = this.loginUsername;
		this.widgets[2] = this.loginPassword;
		this.widgets[3] = this.loginRememberMe;
		this.widgets[4] = this.createAccount;
		this.widgets[5] = this.createAccountUsername;
		this.widgets[6] = this.createAccountPassword;
		this.widgets[7] = this.createAccountRememberMe;
		this.widgets[9] = this.back;
		this.loginUsername.getFocus();
		this.loginResult = new LoginResultRef();
	}

	@Override
	public void loadTranslations()
	{
		this.login.text = this.menu.lang.get("MainMenu_Login");
		this.loginUsername.description = this.menu.lang.get("MainMenu_LoginUsername");
		this.loginPassword.description = this.menu.lang.get("MainMenu_LoginPassword");
		this.loginRememberMe.text = this.menu.lang.get("MainMenu_ChoiceYes");
		this.loginRememberMe.description = this.menu.lang.get("MainMenu_LoginRemember");
		this.back.text = this.menu.lang.get("MainMenu_ButtonBack");
		this.title = this.menu.lang.get("MainMenu_Login");
	}

	@Override
	public void onBackPressed()
	{
		this.menu.startMultiplayer();
	}

	@Override
	public void onButton(MenuWidget w)
	{
		if (w == this.login) {
			this.loginResultData = new LoginData();
			if (this.serverHash != null) {
				this.menu.login(this.loginUsername.text, this.loginPassword.text, this.serverHash, "", this.loginResult, this.loginResultData);
			}
			else {
				if (this.loginRememberMe.text.equals(this.menu.lang.get("MainMenu_ChoiceYes"))) {
					Preferences preferences = this.menu.p.getPreferences();
					preferences.setString("Username", this.loginUsername.text);
					this.menu.p.setPreferences(preferences);
				}
				ConnectData connectdata = new ConnectData();
				connectdata.ip = this.serverIp;
				connectdata.port = this.serverPort;
				connectdata.username = this.loginUsername.text;
				this.menu.startGame(false, null, connectdata);
			}
		}
		if (w == this.createAccount) {
			this.menu.createAccount(this.createAccountUsername.text, this.createAccountPassword.text, this.loginResult);
		}
		if (w == this.loginRememberMe || w == this.createAccountRememberMe) {
			if (w.text.equals(this.menu.lang.get("MainMenu_ChoiceYes"))) {
				w.text = this.menu.lang.get("MainMenu_ChoiceNo");
			}
			else {
				w.text = this.menu.lang.get("MainMenu_ChoiceYes");
			}
		}
		if (w == this.back) {
			this.onBackPressed();
		}
	}

	@Override
	public void render(float dt)
	{
		if (!this.triedSavedLogin) {
			Preferences preferences = this.menu.p.getPreferences();
			this.loginUsername.text = preferences.getString("Username", "");
			this.loginPassword.text = "";
			String token = preferences.getString("Password", "");
			this.loginResultData = new LoginData();
			if (this.serverHash != null && !token.equals("")) {
				this.menu.login(this.loginUsername.text, this.loginPassword.text, this.serverHash, token, this.loginResult, this.loginResultData);
			}
			this.triedSavedLogin = true;
		}
		if (this.loginResultData != null && this.loginResultData.serverCorrect && this.loginResultData.passwordCorrect) {
			if (this.loginRememberMe.text.equals(this.menu.lang.get("MainMenu_ChoiceYes"))) {
				Preferences preferences = this.menu.p.getPreferences();
				preferences.setString("Username", this.loginUsername.text);
				if (this.loginResultData.token != null && !this.loginResultData.token.equals("")) {
					preferences.setString("Password", this.loginResultData.token);
				}
				this.menu.p.setPreferences(preferences);
			}
			this.menu.connectToGame(this.loginResultData, this.loginUsername.text);
		}
		GamePlatform p = this.menu.p;
		float scale = this.menu.getScale();
		this.menu.drawBackground();
		float leftx = p.getCanvasWidth() / 2 - 400 * scale;
		float y = p.getCanvasHeight() / 2 - 250 * scale;
		String loginResultText = null;
		if (this.loginResult.value == LoginResult.FAILED) {
			loginResultText = this.menu.lang.get("MainMenu_LoginInvalid");
		}
		if (this.loginResult.value == LoginResult.CONNECTING) {
			loginResultText = this.menu.lang.get("MainMenu_LoginConnecting");
		}
		if (loginResultText != null) {
			this.menu.drawText(loginResultText, 14 * scale, leftx, y - 50 * scale, TextAlign.LEFT, TextBaseline.TOP);
		}
		this.menu.drawText(this.title, 14 * scale, leftx, y + 50 * scale, TextAlign.LEFT, TextBaseline.TOP);
		this.loginUsername.x = leftx;
		this.loginUsername.y = y + 100 * scale;
		this.loginUsername.sizex = 256 * scale;
		this.loginUsername.sizey = 64 * scale;
		this.loginUsername.fontSize = 14 * scale;
		this.loginPassword.x = leftx;
		this.loginPassword.y = y + 200 * scale;
		this.loginPassword.sizex = 256 * scale;
		this.loginPassword.sizey = 64 * scale;
		this.loginPassword.fontSize = 14 * scale;
		this.loginRememberMe.x = leftx;
		this.loginRememberMe.y = y + 300 * scale;
		this.loginRememberMe.sizex = 256 * scale;
		this.loginRememberMe.sizey = 64 * scale;
		this.loginRememberMe.fontSize = 14 * scale;
		this.login.x = leftx;
		this.login.y = y + 400 * scale;
		this.login.sizex = 256 * scale;
		this.login.sizey = 64 * scale;
		this.login.fontSize = 14 * scale;
		float rightx = p.getCanvasWidth() / 2 + 150 * scale;
		this.createAccountUsername.x = rightx;
		this.createAccountUsername.y = y + 100 * scale;
		this.createAccountUsername.sizex = 256 * scale;
		this.createAccountUsername.sizey = 64 * scale;
		this.createAccountUsername.fontSize = 14 * scale;
		this.createAccountPassword.x = rightx;
		this.createAccountPassword.y = y + 200 * scale;
		this.createAccountPassword.sizex = 256 * scale;
		this.createAccountPassword.sizey = 64 * scale;
		this.createAccountPassword.fontSize = 14 * scale;
		this.createAccountRememberMe.x = rightx;
		this.createAccountRememberMe.y = y + 300 * scale;
		this.createAccountRememberMe.sizex = 256 * scale;
		this.createAccountRememberMe.sizey = 64 * scale;
		this.createAccountRememberMe.fontSize = 14 * scale;
		this.createAccount.x = rightx;
		this.createAccount.y = y + 400 * scale;
		this.createAccount.sizex = 256 * scale;
		this.createAccount.sizey = 64 * scale;
		this.createAccount.fontSize = 14 * scale;
		this.createAccountUsername.visible = false;
		this.createAccountPassword.visible = false;
		this.createAccountRememberMe.visible = false;
		this.createAccount.visible = false;
		this.back.x = 40 * scale;
		this.back.y = p.getCanvasHeight() - 104 * scale;
		this.back.sizex = 256 * scale;
		this.back.sizey = 64 * scale;
		this.back.fontSize = 14 * scale;
		this.drawWidgets();
	}
	private MenuWidget back;
	private MenuWidget createAccount;
	private MenuWidget createAccountPassword;
	private MenuWidget createAccountRememberMe;
	private MenuWidget createAccountUsername;
	private MenuWidget login;
	private MenuWidget loginPassword;
	private MenuWidget loginRememberMe;
	private LoginResultRef loginResult;
	private LoginData loginResultData;
	private MenuWidget loginUsername;
	String serverHash;
	String serverIp;
	int serverPort;
	private String title;
	private boolean triedSavedLogin;
}
