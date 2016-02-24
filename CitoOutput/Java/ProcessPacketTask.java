// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class ProcessPacketTask extends Action_
{

	private boolean contains(String[] arr, int arrLength, String value)
	{
		return this.indexOf(arr, arrLength, value) != -1;
	}

	private int indexOf(String[] arr, int arrLength, String value)
	{
		for (int i = 0; i < arrLength; i++) {
			if (Game.stringEquals(arr[i], value)) {
				return i;
			}
		}
		return -1;
	}

	final void processPacket(Packet_Server packet)
	{
		if (this.game.packetHandlers[packet.id] != null) {
			this.game.packetHandlers[packet.id].handle(this.game, packet);
		}
		switch (packet.id) {
		case 0:
			{
				String invalidversionstr = this.game.language.invalidVersionConnectAnyway();
				this.game.serverGameVersion = packet.identification.mdProtocolVersion;
				if (!this.game.serverGameVersion.equals(this.game.platform.getGameVersion())) {
					this.game.chatLog("[GAME] Different game versions");
					String q = this.game.platform.stringFormat2(invalidversionstr, this.game.platform.getGameVersion(), this.game.serverGameVersion);
					this.game.invalidVersionDrawMessage = q;
					this.game.invalidVersionPacketIdentification = packet;
				}
				else {
					this.game.processServerIdentification(packet);
				}
				this.game.receivedMapLength = 0;
			}
			break;
		case 1:
			{
				this.game.sendPingReply();
				this.game.serverInfo.serverPing.send(this.game.platform);
			}
			break;
		case 111:
			{
				this.game.serverInfo.serverPing.receive(this.game.platform);
			}
			break;
		case 2:
			{
				this.game.chatLog("[GAME] Initialized map loading");
				this.game.receivedMapLength = 0;
				this.game.invokeMapLoadingProgress(0, 0, this.game.language.connecting());
			}
			break;
		case 3:
			{
				this.game.invokeMapLoadingProgress(packet.levelDataChunk.percentComplete, this.game.receivedMapLength, packet.levelDataChunk.status);
			}
			break;
		case 4:
			{
				this.game.chatLog("[GAME] Finished map loading");
			}
			break;
		case 6:
			{
				int x = packet.setBlock.x;
				int y = packet.setBlock.y;
				int z = packet.setBlock.z;
				int type = packet.setBlock.blockType;
				{
					this.game.setTileAndUpdate(x, y, z, type);
				}
			}
			break;
		case 61:
			{
				int ax = packet.fillArea.x1;
				int ay = packet.fillArea.y1;
				int az = packet.fillArea.z1;
				int bx = packet.fillArea.x2;
				int by = packet.fillArea.y2;
				int bz = packet.fillArea.z2;
				int startx = MathCi.minInt(ax, bx);
				int endx = MathCi.maxInt(ax, bx);
				int starty = MathCi.minInt(ay, by);
				int endy = MathCi.maxInt(ay, by);
				int startz = MathCi.minInt(az, bz);
				int endz = MathCi.maxInt(az, bz);
				int blockCount = packet.fillArea.blockCount;
				{
					for (int x = startx; x <= endx; x++) {
						for (int y = starty; y <= endy; y++) {
							for (int z = startz; z <= endz; z++) {
								if (blockCount == 0) {
									return;
								}
								{
									this.game.setTileAndUpdate(x, y, z, packet.fillArea.blockType);
								}
								blockCount--;
							}
						}
					}
				}
			}
			break;
		case 62:
			{
				this.game.fillAreaLimit = packet.fillAreaLimit.limit;
				if (this.game.fillAreaLimit > 100000) {
					this.game.fillAreaLimit = 100000;
				}
			}
			break;
		case 51:
			{
				this.game.allowFreemove = packet.freemove.isEnabled != 0;
				if (!this.game.allowFreemove) {
					this.game.controls.setFreemove(0);
					this.game.movespeed = this.game.basemovespeed;
					this.game.log(this.game.language.moveNormal());
				}
			}
			break;
		case 26:
			{
				int x = packet.playerSpawnPosition.x;
				int y = packet.playerSpawnPosition.y;
				int z = packet.playerSpawnPosition.z;
				this.game.playerPositionSpawnX = x;
				this.game.playerPositionSpawnY = z;
				this.game.playerPositionSpawnZ = y;
				this.game.log(this.game.platform.stringFormat(this.game.language.spawnPositionSetTo(), this.game.platform.stringFormat3("{0},{1},{2}", this.game.platform.intToString(x), this.game.platform.intToString(y), this.game.platform.intToString(z))));
			}
			break;
		case 13:
			{
				this.game.addChatline(packet.message.message);
				this.game.chatLog(packet.message.message);
			}
			break;
		case 14:
			{
				this.game.chatLog(this.game.platform.stringFormat("[GAME] Disconnected by the server ({0})", packet.disconnectPlayer.disconnectReason));
				if (this.game.platform.isMousePointerLocked()) {
					this.game.platform.exitMousePointerLock();
				}
				this.game.platform.messageBoxShowError(packet.disconnectPlayer.disconnectReason, "Disconnected from server");
				this.game.exitToMainMenu_();
				break;
			}
		case 23:
			{
				Packet_ServerPlayerStats p = packet.playerStats;
				this.game.playerStats = p;
			}
			break;
		case 16:
			{
				if (packet.inventory.inventory != null) {
					this.game.useInventory(packet.inventory.inventory);
				}
			}
			break;
		case 17:
			{
				packet.season.hour -= 1;
				if (packet.season.hour < 0) {
					packet.season.hour = 48;
				}
				int sunlight = this.game.nightLevels[packet.season.hour];
				this.game.skySphereNight = sunlight < 8;
				this.game.d_SunMoonRenderer.day_length_in_seconds = 86400 / packet.season.dayNightCycleSpeedup;
				int hour = packet.season.hour / 4;
				if (this.game.d_SunMoonRenderer.getHour() != hour) {
					this.game.d_SunMoonRenderer.setHour(hour);
				}
				if (this.game.sunlight_ != sunlight) {
					this.game.sunlight_ = sunlight;
					this.game.redrawAllBlocks();
				}
			}
			break;
		case 18:
			{
				this.game.blobdownload = new CitoMemoryStream();
				this.game.blobdownloadname = packet.blobInitialize.name;
				this.game.blobdownloadmd5 = packet.blobInitialize.md5;
			}
			break;
		case 19:
			{
				int length = this.game.platform.byteArrayLength(packet.blobPart.data);
				this.game.blobdownload.write(packet.blobPart.data, 0, length);
				this.game.receivedMapLength += length;
			}
			break;
		case 20:
			{
				byte[] downloaded = this.game.blobdownload.toArray();
				if (this.game.blobdownloadname != null) {
					this.game.setFile(this.game.blobdownloadname, this.game.blobdownloadmd5, downloaded, this.game.blobdownload.length());
				}
				this.game.blobdownload = null;
			}
			break;
		case 22:
			{
				this.game.playSoundAt(packet.sound.name, packet.sound.x, packet.sound.y, packet.sound.z);
			}
			break;
		case 50:
			{
				for (int i = 128; i < 256; i++) {
					this.game.entities[i] = null;
				}
			}
			break;
		case 60:
			this.game.language.override(packet.translation.lang, packet.translation.id, packet.translation.translation);
			break;
		case 56:
			this.game.newBlockTypes[packet.blockType.id] = packet.blockType.blocktype;
			break;
		case 28:
			this.game.nightLevels = packet.sunLevels.sunlevels;
			break;
		case 29:
			for (int i = 0; i < packet.lightLevels.lightlevelsCount; i++) {
				this.game.mLightLevels[i] = this.game.deserializeFloat(packet.lightLevels.lightlevels[i]);
			}
			break;
		case 53:
			IntRef oldFollowId = this.game.followId();
			this.game.follow = packet.follow.client;
			if (packet.follow.tpp != 0) {
				this.game.setCamera(CameraType.OVERHEAD);
				this.game.player.position.rotx = Game.getPi();
				this.game.guiStateBackToGame();
			}
			else {
				this.game.setCamera(CameraType.FPP);
			}
			break;
		case 54:
			this.game.entityAddLocal(this.game.createBulletEntity(this.game.deserializeFloat(packet.bullet.fromXFloat), this.game.deserializeFloat(packet.bullet.fromYFloat), this.game.deserializeFloat(packet.bullet.fromZFloat), this.game.deserializeFloat(packet.bullet.toXFloat), this.game.deserializeFloat(packet.bullet.toYFloat), this.game.deserializeFloat(packet.bullet.toZFloat), this.game.deserializeFloat(packet.bullet.speedFloat)));
			break;
		case 55:
			if (!this.game.ammostarted) {
				this.game.ammostarted = true;
				for (int i = 0; i < packet.ammo.totalAmmoCount; i++) {
					Packet_IntInt k = packet.ammo.totalAmmo[i];
					this.game.loadedAmmo[k.key_] = MathCi.minInt(k.value_, this.game.blocktypes[k.key_].ammoMagazine);
				}
			}
			this.game.totalAmmo = new int[1024];
			for (int i = 0; i < packet.ammo.totalAmmoCount; i++) {
				this.game.totalAmmo[packet.ammo.totalAmmo[i].key_] = packet.ammo.totalAmmo[i].value_;
			}
			break;
		case 58:
			{
				Entity entity = new Entity();
				entity.expires = new Expires();
				entity.expires.timeLeft = this.game.deserializeFloat(packet.explosion.timeFloat);
				entity.push = packet.explosion;
				this.game.entityAddLocal(entity);
			}
			break;
		case 59:
			{
				Entity entity = new Entity();
				Sprite sprite = new Sprite();
				sprite.image = "ChemicalGreen.png";
				sprite.size = 14;
				sprite.animationcount = 0;
				sprite.positionX = this.game.deserializeFloat(packet.projectile.fromXFloat);
				sprite.positionY = this.game.deserializeFloat(packet.projectile.fromYFloat);
				sprite.positionZ = this.game.deserializeFloat(packet.projectile.fromZFloat);
				entity.sprite = sprite;
				Grenade_ grenade = new Grenade_();
				grenade.velocityX = this.game.deserializeFloat(packet.projectile.velocityXFloat);
				grenade.velocityY = this.game.deserializeFloat(packet.projectile.velocityYFloat);
				grenade.velocityZ = this.game.deserializeFloat(packet.projectile.velocityZFloat);
				grenade.block = packet.projectile.blockId;
				grenade.sourcePlayer = packet.projectile.sourcePlayerID;
				entity.grenade = grenade;
				entity.expires = Expires.create(this.game.deserializeFloat(packet.projectile.explodesAfterFloat));
				this.game.entityAddLocal(entity);
			}
			break;
		case 27:
			this.game.blocktypes = this.game.newBlockTypes;
			this.game.newBlockTypes = new Packet_BlockType[1024];
			int textureInAtlasIdsCount = 1024;
			String[] textureInAtlasIds = new String[textureInAtlasIdsCount];
			int lastTextureId = 0;
			for (int i = 0; i < 1024; i++) {
				if (this.game.blocktypes[i] != null) {
					String[] to_load = new String[7];
					int to_loadLength = 7;
					{
						to_load[0] = this.game.blocktypes[i].textureIdLeft;
						to_load[1] = this.game.blocktypes[i].textureIdRight;
						to_load[2] = this.game.blocktypes[i].textureIdFront;
						to_load[3] = this.game.blocktypes[i].textureIdBack;
						to_load[4] = this.game.blocktypes[i].textureIdTop;
						to_load[5] = this.game.blocktypes[i].textureIdBottom;
						to_load[6] = this.game.blocktypes[i].textureIdForInventory;
					}
					for (int k = 0; k < to_loadLength; k++) {
						if (!this.contains(textureInAtlasIds, textureInAtlasIdsCount, to_load[k])) {
							textureInAtlasIds[lastTextureId++] = to_load[k];
						}
					}
				}
			}
			this.game.d_Data.useBlockTypes(this.game.platform, this.game.blocktypes, 1024);
			for (int i = 0; i < 1024; i++) {
				Packet_BlockType b = this.game.blocktypes[i];
				if (b == null) {
					continue;
				}
				if (textureInAtlasIds != null) {
					this.game.textureId[i][0] = this.indexOf(textureInAtlasIds, textureInAtlasIdsCount, b.textureIdTop);
					this.game.textureId[i][1] = this.indexOf(textureInAtlasIds, textureInAtlasIdsCount, b.textureIdBottom);
					this.game.textureId[i][2] = this.indexOf(textureInAtlasIds, textureInAtlasIdsCount, b.textureIdFront);
					this.game.textureId[i][3] = this.indexOf(textureInAtlasIds, textureInAtlasIdsCount, b.textureIdBack);
					this.game.textureId[i][4] = this.indexOf(textureInAtlasIds, textureInAtlasIdsCount, b.textureIdLeft);
					this.game.textureId[i][5] = this.indexOf(textureInAtlasIds, textureInAtlasIdsCount, b.textureIdRight);
					this.game.textureIdForInventory[i] = this.indexOf(textureInAtlasIds, textureInAtlasIdsCount, b.textureIdForInventory);
				}
			}
			this.game.useTerrainTextures(textureInAtlasIds, textureInAtlasIdsCount);
			this.game.handRedraw = true;
			this.game.redrawAllBlocks();
			break;
		case 65:
			this.game.chatLog("[GAME] Received server redirect");
			this.game.sendLeave(0);
			this.game.exitAndSwitchServer(packet.redirect);
			break;
		}
	}

	@Override
	public void run()
	{
		this.processPacket(this.packet_);
	}
	Game game;
	Packet_Server packet_;
}
