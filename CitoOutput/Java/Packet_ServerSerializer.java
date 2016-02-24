// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class Packet_ServerSerializer
{

	/**
	 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
	 */
	public static Packet_Server deserialize(CitoStream stream, Packet_Server instance)
	{
		instance.id = 0;
		while (true) {
			int keyByte = stream.readByte();
			if (keyByte == -1)
				break;
			switch (keyByte) {
			case 10:
				if (instance.identification == null)
					instance.identification = Packet_ServerIdentificationSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerIdentificationSerializer.deserializeLengthDelimited(stream, instance.identification);
				continue;
			case 18:
				if (instance.levelInitialize == null)
					instance.levelInitialize = Packet_ServerLevelInitializeSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerLevelInitializeSerializer.deserializeLengthDelimited(stream, instance.levelInitialize);
				continue;
			case 26:
				if (instance.levelDataChunk == null)
					instance.levelDataChunk = Packet_ServerLevelProgressSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerLevelProgressSerializer.deserializeLengthDelimited(stream, instance.levelDataChunk);
				continue;
			case 34:
				if (instance.levelFinalize == null)
					instance.levelFinalize = Packet_ServerLevelFinalizeSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerLevelFinalizeSerializer.deserializeLengthDelimited(stream, instance.levelFinalize);
				continue;
			case 42:
				if (instance.setBlock == null)
					instance.setBlock = Packet_ServerSetBlockSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerSetBlockSerializer.deserializeLengthDelimited(stream, instance.setBlock);
				continue;
			case 74:
				if (instance.message == null)
					instance.message = Packet_ServerMessageSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerMessageSerializer.deserializeLengthDelimited(stream, instance.message);
				continue;
			case 82:
				if (instance.disconnectPlayer == null)
					instance.disconnectPlayer = Packet_ServerDisconnectPlayerSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerDisconnectPlayerSerializer.deserializeLengthDelimited(stream, instance.disconnectPlayer);
				continue;
			case 90:
				if (instance.chunk_ == null)
					instance.chunk_ = Packet_ServerChunkSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerChunkSerializer.deserializeLengthDelimited(stream, instance.chunk_);
				continue;
			case 98:
				if (instance.inventory == null)
					instance.inventory = Packet_ServerInventorySerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerInventorySerializer.deserializeLengthDelimited(stream, instance.inventory);
				continue;
			case 106:
				if (instance.season == null)
					instance.season = Packet_ServerSeasonSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerSeasonSerializer.deserializeLengthDelimited(stream, instance.season);
				continue;
			case 114:
				if (instance.blobInitialize == null)
					instance.blobInitialize = Packet_ServerBlobInitializeSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerBlobInitializeSerializer.deserializeLengthDelimited(stream, instance.blobInitialize);
				continue;
			case 122:
				if (instance.blobPart == null)
					instance.blobPart = Packet_ServerBlobPartSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerBlobPartSerializer.deserializeLengthDelimited(stream, instance.blobPart);
				continue;
			default:
				break;
			}
			Key key = ProtocolParser.readKey_((byte) keyByte, stream);
			switch (key.getField()) {
			case 0:
				return null;
			case 90:
				if (key.getWireType() != 0)
					break;
				instance.id = ProtocolParser.readUInt64(stream);
				continue;
			case 51:
				if (key.getWireType() != 2)
					break;
				if (instance.fillArea == null)
					instance.fillArea = Packet_ServerFillAreaSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerFillAreaSerializer.deserializeLengthDelimited(stream, instance.fillArea);
				continue;
			case 52:
				if (key.getWireType() != 2)
					break;
				if (instance.fillAreaLimit == null)
					instance.fillAreaLimit = Packet_ServerFillAreaLimitSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerFillAreaLimitSerializer.deserializeLengthDelimited(stream, instance.fillAreaLimit);
				continue;
			case 53:
				if (key.getWireType() != 2)
					break;
				if (instance.freemove == null)
					instance.freemove = Packet_ServerFreemoveSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerFreemoveSerializer.deserializeLengthDelimited(stream, instance.freemove);
				continue;
			case 16:
				if (key.getWireType() != 2)
					break;
				if (instance.blobFinalize == null)
					instance.blobFinalize = Packet_ServerBlobFinalizeSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerBlobFinalizeSerializer.deserializeLengthDelimited(stream, instance.blobFinalize);
				continue;
			case 17:
				if (key.getWireType() != 2)
					break;
				if (instance.heightmapChunk == null)
					instance.heightmapChunk = Packet_ServerHeightmapChunkSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerHeightmapChunkSerializer.deserializeLengthDelimited(stream, instance.heightmapChunk);
				continue;
			case 18:
				if (key.getWireType() != 2)
					break;
				if (instance.ping == null)
					instance.ping = Packet_ServerPingSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerPingSerializer.deserializeLengthDelimited(stream, instance.ping);
				continue;
			case 181:
				if (key.getWireType() != 2)
					break;
				if (instance.playerPing == null)
					instance.playerPing = Packet_ServerPlayerPingSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerPlayerPingSerializer.deserializeLengthDelimited(stream, instance.playerPing);
				continue;
			case 19:
				if (key.getWireType() != 2)
					break;
				if (instance.sound == null)
					instance.sound = Packet_ServerSoundSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerSoundSerializer.deserializeLengthDelimited(stream, instance.sound);
				continue;
			case 20:
				if (key.getWireType() != 2)
					break;
				if (instance.playerStats == null)
					instance.playerStats = Packet_ServerPlayerStatsSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerPlayerStatsSerializer.deserializeLengthDelimited(stream, instance.playerStats);
				continue;
			case 21:
				if (key.getWireType() != 2)
					break;
				if (instance.monster == null)
					instance.monster = Packet_ServerMonstersSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerMonstersSerializer.deserializeLengthDelimited(stream, instance.monster);
				continue;
			case 22:
				if (key.getWireType() != 2)
					break;
				if (instance.playerSpawnPosition == null)
					instance.playerSpawnPosition = Packet_ServerPlayerSpawnPositionSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerPlayerSpawnPositionSerializer.deserializeLengthDelimited(stream, instance.playerSpawnPosition);
				continue;
			case 23:
				if (key.getWireType() != 2)
					break;
				if (instance.blockTypes == null)
					instance.blockTypes = Packet_ServerBlockTypesSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerBlockTypesSerializer.deserializeLengthDelimited(stream, instance.blockTypes);
				continue;
			case 24:
				if (key.getWireType() != 2)
					break;
				if (instance.sunLevels == null)
					instance.sunLevels = Packet_ServerSunLevelsSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerSunLevelsSerializer.deserializeLengthDelimited(stream, instance.sunLevels);
				continue;
			case 25:
				if (key.getWireType() != 2)
					break;
				if (instance.lightLevels == null)
					instance.lightLevels = Packet_ServerLightLevelsSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerLightLevelsSerializer.deserializeLengthDelimited(stream, instance.lightLevels);
				continue;
			case 26:
				if (key.getWireType() != 2)
					break;
				if (instance.craftingRecipes == null)
					instance.craftingRecipes = Packet_ServerCraftingRecipesSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerCraftingRecipesSerializer.deserializeLengthDelimited(stream, instance.craftingRecipes);
				continue;
			case 27:
				if (key.getWireType() != 2)
					break;
				if (instance.dialog == null)
					instance.dialog = Packet_ServerDialogSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerDialogSerializer.deserializeLengthDelimited(stream, instance.dialog);
				continue;
			case 28:
				if (key.getWireType() != 2)
					break;
				if (instance.follow == null)
					instance.follow = Packet_ServerFollowSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerFollowSerializer.deserializeLengthDelimited(stream, instance.follow);
				continue;
			case 29:
				if (key.getWireType() != 2)
					break;
				if (instance.bullet == null)
					instance.bullet = Packet_ServerBulletSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerBulletSerializer.deserializeLengthDelimited(stream, instance.bullet);
				continue;
			case 30:
				if (key.getWireType() != 2)
					break;
				if (instance.ammo == null)
					instance.ammo = Packet_ServerAmmoSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerAmmoSerializer.deserializeLengthDelimited(stream, instance.ammo);
				continue;
			case 31:
				if (key.getWireType() != 2)
					break;
				if (instance.blockType == null)
					instance.blockType = Packet_ServerBlockTypeSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerBlockTypeSerializer.deserializeLengthDelimited(stream, instance.blockType);
				continue;
			case 32:
				if (key.getWireType() != 2)
					break;
				if (instance.chunkPart == null)
					instance.chunkPart = Packet_ServerChunkPartSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerChunkPartSerializer.deserializeLengthDelimited(stream, instance.chunkPart);
				continue;
			case 33:
				if (key.getWireType() != 2)
					break;
				if (instance.explosion == null)
					instance.explosion = Packet_ServerExplosionSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerExplosionSerializer.deserializeLengthDelimited(stream, instance.explosion);
				continue;
			case 34:
				if (key.getWireType() != 2)
					break;
				if (instance.projectile == null)
					instance.projectile = Packet_ServerProjectileSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerProjectileSerializer.deserializeLengthDelimited(stream, instance.projectile);
				continue;
			case 35:
				if (key.getWireType() != 2)
					break;
				if (instance.translation == null)
					instance.translation = Packet_ServerTranslatedStringSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerTranslatedStringSerializer.deserializeLengthDelimited(stream, instance.translation);
				continue;
			case 36:
				if (key.getWireType() != 2)
					break;
				if (instance.queryAnswer == null)
					instance.queryAnswer = Packet_ServerQueryAnswerSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerQueryAnswerSerializer.deserializeLengthDelimited(stream, instance.queryAnswer);
				continue;
			case 37:
				if (key.getWireType() != 2)
					break;
				if (instance.redirect == null)
					instance.redirect = Packet_ServerRedirectSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerRedirectSerializer.deserializeLengthDelimited(stream, instance.redirect);
				continue;
			case 39:
				if (key.getWireType() != 2)
					break;
				if (instance.entitySpawn == null)
					instance.entitySpawn = Packet_ServerEntitySpawnSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerEntitySpawnSerializer.deserializeLengthDelimited(stream, instance.entitySpawn);
				continue;
			case 40:
				if (key.getWireType() != 2)
					break;
				if (instance.entityPosition == null)
					instance.entityPosition = Packet_ServerEntityPositionAndOrientationSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerEntityPositionAndOrientationSerializer.deserializeLengthDelimited(stream, instance.entityPosition);
				continue;
			case 41:
				if (key.getWireType() != 2)
					break;
				if (instance.entityDespawn == null)
					instance.entityDespawn = Packet_ServerEntityDespawnSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerEntityDespawnSerializer.deserializeLengthDelimited(stream, instance.entityDespawn);
				continue;
			default:
				ProtocolParser.skipKey(stream, key);
				break;
			}
		}
		return instance;
	}

	/**
	 * &lt;summary&gt;Helper: put the buffer into a MemoryStream before deserializing&lt;/summary&gt;
	 */
	public static Packet_Server deserializeBuffer(byte[] buffer, int length, Packet_Server instance)
	{
		CitoMemoryStream ms = CitoMemoryStream.create(buffer, length);
		Packet_ServerSerializer.deserialize(ms, instance);
		return instance;
	}

	/**
	 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
	 */
	public static Packet_Server deserializeLength(CitoStream stream, int length, Packet_Server instance)
	{
		instance.id = 0;
		int limit = stream.position() + length;
		while (true) {
			if (stream.position() >= limit) {
				if (stream.position() == limit)
					break;
				else
					return null;
			}
			int keyByte = stream.readByte();
			if (keyByte == -1)
				return null;
			switch (keyByte) {
			case 10:
				if (instance.identification == null)
					instance.identification = Packet_ServerIdentificationSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerIdentificationSerializer.deserializeLengthDelimited(stream, instance.identification);
				continue;
			case 18:
				if (instance.levelInitialize == null)
					instance.levelInitialize = Packet_ServerLevelInitializeSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerLevelInitializeSerializer.deserializeLengthDelimited(stream, instance.levelInitialize);
				continue;
			case 26:
				if (instance.levelDataChunk == null)
					instance.levelDataChunk = Packet_ServerLevelProgressSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerLevelProgressSerializer.deserializeLengthDelimited(stream, instance.levelDataChunk);
				continue;
			case 34:
				if (instance.levelFinalize == null)
					instance.levelFinalize = Packet_ServerLevelFinalizeSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerLevelFinalizeSerializer.deserializeLengthDelimited(stream, instance.levelFinalize);
				continue;
			case 42:
				if (instance.setBlock == null)
					instance.setBlock = Packet_ServerSetBlockSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerSetBlockSerializer.deserializeLengthDelimited(stream, instance.setBlock);
				continue;
			case 74:
				if (instance.message == null)
					instance.message = Packet_ServerMessageSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerMessageSerializer.deserializeLengthDelimited(stream, instance.message);
				continue;
			case 82:
				if (instance.disconnectPlayer == null)
					instance.disconnectPlayer = Packet_ServerDisconnectPlayerSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerDisconnectPlayerSerializer.deserializeLengthDelimited(stream, instance.disconnectPlayer);
				continue;
			case 90:
				if (instance.chunk_ == null)
					instance.chunk_ = Packet_ServerChunkSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerChunkSerializer.deserializeLengthDelimited(stream, instance.chunk_);
				continue;
			case 98:
				if (instance.inventory == null)
					instance.inventory = Packet_ServerInventorySerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerInventorySerializer.deserializeLengthDelimited(stream, instance.inventory);
				continue;
			case 106:
				if (instance.season == null)
					instance.season = Packet_ServerSeasonSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerSeasonSerializer.deserializeLengthDelimited(stream, instance.season);
				continue;
			case 114:
				if (instance.blobInitialize == null)
					instance.blobInitialize = Packet_ServerBlobInitializeSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerBlobInitializeSerializer.deserializeLengthDelimited(stream, instance.blobInitialize);
				continue;
			case 122:
				if (instance.blobPart == null)
					instance.blobPart = Packet_ServerBlobPartSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerBlobPartSerializer.deserializeLengthDelimited(stream, instance.blobPart);
				continue;
			default:
				break;
			}
			Key key = ProtocolParser.readKey_((byte) keyByte, stream);
			switch (key.getField()) {
			case 0:
				return null;
			case 90:
				if (key.getWireType() != 0)
					break;
				instance.id = ProtocolParser.readUInt64(stream);
				continue;
			case 51:
				if (key.getWireType() != 2)
					break;
				if (instance.fillArea == null)
					instance.fillArea = Packet_ServerFillAreaSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerFillAreaSerializer.deserializeLengthDelimited(stream, instance.fillArea);
				continue;
			case 52:
				if (key.getWireType() != 2)
					break;
				if (instance.fillAreaLimit == null)
					instance.fillAreaLimit = Packet_ServerFillAreaLimitSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerFillAreaLimitSerializer.deserializeLengthDelimited(stream, instance.fillAreaLimit);
				continue;
			case 53:
				if (key.getWireType() != 2)
					break;
				if (instance.freemove == null)
					instance.freemove = Packet_ServerFreemoveSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerFreemoveSerializer.deserializeLengthDelimited(stream, instance.freemove);
				continue;
			case 16:
				if (key.getWireType() != 2)
					break;
				if (instance.blobFinalize == null)
					instance.blobFinalize = Packet_ServerBlobFinalizeSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerBlobFinalizeSerializer.deserializeLengthDelimited(stream, instance.blobFinalize);
				continue;
			case 17:
				if (key.getWireType() != 2)
					break;
				if (instance.heightmapChunk == null)
					instance.heightmapChunk = Packet_ServerHeightmapChunkSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerHeightmapChunkSerializer.deserializeLengthDelimited(stream, instance.heightmapChunk);
				continue;
			case 18:
				if (key.getWireType() != 2)
					break;
				if (instance.ping == null)
					instance.ping = Packet_ServerPingSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerPingSerializer.deserializeLengthDelimited(stream, instance.ping);
				continue;
			case 181:
				if (key.getWireType() != 2)
					break;
				if (instance.playerPing == null)
					instance.playerPing = Packet_ServerPlayerPingSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerPlayerPingSerializer.deserializeLengthDelimited(stream, instance.playerPing);
				continue;
			case 19:
				if (key.getWireType() != 2)
					break;
				if (instance.sound == null)
					instance.sound = Packet_ServerSoundSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerSoundSerializer.deserializeLengthDelimited(stream, instance.sound);
				continue;
			case 20:
				if (key.getWireType() != 2)
					break;
				if (instance.playerStats == null)
					instance.playerStats = Packet_ServerPlayerStatsSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerPlayerStatsSerializer.deserializeLengthDelimited(stream, instance.playerStats);
				continue;
			case 21:
				if (key.getWireType() != 2)
					break;
				if (instance.monster == null)
					instance.monster = Packet_ServerMonstersSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerMonstersSerializer.deserializeLengthDelimited(stream, instance.monster);
				continue;
			case 22:
				if (key.getWireType() != 2)
					break;
				if (instance.playerSpawnPosition == null)
					instance.playerSpawnPosition = Packet_ServerPlayerSpawnPositionSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerPlayerSpawnPositionSerializer.deserializeLengthDelimited(stream, instance.playerSpawnPosition);
				continue;
			case 23:
				if (key.getWireType() != 2)
					break;
				if (instance.blockTypes == null)
					instance.blockTypes = Packet_ServerBlockTypesSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerBlockTypesSerializer.deserializeLengthDelimited(stream, instance.blockTypes);
				continue;
			case 24:
				if (key.getWireType() != 2)
					break;
				if (instance.sunLevels == null)
					instance.sunLevels = Packet_ServerSunLevelsSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerSunLevelsSerializer.deserializeLengthDelimited(stream, instance.sunLevels);
				continue;
			case 25:
				if (key.getWireType() != 2)
					break;
				if (instance.lightLevels == null)
					instance.lightLevels = Packet_ServerLightLevelsSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerLightLevelsSerializer.deserializeLengthDelimited(stream, instance.lightLevels);
				continue;
			case 26:
				if (key.getWireType() != 2)
					break;
				if (instance.craftingRecipes == null)
					instance.craftingRecipes = Packet_ServerCraftingRecipesSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerCraftingRecipesSerializer.deserializeLengthDelimited(stream, instance.craftingRecipes);
				continue;
			case 27:
				if (key.getWireType() != 2)
					break;
				if (instance.dialog == null)
					instance.dialog = Packet_ServerDialogSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerDialogSerializer.deserializeLengthDelimited(stream, instance.dialog);
				continue;
			case 28:
				if (key.getWireType() != 2)
					break;
				if (instance.follow == null)
					instance.follow = Packet_ServerFollowSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerFollowSerializer.deserializeLengthDelimited(stream, instance.follow);
				continue;
			case 29:
				if (key.getWireType() != 2)
					break;
				if (instance.bullet == null)
					instance.bullet = Packet_ServerBulletSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerBulletSerializer.deserializeLengthDelimited(stream, instance.bullet);
				continue;
			case 30:
				if (key.getWireType() != 2)
					break;
				if (instance.ammo == null)
					instance.ammo = Packet_ServerAmmoSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerAmmoSerializer.deserializeLengthDelimited(stream, instance.ammo);
				continue;
			case 31:
				if (key.getWireType() != 2)
					break;
				if (instance.blockType == null)
					instance.blockType = Packet_ServerBlockTypeSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerBlockTypeSerializer.deserializeLengthDelimited(stream, instance.blockType);
				continue;
			case 32:
				if (key.getWireType() != 2)
					break;
				if (instance.chunkPart == null)
					instance.chunkPart = Packet_ServerChunkPartSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerChunkPartSerializer.deserializeLengthDelimited(stream, instance.chunkPart);
				continue;
			case 33:
				if (key.getWireType() != 2)
					break;
				if (instance.explosion == null)
					instance.explosion = Packet_ServerExplosionSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerExplosionSerializer.deserializeLengthDelimited(stream, instance.explosion);
				continue;
			case 34:
				if (key.getWireType() != 2)
					break;
				if (instance.projectile == null)
					instance.projectile = Packet_ServerProjectileSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerProjectileSerializer.deserializeLengthDelimited(stream, instance.projectile);
				continue;
			case 35:
				if (key.getWireType() != 2)
					break;
				if (instance.translation == null)
					instance.translation = Packet_ServerTranslatedStringSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerTranslatedStringSerializer.deserializeLengthDelimited(stream, instance.translation);
				continue;
			case 36:
				if (key.getWireType() != 2)
					break;
				if (instance.queryAnswer == null)
					instance.queryAnswer = Packet_ServerQueryAnswerSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerQueryAnswerSerializer.deserializeLengthDelimited(stream, instance.queryAnswer);
				continue;
			case 37:
				if (key.getWireType() != 2)
					break;
				if (instance.redirect == null)
					instance.redirect = Packet_ServerRedirectSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerRedirectSerializer.deserializeLengthDelimited(stream, instance.redirect);
				continue;
			case 39:
				if (key.getWireType() != 2)
					break;
				if (instance.entitySpawn == null)
					instance.entitySpawn = Packet_ServerEntitySpawnSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerEntitySpawnSerializer.deserializeLengthDelimited(stream, instance.entitySpawn);
				continue;
			case 40:
				if (key.getWireType() != 2)
					break;
				if (instance.entityPosition == null)
					instance.entityPosition = Packet_ServerEntityPositionAndOrientationSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerEntityPositionAndOrientationSerializer.deserializeLengthDelimited(stream, instance.entityPosition);
				continue;
			case 41:
				if (key.getWireType() != 2)
					break;
				if (instance.entityDespawn == null)
					instance.entityDespawn = Packet_ServerEntityDespawnSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerEntityDespawnSerializer.deserializeLengthDelimited(stream, instance.entityDespawn);
				continue;
			default:
				ProtocolParser.skipKey(stream, key);
				break;
			}
		}
		return instance;
	}

	/**
	 * &lt;summary&gt;Read the VarInt length prefix and the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
	 */
	public static Packet_Server deserializeLengthDelimited(CitoStream stream, Packet_Server instance)
	{
		instance.id = 0;
		int limit = ProtocolParser.readUInt32(stream);
		limit += stream.position();
		while (true) {
			if (stream.position() >= limit) {
				if (stream.position() == limit)
					break;
				else
					return null;
			}
			int keyByte = stream.readByte();
			if (keyByte == -1)
				return null;
			switch (keyByte) {
			case 10:
				if (instance.identification == null)
					instance.identification = Packet_ServerIdentificationSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerIdentificationSerializer.deserializeLengthDelimited(stream, instance.identification);
				continue;
			case 18:
				if (instance.levelInitialize == null)
					instance.levelInitialize = Packet_ServerLevelInitializeSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerLevelInitializeSerializer.deserializeLengthDelimited(stream, instance.levelInitialize);
				continue;
			case 26:
				if (instance.levelDataChunk == null)
					instance.levelDataChunk = Packet_ServerLevelProgressSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerLevelProgressSerializer.deserializeLengthDelimited(stream, instance.levelDataChunk);
				continue;
			case 34:
				if (instance.levelFinalize == null)
					instance.levelFinalize = Packet_ServerLevelFinalizeSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerLevelFinalizeSerializer.deserializeLengthDelimited(stream, instance.levelFinalize);
				continue;
			case 42:
				if (instance.setBlock == null)
					instance.setBlock = Packet_ServerSetBlockSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerSetBlockSerializer.deserializeLengthDelimited(stream, instance.setBlock);
				continue;
			case 74:
				if (instance.message == null)
					instance.message = Packet_ServerMessageSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerMessageSerializer.deserializeLengthDelimited(stream, instance.message);
				continue;
			case 82:
				if (instance.disconnectPlayer == null)
					instance.disconnectPlayer = Packet_ServerDisconnectPlayerSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerDisconnectPlayerSerializer.deserializeLengthDelimited(stream, instance.disconnectPlayer);
				continue;
			case 90:
				if (instance.chunk_ == null)
					instance.chunk_ = Packet_ServerChunkSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerChunkSerializer.deserializeLengthDelimited(stream, instance.chunk_);
				continue;
			case 98:
				if (instance.inventory == null)
					instance.inventory = Packet_ServerInventorySerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerInventorySerializer.deserializeLengthDelimited(stream, instance.inventory);
				continue;
			case 106:
				if (instance.season == null)
					instance.season = Packet_ServerSeasonSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerSeasonSerializer.deserializeLengthDelimited(stream, instance.season);
				continue;
			case 114:
				if (instance.blobInitialize == null)
					instance.blobInitialize = Packet_ServerBlobInitializeSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerBlobInitializeSerializer.deserializeLengthDelimited(stream, instance.blobInitialize);
				continue;
			case 122:
				if (instance.blobPart == null)
					instance.blobPart = Packet_ServerBlobPartSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerBlobPartSerializer.deserializeLengthDelimited(stream, instance.blobPart);
				continue;
			default:
				break;
			}
			Key key = ProtocolParser.readKey_((byte) keyByte, stream);
			switch (key.getField()) {
			case 0:
				return null;
			case 90:
				if (key.getWireType() != 0)
					break;
				instance.id = ProtocolParser.readUInt64(stream);
				continue;
			case 51:
				if (key.getWireType() != 2)
					break;
				if (instance.fillArea == null)
					instance.fillArea = Packet_ServerFillAreaSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerFillAreaSerializer.deserializeLengthDelimited(stream, instance.fillArea);
				continue;
			case 52:
				if (key.getWireType() != 2)
					break;
				if (instance.fillAreaLimit == null)
					instance.fillAreaLimit = Packet_ServerFillAreaLimitSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerFillAreaLimitSerializer.deserializeLengthDelimited(stream, instance.fillAreaLimit);
				continue;
			case 53:
				if (key.getWireType() != 2)
					break;
				if (instance.freemove == null)
					instance.freemove = Packet_ServerFreemoveSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerFreemoveSerializer.deserializeLengthDelimited(stream, instance.freemove);
				continue;
			case 16:
				if (key.getWireType() != 2)
					break;
				if (instance.blobFinalize == null)
					instance.blobFinalize = Packet_ServerBlobFinalizeSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerBlobFinalizeSerializer.deserializeLengthDelimited(stream, instance.blobFinalize);
				continue;
			case 17:
				if (key.getWireType() != 2)
					break;
				if (instance.heightmapChunk == null)
					instance.heightmapChunk = Packet_ServerHeightmapChunkSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerHeightmapChunkSerializer.deserializeLengthDelimited(stream, instance.heightmapChunk);
				continue;
			case 18:
				if (key.getWireType() != 2)
					break;
				if (instance.ping == null)
					instance.ping = Packet_ServerPingSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerPingSerializer.deserializeLengthDelimited(stream, instance.ping);
				continue;
			case 181:
				if (key.getWireType() != 2)
					break;
				if (instance.playerPing == null)
					instance.playerPing = Packet_ServerPlayerPingSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerPlayerPingSerializer.deserializeLengthDelimited(stream, instance.playerPing);
				continue;
			case 19:
				if (key.getWireType() != 2)
					break;
				if (instance.sound == null)
					instance.sound = Packet_ServerSoundSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerSoundSerializer.deserializeLengthDelimited(stream, instance.sound);
				continue;
			case 20:
				if (key.getWireType() != 2)
					break;
				if (instance.playerStats == null)
					instance.playerStats = Packet_ServerPlayerStatsSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerPlayerStatsSerializer.deserializeLengthDelimited(stream, instance.playerStats);
				continue;
			case 21:
				if (key.getWireType() != 2)
					break;
				if (instance.monster == null)
					instance.monster = Packet_ServerMonstersSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerMonstersSerializer.deserializeLengthDelimited(stream, instance.monster);
				continue;
			case 22:
				if (key.getWireType() != 2)
					break;
				if (instance.playerSpawnPosition == null)
					instance.playerSpawnPosition = Packet_ServerPlayerSpawnPositionSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerPlayerSpawnPositionSerializer.deserializeLengthDelimited(stream, instance.playerSpawnPosition);
				continue;
			case 23:
				if (key.getWireType() != 2)
					break;
				if (instance.blockTypes == null)
					instance.blockTypes = Packet_ServerBlockTypesSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerBlockTypesSerializer.deserializeLengthDelimited(stream, instance.blockTypes);
				continue;
			case 24:
				if (key.getWireType() != 2)
					break;
				if (instance.sunLevels == null)
					instance.sunLevels = Packet_ServerSunLevelsSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerSunLevelsSerializer.deserializeLengthDelimited(stream, instance.sunLevels);
				continue;
			case 25:
				if (key.getWireType() != 2)
					break;
				if (instance.lightLevels == null)
					instance.lightLevels = Packet_ServerLightLevelsSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerLightLevelsSerializer.deserializeLengthDelimited(stream, instance.lightLevels);
				continue;
			case 26:
				if (key.getWireType() != 2)
					break;
				if (instance.craftingRecipes == null)
					instance.craftingRecipes = Packet_ServerCraftingRecipesSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerCraftingRecipesSerializer.deserializeLengthDelimited(stream, instance.craftingRecipes);
				continue;
			case 27:
				if (key.getWireType() != 2)
					break;
				if (instance.dialog == null)
					instance.dialog = Packet_ServerDialogSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerDialogSerializer.deserializeLengthDelimited(stream, instance.dialog);
				continue;
			case 28:
				if (key.getWireType() != 2)
					break;
				if (instance.follow == null)
					instance.follow = Packet_ServerFollowSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerFollowSerializer.deserializeLengthDelimited(stream, instance.follow);
				continue;
			case 29:
				if (key.getWireType() != 2)
					break;
				if (instance.bullet == null)
					instance.bullet = Packet_ServerBulletSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerBulletSerializer.deserializeLengthDelimited(stream, instance.bullet);
				continue;
			case 30:
				if (key.getWireType() != 2)
					break;
				if (instance.ammo == null)
					instance.ammo = Packet_ServerAmmoSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerAmmoSerializer.deserializeLengthDelimited(stream, instance.ammo);
				continue;
			case 31:
				if (key.getWireType() != 2)
					break;
				if (instance.blockType == null)
					instance.blockType = Packet_ServerBlockTypeSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerBlockTypeSerializer.deserializeLengthDelimited(stream, instance.blockType);
				continue;
			case 32:
				if (key.getWireType() != 2)
					break;
				if (instance.chunkPart == null)
					instance.chunkPart = Packet_ServerChunkPartSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerChunkPartSerializer.deserializeLengthDelimited(stream, instance.chunkPart);
				continue;
			case 33:
				if (key.getWireType() != 2)
					break;
				if (instance.explosion == null)
					instance.explosion = Packet_ServerExplosionSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerExplosionSerializer.deserializeLengthDelimited(stream, instance.explosion);
				continue;
			case 34:
				if (key.getWireType() != 2)
					break;
				if (instance.projectile == null)
					instance.projectile = Packet_ServerProjectileSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerProjectileSerializer.deserializeLengthDelimited(stream, instance.projectile);
				continue;
			case 35:
				if (key.getWireType() != 2)
					break;
				if (instance.translation == null)
					instance.translation = Packet_ServerTranslatedStringSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerTranslatedStringSerializer.deserializeLengthDelimited(stream, instance.translation);
				continue;
			case 36:
				if (key.getWireType() != 2)
					break;
				if (instance.queryAnswer == null)
					instance.queryAnswer = Packet_ServerQueryAnswerSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerQueryAnswerSerializer.deserializeLengthDelimited(stream, instance.queryAnswer);
				continue;
			case 37:
				if (key.getWireType() != 2)
					break;
				if (instance.redirect == null)
					instance.redirect = Packet_ServerRedirectSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerRedirectSerializer.deserializeLengthDelimited(stream, instance.redirect);
				continue;
			case 39:
				if (key.getWireType() != 2)
					break;
				if (instance.entitySpawn == null)
					instance.entitySpawn = Packet_ServerEntitySpawnSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerEntitySpawnSerializer.deserializeLengthDelimited(stream, instance.entitySpawn);
				continue;
			case 40:
				if (key.getWireType() != 2)
					break;
				if (instance.entityPosition == null)
					instance.entityPosition = Packet_ServerEntityPositionAndOrientationSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerEntityPositionAndOrientationSerializer.deserializeLengthDelimited(stream, instance.entityPosition);
				continue;
			case 41:
				if (key.getWireType() != 2)
					break;
				if (instance.entityDespawn == null)
					instance.entityDespawn = Packet_ServerEntityDespawnSerializer.deserializeLengthDelimitedNew(stream);
				else
					Packet_ServerEntityDespawnSerializer.deserializeLengthDelimited(stream, instance.entityDespawn);
				continue;
			default:
				ProtocolParser.skipKey(stream, key);
				break;
			}
		}
		return instance;
	}

	/**
	 * &lt;summary&gt;Helper: create a new instance to deserializing into&lt;/summary&gt;
	 */
	public static Packet_Server deserializeLengthDelimitedNew(CitoStream stream)
	{
		Packet_Server instance = new Packet_Server();
		Packet_ServerSerializer.deserializeLengthDelimited(stream, instance);
		return instance;
	}

	/**
	 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
	 */
	public static void serialize(CitoStream stream, Packet_Server instance)
	{
		if (instance.id != 0) {
			stream.writeByte(ProtoPlatform.intToByte(208));
			stream.writeByte(ProtoPlatform.intToByte(5));
			ProtocolParser.writeUInt64(stream, instance.id);
		}
		if (instance.identification != null) {
			stream.writeByte(ProtoPlatform.intToByte(10));
			CitoMemoryStream ms1 = new CitoMemoryStream();
			Packet_ServerIdentificationSerializer.serialize(ms1, instance.identification);
			int ms1Length = ms1.length();
			ProtocolParser.writeUInt32_(stream, ms1Length);
			stream.write(ms1.getBuffer(), 0, ms1Length);
		}
		if (instance.levelInitialize != null) {
			stream.writeByte(ProtoPlatform.intToByte(18));
			CitoMemoryStream ms2 = new CitoMemoryStream();
			Packet_ServerLevelInitializeSerializer.serialize(ms2, instance.levelInitialize);
			int ms2Length = ms2.length();
			ProtocolParser.writeUInt32_(stream, ms2Length);
			stream.write(ms2.getBuffer(), 0, ms2Length);
		}
		if (instance.levelDataChunk != null) {
			stream.writeByte(ProtoPlatform.intToByte(26));
			CitoMemoryStream ms3 = new CitoMemoryStream();
			Packet_ServerLevelProgressSerializer.serialize(ms3, instance.levelDataChunk);
			int ms3Length = ms3.length();
			ProtocolParser.writeUInt32_(stream, ms3Length);
			stream.write(ms3.getBuffer(), 0, ms3Length);
		}
		if (instance.levelFinalize != null) {
			stream.writeByte(ProtoPlatform.intToByte(34));
			CitoMemoryStream ms4 = new CitoMemoryStream();
			Packet_ServerLevelFinalizeSerializer.serialize(ms4, instance.levelFinalize);
			int ms4Length = ms4.length();
			ProtocolParser.writeUInt32_(stream, ms4Length);
			stream.write(ms4.getBuffer(), 0, ms4Length);
		}
		if (instance.setBlock != null) {
			stream.writeByte(ProtoPlatform.intToByte(42));
			CitoMemoryStream ms5 = new CitoMemoryStream();
			Packet_ServerSetBlockSerializer.serialize(ms5, instance.setBlock);
			int ms5Length = ms5.length();
			ProtocolParser.writeUInt32_(stream, ms5Length);
			stream.write(ms5.getBuffer(), 0, ms5Length);
		}
		if (instance.fillArea != null) {
			stream.writeByte(ProtoPlatform.intToByte(154));
			stream.writeByte(ProtoPlatform.intToByte(3));
			CitoMemoryStream ms51 = new CitoMemoryStream();
			Packet_ServerFillAreaSerializer.serialize(ms51, instance.fillArea);
			int ms51Length = ms51.length();
			ProtocolParser.writeUInt32_(stream, ms51Length);
			stream.write(ms51.getBuffer(), 0, ms51Length);
		}
		if (instance.fillAreaLimit != null) {
			stream.writeByte(ProtoPlatform.intToByte(162));
			stream.writeByte(ProtoPlatform.intToByte(3));
			CitoMemoryStream ms52 = new CitoMemoryStream();
			Packet_ServerFillAreaLimitSerializer.serialize(ms52, instance.fillAreaLimit);
			int ms52Length = ms52.length();
			ProtocolParser.writeUInt32_(stream, ms52Length);
			stream.write(ms52.getBuffer(), 0, ms52Length);
		}
		if (instance.freemove != null) {
			stream.writeByte(ProtoPlatform.intToByte(170));
			stream.writeByte(ProtoPlatform.intToByte(3));
			CitoMemoryStream ms53 = new CitoMemoryStream();
			Packet_ServerFreemoveSerializer.serialize(ms53, instance.freemove);
			int ms53Length = ms53.length();
			ProtocolParser.writeUInt32_(stream, ms53Length);
			stream.write(ms53.getBuffer(), 0, ms53Length);
		}
		if (instance.message != null) {
			stream.writeByte(ProtoPlatform.intToByte(74));
			CitoMemoryStream ms9 = new CitoMemoryStream();
			Packet_ServerMessageSerializer.serialize(ms9, instance.message);
			int ms9Length = ms9.length();
			ProtocolParser.writeUInt32_(stream, ms9Length);
			stream.write(ms9.getBuffer(), 0, ms9Length);
		}
		if (instance.disconnectPlayer != null) {
			stream.writeByte(ProtoPlatform.intToByte(82));
			CitoMemoryStream ms10 = new CitoMemoryStream();
			Packet_ServerDisconnectPlayerSerializer.serialize(ms10, instance.disconnectPlayer);
			int ms10Length = ms10.length();
			ProtocolParser.writeUInt32_(stream, ms10Length);
			stream.write(ms10.getBuffer(), 0, ms10Length);
		}
		if (instance.chunk_ != null) {
			stream.writeByte(ProtoPlatform.intToByte(90));
			CitoMemoryStream ms11 = new CitoMemoryStream();
			Packet_ServerChunkSerializer.serialize(ms11, instance.chunk_);
			int ms11Length = ms11.length();
			ProtocolParser.writeUInt32_(stream, ms11Length);
			stream.write(ms11.getBuffer(), 0, ms11Length);
		}
		if (instance.inventory != null) {
			stream.writeByte(ProtoPlatform.intToByte(98));
			CitoMemoryStream ms12 = new CitoMemoryStream();
			Packet_ServerInventorySerializer.serialize(ms12, instance.inventory);
			int ms12Length = ms12.length();
			ProtocolParser.writeUInt32_(stream, ms12Length);
			stream.write(ms12.getBuffer(), 0, ms12Length);
		}
		if (instance.season != null) {
			stream.writeByte(ProtoPlatform.intToByte(106));
			CitoMemoryStream ms13 = new CitoMemoryStream();
			Packet_ServerSeasonSerializer.serialize(ms13, instance.season);
			int ms13Length = ms13.length();
			ProtocolParser.writeUInt32_(stream, ms13Length);
			stream.write(ms13.getBuffer(), 0, ms13Length);
		}
		if (instance.blobInitialize != null) {
			stream.writeByte(ProtoPlatform.intToByte(114));
			CitoMemoryStream ms14 = new CitoMemoryStream();
			Packet_ServerBlobInitializeSerializer.serialize(ms14, instance.blobInitialize);
			int ms14Length = ms14.length();
			ProtocolParser.writeUInt32_(stream, ms14Length);
			stream.write(ms14.getBuffer(), 0, ms14Length);
		}
		if (instance.blobPart != null) {
			stream.writeByte(ProtoPlatform.intToByte(122));
			CitoMemoryStream ms15 = new CitoMemoryStream();
			Packet_ServerBlobPartSerializer.serialize(ms15, instance.blobPart);
			int ms15Length = ms15.length();
			ProtocolParser.writeUInt32_(stream, ms15Length);
			stream.write(ms15.getBuffer(), 0, ms15Length);
		}
		if (instance.blobFinalize != null) {
			stream.writeByte(ProtoPlatform.intToByte(130));
			stream.writeByte(ProtoPlatform.intToByte(1));
			CitoMemoryStream ms16 = new CitoMemoryStream();
			Packet_ServerBlobFinalizeSerializer.serialize(ms16, instance.blobFinalize);
			int ms16Length = ms16.length();
			ProtocolParser.writeUInt32_(stream, ms16Length);
			stream.write(ms16.getBuffer(), 0, ms16Length);
		}
		if (instance.heightmapChunk != null) {
			stream.writeByte(ProtoPlatform.intToByte(138));
			stream.writeByte(ProtoPlatform.intToByte(1));
			CitoMemoryStream ms17 = new CitoMemoryStream();
			Packet_ServerHeightmapChunkSerializer.serialize(ms17, instance.heightmapChunk);
			int ms17Length = ms17.length();
			ProtocolParser.writeUInt32_(stream, ms17Length);
			stream.write(ms17.getBuffer(), 0, ms17Length);
		}
		if (instance.ping != null) {
			stream.writeByte(ProtoPlatform.intToByte(146));
			stream.writeByte(ProtoPlatform.intToByte(1));
			CitoMemoryStream ms18 = new CitoMemoryStream();
			Packet_ServerPingSerializer.serialize(ms18, instance.ping);
			int ms18Length = ms18.length();
			ProtocolParser.writeUInt32_(stream, ms18Length);
			stream.write(ms18.getBuffer(), 0, ms18Length);
		}
		if (instance.playerPing != null) {
			stream.writeByte(ProtoPlatform.intToByte(170));
			stream.writeByte(ProtoPlatform.intToByte(11));
			CitoMemoryStream ms181 = new CitoMemoryStream();
			Packet_ServerPlayerPingSerializer.serialize(ms181, instance.playerPing);
			int ms181Length = ms181.length();
			ProtocolParser.writeUInt32_(stream, ms181Length);
			stream.write(ms181.getBuffer(), 0, ms181Length);
		}
		if (instance.sound != null) {
			stream.writeByte(ProtoPlatform.intToByte(154));
			stream.writeByte(ProtoPlatform.intToByte(1));
			CitoMemoryStream ms19 = new CitoMemoryStream();
			Packet_ServerSoundSerializer.serialize(ms19, instance.sound);
			int ms19Length = ms19.length();
			ProtocolParser.writeUInt32_(stream, ms19Length);
			stream.write(ms19.getBuffer(), 0, ms19Length);
		}
		if (instance.playerStats != null) {
			stream.writeByte(ProtoPlatform.intToByte(162));
			stream.writeByte(ProtoPlatform.intToByte(1));
			CitoMemoryStream ms20 = new CitoMemoryStream();
			Packet_ServerPlayerStatsSerializer.serialize(ms20, instance.playerStats);
			int ms20Length = ms20.length();
			ProtocolParser.writeUInt32_(stream, ms20Length);
			stream.write(ms20.getBuffer(), 0, ms20Length);
		}
		if (instance.monster != null) {
			stream.writeByte(ProtoPlatform.intToByte(170));
			stream.writeByte(ProtoPlatform.intToByte(1));
			CitoMemoryStream ms21 = new CitoMemoryStream();
			Packet_ServerMonstersSerializer.serialize(ms21, instance.monster);
			int ms21Length = ms21.length();
			ProtocolParser.writeUInt32_(stream, ms21Length);
			stream.write(ms21.getBuffer(), 0, ms21Length);
		}
		if (instance.playerSpawnPosition != null) {
			stream.writeByte(ProtoPlatform.intToByte(178));
			stream.writeByte(ProtoPlatform.intToByte(1));
			CitoMemoryStream ms22 = new CitoMemoryStream();
			Packet_ServerPlayerSpawnPositionSerializer.serialize(ms22, instance.playerSpawnPosition);
			int ms22Length = ms22.length();
			ProtocolParser.writeUInt32_(stream, ms22Length);
			stream.write(ms22.getBuffer(), 0, ms22Length);
		}
		if (instance.blockTypes != null) {
			stream.writeByte(ProtoPlatform.intToByte(186));
			stream.writeByte(ProtoPlatform.intToByte(1));
			CitoMemoryStream ms23 = new CitoMemoryStream();
			Packet_ServerBlockTypesSerializer.serialize(ms23, instance.blockTypes);
			int ms23Length = ms23.length();
			ProtocolParser.writeUInt32_(stream, ms23Length);
			stream.write(ms23.getBuffer(), 0, ms23Length);
		}
		if (instance.sunLevels != null) {
			stream.writeByte(ProtoPlatform.intToByte(194));
			stream.writeByte(ProtoPlatform.intToByte(1));
			CitoMemoryStream ms24 = new CitoMemoryStream();
			Packet_ServerSunLevelsSerializer.serialize(ms24, instance.sunLevels);
			int ms24Length = ms24.length();
			ProtocolParser.writeUInt32_(stream, ms24Length);
			stream.write(ms24.getBuffer(), 0, ms24Length);
		}
		if (instance.lightLevels != null) {
			stream.writeByte(ProtoPlatform.intToByte(202));
			stream.writeByte(ProtoPlatform.intToByte(1));
			CitoMemoryStream ms25 = new CitoMemoryStream();
			Packet_ServerLightLevelsSerializer.serialize(ms25, instance.lightLevels);
			int ms25Length = ms25.length();
			ProtocolParser.writeUInt32_(stream, ms25Length);
			stream.write(ms25.getBuffer(), 0, ms25Length);
		}
		if (instance.craftingRecipes != null) {
			stream.writeByte(ProtoPlatform.intToByte(210));
			stream.writeByte(ProtoPlatform.intToByte(1));
			CitoMemoryStream ms26 = new CitoMemoryStream();
			Packet_ServerCraftingRecipesSerializer.serialize(ms26, instance.craftingRecipes);
			int ms26Length = ms26.length();
			ProtocolParser.writeUInt32_(stream, ms26Length);
			stream.write(ms26.getBuffer(), 0, ms26Length);
		}
		if (instance.dialog != null) {
			stream.writeByte(ProtoPlatform.intToByte(218));
			stream.writeByte(ProtoPlatform.intToByte(1));
			CitoMemoryStream ms27 = new CitoMemoryStream();
			Packet_ServerDialogSerializer.serialize(ms27, instance.dialog);
			int ms27Length = ms27.length();
			ProtocolParser.writeUInt32_(stream, ms27Length);
			stream.write(ms27.getBuffer(), 0, ms27Length);
		}
		if (instance.follow != null) {
			stream.writeByte(ProtoPlatform.intToByte(226));
			stream.writeByte(ProtoPlatform.intToByte(1));
			CitoMemoryStream ms28 = new CitoMemoryStream();
			Packet_ServerFollowSerializer.serialize(ms28, instance.follow);
			int ms28Length = ms28.length();
			ProtocolParser.writeUInt32_(stream, ms28Length);
			stream.write(ms28.getBuffer(), 0, ms28Length);
		}
		if (instance.bullet != null) {
			stream.writeByte(ProtoPlatform.intToByte(234));
			stream.writeByte(ProtoPlatform.intToByte(1));
			CitoMemoryStream ms29 = new CitoMemoryStream();
			Packet_ServerBulletSerializer.serialize(ms29, instance.bullet);
			int ms29Length = ms29.length();
			ProtocolParser.writeUInt32_(stream, ms29Length);
			stream.write(ms29.getBuffer(), 0, ms29Length);
		}
		if (instance.ammo != null) {
			stream.writeByte(ProtoPlatform.intToByte(242));
			stream.writeByte(ProtoPlatform.intToByte(1));
			CitoMemoryStream ms30 = new CitoMemoryStream();
			Packet_ServerAmmoSerializer.serialize(ms30, instance.ammo);
			int ms30Length = ms30.length();
			ProtocolParser.writeUInt32_(stream, ms30Length);
			stream.write(ms30.getBuffer(), 0, ms30Length);
		}
		if (instance.blockType != null) {
			stream.writeByte(ProtoPlatform.intToByte(250));
			stream.writeByte(ProtoPlatform.intToByte(1));
			CitoMemoryStream ms31 = new CitoMemoryStream();
			Packet_ServerBlockTypeSerializer.serialize(ms31, instance.blockType);
			int ms31Length = ms31.length();
			ProtocolParser.writeUInt32_(stream, ms31Length);
			stream.write(ms31.getBuffer(), 0, ms31Length);
		}
		if (instance.chunkPart != null) {
			stream.writeByte(ProtoPlatform.intToByte(130));
			stream.writeByte(ProtoPlatform.intToByte(2));
			CitoMemoryStream ms32 = new CitoMemoryStream();
			Packet_ServerChunkPartSerializer.serialize(ms32, instance.chunkPart);
			int ms32Length = ms32.length();
			ProtocolParser.writeUInt32_(stream, ms32Length);
			stream.write(ms32.getBuffer(), 0, ms32Length);
		}
		if (instance.explosion != null) {
			stream.writeByte(ProtoPlatform.intToByte(138));
			stream.writeByte(ProtoPlatform.intToByte(2));
			CitoMemoryStream ms33 = new CitoMemoryStream();
			Packet_ServerExplosionSerializer.serialize(ms33, instance.explosion);
			int ms33Length = ms33.length();
			ProtocolParser.writeUInt32_(stream, ms33Length);
			stream.write(ms33.getBuffer(), 0, ms33Length);
		}
		if (instance.projectile != null) {
			stream.writeByte(ProtoPlatform.intToByte(146));
			stream.writeByte(ProtoPlatform.intToByte(2));
			CitoMemoryStream ms34 = new CitoMemoryStream();
			Packet_ServerProjectileSerializer.serialize(ms34, instance.projectile);
			int ms34Length = ms34.length();
			ProtocolParser.writeUInt32_(stream, ms34Length);
			stream.write(ms34.getBuffer(), 0, ms34Length);
		}
		if (instance.translation != null) {
			stream.writeByte(ProtoPlatform.intToByte(154));
			stream.writeByte(ProtoPlatform.intToByte(2));
			CitoMemoryStream ms35 = new CitoMemoryStream();
			Packet_ServerTranslatedStringSerializer.serialize(ms35, instance.translation);
			int ms35Length = ms35.length();
			ProtocolParser.writeUInt32_(stream, ms35Length);
			stream.write(ms35.getBuffer(), 0, ms35Length);
		}
		if (instance.queryAnswer != null) {
			stream.writeByte(ProtoPlatform.intToByte(162));
			stream.writeByte(ProtoPlatform.intToByte(2));
			CitoMemoryStream ms36 = new CitoMemoryStream();
			Packet_ServerQueryAnswerSerializer.serialize(ms36, instance.queryAnswer);
			int ms36Length = ms36.length();
			ProtocolParser.writeUInt32_(stream, ms36Length);
			stream.write(ms36.getBuffer(), 0, ms36Length);
		}
		if (instance.redirect != null) {
			stream.writeByte(ProtoPlatform.intToByte(170));
			stream.writeByte(ProtoPlatform.intToByte(2));
			CitoMemoryStream ms37 = new CitoMemoryStream();
			Packet_ServerRedirectSerializer.serialize(ms37, instance.redirect);
			int ms37Length = ms37.length();
			ProtocolParser.writeUInt32_(stream, ms37Length);
			stream.write(ms37.getBuffer(), 0, ms37Length);
		}
		if (instance.entitySpawn != null) {
			stream.writeByte(ProtoPlatform.intToByte(186));
			stream.writeByte(ProtoPlatform.intToByte(2));
			CitoMemoryStream ms39 = new CitoMemoryStream();
			Packet_ServerEntitySpawnSerializer.serialize(ms39, instance.entitySpawn);
			int ms39Length = ms39.length();
			ProtocolParser.writeUInt32_(stream, ms39Length);
			stream.write(ms39.getBuffer(), 0, ms39Length);
		}
		if (instance.entityPosition != null) {
			stream.writeByte(ProtoPlatform.intToByte(194));
			stream.writeByte(ProtoPlatform.intToByte(2));
			CitoMemoryStream ms40 = new CitoMemoryStream();
			Packet_ServerEntityPositionAndOrientationSerializer.serialize(ms40, instance.entityPosition);
			int ms40Length = ms40.length();
			ProtocolParser.writeUInt32_(stream, ms40Length);
			stream.write(ms40.getBuffer(), 0, ms40Length);
		}
		if (instance.entityDespawn != null) {
			stream.writeByte(ProtoPlatform.intToByte(202));
			stream.writeByte(ProtoPlatform.intToByte(2));
			CitoMemoryStream ms41 = new CitoMemoryStream();
			Packet_ServerEntityDespawnSerializer.serialize(ms41, instance.entityDespawn);
			int ms41Length = ms41.length();
			ProtocolParser.writeUInt32_(stream, ms41Length);
			stream.write(ms41.getBuffer(), 0, ms41Length);
		}
	}

	/**
	 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
	 */
	public static void serializeLengthDelimited(CitoStream stream, Packet_Server instance)
	{
		byte[] data = Packet_ServerSerializer.serializeToBytes(instance);
		ProtocolParser.writeUInt32_(stream, ProtoPlatform.arrayLength(data));
		stream.write(data, 0, ProtoPlatform.arrayLength(data));
	}

	/**
	 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
	 */
	public static byte[] serializeToBytes(Packet_Server instance)
	{
		CitoMemoryStream ms = new CitoMemoryStream();
		Packet_ServerSerializer.serialize(ms, instance);
		return ms.toArray();
	}
}
