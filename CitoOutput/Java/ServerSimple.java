// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class ServerSimple
{
	public ServerSimple()
	{
		this.one = 1;
		this.clients = new ClientSimple[256];
		this.clientsCount = 0;
		this.blockTypes = new Packet_BlockType[1024];
		this.blockTypesCount = 0;
		this.mods = new ModSimple[128];
		ModManagerSimple1 m = new ModManagerSimple1();
		m.start(this);
		this.mods[this.modsCount++] = new ModSimpleDefault();
		this.mods[this.modsCount++] = new ModSimpleWorldGenerator();
		for (int i = 0; i < this.modsCount; i++) {
			this.mods[i].start(m);
		}
		this.mapSizeX = 8192;
		this.mapSizeY = 8192;
		this.mapSizeZ = 128;
		this.chunks = new ChunkSimple[this.mapSizeX / 32 * this.mapSizeY / 32][];
		this.chunkdrawdistance = 4;
		this.actions = new QueueAction();
		this.mainThreadActions = new QueueAction();
		this.spawnGlX = this.mapSizeX / 2;
		this.spawnGlY = this.mapSizeZ;
		for (int i = 0; i < this.modsCount; i++) {
			int spawnHeight = this.mods[i].getHeight();
			if (spawnHeight != -1) {
				this.spawnGlY = spawnHeight;
			}
		}
		this.spawnGlZ = this.mapSizeY / 2;
	}
	public static final int CHUNK_SIZE = 32;
	int mapSizeX;
	int mapSizeY;
	int mapSizeZ;

	private void move(QueueAction from, QueueAction to)
	{
		this.platform.monitorEnter(this.mainThreadActionsLock);
		int count = from.count;
		for (int i = 0; i < count; i++) {
			Action_ task = from.dequeue();
			to.enqueue(task);
		}
		this.platform.monitorExit(this.mainThreadActionsLock);
	}

	private void notifyInventory()
	{
		for (int i = 0; i < this.clientsCount; i++) {
			if (this.clients[i] == null) {
				continue;
			}
			if (!this.clients[i].connected) {
				continue;
			}
			if (!this.clients[i].inventoryDirty) {
				continue;
			}
			this.sendPacket(i, ServerPackets.inventory(this.clients[i].inventory));
			this.clients[i].inventoryDirty = false;
		}
	}

	private void notifyMap()
	{
		for (int i = 0; i < this.clientsCount; i++) {
			if (this.clients[i] == null) {
				continue;
			}
			if (!this.clients[i].connected) {
				continue;
			}
			if (this.clients[i].notifyMapAction == null) {
				NotifyMapAction notify = new NotifyMapAction();
				notify.server = this;
				notify.clientId = i;
				this.clients[i].notifyMapAction = notify;
				this.platform.queueUserWorkItem(notify);
			}
		}
	}

	private void notifyPing()
	{
		for (int i = 0; i < this.clientsCount; i++) {
			if (this.clients[i] == null) {
				continue;
			}
			int now = this.platform.timeMillisecondsFromStart();
			if (now - this.clients[i].pingLastMilliseconds > 1000) {
				this.sendPacket(i, ServerPackets.ping());
				this.clients[i].pingLastMilliseconds = now;
			}
		}
	}

	private void processActions()
	{
		this.move(this.mainThreadActions, this.actions);
		while (this.actions.count() > 0) {
			Action_ a = this.actions.dequeue();
			a.run();
		}
	}

	private void processPacket(int client, Packet_Client packet)
	{
		switch (packet.getId()) {
		case 0:
			{
				if (packet.identification == null) {
					return;
				}
				this.sendPacket(client, ServerPackets.identification(0, this.mapSizeX, this.mapSizeY, this.mapSizeZ, this.platform.getGameVersion()));
				this.clients[client].name = packet.identification.username;
			}
			break;
		case 50:
			{
				this.sendPacket(client, ServerPackets.levelInitialize());
				for (int i = 0; i < this.blockTypesCount; i++) {
					Packet_BlockType blocktype = this.blockTypes[i];
					if (blocktype == null) {
						blocktype = new Packet_BlockType();
					}
					this.sendPacket(client, ServerPackets.blockType(i, blocktype));
				}
				this.sendPacket(client, ServerPackets.blockTypes());
				this.sendPacket(client, ServerPackets.levelFinalize());
				for (int i = 0; i < this.clientsCount; i++) {
					if (this.clients[i] == null) {
						continue;
					}
					this.clients[i].glX = this.spawnGlX;
					this.clients[i].glY = this.spawnGlY;
					this.clients[i].glZ = this.spawnGlZ;
					Packet_PositionAndOrientation pos = new Packet_PositionAndOrientation();
					pos.x = this.platform.floatToInt(32 * this.clients[i].glX);
					pos.y = this.platform.floatToInt(32 * this.clients[i].glY);
					pos.z = this.platform.floatToInt(32 * this.clients[i].glZ);
					pos.pitch = 127;
					Packet_ServerEntity e = new Packet_ServerEntity();
					e.drawModel = new Packet_ServerEntityAnimatedModel();
					e.drawModel.model_ = "player.txt";
					e.drawModel.modelHeight = this.platform.floatToInt(this.one * 17 / 10 * 32);
					e.drawModel.eyeHeight = this.platform.floatToInt(this.one * 15 / 10 * 32);
					e.position = pos;
					this.sendPacket(client, ServerPackets.entitySpawn(0, e));
					this.sendPacket(client, ServerPackets.playerStats(100, 100, 100, 100));
				}
				for (int i = 0; i < this.modsCount; i++) {
					this.mods[i].onPlayerJoin(client);
				}
				this.clients[client].connected = true;
			}
			break;
		case 13:
			{
				this.sendPacketToAll(ServerPackets.message(this.platform.stringFormat2("{0}: &f{1}", this.clients[client].name, packet.message.message)));
			}
			break;
		case 5:
			{
				int x = packet.setBlock.x;
				int y = packet.setBlock.y;
				int z = packet.setBlock.z;
				int block = packet.setBlock.blockType;
				int mode = packet.setBlock.mode;
				if (mode == 1) {
				}
				if (mode == 0) {
					this.sendPacketToAll(ServerPackets.setBlock(x, y, z, 0));
				}
				if (mode == 2) {
				}
				if (mode == 3) {
				}
			}
			break;
		case 8:
			{
				this.clients[client].glX = this.one * packet.positionAndOrientation.x / 32;
				this.clients[client].glY = this.one * packet.positionAndOrientation.y / 32;
				this.clients[client].glZ = this.one * packet.positionAndOrientation.z / 32;
			}
			break;
		case 51:
			{
				switch (packet.inventoryAction.action) {
				case 0:
					break;
				}
			}
			break;
		}
	}

	private void processPackets()
	{
		for (;;) {
			NetIncomingMessage msg = this.server.readMessage();
			if (msg == null) {
				return;
			}
			switch (msg.type) {
			case NetworkMessageType.CONNECT:
				ClientSimple c = new ClientSimple();
				c.mainSocket = this.server;
				c.connection = msg.senderConnection;
				c.chunksseen = new boolean[this.mapSizeX / 32 * this.mapSizeY / 32][];
				this.clients[0] = c;
				this.clientsCount = 1;
				break;
			case NetworkMessageType.DATA:
				byte[] data = msg.message;
				Packet_Client packet = new Packet_Client();
				Packet_ClientSerializer.deserializeBuffer(data, msg.messageLength, packet);
				this.processPacket(0, packet);
				break;
			case NetworkMessageType.DISCONNECT:
				break;
			}
		}
	}

	public final void queueMainThreadAction(Action_ action)
	{
		this.platform.monitorEnter(this.mainThreadActionsLock);
		this.mainThreadActions.enqueue(action);
		this.platform.monitorExit(this.mainThreadActionsLock);
	}

	public final void sendPacket(int client, Packet_Server packet)
	{
		IntRef length = new IntRef();
		byte[] data = ServerPackets.serialize(packet, length);
		INetOutgoingMessage msg = new INetOutgoingMessage();
		msg.write(data, length.value);
		this.clients[client].connection.sendMessage(msg, MyNetDeliveryMethod.RELIABLE_ORDERED, 0);
	}

	private void sendPacketToAll(Packet_Server packet)
	{
		for (int i = 0; i < this.clientsCount; i++) {
			this.sendPacket(i, packet);
		}
	}

	public final void start(NetServer server_, String saveFilename_, GamePlatform platform_)
	{
		this.server = server_;
		this.saveFilename = saveFilename_;
		this.platform = platform_;
		this.mainThreadActionsLock = this.platform.monitorCreate();
	}

	public final void update()
	{
		this.processPackets();
		this.notifyMap();
		this.notifyInventory();
		this.notifyPing();
		this.processActions();
	}
	private QueueAction actions;
	Packet_BlockType[] blockTypes;
	int blockTypesCount;
	int chunkdrawdistance;
	ChunkSimple[][] chunks;
	ClientSimple[] clients;
	int clientsCount;
	private QueueAction mainThreadActions;
	private MonitorObject mainThreadActionsLock;
	ModSimple[] mods;
	int modsCount;
	private float one;
	GamePlatform platform;
	private String saveFilename;
	private NetServer server;
	private int spawnGlX;
	private int spawnGlY;
	private int spawnGlZ;
}
