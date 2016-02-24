// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class ModNetworkProcess extends ClientMod
{
	public ModNetworkProcess()
	{
		this.currentChunk = new byte[65536];
		this.currentChunkCount = 0;
		this.receivedchunk = new int[32768];
		this.decompressedchunk = new byte[65536];
	}
	byte[] currentChunk;
	int currentChunkCount;

	public final void networkProcess()
	{
		this.game.currentTimeMilliseconds = this.game.platform.timeMillisecondsFromStart();
		if (this.game.main == null) {
			return;
		}
		NetIncomingMessage msg;
		for (;;) {
			if (this.game.invalidVersionPacketIdentification != null) {
				break;
			}
			msg = this.game.main.readMessage();
			if (msg == null) {
				break;
			}
			this.tryReadPacket(msg.message, msg.messageLength);
		}
	}

	@Override
	public void onReadOnlyBackgroundThread(Game game_, float dt)
	{
		this.game = game_;
		this.networkProcess();
	}

	private void processInBackground(Packet_Server packet)
	{
		switch (packet.id) {
		case 57:
			byte[] arr = packet.chunkPart.compressedChunkPart;
			int arrLength = this.game.platform.byteArrayLength(arr);
			for (int i = 0; i < arrLength; i++) {
				this.currentChunk[this.currentChunkCount++] = arr[i];
			}
			break;
		case 15:
			{
				Packet_ServerChunk p = packet.chunk_;
				if (this.currentChunkCount != 0) {
					this.game.platform.gzipDecompress(this.currentChunk, this.currentChunkCount, this.decompressedchunk);
					{
						int i = 0;
						for (int zz = 0; zz < p.sizeZ; zz++) {
							for (int yy = 0; yy < p.sizeY; yy++) {
								for (int xx = 0; xx < p.sizeX; xx++) {
									int block = ((this.decompressedchunk[i + 1] & 0xff) << 8) + (this.decompressedchunk[i] & 0xff);
									if (block < 1024) {
										this.receivedchunk[(zz * p.sizeY + yy) * p.sizeX + xx] = block;
									}
									i += 2;
								}
							}
						}
					}
				}
				else {
					int size = p.sizeX * p.sizeY * p.sizeZ;
					for (int i = 0; i < size; i++) {
						this.receivedchunk[i] = 0;
					}
				}
				{
					this.game.map.setMapPortion(p.x, p.y, p.z, this.receivedchunk, p.sizeX, p.sizeY, p.sizeZ);
					for (int xx = 0; xx < 2; xx++) {
						for (int yy = 0; yy < 2; yy++) {
							for (int zz = 0; zz < 2; zz++) {
							}
						}
					}
				}
				this.game.receivedMapLength += this.currentChunkCount;
				this.currentChunkCount = 0;
			}
			break;
		case 21:
			{
				Packet_ServerHeightmapChunk p = packet.heightmapChunk;
				this.game.platform.gzipDecompress(p.compressedHeightmap, this.game.platform.byteArrayLength(p.compressedHeightmap), this.decompressedchunk);
				int[] decompressedchunk1 = Game.byteArrayToUshortArray(this.decompressedchunk, p.sizeX * p.sizeY * 2);
				for (int xx = 0; xx < p.sizeX; xx++) {
					for (int yy = 0; yy < p.sizeY; yy++) {
						int height = decompressedchunk1[MapUtilCi.index2d(xx, yy, p.sizeX)];
						this.game.d_Heightmap.setBlock(p.x + xx, p.y + yy, height);
					}
				}
			}
			break;
		}
	}

	public final void tryReadPacket(byte[] data, int dataLength)
	{
		Packet_Server packet = new Packet_Server();
		Packet_ServerSerializer.deserializeBuffer(data, dataLength, packet);
		this.processInBackground(packet);
		ProcessPacketTask task = new ProcessPacketTask();
		task.game = this.game;
		task.packet_ = packet;
		this.game.queueActionCommit(task);
		this.game.lastReceivedMilliseconds = this.game.currentTimeMilliseconds;
	}
	private byte[] decompressedchunk;
	private Game game;
	private int[] receivedchunk;
}
