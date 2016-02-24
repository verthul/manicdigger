// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class ModInterpolatePositions extends ClientMod
{

	final void interpolatePositions(Game game, float dt)
	{
		for (int i = 0; i < game.entitiesCount; i++) {
			Entity e = game.entities[i];
			if (e == null) {
				continue;
			}
			if (e.networkPosition == null) {
				continue;
			}
			if (i == game.localPlayerId) {
				continue;
			}
			if (!e.networkPosition.positionLoaded) {
				continue;
			}
			if (e.playerDrawInfo == null) {
				e.playerDrawInfo = new PlayerDrawInfo();
			}
			if (e.playerDrawInfo.interpolation == null) {
				NetworkInterpolation n = new NetworkInterpolation();
				PlayerInterpolate playerInterpolate = new PlayerInterpolate();
				playerInterpolate.platform = game.platform;
				n.req = playerInterpolate;
				n.dELAYMILLISECONDS = 500;
				n.eXTRAPOLATE = false;
				n.eXTRAPOLATION_TIMEMILLISECONDS = 300;
				e.playerDrawInfo.interpolation = n;
			}
			e.playerDrawInfo.interpolation.dELAYMILLISECONDS = MathCi.maxInt(100, game.serverInfo.serverPing.roundtripTimeTotalMilliseconds());
			Entity p = e;
			PlayerDrawInfo info = p.playerDrawInfo;
			float networkposX = p.networkPosition.x;
			float networkposY = p.networkPosition.y;
			float networkposZ = p.networkPosition.z;
			if (!game.vec3Equal(networkposX, networkposY, networkposZ, info.lastnetworkposX, info.lastnetworkposY, info.lastnetworkposZ) || p.networkPosition.rotx != info.lastnetworkrotx || p.networkPosition.roty != info.lastnetworkroty || p.networkPosition.rotz != info.lastnetworkrotz) {
				PlayerInterpolationState state = new PlayerInterpolationState();
				state.positionX = networkposX;
				state.positionY = networkposY;
				state.positionZ = networkposZ;
				state.rotx = p.networkPosition.rotx;
				state.roty = p.networkPosition.roty;
				state.rotz = p.networkPosition.rotz;
				info.interpolation.addNetworkPacket(state, game.totaltimeMilliseconds);
			}
			PlayerInterpolationState curstate = game.platform.castToPlayerInterpolationState(info.interpolation.interpolatedState(game.totaltimeMilliseconds));
			if (curstate == null) {
				curstate = new PlayerInterpolationState();
			}
			if (game.enablePlayerUpdatePositionContainsKey(i) && !game.enablePlayerUpdatePosition(i)) {
				curstate.positionX = p.networkPosition.x;
				curstate.positionY = p.networkPosition.y;
				curstate.positionZ = p.networkPosition.z;
			}
			float curposX = curstate.positionX;
			float curposY = curstate.positionY;
			float curposZ = curstate.positionZ;
			info.velocityX = curposX - info.lastcurposX;
			info.velocityY = curposY - info.lastcurposY;
			info.velocityZ = curposZ - info.lastcurposZ;
			info.moves = !game.vec3Equal(curposX, curposY, curposZ, info.lastcurposX, info.lastcurposY, info.lastcurposZ);
			info.lastcurposX = curposX;
			info.lastcurposY = curposY;
			info.lastcurposZ = curposZ;
			info.lastnetworkposX = networkposX;
			info.lastnetworkposY = networkposY;
			info.lastnetworkposZ = networkposZ;
			info.lastnetworkrotx = p.networkPosition.rotx;
			info.lastnetworkroty = p.networkPosition.roty;
			info.lastnetworkrotz = p.networkPosition.rotz;
			p.position.x = curposX;
			p.position.y = curposY;
			p.position.z = curposZ;
			p.position.rotx = curstate.rotx;
			p.position.roty = curstate.roty;
			p.position.rotz = curstate.rotz;
		}
	}

	@Override
	public void onNewFrame(Game game, NewFrameEventArgs args)
	{
		this.interpolatePositions(game, args.getDt());
	}
}
