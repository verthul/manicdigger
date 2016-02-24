// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class ClientPacketHandlerEntitySpawn extends ClientPacketHandler
{

	@Override
	public void handle(Game game, Packet_Server packet)
	{
		Entity entity = game.entities[packet.entitySpawn.id];
		if (entity == null) {
			entity = new Entity();
		}
		ClientPacketHandlerEntitySpawn.toClientEntity(game, packet.entitySpawn.entity_, entity, packet.entitySpawn.id != game.localPlayerId);
		game.entities[packet.entitySpawn.id] = entity;
		if (packet.entitySpawn.id == game.localPlayerId) {
			entity.networkPosition = null;
			game.player = entity;
			if (!game.spawned) {
				entity.scripts[entity.scriptsCount++] = new ScriptCharacterPhysics();
				game.mapLoaded();
				game.spawned = true;
			}
		}
	}

	public static Entity toClientEntity(Game game, Packet_ServerEntity entity, Entity old, boolean updatePosition)
	{
		if (entity.position != null) {
			if (old.position == null || updatePosition) {
				old.networkPosition = ClientPacketHandlerEntitySpawn.toClientEntityPosition(entity.position);
				old.networkPosition.positionLoaded = true;
				old.networkPosition.lastUpdateMilliseconds = game.platform.timeMillisecondsFromStart();
				old.position = ClientPacketHandlerEntitySpawn.toClientEntityPosition(entity.position);
			}
		}
		if (entity.drawModel != null) {
			old.drawModel = new EntityDrawModel();
			old.drawModel.eyeHeight = game.deserializeFloat(entity.drawModel.eyeHeight);
			old.drawModel.modelHeight = game.deserializeFloat(entity.drawModel.modelHeight);
			old.drawModel.texture_ = entity.drawModel.texture_;
			old.drawModel.model_ = entity.drawModel.model_;
			if (old.drawModel.model_ == null) {
				old.drawModel.model_ = "player.txt";
			}
			old.drawModel.downloadSkin = entity.drawModel.downloadSkin != 0;
		}
		if (entity.drawName_ != null) {
			old.drawName = new DrawName();
			if (entity.drawName_.color != null) {
				old.drawName.name = game.platform.stringFormat2("{0}{1}", entity.drawName_.color, entity.drawName_.name);
			}
			else {
				old.drawName.name = entity.drawName_.name;
			}
			if (!game.platform.stringStartsWithIgnoreCase(old.drawName.name, "&")) {
				old.drawName.name = game.platform.stringFormat("&f{0}", old.drawName.name);
			}
			old.drawName.onlyWhenSelected = entity.drawName_.onlyWhenSelected;
			old.drawName.clientAutoComplete = entity.drawName_.clientAutoComplete;
		}
		if (entity.drawText != null) {
			old.drawText = new EntityDrawText();
			old.drawText.text = entity.drawText.text;
			float one_ = 1;
			old.drawText.dx = one_ * entity.drawText.dx / 32;
			old.drawText.dy = one_ * entity.drawText.dy / 32;
			old.drawText.dz = one_ * entity.drawText.dz / 32;
		}
		else {
			old.drawText = null;
		}
		if (entity.drawBlock != null) {
		}
		if (entity.push != null) {
			old.push = new Packet_ServerExplosion();
			old.push.rangeFloat = entity.push.rangeFloat;
		}
		else {
			old.push = null;
		}
		old.usable = entity.usable;
		if (entity.drawArea != null) {
			old.drawArea = new EntityDrawArea();
			old.drawArea.x = entity.drawArea.x;
			old.drawArea.y = entity.drawArea.y;
			old.drawArea.z = entity.drawArea.z;
			old.drawArea.sizex = entity.drawArea.sizex;
			old.drawArea.sizey = entity.drawArea.sizey;
			old.drawArea.sizez = entity.drawArea.sizez;
		}
		else {
			old.drawArea = null;
		}
		return old;
	}

	public static EntityPosition_ toClientEntityPosition(Packet_PositionAndOrientation pos)
	{
		float one = 1;
		EntityPosition_ p = new EntityPosition_();
		p.x = one * pos.x / 32;
		p.y = one * pos.y / 32;
		p.z = one * pos.z / 32;
		p.rotx = Game.angle256ToRad(pos.pitch);
		p.roty = Game.angle256ToRad(pos.heading);
		return p;
	}
}
