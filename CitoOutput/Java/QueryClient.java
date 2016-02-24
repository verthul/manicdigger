// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class QueryClient
{
	public QueryClient()
	{
		this.result = new QueryResult();
		this.querySuccess = false;
		this.queryPerformed = false;
	}

	public final QueryResult getResult()
	{
		return this.result;
	}

	public final String getServerMessage()
	{
		return this.serverMessage;
	}

	public final void performQuery(String ip, int port)
	{
		this.serverMessage = "";
		NetClient client;
		if (this.p.enetAvailable()) {
			EnetNetClient c = new EnetNetClient();
			c.setPlatform(this.p);
			client = c;
		}
		else {
			TcpNetClient c = new TcpNetClient();
			c.setPlatform(this.p);
			client = c;
		}
		client.start();
		client.connect(ip, port);
		this.sendRequest(client);
		this.readPacket(client);
		this.queryPerformed = true;
	}

	private void readPacket(NetClient client)
	{
		boolean success = false;
		int started = this.p.timeMillisecondsFromStart();
		int timeout = 2000;
		while (this.p.timeMillisecondsFromStart() < started + timeout) {
			if (success) {
				this.querySuccess = true;
				return;
			}
			NetIncomingMessage msg;
			msg = client.readMessage();
			if (msg == null) {
				continue;
			}
			Packet_Server packet = new Packet_Server();
			Packet_ServerSerializer.deserializeBuffer(msg.message, msg.messageLength, packet);
			switch (packet.id) {
			case 64:
				this.result.name = packet.queryAnswer.name;
				this.result.mOTD = packet.queryAnswer.mOTD;
				this.result.playerCount = packet.queryAnswer.playerCount;
				this.result.maxPlayers = packet.queryAnswer.maxPlayers;
				this.result.playerList = packet.queryAnswer.playerList;
				this.result.port = packet.queryAnswer.port;
				this.result.gameMode = packet.queryAnswer.gameMode;
				this.result.password = packet.queryAnswer.password;
				this.result.publicHash = packet.queryAnswer.publicHash;
				this.result.serverVersion = packet.queryAnswer.serverVersion;
				this.result.mapSizeX = packet.queryAnswer.mapSizeX;
				this.result.mapSizeY = packet.queryAnswer.mapSizeY;
				this.result.mapSizeZ = packet.queryAnswer.mapSizeZ;
				this.result.serverThumbnail = packet.queryAnswer.serverThumbnail;
				success = true;
				continue;
			case 14:
				this.serverMessage = packet.disconnectPlayer.disconnectReason;
				return;
			default:
				continue;
			}
		}
		this.serverMessage = "Timeout while querying server!";
	}

	private void sendRequest(NetClient client)
	{
		Packet_Client pp = ClientPackets.serverQuery();
		CitoMemoryStream ms = new CitoMemoryStream();
		Packet_ClientSerializer.serialize(ms, pp);
		byte[] data = ms.toArray();
		INetOutgoingMessage msg = new INetOutgoingMessage();
		msg.write(data, ms.length());
		client.sendMessage(msg, MyNetDeliveryMethod.RELIABLE_ORDERED);
	}

	public final void setPlatform(GamePlatform p_)
	{
		this.p = p_;
	}
	GamePlatform p;
	boolean queryPerformed;
	boolean querySuccess;
	QueryResult result;
	String serverMessage;
}
