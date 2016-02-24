// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class Game
{
	public Game()
	{
		this.one = 1;
		this.map = new Map();
		this.performanceinfo = new DictionaryStringString();
		this.audioEnabled = true;
		this.autoJumpEnabled = false;
		this.playerPositionSpawnX = 15 + this.one / 2;
		this.playerPositionSpawnY = 64;
		this.playerPositionSpawnZ = 15 + this.one / 2;
		this.textureId = new int[1024][];
		for (int i = 0; i < 1024; i++) {
			this.textureId[i] = new int[6];
		}
		this.textureIdForInventory = new int[1024];
		this.language = new Language();
		this.lastplacedblockX = -1;
		this.lastplacedblockY = -1;
		this.lastplacedblockZ = -1;
		this.mLightLevels = new float[16];
		this.sunlight_ = 15;
		this.mvMatrix = new StackMatrix4();
		this.pMatrix = new StackMatrix4();
		this.mvMatrix.push(Mat4.create());
		this.pMatrix.push(Mat4.create());
		this.whitetexture = -1;
		this.cachedTextTexturesMax = 1024;
		this.cachedTextTextures = new CachedTextTexture[this.cachedTextTexturesMax];
		for (int i = 0; i < this.cachedTextTexturesMax; i++) {
			this.cachedTextTextures[i] = null;
		}
		this.packetLen = new IntRef();
		this.eNABLE_DRAW2D = true;
		this.allowFreemove = true;
		this.enableCameraControl = true;
		this.textures = new DictionaryStringInt1024();
		this.serverInfo = new ServerInformation();
		this.menustate = new MenuState();
		this.mouseleftclick = false;
		this.mouseleftdeclick = false;
		this.wasmouseleft = false;
		this.mouserightclick = false;
		this.mouserightdeclick = false;
		this.wasmouseright = false;
		this.eNABLE_LAG = 0;
		this.znear = this.one / 10;
		this.cameraMatrix = new GetCameraMatrix();
		this.eNABLE_ZFAR = true;
		this.totalAmmo = new int[1024];
		this.loadedAmmo = new int[1024];
		this.allowedFontsCount = 1;
		this.allowedFonts = new String[this.allowedFontsCount];
		this.allowedFonts[0] = "Verdana";
		this.fov = Game.getPi() / 3;
		this.cameratype = CameraType.FPP;
		this.eNABLE_TPP_VIEW = false;
		this.basemovespeed = 5;
		this.movespeed = 5;
		this.radiusWhenMoving = this.one * 3 / 10;
		this.playervelocity = new Vector3Ref();
		this.localPlayerId = -1;
		this.dialogs = new VisibleDialog[512];
		this.dialogsCount = 512;
		this.blockHealth = new DictionaryVector3Float();
		this.playertexturedefault = -1;
		this.a = new AnimationState();
		this.constRotationSpeed = this.one * 180 / 20;
		this.modmanager = new ClientModManager1();
		this.particleEffectBlockBreak = new ModDrawParticleEffectBlockBreak();
		this.pICK_DISTANCE = 4.1f;
		this.selectedmodelid = -1;
		this.grenadetime = 3;
		this.rotationspeed = this.one * 15 / 100;
		this.entities = new Entity[4096];
		for (int i = 0; i < 4096; i++) {
			this.entities[i] = null;
		}
		this.entitiesCount = 512;
		this.playerPushDistance = 2;
		this.keyboardState = new boolean[256];
		for (int i = 0; i < 256; i++) {
			this.keyboardState[i] = false;
		}
		this.keyboardStateRaw = new boolean[256];
		for (int i = 0; i < 256; i++) {
			this.keyboardStateRaw[i] = false;
		}
		this.overheadcameradistance = 10;
		this.tppcameradistance = 3;
		this.tPP_CAMERA_DISTANCE_MIN = 1;
		this.tPP_CAMERA_DISTANCE_MAX = 10;
		this.options = new OptionsCi();
		this.overheadcameraK = new Kamera();
		this.fillAreaLimit = 200;
		this.speculativeCount = 0;
		this.speculative = new Speculative[8192];
		this.typinglog = new String[16384];
		this.typinglogCount = 0;
		this.newBlockTypes = new Packet_BlockType[1024];
		this.localplayeranim = new AnimationState();
		this.localplayeranimationhint = new AnimationHint();
		this.enable_move = true;
		this.handTexture = -1;
		this.modelViewInverted = new float[16];
		this.gLScaleTempVec3 = Vec3.create();
		this.gLRotateTempVec3 = Vec3.create();
		this.gLTranslateTempVec3 = Vec3.create();
		this.identityMatrix = Mat4.identity_(Mat4.create());
		this.set3dProjectionTempMat4 = Mat4.create();
		this.getAsset = new String[2048];
		this.playerStats = new Packet_ServerPlayerStats();
		this.mLightLevels = new float[16];
		for (int i = 0; i < 16; i++) {
			this.mLightLevels[i] = this.one * i / 15;
		}
		this.soundnow = new BoolRef();
		this.camera = Mat4.create();
		this.packetHandlers = new ClientPacketHandler[256];
		this.player = new Entity();
		this.player.position = new EntityPosition_();
		this.currentlyAttackedEntity = -1;
		this.chatLinesMax = 1;
		this.chatLines = new Chatline[this.chatLinesMax];
		this.chatLineLength = 64;
		this.audio = new AudioControl();
		this.cameraEyeX = -1;
		this.cameraEyeY = -1;
		this.cameraEyeZ = -1;
		this.controls = new Controls();
		this.movedz = 0;
		this.taskScheduler = new TaskScheduler();
		this.commitActions = ListAction.create(16384);
		this.constWallDistance = 0.3f;
		this.mouseSmoothing = true;
	}
	int activeMaterial;

	public final void addChatline(String s)
	{
		Game game = this;
		if (game.platform.stringEmpty(s)) {
			return;
		}
		boolean containsLink = false;
		String linkTarget = "";
		if (game.platform.stringContains(s, "http://")) {
			containsLink = true;
			IntRef r = new IntRef();
			String[] temp = game.platform.stringSplit(s, " ", r);
			for (int i = 0; i < r.value; i++) {
				if (game.platform.stringIndexOf(temp[i], "http://") != -1) {
					linkTarget = temp[i];
					break;
				}
			}
		}
		if (game.platform.stringContains(s, "https://")) {
			containsLink = true;
			IntRef r = new IntRef();
			String[] temp = game.platform.stringSplit(s, " ", r);
			for (int i = 0; i < r.value; i++) {
				if (game.platform.stringIndexOf(temp[i], "https://") != -1) {
					linkTarget = temp[i];
					break;
				}
			}
		}
		int now = game.platform.timeMillisecondsFromStart();
		if (s.length() > this.chatLineLength) {
			for (int i = 0; i <= s.length() / this.chatLineLength; i++) {
				int displayLength = this.chatLineLength;
				if (s.length() - i * this.chatLineLength < this.chatLineLength) {
					displayLength = s.length() - i * this.chatLineLength;
				}
				if (containsLink)
					this.chatLinesAdd(Chatline.createClickable(StringTools.stringSubstring(game.platform, s, i * this.chatLineLength, displayLength), now, linkTarget));
				else
					this.chatLinesAdd(Chatline.create(StringTools.stringSubstring(game.platform, s, i * this.chatLineLength, displayLength), now));
			}
		}
		else {
			if (containsLink)
				this.chatLinesAdd(Chatline.createClickable(s, now, linkTarget));
			else
				this.chatLinesAdd(Chatline.create(s, now));
		}
	}

	public final void addMod(ClientMod mod)
	{
		this.clientmods[this.clientmodsCount++] = mod;
		mod.start(this.modmanager);
	}

	private void addSpeculative(Speculative s_)
	{
		for (int i = 0; i < this.speculativeCount; i++) {
			if (this.speculative[i] == null) {
				this.speculative[i] = s_;
				return;
			}
		}
		this.speculative[this.speculativeCount++] = s_;
	}
	boolean allowFreemove;
	private String[] allowedFonts;
	private int allowedFontsCount;

	static float angle256ToRad(int value)
	{
		float one_ = 1;
		return one_ * value / 255 * Game.getPi() * 2;
	}

	final void applyDamageToPlayer(int damage, int damageSource, int sourceId)
	{
		this.playerStats.currentHealth -= damage;
		if (this.playerStats.currentHealth <= 0) {
			this.playerStats.currentHealth = 0;
			this.audioPlay("death.wav");
			this.sendPacketClient(ClientPackets.death(damageSource, sourceId));
		}
		else {
			this.audioPlay(this.rnd.next() % 2 == 0 ? "grunt1.wav" : "grunt2.wav");
		}
		this.sendPacketClient(ClientPackets.health(this.playerStats.currentHealth));
	}
	boolean audioEnabled;

	public final void audioPlay(String file)
	{
		if (!this.audioEnabled) {
			return;
		}
		this.audioPlayAt(file, this.eyesPosX(), this.eyesPosY(), this.eyesPosZ());
	}

	public final void audioPlayAt(String file, float x, float y, float z)
	{
		if (file == null) {
			return;
		}
		if (!this.audioEnabled) {
			return;
		}
		if (this.assetsLoadProgress.value != 1) {
			return;
		}
		String file_ = this.platform.stringReplace(file, ".wav", ".ogg");
		if (this.getFileLength(file_) == 0) {
			this.platform.consoleWriteLine(this.platform.stringFormat("File not found: {0}", file));
			return;
		}
		Sound_ s = new Sound_();
		s.name = file_;
		s.x = x;
		s.y = y;
		s.z = z;
		this.audio.add(s);
	}

	public final void audioPlayLoop(String file, boolean play, boolean restart)
	{
		if (!this.audioEnabled && play) {
			return;
		}
		if (this.assetsLoadProgress.value != 1) {
			return;
		}
		String file_ = this.platform.stringReplace(file, ".wav", ".ogg");
		if (this.getFileLength(file_) == 0) {
			this.platform.consoleWriteLine(this.platform.stringFormat("File not found: {0}", file));
			return;
		}
		if (play) {
			Sound_ s = null;
			boolean alreadyPlaying = false;
			for (int i = 0; i < this.audio.soundsCount; i++) {
				if (this.audio.sounds[i] == null) {
					continue;
				}
				if (this.audio.sounds[i].name.equals(file_)) {
					alreadyPlaying = true;
					s = this.audio.sounds[i];
				}
			}
			if (!alreadyPlaying) {
				s = new Sound_();
				s.name = file_;
				s.loop = true;
				this.audio.add(s);
			}
			s.x = this.eyesPosX();
			s.y = this.eyesPosY();
			s.z = this.eyesPosZ();
		}
		else {
			for (int i = 0; i < this.audio.soundsCount; i++) {
				if (this.audio.sounds[i] == null) {
					continue;
				}
				if (this.audio.sounds[i].name.equals(file_)) {
					this.audio.sounds[i].stop = true;
				}
			}
		}
	}
	boolean autoJumpEnabled;

	final IntRef blockInHand()
	{
		Packet_Item item = this.d_Inventory.rightHand[this.activeMaterial];
		if (item != null && item.itemClass == 0) {
			return IntRef.create(item.blockId);
		}
		return null;
	}

	final int blockUnderPlayer()
	{
		if (!this.map.isValidPos(this.platform.floatToInt(this.player.position.x), this.platform.floatToInt(this.player.position.z), this.platform.floatToInt(this.player.position.y) - 1)) {
			return -1;
		}
		int blockunderplayer = this.map.getBlock(this.platform.floatToInt(this.player.position.x), this.platform.floatToInt(this.player.position.z), this.platform.floatToInt(this.player.position.y) - 1);
		return blockunderplayer;
	}

	public final boolean boolCommandArgument(String arguments)
	{
		arguments = this.platform.stringTrim(arguments);
		return arguments.equals("") || arguments.equals("1") || arguments.equals("on") || arguments.equals("yes");
	}

	public static int[] byteArrayToUshortArray(byte[] input, int inputLength)
	{
		int outputLength = inputLength / 2;
		int[] output = new int[outputLength];
		for (int i = 0; i < outputLength; i++) {
			output[i] = ((input[i * 2 + 1] & 0xff) << 8) + (input[i * 2] & 0xff);
		}
		return output;
	}

	private void cacheAsset(Asset asset)
	{
		if (asset.md5 == null) {
			return;
		}
		if (!this.platform.isChecksum(asset.md5)) {
			return;
		}
		if (!this.platform.isCached(asset.md5)) {
			this.platform.saveAssetToCache(asset);
		}
	}

	public final void cameraChange()
	{
		if (this.follow != null) {
			return;
		}
		if (this.cameratype == CameraType.FPP) {
			this.cameratype = CameraType.TPP;
			this.eNABLE_TPP_VIEW = true;
		}
		else if (this.cameratype == CameraType.TPP) {
			this.cameratype = CameraType.OVERHEAD;
			this.overheadcamera = true;
			this.setFreeMouse(true);
			this.eNABLE_TPP_VIEW = true;
			this.playerdestination = Vector3Ref.create(this.player.position.x, this.player.position.y, this.player.position.z);
		}
		else if (this.cameratype == CameraType.OVERHEAD) {
			this.cameratype = CameraType.FPP;
			this.setFreeMouse(false);
			this.eNABLE_TPP_VIEW = false;
			this.overheadcamera = false;
		}
		else {
			this.platform.throwException("");
		}
	}
	float cameraEyeX;
	float cameraEyeY;
	float cameraEyeZ;
	GetCameraMatrix cameraMatrix;

	public final String charToString(int c)
	{
		int[] arr = new int[1];
		arr[0] = c;
		return this.platform.charArrayToString(arr, 1);
	}
	public static final int CHAT_FONT_SIZE = 11;
	int chatLineLength;
	Chatline[] chatLines;

	private void chatLinesAdd(Chatline chatline)
	{
		if (this.chatLinesCount >= this.chatLinesMax) {
			Chatline[] lines2 = new Chatline[this.chatLinesMax * 2];
			for (int i = 0; i < this.chatLinesMax; i++) {
				lines2[i] = this.chatLines[i];
			}
			this.chatLines = lines2;
			this.chatLinesMax *= 2;
		}
		this.chatLines[this.chatLinesCount++] = chatline;
	}
	int chatLinesCount;
	int chatLinesMax;

	final void chatLog(String p)
	{
		if (!this.platform.chatLog(this.serverInfo.serverName, p)) {
			this.platform.consoleWriteLine(this.platform.stringFormat(this.language.cannotWriteChatLog(), this.serverInfo.serverName));
		}
	}

	public final void circle3i(float x, float y, float radius)
	{
		float angle;
		this.gLPushMatrix();
		this.gLLoadIdentity();
		int n = 32;
		if (this.circleModelData == null) {
			this.circleModelData = new ModelData();
			this.circleModelData.setMode(1);
			this.circleModelData.indices = new int[n * 2];
			this.circleModelData.xyz = new float[3 * n];
			this.circleModelData.rgba = new byte[4 * n];
			this.circleModelData.uv = new float[2 * n];
			this.circleModelData.indicesCount = n * 2;
			this.circleModelData.verticesCount = n;
		}
		for (int i = 0; i < n; i++) {
			this.circleModelData.indices[i * 2] = i;
			this.circleModelData.indices[i * 2 + 1] = (i + 1) % n;
		}
		for (int i = 0; i < n; i++) {
			angle = i * 2 * Game.getPi() / n;
			this.circleModelData.xyz[i * 3 + 0] = x + this.platform.mathCos(angle) * radius;
			this.circleModelData.xyz[i * 3 + 1] = y + this.platform.mathSin(angle) * radius;
			this.circleModelData.xyz[i * 3 + 2] = 0;
		}
		for (int i = 0; i < 4 * n; i++) {
			this.circleModelData.rgba[i] = -1;
		}
		for (int i = 0; i < 2 * n; i++) {
			this.circleModelData.uv[i] = 0;
		}
		this.drawModelData(this.circleModelData);
		this.gLPopMatrix();
	}

	final void clientCommand(String s_)
	{
		if (s_.equals("")) {
			return;
		}
		IntRef ssCount = new IntRef();
		String[] ss = this.platform.stringSplit(s_, " ", ssCount);
		if (StringTools.stringStartsWith(this.platform, s_, ".")) {
			String strFreemoveNotAllowed = this.language.freemoveNotAllowed();
			String cmd = StringTools.stringSubstringToEnd(this.platform, ss[0], 1);
			String arguments;
			if (this.platform.stringIndexOf(s_, " ") == -1) {
				arguments = "";
			}
			else {
				arguments = StringTools.stringSubstringToEnd(this.platform, s_, this.platform.stringIndexOf(s_, " "));
			}
			arguments = this.platform.stringTrim(arguments);
			if (cmd.equals("clients")) {
				this.log("Clients:");
				for (int i = 0; i < this.entitiesCount; i++) {
					Entity entity = this.entities[i];
					if (entity == null) {
						continue;
					}
					if (entity.drawName == null) {
						continue;
					}
					if (!entity.drawName.clientAutoComplete) {
						continue;
					}
					this.log(this.platform.stringFormat2("{0} {1}", this.platform.intToString(i), this.entities[i].drawName.name));
				}
			}
			else if (cmd.equals("reconnect")) {
				this.reconnect();
			}
			else if (cmd.equals("m")) {
				this.mouseSmoothing = !this.mouseSmoothing;
				if (this.mouseSmoothing) {
					this.log("Mouse smoothing enabled.");
				}
				else {
					this.log("Mouse smoothing disabled.");
				}
			}
			else if (cmd.equals("pos")) {
				this.eNABLE_DRAWPOSITION = this.boolCommandArgument(arguments);
			}
			else if (cmd.equals("noclip")) {
				if (this.allowFreemove) {
					this.stopPlayerMove = true;
					if (this.boolCommandArgument(arguments)) {
						this.controls.setFreemove(2);
					}
					else {
						this.controls.setFreemove(0);
					}
				}
				else {
					this.log(strFreemoveNotAllowed);
					return;
				}
			}
			else if (cmd.equals("freemove")) {
				if (this.allowFreemove) {
					this.stopPlayerMove = true;
					if (this.boolCommandArgument(arguments)) {
						this.controls.setFreemove(1);
					}
					else {
						this.controls.setFreemove(0);
					}
				}
				else {
					this.log(strFreemoveNotAllowed);
					return;
				}
			}
			else if (cmd.equals("gui")) {
				this.eNABLE_DRAW2D = this.boolCommandArgument(arguments);
			}
			else if (!arguments.equals("")) {
				if (cmd.equals("fog")) {
					int foglevel;
					foglevel = this.platform.intParse(arguments);
					{
						int foglevel2 = foglevel;
						if (foglevel2 > 1024) {
							foglevel2 = 1024;
						}
						if (foglevel2 % 2 == 0) {
							foglevel2--;
						}
						this.d_Config3d.viewdistance = foglevel2;
					}
					this.onResize();
				}
				else if (cmd.equals("fov")) {
					int arg = this.platform.intParse(arguments);
					int minfov = 1;
					int maxfov = 179;
					if (!this.issingleplayer) {
						minfov = 60;
					}
					if (arg < minfov || arg > maxfov) {
						this.log(this.platform.stringFormat2("Valid field of view: {0}-{1}", this.platform.intToString(minfov), this.platform.intToString(maxfov)));
					}
					else {
						float fov_ = 2 * Game.getPi() * this.one * arg / 360;
						this.fov = fov_;
						this.onResize();
					}
				}
				else if (cmd.equals("movespeed")) {
					if (this.allowFreemove) {
						if (this.platform.floatParse(arguments) <= 500) {
							this.movespeed = this.basemovespeed * this.platform.floatParse(arguments);
							this.addChatline(this.platform.stringFormat("Movespeed: {0}x", arguments));
						}
						else {
							this.addChatline("Entered movespeed to high! max. 500x");
						}
					}
					else {
						this.log(strFreemoveNotAllowed);
						return;
					}
				}
				else if (cmd.equals("serverinfo")) {
					IntRef splitCount = new IntRef();
					String[] split = this.platform.stringSplit(arguments, ":", splitCount);
					if (splitCount.value == 2) {
						QueryClient qClient = new QueryClient();
						qClient.setPlatform(this.platform);
						qClient.performQuery(split[0], this.platform.intParse(split[1]));
						if (qClient.querySuccess) {
							QueryResult r = qClient.getResult();
							this.addChatline(r.gameMode);
							this.addChatline(this.platform.intToString(r.mapSizeX));
							this.addChatline(this.platform.intToString(r.mapSizeY));
							this.addChatline(this.platform.intToString(r.mapSizeZ));
							this.addChatline(this.platform.intToString(r.maxPlayers));
							this.addChatline(r.mOTD);
							this.addChatline(r.name);
							this.addChatline(this.platform.intToString(r.playerCount));
							this.addChatline(r.playerList);
							this.addChatline(this.platform.intToString(r.port));
							this.addChatline(r.publicHash);
							this.addChatline(r.serverVersion);
						}
						this.addChatline(qClient.getServerMessage());
					}
				}
			}
			else {
				String chatline = StringTools.stringSubstring(this.platform, this.guiTypingBuffer, 0, MathCi.minInt(this.guiTypingBuffer.length(), 256));
				this.sendChat(chatline);
			}
			for (int i = 0; i < this.clientmodsCount; i++) {
				ClientCommandArgs args = new ClientCommandArgs();
				args.arguments = arguments;
				args.command = cmd;
				this.clientmods[i].onClientCommand(this, args);
			}
		}
		else {
			String chatline = StringTools.stringSubstring(this.platform, this.guiTypingBuffer, 0, MathCi.minInt(StringTools.stringLength(this.platform, this.guiTypingBuffer), 4096));
			this.sendChat(chatline);
		}
	}

	public static int colorA(int color)
	{
		byte a = Game.intToByte(color >> 24);
		return a & 0xff;
	}

	public static int colorB(int color)
	{
		byte b = Game.intToByte(color);
		return b & 0xff;
	}

	public static int colorFromArgb(int a, int r, int g, int b)
	{
		int iCol = a << 24 | r << 16 | g << 8 | b;
		return iCol;
	}

	public static int colorG(int color)
	{
		byte g = Game.intToByte(color >> 8);
		return g & 0xff;
	}

	public static int colorR(int color)
	{
		byte r = Game.intToByte(color >> 16);
		return r & 0xff;
	}

	public final ModelData combineModelData(ModelData[] modelDatas, int count)
	{
		ModelData ret = new ModelData();
		int totalIndices = 0;
		int totalVertices = 0;
		for (int i = 0; i < count; i++) {
			ModelData m = modelDatas[i];
			totalIndices += m.indicesCount;
			totalVertices += m.verticesCount;
		}
		ret.indices = new int[totalIndices];
		ret.xyz = new float[totalVertices * 3];
		ret.uv = new float[totalVertices * 2];
		ret.rgba = new byte[totalVertices * 4];
		for (int i = 0; i < count; i++) {
			ModelData m = modelDatas[i];
			int retVerticesCount = ret.verticesCount;
			int retIndicesCount = ret.indicesCount;
			for (int k = 0; k < m.indicesCount; k++) {
				ret.indices[ret.indicesCount++] = m.indices[k] + retVerticesCount;
			}
			for (int k = 0; k < m.verticesCount * 3; k++) {
				ret.xyz[retVerticesCount * 3 + k] = m.xyz[k];
			}
			for (int k = 0; k < m.verticesCount * 2; k++) {
				ret.uv[retVerticesCount * 2 + k] = m.uv[k];
			}
			for (int k = 0; k < m.verticesCount * 4; k++) {
				ret.rgba[retVerticesCount * 4 + k] = m.rgba[k];
			}
			ret.verticesCount += m.verticesCount;
		}
		return ret;
	}

	final void connect(String serverAddress, int port, String username, String auth)
	{
		this.main.start();
		this.main.connect(serverAddress, port);
		this.sendPacketClient(ClientPackets.createLoginPacket(this.platform, username, auth));
	}

	final void connect_(String serverAddress, int port, String username, String auth, String serverPassword)
	{
		this.main.start();
		this.main.connect(serverAddress, port);
		this.sendPacketClient(ClientPackets.createLoginPacket_(this.platform, username, auth, serverPassword));
	}

	final void connect__()
	{
		if (this.connectdata.serverPassword == null || this.connectdata.serverPassword.equals("")) {
			this.connect(this.connectdata.ip, this.connectdata.port, this.connectdata.username, this.connectdata.auth);
		}
		else {
			this.connect_(this.connectdata.ip, this.connectdata.port, this.connectdata.username, this.connectdata.auth, this.connectdata.serverPassword);
		}
		this.mapLoadingStart();
	}

	final Entity createBulletEntity(float fromX, float fromY, float fromZ, float toX, float toY, float toZ, float speed)
	{
		Entity entity = new Entity();
		Bullet_ bullet = new Bullet_();
		bullet.fromX = fromX;
		bullet.fromY = fromY;
		bullet.fromZ = fromZ;
		bullet.toX = toX;
		bullet.toY = toY;
		bullet.toZ = toZ;
		bullet.speed = speed;
		entity.bullet = bullet;
		entity.sprite = new Sprite();
		entity.sprite.image = "Sponge.png";
		entity.sprite.size = 4;
		entity.sprite.animationcount = 0;
		return entity;
	}

	final float currentAimRadius()
	{
		Packet_Item item = this.d_Inventory.rightHand[this.activeMaterial];
		if (item == null || item.itemClass != 0) {
			return 0;
		}
		float radius = this.deserializeFloat(this.blocktypes[item.blockId].aimRadiusFloat) / 800 * this.width();
		if (this.ironSights) {
			radius = this.deserializeFloat(this.blocktypes[item.blockId].ironSightsAimRadiusFloat) / 800 * this.width();
		}
		return radius + this.radiusWhenMoving * radius * MathCi.minFloat(this.playervelocity.length() / this.movespeed, 1);
	}

	final float currentRecoil()
	{
		Packet_Item item = this.d_Inventory.rightHand[this.activeMaterial];
		if (item == null || item.itemClass != 0) {
			return 0;
		}
		return this.deserializeFloat(this.blocktypes[item.blockId].recoilFloat);
	}
	public static final int D_I_S_C_O_N_N_E_C_T_E_D__I_C_O_N__A_F_T_E_R__S_E_C_O_N_D_S = 10;

	final boolean deleteTexture(String name)
	{
		if (name != null && this.textures.contains(name)) {
			int id = this.textures.get(name);
			this.textures.remove(name);
			this.platform.gLDeleteTexture(id);
			return true;
		}
		return false;
	}

	public final void deleteUnusedCachedTextTextures()
	{
		int now = this.platform.timeMillisecondsFromStart();
		for (int i = 0; i < this.cachedTextTexturesMax; i++) {
			CachedTextTexture t = this.cachedTextTextures[i];
			if (t == null) {
				continue;
			}
			if (this.one * (now - t.texture.lastuseMilliseconds) / 1000 > 1) {
				this.platform.gLDeleteTexture(t.texture.textureId);
				this.cachedTextTextures[i] = null;
			}
		}
	}

	final float deserializeFloat(int value)
	{
		return this.one * value / 32;
	}

	final int dialogsCount_()
	{
		int count = 0;
		for (int i = 0; i < this.dialogsCount; i++) {
			if (this.dialogs[i] != null) {
				count++;
			}
		}
		return count;
	}

	public final void dispose()
	{
		for (int i = 0; i < this.clientmodsCount; i++) {
			if (this.clientmods[i] == null) {
				continue;
			}
			this.clientmods[i].dispose(this);
		}
		for (int i = 0; i < this.textures.count; i++) {
			if (this.textures.items[i] == null) {
				continue;
			}
			this.platform.gLDeleteTexture(this.textures.items[i].value);
		}
		for (int i = 0; i < this.cachedTextTexturesMax; i++) {
			if (this.cachedTextTextures[i] == null) {
				continue;
			}
			if (this.cachedTextTextures[i].texture == null) {
				continue;
			}
			this.platform.gLDeleteTexture(this.cachedTextTextures[i].texture.textureId);
		}
	}

	public final float dist(float x1, float y1, float z1, float x2, float y2, float z2)
	{
		float dx = x2 - x1;
		float dy = y2 - y1;
		float dz = z2 - z1;
		return this.platform.mathSqrt(dx * dx + dy * dy + dz * dz);
	}

	final void draw2d(float dt)
	{
		if (!this.eNABLE_DRAW2D) {
			return;
		}
		this.orthoMode(this.width(), this.height());
		for (int i = 0; i < this.clientmodsCount; i++) {
			if (this.clientmods[i] == null) {
				continue;
			}
			this.clientmods[i].onNewFrameDraw2d(this, dt);
		}
		this.perspectiveMode();
	}

	public final void draw2dBitmapFile(String filename, float x, float y, float w, float h)
	{
		this.draw2dTexture(this.getTexture(filename), x, y, w, h, null, 0, Game.colorFromArgb(255, 255, 255, 255), false);
	}

	public final void draw2dText(String text, FontCi font, float x, float y, IntRef color, boolean enabledepthtest)
	{
		if (text == null || this.platform.stringTrim(text).equals("")) {
			return;
		}
		if (color == null) {
			color = IntRef.create(Game.colorFromArgb(255, 255, 255, 255));
		}
		Text_ t = new Text_();
		t.text = text;
		t.color = color.value;
		t.fontsize = font.size;
		t.fontfamily = font.family;
		t.fontstyle = font.style;
		CachedTexture ct;
		if (this.getCachedTextTexture(t) == null) {
			ct = this.makeTextTexture(t);
			if (ct == null) {
				return;
			}
			for (int i = 0; i < this.cachedTextTexturesMax; i++) {
				if (this.cachedTextTextures[i] == null) {
					CachedTextTexture ct1 = new CachedTextTexture();
					ct1.text = t;
					ct1.texture = ct;
					this.cachedTextTextures[i] = ct1;
					break;
				}
			}
		}
		ct = this.getCachedTextTexture(t);
		ct.lastuseMilliseconds = this.platform.timeMillisecondsFromStart();
		this.platform.gLDisableAlphaTest();
		this.draw2dTexture(ct.textureId, x, y, ct.sizeX, ct.sizeY, null, 0, Game.colorFromArgb(255, 255, 255, 255), enabledepthtest);
		this.platform.gLEnableAlphaTest();
		this.deleteUnusedCachedTextTextures();
	}

	final void draw2dText1(String text, int x, int y, int fontsize, IntRef color, boolean enabledepthtest)
	{
		FontCi font = new FontCi();
		font.family = "Arial";
		font.size = fontsize;
		this.draw2dText(text, font, x, y, color, enabledepthtest);
	}

	public final void draw2dTexture(int textureid, float x1, float y1, float width, float height, IntRef inAtlasId, int atlastextures, int color, boolean enabledepthtest)
	{
		if (color == Game.colorFromArgb(255, 255, 255, 255) && inAtlasId == null) {
			this.draw2dTextureSimple(textureid, x1, y1, width, height, enabledepthtest);
		}
		else {
			this.draw2dTextureInAtlas(textureid, x1, y1, width, height, inAtlasId, atlastextures, color, enabledepthtest);
		}
	}

	private void draw2dTextureInAtlas(int textureid, float x1, float y1, float width, float height, IntRef inAtlasId, int atlastextures, int color, boolean enabledepthtest)
	{
		RectFRef rect = RectFRef.create(0, 0, 1, 1);
		if (inAtlasId != null) {
			TextureAtlasCi.textureCoords2d(inAtlasId.value, atlastextures, rect);
		}
		this.platform.glDisableCullFace();
		this.platform.glEnableTexture2d();
		this.platform.bindTexture2d(textureid);
		if (!enabledepthtest) {
			this.platform.glDisableDepthTest();
		}
		ModelData data = QuadModelData.getQuadModelData2(rect.x, rect.y, rect.w, rect.h, x1, y1, width, height, Game.intToByte(Game.colorR(color)), Game.intToByte(Game.colorG(color)), Game.intToByte(Game.colorB(color)), Game.intToByte(Game.colorA(color)));
		this.drawModelData(data);
		if (!enabledepthtest) {
			this.platform.glEnableDepthTest();
		}
		this.platform.glEnableCullFace();
		this.platform.glEnableTexture2d();
	}

	public final void draw2dTexturePart(int textureid, float srcwidth, float srcheight, float dstx, float dsty, float dstwidth, float dstheight, int color, boolean enabledepthtest)
	{
		RectFRef rect = RectFRef.create(0, 0, srcwidth, srcheight);
		this.platform.glDisableCullFace();
		this.platform.glEnableTexture2d();
		this.platform.bindTexture2d(textureid);
		if (!enabledepthtest) {
			this.platform.glDisableDepthTest();
		}
		ModelData data = QuadModelData.getQuadModelData2(rect.x, rect.y, rect.w, rect.h, dstx, dsty, dstwidth, dstheight, Game.intToByte(Game.colorR(color)), Game.intToByte(Game.colorG(color)), Game.intToByte(Game.colorB(color)), Game.intToByte(Game.colorA(color)));
		this.drawModelData(data);
		if (!enabledepthtest) {
			this.platform.glEnableDepthTest();
		}
		this.platform.glEnableCullFace();
		this.platform.glEnableTexture2d();
	}

	private void draw2dTextureSimple(int textureid, float x1, float y1, float width, float height, boolean enabledepthtest)
	{
		RectFRef rect = RectFRef.create(0, 0, 1, 1);
		this.platform.glDisableCullFace();
		this.platform.glEnableTexture2d();
		this.platform.bindTexture2d(textureid);
		if (!enabledepthtest) {
			this.platform.glDisableDepthTest();
		}
		if (this.quadModel == null) {
			this.quadModel = this.platform.createModel(QuadModelData.getQuadModelData());
		}
		this.gLPushMatrix();
		this.gLTranslate(x1, y1, 0);
		this.gLScale(width, height, 0);
		this.gLScale(this.one / 2, this.one / 2, 0);
		this.gLTranslate(this.one, this.one, 0);
		this.drawModel(this.quadModel);
		this.gLPopMatrix();
		if (!enabledepthtest) {
			this.platform.glEnableDepthTest();
		}
		this.platform.glEnableCullFace();
		this.platform.glEnableTexture2d();
	}

	public final void draw2dTextures(Draw2dData[] todraw, int todrawLength, int textureid)
	{
		ModelData[] modelDatas = new ModelData[512];
		int modelDatasCount = 0;
		for (int i = 0; i < todrawLength; i++) {
			Draw2dData d = todraw[i];
			float x1 = d.x1;
			float y1 = d.y1;
			float width = d.width;
			float height = d.height;
			IntRef inAtlasId = d.inAtlasId;
			int textureId = textureid;
			int color = d.color;
			RectFRef rect = RectFRef.create(0, 0, 1, 1);
			if (inAtlasId != null) {
				TextureAtlasCi.textureCoords2d(inAtlasId.value, this.texturesPacked(), rect);
			}
			ModelData modelData = QuadModelData.getQuadModelData2(rect.x, rect.y, rect.w, rect.h, x1, y1, width, height, Game.intToByte(Game.colorR(color)), Game.intToByte(Game.colorG(color)), Game.intToByte(Game.colorB(color)), Game.intToByte(Game.colorA(color)));
			modelDatas[modelDatasCount++] = modelData;
		}
		ModelData combined = this.combineModelData(modelDatas, modelDatasCount);
		this.platform.glDisableCullFace();
		this.platform.glEnableTexture2d();
		this.platform.bindTexture2d(textureid);
		this.platform.glDisableDepthTest();
		this.drawModelData(combined);
		this.platform.glEnableDepthTest();
		this.platform.glDisableCullFace();
		this.platform.glEnableTexture2d();
	}

	public final void drawModel(Model model)
	{
		this.setMatrixUniformModelView();
		this.platform.drawModel(model);
	}

	public final void drawModelData(ModelData data)
	{
		this.setMatrixUniformModelView();
		this.platform.drawModelData(data);
	}

	public final void drawModels(Model[] model, int count)
	{
		this.setMatrixUniformModelView();
		this.platform.drawModels(model, count);
	}
	boolean eNABLE_DRAW2D;
	boolean eNABLE_DRAWPOSITION;
	boolean eNABLE_DRAW_TEST_CHARACTER;
	int eNABLE_LAG;
	boolean eNABLE_TPP_VIEW;
	boolean eNABLE_ZFAR;

	final boolean enablePlayerUpdatePosition(int kKey)
	{
		return true;
	}

	final boolean enablePlayerUpdatePositionContainsKey(int kKey)
	{
		return false;
	}

	final void entityAddLocal(Entity entity)
	{
		for (int i = 256; i < this.entitiesCount; i++) {
			if (this.entities[i] == null) {
				this.entities[i] = entity;
				return;
			}
		}
		this.entities[this.entitiesCount++] = entity;
	}

	public final void escapeMenuStart()
	{
		this.guistate = GuiState.ESCAPE_MENU;
		this.menustate = new MenuState();
		this.platform.exitMousePointerLock();
		this.escapeMenuRestart = true;
	}

	final void exitAndSwitchServer(Packet_ServerRedirect newServer)
	{
		if (this.issingleplayer) {
			this.platform.singlePlayerServerExit();
		}
		this.redirectTo = newServer;
		this.exitToMainMenu = true;
	}

	final void exitToMainMenu_()
	{
		if (this.issingleplayer) {
			this.platform.singlePlayerServerExit();
		}
		this.redirectTo = null;
		this.exitToMainMenu = true;
	}

	public final float eyesPosX()
	{
		return this.player.position.x;
	}

	public final float eyesPosY()
	{
		return this.player.position.y + this.getCharacterEyesHeight();
	}

	public final float eyesPosZ()
	{
		return this.player.position.z;
	}

	final float floorFloat(float a)
	{
		if (a >= 0) {
			return this.platform.floatToInt(a);
		}
		else {
			return this.platform.floatToInt(a) - 1;
		}
	}
	String follow;

	final IntRef followId()
	{
		if (this.follow == null) {
			return null;
		}
		for (int i = 0; i < this.entitiesCount; i++) {
			if (this.entities[i] == null) {
				continue;
			}
			if (this.entities[i].drawName == null) {
				continue;
			}
			DrawName p = this.entities[i].drawName;
			if (p.name.equals(this.follow)) {
				return IntRef.create(i);
			}
		}
		return null;
	}
	int font;

	final void frameTick(float dt)
	{
		NewFrameEventArgs args_ = new NewFrameEventArgs();
		args_.setDt(dt);
		for (int i = 0; i < this.clientmodsCount; i++) {
			this.clientmods[i].onNewFrameFixed(this, args_);
		}
		for (int i = 0; i < this.entitiesCount; i++) {
			Entity e = this.entities[i];
			if (e == null) {
				continue;
			}
			for (int k = 0; k < e.scriptsCount; k++) {
				e.scripts[k].onNewFrameFixed(this, i, dt);
			}
		}
		this.revertSpeculative(dt);
		if (this.guistate == GuiState.MAP_LOADING) {
			return;
		}
		float orientationX = this.platform.mathSin(this.player.position.roty);
		float orientationY = 0;
		float orientationZ = -this.platform.mathCos(this.player.position.roty);
		this.platform.audioUpdateListener(this.eyesPosX(), this.eyesPosY(), this.eyesPosZ(), orientationX, orientationY, orientationZ);
		this.playervelocity.x = this.player.position.x - this.lastplayerpositionX;
		this.playervelocity.y = this.player.position.y - this.lastplayerpositionY;
		this.playervelocity.z = this.player.position.z - this.lastplayerpositionZ;
		this.playervelocity.x *= 75;
		this.playervelocity.y *= 75;
		this.playervelocity.z *= 75;
		this.lastplayerpositionX = this.player.position.x;
		this.lastplayerpositionY = this.player.position.y;
		this.lastplayerpositionZ = this.player.position.z;
	}

	public final void gLLoadIdentity()
	{
		if (this.currentMatrixModeProjection) {
			if (this.pMatrix.count() > 0) {
				this.pMatrix.pop();
			}
			this.pMatrix.push(this.identityMatrix);
		}
		else {
			if (this.mvMatrix.count() > 0) {
				this.mvMatrix.pop();
			}
			this.mvMatrix.push(this.identityMatrix);
		}
	}

	public final void gLLoadMatrix(float[] m)
	{
		if (this.currentMatrixModeProjection) {
			if (this.pMatrix.count() > 0) {
				this.pMatrix.pop();
			}
			this.pMatrix.push(m);
		}
		else {
			if (this.mvMatrix.count() > 0) {
				this.mvMatrix.pop();
			}
			this.mvMatrix.push(m);
		}
	}

	public final void gLMatrixModeModelView()
	{
		this.currentMatrixModeProjection = false;
	}

	public final void gLMatrixModeProjection()
	{
		this.currentMatrixModeProjection = true;
	}

	public final void gLOrtho(float left, float right, float bottom, float top, float zNear, float zFar)
	{
		if (this.currentMatrixModeProjection) {
			float[] m = this.pMatrix.peek();
			Mat4.ortho(m, left, right, bottom, top, zNear, zFar);
		}
		else {
			this.platform.throwException("GLOrtho");
		}
	}

	public final void gLPopMatrix()
	{
		if (this.currentMatrixModeProjection) {
			if (this.pMatrix.count() > 1) {
				this.pMatrix.pop();
			}
		}
		else {
			if (this.mvMatrix.count() > 1) {
				this.mvMatrix.pop();
			}
		}
	}

	public final void gLPushMatrix()
	{
		if (this.currentMatrixModeProjection) {
			this.pMatrix.push(this.pMatrix.peek());
		}
		else {
			this.mvMatrix.push(this.mvMatrix.peek());
		}
	}

	public final void gLRotate(float angle, float x, float y, float z)
	{
		angle /= 360;
		angle *= 2 * Game.getPi();
		float[] m;
		if (this.currentMatrixModeProjection) {
			m = this.pMatrix.peek();
		}
		else {
			m = this.mvMatrix.peek();
		}
		Vec3.set(this.gLRotateTempVec3, x, y, z);
		Mat4.rotate(m, m, angle, this.gLRotateTempVec3);
	}
	private float[] gLRotateTempVec3;

	public final void gLScale(float x, float y, float z)
	{
		float[] m;
		if (this.currentMatrixModeProjection) {
			m = this.pMatrix.peek();
		}
		else {
			m = this.mvMatrix.peek();
		}
		Vec3.set(this.gLScaleTempVec3, x, y, z);
		Mat4.scale(m, m, this.gLScaleTempVec3);
	}
	private float[] gLScaleTempVec3;

	public final void gLTranslate(float x, float y, float z)
	{
		float[] m;
		if (this.currentMatrixModeProjection) {
			m = this.pMatrix.peek();
		}
		else {
			m = this.mvMatrix.peek();
		}
		Vec3.set(this.gLTranslateTempVec3, x, y, z);
		Mat4.translate(m, m, this.gLTranslateTempVec3);
	}
	private float[] gLTranslateTempVec3;

	private CachedTexture getCachedTextTexture(Text_ t)
	{
		for (int i = 0; i < this.cachedTextTexturesMax; i++) {
			CachedTextTexture ct = this.cachedTextTextures[i];
			if (ct == null) {
				continue;
			}
			if (ct.text.equals_(t)) {
				return ct.texture;
			}
		}
		return null;
	}

	private int getCameraBlock()
	{
		int bx = this.mathFloor(this.cameraEyeX);
		int by = this.mathFloor(this.cameraEyeZ);
		int bz = this.mathFloor(this.cameraEyeY);
		if (!this.map.isValidPos(bx, by, bz)) {
			return 0;
		}
		return this.map.getBlockValid(bx, by, bz);
	}

	final float getCharacterEyesHeight()
	{
		return this.entities[this.localPlayerId].drawModel.eyeHeight;
	}

	final float getCurrentBlockHealth(int x, int y, int z)
	{
		if (this.blockHealth.containsKey(x, y, z)) {
			return this.blockHealth.get(x, y, z);
		}
		int blocktype = this.map.getBlock(x, y, z);
		return this.d_Data.strength()[blocktype];
	}

	final int getDialogId(String name)
	{
		for (int i = 0; i < this.dialogsCount; i++) {
			if (this.dialogs[i] == null) {
				continue;
			}
			if (this.dialogs[i].key.equals(name)) {
				return i;
			}
		}
		return -1;
	}

	final byte[] getFile(String p)
	{
		String pLowercase = this.platform.stringToLower(p);
		for (int i = 0; i < this.assets.count; i++) {
			if (this.assets.items[i].name.equals(pLowercase)) {
				return this.assets.items[i].data;
			}
		}
		return null;
	}

	final int getFileLength(String p)
	{
		String pLowercase = this.platform.stringToLower(p);
		for (int i = 0; i < this.assets.count; i++) {
			if (this.assets.items[i].name.equals(pLowercase)) {
				return this.assets.items[i].dataLength;
			}
		}
		return 0;
	}

	public final boolean getFreeMouse()
	{
		if (this.overheadcamera) {
			return true;
		}
		return !this.platform.isMousePointerLocked();
	}

	final int getKey(int key)
	{
		if (this.options == null) {
			return key;
		}
		if (this.options.keys[key] != 0) {
			return this.options.keys[key];
		}
		return key;
	}

	public final int getLight(int x, int y, int z)
	{
		int light = this.map.maybeGetLight(x, y, z);
		if (light == -1) {
			if (x >= 0 && x < this.map.mapSizeX && y >= 0 && y < this.map.mapSizeY && z >= this.d_Heightmap.getBlock(x, y)) {
				return this.sunlight_;
			}
			else {
				return 0;
			}
		}
		else {
			return light;
		}
	}

	public static float getPi()
	{
		float a = 3141592;
		return a / 1000000;
	}

	public final GamePlatform getPlatform()
	{
		return this.platform;
	}

	final int getPlayerEyesBlock()
	{
		float pX = this.player.position.x;
		float pY = this.player.position.y;
		float pZ = this.player.position.z;
		pY += this.entities[this.localPlayerId].drawModel.eyeHeight;
		int bx = this.mathFloor(pX);
		int by = this.mathFloor(pZ);
		int bz = this.mathFloor(pY);
		if (!this.map.isValidPos(bx, by, bz)) {
			if (pY < this.waterLevel()) {
				return -1;
			}
			return 0;
		}
		return this.map.getBlockValid(bx, by, bz);
	}

	public final int getPlayerEyesBlockX()
	{
		return this.platform.floatToInt(this.mathFloor(this.player.position.x));
	}

	public final int getPlayerEyesBlockY()
	{
		return this.platform.floatToInt(this.mathFloor(this.player.position.z));
	}

	public final int getPlayerEyesBlockZ()
	{
		return this.platform.floatToInt(this.mathFloor(this.player.position.y + this.entities[this.localPlayerId].drawModel.eyeHeight));
	}

	final Packet_ServerRedirect getRedirect()
	{
		return this.redirectTo;
	}

	final int getTexture(String p)
	{
		if (!this.textures.contains(p)) {
			BoolRef found = new BoolRef();
			BitmapCi bmp = this.platform.bitmapCreateFromPng(this.getFile(p), this.getFileLength(p));
			int texture = this.platform.loadTextureFromBitmap(bmp);
			this.textures.set(p, texture);
			this.platform.bitmapDelete(bmp);
		}
		return this.textures.get(p);
	}

	final int getTextureOrLoad(String name, BitmapCi bmp)
	{
		if (!this.textures.contains(name)) {
			BoolRef found = new BoolRef();
			this.textures.set(name, this.platform.loadTextureFromBitmap(bmp));
		}
		return this.textures.get(name);
	}

	final void gotoDraw2d(float dt)
	{
		this.setAmbientLight(Game.colorFromArgb(255, 255, 255, 255));
		this.draw2d(dt);
		NewFrameEventArgs args_ = new NewFrameEventArgs();
		args_.setDt(dt);
		for (int i = 0; i < this.clientmodsCount; i++) {
			this.clientmods[i].onNewFrame(this, args_);
		}
		this.mouseleftclick = this.mouserightclick = false;
		this.mouseleftdeclick = this.mouserightdeclick = false;
		if (!this.issingleplayer || this.issingleplayer && this.platform.singlePlayerServerLoaded() || !this.platform.singlePlayerServerAvailable()) {
			if (!this.startedconnecting) {
				this.startedconnecting = true;
				this.connect__();
			}
		}
	}

	final void guiStateBackToGame()
	{
		this.guistate = GuiState.NORMAL;
		this.setFreeMouse(false);
	}
	int guiTyping;
	String guiTypingBuffer;

	final void handleMaterialKeys(int eKey)
	{
		if (eKey == this.getKey(110)) {
			this.activeMaterial = 0;
		}
		if (eKey == this.getKey(111)) {
			this.activeMaterial = 1;
		}
		if (eKey == this.getKey(112)) {
			this.activeMaterial = 2;
		}
		if (eKey == this.getKey(113)) {
			this.activeMaterial = 3;
		}
		if (eKey == this.getKey(114)) {
			this.activeMaterial = 4;
		}
		if (eKey == this.getKey(115)) {
			this.activeMaterial = 5;
		}
		if (eKey == this.getKey(116)) {
			this.activeMaterial = 6;
		}
		if (eKey == this.getKey(117)) {
			this.activeMaterial = 7;
		}
		if (eKey == this.getKey(118)) {
			this.activeMaterial = 8;
		}
		if (eKey == this.getKey(109)) {
			this.activeMaterial = 9;
		}
	}

	private boolean hasAsset(String md5, String name)
	{
		for (int i = 0; i < this.assets.count; i++) {
			if (this.assets.items[i].md5.equals(md5)) {
				if (this.assets.items[i].name.equals(name)) {
					return true;
				}
			}
		}
		return false;
	}

	public final byte headingByte(float orientationX, float orientationY, float orientationZ)
	{
		return Game.intToByte(this.platform.floatToInt(orientationY % (2 * Game.getPi()) / (2 * Game.getPi()) * 256));
	}

	public final int height()
	{
		return this.platform.getCanvasHeight();
	}
	public static final int HOUR_DETAIL = 4;

	public static byte intToByte(int a)
	{
		return (byte) a;
	}

	private final void invalidPlayerWarning(int playerid)
	{
		this.platform.consoleWriteLine(this.platform.stringFormat("Position update of nonexistent player {0}.", this.platform.intToString(playerid)));
	}

	final void invalidVersionAllow()
	{
		if (this.invalidVersionDrawMessage != null) {
			this.invalidVersionDrawMessage = null;
			this.processServerIdentification(this.invalidVersionPacketIdentification);
			this.invalidVersionPacketIdentification = null;
		}
	}

	final void inventoryClick(Packet_InventoryPosition pos)
	{
		this.sendPacketClient(ClientPackets.inventoryClick(pos));
	}

	final Packet_InventoryPosition inventoryPositionMainArea(int x, int y)
	{
		Packet_InventoryPosition pos = new Packet_InventoryPosition();
		pos.type = 0;
		pos.areaX = x;
		pos.areaY = y;
		return pos;
	}

	final Packet_InventoryPosition inventoryPositionMaterialSelector(int materialId)
	{
		Packet_InventoryPosition pos = new Packet_InventoryPosition();
		pos.type = 2;
		pos.materialId = materialId;
		return pos;
	}

	final void invokeMapLoadingProgress(int progressPercent, int progressBytes, String status)
	{
		this.maploadingprogress = new MapLoadingProgressEventArgs();
		this.maploadingprogress.progressPercent = progressPercent;
		this.maploadingprogress.progressBytes = progressBytes;
		this.maploadingprogress.progressStatus = status;
	}
	boolean ironSights;

	final boolean isAnyPlayerInPos(int blockposX, int blockposY, int blockposZ)
	{
		for (int i = 0; i < this.entitiesCount; i++) {
			Entity e = this.entities[i];
			if (e == null) {
				continue;
			}
			if (e.drawModel == null) {
				continue;
			}
			if (e.networkPosition == null || e.networkPosition != null && e.networkPosition.positionLoaded) {
				if (this.isPlayerInPos(e.position.x, e.position.y, e.position.z, blockposX, blockposY, blockposZ, e.drawModel.modelHeight)) {
					return true;
				}
			}
		}
		return this.isPlayerInPos(this.player.position.x, this.player.position.y, this.player.position.z, blockposX, blockposY, blockposZ, this.player.drawModel.modelHeight);
	}

	public final boolean isEmptyForPhysics(Packet_BlockType block)
	{
		return block.drawType == 9 || block.walkableType != 2 && block.walkableType != 1;
	}

	final boolean isFillBlock(int blocktype)
	{
		return blocktype == this.d_Data.blockIdFillArea() || blocktype == this.d_Data.blockIdFillStart() || blocktype == this.d_Data.blockIdCuboid();
	}

	final boolean isLava(int blockType)
	{
		String name = this.blocktypes[blockType].name;
		if (name == null) {
			return false;
		}
		return this.platform.stringContains(name, "Lava");
	}

	private boolean isPlayerInPos(float playerposX, float playerposY, float playerposZ, int blockposX, int blockposY, int blockposZ, float playerHeight)
	{
		for (int i = 0; i < this.floorFloat(playerHeight) + 1; i++) {
			if (ScriptCharacterPhysics.boxPointDistance(blockposX, blockposZ, blockposY, blockposX + 1, blockposZ + 1, blockposY + 1, playerposX, playerposY + i + this.constWallDistance, playerposZ) < this.constWallDistance) {
				return true;
			}
		}
		return false;
	}

	public final boolean isRail(Packet_BlockType block)
	{
		return block.rail > 0;
	}
	boolean isShiftPressed;
	boolean isTeamchat;

	final boolean isTileEmptyForPhysics(int x, int y, int z)
	{
		if (z >= this.map.mapSizeZ) {
			return true;
		}
		if (x < 0 || y < 0 || z < 0) {
			return this.controls.getFreemove() != 0;
		}
		if (x >= this.map.mapSizeX || y >= this.map.mapSizeY) {
			return this.controls.getFreemove() != 0;
		}
		int block = this.map.getBlockValid(x, y, z);
		return block == 0 || block == this.d_Data.blockIdFillArea() || this.isWater(block);
	}

	final boolean isTileEmptyForPhysicsClose(int x, int y, int z)
	{
		return this.isTileEmptyForPhysics(x, y, z) || this.map.isValidPos(x, y, z) && this.blocktypes[this.map.getBlock(x, y, z)].drawType == 11 || this.map.isValidPos(x, y, z) && this.isEmptyForPhysics(this.blocktypes[this.map.getBlock(x, y, z)]);
	}

	public static boolean isTransparentForLight(Packet_BlockType b)
	{
		return b.drawType != 1 && b.drawType != 8;
	}
	boolean isTyping;

	final boolean isUsableBlock(int blocktype)
	{
		return this.d_Data.isRailTile(blocktype) || this.blocktypes[blocktype].isUsable;
	}

	final boolean isValid(int blocktype)
	{
		return this.blocktypes[blocktype].name != null;
	}

	final boolean isWater(int blockType)
	{
		String name = this.blocktypes[blockType].name;
		if (name == null) {
			return false;
		}
		return this.platform.stringContains(name, "Water");
	}

	final boolean isWearingWeapon()
	{
		return this.d_Inventory.rightHand[this.activeMaterial] != null;
	}
	public static final int KEY_ALT_LEFT = 5;
	public static final int KEY_ALT_RIGHT = 6;

	final void keyDown(int eKey)
	{
		this.keyboardStateRaw[eKey] = true;
		if (this.guistate != GuiState.MAP_LOADING) {
			for (int i = 0; i < this.clientmodsCount; i++) {
				KeyEventArgs args_ = new KeyEventArgs();
				args_.setKeyCode(eKey);
				this.clientmods[i].onKeyDown(this, args_);
				if (args_.getHandled()) {
					return;
				}
			}
		}
		this.keyboardState[eKey] = true;
		this.invalidVersionAllow();
		if (eKey == this.getKey(15)) {
			float lagSeconds = this.one * (this.platform.timeMillisecondsFromStart() - this.lastReceivedMilliseconds) / 1000;
			if (lagSeconds >= 10 || this.guistate == GuiState.MAP_LOADING) {
				this.reconnect();
			}
		}
		if (eKey == this.getKey(1) || eKey == this.getKey(2)) {
			this.isShiftPressed = true;
		}
		if (this.guistate == GuiState.NORMAL) {
			String strFreemoveNotAllowed = "You are not allowed to enable freemove.";
			if (eKey == this.getKey(10)) {
				if (!this.allowFreemove) {
					this.log(strFreemoveNotAllowed);
					return;
				}
				this.movespeed = this.basemovespeed * 1;
				this.log("Move speed: 1x.");
			}
			if (eKey == this.getKey(11)) {
				if (!this.allowFreemove) {
					this.log(strFreemoveNotAllowed);
					return;
				}
				this.movespeed = this.basemovespeed * 10;
				this.log(this.platform.stringFormat(this.language.moveSpeed(), this.platform.intToString(10)));
			}
			if (eKey == this.getKey(12)) {
				if (!this.allowFreemove) {
					this.log(strFreemoveNotAllowed);
					return;
				}
				this.stopPlayerMove = true;
				if (this.controls.getFreemove() == 0) {
					this.controls.setFreemove(1);
					this.log(this.language.moveFree());
				}
				else if (this.controls.getFreemove() == 1) {
					this.controls.setFreemove(2);
					this.log(this.language.moveFreeNoclip());
				}
				else if (this.controls.getFreemove() == 2) {
					this.controls.setFreemove(0);
					this.log(this.language.moveNormal());
				}
			}
			if (eKey == this.getKey(91)) {
				this.drawblockinfo = !this.drawblockinfo;
			}
			int playerx = this.platform.floatToInt(this.player.position.x);
			int playery = this.platform.floatToInt(this.player.position.z);
			if (playerx >= 0 && playerx < this.map.mapSizeX && playery >= 0 && playery < this.map.mapSizeY) {
				this.performanceinfo.set("height", this.platform.stringFormat("height:{0}", this.platform.intToString(this.d_Heightmap.getBlock(playerx, playery))));
			}
			if (eKey == this.getKey(14)) {
				this.cameraChange();
			}
			if (eKey == this.getKey(121) || eKey == this.getKey(80)) {
				if (this.cameratype == CameraType.OVERHEAD) {
					this.overheadcameradistance -= 1;
				}
				else if (this.cameratype == CameraType.TPP) {
					this.tppcameradistance -= 1;
				}
			}
			if (eKey == this.getKey(120) || eKey == this.getKey(79)) {
				if (this.cameratype == CameraType.OVERHEAD) {
					this.overheadcameradistance += 1;
				}
				else if (this.cameratype == CameraType.TPP) {
					this.tppcameradistance += 1;
				}
			}
			if (this.overheadcameradistance < this.tPP_CAMERA_DISTANCE_MIN) {
				this.overheadcameradistance = this.tPP_CAMERA_DISTANCE_MIN;
			}
			if (this.overheadcameradistance > this.tPP_CAMERA_DISTANCE_MAX) {
				this.overheadcameradistance = this.tPP_CAMERA_DISTANCE_MAX;
			}
			if (this.tppcameradistance < this.tPP_CAMERA_DISTANCE_MIN) {
				this.tppcameradistance = this.tPP_CAMERA_DISTANCE_MIN;
			}
			if (this.tppcameradistance > this.tPP_CAMERA_DISTANCE_MAX) {
				this.tppcameradistance = this.tPP_CAMERA_DISTANCE_MAX;
			}
			if (eKey == this.getKey(15)) {
				this.redrawAllBlocks();
			}
			if (eKey == 17) {
				this.toggleVsync();
				if (this.eNABLE_LAG == 0) {
					this.log(this.language.frameRateVsync());
				}
				if (this.eNABLE_LAG == 1) {
					this.log(this.language.frameRateUnlimited());
				}
				if (this.eNABLE_LAG == 2) {
					this.log(this.language.frameRateLagSimulation());
				}
			}
			if (eKey == this.getKey(52)) {
				this.sendPacketClient(ClientPackets.specialKeyTabPlayerList());
			}
			if (eKey == this.getKey(87)) {
				if (this.currentAttackedBlock != null) {
					int posX = this.currentAttackedBlock.x;
					int posY = this.currentAttackedBlock.y;
					int posZ = this.currentAttackedBlock.z;
					int blocktype = this.map.getBlock(this.currentAttackedBlock.x, this.currentAttackedBlock.y, this.currentAttackedBlock.z);
					if (this.isUsableBlock(blocktype)) {
						if (this.d_Data.isRailTile(blocktype)) {
							this.player.position.x = posX + this.one / 2;
							this.player.position.y = posZ + 1;
							this.player.position.z = posY + this.one / 2;
							this.stopPlayerMove = true;
							this.controls.setFreemove(0);
						}
						else {
							this.sendSetBlock(posX, posY, posZ, 2, 0, this.activeMaterial);
						}
					}
				}
				if (this.currentlyAttackedEntity != -1) {
					if (this.entities[this.currentlyAttackedEntity].usable) {
						for (int i = 0; i < this.clientmodsCount; i++) {
							if (this.clientmods[i] == null) {
								continue;
							}
							OnUseEntityArgs args = new OnUseEntityArgs();
							args.entityId = this.currentlyAttackedEntity;
							this.clientmods[i].onUseEntity(this, args);
						}
						this.sendPacketClient(ClientPackets.useEntity(this.currentlyAttackedEntity));
					}
				}
			}
			if (eKey == this.getKey(97)) {
				this.respawn();
			}
			if (eKey == this.getKey(94)) {
				this.sendPacketClient(ClientPackets.specialKeySelectTeam());
			}
			if (eKey == this.getKey(98)) {
				this.sendPacketClient(ClientPackets.specialKeySetSpawn());
				this.playerPositionSpawnX = this.player.position.x;
				this.playerPositionSpawnY = this.player.position.y;
				this.playerPositionSpawnZ = this.player.position.z;
				this.player.position.x = this.platform.floatToInt(this.player.position.x) + this.one / 2;
				this.player.position.z = this.platform.floatToInt(this.player.position.z) + this.one / 2;
			}
			if (eKey == this.getKey(88)) {
				this.toggleFog();
				this.log(this.platform.stringFormat(this.language.fogDistance(), this.platform.intToString(this.platform.floatToInt(this.d_Config3d.viewdistance))));
				this.onResize();
			}
			if (eKey == this.getKey(84)) {
				this.showInventory();
				return;
			}
			this.handleMaterialKeys(eKey);
		}
		if (this.guistate == GuiState.INVENTORY) {
			if (eKey == this.getKey(84) || eKey == this.getKey(50)) {
				this.guiStateBackToGame();
			}
			return;
		}
		if (this.guistate == GuiState.MAP_LOADING) {
			if (eKey == this.getKey(50)) {
				this.exitToMainMenu_();
			}
		}
		if (this.guistate == GuiState.CRAFTING_RECIPES) {
			if (eKey == this.getKey(50)) {
				this.guiStateBackToGame();
			}
		}
		if (this.guistate == GuiState.NORMAL) {
			if (eKey == this.getKey(50)) {
				this.escapeMenuStart();
				return;
			}
		}
	}

	final void keyPress(int eKeyChar)
	{
		for (int i = 0; i < this.clientmodsCount; i++) {
			if (this.clientmods[i] == null) {
				continue;
			}
			KeyPressEventArgs args_ = new KeyPressEventArgs();
			args_.setKeyChar(eKeyChar);
			this.clientmods[i].onKeyPress(this, args_);
			if (args_.getHandled()) {
				return;
			}
		}
	}

	final void keyUp(int eKey)
	{
		this.keyboardStateRaw[eKey] = false;
		for (int i = 0; i < this.clientmodsCount; i++) {
			KeyEventArgs args_ = new KeyEventArgs();
			args_.setKeyCode(eKey);
			this.clientmods[i].onKeyUp(this, args_);
			if (args_.getHandled()) {
				return;
			}
		}
		this.keyboardState[eKey] = false;
		if (eKey == this.getKey(1) || eKey == this.getKey(2)) {
			this.isShiftPressed = false;
		}
	}
	int lastReceivedMilliseconds;

	final boolean lavaSwimmingCamera()
	{
		return this.isLava(this.getCameraBlock());
	}

	final float length(float x, float y, float z)
	{
		return this.platform.mathSqrt(x * x + y * y + z * z);
	}
	int[] loadedAmmo;
	int localPlayerId;

	final void log(String p)
	{
		this.addChatline(p);
	}

	final void mainThreadOnRenderFrame(float deltaTime)
	{
		this.updateResize();
		if (this.guistate == GuiState.MAP_LOADING) {
			this.platform.glClearColorRgbaf(0, 0, 0, 1);
		}
		else {
			this.platform.glClearColorRgbaf(this.one * 0 / 255, this.one * 0 / 255, this.one * 0 / 255, this.one * 255 / 255);
		}
		this.mouseSmoothingAccum += deltaTime;
		float constMouseDt = 1f / 300;
		while (this.mouseSmoothingAccum > constMouseDt) {
			this.mouseSmoothingAccum -= constMouseDt;
			this.updateMouseViewportControl(constMouseDt);
		}
		this.platform.applicationDoEvents();
		this.accumulator += deltaTime;
		if (this.accumulator > 1) {
			this.accumulator = 1;
		}
		float dt = this.one / 75;
		while (this.accumulator >= dt) {
			this.frameTick(dt);
			this.accumulator -= dt;
		}
		if (this.guistate == GuiState.MAP_LOADING) {
			this.gotoDraw2d(deltaTime);
			return;
		}
		if (this.eNABLE_LAG == 2) {
			this.platform.threadSpinWait(20000000);
		}
		this.setAmbientLight(this.terraincolor());
		this.platform.glClearColorBufferAndDepthBuffer();
		this.platform.bindTexture2d(this.d_TerrainTextures.terrainTexture());
		for (int i = 0; i < this.clientmodsCount; i++) {
			if (this.clientmods[i] == null) {
				continue;
			}
			this.clientmods[i].onBeforeNewFrameDraw3d(this, deltaTime);
		}
		this.gLMatrixModeModelView();
		this.gLLoadMatrix(this.camera);
		this.cameraMatrix.lastmvmatrix = this.camera;
		this.d_FrustumCulling.calcFrustumEquations();
		boolean drawgame = this.guistate != GuiState.MAP_LOADING;
		if (drawgame) {
			this.platform.glEnableDepthTest();
			for (int i = 0; i < this.clientmodsCount; i++) {
				if (this.clientmods[i] == null) {
					continue;
				}
				this.clientmods[i].onNewFrameDraw3d(this, deltaTime);
			}
		}
		this.gotoDraw2d(deltaTime);
	}

	private CachedTexture makeTextTexture(Text_ t)
	{
		CachedTexture ct = new CachedTexture();
		BitmapCi bmp = this.textColorRenderer.createTextTexture(t);
		ct.sizeX = this.platform.bitmapGetWidth(bmp);
		ct.sizeY = this.platform.bitmapGetHeight(bmp);
		ct.textureId = this.platform.loadTextureFromBitmap(bmp);
		this.platform.bitmapDelete(bmp);
		return ct;
	}

	final void mapLoaded()
	{
		this.redrawAllBlocks();
		this.materialSlots = this.d_Data.defaultMaterialSlots();
		this.guiStateBackToGame();
		this.playerPositionSpawnX = this.player.position.x;
		this.playerPositionSpawnY = this.player.position.y;
		this.playerPositionSpawnZ = this.player.position.z;
	}

	public final void mapLoadingStart()
	{
		this.guistate = GuiState.MAP_LOADING;
		this.setFreeMouse(true);
		this.maploadingprogress = new MapLoadingProgressEventArgs();
		this.fontMapLoading = FontCi.create("Arial", 14, 0);
	}

	public final int materialSlots_(int i)
	{
		Packet_Item item = this.d_Inventory.rightHand[i];
		int m = this.d_Data.blockIdDirt();
		if (item != null && item.itemClass == 0) {
			m = this.d_Inventory.rightHand[i].blockId;
		}
		return m;
	}

	public final int mathFloor(float a)
	{
		if (a >= 0) {
			return this.platform.floatToInt(a);
		}
		else {
			return this.platform.floatToInt(a) - 1;
		}
	}

	final void mouseDown(MouseEventArgs args)
	{
		if (args.getButton() == 0) {
			this.mouseLeft = true;
		}
		if (args.getButton() == 1) {
			this.mouseMiddle = true;
		}
		if (args.getButton() == 2) {
			this.mouseRight = true;
		}
		if (args.getButton() == 0) {
			this.mouseleftclick = true;
		}
		if (args.getButton() == 2) {
			this.mouserightclick = true;
		}
		for (int i = 0; i < this.clientmodsCount; i++) {
			if (this.clientmods[i] == null) {
				continue;
			}
			this.clientmods[i].onMouseDown(this, args);
		}
		if (this.mousePointerLockShouldBe) {
			this.platform.requestMousePointerLock();
			this.mouseDeltaX = 0;
			this.mouseDeltaY = 0;
		}
		this.invalidVersionAllow();
	}

	public final void mouseMove(MouseEventArgs e)
	{
		if (!e.getEmulated() || e.getForceUsage()) {
			this.mouseCurrentX = e.getX();
			this.mouseCurrentY = e.getY();
		}
		if (e.getEmulated() || e.getForceUsage()) {
			this.mouseDeltaX += e.getMovementX();
			this.mouseDeltaY += e.getMovementY();
		}
		for (int i = 0; i < this.clientmodsCount; i++) {
			if (this.clientmods[i] == null) {
				continue;
			}
			this.clientmods[i].onMouseMove(this, e);
		}
	}

	final void mouseUp(MouseEventArgs args)
	{
		if (args.getButton() == 0) {
			this.mouseLeft = false;
		}
		if (args.getButton() == 1) {
			this.mouseMiddle = false;
		}
		if (args.getButton() == 2) {
			this.mouseRight = false;
		}
		if (args.getButton() == 0) {
			this.mouseleftdeclick = true;
		}
		if (args.getButton() == 2) {
			this.mouserightdeclick = true;
		}
		for (int i = 0; i < this.clientmodsCount; i++) {
			if (this.clientmods[i] == null) {
				continue;
			}
			this.clientmods[i].onMouseUp(this, args);
		}
	}

	final void mouseWheelChanged(MouseWheelEventArgs e)
	{
		float eDeltaPrecise = e.getDeltaPrecise();
		if (this.keyboardState[this.getKey(1)]) {
			if (this.cameratype == CameraType.OVERHEAD) {
				this.overheadcameradistance -= eDeltaPrecise;
				if (this.overheadcameradistance < this.tPP_CAMERA_DISTANCE_MIN) {
					this.overheadcameradistance = this.tPP_CAMERA_DISTANCE_MIN;
				}
				if (this.overheadcameradistance > this.tPP_CAMERA_DISTANCE_MAX) {
					this.overheadcameradistance = this.tPP_CAMERA_DISTANCE_MAX;
				}
			}
			if (this.cameratype == CameraType.TPP) {
				this.tppcameradistance -= eDeltaPrecise;
				if (this.tppcameradistance < this.tPP_CAMERA_DISTANCE_MIN) {
					this.tppcameradistance = this.tPP_CAMERA_DISTANCE_MIN;
				}
				if (this.tppcameradistance > this.tPP_CAMERA_DISTANCE_MAX) {
					this.tppcameradistance = this.tPP_CAMERA_DISTANCE_MAX;
				}
			}
		}
		for (int i = 0; i < this.clientmodsCount; i++) {
			if (this.clientmods[i] == null) {
				continue;
			}
			this.clientmods[i].onMouseWheelChanged(this, e);
		}
	}

	final float moveSpeedNow()
	{
		float movespeednow = this.movespeed;
		{
			int blockunderplayer = this.blockUnderPlayer();
			if (blockunderplayer != -1) {
				float floorSpeed = this.d_Data.walkSpeed()[blockunderplayer];
				if (floorSpeed != 0) {
					movespeednow *= floorSpeed;
				}
			}
		}
		if (this.keyboardState[this.getKey(1)]) {
			movespeednow *= this.one * 2 / 10;
		}
		Packet_Item item = this.d_Inventory.rightHand[this.activeMaterial];
		if (item != null && item.itemClass == 0) {
			float itemSpeed = this.deserializeFloat(this.blocktypes[item.blockId].walkSpeedWhenUsedFloat);
			if (itemSpeed != 0) {
				movespeednow *= itemSpeed;
			}
			if (this.ironSights) {
				float ironSightsSpeed = this.deserializeFloat(this.blocktypes[item.blockId].ironSightsMoveSpeedFloat);
				if (ironSightsSpeed != 0) {
					movespeednow *= ironSightsSpeed;
				}
			}
		}
		return movespeednow;
	}

	final void moveToInventory(Packet_InventoryPosition from)
	{
		this.sendPacketClient(ClientPackets.moveToInventory(from));
	}

	final BlockPosSide nearest(BlockPosSide[] pick2, int pick2Count, float x, float y, float z)
	{
		float minDist = 1000000;
		BlockPosSide nearest = null;
		for (int i = 0; i < pick2Count; i++) {
			float dist = this.dist(pick2[i].blockPos[0], pick2[i].blockPos[1], pick2[i].blockPos[2], x, y, z);
			if (dist < minDist) {
				minDist = dist;
				nearest = pick2[i];
			}
		}
		return nearest;
	}
	Packet_BlockType[] newBlockTypes;

	public final float nextFloat(float min, float max)
	{
		return this.rnd.nextFloat() * (max - min) + min;
	}
	int[] nightLevels;

	public final void onBackPressed()
	{
	}

	final void onFocusChanged()
	{
		if (this.guistate == GuiState.NORMAL) {
			this.escapeMenuStart();
		}
	}

	public final void onRenderFrame(float deltaTime)
	{
		this.taskScheduler.update(this, deltaTime);
	}

	final void onResize()
	{
		this.platform.glViewport(0, 0, this.width(), this.height());
		this.set3dProjection2();
		if (this.sendResize) {
			this.sendGameResolution();
		}
	}

	public final void onTouchEnd(TouchEventArgs e)
	{
		this.mouseCurrentX = 0;
		this.mouseCurrentY = 0;
		for (int i = 0; i < this.clientmodsCount; i++) {
			if (this.clientmods[i] == null) {
				continue;
			}
			this.clientmods[i].onTouchEnd(this, e);
			if (e.getHandled()) {
				return;
			}
		}
	}

	public final void onTouchMove(TouchEventArgs e)
	{
		for (int i = 0; i < this.clientmodsCount; i++) {
			if (this.clientmods[i] == null) {
				continue;
			}
			this.clientmods[i].onTouchMove(this, e);
			if (e.getHandled()) {
				return;
			}
		}
	}

	public final void onTouchStart(TouchEventArgs e)
	{
		this.invalidVersionAllow();
		this.mouseCurrentX = e.getX();
		this.mouseCurrentY = e.getY();
		this.mouseleftclick = true;
		for (int i = 0; i < this.clientmodsCount; i++) {
			if (this.clientmods[i] == null) {
				continue;
			}
			this.clientmods[i].onTouchStart(this, e);
			if (e.getHandled()) {
				return;
			}
		}
	}

	public final void orthoMode(int width, int height)
	{
		this.gLMatrixModeProjection();
		this.gLPushMatrix();
		this.gLLoadIdentity();
		this.gLOrtho(0, width, height, 0, 0, 1);
		this.setMatrixUniformProjection();
		this.gLMatrixModeModelView();
		this.gLPushMatrix();
		this.gLLoadIdentity();
		this.setMatrixUniformModelView();
	}
	float pICK_DISTANCE;

	public final void perspectiveMode()
	{
		this.gLMatrixModeProjection();
		this.gLPopMatrix();
		this.setMatrixUniformProjection();
		this.gLMatrixModeModelView();
		this.gLPopMatrix();
		this.setMatrixUniformModelView();
	}

	public final BlockPosSide[] pick(BlockOctreeSearcher s_, Line3D line, IntRef retCount)
	{
		int minX = this.platform.floatToInt(MathCi.minFloat(line.start[0], line.end[0]));
		int minY = this.platform.floatToInt(MathCi.minFloat(line.start[1], line.end[1]));
		int minZ = this.platform.floatToInt(MathCi.minFloat(line.start[2], line.end[2]));
		if (minX < 0) {
			minX = 0;
		}
		if (minY < 0) {
			minY = 0;
		}
		if (minZ < 0) {
			minZ = 0;
		}
		int maxX = this.platform.floatToInt(MathCi.maxFloat(line.start[0], line.end[0]));
		int maxY = this.platform.floatToInt(MathCi.maxFloat(line.start[1], line.end[1]));
		int maxZ = this.platform.floatToInt(MathCi.maxFloat(line.start[2], line.end[2]));
		if (maxX > this.map.mapSizeX) {
			maxX = this.map.mapSizeX;
		}
		if (maxY > this.map.mapSizeZ) {
			maxY = this.map.mapSizeZ;
		}
		if (maxZ > this.map.mapSizeY) {
			maxZ = this.map.mapSizeY;
		}
		int sizex = maxX - minX + 1;
		int sizey = maxY - minY + 1;
		int sizez = maxZ - minZ + 1;
		int size = BitTools.nextPowerOfTwo(MathCi.maxInt(sizex, MathCi.maxInt(sizey, sizez)));
		s_.startBox = Box3D.create(minX, minY, minZ, size);
		BlockPosSide[] pick2 = s_.lineIntersection(IsBlockEmpty_.create(this), GetBlockHeight_.create(this), line, retCount);
		this.pickSort(pick2, retCount.value, line.start[0], line.start[1], line.start[2]);
		return pick2;
	}

	private void pickSort(BlockPosSide[] pick, int pickCount, float x, float y, float z)
	{
		boolean changed = false;
		do {
			changed = false;
			for (int i = 0; i < pickCount - 1; i++) {
				float dist = this.dist(pick[i].blockPos[0], pick[i].blockPos[1], pick[i].blockPos[2], x, y, z);
				float distNext = this.dist(pick[i + 1].blockPos[0], pick[i + 1].blockPos[1], pick[i + 1].blockPos[2], x, y, z);
				if (dist > distNext) {
					changed = true;
					BlockPosSide swapTemp = pick[i];
					pick[i] = pick[i + 1];
					pick[i + 1] = swapTemp;
				}
			}
		}
		while (changed);
	}

	public final byte pitchByte(float orientationX, float orientationY, float orientationZ)
	{
		float xx = (orientationX + Game.getPi()) % (2 * Game.getPi());
		xx = xx / (2 * Game.getPi());
		return Game.intToByte(this.platform.floatToInt(xx * 256));
	}

	public final void playSoundAt(String name, float x, float y, float z)
	{
		if (x == 0 && y == 0 && z == 0) {
			this.audioPlay(name);
		}
		else {
			this.audioPlayAt(name, x, z, y);
		}
	}
	float playerPushDistance;
	Packet_ServerPlayerStats playerStats;

	final void processServerIdentification(Packet_Server packet)
	{
		this.localPlayerId = packet.identification.assignedClientId;
		this.serverInfo.connectdata = this.connectdata;
		this.serverInfo.serverName = packet.identification.serverName;
		this.serverInfo.serverMotd = packet.identification.serverMotd;
		this.d_TerrainChunkTesselator.eNABLE_TEXTURE_TILING = packet.identification.renderHint_ == 0;
		Packet_StringList requiredMd5 = packet.identification.requiredBlobMd5;
		Packet_StringList requiredName = packet.identification.requiredBlobName;
		this.chatLog("[GAME] Processed server identification");
		int getCount = 0;
		if (requiredMd5 != null) {
			this.chatLog(this.platform.stringFormat("[GAME] Server has {0} assets", this.platform.intToString(requiredMd5.itemsCount)));
			for (int i = 0; i < requiredMd5.itemsCount; i++) {
				String md5 = requiredMd5.items[i];
				if (this.platform.isCached(md5)) {
					Asset cachedAsset = this.platform.loadAssetFromCache(md5);
					String name;
					if (requiredName != null) {
						name = requiredName.items[i];
					}
					else {
						name = cachedAsset.name;
					}
					this.setFile(name, cachedAsset.md5, cachedAsset.data, cachedAsset.dataLength);
				}
				else {
					if (requiredName != null) {
						if (!this.hasAsset(md5, requiredName.items[i])) {
							this.getAsset[getCount++] = md5;
						}
					}
					else {
						this.getAsset[getCount++] = md5;
					}
				}
			}
			this.chatLog(this.platform.stringFormat("[GAME] Will download {0} missing assets", this.platform.intToString(getCount)));
		}
		this.sendGameResolution();
		this.chatLog("[GAME] Sent window resolution to server");
		this.sendResize = true;
		this.sendRequestBlob(this.getAsset, getCount);
		this.chatLog("[GAME] Sent BLOB request");
		if (packet.identification.mapSizeX != this.map.mapSizeX || packet.identification.mapSizeY != this.map.mapSizeY || packet.identification.mapSizeZ != this.map.mapSizeZ) {
			this.map.reset(packet.identification.mapSizeX, packet.identification.mapSizeY, packet.identification.mapSizeZ);
			this.d_Heightmap.restart();
		}
		this.shadowssimple = packet.identification.disableShadows == 1 ? true : false;
		this.maxdrawdistance = 256;
		this.chatLog("[GAME] Map initialized");
	}

	public final void queueActionCommit(Action_ action)
	{
		this.commitActions.add(action);
	}

	static float radToAngle256(float value)
	{
		return value / (2 * Game.getPi()) * 255;
	}
	float radiusWhenMoving;
	int receivedMapLength;

	final void reconnect()
	{
		this.reconnect = true;
	}

	final void redrawAllBlocks()
	{
		this.shouldRedrawAllBlocks = true;
	}

	final void redrawBlock(int x, int y, int z)
	{
		this.map.setBlockDirty(x, y, z);
	}

	final void respawn()
	{
		this.sendPacketClient(ClientPackets.specialKeyRespawn());
		this.stopPlayerMove = true;
	}

	final void revertSpeculative(float dt)
	{
		for (int i = 0; i < this.speculativeCount; i++) {
			Speculative s_ = this.speculative[i];
			if (s_ == null) {
				continue;
			}
			if (this.one * (this.platform.timeMillisecondsFromStart() - s_.timeMilliseconds) / 1000 > 2) {
				this.redrawBlock(s_.x, s_.y, s_.z);
				this.speculative[i] = null;
			}
		}
	}

	public final float scale()
	{
		if (this.platform.isSmallScreen()) {
			float scale = this.one * this.width() / 1280;
			return scale;
		}
		else {
			return this.one;
		}
	}
	int selectedBlockPositionX;
	int selectedBlockPositionY;
	int selectedBlockPositionZ;
	int selectedEntityId;

	final void sendChat(String s)
	{
		this.sendPacketClient(ClientPackets.chat(s, this.isTeamchat ? 1 : 0));
	}

	final void sendFillArea(int startx, int starty, int startz, int endx, int endy, int endz, int blockType)
	{
		this.sendPacketClient(ClientPackets.fillArea(startx, starty, startz, endx, endy, endz, blockType, this.activeMaterial));
	}

	final void sendGameResolution()
	{
		this.sendPacketClient(ClientPackets.gameResolution(this.width(), this.height()));
	}

	final void sendLeave(int reason)
	{
		this.sendPacketClient(ClientPackets.leave(reason));
	}

	public final void sendPacket(byte[] packet, int packetLength)
	{
		INetOutgoingMessage msg = new INetOutgoingMessage();
		msg.write(packet, packetLength);
		this.main.sendMessage(msg, MyNetDeliveryMethod.RELIABLE_ORDERED);
	}

	public final void sendPacketClient(Packet_Client packetClient)
	{
		byte[] packet = this.serialize(packetClient, this.packetLen);
		this.sendPacket(packet, this.packetLen.value);
	}

	final void sendPingReply()
	{
		this.sendPacketClient(ClientPackets.pingReply());
	}

	final void sendRequestBlob(String[] required, int requiredCount)
	{
		this.sendPacketClient(ClientPackets.requestBlob(this, required, requiredCount));
	}

	final void sendSetBlock(int x, int y, int z, int mode, int type, int materialslot)
	{
		this.sendPacketClient(ClientPackets.setBlock(x, y, z, mode, type, materialslot));
	}

	final void sendSetBlockAndUpdateSpeculative(int material, int x, int y, int z, int mode)
	{
		this.sendSetBlock(x, y, z, mode, material, this.activeMaterial);
		Packet_Item item = this.d_Inventory.rightHand[this.activeMaterial];
		if (item != null && item.itemClass == 0) {
			int blockid = material;
			if (mode == 0) {
				blockid = 0;
			}
			Speculative s_ = new Speculative();
			s_.x = x;
			s_.y = y;
			s_.z = z;
			s_.blocktype = this.map.getBlock(x, y, z);
			s_.timeMilliseconds = this.platform.timeMillisecondsFromStart();
			this.addSpeculative(s_);
			this.setBlock(x, y, z, blockid);
			this.redrawBlock(x, y, z);
		}
		else {
		}
	}

	public final byte[] serialize(Packet_Client packet, IntRef retLength)
	{
		CitoMemoryStream ms = new CitoMemoryStream();
		Packet_ClientSerializer.serialize(ms, packet);
		byte[] data = ms.toArray();
		retLength.value = ms.length();
		return data;
	}

	public final int serializeFloat(float p)
	{
		return this.platform.floatToInt(p * 32);
	}
	ServerInformation serverInfo;

	public final void set3dProjection(float zfar, float fov)
	{
		float aspect_ratio = this.one * this.width() / this.height();
		Mat4.perspective(this.set3dProjectionTempMat4, fov, aspect_ratio, this.znear, zfar);
		this.cameraMatrix.lastpmatrix = this.set3dProjectionTempMat4;
		this.gLMatrixModeProjection();
		this.gLLoadMatrix(this.set3dProjectionTempMat4);
		this.setMatrixUniformProjection();
	}

	final void set3dProjection1(float zfar_)
	{
		this.set3dProjection(zfar_, this.currentfov());
	}

	final void set3dProjection2()
	{
		this.set3dProjection1(this.zfar());
	}
	private float[] set3dProjectionTempMat4;

	final void setAmbientLight(int color)
	{
		int r = Game.colorR(color);
		int g = Game.colorG(color);
		int b = Game.colorB(color);
		this.platform.glLightModelAmbient(r, g, b);
	}

	final void setBlock(int x, int y, int z, int tileType)
	{
		this.map.setBlockRaw(x, y, z, tileType);
		this.map.setChunkDirty(x / 16, y / 16, z / 16, true, true);
		this.shadowsOnSetBlock(x, y, z);
		this.lastplacedblockX = x;
		this.lastplacedblockY = y;
		this.lastplacedblockZ = z;
	}

	final void setCamera(int type)
	{
		if (type == CameraType.FPP) {
			this.cameratype = CameraType.FPP;
			this.setFreeMouse(false);
			this.eNABLE_TPP_VIEW = false;
			this.overheadcamera = false;
		}
		else if (type == CameraType.TPP) {
			this.cameratype = CameraType.TPP;
			this.eNABLE_TPP_VIEW = true;
		}
		else {
			this.cameratype = CameraType.OVERHEAD;
			this.overheadcamera = true;
			this.setFreeMouse(true);
			this.eNABLE_TPP_VIEW = true;
			this.playerdestination = Vector3Ref.create(this.player.position.x, this.player.position.y, this.player.position.z);
		}
	}

	final void setCharacterEyesHeight(float value)
	{
		this.entities[this.localPlayerId].drawModel.eyeHeight = value;
	}

	public final void setFile(String name, String md5, byte[] downloaded, int downloadedLength)
	{
		String nameLowercase = this.platform.stringToLower(name);
		if (nameLowercase.equals("mousecursor.png")) {
			this.platform.setWindowCursor(0, 0, 32, 32, downloaded, downloadedLength);
		}
		Asset newAsset = new Asset();
		newAsset.data = downloaded;
		newAsset.dataLength = downloadedLength;
		newAsset.name = nameLowercase;
		newAsset.md5 = md5;
		for (int i = 0; i < this.assets.count; i++) {
			if (this.assets.items[i] == null) {
				continue;
			}
			if (this.assets.items[i].name.equals(nameLowercase)) {
				if (this.options.useServerTextures) {
					this.assets.items[i] = newAsset;
				}
				this.cacheAsset(newAsset);
				return;
			}
		}
		this.assets.items[this.assets.count++] = newAsset;
		this.cacheAsset(newAsset);
	}

	final void setFog()
	{
		if (this.d_Config3d.viewdistance >= 512) {
			return;
		}
		float density = this.one * 25 / 10000;
		int fogR;
		int fogG;
		int fogB;
		int fogA;
		if (this.skySphereNight && !this.shadowssimple) {
			fogR = 0;
			fogG = 0;
			fogB = 0;
			fogA = 255;
		}
		else {
			fogR = 0;
			fogG = 0;
			fogB = 0;
			fogA = 255;
		}
		this.platform.glEnableFog();
		this.platform.glHintFogHintNicest();
		this.platform.glFogFogModeExp2();
		this.platform.glFogFogColor(fogR, fogG, fogB, fogA);
		this.platform.glFogFogDensity(density);
	}

	public final void setFreeMouse(boolean value)
	{
		this.mousePointerLockShouldBe = !value;
		if (value) {
			this.platform.exitMousePointerLock();
		}
		else {
			this.platform.requestMousePointerLock();
		}
	}

	public final void setMatrixUniformModelView()
	{
		this.platform.setMatrixUniformModelView(this.mvMatrix.peek());
	}

	public final void setMatrixUniformProjection()
	{
		this.platform.setMatrixUniformProjection(this.pMatrix.peek());
	}

	public final void setMatrixUniforms()
	{
		this.platform.setMatrixUniformProjection(this.pMatrix.peek());
		this.platform.setMatrixUniformModelView(this.mvMatrix.peek());
	}

	public final void setPlatform(GamePlatform value)
	{
		this.platform = value;
	}

	final void setTileAndUpdate(int x, int y, int z, int type)
	{
		this.setBlock(x, y, z, type);
		this.redrawBlock(x, y, z);
	}

	final void shadowsOnSetBlock(int x, int y, int z)
	{
		int oldheight = this.d_Heightmap.getBlock(x, y);
		this.updateColumnHeight(x, y);
		int newheight = this.d_Heightmap.getBlock(x, y);
		int min = MathCi.minInt(oldheight, newheight);
		int max = MathCi.maxInt(oldheight, newheight);
		for (int i = min; i < max; i++) {
			if (i / 16 != z / 16) {
				this.map.setChunkDirty(x / 16, y / 16, i / 16, true, true);
			}
		}
		for (int xx = 0; xx < 3; xx++) {
			for (int yy = 0; yy < 3; yy++) {
				for (int zz = 0; zz < 3; zz++) {
					int cx = x / 16 + xx - 1;
					int cy = y / 16 + yy - 1;
					int cz = z / 16 + zz - 1;
					if (this.map.isValidChunkPos(cx, cy, cz)) {
						this.map.setChunkDirty(cx, cy, cz, true, false);
					}
				}
			}
		}
	}

	public final void showEscapeMenu()
	{
		this.guistate = GuiState.ESCAPE_MENU;
		this.menustate = new MenuState();
		this.setFreeMouse(true);
	}

	public final void showInventory()
	{
		this.guistate = GuiState.INVENTORY;
		this.menustate = new MenuState();
		this.setFreeMouse(true);
	}
	boolean skySphereNight;

	public final void start()
	{
		this.textColorRenderer = new TextColorRenderer();
		this.textColorRenderer.platform = this.platform;
		this.language.platform = this.platform;
		this.language.loadTranslations();
		GameData gamedata = new GameData();
		gamedata.start();
		Config3d config3d = new Config3d();
		if (this.platform.isFastSystem()) {
			config3d.viewdistance = 128;
		}
		else {
			config3d.viewdistance = 32;
		}
		ITerrainTextures terrainTextures = new ITerrainTextures();
		terrainTextures.game = this;
		this.d_TextureAtlasConverter = new TextureAtlasConverter();
		this.d_TerrainTextures = terrainTextures;
		FrustumCulling frustumculling = new FrustumCulling();
		frustumculling.d_GetCameraMatrix = this.cameraMatrix;
		frustumculling.platform = this.platform;
		this.d_FrustumCulling = frustumculling;
		TerrainChunkTesselatorCi terrainchunktesselator = new TerrainChunkTesselatorCi();
		this.d_TerrainChunkTesselator = terrainchunktesselator;
		this.d_Batcher = new MeshBatcher();
		this.d_Batcher.d_FrustumCulling = frustumculling;
		this.d_Batcher.game = this;
		this.d_FrustumCulling = frustumculling;
		this.d_Data = gamedata;
		this.d_DataMonsters = new GameDataMonsters();
		this.d_Config3d = config3d;
		ModDrawParticleEffectBlockBreak particle = new ModDrawParticleEffectBlockBreak();
		this.particleEffectBlockBreak = particle;
		this.d_Data = gamedata;
		this.d_TerrainTextures = terrainTextures;
		this.map.reset(256, 256, 128);
		SunMoonRenderer sunmoonrenderer = new SunMoonRenderer();
		this.d_SunMoonRenderer = sunmoonrenderer;
		this.d_SunMoonRenderer = sunmoonrenderer;
		this.d_Heightmap = new InfiniteMapChunked2d();
		this.d_Heightmap.d_Map = this;
		this.d_Heightmap.restart();
		this.d_TerrainChunkTesselator = terrainchunktesselator;
		terrainchunktesselator.game = this;
		Packet_Inventory inventory = new Packet_Inventory();
		inventory.rightHand = new Packet_Item[10];
		GameDataItemsClient dataItems = new GameDataItemsClient();
		dataItems.game = this;
		InventoryUtilClient inventoryUtil = new InventoryUtilClient();
		this.d_Inventory = inventory;
		this.d_InventoryUtil = inventoryUtil;
		inventoryUtil.d_Inventory = inventory;
		inventoryUtil.d_Items = dataItems;
		this.d_Inventory = inventory;
		this.platform.addOnCrash(OnCrashHandlerLeave.create(this));
		this.rnd = this.platform.randomCreate();
		this.clientmods = new ClientMod[128];
		this.clientmodsCount = 0;
		this.modmanager.game = this;
		this.addMod(new ModDrawMain());
		this.addMod(new ModUpdateMain());
		this.addMod(new ModNetworkProcess());
		this.addMod(new ModUnloadRendererChunks());
		this.addMod(new ModAutoCamera());
		this.addMod(new ModFpsHistoryGraph());
		this.addMod(new ModWalkSound());
		this.addMod(new ModFallDamageToPlayer());
		this.addMod(new ModBlockDamageToPlayer());
		this.addMod(new ModLoadPlayerTextures());
		this.addMod(new ModSendPosition());
		this.addMod(new ModInterpolatePositions());
		this.addMod(new ModRail());
		this.addMod(new ModCompass());
		this.addMod(new ModGrenade());
		this.addMod(new ModBullet());
		this.addMod(new ModExpire());
		this.addMod(new ModReloadAmmo());
		this.addMod(new ModPush());
		if (this.platform.isFastSystem()) {
			this.addMod(new ModSkySphereAnimated());
		}
		else {
			this.addMod(new ModSkySphereStatic());
		}
		this.addMod(sunmoonrenderer);
		this.addMod(new ModDrawTestModel());
		this.addMod(new ModDrawLinesAroundSelectedBlock());
		this.addMod(new ModDebugChunk());
		this.addMod(new ModDrawArea());
		this.addMod(new ModDrawTerrain());
		this.addMod(new ModDrawPlayers());
		this.addMod(new ModDrawPlayerNames());
		this.addMod(new ModDrawText());
		this.addMod(new ModDrawParticleEffectBlockBreak());
		this.addMod(new ModDrawSprites());
		this.addMod(new ModDrawMinecarts());
		this.addMod(new ModDrawHand2d());
		this.addMod(new ModDrawHand3d());
		this.addMod(new ModGuiCrafting());
		this.addMod(new ModDialog());
		this.addMod(new ModPicking());
		this.addMod(new ModClearInactivePlayersDrawInfo());
		this.addMod(new ModCameraKeys());
		this.addMod(new ModSendActiveMaterial());
		this.addMod(new ModCamera());
		this.addMod(new ModNetworkEntity());
		this.addMod(new ModGuiInventory());
		this.addMod(new ModGuiTouchButtons());
		this.addMod(new ModGuiEscapeMenu());
		this.addMod(new ModGuiMapLoading());
		this.addMod(new ModDraw2dMisc());
		this.addMod(new ModGuiPlayerStats());
		this.addMod(new ModGuiChat());
		this.addMod(new ModScreenshot());
		this.addMod(new ModAudio());
		this.s = new BlockOctreeSearcher();
		this.s.platform = this.platform;
		this.lastReceivedMilliseconds = this.platform.timeMillisecondsFromStart();
		this.eNABLE_DRAW_TEST_CHARACTER = this.platform.isDebuggerAttached();
		int maxTextureSize_ = this.platform.glGetMaxTextureSize();
		if (maxTextureSize_ < 1024) {
			maxTextureSize_ = 1024;
		}
		this.maxTextureSize = maxTextureSize_;
		this.mapLoadingStart();
		this.platform.glClearColorRgbaf(0, 0, 0, 1);
		if (this.d_Config3d.eNABLE_BACKFACECULLING) {
			this.platform.glDepthMask(true);
			this.platform.glEnableDepthTest();
			this.platform.glCullFaceBack();
			this.platform.glEnableCullFace();
		}
		this.platform.glEnableLighting();
		this.platform.glEnableColorMaterial();
		this.platform.glColorMaterialFrontAndBackAmbientAndDiffuse();
		this.platform.glShadeModelSmooth();
	}

	public final void startTyping()
	{
		this.guiTyping = TypingState.TYPING;
		this.isTyping = true;
		this.guiTypingBuffer = "";
		this.isTeamchat = false;
	}

	public final void stopTyping()
	{
		this.guiTyping = TypingState.NONE;
	}

	public static boolean stringEquals(String strA, String strB)
	{
		if (strA == null && strB == null) {
			return true;
		}
		if (strA == null || strB == null) {
			return false;
		}
		return strA.equals(strB);
	}

	final boolean swimmingBody()
	{
		int block = this.map.getBlock(this.platform.floatToInt(this.player.position.x), this.platform.floatToInt(this.player.position.z), this.platform.floatToInt(this.player.position.y + 1));
		if (block == -1) {
			return true;
		}
		return this.d_Data.walkableType1()[block] == 1;
	}

	final boolean swimmingEyes()
	{
		int eyesBlock = this.getPlayerEyesBlock();
		if (eyesBlock == -1) {
			return true;
		}
		return this.d_Data.walkableType1()[eyesBlock] == 1;
	}
	int tPP_CAMERA_DISTANCE_MAX;
	int tPP_CAMERA_DISTANCE_MIN;

	final int textSizeHeight(String s, int size)
	{
		IntRef width = new IntRef();
		IntRef height = new IntRef();
		this.platform.textSize(s, size, width, height);
		return height.value;
	}

	final int textSizeWidth(String s, int size)
	{
		IntRef width = new IntRef();
		IntRef height = new IntRef();
		this.platform.textSize(s, size, width, height);
		return width.value;
	}
	int[][] textureId;
	int[] textureIdForInventory;

	public final void toggleFog()
	{
		int[] drawDistances = new int[10];
		int drawDistancesCount = 0;
		drawDistances[drawDistancesCount++] = 32;
		if (this.maxdrawdistance >= 64) {
			drawDistances[drawDistancesCount++] = 64;
		}
		if (this.maxdrawdistance >= 128) {
			drawDistances[drawDistancesCount++] = 128;
		}
		if (this.maxdrawdistance >= 256) {
			drawDistances[drawDistancesCount++] = 256;
		}
		if (this.maxdrawdistance >= 512) {
			drawDistances[drawDistancesCount++] = 512;
		}
		for (int i = 0; i < drawDistancesCount; i++) {
			if (this.d_Config3d.viewdistance == drawDistances[i]) {
				this.d_Config3d.viewdistance = drawDistances[(i + 1) % drawDistancesCount];
				this.redrawAllBlocks();
				return;
			}
		}
		this.d_Config3d.viewdistance = drawDistances[0];
		this.redrawAllBlocks();
	}

	final void toggleVsync()
	{
		this.eNABLE_LAG++;
		this.eNABLE_LAG = this.eNABLE_LAG % 3;
		this.useVsync();
	}
	int[] totalAmmo;

	public final void update(float dt)
	{
		for (int i = 0; i < this.clientmodsCount; i++) {
			if (this.clientmods[i] == null) {
				continue;
			}
			this.clientmods[i].onNewFrameReadOnlyMainThread(this, dt);
		}
	}

	final void updateColumnHeight(int x, int y)
	{
		int height = this.map.mapSizeZ - 1;
		for (int i = this.map.mapSizeZ - 1; i >= 0; i--) {
			height = i;
			if (!Game.isTransparentForLight(this.blocktypes[this.map.getBlock(x, y, i)])) {
				break;
			}
		}
		this.d_Heightmap.setBlock(x, y, height);
	}

	final void updateMouseViewportControl(float dt)
	{
		if (this.mouseSmoothing) {
			float constMouseSmoothing1 = 0.85f;
			float constMouseSmoothing2 = 0.8f;
			this.mouseSmoothingVelX = this.mouseSmoothingVelX + this.mouseDeltaX / 4 * constMouseSmoothing2;
			this.mouseSmoothingVelY = this.mouseSmoothingVelY + this.mouseDeltaY / 4 * constMouseSmoothing2;
			this.mouseSmoothingVelX = this.mouseSmoothingVelX * constMouseSmoothing1;
			this.mouseSmoothingVelY = this.mouseSmoothingVelY * constMouseSmoothing1;
		}
		else {
			this.mouseSmoothingVelX = this.mouseDeltaX;
			this.mouseSmoothingVelY = this.mouseDeltaY;
		}
		if (this.guistate == GuiState.NORMAL && this.enableCameraControl && this.platform.focused()) {
			if (!this.overheadcamera) {
				if (this.platform.isMousePointerLocked()) {
					this.player.position.roty += this.mouseSmoothingVelX * this.rotationspeed * 1f / 75;
					this.player.position.rotx += this.mouseSmoothingVelY * this.rotationspeed * 1f / 75;
					this.player.position.rotx = MathCi.clampFloat(this.player.position.rotx, Game.getPi() / 2 + this.one * 15 / 1000, Game.getPi() / 2 + Game.getPi() - this.one * 15 / 1000);
				}
				this.player.position.rotx += this.touchOrientationDy * this.constRotationSpeed * this.one / 75;
				this.player.position.roty += this.touchOrientationDx * this.constRotationSpeed * this.one / 75;
				this.touchOrientationDx = 0;
				this.touchOrientationDy = 0;
			}
			if (this.cameratype == CameraType.OVERHEAD) {
				if (this.mouseMiddle || this.mouseRight) {
					this.overheadcameraK.turnLeft(this.mouseDeltaX / 70);
					this.overheadcameraK.turnUp(this.mouseDeltaY / 3);
				}
			}
		}
		this.mouseDeltaX = 0;
		this.mouseDeltaY = 0;
	}

	private void updateResize()
	{
		if (this.lastWidth != this.platform.getCanvasWidth() || this.lastHeight != this.platform.getCanvasHeight()) {
			this.lastWidth = this.platform.getCanvasWidth();
			this.lastHeight = this.platform.getCanvasHeight();
			this.onResize();
		}
	}

	public final void updateTextRendererFont()
	{
		this.platform.setTextRendererFont(this.font);
	}

	final void useInventory(Packet_Inventory packet_Inventory)
	{
		this.d_Inventory = packet_Inventory;
		this.d_InventoryUtil.d_Inventory = packet_Inventory;
	}

	final void useTerrainTextureAtlas2d(BitmapCi atlas2d, int atlas2dWidth)
	{
		this.terrainTexture = this.platform.loadTextureFromBitmap(atlas2d);
		int[] terrainTextures1d_;
		int terrainTextures1dCount = 0;
		{
			this.terrainTexturesPerAtlas = this.atlas1dheight() / (atlas2dWidth / this.atlas2dtiles());
			IntRef atlasesidCount = new IntRef();
			BitmapCi[] atlases1d = this.d_TextureAtlasConverter.atlas2dInto1d(this.platform, atlas2d, this.atlas2dtiles(), this.atlas1dheight(), atlasesidCount);
			terrainTextures1d_ = new int[atlasesidCount.value];
			for (int i = 0; i < atlasesidCount.value; i++) {
				BitmapCi bmp = atlases1d[i];
				int texture = this.platform.loadTextureFromBitmap(bmp);
				terrainTextures1d_[terrainTextures1dCount++] = texture;
				this.platform.bitmapDelete(bmp);
			}
		}
		this.terrainTextures1d = terrainTextures1d_;
	}

	final void useTerrainTextures(String[] textureIds, int textureIdsCount)
	{
		int tilesize = 32;
		BitmapData_ atlas2d = BitmapData_.create(tilesize * this.atlas2dtiles(), tilesize * this.atlas2dtiles());
		for (int i = 0; i < textureIdsCount; i++) {
			if (textureIds[i] == null) {
				continue;
			}
			byte[] fileData = this.getFile(StringTools.stringAppend(this.platform, textureIds[i], ".png"));
			if (fileData == null) {
				fileData = this.getFile("Unknown.png");
			}
			if (fileData == null) {
				continue;
			}
			BitmapCi bmp = this.platform.bitmapCreateFromPng(fileData, this.platform.byteArrayLength(fileData));
			if (this.platform.bitmapGetWidth(bmp) != tilesize) {
				this.platform.bitmapDelete(bmp);
				continue;
			}
			if (this.platform.bitmapGetHeight(bmp) != tilesize) {
				this.platform.bitmapDelete(bmp);
				continue;
			}
			int[] bmpPixels = new int[tilesize * tilesize];
			this.platform.bitmapGetPixelsArgb(bmp, bmpPixels);
			int x = i % this.texturesPacked();
			int y = i / this.texturesPacked();
			for (int xx = 0; xx < tilesize; xx++) {
				for (int yy = 0; yy < tilesize; yy++) {
					int c = bmpPixels[xx + yy * tilesize];
					atlas2d.setPixel(x * tilesize + xx, y * tilesize + yy, c);
				}
			}
			this.platform.bitmapDelete(bmp);
		}
		BitmapCi bitmap = this.platform.bitmapCreate(atlas2d.width, atlas2d.height);
		this.platform.bitmapSetPixelsArgb(bitmap, atlas2d.argb);
		this.useTerrainTextureAtlas2d(bitmap, atlas2d.width);
	}

	final void useVsync()
	{
		this.platform.setVSync(this.eNABLE_LAG == 1 ? false : true);
	}

	final String validFont(String family)
	{
		for (int i = 0; i < this.allowedFontsCount; i++) {
			if (this.allowedFonts[i].equals(family)) {
				return family;
			}
		}
		return this.allowedFonts[0];
	}

	public final boolean vec3Equal(float ax, float ay, float az, float bx, float by, float bz)
	{
		return ax == bx && ay == by && az == bz;
	}

	final float vectorAngleGet(float qX, float qY, float qZ)
	{
		return this.platform.mathAcos(qX / this.length(qX, qY, qZ)) * MathCi.sign(qZ);
	}

	public final float waterLevel()
	{
		return this.map.mapSizeZ / 2;
	}

	final boolean waterSwimmingCamera()
	{
		if (this.getCameraBlock() == -1) {
			return true;
		}
		return this.isWater(this.getCameraBlock());
	}

	final boolean waterSwimmingEyes()
	{
		if (this.getPlayerEyesBlock() == -1) {
			return true;
		}
		return this.isWater(this.getPlayerEyesBlock());
	}

	public final float weaponAttackStrength()
	{
		return this.nextFloat(2, 4);
	}

	final void wearItem(Packet_InventoryPosition from, Packet_InventoryPosition to)
	{
		this.sendPacketClient(ClientPackets.wearItem(from, to));
	}

	public final int whiteTexture()
	{
		if (this.whitetexture == -1) {
			BitmapCi bmp = this.platform.bitmapCreate(1, 1);
			int[] pixels = new int[1];
			pixels[0] = Game.colorFromArgb(255, 255, 255, 255);
			this.platform.bitmapSetPixelsArgb(bmp, pixels);
			this.whitetexture = this.platform.loadTextureFromBitmap(bmp);
		}
		return this.whitetexture;
	}

	public final int width()
	{
		return this.platform.getCanvasWidth();
	}
	AnimationState a;
	private float accumulator;
	boolean ammostarted;
	AssetList assets;
	FloatRef assetsLoadProgress;

	final int atlas1dheight()
	{
		return this.maxTextureSize;
	}

	final int atlas2dtiles()
	{
		return 32;
	}
	AudioControl audio;
	float basemovespeed;
	CitoMemoryStream blobdownload;
	String blobdownloadmd5;
	String blobdownloadname;
	DictionaryVector3Float blockHealth;

	public final int blockheight(int x, int y, int z_)
	{
		for (int z = z_; z >= 0; z--) {
			if (this.map.getBlock(x, y, z) != 0) {
				return z + 1;
			}
		}
		return 0;
	}
	Packet_BlockType[] blocktypes;
	CachedTextTexture[] cachedTextTextures;
	int cachedTextTexturesMax;
	float[] camera;
	int cameratype;
	private ModelData circleModelData;
	public static final int CLEARCOLOR_A = 255;
	public static final int CLEARCOLOR_B = 0;
	public static final int CLEARCOLOR_G = 0;
	public static final int CLEARCOLOR_R = 0;
	ClientMod[] clientmods;
	int clientmodsCount;
	ListAction commitActions;
	ConnectData connectdata;
	float constRotationSpeed;
	float constWallDistance;
	Controls controls;
	Vector3IntRef currentAttackedBlock;
	boolean currentMatrixModeProjection;
	int currentTimeMilliseconds;

	final float currentfov()
	{
		if (this.ironSights) {
			Packet_Item item = this.d_Inventory.rightHand[this.activeMaterial];
			if (item != null && item.itemClass == 0) {
				if (this.deserializeFloat(this.blocktypes[item.blockId].ironSightsFovFloat) != 0) {
					return this.fov * this.deserializeFloat(this.blocktypes[item.blockId].ironSightsFovFloat);
				}
			}
		}
		return this.fov;
	}
	int currentlyAttackedEntity;
	MeshBatcher d_Batcher;
	Config3d d_Config3d;
	GameData d_Data;
	GameDataMonsters d_DataMonsters;
	GameExit d_Exit;
	FrustumCulling d_FrustumCulling;
	InfiniteMapChunked2d d_Heightmap;
	Packet_Inventory d_Inventory;
	InventoryUtilClient d_InventoryUtil;
	SunMoonRenderer d_SunMoonRenderer;
	TerrainChunkTesselatorCi d_TerrainChunkTesselator;
	ITerrainTextures d_TerrainTextures;
	TextureAtlasConverter d_TextureAtlasConverter;
	VisibleDialog[] dialogs;
	int dialogsCount;
	boolean drawblockinfo;
	boolean enableCameraControl;
	boolean enable_move;
	Entity[] entities;
	int entitiesCount;
	public static final int ENTITY_LOCAL_ID_START = 256;
	public static final int ENTITY_MONSTER_ID_COUNT = 128;
	public static final int ENTITY_MONSTER_ID_START = 128;
	boolean escapeMenuRestart;
	boolean exitToMainMenu;
	boolean fancySkysphere;
	int fillAreaLimit;
	FontCi fontMapLoading;
	float fov;
	private String[] getAsset;

	public final float getblockheight(int x, int y, int z)
	{
		float RailHeight = this.one * 3 / 10;
		if (!this.map.isValidPos(x, y, z)) {
			return 1;
		}
		if (this.blocktypes[this.map.getBlock(x, y, z)].rail != 0) {
			return RailHeight;
		}
		if (this.blocktypes[this.map.getBlock(x, y, z)].drawType == 11) {
			return this.one / 2;
		}
		if (this.blocktypes[this.map.getBlock(x, y, z)].drawType == 12) {
			return this.one / 20;
		}
		return 1;
	}
	int grenadecookingstartMilliseconds;
	float grenadetime;
	int guistate;
	boolean handRedraw;
	boolean handSetAttackBuild;
	boolean handSetAttackDestroy;
	int handTexture;
	private float[] identityMatrix;
	String invalidVersionDrawMessage;
	Packet_Server invalidVersionPacketIdentification;
	boolean isNight;
	boolean isplayeronground;
	boolean issingleplayer;
	boolean[] keyboardState;
	boolean[] keyboardStateRaw;
	Language language;
	private int lastHeight;
	int lastOxygenTickMilliseconds;
	private int lastWidth;
	int lastironsightschangeMilliseconds;
	int lastplacedblockX;
	int lastplacedblockY;
	int lastplacedblockZ;
	private float lastplayerpositionX;
	private float lastplayerpositionY;
	private float lastplayerpositionZ;
	int lastpositionsentMilliseconds;
	boolean leftpressedpicking;
	AnimationState localplayeranim;
	AnimationHint localplayeranimationhint;
	byte localstance;
	float[] mLightLevels;
	NetClient main;
	Map map;
	MapLoadingProgressEventArgs maploadingprogress;
	int[] materialSlots;
	int maxTextureSize;
	int maxdrawdistance;
	public static final int MAXLIGHT = 15;
	MenuState menustate;
	public static final int MINLIGHT = 0;
	private float[] modelViewInverted;
	ClientModManager1 modmanager;
	float moonPositionX;
	float moonPositionY;
	float moonPositionZ;
	int mouseCurrentX;
	int mouseCurrentY;
	float mouseDeltaX;
	float mouseDeltaY;
	boolean mouseLeft;
	boolean mouseMiddle;
	private boolean mousePointerLockShouldBe;
	boolean mouseRight;
	private boolean mouseSmoothing;
	private float mouseSmoothingAccum;
	private float mouseSmoothingVelX;
	private float mouseSmoothingVelY;
	boolean mouseleftclick;
	boolean mouseleftdeclick;
	boolean mouserightclick;
	boolean mouserightdeclick;
	float movedz;
	float movespeed;
	StackMatrix4 mvMatrix;
	float one;
	OptionsCi options;
	boolean overheadcamera;
	Kamera overheadcameraK;
	float overheadcameradistance;
	StackMatrix4 pMatrix;
	ClientPacketHandler[] packetHandlers;
	private IntRef packetLen;
	ModDrawParticleEffectBlockBreak particleEffectBlockBreak;
	DictionaryStringString performanceinfo;
	int pistolcycle;
	GamePlatform platform;
	Entity player;
	float playerPositionSpawnX;
	float playerPositionSpawnY;
	float playerPositionSpawnZ;
	Vector3Ref playerdestination;
	int playertexturedefault;
	public static final String PLAYERTEXTUREDEFAULTFILENAME = "mineplayer.png";
	Vector3Ref playervelocity;
	float pushX;
	float pushY;
	float pushZ;
	private Model quadModel;
	boolean reachedHalfBlock;
	boolean reachedwall;
	boolean reachedwall_1blockhigh;
	boolean reconnect;
	Packet_ServerRedirect redirectTo;
	int reloadblock;
	int reloadstartMilliseconds;
	RandomCi rnd;
	private float rotationspeed;
	BlockOctreeSearcher s;
	int selectedmodelid;
	private boolean sendResize;
	String serverGameVersion;
	boolean shadowssimple;
	boolean shouldRedrawAllBlocks;
	ModSkySphereStatic skysphere;
	BoolRef soundnow;
	boolean spawned;
	Speculative[] speculative;
	int speculativeCount;
	private boolean startedconnecting;
	boolean stopPlayerMove;
	float sunPositionX;
	float sunPositionY;
	float sunPositionZ;
	int sunlight_;
	private TaskScheduler taskScheduler;
	int terrainTexture;
	int[] terrainTextures1d;
	int terrainTexturesPerAtlas;

	final int terraincolor()
	{
		if (this.waterSwimmingCamera()) {
			return Game.colorFromArgb(255, 78, 95, 140);
		}
		else if (this.lavaSwimmingCamera()) {
			return Game.colorFromArgb(255, 222, 101, 46);
		}
		else {
			return Game.colorFromArgb(255, 255, 255, 255);
		}
	}
	TextColorRenderer textColorRenderer;
	private DictionaryStringInt1024 textures;

	final int texturesPacked()
	{
		return 32;
	}
	int totaltimeMilliseconds;
	float touchMoveDx;
	float touchMoveDy;
	float touchOrientationDx;
	float touchOrientationDy;
	float tppcameradistance;
	String[] typinglog;
	int typinglogCount;
	int typinglogpos;
	boolean wasmouseleft;
	boolean wasmouseright;
	private int whitetexture;

	final int xcenter(float width)
	{
		return this.platform.floatToInt(this.platform.getCanvasWidth() / 2 - width / 2);
	}

	final int ycenter(float height)
	{
		return this.platform.floatToInt(this.platform.getCanvasHeight() / 2 - height / 2);
	}

	final float zfar()
	{
		if (this.d_Config3d.viewdistance >= 256) {
			return this.d_Config3d.viewdistance * 2;
		}
		return this.eNABLE_ZFAR ? this.d_Config3d.viewdistance : 99999;
	}
	float znear;
}
