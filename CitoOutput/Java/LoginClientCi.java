// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class LoginClientCi
{

	public final void login(GamePlatform platform, String user, String password, String publicServerKey, String token, LoginResultRef result, LoginData resultLoginData_)
	{
		this.loginResult = result;
		this.resultLoginData = resultLoginData_;
		result.value = LoginResult.CONNECTING;
		this.loginUser = user;
		this.loginPassword = password;
		this.loginToken = token;
		this.loginPublicServerKey = publicServerKey;
		this.shouldLogin = true;
	}
	private String loginPassword;
	private String loginPublicServerKey;
	private String loginToken;
	private String loginUser;

	public final void update(GamePlatform platform)
	{
		if (this.loginResult == null) {
			return;
		}
		if (this.loginUrlResponse == null && this.loginUrl == null) {
			this.loginUrlResponse = new HttpResponseCi();
			platform.webClientDownloadDataAsync("http://manicdigger.sourceforge.net/login.php", this.loginUrlResponse);
		}
		if (this.loginUrlResponse != null && this.loginUrlResponse.done) {
			this.loginUrl = platform.stringFromUtf8ByteArray(this.loginUrlResponse.value, this.loginUrlResponse.valueLength);
			this.loginUrlResponse = null;
		}
		if (this.loginUrl != null) {
			if (this.shouldLogin) {
				this.shouldLogin = false;
				String requestString = platform.stringFormat4("username={0}&password={1}&server={2}&token={3}", this.loginUser, this.loginPassword, this.loginPublicServerKey, this.loginToken);
				IntRef byteArrayLength = new IntRef();
				byte[] byteArray = platform.stringToUtf8ByteArray(requestString, byteArrayLength);
				this.loginResponse = new HttpResponseCi();
				platform.webClientUploadDataAsync(this.loginUrl, byteArray, byteArrayLength.value, this.loginResponse);
			}
			if (this.loginResponse != null && this.loginResponse.done) {
				String responseString = platform.stringFromUtf8ByteArray(this.loginResponse.value, this.loginResponse.valueLength);
				this.resultLoginData.passwordCorrect = !(platform.stringContains(responseString, "Wrong username") || platform.stringContains(responseString, "Incorrect username"));
				this.resultLoginData.serverCorrect = !platform.stringContains(responseString, "server");
				if (this.resultLoginData.passwordCorrect) {
					this.loginResult.value = LoginResult.OK;
				}
				else {
					this.loginResult.value = LoginResult.FAILED;
				}
				IntRef linesCount = new IntRef();
				String[] lines = platform.readAllLines(responseString, linesCount);
				if (linesCount.value >= 3) {
					this.resultLoginData.authCode = lines[0];
					this.resultLoginData.serverAddress = lines[1];
					this.resultLoginData.port = platform.intParse(lines[2]);
					this.resultLoginData.token = lines[3];
				}
				this.loginResponse = null;
			}
		}
	}
	private HttpResponseCi loginResponse;
	LoginResultRef loginResult;
	private String loginUrl;
	private HttpResponseCi loginUrlResponse;
	private LoginData resultLoginData;
	private boolean shouldLogin;
}
