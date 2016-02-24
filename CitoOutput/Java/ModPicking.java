// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class ModPicking extends ClientMod
{
	public ModPicking()
	{
		this.unproject = new Unproject();
		this.tempViewport = new float[4];
		this.tempRay = new float[4];
		this.tempRayStartPoint = new float[4];
		this.fillarea = new DictionaryVector3Float();
	}

	final float buildDelay(Game game)
	{
		float default_ = 1f * 95 / 100 * 1 / game.basemovespeed;
		Packet_Item item = game.d_Inventory.rightHand[game.activeMaterial];
		if (item == null || item.itemClass != 0) {
			return default_;
		}
		float delay = game.deserializeFloat(game.blocktypes[item.blockId].delayFloat);
		if (delay == 0) {
			return default_;
		}
		return delay;
	}

	final void clearFillArea(Game game)
	{
		for (int i = 0; i < this.fillarea.itemsCount; i++) {
			Vector3Float k = this.fillarea.items[i];
			if (k == null) {
				continue;
			}
			game.setBlock(k.x, k.y, k.z, game.platform.floatToInt(k.value));
			game.redrawBlock(k.x, k.y, k.z);
		}
		this.fillarea.clear();
	}

	private float currentPickDistance(Game game)
	{
		float pick_distance = game.pICK_DISTANCE;
		IntRef inHand = game.blockInHand();
		if (inHand != null) {
			if (game.blocktypes[inHand.value].pickDistanceWhenUsedFloat > 0) {
				pick_distance = game.deserializeFloat(game.blocktypes[inHand.value].pickDistanceWhenUsedFloat);
			}
		}
		if (game.cameratype == CameraType.TPP) {
			pick_distance = game.tppcameradistance + game.pICK_DISTANCE;
		}
		if (game.cameratype == CameraType.OVERHEAD) {
			if (game.platform.isFastSystem()) {
				pick_distance = 100;
			}
			else {
				pick_distance = game.overheadcameradistance * 2;
			}
		}
		return pick_distance;
	}

	final void fillFill(Game game, Vector3IntRef a_, Vector3IntRef b_)
	{
		int startx = MathCi.minInt(a_.x, b_.x);
		int endx = MathCi.maxInt(a_.x, b_.x);
		int starty = MathCi.minInt(a_.y, b_.y);
		int endy = MathCi.maxInt(a_.y, b_.y);
		int startz = MathCi.minInt(a_.z, b_.z);
		int endz = MathCi.maxInt(a_.z, b_.z);
		for (int x = startx; x <= endx; x++) {
			for (int y = starty; y <= endy; y++) {
				for (int z = startz; z <= endz; z++) {
					if (this.fillarea.count() > game.fillAreaLimit) {
						this.clearFillArea(game);
						return;
					}
					if (!game.isFillBlock(game.map.getBlock(x, y, z))) {
						this.fillarea.set(x, y, z, game.map.getBlock(x, y, z));
						game.setBlock(x, y, z, game.d_Data.blockIdFillArea());
						game.redrawBlock(x, y, z);
					}
				}
			}
		}
	}

	final PointFloatRef getAim(Game game)
	{
		if (game.currentAimRadius() <= 1) {
			return PointFloatRef.create(0, 0);
		}
		float half = 0.5f;
		float x;
		float y;
		for (;;) {
			x = (game.rnd.nextFloat() - half) * game.currentAimRadius() * 2;
			y = (game.rnd.nextFloat() - half) * game.currentAimRadius() * 2;
			float dist1 = game.platform.mathSqrt(x * x + y * y);
			if (dist1 <= game.currentAimRadius()) {
				break;
			}
		}
		return PointFloatRef.create(x, y);
	}

	public final void getPickingLine(Game game, Line3D retPick, boolean ispistolshoot)
	{
		int mouseX;
		int mouseY;
		if (game.cameratype == CameraType.FPP || game.cameratype == CameraType.TPP) {
			mouseX = game.width() / 2;
			mouseY = game.height() / 2;
		}
		else {
			mouseX = game.mouseCurrentX;
			mouseY = game.mouseCurrentY;
		}
		PointFloatRef aim = this.getAim(game);
		if (ispistolshoot && (aim.x != 0 || aim.y != 0)) {
			mouseX += game.platform.floatToInt(aim.x);
			mouseY += game.platform.floatToInt(aim.y);
		}
		this.tempViewport[0] = 0;
		this.tempViewport[1] = 0;
		this.tempViewport[2] = game.width();
		this.tempViewport[3] = game.height();
		this.unproject.unProject(mouseX, game.height() - mouseY, 1, game.mvMatrix.peek(), game.pMatrix.peek(), this.tempViewport, this.tempRay);
		this.unproject.unProject(mouseX, game.height() - mouseY, 0, game.mvMatrix.peek(), game.pMatrix.peek(), this.tempViewport, this.tempRayStartPoint);
		float raydirX = this.tempRay[0] - this.tempRayStartPoint[0];
		float raydirY = this.tempRay[1] - this.tempRayStartPoint[1];
		float raydirZ = this.tempRay[2] - this.tempRayStartPoint[2];
		float raydirLength = game.length(raydirX, raydirY, raydirZ);
		raydirX /= raydirLength;
		raydirY /= raydirLength;
		raydirZ /= raydirLength;
		retPick.start = new float[3];
		retPick.start[0] = this.tempRayStartPoint[0];
		retPick.start[1] = this.tempRayStartPoint[1];
		retPick.start[2] = this.tempRayStartPoint[2];
		float pickDistance1 = this.currentPickDistance(game) * (ispistolshoot ? 100 : 1);
		pickDistance1 += 1;
		retPick.end = new float[3];
		retPick.end[0] = this.tempRayStartPoint[0] + raydirX * pickDistance1;
		retPick.end[1] = this.tempRayStartPoint[1] + raydirY * pickDistance1;
		retPick.end[2] = this.tempRayStartPoint[2] + raydirZ * pickDistance1;
	}

	final void nextBullet(Game game, int bulletsshot)
	{
		float one = 1;
		boolean left = game.mouseLeft;
		boolean middle = game.mouseMiddle;
		boolean right = game.mouseRight;
		boolean IsNextShot = bulletsshot != 0;
		if (!game.leftpressedpicking) {
			if (game.mouseleftclick) {
				game.leftpressedpicking = true;
			}
			else {
				left = false;
			}
		}
		else {
			if (game.mouseleftdeclick) {
				game.leftpressedpicking = false;
				left = false;
			}
		}
		if (!left) {
			game.currentAttackedBlock = null;
		}
		Packet_Item item = game.d_Inventory.rightHand[game.activeMaterial];
		boolean ispistol = item != null && game.blocktypes[item.blockId].isPistol;
		boolean ispistolshoot = ispistol && left;
		boolean isgrenade = ispistol && game.blocktypes[item.blockId].pistolType == 1;
		if (ispistol && isgrenade) {
			ispistolshoot = game.mouseleftdeclick;
		}
		if (game.mouseleftclick) {
			game.grenadecookingstartMilliseconds = game.platform.timeMillisecondsFromStart();
			if (ispistol && isgrenade) {
				if (game.blocktypes[item.blockId].sounds.shootCount > 0) {
					game.audioPlay(game.platform.stringFormat("{0}.ogg", game.blocktypes[item.blockId].sounds.shoot[0]));
				}
			}
		}
		float wait = one * (game.platform.timeMillisecondsFromStart() - game.grenadecookingstartMilliseconds) / 1000;
		if (isgrenade && left) {
			if (wait >= game.grenadetime && isgrenade && game.grenadecookingstartMilliseconds != 0) {
				ispistolshoot = true;
				game.mouseleftdeclick = true;
			}
			else {
				return;
			}
		}
		else {
			game.grenadecookingstartMilliseconds = 0;
		}
		if (ispistol && game.mouserightclick && game.platform.timeMillisecondsFromStart() - game.lastironsightschangeMilliseconds >= 500) {
			game.ironSights = !game.ironSights;
			game.lastironsightschangeMilliseconds = game.platform.timeMillisecondsFromStart();
		}
		IntRef pick2count = new IntRef();
		Line3D pick = new Line3D();
		this.getPickingLine(game, pick, ispistolshoot);
		BlockPosSide[] pick2 = game.pick(game.s, pick, pick2count);
		if (left) {
			game.handSetAttackDestroy = true;
		}
		else if (right) {
			game.handSetAttackBuild = true;
		}
		if (game.overheadcamera && pick2count.value > 0 && left) {
			if (game.follow == null) {
				game.playerdestination = Vector3Ref.create(pick2[0].blockPos[0], pick2[0].blockPos[1] + 1, pick2[0].blockPos[2]);
			}
		}
		boolean pickdistanceok = pick2count.value > 0;
		if (pickdistanceok) {
			if (game.dist(pick2[0].blockPos[0] + one / 2, pick2[0].blockPos[1] + one / 2, pick2[0].blockPos[2] + one / 2, pick.start[0], pick.start[1], pick.start[2]) > this.currentPickDistance(game)) {
				pickdistanceok = false;
			}
		}
		boolean playertileempty = game.isTileEmptyForPhysics(game.platform.floatToInt(game.player.position.x), game.platform.floatToInt(game.player.position.z), game.platform.floatToInt(game.player.position.y + one / 2));
		boolean playertileemptyclose = game.isTileEmptyForPhysicsClose(game.platform.floatToInt(game.player.position.x), game.platform.floatToInt(game.player.position.z), game.platform.floatToInt(game.player.position.y + one / 2));
		BlockPosSide pick0 = new BlockPosSide();
		if (pick2count.value > 0 && (pickdistanceok && (playertileempty || playertileemptyclose) || game.overheadcamera)) {
			game.selectedBlockPositionX = game.platform.floatToInt(pick2[0].current()[0]);
			game.selectedBlockPositionY = game.platform.floatToInt(pick2[0].current()[1]);
			game.selectedBlockPositionZ = game.platform.floatToInt(pick2[0].current()[2]);
			pick0 = pick2[0];
		}
		else {
			game.selectedBlockPositionX = -1;
			game.selectedBlockPositionY = -1;
			game.selectedBlockPositionZ = -1;
			pick0.blockPos = new float[3];
			pick0.blockPos[0] = -1;
			pick0.blockPos[1] = -1;
			pick0.blockPos[2] = -1;
		}
		this.pickEntity(game, pick, pick2, pick2count);
		if (game.cameratype == CameraType.FPP || game.cameratype == CameraType.TPP) {
			int ntileX = game.platform.floatToInt(pick0.current()[0]);
			int ntileY = game.platform.floatToInt(pick0.current()[1]);
			int ntileZ = game.platform.floatToInt(pick0.current()[2]);
			if (game.isUsableBlock(game.map.getBlock(ntileX, ntileZ, ntileY))) {
				game.currentAttackedBlock = Vector3IntRef.create(ntileX, ntileZ, ntileY);
			}
		}
		if (game.getFreeMouse()) {
			if (pick2count.value > 0) {
				this.onPick_(pick0);
			}
			return;
		}
		if (one * (game.platform.timeMillisecondsFromStart() - this.lastbuildMilliseconds) / 1000 >= this.buildDelay(game) || IsNextShot) {
			if (left && game.d_Inventory.rightHand[game.activeMaterial] == null) {
				game.sendPacketClient(ClientPackets.monsterHit(game.platform.floatToInt(2 + game.rnd.nextFloat() * 4)));
			}
			if (left && !this.fastclicking) {
				this.fastclicking = false;
			}
			if ((left || right || middle) && !isgrenade) {
				this.lastbuildMilliseconds = game.platform.timeMillisecondsFromStart();
			}
			if (isgrenade && game.mouseleftdeclick) {
				this.lastbuildMilliseconds = game.platform.timeMillisecondsFromStart();
			}
			if (game.reloadstartMilliseconds != 0) {
				this.pickingEnd(left, right, middle, ispistol);
				return;
			}
			if (ispistolshoot) {
				if (!(game.loadedAmmo[item.blockId] > 0) || !(game.totalAmmo[item.blockId] > 0)) {
					game.audioPlay("Dry Fire Gun-SoundBible.com-2053652037.ogg");
					this.pickingEnd(left, right, middle, ispistol);
					return;
				}
			}
			if (ispistolshoot) {
				float toX = pick.end[0];
				float toY = pick.end[1];
				float toZ = pick.end[2];
				if (pick2count.value > 0) {
					toX = pick2[0].blockPos[0];
					toY = pick2[0].blockPos[1];
					toZ = pick2[0].blockPos[2];
				}
				Packet_ClientShot shot = new Packet_ClientShot();
				shot.fromX = game.serializeFloat(pick.start[0]);
				shot.fromY = game.serializeFloat(pick.start[1]);
				shot.fromZ = game.serializeFloat(pick.start[2]);
				shot.toX = game.serializeFloat(toX);
				shot.toY = game.serializeFloat(toY);
				shot.toZ = game.serializeFloat(toZ);
				shot.hitPlayer = -1;
				for (int i = 0; i < game.entitiesCount; i++) {
					if (game.entities[i] == null) {
						continue;
					}
					if (game.entities[i].drawModel == null) {
						continue;
					}
					Entity p_ = game.entities[i];
					if (p_.networkPosition == null) {
						continue;
					}
					if (!p_.networkPosition.positionLoaded) {
						continue;
					}
					float feetposX = p_.position.x;
					float feetposY = p_.position.y;
					float feetposZ = p_.position.z;
					Box3D bodybox = new Box3D();
					float headsize = (p_.drawModel.modelHeight - p_.drawModel.eyeHeight) * 2;
					float h = p_.drawModel.modelHeight - headsize;
					float r = one * 35 / 100;
					bodybox.addPoint(feetposX - r, feetposY + 0, feetposZ - r);
					bodybox.addPoint(feetposX - r, feetposY + 0, feetposZ + r);
					bodybox.addPoint(feetposX + r, feetposY + 0, feetposZ - r);
					bodybox.addPoint(feetposX + r, feetposY + 0, feetposZ + r);
					bodybox.addPoint(feetposX - r, feetposY + h, feetposZ - r);
					bodybox.addPoint(feetposX - r, feetposY + h, feetposZ + r);
					bodybox.addPoint(feetposX + r, feetposY + h, feetposZ - r);
					bodybox.addPoint(feetposX + r, feetposY + h, feetposZ + r);
					Box3D headbox = new Box3D();
					headbox.addPoint(feetposX - r, feetposY + h, feetposZ - r);
					headbox.addPoint(feetposX - r, feetposY + h, feetposZ + r);
					headbox.addPoint(feetposX + r, feetposY + h, feetposZ - r);
					headbox.addPoint(feetposX + r, feetposY + h, feetposZ + r);
					headbox.addPoint(feetposX - r, feetposY + h + headsize, feetposZ - r);
					headbox.addPoint(feetposX - r, feetposY + h + headsize, feetposZ + r);
					headbox.addPoint(feetposX + r, feetposY + h + headsize, feetposZ - r);
					headbox.addPoint(feetposX + r, feetposY + h + headsize, feetposZ + r);
					float[] p;
					float localeyeposX = game.eyesPosX();
					float localeyeposY = game.eyesPosY();
					float localeyeposZ = game.eyesPosZ();
					p = Intersection.checkLineBoxExact(pick, headbox);
					if (p != null) {
						if (pick2count.value == 0 || game.dist(pick2[0].blockPos[0], pick2[0].blockPos[1], pick2[0].blockPos[2], localeyeposX, localeyeposY, localeyeposZ) > game.dist(p[0], p[1], p[2], localeyeposX, localeyeposY, localeyeposZ)) {
							if (!isgrenade) {
								Entity entity = new Entity();
								Sprite sprite = new Sprite();
								sprite.positionX = p[0];
								sprite.positionY = p[1];
								sprite.positionZ = p[2];
								sprite.image = "blood.png";
								entity.sprite = sprite;
								entity.expires = Expires.create(one * 2 / 10);
								game.entityAddLocal(entity);
							}
							shot.hitPlayer = i;
							shot.isHitHead = 1;
						}
					}
					else {
						p = Intersection.checkLineBoxExact(pick, bodybox);
						if (p != null) {
							if (pick2count.value == 0 || game.dist(pick2[0].blockPos[0], pick2[0].blockPos[1], pick2[0].blockPos[2], localeyeposX, localeyeposY, localeyeposZ) > game.dist(p[0], p[1], p[2], localeyeposX, localeyeposY, localeyeposZ)) {
								if (!isgrenade) {
									Entity entity = new Entity();
									Sprite sprite = new Sprite();
									sprite.positionX = p[0];
									sprite.positionY = p[1];
									sprite.positionZ = p[2];
									sprite.image = "blood.png";
									entity.sprite = sprite;
									entity.expires = Expires.create(one * 2 / 10);
									game.entityAddLocal(entity);
								}
								shot.hitPlayer = i;
								shot.isHitHead = 0;
							}
						}
					}
				}
				shot.weaponBlock = item.blockId;
				game.loadedAmmo[item.blockId] = game.loadedAmmo[item.blockId] - 1;
				game.totalAmmo[item.blockId] = game.totalAmmo[item.blockId] - 1;
				float projectilespeed = game.deserializeFloat(game.blocktypes[item.blockId].projectileSpeedFloat);
				if (projectilespeed == 0) {
					{
						Entity entity = game.createBulletEntity(pick.start[0], pick.start[1], pick.start[2], toX, toY, toZ, 150);
						game.entityAddLocal(entity);
					}
				}
				else {
					float vX = toX - pick.start[0];
					float vY = toY - pick.start[1];
					float vZ = toZ - pick.start[2];
					float vLength = game.length(vX, vY, vZ);
					vX /= vLength;
					vY /= vLength;
					vZ /= vLength;
					vX *= projectilespeed;
					vY *= projectilespeed;
					vZ *= projectilespeed;
					shot.explodesAfter = game.serializeFloat(game.grenadetime - wait);
					{
						Entity grenadeEntity = new Entity();
						Sprite sprite = new Sprite();
						sprite.image = "ChemicalGreen.png";
						sprite.size = 14;
						sprite.animationcount = 0;
						sprite.positionX = pick.start[0];
						sprite.positionY = pick.start[1];
						sprite.positionZ = pick.start[2];
						grenadeEntity.sprite = sprite;
						Grenade_ projectile = new Grenade_();
						projectile.velocityX = vX;
						projectile.velocityY = vY;
						projectile.velocityZ = vZ;
						projectile.block = item.blockId;
						projectile.sourcePlayer = game.localPlayerId;
						grenadeEntity.expires = Expires.create(game.grenadetime - wait);
						grenadeEntity.grenade = projectile;
						game.entityAddLocal(grenadeEntity);
					}
				}
				Packet_Client packet = new Packet_Client();
				packet.id = 54;
				packet.shot = shot;
				game.sendPacketClient(packet);
				if (game.blocktypes[item.blockId].sounds.shootEndCount > 0) {
					game.pistolcycle = game.rnd.next() % game.blocktypes[item.blockId].sounds.shootEndCount;
					game.audioPlay(game.platform.stringFormat("{0}.ogg", game.blocktypes[item.blockId].sounds.shootEnd[game.pistolcycle]));
				}
				bulletsshot++;
				if (bulletsshot < game.deserializeFloat(game.blocktypes[item.blockId].bulletsPerShotFloat)) {
					this.nextBullet(game, bulletsshot);
				}
				game.player.position.rotx -= game.rnd.nextFloat() * game.currentRecoil();
				game.player.position.roty += game.rnd.nextFloat() * game.currentRecoil() * 2 - game.currentRecoil();
				this.pickingEnd(left, right, middle, ispistol);
				return;
			}
			if (ispistol && right) {
				this.pickingEnd(left, right, middle, ispistol);
				return;
			}
			if (pick2count.value > 0) {
				if (middle) {
					int newtileX = game.platform.floatToInt(pick0.current()[0]);
					int newtileY = game.platform.floatToInt(pick0.current()[1]);
					int newtileZ = game.platform.floatToInt(pick0.current()[2]);
					if (game.map.isValidPos(newtileX, newtileZ, newtileY)) {
						int clonesource = game.map.getBlock(newtileX, newtileZ, newtileY);
						int clonesource2 = game.d_Data.whenPlayerPlacesGetsConvertedTo()[clonesource];
						boolean gotoDone = false;
						for (int i = 0; i < 10; i++) {
							if (game.d_Inventory.rightHand[i] != null && game.d_Inventory.rightHand[i].itemClass == 0 && game.d_Inventory.rightHand[i].blockId == clonesource2) {
								game.activeMaterial = i;
								gotoDone = true;
							}
						}
						if (!gotoDone) {
							IntRef freehand = game.d_InventoryUtil.freeHand(game.activeMaterial);
							for (int i = 0; i < game.d_Inventory.itemsCount; i++) {
								Packet_PositionItem k = game.d_Inventory.items[i];
								if (k == null) {
									continue;
								}
								if (k.value_.itemClass == 0 && k.value_.blockId == clonesource2) {
									if (freehand != null) {
										game.wearItem(game.inventoryPositionMainArea(k.x, k.y), game.inventoryPositionMaterialSelector(freehand.value));
										break;
									}
									if (game.d_Inventory.rightHand[game.activeMaterial] != null && game.d_Inventory.rightHand[game.activeMaterial].itemClass == 0) {
										game.moveToInventory(game.inventoryPositionMaterialSelector(game.activeMaterial));
										game.wearItem(game.inventoryPositionMainArea(k.x, k.y), game.inventoryPositionMaterialSelector(game.activeMaterial));
									}
								}
							}
						}
						String[] sound = game.d_Data.cloneSound()[clonesource];
						if (sound != null) {
							game.audioPlay(sound[0]);
						}
					}
				}
				if (left || right) {
					BlockPosSide tile = pick0;
					int newtileX;
					int newtileY;
					int newtileZ;
					if (right) {
						newtileX = game.platform.floatToInt(tile.translated()[0]);
						newtileY = game.platform.floatToInt(tile.translated()[1]);
						newtileZ = game.platform.floatToInt(tile.translated()[2]);
					}
					else {
						newtileX = game.platform.floatToInt(tile.current()[0]);
						newtileY = game.platform.floatToInt(tile.current()[1]);
						newtileZ = game.platform.floatToInt(tile.current()[2]);
					}
					if (game.map.isValidPos(newtileX, newtileZ, newtileY)) {
						if (!(pick0.blockPos[0] == -1 && pick0.blockPos[1] == -1 && pick0.blockPos[2] == -1)) {
							int blocktype;
							if (left) {
								blocktype = game.map.getBlock(newtileX, newtileZ, newtileY);
							}
							else {
								blocktype = game.blockInHand() == null ? 1 : game.blockInHand().value;
							}
							if (left && blocktype == game.d_Data.blockIdAdminium()) {
								this.pickingEnd(left, right, middle, ispistol);
								return;
							}
							String[] sound = left ? game.d_Data.breakSound()[blocktype] : game.d_Data.buildSound()[blocktype];
							if (sound != null) {
								game.audioPlay(sound[0]);
							}
						}
						if (!right) {
							int posx = newtileX;
							int posy = newtileZ;
							int posz = newtileY;
							game.currentAttackedBlock = Vector3IntRef.create(posx, posy, posz);
							if (!game.blockHealth.containsKey(posx, posy, posz)) {
								game.blockHealth.set(posx, posy, posz, game.getCurrentBlockHealth(posx, posy, posz));
							}
							game.blockHealth.set(posx, posy, posz, game.blockHealth.get(posx, posy, posz) - game.weaponAttackStrength());
							float health = game.getCurrentBlockHealth(posx, posy, posz);
							if (health <= 0) {
								if (game.currentAttackedBlock != null) {
									game.blockHealth.remove(posx, posy, posz);
								}
								game.currentAttackedBlock = null;
								this.onPick(game, game.platform.floatToInt(newtileX), game.platform.floatToInt(newtileZ), game.platform.floatToInt(newtileY), game.platform.floatToInt(tile.current()[0]), game.platform.floatToInt(tile.current()[2]), game.platform.floatToInt(tile.current()[1]), tile.collisionPos, right);
							}
							this.pickingEnd(left, right, middle, ispistol);
							return;
						}
						if (!right) {
							game.particleEffectBlockBreak.startParticleEffect(newtileX, newtileY, newtileZ);
						}
						if (!game.map.isValidPos(newtileX, newtileZ, newtileY)) {
							game.platform.throwException("Error in picking - NextBullet()");
						}
						this.onPick(game, game.platform.floatToInt(newtileX), game.platform.floatToInt(newtileZ), game.platform.floatToInt(newtileY), game.platform.floatToInt(tile.current()[0]), game.platform.floatToInt(tile.current()[2]), game.platform.floatToInt(tile.current()[1]), tile.collisionPos, right);
					}
				}
			}
		}
		this.pickingEnd(left, right, middle, ispistol);
	}

	@Override
	public void onMouseDown(Game game, MouseEventArgs args)
	{
		if (game.guistate == GuiState.NORMAL) {
			this.updatePicking(game);
			this.updateEntityHit(game);
		}
	}

	@Override
	public void onMouseUp(Game game, MouseEventArgs args)
	{
		if (game.guistate == GuiState.NORMAL) {
			this.updatePicking(game);
		}
	}

	@Override
	public void onNewFrameReadOnlyMainThread(Game game, float deltaTime)
	{
		if (game.guistate == GuiState.NORMAL) {
			this.updatePicking(game);
		}
	}

	final void onPick(Game game, int blockposX, int blockposY, int blockposZ, int blockposoldX, int blockposoldY, int blockposoldZ, float[] collisionPos, boolean right)
	{
		float xfract = collisionPos[0] - game.mathFloor(collisionPos[0]);
		float zfract = collisionPos[2] - game.mathFloor(collisionPos[2]);
		int activematerial = game.materialSlots_(game.activeMaterial);
		int railstart = game.d_Data.blockIdRailstart();
		if (activematerial == railstart + 3 || activematerial == railstart + 60) {
			int dirnew;
			if (activematerial == railstart + 3) {
				dirnew = this.pickHorizontalVertical(xfract, zfract);
			}
			else {
				dirnew = this.pickCorners(xfract, zfract);
			}
			int dir = game.d_Data.rail()[game.map.getBlock(blockposoldX, blockposoldY, blockposoldZ)];
			if (dir != 0) {
				blockposX = blockposoldX;
				blockposY = blockposoldY;
				blockposZ = blockposoldZ;
			}
			activematerial = railstart + (dir | DirectionUtils.toRailDirectionFlags(dirnew));
		}
		int x = game.platform.floatToInt(blockposX);
		int y = game.platform.floatToInt(blockposY);
		int z = game.platform.floatToInt(blockposZ);
		int mode = right ? 1 : 0;
		{
			if (game.isAnyPlayerInPos(x, y, z) || activematerial == 151) {
				return;
			}
			Vector3IntRef v = Vector3IntRef.create(x, y, z);
			Vector3IntRef oldfillstart = this.fillstart;
			Vector3IntRef oldfillend = this.fillend;
			if (mode == 1) {
				if (game.blocktypes[activematerial].isTool) {
					this.onPickUseWithTool(game, blockposX, blockposY, blockposZ);
					return;
				}
				if (activematerial == game.d_Data.blockIdCuboid()) {
					this.clearFillArea(game);
					if (this.fillstart != null) {
						Vector3IntRef f = this.fillstart;
						if (!game.isFillBlock(game.map.getBlock(f.x, f.y, f.z))) {
							this.fillarea.set(f.x, f.y, f.z, game.map.getBlock(f.x, f.y, f.z));
						}
						game.setBlock(f.x, f.y, f.z, game.d_Data.blockIdFillStart());
						this.fillFill(game, v, this.fillstart);
					}
					if (!game.isFillBlock(game.map.getBlock(v.x, v.y, v.z))) {
						this.fillarea.set(v.x, v.y, v.z, game.map.getBlock(v.x, v.y, v.z));
					}
					game.setBlock(v.x, v.y, v.z, game.d_Data.blockIdCuboid());
					this.fillend = v;
					game.redrawBlock(v.x, v.y, v.z);
					return;
				}
				if (activematerial == game.d_Data.blockIdFillStart()) {
					this.clearFillArea(game);
					if (!game.isFillBlock(game.map.getBlock(v.x, v.y, v.z))) {
						this.fillarea.set(v.x, v.y, v.z, game.map.getBlock(v.x, v.y, v.z));
					}
					game.setBlock(v.x, v.y, v.z, game.d_Data.blockIdFillStart());
					this.fillstart = v;
					this.fillend = null;
					game.redrawBlock(v.x, v.y, v.z);
					return;
				}
				if (this.fillarea.containsKey(v.x, v.y, v.z)) {
					game.sendFillArea(this.fillstart.x, this.fillstart.y, this.fillstart.z, this.fillend.x, this.fillend.y, this.fillend.z, activematerial);
					this.clearFillArea(game);
					this.fillstart = null;
					this.fillend = null;
					return;
				}
			}
			else {
				if (game.blocktypes[activematerial].isTool) {
					this.onPickUseWithTool(game, blockposX, blockposY, blockposoldZ);
					return;
				}
				if (this.fillstart != null && this.fillstart.x == v.x && this.fillstart.y == v.y && this.fillstart.z == v.z) {
					this.clearFillArea(game);
					this.fillstart = null;
					this.fillend = null;
					return;
				}
				if (this.fillend != null && this.fillend.x == v.x && this.fillend.y == v.y && this.fillend.z == v.z) {
					this.clearFillArea(game);
					this.fillend = null;
					return;
				}
			}
			game.sendSetBlockAndUpdateSpeculative(activematerial, x, y, z, mode);
		}
	}

	final void onPickUseWithTool(Game game, int posX, int posY, int posZ)
	{
		game.sendSetBlock(posX, posY, posZ, 3, game.d_Inventory.rightHand[game.activeMaterial].blockId, game.activeMaterial);
	}

	final void onPick_(BlockPosSide pick0)
	{
	}

	final int pickCorners(float xfract, float zfract)
	{
		float half = 0.5f;
		if (xfract < half && zfract < half) {
			return RailDirection.UP_LEFT;
		}
		if (xfract >= half && zfract < half) {
			return RailDirection.UP_RIGHT;
		}
		if (xfract < half && zfract >= half) {
			return RailDirection.DOWN_LEFT;
		}
		return RailDirection.DOWN_RIGHT;
	}

	private void pickEntity(Game game, Line3D pick, BlockPosSide[] pick2, IntRef pick2count)
	{
		game.selectedEntityId = -1;
		game.currentlyAttackedEntity = -1;
		float one = 1;
		for (int i = 0; i < game.entitiesCount; i++) {
			if (game.entities[i] == null) {
				continue;
			}
			if (i == game.localPlayerId) {
				continue;
			}
			if (game.entities[i].drawModel == null) {
				continue;
			}
			Entity p_ = game.entities[i];
			if (p_.networkPosition == null) {
				continue;
			}
			if (!p_.networkPosition.positionLoaded) {
				continue;
			}
			if (!p_.usable) {
				continue;
			}
			float feetposX = p_.position.x;
			float feetposY = p_.position.y;
			float feetposZ = p_.position.z;
			float dist = game.dist(feetposX, feetposY, feetposZ, game.player.position.x, game.player.position.y, game.player.position.z);
			if (dist > 5) {
				continue;
			}
			Box3D bodybox = new Box3D();
			float h = p_.drawModel.modelHeight;
			float r = one * 35 / 100;
			bodybox.addPoint(feetposX - r, feetposY + 0, feetposZ - r);
			bodybox.addPoint(feetposX - r, feetposY + 0, feetposZ + r);
			bodybox.addPoint(feetposX + r, feetposY + 0, feetposZ - r);
			bodybox.addPoint(feetposX + r, feetposY + 0, feetposZ + r);
			bodybox.addPoint(feetposX - r, feetposY + h, feetposZ - r);
			bodybox.addPoint(feetposX - r, feetposY + h, feetposZ + r);
			bodybox.addPoint(feetposX + r, feetposY + h, feetposZ - r);
			bodybox.addPoint(feetposX + r, feetposY + h, feetposZ + r);
			float[] p;
			float localeyeposX = game.eyesPosX();
			float localeyeposY = game.eyesPosY();
			float localeyeposZ = game.eyesPosZ();
			p = Intersection.checkLineBoxExact(pick, bodybox);
			if (p != null) {
				if (pick2count.value == 0 || game.dist(pick2[0].blockPos[0], pick2[0].blockPos[1], pick2[0].blockPos[2], localeyeposX, localeyeposY, localeyeposZ) > game.dist(p[0], p[1], p[2], localeyeposX, localeyeposY, localeyeposZ)) {
					game.selectedEntityId = i;
					if (game.cameratype == CameraType.FPP || game.cameratype == CameraType.TPP) {
						game.currentlyAttackedEntity = i;
					}
				}
			}
		}
	}

	final int pickHorizontalVertical(float xfract, float yfract)
	{
		float x = xfract;
		float y = yfract;
		if (y >= x && y >= 1 - x) {
			return RailDirection.VERTICAL;
		}
		if (y < x && y < 1 - x) {
			return RailDirection.VERTICAL;
		}
		return RailDirection.HORIZONTAL;
	}

	final void pickingEnd(boolean left, boolean right, boolean middle, boolean ispistol)
	{
		this.fastclicking = false;
		if (!(left || right || middle) && !ispistol) {
			this.lastbuildMilliseconds = 0;
			this.fastclicking = true;
		}
	}

	private void updateEntityHit(Game game)
	{
		if (game.currentlyAttackedEntity != -1 && game.mouseLeft) {
			for (int i = 0; i < game.clientmodsCount; i++) {
				if (game.clientmods[i] == null) {
					continue;
				}
				OnUseEntityArgs args = new OnUseEntityArgs();
				args.entityId = game.currentlyAttackedEntity;
				game.clientmods[i].onHitEntity(game, args);
			}
			game.sendPacketClient(ClientPackets.hitEntity(game.currentlyAttackedEntity));
		}
	}

	final void updatePicking(Game game)
	{
		if (game.followId() != null) {
			game.selectedBlockPositionX = -1;
			game.selectedBlockPositionY = -1;
			game.selectedBlockPositionZ = -1;
			return;
		}
		this.nextBullet(game, 0);
	}
	boolean fastclicking;
	DictionaryVector3Float fillarea;
	Vector3IntRef fillend;
	Vector3IntRef fillstart;
	int lastbuildMilliseconds;
	private float[] tempRay;
	private float[] tempRayStartPoint;
	private float[] tempViewport;
	private Unproject unproject;
}
