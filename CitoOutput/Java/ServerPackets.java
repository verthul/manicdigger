// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class ServerPackets
{

	static Packet_Server answerQuery(Packet_ServerQueryAnswer answer)
	{
		Packet_Server p = new Packet_Server();
		p.id = 64;
		p.queryAnswer = answer;
		return p;
	}

	public static Packet_Server blockType(int id, Packet_BlockType blockType)
	{
		Packet_Server p = new Packet_Server();
		p.id = 56;
		p.blockType = new Packet_ServerBlockType();
		p.blockType.id = id;
		p.blockType.blocktype = blockType;
		return p;
	}

	public static Packet_Server blockTypes()
	{
		Packet_Server p = new Packet_Server();
		p.id = 27;
		p.blockTypes = new Packet_ServerBlockTypes();
		return p;
	}

	public static Packet_Server chunkPart(byte[] compressedChunkPart)
	{
		Packet_Server p = new Packet_Server();
		p.id = 57;
		p.chunkPart = new Packet_ServerChunkPart();
		p.chunkPart.compressedChunkPart = compressedChunkPart;
		return p;
	}

	public static Packet_Server chunk_(int x, int y, int z, int chunksize)
	{
		Packet_Server p = new Packet_Server();
		p.id = 15;
		p.chunk_ = new Packet_ServerChunk();
		p.chunk_.x = x;
		p.chunk_.y = y;
		p.chunk_.z = z;
		p.chunk_.sizeX = chunksize;
		p.chunk_.sizeY = chunksize;
		p.chunk_.sizeZ = chunksize;
		return p;
	}

	static Packet_Server disconnectPlayer(String disconnectReason)
	{
		Packet_Server p = new Packet_Server();
		p.id = 14;
		p.disconnectPlayer = new Packet_ServerDisconnectPlayer();
		p.disconnectPlayer.disconnectReason = disconnectReason;
		return p;
	}

	static Packet_Server entityDespawn(int id)
	{
		Packet_Server p = new Packet_Server();
		p.id = 68;
		p.entityDespawn = new Packet_ServerEntityDespawn();
		p.entityDespawn.id = id;
		return p;
	}

	static Packet_Server entityPositionAndOrientation(int id, Packet_PositionAndOrientation positionAndOrientation)
	{
		Packet_Server p = new Packet_Server();
		p.id = 67;
		p.entityPosition = new Packet_ServerEntityPositionAndOrientation();
		p.entityPosition.id = id;
		p.entityPosition.positionAndOrientation = positionAndOrientation;
		return p;
	}

	static Packet_Server entitySpawn(int id, Packet_ServerEntity entity)
	{
		Packet_Server p = new Packet_Server();
		p.id = 66;
		p.entitySpawn = new Packet_ServerEntitySpawn();
		p.entitySpawn.id = id;
		p.entitySpawn.entity_ = entity;
		return p;
	}

	public static Packet_Server identification(int assignedClientId, int mapSizeX, int mapSizeY, int mapSizeZ, String version)
	{
		Packet_Server p = new Packet_Server();
		p.id = 0;
		p.identification = new Packet_ServerIdentification();
		p.identification.assignedClientId = assignedClientId;
		p.identification.mapSizeX = mapSizeX;
		p.identification.mapSizeY = mapSizeY;
		p.identification.mapSizeZ = mapSizeZ;
		p.identification.serverName = "Simple";
		p.identification.mdProtocolVersion = version;
		return p;
	}

	static Packet_Server inventory(Packet_Inventory inventory)
	{
		Packet_Server p = new Packet_Server();
		p.id = 16;
		p.inventory = new Packet_ServerInventory();
		p.inventory.inventory = inventory;
		return p;
	}

	public static Packet_Server levelFinalize()
	{
		Packet_Server p = new Packet_Server();
		p.id = 4;
		p.levelFinalize = new Packet_ServerLevelFinalize();
		return p;
	}

	public static Packet_Server levelInitialize()
	{
		Packet_Server p = new Packet_Server();
		p.id = 2;
		p.levelInitialize = new Packet_ServerLevelInitialize();
		return p;
	}

	public static Packet_Server message(String text)
	{
		Packet_Server p = new Packet_Server();
		p.id = 13;
		p.message = new Packet_ServerMessage();
		p.message.message = text;
		return p;
	}

	static Packet_Server ping()
	{
		Packet_Server p = new Packet_Server();
		p.id = 1;
		p.ping = new Packet_ServerPing();
		return p;
	}

	static Packet_Server playerStats(int health, int maxHealth, int oxygen, int maxOxygen)
	{
		Packet_Server p = new Packet_Server();
		p.id = 23;
		p.playerStats = new Packet_ServerPlayerStats();
		p.playerStats.currentHealth = health;
		p.playerStats.maxHealth = maxHealth;
		p.playerStats.currentOxygen = oxygen;
		p.playerStats.maxOxygen = maxOxygen;
		return p;
	}

	public static byte[] serialize(Packet_Server packet, IntRef retLength)
	{
		CitoMemoryStream ms = new CitoMemoryStream();
		Packet_ServerSerializer.serialize(ms, packet);
		byte[] data = ms.toArray();
		retLength.value = ms.length();
		return data;
	}

	static Packet_Server setBlock(int x, int y, int z, int block)
	{
		Packet_Server p = new Packet_Server();
		p.id = 6;
		p.setBlock = new Packet_ServerSetBlock();
		p.setBlock.x = x;
		p.setBlock.y = y;
		p.setBlock.z = z;
		p.setBlock.blockType = block;
		return p;
	}
}
