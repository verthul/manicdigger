// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class ClientPackets
{

	public static Packet_Client activeMaterialSlot(int ActiveMaterial)
	{
		Packet_Client p = new Packet_Client();
		{
			p.id = 56;
			p.activeMaterialSlot = new Packet_ClientActiveMaterialSlot();
			p.activeMaterialSlot.activeMaterialSlot = ActiveMaterial;
		}
		return p;
	}

	public static Packet_Client chat(String s, int isTeamchat)
	{
		Packet_ClientMessage p = new Packet_ClientMessage();
		p.message = s;
		p.isTeamchat = isTeamchat;
		Packet_Client pp = new Packet_Client();
		pp.id = 13;
		pp.message = p;
		return pp;
	}

	public static Packet_Client craft(int x, int y, int z, int recipeId)
	{
		Packet_ClientCraft cmd = new Packet_ClientCraft();
		cmd.x = x;
		cmd.y = y;
		cmd.z = z;
		cmd.recipeId = recipeId;
		Packet_Client p = new Packet_Client();
		p.id = 9;
		p.craft = cmd;
		return p;
	}

	public static Packet_Client createLoginPacket(GamePlatform platform, String username, String verificationKey)
	{
		Packet_ClientIdentification p = new Packet_ClientIdentification();
		{
			p.username = username;
			p.mdProtocolVersion = platform.getGameVersion();
			p.verificationKey = verificationKey;
		}
		Packet_Client pp = new Packet_Client();
		pp.id = 0;
		pp.identification = p;
		return pp;
	}

	public static Packet_Client createLoginPacket_(GamePlatform platform, String username, String verificationKey, String serverPassword)
	{
		Packet_ClientIdentification p = new Packet_ClientIdentification();
		{
			p.username = username;
			p.mdProtocolVersion = platform.getGameVersion();
			p.verificationKey = verificationKey;
			p.serverPassword = serverPassword;
		}
		Packet_Client pp = new Packet_Client();
		pp.id = 0;
		pp.identification = p;
		return pp;
	}

	public static Packet_Client death(int reason, int sourcePlayer)
	{
		Packet_Client p = new Packet_Client();
		p.id = 60;
		p.death = new Packet_ClientDeath();
		{
			p.death.reason = reason;
			p.death.sourcePlayer = sourcePlayer;
		}
		return p;
	}

	public static Packet_Client dialogClick(String widgetId, String[] textValues, int textValuesCount)
	{
		Packet_Client p = new Packet_Client();
		p.id = 14;
		p.dialogClick_ = new Packet_ClientDialogClick();
		p.dialogClick_.widgetId = widgetId;
		p.dialogClick_.setTextBoxValue(textValues, textValuesCount, textValuesCount);
		return p;
	}

	public static Packet_Client fillArea(int startx, int starty, int startz, int endx, int endy, int endz, int blockType, int ActiveMaterial)
	{
		Packet_ClientFillArea p = new Packet_ClientFillArea();
		{
			p.x1 = startx;
			p.y1 = starty;
			p.z1 = startz;
			p.x2 = endx;
			p.y2 = endy;
			p.z2 = endz;
			p.blockType = blockType;
			p.materialSlot = ActiveMaterial;
		}
		Packet_Client pp = new Packet_Client();
		pp.id = 510;
		pp.fillArea = p;
		return pp;
	}

	public static Packet_Client gameResolution(int width, int height)
	{
		Packet_ClientGameResolution p = new Packet_ClientGameResolution();
		p.width = width;
		p.height = height;
		Packet_Client pp = new Packet_Client();
		pp.id = 10;
		pp.gameResolution = p;
		return pp;
	}

	public static Packet_Client health(int currentHealth)
	{
		Packet_Client p = new Packet_Client();
		{
			p.id = 52;
			p.health = new Packet_ClientHealth();
			p.health.currentHealth = currentHealth;
		}
		return p;
	}

	static Packet_Client hitEntity(int entityId)
	{
		Packet_Client p = new Packet_Client();
		p.id = 61;
		p.entityInteraction = new Packet_ClientEntityInteraction();
		p.entityInteraction.entityId = entityId;
		p.entityInteraction.interactionType = 1;
		return p;
	}

	public static Packet_Client inventoryClick(Packet_InventoryPosition pos)
	{
		Packet_ClientInventoryAction p = new Packet_ClientInventoryAction();
		p.a = pos;
		p.action = 0;
		Packet_Client pp = new Packet_Client();
		pp.id = 51;
		pp.inventoryAction = p;
		return pp;
	}

	public static Packet_Client leave(int reason)
	{
		Packet_Client p = new Packet_Client();
		p.id = 57;
		p.leave = new Packet_ClientLeave();
		p.leave.reason = reason;
		return p;
	}

	public static Packet_Client monsterHit(int damage)
	{
		Packet_ClientHealth p = new Packet_ClientHealth();
		p.currentHealth = damage;
		Packet_Client packet = new Packet_Client();
		packet.id = 53;
		packet.health = p;
		return packet;
	}

	public static Packet_Client moveToInventory(Packet_InventoryPosition from)
	{
		Packet_ClientInventoryAction p = new Packet_ClientInventoryAction();
		p.a = from;
		p.action = 2;
		Packet_Client pp = new Packet_Client();
		pp.id = 51;
		pp.inventoryAction = p;
		return pp;
	}

	public static Packet_Client oxygen(int currentOxygen)
	{
		Packet_Client packet = new Packet_Client();
		packet.id = 59;
		packet.oxygen = new Packet_ClientOxygen();
		packet.oxygen.currentOxygen = currentOxygen;
		return packet;
	}

	public static Packet_Client pingReply()
	{
		Packet_ClientPingReply p = new Packet_ClientPingReply();
		Packet_Client pp = new Packet_Client();
		pp.id = 1;
		pp.pingReply = p;
		return pp;
	}

	public static Packet_Client positionAndOrientation(Game game, int playerId, float positionX, float positionY, float positionZ, float orientationX, float orientationY, float orientationZ, byte stance)
	{
		Packet_ClientPositionAndOrientation p = new Packet_ClientPositionAndOrientation();
		{
			p.playerId = playerId;
			p.x = game.platform.floatToInt(positionX * 32);
			p.y = game.platform.floatToInt(positionY * 32);
			p.z = game.platform.floatToInt(positionZ * 32);
			p.heading = game.platform.floatToInt(Game.radToAngle256(orientationY));
			p.pitch = game.platform.floatToInt(Game.radToAngle256(orientationX));
			p.stance = stance & 0xff;
		}
		Packet_Client pp = new Packet_Client();
		pp.id = 8;
		pp.positionAndOrientation = p;
		return pp;
	}

	public static Packet_Client reload()
	{
		Packet_Client p = new Packet_Client();
		p.id = 58;
		p.reload = new Packet_ClientReload();
		return p;
	}

	public static Packet_Client requestBlob(Game game, String[] required, int requiredCount)
	{
		Packet_ClientRequestBlob p = new Packet_ClientRequestBlob();
		if (GameVersionHelper.serverVersionAtLeast(game.platform, game.serverGameVersion, 2014, 4, 13)) {
			p.requestedMd5 = new Packet_StringList();
			p.requestedMd5.setItems(required, requiredCount, requiredCount);
		}
		Packet_Client pp = new Packet_Client();
		pp.id = 50;
		pp.requestBlob = p;
		return pp;
	}

	public static Packet_Client serverQuery()
	{
		Packet_ClientServerQuery p1 = new Packet_ClientServerQuery();
		Packet_Client pp = new Packet_Client();
		pp.id = 64;
		pp.query = p1;
		return pp;
	}

	public static Packet_Client setBlock(int x, int y, int z, int mode, int type, int materialslot)
	{
		Packet_ClientSetBlock p = new Packet_ClientSetBlock();
		{
			p.x = x;
			p.y = y;
			p.z = z;
			p.mode = mode;
			p.blockType = type;
			p.materialSlot = materialslot;
		}
		Packet_Client pp = new Packet_Client();
		pp.id = 5;
		pp.setBlock = p;
		return pp;
	}

	public static Packet_Client specialKeyRespawn()
	{
		Packet_Client p = new Packet_Client();
		{
			p.id = 55;
			p.specialKey_ = new Packet_ClientSpecialKey();
			p.specialKey_.key_ = 0;
		}
		return p;
	}

	public static Packet_Client specialKeySelectTeam()
	{
		Packet_Client p = new Packet_Client();
		{
			p.id = 55;
			p.specialKey_ = new Packet_ClientSpecialKey();
			p.specialKey_.key_ = 3;
		}
		return p;
	}

	public static Packet_Client specialKeySetSpawn()
	{
		Packet_Client p = new Packet_Client();
		{
			p.id = 55;
			p.specialKey_ = new Packet_ClientSpecialKey();
			p.specialKey_.key_ = 1;
		}
		return p;
	}

	public static Packet_Client specialKeyTabPlayerList()
	{
		Packet_Client p = new Packet_Client();
		p.id = 55;
		p.specialKey_ = new Packet_ClientSpecialKey();
		p.specialKey_.key_ = 2;
		return p;
	}

	static Packet_Client useEntity(int entityId)
	{
		Packet_Client p = new Packet_Client();
		p.id = 61;
		p.entityInteraction = new Packet_ClientEntityInteraction();
		p.entityInteraction.entityId = entityId;
		p.entityInteraction.interactionType = 0;
		return p;
	}

	public static Packet_Client wearItem(Packet_InventoryPosition from, Packet_InventoryPosition to)
	{
		Packet_ClientInventoryAction p = new Packet_ClientInventoryAction();
		p.a = from;
		p.b = to;
		p.action = 1;
		Packet_Client pp = new Packet_Client();
		pp.id = 51;
		pp.inventoryAction = p;
		return pp;
	}
}
