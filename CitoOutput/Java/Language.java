// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class Language
{
	public Language()
	{
		this.stringsMax = 32768;
		this.stringsCount = 0;
		this.strings = new TranslatedString[this.stringsMax];
		this.loadedLanguagesCount = 0;
		this.loadedLanguagesMax = 64;
		this.loadedLanguages = new String[this.loadedLanguagesMax];
	}

	private void add(String language, String id, String translated)
	{
		if (this.isNewLanguage(language)) {
			if (this.loadedLanguagesCount < this.loadedLanguagesMax) {
				this.loadedLanguages[this.loadedLanguagesCount] = language;
				this.loadedLanguagesCount++;
			}
		}
		if (this.stringsCount > this.stringsMax) {
			return;
		}
		if (this.containsTranslation(language, id)) {
			return;
		}
		TranslatedString s = new TranslatedString();
		s.language = language;
		s.id = id;
		s.translated = translated;
		this.strings[this.stringsCount++] = s;
	}

	private void addEnglish()
	{
		this.add("en", "MainMenu_AssetsLoadProgress", "Loading... {0}%");
		this.add("en", "MainMenu_Singleplayer", "Singleplayer");
		this.add("en", "MainMenu_Multiplayer", "Multiplayer");
		this.add("en", "MainMenu_Quit", "&cQuit");
		this.add("en", "MainMenu_ButtonBack", "Back");
		this.add("en", "MainMenu_SingleplayerButtonCreate", "Create or open...");
		this.add("en", "MainMenu_Login", "Login");
		this.add("en", "MainMenu_LoginUsername", "Username");
		this.add("en", "MainMenu_LoginPassword", "Password");
		this.add("en", "MainMenu_LoginRemember", "Remember me");
		this.add("en", "MainMenu_ChoiceYes", "Yes");
		this.add("en", "MainMenu_ChoiceNo", "No");
		this.add("en", "MainMenu_LoginInvalid", "&4Invalid username or password");
		this.add("en", "MainMenu_LoginConnecting", "Connecting...");
		this.add("en", "MainMenu_MultiplayerConnect", "Connect");
		this.add("en", "MainMenu_MultiplayerConnectIP", "Connect to IP");
		this.add("en", "MainMenu_MultiplayerRefresh", "Refresh");
		this.add("en", "MainMenu_MultiplayerLoading", "Loading...");
		this.add("en", "MainMenu_ConnectToIpConnect", "Connect");
		this.add("en", "MainMenu_ConnectToIpIp", "IP");
		this.add("en", "MainMenu_ConnectToIpPort", "Port");
		this.add("en", "CannotWriteChatLog", "Cannot write to chat log file {0}.");
		this.add("en", "ChunkUpdates", "Chunk updates: {0}");
		this.add("en", "Connecting", "Connecting...");
		this.add("en", "ConnectingProgressKilobytes", "{0} KB");
		this.add("en", "ConnectingProgressPercent", "{0}%");
		this.add("en", "DefaultKeys", "Default keys");
		this.add("en", "Exit", "Return to main menu");
		this.add("en", "FogDistance", "Fog distance: {0}");
		this.add("en", "FontOption", "Font: {0}");
		this.add("en", "FrameRateLagSimulation", "Frame rate: lag simulation.");
		this.add("en", "FrameRateUnlimited", "Frame rate: unlimited.");
		this.add("en", "FrameRateVsync", "Frame rate: vsync.");
		this.add("en", "FreemoveNotAllowed", "Freemove is not allowed on this server.");
		this.add("en", "GameName", "Manic Digger");
		this.add("en", "Graphics", "Graphics");
		this.add("en", "InvalidVersionConnectAnyway", "Invalid game version. Local: {0}, Server: {1}. Do you want to connect anyway?");
		this.add("en", "KeyBlockInfo", "Block information");
		this.add("en", "KeyChange", "{0}: {1}");
		this.add("en", "KeyChat", "Chat");
		this.add("en", "KeyCraft", "Craft");
		this.add("en", "KeyFreeMove", "Free move");
		this.add("en", "KeyFullscreen", "Fullscreen");
		this.add("en", "KeyJump", "Jump");
		this.add("en", "KeyMoveBack", "Move back");
		this.add("en", "KeyMoveFoward", "Move foward");
		this.add("en", "KeyMoveLeft", "Move left");
		this.add("en", "KeyMoveRight", "Move right");
		this.add("en", "KeyMoveSpeed", "{0}x move speed");
		this.add("en", "KeyPlayersList", "Players list");
		this.add("en", "KeyReloadWeapon", "Reload weapon");
		this.add("en", "KeyRespawn", "Respawn");
		this.add("en", "KeyReverseMinecart", "Reverse minecart");
		this.add("en", "Keys", "Keys");
		this.add("en", "KeyScreenshot", "Screenshot");
		this.add("en", "KeySetSpawnPosition", "Set spawn position");
		this.add("en", "KeyShowMaterialSelector", "Open inventory");
		this.add("en", "KeyTeamChat", "Team Chat");
		this.add("en", "KeyTextEditor", "Texteditor");
		this.add("en", "KeyThirdPersonCamera", "Third-person camera");
		this.add("en", "KeyToggleFogDistance", "Toggle fog distance");
		this.add("en", "KeyUse", "Use");
		this.add("en", "MoveFree", "Move: Free.");
		this.add("en", "MoveFreeNoclip", "Move: Free, Noclip.");
		this.add("en", "MoveNormal", "Move: Normal.");
		this.add("en", "MoveSpeed", "Move Speed: {0}.");
		this.add("en", "NoMaterialsForCrafting", "No materials for crafting.");
		this.add("en", "Off", "OFF");
		this.add("en", "On", "ON");
		this.add("en", "Options", "Options");
		this.add("en", "Other", "Other");
		this.add("en", "PressToUse", "(press {0} to use)");
		this.add("en", "Respawn", "Respawn");
		this.add("en", "ReturnToGame", "Return to game");
		this.add("en", "ReturnToMainMenu", "Back");
		this.add("en", "ReturnToOptionsMenu", "Return to options menu");
		this.add("en", "ShadowsOption", "Shadows: {0}");
		this.add("en", "SoundOption", "Sound: {0}");
		this.add("en", "AutoJumpOption", "Auto Jump: {0}");
		this.add("en", "ClientLanguageOption", "Language: {0}");
		this.add("en", "SpawnPositionSet", "Spawn position set.");
		this.add("en", "SpawnPositionSetTo", "Spawn position set to: {0}");
		this.add("en", "Triangles", "Triangles: {0}");
		this.add("en", "UseServerTexturesOption", "Use server textures (restart): {0}");
		this.add("en", "ViewDistanceOption", "View distance: {0}");
		this.add("en", "OptionSmoothShadows", "Smooth shadows: {0}");
		this.add("en", "OptionFramerate", "Framerate: {0}");
		this.add("en", "OptionResolution", "Resolution: {0}");
		this.add("en", "OptionFullscreen", "Fullscreen: {0}");
		this.add("en", "OptionDarkenSides", "Darken block sides: {0}");
		this.add("en", "Server_CannotWriteLogFile", "Cannot write to server log file {0}.");
		this.add("en", "Server_LoadingSavegame", "Loading savegame...");
		this.add("en", "Server_CreatingSavegame", "Creating new savegame file.");
		this.add("en", "Server_LoadedSavegame", "Savegame loaded: ");
		this.add("en", "Server_ConfigNotFound", "Server configuration file not found, creating new.");
		this.add("en", "Server_ConfigCorruptBackup", "ServerConfig corrupt! Created new. Backup saved as ServerConfig.txt.old");
		this.add("en", "Server_ConfigCorruptNoBackup", "ServerConfig corrupt! Created new. COULD NOT BACKUP OLD!");
		this.add("en", "Server_ConfigLoaded", "Server configuration loaded.");
		this.add("en", "Server_ClientConfigNotFound", "Server client configuration file not found, creating new.");
		this.add("en", "Server_ClientConfigGuestGroupNotFound", "Default guest group not found!");
		this.add("en", "Server_ClientConfigRegisteredGroupNotFound", "Default registered group not found!");
		this.add("en", "Server_ClientConfigLoaded", "Server client configuration loaded.");
		this.add("en", "Server_InvalidSpawnCoordinates", "Invalid default spawn coordinates!");
		this.add("en", "Server_ProgressDownloadingData", "Downloading data...");
		this.add("en", "Server_ProgressGenerating", "Generating world...");
		this.add("en", "Server_ProgressDownloadingMap", "Downloading map...");
		this.add("en", "Server_NoChatPrivilege", "{0}Insufficient privileges to chat.");
		this.add("en", "Server_FillAreaInvalid", "Fillarea is invalid or contains blocks in an area you are not allowed to build in.");
		this.add("en", "Server_FillAreaTooLarge", "Fill area is too large.");
		this.add("en", "Server_NoSpectatorBuild", "Spectators are not allowed to build.");
		this.add("en", "Server_NoBuildPrivilege", "Insufficient privileges to build.");
		this.add("en", "Server_NoBuildPermissionHere", "You need permission to build in this section of the world.");
		this.add("en", "Server_NoSpectatorUse", "Spectators are not allowed to use blocks.");
		this.add("en", "Server_NoUsePrivilege", "Insufficient privileges to use blocks.");
		this.add("en", "Server_PlayerJoin", "Player {0} joins.");
		this.add("en", "Server_PlayerDisconnect", "Player {0} disconnected.");
		this.add("en", "Server_UsernameBanned", "Your username has been banned from this server.{0}");
		this.add("en", "Server_NoGuests", "Guests are not allowed on this server. Login or register an account.");
		this.add("en", "Server_UsernameInvalid", "Invalid username (allowed characters: a-z,A-Z,0-9,-,_; max. length: 16).");
		this.add("en", "Server_PasswordInvalid", "Invalid server password.");
		this.add("en", "Server_ClientException", "Your client threw an exception at server.");
		this.add("en", "Server_IPBanned", "Your IP has been banned from this server.{0}");
		this.add("en", "Server_TooManyPlayers", "Too many players! Try to connect later.");
		this.add("en", "Server_HTTPServerError", "Cannot start HTTP server on TCP port {0}.");
		this.add("en", "Server_HTTPServerStarted", "HTTP server listening on TCP port {0}.");
		this.add("en", "Server_HeartbeatSent", "Heartbeat sent.");
		this.add("en", "Server_HeartbeatError", "Unable to send heartbeat.");
		this.add("en", "Server_BanlistLoaded", "Server banlist loaded.");
		this.add("en", "Server_BanlistCorruptNoBackup", "Banlist corrupt! Created new. COULD NOT BACKUP OLD!");
		this.add("en", "Server_BanlistCorrupt", "Banlist corrupt! Created new. Backup saved as ServerBanlist.txt.old");
		this.add("en", "Server_BanlistNotFound", "Server banlist not found, creating new.");
		this.add("en", "Server_SetupAccept", "y");
		this.add("en", "Server_SetupEnableHTTP", "Dou you want to enable the builtin HTTP server? (Y/N)");
		this.add("en", "Server_SetupMaxClients", "Enter the maximum number of clients (Default: 16)");
		this.add("en", "Server_SetupMaxClientsInvalidValue", "Number may not be negative. Using default (16)");
		this.add("en", "Server_SetupMaxClientsInvalidInput", "Invalid input. Using default (16)");
		this.add("en", "Server_SetupPort", "Enter the port the server shall run on (Default: 25565)");
		this.add("en", "Server_SetupPortInvalidValue", "Out of port range. Using default (25565)");
		this.add("en", "Server_SetupPortInvalidInput", "Invalid input. Using default (25565)");
		this.add("en", "Server_SetupWelcomeMessage", "Enter the welcome message (displayed when joining your server)");
		this.add("en", "Server_SetupMOTD", "Enter the MOTD (displayed on server list)");
		this.add("en", "Server_SetupName", "Please enter the server's name");
		this.add("en", "Server_SetupPublic", "Do you want the server to be public (visible on the server list)? (Y/N)");
		this.add("en", "Server_SetupQuestion", "Would you like to set up some basic parameters? (Y/N)");
		this.add("en", "Server_SetupFirstStart", "It seems this is the first time you started this server.");
		this.add("en", "Server_GameSaved", "Game saved. ({0} seconds)");
		this.add("en", "Server_InvalidBackupName", "Invalid backup filename: ");
		this.add("en", "Server_MonitorConfigLoaded", "Server monitor configuration loaded.");
		this.add("en", "Server_MonitorConfigNotFound", "Server monitor configuration file not found, creating new.");
		this.add("en", "Server_MonitorChatMuted", "Spam protection: {0} has been muted for {1} seconds.");
		this.add("en", "Server_MonitorChatNotSent", "Spam protection: Your message has not been sent.");
		this.add("en", "Server_MonitorBuildingDisabled", "{0} exceeds set block limit.");
		this.add("en", "Server_CommandInvalidArgs", "Invalid arguments. Type /help to see command's usage.");
		this.add("en", "Server_CommandInvalidSpawnPosition", "Invalid spawn position.");
		this.add("en", "Server_CommandNonexistantPlayer", "{0}Player {1} does not exist.");
		this.add("en", "Server_CommandInvalidPosition", "Invalid position.");
		this.add("en", "Server_CommandInsufficientPrivileges", "{0}Insufficient privileges to access this command.");
		this.add("en", "Server_CommandBackupFailed", "{0}Backup could not be created. Check filename.");
		this.add("en", "Server_CommandBackupCreated", "{0}Backup created.");
		this.add("en", "Server_CommandException", "Command exception.");
		this.add("en", "Server_CommandUnknown", "Unknown command /");
		this.add("en", "Server_CommandPlayerNotFound", "{0}Player {1} not found.");
		this.add("en", "Server_CommandPMNoAnswer", "{0}No PM to answer.");
		this.add("en", "Server_CommandGroupNotFound", "{0}Group {1} not found.");
		this.add("en", "Server_CommandTargetGroupSuperior", "{0}The target group is superior your group.");
		this.add("en", "Server_CommandTargetUserSuperior", "{0}Target user is superior or equal.");
		this.add("en", "Server_CommandSetGroupTo", "{0}{1} set group of {2} to {3}.");
		this.add("en", "Server_CommandOpTargetOffline", "{0}Player {1} is offline. Use /chgrp_offline command.");
		this.add("en", "Server_CommandOpTargetOnline", "{0}Player {1} is online. Use /chgrp command.");
		this.add("en", "Server_CommandInvalidGroup", "{0}Invalid group.");
		this.add("en", "Server_CommandSetOfflineGroupTo", "{0}{1} set group of {2} to {3} (offline).");
		this.add("en", "Server_CommandRemoveSuccess", "{0}Client {1} removed from config.");
		this.add("en", "Server_CommandRemoveNotFound", "{0}No entry of client {1} found.");
		this.add("en", "Server_CommandLoginNoPW", "{0}Group {1} doesn't allow password access.");
		this.add("en", "Server_CommandLoginSuccess", "{0}{1} logs in group {2}.");
		this.add("en", "Server_CommandLoginInfo", "Type /help see your available privileges.");
		this.add("en", "Server_CommandLoginInvalidPassword", "{0}Invalid password.");
		this.add("en", "Server_CommandWelcomeChanged", "{0}{1} set new welcome message: {2}");
		this.add("en", "Server_CommandKickBanReason", " Reason: ");
		this.add("en", "Server_CommandKickMessage", "{0}{1} was kicked by {2}.{3}");
		this.add("en", "Server_CommandKickNotification", "You were kicked by an administrator.{0}");
		this.add("en", "Server_CommandNonexistantID", "{0}Player ID {1} does not exist.");
		this.add("en", "Server_CommandBanMessage", "{0}{1} was permanently banned by {2}.{3}");
		this.add("en", "Server_CommandBanNotification", "You were permanently banned by an administrator.{0}");
		this.add("en", "Server_CommandIPBanMessage", "{0}{1} was permanently IP banned by {2}.{3}");
		this.add("en", "Server_CommandIPBanNotification", "You were permanently IP banned by an administrator.{0}");
		this.add("en", "Server_CommandTimeBanMessage", "{0}{1} was banned by {2} for {3} minutes.{4}");
		this.add("en", "Server_CommandTimeBanNotification", "You were banned by an administrator for {0} minutes.{1}");
		this.add("en", "Server_CommandTimeIPBanMessage", "{0}{1} was IP banned by {2} for {3} minutes.{4}");
		this.add("en", "Server_CommandTimeIPBanNotification", "You were IP banned by an administrator for {0} minutes.{1}");
		this.add("en", "Server_CommandTimeBanInvalidValue", "Duration must be greater than 0!");
		this.add("en", "Server_CommandBanOfflineTargetOnline", "{0}Player {1} is online. Use /ban command.");
		this.add("en", "Server_CommandBanOfflineMessage", "{0}{1} (offline) was banned by {2}.{3}");
		this.add("en", "Server_CommandUnbanSuccess", "{0}Player {1} unbanned.");
		this.add("en", "Server_CommandUnbanIPNotFound", "{0}IP {1} not found.");
		this.add("en", "Server_CommandUnbanIPSuccess", "{0}IP {1} unbanned.");
		this.add("en", "Server_CommandGiveAll", "{0}Given all blocks to {1}");
		this.add("en", "Server_CommandGiveSuccess", "{0}Given {1} {2} to {3}.");
		this.add("en", "Server_CommandResetInventorySuccess", "{0}{1}reset inventory of {2}.");
		this.add("en", "Server_CommandResetInventoryOfflineSuccess", "{0}{1}reset inventory of {2} (offline).");
		this.add("en", "Server_CommandMonstersToggle", "{0} turned monsters {1}.");
		this.add("en", "Server_CommandAreaAddIdInUse", "{0}Area ID already in use.");
		this.add("en", "Server_CommandAreaAddSuccess", "{0}New area added: {1}");
		this.add("en", "Server_CommandAreaDeleteNonexistant", "{0}Area does not exist.");
		this.add("en", "Server_CommandAreaDeleteSuccess", "{0}Area deleted.");
		this.add("en", "Server_CommandAnnouncementMessage", "{0}Announcement: {1}");
		this.add("en", "Server_CommandSetSpawnInvalidCoordinates", "{0}Invalid spawn coordinates.");
		this.add("en", "Server_CommandSetSpawnDefaultSuccess", "{0}Default spawn position set to {1},{2},{3}.");
		this.add("en", "Server_CommandSetSpawnGroupSuccess", "{0}Spawn position of group {1} set to {2},{3},{4}.");
		this.add("en", "Server_CommandSetSpawnPlayerSuccess", "{0}Spawn position of player {1} set to {2},{3},{4}.");
		this.add("en", "Server_CommandPrivilegeAddHasAlready", "{0}Player {1} already has privilege {2}.");
		this.add("en", "Server_CommandPrivilegeAddSuccess", "{0}New privilege for {1}: {2}");
		this.add("en", "Server_CommandPrivilegeRemoveNoPriv", "{0}Player {1} doesn't have privilege {2}.");
		this.add("en", "Server_CommandPrivilegeRemoveSuccess", "{0} {1} lost privilege: {2}");
		this.add("en", "Server_CommandRestartSuccess", "{0}{1} restarted server.");
		this.add("en", "Server_CommandShutdownSuccess", "{0}{1} shut down the server.");
		this.add("en", "Server_CommandRestartModsSuccess", "{0}{1} restarted mods.");
		this.add("en", "Server_CommandTeleportInvalidCoordinates", "{0}Invalid coordinates.");
		this.add("en", "Server_CommandTeleportSuccess", "{0}New Position ({1},{2},{3}).");
		this.add("en", "Server_CommandTeleportTargetMessage", "{0}You have been teleported to ({1},{2},{3}) by {4}.");
		this.add("en", "Server_CommandTeleportSourceMessage", "{0}You teleported {1} to ({2},{3},{4}).");
		this.add("en", "Server_CommandFillLimitDefaultSuccess", "{0}Default fill area limit set to {1}.");
		this.add("en", "Server_CommandFillLimitGroupSuccess", "{0}Fill area limit of group {1} set to {2}.");
		this.add("en", "Server_CommandFillLimitPlayerSuccess", "{0}Fill area limit of player {1} set to {2}.");
		this.add("en", "Server_CommandInvalidType", "Invalid type.");
	}

	public final TranslatedString[] allStrings()
	{
		return this.strings;
	}

	public final String autoJumpOption()
	{
		return this.get("AutoJumpOption");
	}

	public final String cannotWriteChatLog()
	{
		return this.get("CannotWriteChatLog");
	}

	public final String chunkUpdates()
	{
		return this.get("ChunkUpdates");
	}

	public final String clientLanguageOption()
	{
		return this.get("ClientLanguageOption");
	}

	public final String connecting()
	{
		return this.get("Connecting");
	}

	public final String connectingProgressKilobytes()
	{
		return this.get("ConnectingProgressKilobytes");
	}

	public final String connectingProgressPercent()
	{
		return this.get("ConnectingProgressPercent");
	}

	private boolean containsTranslation(String language, String id)
	{
		for (int i = 0; i < this.stringsCount; i++) {
			if (this.strings[i] == null) {
				continue;
			}
			if (this.strings[i].language.equals(language)) {
				if (this.strings[i].id.equals(id)) {
					return true;
				}
			}
		}
		return false;
	}

	public final String defaultKeys()
	{
		return this.get("DefaultKeys");
	}

	public final String exit()
	{
		return this.get("Exit");
	}

	public final String fogDistance()
	{
		return this.get("FogDistance");
	}

	public final String fontOption()
	{
		return this.get("FontOption");
	}

	public final String frameRateLagSimulation()
	{
		return this.get("FrameRateLagSimulation");
	}

	public final String frameRateUnlimited()
	{
		return this.get("FrameRateUnlimited");
	}

	public final String frameRateVsync()
	{
		return this.get("FrameRateVsync");
	}

	public final String freemoveNotAllowed()
	{
		return this.get("FreemoveNotAllowed");
	}

	public final String gameName()
	{
		return this.get("GameName");
	}

	public final String get(String id)
	{
		String currentLanguage = "en";
		if (this.overrideLanguage != null) {
			currentLanguage = this.overrideLanguage;
		}
		else if (this.platform != null) {
			currentLanguage = this.platform.getLanguageIso6391();
		}
		for (int i = 0; i < this.stringsCount; i++) {
			if (this.strings[i] == null) {
				continue;
			}
			if (this.strings[i].id.equals(id) && this.strings[i].language.equals(currentLanguage)) {
				return this.strings[i].translated;
			}
		}
		for (int i = 0; i < this.stringsCount; i++) {
			if (this.strings[i] == null) {
				continue;
			}
			if (this.strings[i].id.equals(id) && this.strings[i].language.equals("en")) {
				return this.strings[i].translated;
			}
		}
		return id;
	}

	public final String getUsedLanguage()
	{
		String currentLanguage = "en";
		if (this.overrideLanguage != null) {
			currentLanguage = this.overrideLanguage;
		}
		else if (this.platform != null) {
			currentLanguage = this.platform.getLanguageIso6391();
		}
		return currentLanguage;
	}

	public final String graphics()
	{
		return this.get("Graphics");
	}

	public final String invalidVersionConnectAnyway()
	{
		return this.get("InvalidVersionConnectAnyway");
	}

	public final boolean isNewLanguage(String language)
	{
		for (int i = 0; i < this.loadedLanguagesMax; i++) {
			if (this.loadedLanguages[i] == null) {
				continue;
			}
			if (this.loadedLanguages[i].equals(language)) {
				return false;
			}
		}
		return true;
	}

	public final String keyBlockInfo()
	{
		return this.get("KeyBlockInfo");
	}

	public final String keyChange()
	{
		return this.get("KeyChange");
	}

	public final String keyChat()
	{
		return this.get("KeyChat");
	}

	public final String keyCraft()
	{
		return this.get("KeyCraft");
	}

	public final String keyFreeMove()
	{
		return this.get("KeyFreeMove");
	}

	public final String keyFullscreen()
	{
		return this.get("KeyFullscreen");
	}

	public final String keyJump()
	{
		return this.get("KeyJump");
	}

	public final String keyMoveBack()
	{
		return this.get("KeyMoveBack");
	}

	public final String keyMoveFoward()
	{
		return this.get("KeyMoveFoward");
	}

	public final String keyMoveLeft()
	{
		return this.get("KeyMoveLeft");
	}

	public final String keyMoveRight()
	{
		return this.get("KeyMoveRight");
	}

	public final String keyMoveSpeed()
	{
		return this.get("KeyMoveSpeed");
	}

	public final String keyPlayersList()
	{
		return this.get("KeyPlayersList");
	}

	public final String keyReloadWeapon()
	{
		return this.get("KeyReloadWeapon");
	}

	public final String keyRespawn()
	{
		return this.get("KeyRespawn");
	}

	public final String keyReverseMinecart()
	{
		return this.get("KeyReverseMinecart");
	}

	public final String keyScreenshot()
	{
		return this.get("KeyScreenshot");
	}

	public final String keySetSpawnPosition()
	{
		return this.get("KeySetSpawnPosition");
	}

	public final String keyShowMaterialSelector()
	{
		return this.get("KeyShowMaterialSelector");
	}

	public final String keyTeamChat()
	{
		return this.get("KeyTeamChat");
	}

	public final String keyTextEditor()
	{
		return this.get("KeyTextEditor");
	}

	public final String keyThirdPersonCamera()
	{
		return this.get("KeyThirdPersonCamera");
	}

	public final String keyToggleFogDistance()
	{
		return this.get("KeyToggleFogDistance");
	}

	public final String keyUse()
	{
		return this.get("KeyUse");
	}

	public final String keys()
	{
		return this.get("Keys");
	}

	public final void loadTranslations()
	{
		IntRef fileCount = IntRef.create(0);
		String[] fileList = this.platform.directoryGetFiles(this.platform.pathCombine("data", "localization"), fileCount);
		for (int i = 0; i < fileCount.value; i++) {
			IntRef lineCount = IntRef.create(0);
			String[] lineList = this.platform.fileReadAllLines(fileList[i], lineCount);
			for (int j = 1; j < lineCount.value; j++) {
				if (this.platform.stringEmpty(lineList[j])) {
					continue;
				}
				IntRef splitCount = IntRef.create(0);
				String[] splitList = this.platform.stringSplit(lineList[j], "=", splitCount);
				if (splitCount.value >= 2) {
					this.add(lineList[0], splitList[0], splitList[1]);
				}
			}
		}
		this.addEnglish();
	}

	public final String moveFree()
	{
		return this.get("MoveFree");
	}

	public final String moveFreeNoclip()
	{
		return this.get("MoveFreeNoclip");
	}

	public final String moveNormal()
	{
		return this.get("MoveNormal");
	}

	public final String moveSpeed()
	{
		return this.get("MoveSpeed");
	}

	public final void nextLanguage()
	{
		if (this.overrideLanguage == null) {
			this.overrideLanguage = "en";
		}
		int languageIndex = -1;
		for (int i = 0; i < this.loadedLanguagesMax; i++) {
			if (this.loadedLanguages[i] == null) {
				continue;
			}
			if (this.loadedLanguages[i].equals(this.overrideLanguage)) {
				languageIndex = i;
			}
		}
		if (languageIndex < 0) {
			languageIndex = 0;
		}
		languageIndex++;
		if (languageIndex >= this.loadedLanguagesMax || languageIndex >= this.loadedLanguagesCount) {
			languageIndex = 0;
		}
		this.overrideLanguage = this.loadedLanguages[languageIndex];
	}

	public final String noMaterialsForCrafting()
	{
		return this.get("NoMaterialsForCrafting");
	}

	public final String off()
	{
		return this.get("Off");
	}

	public final String on()
	{
		return this.get("On");
	}

	public final String optionFramerate()
	{
		return this.get("OptionFramerate");
	}

	public final String optionFullscreen()
	{
		return this.get("OptionFullscreen");
	}

	public final String optionResolution()
	{
		return this.get("OptionResolution");
	}

	public final String optionSmoothShadows()
	{
		return this.get("OptionSmoothShadows");
	}

	public final String options()
	{
		return this.get("Options");
	}

	public final String other()
	{
		return this.get("Other");
	}

	public final void override(String language, String id, String translated)
	{
		if (this.isNewLanguage(language)) {
			if (this.loadedLanguagesCount < this.loadedLanguagesMax) {
				this.loadedLanguages[this.loadedLanguagesCount] = language;
				this.loadedLanguagesCount++;
			}
		}
		if (!this.containsTranslation(language, id)) {
			this.add(language, id, translated);
		}
		else {
			int replaceIndex = -1;
			for (int i = 0; i < this.stringsCount; i++) {
				if (this.strings[i] == null) {
					continue;
				}
				if (this.strings[i].language.equals(language)) {
					if (this.strings[i].id.equals(id)) {
						replaceIndex = i;
						break;
					}
				}
			}
			if (replaceIndex != -1) {
				TranslatedString s = new TranslatedString();
				s.language = language;
				s.id = id;
				s.translated = translated;
				this.strings[replaceIndex] = s;
			}
		}
	}
	String overrideLanguage;

	public final String pressToUse()
	{
		return this.get("PressToUse");
	}

	public final String respawn()
	{
		return this.get("Respawn");
	}

	public final String returnToGame()
	{
		return this.get("ReturnToGame");
	}

	public final String returnToMainMenu()
	{
		return this.get("ReturnToMainMenu");
	}

	public final String returnToOptionsMenu()
	{
		return this.get("ReturnToOptionsMenu");
	}

	public final String serverBanlistCorrupt()
	{
		return this.get("Server_BanlistCorrupt");
	}

	public final String serverBanlistCorruptNoBackup()
	{
		return this.get("Server_BanlistCorruptNoBackup");
	}

	public final String serverBanlistLoaded()
	{
		return this.get("Server_BanlistLoaded");
	}

	public final String serverBanlistNotFound()
	{
		return this.get("Server_BanlistNotFound");
	}

	public final String serverCannotWriteLog()
	{
		return this.get("Server_CannotWriteLogFile");
	}

	public final String serverClientConfigGuestGroupNotFound()
	{
		return this.get("Server_ClientConfigGuestGroupNotFound");
	}

	public final String serverClientConfigLoaded()
	{
		return this.get("Server_ClientConfigLoaded");
	}

	public final String serverClientConfigNotFound()
	{
		return this.get("Server_ClientConfigNotFound");
	}

	public final String serverClientConfigRegisteredGroupNotFound()
	{
		return this.get("Server_ClientConfigRegisteredGroupNotFound");
	}

	public final String serverClientException()
	{
		return this.get("Server_ClientException");
	}

	public final String serverConfigCorruptBackup()
	{
		return this.get("Server_ConfigCorruptBackup");
	}

	public final String serverConfigCorruptNoBackup()
	{
		return this.get("Server_ConfigCorruptNoBackup");
	}

	public final String serverConfigLoaded()
	{
		return this.get("Server_ConfigLoaded");
	}

	public final String serverConfigNotFound()
	{
		return this.get("Server_ConfigNotFound");
	}

	public final String serverCreatingSavegame()
	{
		return this.get("Server_CreatingSavegame");
	}

	public final String serverFillAreaInvalid()
	{
		return this.get("Server_FillAreaInvalid");
	}

	public final String serverFillAreaTooLarge()
	{
		return this.get("Server_FillAreaTooLarge");
	}

	public final String serverGameSaved()
	{
		return this.get("Server_GameSaved");
	}

	public final String serverHTTPServerError()
	{
		return this.get("Server_HTTPServerError");
	}

	public final String serverHTTPServerStarted()
	{
		return this.get("Server_HTTPServerStarted");
	}

	public final String serverHeartbeatError()
	{
		return this.get("Server_HeartbeatError");
	}

	public final String serverHeartbeatSent()
	{
		return this.get("Server_HeartbeatSent");
	}

	public final String serverIPBanned()
	{
		return this.get("Server_IPBanned");
	}

	public final String serverInvalidBackupName()
	{
		return this.get("Server_InvalidBackupName");
	}

	public final String serverInvalidSpawnCoordinates()
	{
		return this.get("Server_InvalidSpawnCoordinates");
	}

	public final String serverLoadedSavegame()
	{
		return this.get("Server_LoadedSavegame");
	}

	public final String serverLoadingSavegame()
	{
		return this.get("Server_LoadingSavegame");
	}

	public final String serverMonitorBuildingDisabled()
	{
		return this.get("Server_MonitorBuildingDisabled");
	}

	public final String serverMonitorChatMuted()
	{
		return this.get("Server_MonitorChatMuted");
	}

	public final String serverMonitorChatNotSent()
	{
		return this.get("Server_MonitorChatNotSent");
	}

	public final String serverMonitorConfigLoaded()
	{
		return this.get("Server_MonitorConfigLoaded");
	}

	public final String serverMonitorConfigNotFound()
	{
		return this.get("Server_MonitorConfigNotFound");
	}

	public final String serverNoBuildPermissionHere()
	{
		return this.get("Server_NoBuildPermissionHere");
	}

	public final String serverNoBuildPrivilege()
	{
		return this.get("Server_NoBuildPrivilege");
	}

	public final String serverNoChatPrivilege()
	{
		return this.get("Server_NoChatPrivilege");
	}

	public final String serverNoGuests()
	{
		return this.get("Server_NoGuests");
	}

	public final String serverNoSpectatorBuild()
	{
		return this.get("Server_NoSpectatorBuild");
	}

	public final String serverNoSpectatorUse()
	{
		return this.get("Server_NoSpectatorUse");
	}

	public final String serverNoUsePrivilege()
	{
		return this.get("Server_NoUsePrivilege");
	}

	public final String serverPasswordInvalid()
	{
		return this.get("Server_PasswordInvalid");
	}

	public final String serverPlayerDisconnect()
	{
		return this.get("Server_PlayerDisconnect");
	}

	public final String serverPlayerJoin()
	{
		return this.get("Server_PlayerJoin");
	}

	public final String serverProgressDownloadingData()
	{
		return this.get("Server_ProgressDownloadingData");
	}

	public final String serverProgressDownloadingMap()
	{
		return this.get("Server_ProgressDownloadingMap");
	}

	public final String serverProgressGenerating()
	{
		return this.get("Server_ProgressGenerating");
	}

	public final String serverSetupAccept()
	{
		return this.get("Server_SetupAccept");
	}

	public final String serverSetupEnableHTTP()
	{
		return this.get("Server_SetupEnableHTTP");
	}

	public final String serverSetupFirstStart()
	{
		return this.get("Server_SetupFirstStart");
	}

	public final String serverSetupMOTD()
	{
		return this.get("Server_SetupMOTD");
	}

	public final String serverSetupMaxClients()
	{
		return this.get("Server_SetupMaxClients");
	}

	public final String serverSetupMaxClientsInvalidInput()
	{
		return this.get("Server_SetupMaxClientsInvalidInput");
	}

	public final String serverSetupMaxClientsInvalidValue()
	{
		return this.get("Server_SetupMaxClientsInvalidValue");
	}

	public final String serverSetupName()
	{
		return this.get("Server_SetupName");
	}

	public final String serverSetupPort()
	{
		return this.get("Server_SetupPort");
	}

	public final String serverSetupPortInvalidInput()
	{
		return this.get("Server_SetupPortInvalidInput");
	}

	public final String serverSetupPortInvalidValue()
	{
		return this.get("Server_SetupPortInvalidValue");
	}

	public final String serverSetupPublic()
	{
		return this.get("Server_SetupPublic");
	}

	public final String serverSetupQuestion()
	{
		return this.get("Server_SetupQuestion");
	}

	public final String serverSetupWelcomeMessage()
	{
		return this.get("Server_SetupWelcomeMessage");
	}

	public final String serverTooManyPlayers()
	{
		return this.get("Server_TooManyPlayers");
	}

	public final String serverUsernameBanned()
	{
		return this.get("Server_UsernameBanned");
	}

	public final String serverUsernameInvalid()
	{
		return this.get("Server_UsernameInvalid");
	}

	public final String shadowsOption()
	{
		return this.get("ShadowsOption");
	}

	public final String soundOption()
	{
		return this.get("SoundOption");
	}

	public final String spawnPositionSet()
	{
		return this.get("SpawnPositionSet");
	}

	public final String spawnPositionSetTo()
	{
		return this.get("SpawnPositionSetTo");
	}

	public final String triangles()
	{
		return this.get("Triangles");
	}

	public final String useServerTexturesOption()
	{
		return this.get("UseServerTexturesOption");
	}

	public final String viewDistanceOption()
	{
		return this.get("ViewDistanceOption");
	}
	String[] loadedLanguages;
	int loadedLanguagesCount;
	int loadedLanguagesMax;
	GamePlatform platform;
	private TranslatedString[] strings;
	private int stringsCount;
	private int stringsMax;
}
