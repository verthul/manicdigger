// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class ModNetworkEntity extends ClientMod
{
	public ModNetworkEntity()
	{
		this.spawn = new ClientPacketHandlerEntitySpawn();
		this.position = new ClientPacketHandlerEntityPosition();
		this.despawn = new ClientPacketHandlerEntityDespawn();
	}

	@Override
	public void onNewFrame(Game game, NewFrameEventArgs args)
	{
		game.packetHandlers[66] = this.spawn;
		game.packetHandlers[67] = this.position;
		game.packetHandlers[68] = this.despawn;
	}
	private ClientPacketHandlerEntityDespawn despawn;
	private ClientPacketHandlerEntityPosition position;
	private ClientPacketHandlerEntitySpawn spawn;
}
