// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class GameData
{
	public GameData()
	{
		this.mBlockIdEmpty = 0;
		this.mBlockIdDirt = -1;
		this.mBlockIdSponge = -1;
		this.mBlockIdTrampoline = -1;
		this.mBlockIdAdminium = -1;
		this.mBlockIdCompass = -1;
		this.mBlockIdLadder = -1;
		this.mBlockIdEmptyHand = -1;
		this.mBlockIdCraftingTable = -1;
		this.mBlockIdLava = -1;
		this.mBlockIdStationaryLava = -1;
		this.mBlockIdFillStart = -1;
		this.mBlockIdCuboid = -1;
		this.mBlockIdFillArea = -1;
		this.mBlockIdMinecart = -1;
		this.mBlockIdRailstart = -128;
	}

	public final int blockIdAdminium()
	{
		return this.mBlockIdAdminium;
	}

	public final int blockIdCompass()
	{
		return this.mBlockIdCompass;
	}

	public final int blockIdCraftingTable()
	{
		return this.mBlockIdCraftingTable;
	}

	public final int blockIdCuboid()
	{
		return this.mBlockIdCuboid;
	}

	public final int blockIdDirt()
	{
		return this.mBlockIdDirt;
	}

	public final int blockIdEmpty()
	{
		return this.mBlockIdEmpty;
	}

	public final int blockIdEmptyHand()
	{
		return this.mBlockIdEmptyHand;
	}

	public final int blockIdFillArea()
	{
		return this.mBlockIdFillArea;
	}

	public final int blockIdFillStart()
	{
		return this.mBlockIdFillStart;
	}

	public final int blockIdLadder()
	{
		return this.mBlockIdLadder;
	}

	public final int blockIdLava()
	{
		return this.mBlockIdLava;
	}

	public final int blockIdMinecart()
	{
		return this.mBlockIdMinecart;
	}

	public final int blockIdRailstart()
	{
		return this.mBlockIdRailstart;
	}

	public final int blockIdSponge()
	{
		return this.mBlockIdSponge;
	}

	public final int blockIdStationaryLava()
	{
		return this.mBlockIdStationaryLava;
	}

	public final int blockIdTrampoline()
	{
		return this.mBlockIdTrampoline;
	}

	public final String[][] breakSound()
	{
		return this.mBreakSound;
	}

	public final String[][] buildSound()
	{
		return this.mBuildSound;
	}

	public final String[][] cloneSound()
	{
		return this.mCloneSound;
	}

	public final int[] damageToPlayer()
	{
		return this.mDamageToPlayer;
	}

	public final int[] defaultMaterialSlots()
	{
		return this.mDefaultMaterialSlots;
	}

	private float deserializeFloat(int p)
	{
		float one = 1;
		return one * p / 32;
	}

	private void initialize(int count)
	{
		this.mWhenPlayerPlacesGetsConvertedTo = new int[count];
		this.mIsFlower = new boolean[count];
		this.mRail = new int[count];
		this.mWalkSpeed = new float[count];
		for (int i = 0; i < count; i++) {
			this.mWalkSpeed[i] = 1;
		}
		this.mIsSlipperyWalk = new boolean[count];
		this.mWalkSound = new String[count][];
		for (int i = 0; i < count; i++) {
			this.mWalkSound[i] = new String[8];
		}
		this.mBreakSound = new String[count][];
		for (int i = 0; i < count; i++) {
			this.mBreakSound[i] = new String[8];
		}
		this.mBuildSound = new String[count][];
		for (int i = 0; i < count; i++) {
			this.mBuildSound[i] = new String[8];
		}
		this.mCloneSound = new String[count][];
		for (int i = 0; i < count; i++) {
			this.mCloneSound[i] = new String[8];
		}
		this.mLightRadius = new int[count];
		this.mStartInventoryAmount = new int[count];
		this.mStrength = new float[count];
		this.mDamageToPlayer = new int[count];
		this.mWalkableType = new int[count];
		this.mDefaultMaterialSlots = new int[10];
	}

	public final boolean[] isFlower()
	{
		return this.mIsFlower;
	}

	public final boolean isRailTile(int id)
	{
		return id >= this.blockIdRailstart() && id < this.blockIdRailstart() + 64;
	}

	public final boolean[] isSlipperyWalk()
	{
		return this.mIsSlipperyWalk;
	}

	public final int[] lightRadius()
	{
		return this.mLightRadius;
	}

	public final int[] rail()
	{
		return this.mRail;
	}

	public final boolean setSpecialBlock(Packet_BlockType b, int id)
	{
		switch (b.name) {
		case "Empty":
			this.mBlockIdEmpty = id;
			return true;
		case "Dirt":
			this.mBlockIdDirt = id;
			return true;
		case "Sponge":
			this.mBlockIdSponge = id;
			return true;
		case "Trampoline":
			this.mBlockIdTrampoline = id;
			return true;
		case "Adminium":
			this.mBlockIdAdminium = id;
			return true;
		case "Compass":
			this.mBlockIdCompass = id;
			return true;
		case "Ladder":
			this.mBlockIdLadder = id;
			return true;
		case "EmptyHand":
			this.mBlockIdEmptyHand = id;
			return true;
		case "CraftingTable":
			this.mBlockIdCraftingTable = id;
			return true;
		case "Lava":
			this.mBlockIdLava = id;
			return true;
		case "StationaryLava":
			this.mBlockIdStationaryLava = id;
			return true;
		case "FillStart":
			this.mBlockIdFillStart = id;
			return true;
		case "Cuboid":
			this.mBlockIdCuboid = id;
			return true;
		case "FillArea":
			this.mBlockIdFillArea = id;
			return true;
		case "Minecart":
			this.mBlockIdMinecart = id;
			return true;
		case "Rail0":
			this.mBlockIdRailstart = id;
			return true;
		default:
			return false;
		}
	}
	public static final int SOUND_COUNT = 8;

	public final void start()
	{
		this.initialize(1024);
	}

	public final int[] startInventoryAmount()
	{
		return this.mStartInventoryAmount;
	}

	public final float[] strength()
	{
		return this.mStrength;
	}

	public final void update()
	{
	}

	public final void useBlockType(GamePlatform platform, int id, Packet_BlockType b)
	{
		if (b.name == null) {
			return;
		}
		if (b.whenPlacedGetsConvertedTo != 0) {
			this.mWhenPlayerPlacesGetsConvertedTo[id] = b.whenPlacedGetsConvertedTo;
		}
		else {
			this.mWhenPlayerPlacesGetsConvertedTo[id] = id;
		}
		this.isFlower()[id] = b.drawType == 5;
		this.rail()[id] = b.rail;
		this.walkSpeed()[id] = this.deserializeFloat(b.walkSpeedFloat);
		this.isSlipperyWalk()[id] = b.isSlipperyWalk;
		this.walkSound()[id] = new String[8];
		this.breakSound()[id] = new String[8];
		this.buildSound()[id] = new String[8];
		this.cloneSound()[id] = new String[8];
		if (b.sounds != null) {
			for (int i = 0; i < b.sounds.walkCount; i++) {
				this.walkSound()[id][i] = StringTools.stringAppend(platform, b.sounds.walk[i], ".wav");
			}
			for (int i = 0; i < b.sounds.break1Count; i++) {
				this.breakSound()[id][i] = StringTools.stringAppend(platform, b.sounds.break1[i], ".wav");
			}
			for (int i = 0; i < b.sounds.buildCount; i++) {
				this.buildSound()[id][i] = StringTools.stringAppend(platform, b.sounds.build[i], ".wav");
			}
			for (int i = 0; i < b.sounds.cloneCount; i++) {
				this.cloneSound()[id][i] = StringTools.stringAppend(platform, b.sounds.clone[i], ".wav");
			}
		}
		this.lightRadius()[id] = b.lightRadius;
		this.strength()[id] = b.strength;
		this.damageToPlayer()[id] = b.damageToPlayer;
		this.walkableType1()[id] = b.walkableType;
		this.setSpecialBlock(b, id);
	}

	public final void useBlockTypes(GamePlatform platform, Packet_BlockType[] blocktypes, int count)
	{
		for (int i = 0; i < count; i++) {
			if (blocktypes[i] != null) {
				this.useBlockType(platform, i, blocktypes[i]);
			}
		}
	}

	public final String[][] walkSound()
	{
		return this.mWalkSound;
	}

	public final float[] walkSpeed()
	{
		return this.mWalkSpeed;
	}

	public final int[] walkableType1()
	{
		return this.mWalkableType;
	}

	public final int[] whenPlayerPlacesGetsConvertedTo()
	{
		return this.mWhenPlayerPlacesGetsConvertedTo;
	}
	private int mBlockIdAdminium;
	private int mBlockIdCompass;
	private int mBlockIdCraftingTable;
	private int mBlockIdCuboid;
	private int mBlockIdDirt;
	private int mBlockIdEmpty;
	private int mBlockIdEmptyHand;
	private int mBlockIdFillArea;
	private int mBlockIdFillStart;
	private int mBlockIdLadder;
	private int mBlockIdLava;
	private int mBlockIdMinecart;
	private int mBlockIdRailstart;
	private int mBlockIdSponge;
	private int mBlockIdStationaryLava;
	private int mBlockIdTrampoline;
	private String[][] mBreakSound;
	private String[][] mBuildSound;
	private String[][] mCloneSound;
	private int[] mDamageToPlayer;
	private int[] mDefaultMaterialSlots;
	private boolean[] mIsFlower;
	private boolean[] mIsSlipperyWalk;
	private int[] mLightRadius;
	private int[] mRail;
	private int[] mStartInventoryAmount;
	private float[] mStrength;
	private String[][] mWalkSound;
	private float[] mWalkSpeed;
	private int[] mWalkableType;
	private int[] mWhenPlayerPlacesGetsConvertedTo;
}
