/* Generated automatically with "cito". Do not edit. */
#ifndef _MANICDIGGER_H_
#define _MANICDIGGER_H_
typedef int cibool;
#ifndef TRUE
#define TRUE 1
#endif
#ifndef FALSE
#define FALSE 0
#endif
#ifdef __cplusplus
extern "C" {
#endif
typedef struct Acceleration Acceleration;
typedef struct Action_ Action_;
typedef struct AnimatedModel AnimatedModel;
typedef struct AnimatedModelBinding AnimatedModelBinding;
typedef struct AnimatedModelRenderer AnimatedModelRenderer;
typedef struct Animation Animation;
typedef struct AnimationGlobal AnimationGlobal;
typedef struct AnimationHint AnimationHint;
typedef struct AnimationState AnimationState;
typedef struct Asset Asset;
typedef struct AssetList AssetList;
typedef struct AudioControl AudioControl;
typedef struct AviWriterCi AviWriterCi;
typedef struct BackgroundAction BackgroundAction;
typedef struct BitmapCi BitmapCi;
typedef struct BitmapData_ BitmapData_;
typedef struct BlockOctreeSearcher BlockOctreeSearcher;
typedef struct BlockPosSide BlockPosSide;
typedef struct BlockRendererTorch BlockRendererTorch;

typedef enum {
	BlockSetMode_DESTROY,
	BlockSetMode_CREATE,
	BlockSetMode_USE,
	BlockSetMode_USE_WITH_TOOL
}
BlockSetMode;
typedef struct BlockTypeSimple BlockTypeSimple;
typedef struct BoolRef BoolRef;
typedef struct Box3D Box3D;
typedef struct Bullet_ Bullet_;
typedef struct Button Button;

typedef enum {
	ButtonStyle_BUTTON,
	ButtonStyle_TEXT,
	ButtonStyle_SERVER_ENTRY
}
ButtonStyle;
typedef struct ByteArray ByteArray;
typedef struct CachedTextTexture CachedTextTexture;
typedef struct CachedTexture CachedTexture;
typedef struct CameraMove CameraMove;
typedef struct CameraPoint CameraPoint;

typedef enum {
	CameraType_FPP,
	CameraType_TPP,
	CameraType_OVERHEAD
}
CameraType;
typedef struct Chatline Chatline;
typedef struct Chunk Chunk;
typedef struct ChunkSimple ChunkSimple;
typedef struct CitoMemoryStream CitoMemoryStream;

typedef enum {
	CitoSeekOrigin_CURRENT
}
CitoSeekOrigin;
typedef struct CitoStream CitoStream;
typedef struct ClientCommandArgs ClientCommandArgs;
typedef struct ClientInventoryController ClientInventoryController;
typedef struct ClientMod ClientMod;
typedef struct ClientModManager ClientModManager;
typedef struct ClientModManager1 ClientModManager1;
typedef struct ClientPacketHandler ClientPacketHandler;
typedef struct ClientPacketHandlerDialog ClientPacketHandlerDialog;
typedef struct ClientPacketHandlerEntityDespawn ClientPacketHandlerEntityDespawn;
typedef struct ClientPacketHandlerEntityPosition ClientPacketHandlerEntityPosition;
typedef struct ClientPacketHandlerEntitySpawn ClientPacketHandlerEntitySpawn;
typedef struct ClientSimple ClientSimple;
typedef struct Config3d Config3d;
typedef struct ConnectData ConnectData;
typedef struct ConnectedPlayer ConnectedPlayer;
typedef struct Controls Controls;
typedef struct CraftingTableTool CraftingTableTool;
typedef struct DelegateGetBlockHeight DelegateGetBlockHeight;
typedef struct DelegateIsBlockEmpty DelegateIsBlockEmpty;
typedef struct DialogScreen DialogScreen;
typedef struct DictionaryStringAudioData DictionaryStringAudioData;
typedef struct DictionaryStringAudioSample DictionaryStringAudioSample;
typedef struct DictionaryStringInt1024 DictionaryStringInt1024;
typedef struct DictionaryStringString DictionaryStringString;
typedef struct DictionaryVector3Float DictionaryVector3Float;
typedef struct DisplayResolutionCi DisplayResolutionCi;
typedef struct Draw2dData Draw2dData;
typedef struct DrawName DrawName;
typedef struct DrawWireframeCube DrawWireframeCube;
typedef struct DummyIpEndPoint DummyIpEndPoint;
typedef struct DummyNetClient DummyNetClient;
typedef struct DummyNetConnection DummyNetConnection;
typedef struct DummyNetOutgoingMessage DummyNetOutgoingMessage;
typedef struct DummyNetServer DummyNetServer;
typedef struct DummyNetwork DummyNetwork;
typedef struct EnetEvent EnetEvent;
typedef struct EnetEventRef EnetEventRef;

typedef enum {
	EnetEventType_NONE,
	EnetEventType_CONNECT,
	EnetEventType_DISCONNECT,
	EnetEventType_RECEIVE
}
EnetEventType;
typedef struct EnetNetClient EnetNetClient;
typedef struct EnetNetConnection EnetNetConnection;
typedef struct EnetNetServer EnetNetServer;
typedef struct EnetPacket EnetPacket;
typedef struct EnetPeer EnetPeer;
typedef struct Entity Entity;
typedef struct EntityDrawArea EntityDrawArea;
typedef struct EntityDrawModel EntityDrawModel;
typedef struct EntityDrawText EntityDrawText;
typedef struct EntityPosition_ EntityPosition_;
typedef struct EntityScript EntityScript;

typedef enum {
	EscapeMenuState_MAIN,
	EscapeMenuState_OPTIONS,
	EscapeMenuState_GRAPHICS,
	EscapeMenuState_KEYS,
	EscapeMenuState_OTHER
}
EscapeMenuState;
typedef struct Expires Expires;
typedef struct FastQueueInt FastQueueInt;
typedef struct FastStackInt FastStackInt;
typedef struct FloatRef FloatRef;
typedef struct FontCi FontCi;

typedef enum {
	FontType_NICE,
	FontType_SIMPLE,
	FontType_BLACK_BACKGROUND,
	FontType_DEFAULT
}
FontType;
typedef struct FrustumCulling FrustumCulling;
typedef struct Game Game;
typedef struct GameData GameData;
typedef struct GameDataItemsClient GameDataItemsClient;
typedef struct GameDataMonsters GameDataMonsters;
typedef struct GameExit GameExit;
typedef struct GamePlatform GamePlatform;
typedef struct GameScreen GameScreen;
typedef struct GetBlockHeight_ GetBlockHeight_;
typedef struct GetCameraMatrix GetCameraMatrix;
typedef struct Grenade_ Grenade_;

typedef enum {
	GuiState_NORMAL,
	GuiState_ESCAPE_MENU,
	GuiState_INVENTORY,
	GuiState_MAP_LOADING,
	GuiState_CRAFTING_RECIPES,
	GuiState_MODAL_DIALOG
}
GuiState;
typedef struct HashSetVector3IntRef HashSetVector3IntRef;
typedef struct HttpResponseCi HttpResponseCi;
typedef struct IGetCameraMatrix IGetCameraMatrix;
typedef struct IInterpolation IInterpolation;
typedef struct IInventoryController IInventoryController;
typedef struct IMapStorage2 IMapStorage2;
typedef struct INetOutgoingMessage INetOutgoingMessage;
typedef struct INetworkInterpolation INetworkInterpolation;
typedef struct IPEndPointCi IPEndPointCi;
typedef struct IPEndPointCiDefault IPEndPointCiDefault;
typedef struct ITerrainTextures ITerrainTextures;
typedef struct ImageOnLoadHandler ImageOnLoadHandler;
typedef struct InfiniteMapChunked2d InfiniteMapChunked2d;
typedef struct IntRef IntRef;
typedef struct InventoryUtilClient InventoryUtilClient;
typedef struct IsBlockEmpty_ IsBlockEmpty_;
typedef struct Kamera Kamera;
typedef struct Key Key;
typedef struct KeyEventArgs KeyEventArgs;
typedef struct KeyEventHandler KeyEventHandler;
typedef struct KeyHelp KeyHelp;
typedef struct KeyPressEventArgs KeyPressEventArgs;
typedef struct KeyValue KeyValue;
typedef struct KeyValueStringInt KeyValueStringInt;
typedef struct KeyValueStringString KeyValueStringString;
typedef struct Keyframe Keyframe;
typedef struct Language Language;
typedef struct LightBase LightBase;
typedef struct LightBetweenChunks LightBetweenChunks;
typedef struct LightFlood LightFlood;
typedef struct Line3D Line3D;
typedef struct ListAction ListAction;
typedef struct ListBox3d ListBox3d;
typedef struct ListConnectedPlayer ListConnectedPlayer;
typedef struct ListInfo ListInfo;
typedef struct LoginClientCi LoginClientCi;
typedef struct LoginData LoginData;

typedef enum {
	LoginResult_NONE,
	LoginResult_CONNECTING,
	LoginResult_FAILED,
	LoginResult_OK
}
LoginResult;
typedef struct LoginResultRef LoginResultRef;
typedef struct MainMenu MainMenu;
typedef struct MainMenuKeyEventHandler MainMenuKeyEventHandler;
typedef struct MainMenuMouseEventHandler MainMenuMouseEventHandler;
typedef struct MainMenuNewFrameHandler MainMenuNewFrameHandler;
typedef struct MainMenuTouchEventHandler MainMenuTouchEventHandler;
typedef struct Map Map;
typedef struct MapLoadingProgressEventArgs MapLoadingProgressEventArgs;
typedef struct MapStorage2 MapStorage2;
typedef struct Mat2 Mat2;
typedef struct Mat2d Mat2d;
typedef struct Mat3 Mat3;
typedef struct Mat4 Mat4;
typedef struct MenuState MenuState;
typedef struct MenuWidget MenuWidget;
typedef struct MeshBatcher MeshBatcher;
typedef struct Minecart Minecart;
typedef struct ModAudio ModAudio;
typedef struct ModAutoCamera ModAutoCamera;
typedef struct ModBlockDamageToPlayer ModBlockDamageToPlayer;
typedef struct ModBullet ModBullet;
typedef struct ModCamera ModCamera;
typedef struct ModCameraKeys ModCameraKeys;
typedef struct ModClearInactivePlayersDrawInfo ModClearInactivePlayersDrawInfo;
typedef struct ModCompass ModCompass;
typedef struct ModDebugChunk ModDebugChunk;
typedef struct ModDialog ModDialog;
typedef struct ModDraw2dMisc ModDraw2dMisc;
typedef struct ModDrawArea ModDrawArea;
typedef struct ModDrawHand2d ModDrawHand2d;
typedef struct ModDrawHand3d ModDrawHand3d;
typedef struct ModDrawLinesAroundSelectedBlock ModDrawLinesAroundSelectedBlock;
typedef struct ModDrawMain ModDrawMain;
typedef struct ModDrawMinecarts ModDrawMinecarts;
typedef struct ModDrawParticleEffectBlockBreak ModDrawParticleEffectBlockBreak;
typedef struct ModDrawPlayerNames ModDrawPlayerNames;
typedef struct ModDrawPlayers ModDrawPlayers;
typedef struct ModDrawSprites ModDrawSprites;
typedef struct ModDrawTerrain ModDrawTerrain;
typedef struct ModDrawTestModel ModDrawTestModel;
typedef struct ModDrawText ModDrawText;
typedef struct ModExpire ModExpire;
typedef struct ModFallDamageToPlayer ModFallDamageToPlayer;
typedef struct ModFpsHistoryGraph ModFpsHistoryGraph;
typedef struct ModGrenade ModGrenade;
typedef struct ModGuiChat ModGuiChat;
typedef struct ModGuiCrafting ModGuiCrafting;
typedef struct ModGuiEscapeMenu ModGuiEscapeMenu;
typedef struct ModGuiInventory ModGuiInventory;
typedef struct ModGuiMapLoading ModGuiMapLoading;
typedef struct ModGuiPlayerStats ModGuiPlayerStats;
typedef struct ModGuiTextEditor ModGuiTextEditor;
typedef struct ModGuiTouchButtons ModGuiTouchButtons;
typedef struct ModInterpolatePositions ModInterpolatePositions;
typedef struct ModLoadPlayerTextures ModLoadPlayerTextures;
typedef struct ModManagerSimple ModManagerSimple;
typedef struct ModManagerSimple1 ModManagerSimple1;
typedef struct ModNetworkEntity ModNetworkEntity;
typedef struct ModNetworkProcess ModNetworkProcess;
typedef struct ModPicking ModPicking;
typedef struct ModPush ModPush;
typedef struct ModRail ModRail;
typedef struct ModReloadAmmo ModReloadAmmo;
typedef struct ModScreenshot ModScreenshot;
typedef struct ModSendActiveMaterial ModSendActiveMaterial;
typedef struct ModSendPosition ModSendPosition;
typedef struct ModServerSimple ModServerSimple;
typedef struct ModSimple ModSimple;
typedef struct ModSimpleDefault ModSimpleDefault;
typedef struct ModSimpleWorldGenerator ModSimpleWorldGenerator;
typedef struct ModSkySphereAnimated ModSkySphereAnimated;
typedef struct ModSkySphereStatic ModSkySphereStatic;
typedef struct ModUnloadRendererChunks ModUnloadRendererChunks;
typedef struct ModUpdateMain ModUpdateMain;
typedef struct ModWalkSound ModWalkSound;
typedef struct ModelData ModelData;
typedef struct MouseEventArgs MouseEventArgs;
typedef struct MouseEventHandler MouseEventHandler;
typedef struct MouseWheelEventArgs MouseWheelEventArgs;

typedef enum {
	MyNetDeliveryMethod_UNKNOWN,
	MyNetDeliveryMethod_UNRELIABLE,
	MyNetDeliveryMethod_UNRELIABLE_SEQUENCED,
	MyNetDeliveryMethod_RELIABLE_UNORDERED,
	MyNetDeliveryMethod_RELIABLE_SEQUENCED,
	MyNetDeliveryMethod_RELIABLE_ORDERED
}
MyNetDeliveryMethod;
typedef struct NetClient NetClient;
typedef struct NetConnection NetConnection;
typedef struct NetIncomingMessage NetIncomingMessage;
typedef struct NetServer NetServer;
typedef struct NetworkInterpolation NetworkInterpolation;

typedef enum {
	NetworkMessageType_DATA,
	NetworkMessageType_CONNECT,
	NetworkMessageType_DISCONNECT
}
NetworkMessageType;
typedef struct NewFrameEventArgs NewFrameEventArgs;
typedef struct NewFrameHandler NewFrameHandler;
typedef struct Node Node;
typedef struct OnCrashHandler OnCrashHandler;
typedef struct OnCrashHandlerLeave OnCrashHandlerLeave;
typedef struct OnUseEntityArgs OnUseEntityArgs;
typedef struct OptionsCi OptionsCi;
typedef struct PacketHandlerCraftingRecipes PacketHandlerCraftingRecipes;
typedef struct Packet_ Packet_;
typedef struct Packet_BlockType Packet_BlockType;
typedef struct Packet_Client Packet_Client;
typedef struct Packet_ClientActiveMaterialSlot Packet_ClientActiveMaterialSlot;
typedef struct Packet_ClientCraft Packet_ClientCraft;
typedef struct Packet_ClientDeath Packet_ClientDeath;
typedef struct Packet_ClientDialogClick Packet_ClientDialogClick;
typedef struct Packet_ClientEntityInteraction Packet_ClientEntityInteraction;
typedef struct Packet_ClientFillArea Packet_ClientFillArea;
typedef struct Packet_ClientGameResolution Packet_ClientGameResolution;
typedef struct Packet_ClientHealth Packet_ClientHealth;
typedef struct Packet_ClientIdentification Packet_ClientIdentification;
typedef struct Packet_ClientInventoryAction Packet_ClientInventoryAction;
typedef struct Packet_ClientLeave Packet_ClientLeave;
typedef struct Packet_ClientMessage Packet_ClientMessage;
typedef struct Packet_ClientOxygen Packet_ClientOxygen;
typedef struct Packet_ClientPositionAndOrientation Packet_ClientPositionAndOrientation;
typedef struct Packet_ClientRequestBlob Packet_ClientRequestBlob;
typedef struct Packet_ClientSetBlock Packet_ClientSetBlock;
typedef struct Packet_ClientShot Packet_ClientShot;
typedef struct Packet_ClientSpecialKey Packet_ClientSpecialKey;
typedef struct Packet_CraftingRecipe Packet_CraftingRecipe;
typedef struct Packet_Dialog Packet_Dialog;
typedef struct Packet_DialogFont Packet_DialogFont;
typedef struct Packet_Ingredient Packet_Ingredient;
typedef struct Packet_IntInt Packet_IntInt;
typedef struct Packet_IntString Packet_IntString;
typedef struct Packet_Inventory Packet_Inventory;
typedef struct Packet_InventoryPosition Packet_InventoryPosition;
typedef struct Packet_Item Packet_Item;
typedef struct Packet_PositionAndOrientation Packet_PositionAndOrientation;
typedef struct Packet_PositionItem Packet_PositionItem;
typedef struct Packet_Server Packet_Server;
typedef struct Packet_ServerAmmo Packet_ServerAmmo;
typedef struct Packet_ServerBlobInitialize Packet_ServerBlobInitialize;
typedef struct Packet_ServerBlobPart Packet_ServerBlobPart;
typedef struct Packet_ServerBlockType Packet_ServerBlockType;
typedef struct Packet_ServerBullet Packet_ServerBullet;
typedef struct Packet_ServerChunk Packet_ServerChunk;
typedef struct Packet_ServerChunkPart Packet_ServerChunkPart;
typedef struct Packet_ServerCraftingRecipes Packet_ServerCraftingRecipes;
typedef struct Packet_ServerDialog Packet_ServerDialog;
typedef struct Packet_ServerDisconnectPlayer Packet_ServerDisconnectPlayer;
typedef struct Packet_ServerEntity Packet_ServerEntity;
typedef struct Packet_ServerEntityAnimatedModel Packet_ServerEntityAnimatedModel;
typedef struct Packet_ServerEntityDespawn Packet_ServerEntityDespawn;
typedef struct Packet_ServerEntityDrawArea Packet_ServerEntityDrawArea;
typedef struct Packet_ServerEntityDrawBlock Packet_ServerEntityDrawBlock;
typedef struct Packet_ServerEntityDrawName Packet_ServerEntityDrawName;
typedef struct Packet_ServerEntityDrawText Packet_ServerEntityDrawText;
typedef struct Packet_ServerEntityPositionAndOrientation Packet_ServerEntityPositionAndOrientation;
typedef struct Packet_ServerEntityPush Packet_ServerEntityPush;
typedef struct Packet_ServerEntitySpawn Packet_ServerEntitySpawn;
typedef struct Packet_ServerExplosion Packet_ServerExplosion;
typedef struct Packet_ServerFillArea Packet_ServerFillArea;
typedef struct Packet_ServerFillAreaLimit Packet_ServerFillAreaLimit;
typedef struct Packet_ServerFollow Packet_ServerFollow;
typedef struct Packet_ServerFreemove Packet_ServerFreemove;
typedef struct Packet_ServerHeightmapChunk Packet_ServerHeightmapChunk;
typedef struct Packet_ServerIdentification Packet_ServerIdentification;
typedef struct Packet_ServerInventory Packet_ServerInventory;
typedef struct Packet_ServerLevelProgress Packet_ServerLevelProgress;
typedef struct Packet_ServerLightLevels Packet_ServerLightLevels;
typedef struct Packet_ServerMessage Packet_ServerMessage;
typedef struct Packet_ServerMonster Packet_ServerMonster;
typedef struct Packet_ServerMonsters Packet_ServerMonsters;
typedef struct Packet_ServerPlayerPing Packet_ServerPlayerPing;
typedef struct Packet_ServerPlayerSpawnPosition Packet_ServerPlayerSpawnPosition;
typedef struct Packet_ServerPlayerStats Packet_ServerPlayerStats;
typedef struct Packet_ServerProjectile Packet_ServerProjectile;
typedef struct Packet_ServerQueryAnswer Packet_ServerQueryAnswer;
typedef struct Packet_ServerRedirect Packet_ServerRedirect;
typedef struct Packet_ServerSeason Packet_ServerSeason;
typedef struct Packet_ServerSetBlock Packet_ServerSetBlock;
typedef struct Packet_ServerSound Packet_ServerSound;
typedef struct Packet_ServerSunLevels Packet_ServerSunLevels;
typedef struct Packet_ServerTranslatedString Packet_ServerTranslatedString;
typedef struct Packet_SoundSet Packet_SoundSet;
typedef struct Packet_StringList Packet_StringList;
typedef struct Packet_Widget Packet_Widget;
typedef struct Ping_ Ping_;
typedef struct Player Player;
typedef struct PlayerDrawInfo PlayerDrawInfo;
typedef struct PlayerInterpolate PlayerInterpolate;
typedef struct PlayerInterpolationState PlayerInterpolationState;

typedef enum {
	PlayerType_PLAYER,
	PlayerType_MONSTER
}
PlayerType;
typedef struct PointFloatRef PointFloatRef;
typedef struct PointRef PointRef;
typedef struct PredicateBox3D PredicateBox3D;
typedef struct PredicateBox3DHit PredicateBox3DHit;
typedef struct Preferences Preferences;
typedef struct ProcessPacketTask ProcessPacketTask;
typedef struct Quat Quat;
typedef struct QueryClient QueryClient;
typedef struct QueryResult QueryResult;
typedef struct QueueAction QueueAction;
typedef struct QueueByte QueueByte;
typedef struct QueueByteArray QueueByteArray;
typedef struct QueueINetOutgoingMessage QueueINetOutgoingMessage;
typedef struct QueueNetIncomingMessage QueueNetIncomingMessage;

typedef enum {
	RailDirection_HORIZONTAL,
	RailDirection_VERTICAL,
	RailDirection_UP_LEFT,
	RailDirection_UP_RIGHT,
	RailDirection_DOWN_LEFT,
	RailDirection_DOWN_RIGHT
}
RailDirection;
typedef struct RailMapUtil RailMapUtil;

typedef enum {
	RailSlope_FLAT,
	RailSlope_TWO_LEFT_RAISED,
	RailSlope_TWO_RIGHT_RAISED,
	RailSlope_TWO_UP_RAISED,
	RailSlope_TWO_DOWN_RAISED
}
RailSlope;
typedef struct RandomCi RandomCi;
typedef struct RectFRef RectFRef;
typedef struct RectangleFloat RectangleFloat;
typedef struct RenderedChunk RenderedChunk;
typedef struct Screen Screen;
typedef struct ScreenConnectToIp ScreenConnectToIp;
typedef struct ScreenGame ScreenGame;
typedef struct ScreenLogin ScreenLogin;
typedef struct ScreenMain ScreenMain;
typedef struct ScreenModifyWorld ScreenModifyWorld;
typedef struct ScreenMultiplayer ScreenMultiplayer;
typedef struct ScreenSingleplayer ScreenSingleplayer;
typedef struct Script Script;
typedef struct ScriptCharacterPhysics ScriptCharacterPhysics;
typedef struct ScriptManager ScriptManager;
typedef struct SendPacketAction SendPacketAction;
typedef struct ServerCi ServerCi;
typedef struct ServerInformation ServerInformation;
typedef struct ServerOnList ServerOnList;
typedef struct ServerSimple ServerSimple;
typedef struct Sound_ Sound_;
typedef struct Speculative Speculative;
typedef struct Sprite Sprite;
typedef struct StackMatrix4 StackMatrix4;
typedef struct SunMoonRenderer SunMoonRenderer;
typedef struct TableBinding TableBinding;
typedef struct TableSerializer TableSerializer;
typedef struct TaskScheduler TaskScheduler;
typedef struct TcpNetClient TcpNetClient;
typedef struct TerrainChunkTesselatorCi TerrainChunkTesselatorCi;
typedef struct TerrainRendererCommit TerrainRendererCommit;
typedef struct TerrainRendererRedraw TerrainRendererRedraw;

typedef enum {
	TextAlign_LEFT,
	TextAlign_CENTER,
	TextAlign_RIGHT
}
TextAlign;

typedef enum {
	TextBaseline_TOP,
	TextBaseline_MIDDLE,
	TextBaseline_BOTTOM
}
TextBaseline;
typedef struct TextColorRenderer TextColorRenderer;
typedef struct TextPart TextPart;
typedef struct TextTexture TextTexture;
typedef struct Text_ Text_;
typedef struct TextureAtlasConverter TextureAtlasConverter;
typedef struct ThumbnailResponseCi ThumbnailResponseCi;
typedef struct TileEnterData TileEnterData;

typedef enum {
	TileEnterDirection_UP,
	TileEnterDirection_DOWN,
	TileEnterDirection_LEFT,
	TileEnterDirection_RIGHT
}
TileEnterDirection;

typedef enum {
	TileExitDirection_UP,
	TileExitDirection_DOWN,
	TileExitDirection_LEFT,
	TileExitDirection_RIGHT
}
TileExitDirection;
typedef struct TimerCi TimerCi;
typedef struct ToCall ToCall;

typedef enum {
	TorchType_NORMAL,
	TorchType_LEFT,
	TorchType_RIGHT,
	TorchType_FRONT,
	TorchType_BACK
}
TorchType;
typedef struct TouchEventArgs TouchEventArgs;
typedef struct TouchEventHandler TouchEventHandler;
typedef struct TranslatedString TranslatedString;

typedef enum {
	TypingState_NONE,
	TypingState_TYPING,
	TypingState_READY
}
TypingState;
typedef struct UnloadRendererChunksCommit UnloadRendererChunksCommit;
typedef struct Unproject Unproject;
typedef struct UriCi UriCi;
typedef struct Vec2 Vec2;
typedef struct Vec4 Vec4;
typedef struct VecCito3i VecCito3i;
typedef struct Vector3Float Vector3Float;
typedef struct Vector3IntRef Vector3IntRef;
typedef struct Vector3Ref Vector3Ref;

/**
 * &lt;summary&gt;
 * Each RailDirection on tile can be traversed by train in two directions.
 * &lt;/summary&gt;
 * &lt;example&gt;
 * RailDirection.Horizontal -&gt; VehicleDirection12.HorizontalLeft (vehicle goes left and decreases x position),
 * and VehicleDirection12.HorizontalRight (vehicle goes right and increases x position).
 * &lt;/example&gt;
 */
typedef enum {
	VehicleDirection12_HORIZONTAL_LEFT,
	VehicleDirection12_HORIZONTAL_RIGHT,
	VehicleDirection12_VERTICAL_UP,
	VehicleDirection12_VERTICAL_DOWN,
	VehicleDirection12_UP_LEFT_UP,
	VehicleDirection12_UP_LEFT_LEFT,
	VehicleDirection12_UP_RIGHT_UP,
	VehicleDirection12_UP_RIGHT_RIGHT,
	VehicleDirection12_DOWN_LEFT_DOWN,
	VehicleDirection12_DOWN_LEFT_LEFT,
	VehicleDirection12_DOWN_RIGHT_DOWN,
	VehicleDirection12_DOWN_RIGHT_RIGHT
}
VehicleDirection12;
typedef struct VerticesIndicesToLoad VerticesIndicesToLoad;
typedef struct VisibleDialog VisibleDialog;
typedef struct WebSocketClient WebSocketClient;
typedef struct WebSocketClientConnection WebSocketClientConnection;

typedef enum {
	WidgetType_BUTTON,
	WidgetType_TEXTBOX,
	WidgetType_LABEL
}
WidgetType;

typedef enum {
	WindowState_NORMAL,
	WindowState_MINIMIZED,
	WindowState_MAXIMIZED,
	WindowState_FULLSCREEN
}
WindowState;

Acceleration *Acceleration_New(void);
void Acceleration_Delete(Acceleration *self);

void Acceleration_SetDefault(Acceleration *self);

int AngleInterpolation_InterpolateAngle256(GamePlatform const *platform, int a, int b, float progress);

float AngleInterpolation_InterpolateAngle360(GamePlatform const *platform, float a, float b, float progress);

AnimatedModel *AnimatedModel_New(void);
void AnimatedModel_Delete(AnimatedModel *self);

AnimatedModelBinding *AnimatedModelBinding_New(void);
void AnimatedModelBinding_Delete(AnimatedModelBinding *self);

void AnimatedModelBinding_Get(AnimatedModelBinding const *self, const char *table, int index, DictionaryStringString const *items);

void AnimatedModelBinding_GetTables(AnimatedModelBinding const *self, const char **name, int *count);

void AnimatedModelBinding_Set(AnimatedModelBinding const *self, const char *table, int index, const char *column, const char *value);

AnimatedModelRenderer *AnimatedModelRenderer_New(void);
void AnimatedModelRenderer_Delete(AnimatedModelRenderer *self);

void AnimatedModelRenderer_Render(AnimatedModelRenderer *self, float dt, float headDeg, cibool walkAnimation, cibool moves, float light);

void AnimatedModelRenderer_Start(AnimatedModelRenderer *self, Game const *game_, AnimatedModel const *model_);

AnimatedModel const *AnimatedModelSerializer_Deserialize(GamePlatform const *p, const char *data);

const char *AnimatedModelSerializer_Serialize(GamePlatform const *p, AnimatedModel const *m);

Animation *Animation_New(void);
void Animation_Delete(Animation *self);

AnimationGlobal *AnimationGlobal_New(void);
void AnimationGlobal_Delete(AnimationGlobal *self);

AnimationHint *AnimationHint_New(void);
void AnimationHint_Delete(AnimationHint *self);

AnimationState *AnimationState_New(void);
void AnimationState_Delete(AnimationState *self);

float AnimationState_GetInterp(AnimationState const *self);

Asset *Asset_New(void);
void Asset_Delete(Asset *self);

unsigned char const *Asset_GetData(Asset const *self);

int Asset_GetDataLength(Asset const *self);

const char *Asset_GetMd5(Asset const *self);

const char *Asset_GetName(Asset const *self);

void Asset_SetData(Asset *self, unsigned char const *value);

void Asset_SetDataLength(Asset *self, int value);

void Asset_SetMd5(Asset *self, const char *value);

void Asset_SetName(Asset *self, const char *value);

AssetList *AssetList_New(void);
void AssetList_Delete(AssetList *self);

int AssetList_GetCount(AssetList const *self);

Asset const *const *AssetList_GetItems(AssetList const *self);

void AssetList_SetCount(AssetList *self, int value);

void AssetList_SetItems(AssetList *self, Asset const **value);

AudioControl *AudioControl_New(void);
void AudioControl_Delete(AudioControl *self);

void AudioControl_Add(AudioControl *self, Sound_ *s);

void AudioControl_Clear(AudioControl *self);

void AudioControl_StopAll(AudioControl const *self);

BackgroundAction *BackgroundAction_New(void);
void BackgroundAction_Delete(BackgroundAction *self);

void BackgroundAction_Run(BackgroundAction *self);

cibool BitTools_IsPowerOfTwo(int x);

int BitTools_NextPowerOfTwo(int x);

BitmapCi *BitmapCi_New(void);
void BitmapCi_Delete(BitmapCi *self);

void BitmapCi_Dispose(BitmapCi const *self);

BitmapData_ *BitmapData__New(void);
void BitmapData__Delete(BitmapData_ *self);

BitmapData_ const *BitmapData__Create(int width, int height);

BitmapData_ const *BitmapData__CreateFromBitmap(GamePlatform const *p, BitmapCi const *atlas2d_);

int BitmapData__GetPixel(BitmapData_ const *self, int x, int y);

void BitmapData__SetPixel(BitmapData_ const *self, int x, int y, int color);

BitmapCi const *BitmapData__ToBitmap(BitmapData_ const *self, GamePlatform const *p);

BlockOctreeSearcher *BlockOctreeSearcher_New(void);
void BlockOctreeSearcher_Delete(BlockOctreeSearcher *self);

cibool BlockOctreeSearcher_BoxHit(BlockOctreeSearcher const *self, Box3D const *box);

BlockPosSide const **BlockOctreeSearcher_LineIntersection(BlockOctreeSearcher *self, DelegateIsBlockEmpty const *isEmpty, DelegateGetBlockHeight const *getBlockHeight, Line3D const *line, IntRef *retCount);

BlockPosSide *BlockPosSide_New(void);
void BlockPosSide_Delete(BlockPosSide *self);

BlockPosSide const *BlockPosSide_Create(int x, int y, int z);

float const *BlockPosSide_Current(BlockPosSide const *self);

float const *BlockPosSide_Translated(BlockPosSide const *self);

BlockRendererTorch *BlockRendererTorch_New(void);
void BlockRendererTorch_Delete(BlockRendererTorch *self);

void BlockRendererTorch_AddTorch(BlockRendererTorch const *self, GameData const *d_Data, Game const *d_TerainRenderer, ModelData *m, int x, int y, int z, TorchType type);

void BlockRendererTorch_AddVertex(BlockRendererTorch const *self, ModelData *model, float x, float y, float z, float u, float v, int color);

BlockTypeSimple *BlockTypeSimple_New(void);
void BlockTypeSimple_Delete(BlockTypeSimple *self);

void BlockTypeSimple_SetAllTextures(BlockTypeSimple const *self, const char *texture);

void BlockTypeSimple_SetDrawType(BlockTypeSimple const *self, int p);

void BlockTypeSimple_SetName(BlockTypeSimple const *self, const char *name);

void BlockTypeSimple_SetTextureBack(BlockTypeSimple const *self, const char *p);

void BlockTypeSimple_SetTextureBottom(BlockTypeSimple const *self, const char *p);

void BlockTypeSimple_SetTextureFront(BlockTypeSimple const *self, const char *p);

void BlockTypeSimple_SetTextureLeft(BlockTypeSimple const *self, const char *p);

void BlockTypeSimple_SetTextureRight(BlockTypeSimple const *self, const char *p);

void BlockTypeSimple_SetTextureTop(BlockTypeSimple const *self, const char *p);

void BlockTypeSimple_SetWalkableType(BlockTypeSimple const *self, int p);

BoolRef *BoolRef_New(void);
void BoolRef_Delete(BoolRef *self);

cibool BoolRef_GetValue(BoolRef const *self);

void BoolRef_SetValue(BoolRef *self, cibool value_);

Box3D *Box3D_New(void);
void Box3D_Delete(Box3D *self);

void Box3D_AddPoint(Box3D *self, float x, float y, float z);

float const *Box3D_Center(Box3D const *self);

float Box3D_LengthX(Box3D const *self);

float Box3D_LengthY(Box3D const *self);

float Box3D_LengthZ(Box3D const *self);

void Box3D_Set(Box3D *self, float x, float y, float z, float size);

Bullet_ *Bullet__New(void);
void Bullet__Delete(Bullet_ *self);

Button *Button_New(void);
void Button_Delete(Button *self);

ByteArray *ByteArray_New(void);
void ByteArray_Delete(ByteArray *self);

CachedTextTexture *CachedTextTexture_New(void);
void CachedTextTexture_Delete(CachedTextTexture *self);

CachedTexture *CachedTexture_New(void);
void CachedTexture_Delete(CachedTexture *self);

CameraMove *CameraMove_New(void);
void CameraMove_Delete(CameraMove *self);

CameraPoint *CameraPoint_New(void);
void CameraPoint_Delete(CameraPoint *self);

Chatline *Chatline_New(void);
void Chatline_Delete(Chatline *self);

Chunk *Chunk_New(void);
void Chunk_Delete(Chunk *self);

cibool Chunk_ChunkHasData(Chunk const *self);

int Chunk_GetBlockInChunk(Chunk const *self, int pos);

void Chunk_SetBlockInChunk(Chunk *self, int pos, int block);

ChunkSimple *ChunkSimple_New(void);
void ChunkSimple_Delete(ChunkSimple *self);

CitoMemoryStream *CitoMemoryStream_New(void);
void CitoMemoryStream_Delete(CitoMemoryStream *self);

cibool CitoMemoryStream_CanSeek(CitoMemoryStream const *self);

CitoMemoryStream const *CitoMemoryStream_Create(unsigned char *buffer, int length);

unsigned char const *CitoMemoryStream_GetBuffer(CitoMemoryStream const *self);

int CitoMemoryStream_Length(CitoMemoryStream const *self);

int CitoMemoryStream_Position(CitoMemoryStream const *self);

int CitoMemoryStream_Read(CitoMemoryStream *self, unsigned char *buffer, int offset, int count);

int CitoMemoryStream_ReadByte(CitoMemoryStream *self);

void CitoMemoryStream_Seek(CitoMemoryStream *self, int length, CitoSeekOrigin seekOrigin);

void CitoMemoryStream_Seek_(CitoMemoryStream const *self, int p, CitoSeekOrigin seekOrigin);

unsigned char const *CitoMemoryStream_ToArray(CitoMemoryStream const *self);

void CitoMemoryStream_Write(CitoMemoryStream *self, unsigned char const *buffer, int offset, int count);

void CitoMemoryStream_WriteByte(CitoMemoryStream *self, unsigned char p);

ClientCommandArgs *ClientCommandArgs_New(void);
void ClientCommandArgs_Delete(ClientCommandArgs *self);

ClientInventoryController *ClientInventoryController_New(void);
void ClientInventoryController_Delete(ClientInventoryController *self);

ClientInventoryController const *ClientInventoryController_Create(Game const *game);

void ClientInventoryController_InventoryClick(ClientInventoryController const *self, Packet_InventoryPosition *pos);

void ClientInventoryController_MoveToInventory(ClientInventoryController const *self, Packet_InventoryPosition *from);

void ClientInventoryController_WearItem(ClientInventoryController const *self, Packet_InventoryPosition *from, Packet_InventoryPosition *to);

void ClientMod_Dispose(ClientMod const *self, Game const *game);

void ClientMod_OnBeforeNewFrameDraw3d(ClientMod const *self, Game const *game, float deltaTime);

cibool ClientMod_OnClientCommand(ClientMod const *self, Game const *game, ClientCommandArgs const *args);

void ClientMod_OnHitEntity(ClientMod const *self, Game const *game, OnUseEntityArgs const *e);

void ClientMod_OnKeyDown(ClientMod const *self, Game const *game, KeyEventArgs const *args);

void ClientMod_OnKeyPress(ClientMod const *self, Game const *game, KeyPressEventArgs const *args);

void ClientMod_OnKeyUp(ClientMod const *self, Game const *game, KeyEventArgs const *args);

void ClientMod_OnMouseDown(ClientMod const *self, Game const *game, MouseEventArgs const *args);

void ClientMod_OnMouseMove(ClientMod const *self, Game const *game, MouseEventArgs const *args);

void ClientMod_OnMouseUp(ClientMod const *self, Game const *game, MouseEventArgs const *args);

void ClientMod_OnMouseWheelChanged(ClientMod const *self, Game const *game, MouseWheelEventArgs const *args);

void ClientMod_OnNewFrame(ClientMod const *self, Game const *game, NewFrameEventArgs const *args);

void ClientMod_OnNewFrameDraw2d(ClientMod const *self, Game const *game, float deltaTime);

void ClientMod_OnNewFrameDraw3d(ClientMod const *self, Game const *game, float deltaTime);

void ClientMod_OnNewFrameFixed(ClientMod const *self, Game const *game, NewFrameEventArgs const *args);

void ClientMod_OnNewFrameReadOnlyMainThread(ClientMod const *self, Game const *game, float deltaTime);

void ClientMod_OnReadOnlyBackgroundThread(ClientMod const *self, Game const *game, float dt);

void ClientMod_OnReadOnlyMainThread(ClientMod const *self, Game const *game, float dt);

void ClientMod_OnReadWriteMainThread(ClientMod const *self, Game const *game, float dt);

void ClientMod_OnTouchEnd(ClientMod const *self, Game const *game, TouchEventArgs const *e);

void ClientMod_OnTouchMove(ClientMod const *self, Game const *game, TouchEventArgs const *e);

void ClientMod_OnTouchStart(ClientMod const *self, Game const *game, TouchEventArgs const *e);

void ClientMod_OnUseEntity(ClientMod const *self, Game const *game, OnUseEntityArgs const *e);

void ClientMod_Start(ClientMod const *self, ClientModManager const *modmanager);

ClientModManager1 *ClientModManager1_New(void);
void ClientModManager1_Delete(ClientModManager1 *self);

AviWriterCi const *ClientModManager1_AviWriterCreate(ClientModManager1 const *self);

void ClientModManager1_DisplayNotification(ClientModManager1 const *self, const char *message);

void ClientModManager1_Draw2dText(ClientModManager1 const *self, const char *text, float x, float y, float fontsize);

void ClientModManager1_Draw2dTexture(ClientModManager1 const *self, int textureid, float x1, float y1, float width, float height, IntRef const *inAtlasId, int color);

void ClientModManager1_Draw2dTextures(ClientModManager1 const *self, Draw2dData const *const *todraw, int todrawLength, int textureId);

void ClientModManager1_EnableCameraControl(ClientModManager1 const *self, cibool enable);

int ClientModManager1_GetFreemove(ClientModManager1 const *self);

float ClientModManager1_GetLocalOrientationX(ClientModManager1 const *self);

float ClientModManager1_GetLocalOrientationY(ClientModManager1 const *self);

float ClientModManager1_GetLocalOrientationZ(ClientModManager1 const *self);

float ClientModManager1_GetLocalPositionX(ClientModManager1 const *self);

float ClientModManager1_GetLocalPositionY(ClientModManager1 const *self);

float ClientModManager1_GetLocalPositionZ(ClientModManager1 const *self);

DictionaryStringString const *ClientModManager1_GetPerformanceInfo(ClientModManager1 const *self);

GamePlatform const *ClientModManager1_GetPlatform(ClientModManager1 const *self);

int ClientModManager1_GetWindowHeight(ClientModManager1 const *self);

int ClientModManager1_GetWindowWidth(ClientModManager1 const *self);

BitmapCi const *ClientModManager1_GrabScreenshot(ClientModManager1 const *self);

cibool ClientModManager1_IsFreemoveAllowed(ClientModManager1 const *self);

void ClientModManager1_MakeScreenshot(ClientModManager1 const *self);

void ClientModManager1_OrthoMode(ClientModManager1 const *self);

void ClientModManager1_PerspectiveMode(ClientModManager1 const *self);

void ClientModManager1_SendChatMessage(ClientModManager1 const *self, const char *message);

void ClientModManager1_SetFreemove(ClientModManager1 const *self, int level);

void ClientModManager1_SetLocalOrientation(ClientModManager1 const *self, float glx, float gly, float glz);

void ClientModManager1_SetLocalPosition(ClientModManager1 const *self, float glx, float gly, float glz);

void ClientModManager1_ShowGui(ClientModManager1 const *self, int level);

int ClientModManager1_WhiteTexture(ClientModManager1 const *self);

ClientPacketHandlerDialog *ClientPacketHandlerDialog_New(void);
void ClientPacketHandlerDialog_Delete(ClientPacketHandlerDialog *self);

void ClientPacketHandlerDialog_Handle(ClientPacketHandlerDialog const *self, Game *game, Packet_Server const *packet);

ClientPacketHandlerEntityDespawn *ClientPacketHandlerEntityDespawn_New(void);
void ClientPacketHandlerEntityDespawn_Delete(ClientPacketHandlerEntityDespawn *self);

void ClientPacketHandlerEntityDespawn_Handle(ClientPacketHandlerEntityDespawn const *self, Game const *game, Packet_Server const *packet);

ClientPacketHandlerEntityPosition *ClientPacketHandlerEntityPosition_New(void);
void ClientPacketHandlerEntityPosition_Delete(ClientPacketHandlerEntityPosition *self);

void ClientPacketHandlerEntityPosition_Handle(ClientPacketHandlerEntityPosition const *self, Game const *game, Packet_Server const *packet);

ClientPacketHandlerEntitySpawn *ClientPacketHandlerEntitySpawn_New(void);
void ClientPacketHandlerEntitySpawn_Delete(ClientPacketHandlerEntitySpawn *self);

void ClientPacketHandlerEntitySpawn_Handle(ClientPacketHandlerEntitySpawn const *self, Game *game, Packet_Server const *packet);

Entity const *ClientPacketHandlerEntitySpawn_ToClientEntity(Game const *game, Packet_ServerEntity const *entity, Entity *old, cibool updatePosition);

EntityPosition_ *ClientPacketHandlerEntitySpawn_ToClientEntityPosition(Packet_PositionAndOrientation const *pos);

Packet_Client const *ClientPackets_ActiveMaterialSlot(int ActiveMaterial);

Packet_Client const *ClientPackets_Chat(const char *s, int isTeamchat);

Packet_Client const *ClientPackets_Craft(int x, int y, int z, int recipeId);

Packet_Client const *ClientPackets_CreateLoginPacket(GamePlatform const *platform, const char *username, const char *verificationKey);

Packet_Client const *ClientPackets_CreateLoginPacket_(GamePlatform const *platform, const char *username, const char *verificationKey, const char *serverPassword);

Packet_Client const *ClientPackets_Death(int reason, int sourcePlayer);

Packet_Client const *ClientPackets_DialogClick(const char *widgetId, const char **textValues, int textValuesCount);

Packet_Client const *ClientPackets_FillArea(int startx, int starty, int startz, int endx, int endy, int endz, int blockType, int ActiveMaterial);

Packet_Client const *ClientPackets_GameResolution(int width, int height);

Packet_Client const *ClientPackets_Health(int currentHealth);

Packet_Client const *ClientPackets_InventoryClick(Packet_InventoryPosition *pos);

Packet_Client const *ClientPackets_Leave(int reason);

Packet_Client const *ClientPackets_MonsterHit(int damage);

Packet_Client const *ClientPackets_MoveToInventory(Packet_InventoryPosition *from);

Packet_Client const *ClientPackets_Oxygen(int currentOxygen);

Packet_Client const *ClientPackets_PingReply(void);

Packet_Client const *ClientPackets_PositionAndOrientation(Game const *game, int playerId, float positionX, float positionY, float positionZ, float orientationX, float orientationY, float orientationZ, unsigned char stance);

Packet_Client const *ClientPackets_Reload(void);

Packet_Client const *ClientPackets_RequestBlob(Game const *game, const char **required, int requiredCount);

Packet_Client const *ClientPackets_ServerQuery(void);

Packet_Client const *ClientPackets_SetBlock(int x, int y, int z, int mode, int type, int materialslot);

Packet_Client const *ClientPackets_SpecialKeyRespawn(void);

Packet_Client const *ClientPackets_SpecialKeySelectTeam(void);

Packet_Client const *ClientPackets_SpecialKeySetSpawn(void);

Packet_Client const *ClientPackets_SpecialKeyTabPlayerList(void);

Packet_Client const *ClientPackets_WearItem(Packet_InventoryPosition *from, Packet_InventoryPosition *to);

ClientSimple *ClientSimple_New(void);
void ClientSimple_Delete(ClientSimple *self);

#define ClientStateOnServer_CONNECTING  0

#define ClientStateOnServer_LOADING_GENERATING  1

#define ClientStateOnServer_LOADING_SENDING  2

#define ClientStateOnServer_PLAYING  3

Config3d *Config3d_New(void);
void Config3d_Delete(Config3d *self);

cibool Config3d_GetEnableMipmaps(Config3d const *self);

cibool Config3d_GetEnableTransparency(Config3d const *self);

float Config3d_GetViewDistance(Config3d const *self);

void Config3d_SetEnableMipmaps(Config3d *self, cibool value);

void Config3d_SetEnableTransparency(Config3d *self, cibool value);

void Config3d_SetViewDistance(Config3d *self, float value);

ConnectData *ConnectData_New(void);
void ConnectData_Delete(ConnectData *self);

ConnectData const *ConnectData_FromUri(UriCi const *uri);

cibool ConnectData_GetIsServePasswordProtected(ConnectData const *self);

void ConnectData_SetIp(ConnectData *self, const char *value);

void ConnectData_SetIsServePasswordProtected(ConnectData *self, cibool value);

void ConnectData_SetPort(ConnectData *self, int value);

void ConnectData_SetServerPassword(ConnectData *self, const char *value);

void ConnectData_SetUsername(ConnectData *self, const char *value);

ConnectedPlayer *ConnectedPlayer_New(void);
void ConnectedPlayer_Delete(ConnectedPlayer *self);

Controls *Controls_New(void);
void Controls_Delete(Controls *self);

/**
 * &lt;summary&gt;
 * Get the current player freemove mode
 * &lt;/summary&gt;
 * &lt;returns&gt;Freemove mode as defined in FreemoveLevelEnum&lt;/returns&gt;
 */
int Controls_GetFreemove(Controls const *self);

/**
 * &lt;summary&gt;
 * Set player freemove mode to the given value
 * &lt;/summary&gt;
 * &lt;param name="level"&gt;Freemove mode as defined in FreemoveLevelEnum&lt;/param&gt;
 */
void Controls_SetFreemove(Controls *self, int level);

#define CornerEnum_BOTTOM_LEFT  2

#define CornerEnum_BOTTOM_RIGHT  3

#define CornerEnum_NONE  -1

#define CornerEnum_TOP_LEFT  0

#define CornerEnum_TOP_RIGHT  1

CraftingTableTool *CraftingTableTool_New(void);
void CraftingTableTool_Delete(CraftingTableTool *self);

int const *CraftingTableTool_GetOnTable(CraftingTableTool const *self, Vector3IntRef const *const *table, int tableCount, IntRef *retCount);

Vector3IntRef const *const *CraftingTableTool_GetTable(CraftingTableTool const *self, int posx, int posy, int posz, IntRef *retCount);

ModelData const *CubeModelData_GetCubeModelData(void);

void CuboidRenderer_AddVertex(ModelData *model, float x, float y, float z, float u, float v, int color);

RectangleFloat const **CuboidRenderer_CuboidNet(float tsizex, float tsizey, float tsizez, float tstartx, float tstarty);

void CuboidRenderer_CuboidNetNormalize(RectangleFloat const **coords, float texturewidth, float textureheight);

void CuboidRenderer_DrawCuboid(Game const *game, float posX, float posY, float posZ, float sizeX, float sizeY, float sizeZ, RectangleFloat const *const *texturecoords, float light);

void CuboidRenderer_DrawCuboid2(Game const *game, float posX, float posY, float posZ, float sizeX, float sizeY, float sizeZ, RectangleFloat const *const *texturecoords, float light);

DialogScreen *DialogScreen_New(void);
void DialogScreen_Delete(DialogScreen *self);

void DialogScreen_OnButton(DialogScreen const *self, MenuWidget const *w);

DictionaryStringAudioData *DictionaryStringAudioData_New(void);
void DictionaryStringAudioData_Delete(DictionaryStringAudioData *self);

DictionaryStringAudioSample *DictionaryStringAudioSample_New(void);
void DictionaryStringAudioSample_Delete(DictionaryStringAudioSample *self);

cibool DictionaryStringAudioSample_Contains(DictionaryStringAudioSample const *self, const char *key);

AudioSampleCi const *DictionaryStringAudioSample_Get(DictionaryStringAudioSample const *self, const char *key);

int DictionaryStringAudioSample_GetIndex(DictionaryStringAudioSample const *self, const char *key);

void DictionaryStringAudioSample_Set(DictionaryStringAudioSample *self, const char *key, AudioSampleCi const *value);

DictionaryStringInt1024 *DictionaryStringInt1024_New(void);
void DictionaryStringInt1024_Delete(DictionaryStringInt1024 *self);

/**
 * &lt;summary&gt;
 * Remove the specified key.
 * This method is case-sensitive.
 * &lt;/summary&gt;
 * &lt;param name="key"&gt;Key&lt;/param&gt;
 * &lt;returns&gt;&lt;b&gt;true&lt;/b&gt; if key is found in collection, &lt;b&gt;false&lt;/b&gt; otherwise.&lt;/returns&gt;
 */
cibool DictionaryStringInt1024_Remove(DictionaryStringInt1024 const *self, const char *key);

/**
 * &lt;summary&gt;
 * Set the specified key to the specified value.
 * &lt;/summary&gt;
 * &lt;param name="key"&gt;Key&lt;/param&gt;
 * &lt;param name="value"&gt;Value to set&lt;/param&gt;
 */
void DictionaryStringInt1024_Set(DictionaryStringInt1024 *self, const char *key, int value);

DictionaryStringString *DictionaryStringString_New(void);
void DictionaryStringString_Delete(DictionaryStringString *self);

void DictionaryStringString_Set(DictionaryStringString const *self, const char *key, const char *value);

void DictionaryStringString_Start(DictionaryStringString *self, int count_);

DictionaryVector3Float *DictionaryVector3Float_New(void);
void DictionaryVector3Float_Delete(DictionaryVector3Float *self);

/**
 * &lt;summary&gt;
 * Enter at TileEnterDirection.Left -&gt; yields VehicleDirection12.UpLeftUp,
 * VehicleDirection12.HorizontalRight,
 * VehicleDirection12.DownLeftDown
 * &lt;/summary&gt;
 * &lt;param name="enter_at"&gt;&lt;/param&gt;
 * &lt;returns&gt;&lt;/returns&gt;
 */
VehicleDirection12 const *DirectionUtils_PossibleNewRails3(TileEnterDirection enter_at);

int DirectionUtils_RailDirectionFlagsCount(int railDirectionFlags);

TileEnterDirection DirectionUtils_ResultEnter(TileExitDirection direction);

/**
 * &lt;summary&gt;
 * VehicleDirection12.UpRightRight -&gt; returns Direction4.Right
 * &lt;/summary&gt;
 * &lt;param name="direction"&gt;&lt;/param&gt;
 * &lt;returns&gt;&lt;/returns&gt;
 */
TileExitDirection DirectionUtils_ResultExit(VehicleDirection12 direction);

VehicleDirection12 DirectionUtils_Reverse(VehicleDirection12 direction);

RailDirection DirectionUtils_ToRailDirection(VehicleDirection12 direction);

int DirectionUtils_ToRailDirectionFlags(RailDirection direction);

int DirectionUtils_ToVehicleDirection12Flags(VehicleDirection12 direction);

int DirectionUtils_ToVehicleDirection12Flags_(VehicleDirection12 const *directions, int directionsCount);

DisplayResolutionCi *DisplayResolutionCi_New(void);
void DisplayResolutionCi_Delete(DisplayResolutionCi *self);

int DisplayResolutionCi_GetBitsPerPixel(DisplayResolutionCi const *self);

int DisplayResolutionCi_GetHeight(DisplayResolutionCi const *self);

float DisplayResolutionCi_GetRefreshRate(DisplayResolutionCi const *self);

int DisplayResolutionCi_GetWidth(DisplayResolutionCi const *self);

void DisplayResolutionCi_SetBitsPerPixel(DisplayResolutionCi *self, int value);

void DisplayResolutionCi_SetHeight(DisplayResolutionCi *self, int value);

void DisplayResolutionCi_SetRefreshRate(DisplayResolutionCi *self, float value);

void DisplayResolutionCi_SetWidth(DisplayResolutionCi *self, int value);

Draw2dData *Draw2dData_New(void);
void Draw2dData_Delete(Draw2dData *self);

#define DrawModeEnum_LINES  1

#define DrawModeEnum_TRIANGLES  0

DrawName *DrawName_New(void);
void DrawName_Delete(DrawName *self);

DrawWireframeCube *DrawWireframeCube_New(void);
void DrawWireframeCube_Delete(DrawWireframeCube *self);

void DrawWireframeCube_DrawWireframeCube_(DrawWireframeCube *self, Game const *game, float posx, float posy, float posz, float scalex, float scaley, float scalez);

DummyIpEndPoint *DummyIpEndPoint_New(void);
void DummyIpEndPoint_Delete(DummyIpEndPoint *self);

const char *DummyIpEndPoint_AddressToString(DummyIpEndPoint const *self);

DummyNetClient *DummyNetClient_New(void);
void DummyNetClient_Delete(DummyNetClient *self);

NetConnection const *DummyNetClient_Connect(DummyNetClient const *self, const char *ip, int port);

NetIncomingMessage const *DummyNetClient_ReadMessage(DummyNetClient const *self);

void DummyNetClient_SendMessage(DummyNetClient const *self, INetOutgoingMessage const *message, MyNetDeliveryMethod method);

void DummyNetClient_SetNetwork(DummyNetClient *self, DummyNetwork const *network_);

void DummyNetClient_SetPlatform(DummyNetClient *self, GamePlatform const *gamePlatform);

void DummyNetClient_Start(DummyNetClient const *self);

DummyNetConnection *DummyNetConnection_New(void);
void DummyNetConnection_Delete(DummyNetConnection *self);

cibool DummyNetConnection_EqualsConnection(DummyNetConnection const *self, NetConnection const *connection);

IPEndPointCi const *DummyNetConnection_RemoteEndPoint(DummyNetConnection const *self);

void DummyNetConnection_SendMessage(DummyNetConnection const *self, INetOutgoingMessage const *msg, MyNetDeliveryMethod method, int sequenceChannel);

void DummyNetConnection_Update(DummyNetConnection const *self);

DummyNetOutgoingMessage *DummyNetOutgoingMessage_New(void);
void DummyNetOutgoingMessage_Delete(DummyNetOutgoingMessage *self);

DummyNetServer *DummyNetServer_New(void);
void DummyNetServer_Delete(DummyNetServer *self);

NetIncomingMessage const *DummyNetServer_ReadMessage(DummyNetServer *self);

void DummyNetServer_SetNetwork(DummyNetServer *self, DummyNetwork const *dummyNetwork);

void DummyNetServer_SetPlatform(DummyNetServer *self, GamePlatform const *gamePlatform);

void DummyNetServer_SetPort(DummyNetServer const *self, int port);

void DummyNetServer_Start(DummyNetServer const *self);

DummyNetwork *DummyNetwork_New(void);
void DummyNetwork_Delete(DummyNetwork *self);

void DummyNetwork_Clear(DummyNetwork *self);

void DummyNetwork_Start(DummyNetwork *self, MonitorObject const *lock1, MonitorObject const *lock2);

EnetEventRef *EnetEventRef_New(void);
void EnetEventRef_Delete(EnetEventRef *self);

EnetNetClient *EnetNetClient_New(void);
void EnetNetClient_Delete(EnetNetClient *self);

NetConnection const *EnetNetClient_Connect(EnetNetClient *self, const char *ip, int port);

NetIncomingMessage const *EnetNetClient_ReadMessage(EnetNetClient *self);

void EnetNetClient_SendMessage(EnetNetClient const *self, INetOutgoingMessage const *message, MyNetDeliveryMethod method);

void EnetNetClient_SetPlatform(EnetNetClient *self, GamePlatform const *platform_);

void EnetNetClient_Start(EnetNetClient *self);

EnetNetConnection *EnetNetConnection_New(void);
void EnetNetConnection_Delete(EnetNetConnection *self);

cibool EnetNetConnection_EqualsConnection(EnetNetConnection const *self, NetConnection const *connection);

IPEndPointCi const *EnetNetConnection_RemoteEndPoint(EnetNetConnection const *self);

void EnetNetConnection_SendMessage(EnetNetConnection const *self, INetOutgoingMessage const *msg, MyNetDeliveryMethod method, int sequenceChannel);

void EnetNetConnection_Update(EnetNetConnection const *self);

EnetNetServer *EnetNetServer_New(void);
void EnetNetServer_Delete(EnetNetServer *self);

NetIncomingMessage const *EnetNetServer_ReadMessage(EnetNetServer *self);

void EnetNetServer_SetPort(EnetNetServer *self, int port);

void EnetNetServer_Start(EnetNetServer *self);

#define EnetPacketFlags_NO_ALLOCATE  4

#define EnetPacketFlags_NONE  0

#define EnetPacketFlags_RELIABLE  1

#define EnetPacketFlags_UNRELIABLE_FRAGMENT  8

#define EnetPacketFlags_UNSEQUENCED  2

Entity *Entity_New(void);
void Entity_Delete(Entity *self);

EntityDrawArea *EntityDrawArea_New(void);
void EntityDrawArea_Delete(EntityDrawArea *self);

EntityDrawModel *EntityDrawModel_New(void);
void EntityDrawModel_Delete(EntityDrawModel *self);

EntityDrawText *EntityDrawText_New(void);
void EntityDrawText_Delete(EntityDrawText *self);

EntityPosition_ *EntityPosition__New(void);
void EntityPosition__Delete(EntityPosition_ *self);

void EntityScript_OnNewFrameFixed(EntityScript const *self, Game const *game, int entity, float dt);

Expires *Expires_New(void);
void Expires_Delete(Expires *self);

FastQueueInt *FastQueueInt_New(void);
void FastQueueInt_Delete(FastQueueInt *self);

void FastQueueInt_Clear(FastQueueInt *self);

void FastQueueInt_Initialize(FastQueueInt *self, int maxCount);

int FastQueueInt_Pop(FastQueueInt *self);

void FastQueueInt_Push(FastQueueInt *self, int value);

FastStackInt *FastStackInt_New(void);
void FastStackInt_Delete(FastStackInt *self);

void FastStackInt_Clear(FastStackInt *self);

void FastStackInt_Initialize(FastStackInt *self, int maxCount);

int FastStackInt_Pop(FastStackInt *self);

void FastStackInt_Push(FastStackInt *self, int value);

FloatRef *FloatRef_New(void);
void FloatRef_Delete(FloatRef *self);

FloatRef *FloatRef_Create(float value_);

float FloatRef_GetValue(FloatRef const *self);

void FloatRef_SetValue(FloatRef *self, float value_);

FontCi *FontCi_New(void);
void FontCi_Delete(FontCi *self);

#define FreemoveLevelEnum_FREEMOVE  1

#define FreemoveLevelEnum_NOCLIP  2

#define FreemoveLevelEnum_NONE  0

FrustumCulling *FrustumCulling_New(void);
void FrustumCulling_Delete(FrustumCulling *self);

/**
 * &lt;summary&gt;
 * Calculating the frustum planes.
 * &lt;/summary&gt;
 * &lt;remarks&gt;
 * From the current OpenGL modelview and projection matrices,
 * calculate the frustum plane equations (Ax+By+Cz+D=0, n=(A,B,C))
 * The equations can then be used to see on which side points are.
 * &lt;/remarks&gt;
 */
void FrustumCulling_CalcFrustumEquations(FrustumCulling *self);

cibool FrustumCulling_SphereInFrustum(FrustumCulling const *self, float x, float y, float z, float radius);

Game *Game_New(void);
void Game_Delete(Game *self);

void Game_AddChatline(Game *self, const char *s);

void Game_AddMod(Game *self, ClientMod const *mod);

void Game_AudioPlay(Game const *self, const char *file);

void Game_AudioPlayAt(Game const *self, const char *file, float x, float y, float z);

void Game_AudioPlayLoop(Game const *self, const char *file, cibool play, cibool restart);

cibool Game_BoolCommandArgument(Game const *self, const char *arguments);

int const *Game_ByteArrayToUshortArray(unsigned char const *input, int inputLength);

void Game_CameraChange(Game *self);

const char *Game_CharToString(Game const *self, int c);

#define Game_CHAT_FONT_SIZE  11

void Game_Circle3i(Game *self, float x, float y, float radius);

int Game_ColorA(int color);

int Game_ColorB(int color);

int Game_ColorFromArgb(int a, int r, int g, int b);

int Game_ColorG(int color);

int Game_ColorR(int color);

ModelData const *Game_CombineModelData(Game const *self, ModelData const *const *modelDatas, int count);

#define Game_D_I_S_C_O_N_N_E_C_T_E_D__I_C_O_N__A_F_T_E_R__S_E_C_O_N_D_S  10

void Game_DeleteUnusedCachedTextTextures(Game const *self);

void Game_Dispose(Game const *self);

float Game_Dist(Game const *self, float x1, float y1, float z1, float x2, float y2, float z2);

void Game_Draw2dBitmapFile(Game *self, const char *filename, float x, float y, float w, float h);

void Game_Draw2dText(Game *self, const char *text, FontCi const *font, float x, float y, IntRef const *color, cibool enabledepthtest);

void Game_Draw2dTexture(Game *self, int textureid, float x1, float y1, float width, float height, IntRef const *inAtlasId, int atlastextures, int color, cibool enabledepthtest);

void Game_Draw2dTexturePart(Game const *self, int textureid, float srcwidth, float srcheight, float dstx, float dsty, float dstwidth, float dstheight, int color, cibool enabledepthtest);

void Game_Draw2dTextures(Game const *self, Draw2dData const *const *todraw, int todrawLength, int textureid);

void Game_DrawModel(Game const *self, Model const *model);

void Game_DrawModelData(Game const *self, ModelData const *data);

void Game_DrawModels(Game const *self, Model const *const *model, int count);

void Game_EscapeMenuStart(Game *self);

float Game_EyesPosX(Game const *self);

float Game_EyesPosY(Game const *self);

float Game_EyesPosZ(Game const *self);

void Game_GLLoadIdentity(Game const *self);

void Game_GLLoadMatrix(Game const *self, float const *m);

void Game_GLMatrixModeModelView(Game *self);

void Game_GLMatrixModeProjection(Game *self);

void Game_GLOrtho(Game const *self, float left, float right, float bottom, float top, float zNear, float zFar);

void Game_GLPopMatrix(Game const *self);

void Game_GLPushMatrix(Game const *self);

void Game_GLRotate(Game const *self, float angle, float x, float y, float z);

void Game_GLScale(Game const *self, float x, float y, float z);

void Game_GLTranslate(Game const *self, float x, float y, float z);

cibool Game_GetFreeMouse(Game const *self);

int Game_GetLight(Game const *self, int x, int y, int z);

float Game_GetPi(void);

GamePlatform const *Game_GetPlatform(Game const *self);

int Game_GetPlayerEyesBlockX(Game const *self);

int Game_GetPlayerEyesBlockY(Game const *self);

int Game_GetPlayerEyesBlockZ(Game const *self);

unsigned char Game_HeadingByte(Game const *self, float orientationX, float orientationY, float orientationZ);

int Game_Height(Game const *self);

#define Game_HOUR_DETAIL  4

unsigned char Game_IntToByte(int a);

cibool Game_IsEmptyForPhysics(Game const *self, Packet_BlockType const *block);

cibool Game_IsRail(Game const *self, Packet_BlockType const *block);

cibool Game_IsTransparentForLight(Packet_BlockType const *b);

#define Game_KEY_ALT_LEFT  5

#define Game_KEY_ALT_RIGHT  6

void Game_MapLoadingStart(Game *self);

int Game_MaterialSlots_(Game const *self, int i);

int Game_MathFloor(Game const *self, float a);

void Game_MouseMove(Game *self, MouseEventArgs const *e);

float Game_NextFloat(Game const *self, float min, float max);

void Game_OnBackPressed(Game const *self);

void Game_OnRenderFrame(Game const *self, float deltaTime);

void Game_OnTouchEnd(Game *self, TouchEventArgs const *e);

void Game_OnTouchMove(Game const *self, TouchEventArgs const *e);

void Game_OnTouchStart(Game *self, TouchEventArgs const *e);

void Game_OrthoMode(Game *self, int width, int height);

void Game_PerspectiveMode(Game *self);

BlockPosSide const *const *Game_Pick(Game const *self, BlockOctreeSearcher *s_, Line3D const *line, IntRef *retCount);

unsigned char Game_PitchByte(Game const *self, float orientationX, float orientationY, float orientationZ);

void Game_PlaySoundAt(Game const *self, const char *name, float x, float y, float z);

void Game_QueueActionCommit(Game const *self, Action_ const *action);

float Game_Scale(Game const *self);

void Game_SendPacket(Game const *self, unsigned char const *packet, int packetLength);

void Game_SendPacketClient(Game const *self, Packet_Client const *packetClient);

unsigned char const *Game_Serialize(Game const *self, Packet_Client const *packet, IntRef *retLength);

int Game_SerializeFloat(Game const *self, float p);

void Game_Set3dProjection(Game *self, float zfar, float fov);

void Game_SetFile(Game const *self, const char *name, const char *md5, unsigned char const *downloaded, int downloadedLength);

void Game_SetFreeMouse(Game *self, cibool value);

void Game_SetMatrixUniformModelView(Game const *self);

void Game_SetMatrixUniformProjection(Game const *self);

void Game_SetMatrixUniforms(Game const *self);

void Game_SetPlatform(Game *self, GamePlatform const *value);

void Game_ShowEscapeMenu(Game *self);

void Game_ShowInventory(Game *self);

void Game_Start(Game *self);

void Game_StartTyping(Game *self);

void Game_StopTyping(Game *self);

cibool Game_StringEquals(const char *strA, const char *strB);

void Game_ToggleFog(Game *self);

void Game_Update(Game const *self, float dt);

void Game_UpdateTextRendererFont(Game const *self);

cibool Game_Vec3Equal(Game const *self, float ax, float ay, float az, float bx, float by, float bz);

float Game_WaterLevel(Game const *self);

float Game_WeaponAttackStrength(Game const *self);

int Game_WhiteTexture(Game *self);

int Game_Width(Game const *self);

int Game_blockheight(Game const *self, int x, int y, int z_);

#define Game_CLEARCOLOR_A  255

#define Game_CLEARCOLOR_B  0

#define Game_CLEARCOLOR_G  0

#define Game_CLEARCOLOR_R  0

#define Game_ENTITY_LOCAL_ID_START  256

#define Game_ENTITY_MONSTER_ID_COUNT  128

#define Game_ENTITY_MONSTER_ID_START  128

float Game_getblockheight(Game const *self, int x, int y, int z);

#define Game_MAXLIGHT  15

#define Game_MINLIGHT  0

#define Game_PLAYERTEXTUREDEFAULTFILENAME  "mineplayer.png"

GameData *GameData_New(void);
void GameData_Delete(GameData *self);

int GameData_BlockIdAdminium(GameData const *self);

int GameData_BlockIdCompass(GameData const *self);

int GameData_BlockIdCraftingTable(GameData const *self);

int GameData_BlockIdCuboid(GameData const *self);

int GameData_BlockIdDirt(GameData const *self);

int GameData_BlockIdEmpty(GameData const *self);

int GameData_BlockIdEmptyHand(GameData const *self);

int GameData_BlockIdFillArea(GameData const *self);

int GameData_BlockIdFillStart(GameData const *self);

int GameData_BlockIdLadder(GameData const *self);

int GameData_BlockIdLava(GameData const *self);

int GameData_BlockIdMinecart(GameData const *self);

int GameData_BlockIdRailstart(GameData const *self);

int GameData_BlockIdSponge(GameData const *self);

int GameData_BlockIdStationaryLava(GameData const *self);

int GameData_BlockIdTrampoline(GameData const *self);

const char ***GameData_BreakSound(GameData const *self);

const char ***GameData_BuildSound(GameData const *self);

const char ***GameData_CloneSound(GameData const *self);

int *GameData_DamageToPlayer(GameData const *self);

int const *GameData_DefaultMaterialSlots(GameData const *self);

cibool *GameData_IsFlower(GameData const *self);

cibool GameData_IsRailTile(GameData const *self, int id);

cibool *GameData_IsSlipperyWalk(GameData const *self);

int *GameData_LightRadius(GameData const *self);

int *GameData_Rail(GameData const *self);

cibool GameData_SetSpecialBlock(GameData *self, Packet_BlockType const *b, int id);

#define GameData_SOUND_COUNT  8

void GameData_Start(GameData *self);

int const *GameData_StartInventoryAmount(GameData const *self);

float *GameData_Strength(GameData const *self);

void GameData_Update(GameData const *self);

void GameData_UseBlockType(GameData *self, GamePlatform const *platform, int id, Packet_BlockType const *b);

void GameData_UseBlockTypes(GameData *self, GamePlatform const *platform, Packet_BlockType const *const *blocktypes, int count);

const char ***GameData_WalkSound(GameData const *self);

float *GameData_WalkSpeed(GameData const *self);

int *GameData_WalkableType1(GameData const *self);

int const *GameData_WhenPlayerPlacesGetsConvertedTo(GameData const *self);

GameDataItemsClient *GameDataItemsClient_New(void);
void GameDataItemsClient_Delete(GameDataItemsClient *self);

cibool GameDataItemsClient_CanWear(GameDataItemsClient const *self, int selectedWear, Packet_Item const *item);

const char *GameDataItemsClient_ItemGraphics(GameDataItemsClient const *self, Packet_Item const *item);

const char *GameDataItemsClient_ItemInfo(GameDataItemsClient const *self, Packet_Item const *item);

int GameDataItemsClient_ItemSizeX(GameDataItemsClient const *self, Packet_Item const *item);

int GameDataItemsClient_ItemSizeY(GameDataItemsClient const *self, Packet_Item const *item);

Packet_Item const *GameDataItemsClient_Stack(GameDataItemsClient const *self, Packet_Item const *itemA, Packet_Item const *itemB);

int const *GameDataItemsClient_TextureIdForInventory(GameDataItemsClient const *self);

GameDataMonsters *GameDataMonsters_New(void);
void GameDataMonsters_Delete(GameDataMonsters *self);

GameExit *GameExit_New(void);
void GameExit_Delete(GameExit *self);

cibool GameExit_GetExit(GameExit const *self);

cibool GameExit_GetRestart(GameExit const *self);

void GameExit_SetExit(GameExit *self, cibool p);

void GameExit_SetRestart(GameExit *self, cibool p);

GameScreen *GameScreen_New(void);
void GameScreen_Delete(GameScreen *self);

const char *GameScreen_CharRepeat(GameScreen const *self, int c, int length);

const char *GameScreen_CharToString(GameScreen const *self, int a);

void GameScreen_DrawWidgets(GameScreen const *self);

void GameScreen_OnBackPressed(GameScreen const *self);

void GameScreen_OnButton(GameScreen const *self, MenuWidget const *w);

void GameScreen_OnKeyDown(GameScreen const *self, Game const *game_, KeyEventArgs const *args);

void GameScreen_OnKeyPress(GameScreen const *self, Game const *game_, KeyPressEventArgs const *args);

void GameScreen_OnMouseDown(GameScreen const *self, Game const *game_, MouseEventArgs const *args);

void GameScreen_OnMouseMove(GameScreen const *self, Game const *game_, MouseEventArgs const *args);

void GameScreen_OnMouseUp(GameScreen const *self, Game const *game_, MouseEventArgs const *args);

void GameScreen_OnMouseWheel(GameScreen const *self, MouseWheelEventArgs const *e);

void GameScreen_OnTouchEnd(GameScreen const *self, Game const *game_, TouchEventArgs const *e);

void GameScreen_OnTouchStart(GameScreen const *self, Game const *game_, TouchEventArgs *e);

void GameScreen_ScreenOnTouchEnd(GameScreen const *self, TouchEventArgs const *e);

void GameScreen_ScreenOnTouchStart(GameScreen const *self, TouchEventArgs *e);

cibool GameVersionHelper_ServerVersionAtLeast(GamePlatform const *platform, const char *serverGameVersion, int year, int month, int day);

GetBlockHeight_ *GetBlockHeight__New(void);
void GetBlockHeight__Delete(GetBlockHeight_ *self);

GetBlockHeight_ const *GetBlockHeight__Create(Game const *w_);

float GetBlockHeight__GetBlockHeight(GetBlockHeight_ const *self, int x, int y, int z);

GetCameraMatrix *GetCameraMatrix_New(void);
void GetCameraMatrix_Delete(GetCameraMatrix *self);

float const *GetCameraMatrix_GetModelViewMatrix(GetCameraMatrix const *self);

float const *GetCameraMatrix_GetProjectionMatrix(GetCameraMatrix const *self);

#define GlKeys_A  83

#define GlKeys_ALT_LEFT  5

#define GlKeys_ALT_RIGHT  6

#define GlKeys_B  84

#define GlKeys_BACK  53

#define GlKeys_BACK_SLASH  129

#define GlKeys_BACK_SPACE  53

#define GlKeys_BRACKET_LEFT  122

#define GlKeys_BRACKET_RIGHT  123

#define GlKeys_C  85

#define GlKeys_CAPS_LOCK  60

#define GlKeys_CLEAR  65

#define GlKeys_COMMA  126

#define GlKeys_CONTROL_LEFT  3

#define GlKeys_CONTROL_RIGHT  4

#define GlKeys_D  86

#define GlKeys_DELETE  55

#define GlKeys_DOWN  46

#define GlKeys_E  87

#define GlKeys_END  59

#define GlKeys_ENTER  49

#define GlKeys_ESCAPE  50

#define GlKeys_F  88

#define GlKeys_F1  10

#define GlKeys_F10  19

#define GlKeys_F11  20

#define GlKeys_F12  21

#define GlKeys_F13  22

#define GlKeys_F14  23

#define GlKeys_F15  24

#define GlKeys_F16  25

#define GlKeys_F17  26

#define GlKeys_F18  27

#define GlKeys_F19  28

#define GlKeys_F2  11

#define GlKeys_F20  29

#define GlKeys_F21  30

#define GlKeys_F22  31

#define GlKeys_F23  32

#define GlKeys_F24  33

#define GlKeys_F25  34

#define GlKeys_F26  35

#define GlKeys_F27  36

#define GlKeys_F28  37

#define GlKeys_F29  38

#define GlKeys_F3  12

#define GlKeys_F30  39

#define GlKeys_F31  40

#define GlKeys_F32  41

#define GlKeys_F33  42

#define GlKeys_F34  43

#define GlKeys_F35  44

#define GlKeys_F4  13

#define GlKeys_F5  14

#define GlKeys_F6  15

#define GlKeys_F7  16

#define GlKeys_F8  17

#define GlKeys_F9  18

#define GlKeys_G  89

#define GlKeys_H  90

#define GlKeys_HOME  58

#define GlKeys_I  91

#define GlKeys_INSERT  54

#define GlKeys_J  92

#define GlKeys_K  93

#define GlKeys_KEYPAD0  67

#define GlKeys_KEYPAD1  68

#define GlKeys_KEYPAD2  69

#define GlKeys_KEYPAD3  70

#define GlKeys_KEYPAD4  71

#define GlKeys_KEYPAD5  72

#define GlKeys_KEYPAD6  73

#define GlKeys_KEYPAD7  74

#define GlKeys_KEYPAD8  75

#define GlKeys_KEYPAD9  76

#define GlKeys_KEYPAD_ADD  80

#define GlKeys_KEYPAD_DECIMAL  81

#define GlKeys_KEYPAD_DIVIDE  77

#define GlKeys_KEYPAD_ENTER  82

#define GlKeys_KEYPAD_MINUS  79

#define GlKeys_KEYPAD_MULTIPLY  78

#define GlKeys_KEYPAD_PLUS  80

#define GlKeys_KEYPAD_SUBTRACT  79

#define GlKeys_L  94

#define GlKeys_L_ALT  5

#define GlKeys_L_BRACKET  122

#define GlKeys_L_CONTROL  3

#define GlKeys_L_SHIFT  1

#define GlKeys_L_WIN  7

#define GlKeys_LAST_KEY  130

#define GlKeys_LEFT  47

#define GlKeys_M  95

#define GlKeys_MENU  9

#define GlKeys_MINUS  120

#define GlKeys_N  96

#define GlKeys_NUM_LOCK  64

#define GlKeys_NUMBER0  109

#define GlKeys_NUMBER1  110

#define GlKeys_NUMBER2  111

#define GlKeys_NUMBER3  112

#define GlKeys_NUMBER4  113

#define GlKeys_NUMBER5  114

#define GlKeys_NUMBER6  115

#define GlKeys_NUMBER7  116

#define GlKeys_NUMBER8  117

#define GlKeys_NUMBER9  118

#define GlKeys_O  97

#define GlKeys_P  98

#define GlKeys_PAGE_DOWN  57

#define GlKeys_PAGE_UP  56

#define GlKeys_PAUSE  63

#define GlKeys_PERIOD  127

#define GlKeys_PLUS  121

#define GlKeys_PRINT_SCREEN  62

#define GlKeys_Q  99

#define GlKeys_QUOTE  125

#define GlKeys_R  100

#define GlKeys_R_ALT  6

#define GlKeys_R_BRACKET  123

#define GlKeys_R_CONTROL  4

#define GlKeys_R_SHIFT  2

#define GlKeys_R_WIN  8

#define GlKeys_RIGHT  48

#define GlKeys_S  101

#define GlKeys_SCROLL_LOCK  61

#define GlKeys_SEMICOLON  124

#define GlKeys_SHIFT_LEFT  1

#define GlKeys_SHIFT_RIGHT  2

#define GlKeys_SLASH  128

#define GlKeys_SLEEP  66

#define GlKeys_SPACE  51

#define GlKeys_T  102

#define GlKeys_TAB  52

#define GlKeys_TILDE  119

#define GlKeys_U  103

#define GlKeys_UNKNOWN  0

#define GlKeys_UP  45

#define GlKeys_V  104

#define GlKeys_W  105

#define GlKeys_WIN_LEFT  7

#define GlKeys_WIN_RIGHT  8

#define GlKeys_X  106

#define GlKeys_Y  107

#define GlKeys_Z  108

float GlMatrixMath_Abs(float len);

float GlMatrixMath_GLMAT_EPSILON(void);

float GlMatrixMath_PI(void);

float GlMatrixMath_max(float a, float b);

float GlMatrixMath_min(float a, float b);

#define GlobalVar_M_A_X__B_L_O_C_K_T_Y_P_E_S  1024

#define GlobalVar_M_A_X__B_L_O_C_K_T_Y_P_E_S__S_Q_R_T  32

Grenade_ *Grenade__New(void);
void Grenade__Delete(Grenade_ *self);

HashSetVector3IntRef *HashSetVector3IntRef_New(void);
void HashSetVector3IntRef_Delete(HashSetVector3IntRef *self);

void HashSetVector3IntRef_Set(HashSetVector3IntRef const *self, Vector3IntRef const *value);

void HashSetVector3IntRef_Start(HashSetVector3IntRef *self);

HttpResponseCi *HttpResponseCi_New(void);
void HttpResponseCi_Delete(HttpResponseCi *self);

cibool HttpResponseCi_GetDone(HttpResponseCi const *self);

cibool HttpResponseCi_GetError(HttpResponseCi const *self);

unsigned char const *HttpResponseCi_GetValue(HttpResponseCi const *self);

int HttpResponseCi_GetValueLength(HttpResponseCi const *self);

void HttpResponseCi_SetDone(HttpResponseCi *self, cibool value_);

void HttpResponseCi_SetError(HttpResponseCi *self, cibool value_);

void HttpResponseCi_SetValue(HttpResponseCi *self, unsigned char const *value_);

void HttpResponseCi_SetValueLength(HttpResponseCi *self, int value_);

INetOutgoingMessage *INetOutgoingMessage_New(void);
void INetOutgoingMessage_Delete(INetOutgoingMessage *self);

void INetOutgoingMessage_Write(INetOutgoingMessage *self, unsigned char const *source, int sourceCount);

IPEndPointCiDefault *IPEndPointCiDefault_New(void);
void IPEndPointCiDefault_Delete(IPEndPointCiDefault *self);

const char *IPEndPointCiDefault_AddressToString(IPEndPointCiDefault const *self);

IPEndPointCiDefault const *IPEndPointCiDefault_Create(const char *address_);

ITerrainTextures *ITerrainTextures_New(void);
void ITerrainTextures_Delete(ITerrainTextures *self);

int ITerrainTextures_terrainTexture(ITerrainTextures const *self);

int const *ITerrainTextures_terrainTextures1d(ITerrainTextures const *self);

int ITerrainTextures_terrainTexturesPerAtlas(ITerrainTextures const *self);

int ITerrainTextures_texturesPacked(ITerrainTextures const *self);

InfiniteMapChunked2d *InfiniteMapChunked2d_New(void);
void InfiniteMapChunked2d_Delete(InfiniteMapChunked2d *self);

void InfiniteMapChunked2d_ClearChunk(InfiniteMapChunked2d const *self, int x, int y);

int InfiniteMapChunked2d_GetBlock(InfiniteMapChunked2d const *self, int x, int y);

int *InfiniteMapChunked2d_GetChunk(InfiniteMapChunked2d const *self, int x, int y);

void InfiniteMapChunked2d_Restart(InfiniteMapChunked2d *self);

void InfiniteMapChunked2d_SetBlock(InfiniteMapChunked2d const *self, int x, int y, int blocktype);

#define InfiniteMapChunked2d_CHUNKSIZE  16

IntRef *IntRef_New(void);
void IntRef_Delete(IntRef *self);

IntRef const *IntRef_Create(int value_);

int IntRef_GetValue(IntRef const *self);

void IntRef_SetValue(IntRef *self, int value_);

int InterpolationCi_InterpolateColor(GamePlatform const *platform, float progress, int const *colors, int colorsLength);

/**
 * &lt;summary&gt;
 * Warning: randomly returns incorrect hit position (back side of box).
 * &lt;/summary&gt;
 * &lt;param name="box"&gt;&lt;/param&gt;
 * &lt;param name="line"&gt;&lt;/param&gt;
 * &lt;param name="hit"&gt;&lt;/param&gt;
 * &lt;returns&gt;&lt;/returns&gt;
 */
cibool Intersection_CheckLineBox(Box3D const *box, Line3D const *line, float *hit);

cibool Intersection_CheckLineBox1(float const *B1, float const *B2, float const *L1, float const *L2, float *Hit);

float const *Intersection_CheckLineBoxExact(Line3D const *line, Box3D const *box);

cibool Intersection_HitBoundingBox(float const *minB, float const *maxB, float *origin, float const *dir, float *coord);

InventoryUtilClient *InventoryUtilClient_New(void);
void InventoryUtilClient_Delete(InventoryUtilClient *self);

cibool InventoryUtilClient_IsValidCell(InventoryUtilClient const *self, PointRef const *p);

IsBlockEmpty_ *IsBlockEmpty__New(void);
void IsBlockEmpty__Delete(IsBlockEmpty_ *self);

IsBlockEmpty_ const *IsBlockEmpty__Create(Game const *w_);

cibool IsBlockEmpty__IsBlockEmpty(IsBlockEmpty_ const *self, int x, int y, int z);

Kamera *Kamera_New(void);
void Kamera_Delete(Kamera *self);

float Kamera_GetAngle(Kamera const *self);

void Kamera_GetCenter(Kamera const *self, Vector3Ref *ret);

float Kamera_GetDistance(Kamera const *self);

void Kamera_GetPosition(Kamera const *self, GamePlatform const *platform, Vector3Ref *ret);

float Kamera_GetT(Kamera const *self);

void Kamera_Move(Kamera *self, CameraMove const *camera_move, float p);

void Kamera_SetAngle(Kamera *self, float value);

void Kamera_SetDistance(Kamera *self, float value);

void Kamera_SetT(Kamera *self, float value);

void Kamera_TurnLeft(Kamera *self, float p);

void Kamera_TurnRight(Kamera *self, float p);

void Kamera_TurnUp(Kamera *self, float p);

Key *Key_New(void);
void Key_Delete(Key *self);

Key const *Key_Create(int field, int wireType);

int Key_GetField(Key const *self);

int Key_GetWireType(Key const *self);

void Key_SetField(Key *self, int value);

void Key_SetWireType(Key *self, int value);

KeyEventArgs *KeyEventArgs_New(void);
void KeyEventArgs_Delete(KeyEventArgs *self);

cibool KeyEventArgs_GetAltPressed(KeyEventArgs const *self);

cibool KeyEventArgs_GetCtrlPressed(KeyEventArgs const *self);

cibool KeyEventArgs_GetHandled(KeyEventArgs const *self);

int KeyEventArgs_GetKeyCode(KeyEventArgs const *self);

cibool KeyEventArgs_GetShiftPressed(KeyEventArgs const *self);

void KeyEventArgs_SetAltPressed(KeyEventArgs *self, cibool value);

void KeyEventArgs_SetCtrlPressed(KeyEventArgs *self, cibool value);

void KeyEventArgs_SetHandled(KeyEventArgs *self, cibool value);

void KeyEventArgs_SetKeyCode(KeyEventArgs *self, int value);

void KeyEventArgs_SetShiftPressed(KeyEventArgs *self, cibool value);

KeyHelp *KeyHelp_New(void);
void KeyHelp_Delete(KeyHelp *self);

KeyPressEventArgs *KeyPressEventArgs_New(void);
void KeyPressEventArgs_Delete(KeyPressEventArgs *self);

cibool KeyPressEventArgs_GetHandled(KeyPressEventArgs const *self);

int KeyPressEventArgs_GetKeyChar(KeyPressEventArgs const *self);

void KeyPressEventArgs_SetHandled(KeyPressEventArgs *self, cibool value);

void KeyPressEventArgs_SetKeyChar(KeyPressEventArgs *self, int value);

KeyValue *KeyValue_New(void);
void KeyValue_Delete(KeyValue *self);

KeyValue const *KeyValue_Create(Key const *key, unsigned char const *value);

KeyValueStringInt *KeyValueStringInt_New(void);
void KeyValueStringInt_Delete(KeyValueStringInt *self);

KeyValueStringString *KeyValueStringString_New(void);
void KeyValueStringString_Delete(KeyValueStringString *self);

Keyframe *Keyframe_New(void);
void Keyframe_Delete(Keyframe *self);

const char *KeyframeType_GetName(int p);

int KeyframeType_GetValue(const char *p);

#define KeyframeType_PIVOT  4

#define KeyframeType_POSITION  1

#define KeyframeType_ROTATION  2

#define KeyframeType_SCALE  5

#define KeyframeType_SIZE  3

Language *Language_New(void);
void Language_Delete(Language *self);

TranslatedString const *const *Language_AllStrings(Language const *self);

const char *Language_AutoJumpOption(Language const *self);

const char *Language_CannotWriteChatLog(Language const *self);

const char *Language_ChunkUpdates(Language const *self);

const char *Language_ClientLanguageOption(Language const *self);

const char *Language_Connecting(Language const *self);

const char *Language_ConnectingProgressKilobytes(Language const *self);

const char *Language_ConnectingProgressPercent(Language const *self);

const char *Language_DefaultKeys(Language const *self);

const char *Language_Exit(Language const *self);

const char *Language_FogDistance(Language const *self);

const char *Language_FontOption(Language const *self);

const char *Language_FrameRateLagSimulation(Language const *self);

const char *Language_FrameRateUnlimited(Language const *self);

const char *Language_FrameRateVsync(Language const *self);

const char *Language_FreemoveNotAllowed(Language const *self);

const char *Language_GameName(Language const *self);

const char *Language_Get(Language const *self, const char *id);

const char *Language_GetUsedLanguage(Language const *self);

const char *Language_Graphics(Language const *self);

const char *Language_InvalidVersionConnectAnyway(Language const *self);

cibool Language_IsNewLanguage(Language const *self, const char *language);

const char *Language_KeyBlockInfo(Language const *self);

const char *Language_KeyChange(Language const *self);

const char *Language_KeyChat(Language const *self);

const char *Language_KeyCraft(Language const *self);

const char *Language_KeyFreeMove(Language const *self);

const char *Language_KeyFullscreen(Language const *self);

const char *Language_KeyJump(Language const *self);

const char *Language_KeyMoveBack(Language const *self);

const char *Language_KeyMoveFoward(Language const *self);

const char *Language_KeyMoveLeft(Language const *self);

const char *Language_KeyMoveRight(Language const *self);

const char *Language_KeyMoveSpeed(Language const *self);

const char *Language_KeyPlayersList(Language const *self);

const char *Language_KeyReloadWeapon(Language const *self);

const char *Language_KeyRespawn(Language const *self);

const char *Language_KeyReverseMinecart(Language const *self);

const char *Language_KeyScreenshot(Language const *self);

const char *Language_KeySetSpawnPosition(Language const *self);

const char *Language_KeyShowMaterialSelector(Language const *self);

const char *Language_KeyTeamChat(Language const *self);

const char *Language_KeyTextEditor(Language const *self);

const char *Language_KeyThirdPersonCamera(Language const *self);

const char *Language_KeyToggleFogDistance(Language const *self);

const char *Language_KeyUse(Language const *self);

const char *Language_Keys(Language const *self);

void Language_LoadTranslations(Language *self);

const char *Language_MoveFree(Language const *self);

const char *Language_MoveFreeNoclip(Language const *self);

const char *Language_MoveNormal(Language const *self);

const char *Language_MoveSpeed(Language const *self);

void Language_NextLanguage(Language *self);

const char *Language_NoMaterialsForCrafting(Language const *self);

const char *Language_Off(Language const *self);

const char *Language_On(Language const *self);

const char *Language_OptionFramerate(Language const *self);

const char *Language_OptionFullscreen(Language const *self);

const char *Language_OptionResolution(Language const *self);

const char *Language_OptionSmoothShadows(Language const *self);

const char *Language_Options(Language const *self);

const char *Language_Other(Language const *self);

void Language_Override(Language *self, const char *language, const char *id, const char *translated);

const char *Language_PressToUse(Language const *self);

const char *Language_Respawn(Language const *self);

const char *Language_ReturnToGame(Language const *self);

const char *Language_ReturnToMainMenu(Language const *self);

const char *Language_ReturnToOptionsMenu(Language const *self);

const char *Language_ServerBanlistCorrupt(Language const *self);

const char *Language_ServerBanlistCorruptNoBackup(Language const *self);

const char *Language_ServerBanlistLoaded(Language const *self);

const char *Language_ServerBanlistNotFound(Language const *self);

const char *Language_ServerCannotWriteLog(Language const *self);

const char *Language_ServerClientConfigGuestGroupNotFound(Language const *self);

const char *Language_ServerClientConfigLoaded(Language const *self);

const char *Language_ServerClientConfigNotFound(Language const *self);

const char *Language_ServerClientConfigRegisteredGroupNotFound(Language const *self);

const char *Language_ServerClientException(Language const *self);

const char *Language_ServerConfigCorruptBackup(Language const *self);

const char *Language_ServerConfigCorruptNoBackup(Language const *self);

const char *Language_ServerConfigLoaded(Language const *self);

const char *Language_ServerConfigNotFound(Language const *self);

const char *Language_ServerCreatingSavegame(Language const *self);

const char *Language_ServerFillAreaInvalid(Language const *self);

const char *Language_ServerFillAreaTooLarge(Language const *self);

const char *Language_ServerGameSaved(Language const *self);

const char *Language_ServerHTTPServerError(Language const *self);

const char *Language_ServerHTTPServerStarted(Language const *self);

const char *Language_ServerHeartbeatError(Language const *self);

const char *Language_ServerHeartbeatSent(Language const *self);

const char *Language_ServerIPBanned(Language const *self);

const char *Language_ServerInvalidBackupName(Language const *self);

const char *Language_ServerInvalidSpawnCoordinates(Language const *self);

const char *Language_ServerLoadedSavegame(Language const *self);

const char *Language_ServerLoadingSavegame(Language const *self);

const char *Language_ServerMonitorBuildingDisabled(Language const *self);

const char *Language_ServerMonitorChatMuted(Language const *self);

const char *Language_ServerMonitorChatNotSent(Language const *self);

const char *Language_ServerMonitorConfigLoaded(Language const *self);

const char *Language_ServerMonitorConfigNotFound(Language const *self);

const char *Language_ServerNoBuildPermissionHere(Language const *self);

const char *Language_ServerNoBuildPrivilege(Language const *self);

const char *Language_ServerNoChatPrivilege(Language const *self);

const char *Language_ServerNoGuests(Language const *self);

const char *Language_ServerNoSpectatorBuild(Language const *self);

const char *Language_ServerNoSpectatorUse(Language const *self);

const char *Language_ServerNoUsePrivilege(Language const *self);

const char *Language_ServerPasswordInvalid(Language const *self);

const char *Language_ServerPlayerDisconnect(Language const *self);

const char *Language_ServerPlayerJoin(Language const *self);

const char *Language_ServerProgressDownloadingData(Language const *self);

const char *Language_ServerProgressDownloadingMap(Language const *self);

const char *Language_ServerProgressGenerating(Language const *self);

const char *Language_ServerSetupAccept(Language const *self);

const char *Language_ServerSetupEnableHTTP(Language const *self);

const char *Language_ServerSetupFirstStart(Language const *self);

const char *Language_ServerSetupMOTD(Language const *self);

const char *Language_ServerSetupMaxClients(Language const *self);

const char *Language_ServerSetupMaxClientsInvalidInput(Language const *self);

const char *Language_ServerSetupMaxClientsInvalidValue(Language const *self);

const char *Language_ServerSetupName(Language const *self);

const char *Language_ServerSetupPort(Language const *self);

const char *Language_ServerSetupPortInvalidInput(Language const *self);

const char *Language_ServerSetupPortInvalidValue(Language const *self);

const char *Language_ServerSetupPublic(Language const *self);

const char *Language_ServerSetupQuestion(Language const *self);

const char *Language_ServerSetupWelcomeMessage(Language const *self);

const char *Language_ServerTooManyPlayers(Language const *self);

const char *Language_ServerUsernameBanned(Language const *self);

const char *Language_ServerUsernameInvalid(Language const *self);

const char *Language_ShadowsOption(Language const *self);

const char *Language_SoundOption(Language const *self);

const char *Language_SpawnPositionSet(Language const *self);

const char *Language_SpawnPositionSetTo(Language const *self);

const char *Language_Triangles(Language const *self);

const char *Language_UseServerTexturesOption(Language const *self);

const char *Language_ViewDistanceOption(Language const *self);

LightBase *LightBase_New(void);
void LightBase_Delete(LightBase *self);

void LightBase_CalculateChunkBaseLight(LightBase const *self, Game const *game, int cx, int cy, int cz, int const *dataLightRadius, cibool const *transparentForLight);

LightBetweenChunks *LightBetweenChunks_New(void);
void LightBetweenChunks_Delete(LightBetweenChunks *self);

void LightBetweenChunks_CalculateLightBetweenChunks(LightBetweenChunks const *self, Game const *game, int cx, int cy, int cz, int const *dataLightRadius, cibool const *dataTransparent);

LightFlood *LightFlood_New(void);
void LightFlood_Delete(LightFlood *self);

void LightFlood_FloodLight(LightFlood const *self, int const *chunk, unsigned char *light, int startx, int starty, int startz, int const *dataLightRadius, cibool const *dataTransparent);

#define LightFlood_X_MINUS  -1

#define LightFlood_X_PLUS  1

#define LightFlood_Y_MINUS  -16

#define LightFlood_Y_PLUS  16

#define LightFlood_Z_MINUS  -256

#define LightFlood_Z_PLUS  256

Line3D *Line3D_New(void);
void Line3D_Delete(Line3D *self);

ListAction *ListAction_New(void);
void ListAction_Delete(ListAction *self);

ListAction *ListAction_Create(int max_);

void ListAction_Start(ListAction *self, int max_);

ListBox3d *ListBox3d_New(void);
void ListBox3d_Delete(ListBox3d *self);

ListConnectedPlayer *ListConnectedPlayer_New(void);
void ListConnectedPlayer_Delete(ListConnectedPlayer *self);

ListInfo *ListInfo_New(void);
void ListInfo_Delete(ListInfo *self);

LoginClientCi *LoginClientCi_New(void);
void LoginClientCi_Delete(LoginClientCi *self);

void LoginClientCi_Login(LoginClientCi *self, GamePlatform const *platform, const char *user, const char *password, const char *publicServerKey, const char *token, LoginResultRef *result, LoginData *resultLoginData_);

void LoginClientCi_Update(LoginClientCi *self, GamePlatform const *platform);

LoginData *LoginData_New(void);
void LoginData_Delete(LoginData *self);

LoginResultRef *LoginResultRef_New(void);
void LoginResultRef_Delete(LoginResultRef *self);

MainMenu *MainMenu_New(void);
void MainMenu_Delete(MainMenu *self);

const char *MainMenu_CharRepeat(MainMenu const *self, int c, int length);

const char *MainMenu_CharToString(MainMenu const *self, int a);

void MainMenu_ConnectToSingleplayer(MainMenu *self, const char *filename);

void MainMenu_Draw2dQuad(MainMenu *self, int textureid, float dx, float dy, float dw, float dh);

float MainMenu_GetScale(MainMenu const *self);

void MainMenu_HandleKeyDown(MainMenu const *self, KeyEventArgs const *e);

void MainMenu_HandleKeyPress(MainMenu *self, KeyPressEventArgs const *e);

void MainMenu_HandleKeyUp(MainMenu const *self, KeyEventArgs const *e);

void MainMenu_HandleMouseDown(MainMenu *self, MouseEventArgs const *e);

void MainMenu_HandleMouseMove(MainMenu *self, MouseEventArgs const *e);

void MainMenu_HandleMouseUp(MainMenu *self, MouseEventArgs const *e);

void MainMenu_HandleMouseWheel(MainMenu *self, MouseWheelEventArgs const *e);

void MainMenu_HandleTouchEnd(MainMenu const *self, TouchEventArgs const *e);

void MainMenu_HandleTouchMove(MainMenu *self, TouchEventArgs const *e);

void MainMenu_HandleTouchStart(MainMenu *self, TouchEventArgs const *e);

void MainMenu_OnNewFrame(MainMenu *self, NewFrameEventArgs const *args);

void MainMenu_Start(MainMenu *self, GamePlatform const *p_);

void MainMenu_StartGame(MainMenu *self, cibool singleplayer, const char *singleplayerSavePath, ConnectData *connectData);

cibool MainMenu_StringEndsWith(MainMenu const *self, const char *s, const char *value);

int MainMenu_StringLength(MainMenu const *self, const char *a);

MainMenuKeyEventHandler *MainMenuKeyEventHandler_New(void);
void MainMenuKeyEventHandler_Delete(MainMenuKeyEventHandler *self);

MainMenuKeyEventHandler const *MainMenuKeyEventHandler_Create(MainMenu *l);

void MainMenuKeyEventHandler_OnKeyDown(MainMenuKeyEventHandler const *self, KeyEventArgs const *e);

void MainMenuKeyEventHandler_OnKeyPress(MainMenuKeyEventHandler const *self, KeyPressEventArgs const *e);

void MainMenuKeyEventHandler_OnKeyUp(MainMenuKeyEventHandler const *self, KeyEventArgs const *e);

MainMenuMouseEventHandler *MainMenuMouseEventHandler_New(void);
void MainMenuMouseEventHandler_Delete(MainMenuMouseEventHandler *self);

MainMenuMouseEventHandler const *MainMenuMouseEventHandler_Create(MainMenu *l);

void MainMenuMouseEventHandler_OnMouseDown(MainMenuMouseEventHandler const *self, MouseEventArgs const *e);

void MainMenuMouseEventHandler_OnMouseMove(MainMenuMouseEventHandler const *self, MouseEventArgs const *e);

void MainMenuMouseEventHandler_OnMouseUp(MainMenuMouseEventHandler const *self, MouseEventArgs const *e);

void MainMenuMouseEventHandler_OnMouseWheel(MainMenuMouseEventHandler const *self, MouseWheelEventArgs const *e);

MainMenuNewFrameHandler *MainMenuNewFrameHandler_New(void);
void MainMenuNewFrameHandler_Delete(MainMenuNewFrameHandler *self);

MainMenuNewFrameHandler const *MainMenuNewFrameHandler_Create(MainMenu *l);

void MainMenuNewFrameHandler_OnNewFrame(MainMenuNewFrameHandler const *self, NewFrameEventArgs const *args);

MainMenuTouchEventHandler *MainMenuTouchEventHandler_New(void);
void MainMenuTouchEventHandler_Delete(MainMenuTouchEventHandler *self);

MainMenuTouchEventHandler const *MainMenuTouchEventHandler_Create(MainMenu *l);

void MainMenuTouchEventHandler_OnTouchEnd(MainMenuTouchEventHandler const *self, TouchEventArgs const *e);

void MainMenuTouchEventHandler_OnTouchMove(MainMenuTouchEventHandler const *self, TouchEventArgs const *e);

void MainMenuTouchEventHandler_OnTouchStart(MainMenuTouchEventHandler const *self, TouchEventArgs const *e);

Map *Map_New(void);
void Map_Delete(Map *self);

void Map_CopyChunk(Map const *self, Chunk const *chunk, int *output);

void Map_FillChunk(Map const *self, Chunk *destination, int destinationchunksize, int sourcex, int sourcey, int sourcez, int const *source, int sourcechunksizeX, int sourcechunksizeY, int sourcechunksizeZ);

int Map_GetBlock(Map const *self, int x, int y, int z);

int Map_GetBlockValid(Map const *self, int x, int y, int z);

Chunk *Map_GetChunk(Map const *self, int x, int y, int z);

Chunk const *Map_GetChunk_(Map const *self, int cx, int cy, int cz);

void Map_GetMapPortion(Map const *self, int *outPortion, int x, int y, int z, int portionsizex, int portionsizey, int portionsizez);

cibool Map_IsChunkRendered(Map const *self, int cx, int cy, int cz);

cibool Map_IsValidChunkPos(Map const *self, int cx, int cy, int cz);

cibool Map_IsValidPos(Map const *self, int x, int y, int z);

int Map_MaybeGetLight(Map const *self, int x, int y, int z);

void Map_Reset(Map *self, int sizex, int sizey, int sizez);

void Map_SetBlockDirty(Map const *self, int x, int y, int z);

void Map_SetBlockRaw(Map const *self, int x, int y, int z, int tileType);

void Map_SetChunkDirty(Map const *self, int cx, int cy, int cz, cibool dirty, cibool blockschanged);

void Map_SetChunksAroundDirty(Map const *self, int cx, int cy, int cz);

void Map_SetMapPortion(Map const *self, int x, int y, int z, int const *chunk, int sizeX, int sizeY, int sizeZ);

int Map_mapsizexchunks(Map const *self);

int Map_mapsizeychunks(Map const *self);

int Map_mapsizezchunks(Map const *self);

MapLoadingProgressEventArgs *MapLoadingProgressEventArgs_New(void);
void MapLoadingProgressEventArgs_Delete(MapLoadingProgressEventArgs *self);

MapStorage2 *MapStorage2_New(void);
void MapStorage2_Delete(MapStorage2 *self);

MapStorage2 const *MapStorage2_Create(Game *game);

int MapStorage2_GetBlock(MapStorage2 const *self, int x, int y, int z);

int MapStorage2_GetMapSizeX(MapStorage2 const *self);

int MapStorage2_GetMapSizeY(MapStorage2 const *self);

int MapStorage2_GetMapSizeZ(MapStorage2 const *self);

void MapStorage2_SetBlock(MapStorage2 const *self, int x, int y, int z, int tileType);

int MapUtilCi_Index2d(int x, int y, int sizex);

int MapUtilCi_Index3d(int x, int y, int h, int sizex, int sizey);

void MapUtilCi_Pos(int index, int sizex, int sizey, Vector3Ref *ret);

int MapUtilCi_PosX(int index, int sizex, int sizey);

int MapUtilCi_PosY(int index, int sizex, int sizey);

int MapUtilCi_PosZ(int index, int sizex, int sizey);

/**
 * Calculates the adjugate of a mat2
 * Returns output
 * @param output the receiving matrix
 * @param a the source matrix
 */
float const *Mat2_Adjoint(float *output, float const *a);

/**
 * Creates a new mat2 initialized with values from an existing matrix
 * Returns a new 2x2 matrix
 * @param a matrix to clone
 */
float const *Mat2_CloneIt(float const *a);

/**
 * Copy the values from one mat2 to another
 * Returns output
 * @param output the receiving matrix
 * @param a the source matrix
 */
float const *Mat2_Copy(float *output, float const *a);

/**
 * Creates a new identity mat2
 * Returns a new 2x2 matrix
 */
float const *Mat2_Create(void);

/**
 * Calculates the determinant of a mat2
 * Returns determinant of a
 * @param a the source matrix
 */
float Mat2_Determinant(float const *a);

/**
 * Set a mat2 to the identity matrix
 * Returns output
 * @param output the receiving matrix
 */
float const *Mat2_Identity_(float *output);

/**
 * Inverts a mat2
 * Returns output
 * @param output the receiving matrix
 * @param a the source matrix
 */
float const *Mat2_Invert(float *output, float const *a);

/**
 * Alias for {@link mat2.multiply}
 */
float const *Mat2_Mul(float *output, float const *a, float const *b);

/**
 * Multiplies two mat2's
 * Returns output
 * @param output the receiving matrix
 * @param a the first operand
 * @param b the second operand
 */
float const *Mat2_Multiply(float *output, float const *a, float const *b);

/**
 * Rotates a mat2 by the given angle
 * Returns output
 * @param output the receiving matrix
 * @param a the matrix to rotate
 * @param rad the angle to rotate the matrix by
 */
float const *Mat2_Rotate(float *output, float const *a, float rad);

/**
 * Scales the mat2 by the dimensions in the given vec2
 * Returns output
 * @param output the receiving matrix
 * @param a the matrix to rotate
 * @param v the vec2 to scale the matrix by
 */
float const *Mat2_Scale(float *output, float const *a, float const *v);

/**
 * Transpose the values of a mat2
 * Returns output
 * @param output the receiving matrix
 * @param a the source matrix
 */
float const *Mat2_Transpose(float *output, float const *a);

/**
 * Creates a new mat2d initialized with values from an existing matrix
 * Returns a new 2x3 matrix
 * @param a matrix to clone
 */
float const *Mat2d_CloneIt(float const *a);

/**
 * Copy the values from one mat2d to another
 * Returns output
 * @param output the receiving matrix
 * @param a the source matrix
 */
float const *Mat2d_Copy(float *output, float const *a);

/**
 * Creates a new identity mat2d
 * Returns a new 2x3 matrix
 */
float const *Mat2d_Create(void);

/**
 * Calculates the determinant of a mat2d
 * Returns determinant of a
 * @param a the source matrix
 */
float Mat2d_Determinant(float const *a);

/**
 * Set a mat2d to the identity matrix
 * Returns output
 * @param output the receiving matrix
 */
float const *Mat2d_Identity_(float *output);

/**
 * Inverts a mat2d
 * Returns output
 * @param output the receiving matrix
 * @param a the source matrix
 */
float const *Mat2d_Invert(float *output, float const *a);

/**
 * Alias for {@link mat2d.multiply} @function
 */
float const *Mat2d_Mul(float *output, float const *a, float const *b);

/**
 * Multiplies two mat2d's
 * Returns output
 * @param output the receiving matrix
 * @param a the first operand
 * @param b the second operand
 */
float const *Mat2d_Multiply(float *output, float const *a, float const *b);

/**
 * Rotates a mat2d by the given angle
 * Returns output
 * @param output the receiving matrix
 * @param a the matrix to rotate
 * @param rad the angle to rotate the matrix by
 */
float const *Mat2d_Rotate(float *output, float const *a, float rad);

/**
 * Scales the mat2d by the dimensions in the given vec2
 * Returns output
 * @param output the receiving matrix
 * @param a the matrix to translate
 * @param v the vec2 to scale the matrix by
 */
float const *Mat2d_Scale(float *output, float const *a, float const *v);

/**
 * Translates the mat2d by the dimensions in the given vec2
 * Returns output
 * @param output the receiving matrix
 * @param a the matrix to translate
 * @param v the vec2 to translate the matrix by
 */
float const *Mat2d_Translate(float *output, float const *a, float const *v);

/**
 * **
 */
float const *Mat3_Adjoint(float *output, float const *a);

/**
 * **
 */
float const *Mat3_CloneIt(float const *a);

/**
 * **
 */
float const *Mat3_Copy(float *output, float const *a);

/**
 * **
 */
float *Mat3_Create(void);

/**
 * **
 */
float Mat3_Determinant(float const *a);

/**
 * **
 */
float const *Mat3_FromMat2d(float *output, float const *a);

/**
 * **
 */
float const *Mat3_FromMat4(float *output, float const *a);

/**
 * **
 */
float const *Mat3_FromQuat(float *output, float const *q);

/**
 * **
 */
float const *Mat3_Identity_(float *output);

/**
 * **
 */
float const *Mat3_Invert(float *output, float const *a);

/**
 * **
 */
float const *Mat3_Mul(float *output, float const *a, float const *b);

/**
 * **
 */
float const *Mat3_Multiply(float *output, float const *a, float const *b);

/**
 * **
 */
float const *Mat3_NormalFromMat4(float *output, float const *a);

/**
 * **
 */
float const *Mat3_Rotate(float *output, float const *a, float rad);

/**
 * **
 */
float const *Mat3_Scale(float *output, float const *a, float const *v);

/**
 * **
 */
float const *Mat3_Translate(float *output, float const *a, float const *v);

/**
 * **
 */
float const *Mat3_Transpose(float *output, float const *a);

/**
 * Calculates the adjugate of a mat4
 * @returns {mat4} out
 * @param output @param {mat4} out the receiving matrix
 * @param a @param {mat4} a the source matrix
 */
float const *Mat4_Adjoint(float *output, float const *a);

/**
 * Creates a new mat4 initialized with values from an existing matrix
 * Returns {mat4} a new 4x4 matrix
 * @param a {mat4} a matrix to clone
 */
float const *Mat4_CloneIt(float const *a);

/**
 * Copy the values from one mat4 to another
 * Returns {mat4} out
 * @param output {mat4} out the receiving matrix
 * @param a {mat4} a the source matrix
 */
float const *Mat4_Copy(float *output, float const *a);

/**
 * Creates a new identity mat4
 * Returns {mat4} a new 4x4 matrix
 */
float *Mat4_Create(void);

/**
 * Calculates the determinant of a mat4
 * @returns {Number} determinant of a
 * @param a @param {mat4} a the source matrix
 */
float Mat4_Determinant(float const *a);

/**
 * Calculates a 4x4 matrix from the given quaternion
 * @returns {mat4} out
 * @param output {mat4} out mat4 receiving operation result
 * @param q {quat} q Quaternion to create matrix from
 */
float const *Mat4_FromQuat(float *output, float const *q);

/**
 * Creates a matrix from a quaternion rotation and vector translation
 * This is equivalent to (but much faster than):
 * mat4.identity(dest);
 * mat4.translate(dest, vec);
 * var quatMat = mat4.create();
 * quat4.toMat4(quat, quatMat);
 * mat4.multiply(dest, quatMat);
 * @returns {mat4} out
 * @param output {mat4} out mat4 receiving operation result
 * @param q {quat4} q Rotation quaternion
 * @param v {vec3} v Translation vector
 */
float const *Mat4_FromRotationTranslation(float *output, float const *q, float const *v);

/**
 * Generates a frustum matrix with the given bounds
 * @returns {mat4} out
 * @param output {mat4} out mat4 frustum matrix will be written into
 * @param left {Number} left Left bound of the frustum
 * @param right {Number} right Right bound of the frustum
 * @param bottom {Number} bottom Bottom bound of the frustum
 * @param top {Number} top Top bound of the frustum
 * @param near {Number} near Near bound of the frustum
 * @param far {Number} far Far bound of the frustum
 */
float const *Mat4_Frustum(float *output, float left, float right, float bottom, float top, float near, float far);

/**
 * Set a mat4 to the identity matrix
 * Returns {mat4} out
 * @param output {mat4} out the receiving matrix
 */
float const *Mat4_Identity_(float *output);

/**
 * Inverts a mat4
 * @returns {mat4} out
 * @param output {mat4} out the receiving matrix
 * @param a {mat4} a the source matrix
 */
float const *Mat4_Invert(float *output, float const *a);

/**
 * Generates a look-at matrix with the given eye position, focal point, and up axis
 * @returns {mat4} out
 * @param output {mat4} out mat4 frustum matrix will be written into
 * @param eye {vec3} eye Position of the viewer
 * @param center {vec3} center Point the viewer is looking at
 * @param up {vec3} up vec3 pointing up
 */
float const *Mat4_LookAt(float *output, float const *eye, float const *center, float const *up);

/**
 * Alias for {@link mat4.multiply}
 */
float const *Mat4_Mul(float *output, float const *a, float const *b);

/**
 * Multiplies two mat4's
 * @returns {mat4} out
 * @param output @param {mat4} out the receiving matrix
 * @param a @param {mat4} a the first operand
 * @param b @param {mat4} b the second operand
 */
float const *Mat4_Multiply(float *output, float const *a, float const *b);

/**
 * Generates a orthogonal projection matrix with the given bounds
 * @returns {mat4} out
 * @param output {mat4} out mat4 frustum matrix will be written into
 * @param left {number} left Left bound of the frustum
 * @param right {number} right Right bound of the frustum
 * @param bottom {number} bottom Bottom bound of the frustum
 * @param top {number} top Top bound of the frustum
 * @param near {number} near Near bound of the frustum
 * @param far {number} far Far bound of the frustum
 */
float const *Mat4_Ortho(float *output, float left, float right, float bottom, float top, float near, float far);

/**
 * Generates a perspective projection matrix with the given bounds
 * @returns {mat4} out
 * @param output {mat4} out mat4 frustum matrix will be written into
 * @param fovy {number} fovy Vertical field of view in radians
 * @param aspect {number} aspect Aspect ratio. typically viewport width/height
 * @param near {number} near Near bound of the frustum
 * @param far {number} far Far bound of the frustum
 */
float const *Mat4_Perspective(float *output, float fovy, float aspect, float near, float far);

/**
 * Rotates a mat4 by the given angle
 * @returns {mat4} out
 * @param output {mat4} out the receiving matrix
 * @param a {mat4} a the matrix to rotate
 * @param rad {Number} rad the angle to rotate the matrix by
 * @param axis {vec3} axis the axis to rotate around
 */
float const *Mat4_Rotate(float *output, float const *a, float rad, float const *axis);

/**
 * Rotates a matrix by the given angle around the X axis
 * @returns {mat4} out
 * @param output {mat4} out the receiving matrix
 * @param a {mat4} a the matrix to rotate
 * @param rad {Number} rad the angle to rotate the matrix by
 */
float const *Mat4_RotateX(float *output, float const *a, float rad);

/**
 * Rotates a matrix by the given angle around the Y axis
 * @returns {mat4} out
 * @param output {mat4} out the receiving matrix
 * @param a {mat4} a the matrix to rotate
 * @param rad {Number} rad the angle to rotate the matrix by
 */
float const *Mat4_RotateY(float *output, float const *a, float rad);

/**
 * Rotates a matrix by the given angle around the Z axis
 * @returns {mat4} out
 * @param output {mat4} out the receiving matrix
 * @param a {mat4} a the matrix to rotate
 * @param rad {Number} rad the angle to rotate the matrix by
 */
float const *Mat4_RotateZ(float *output, float const *a, float rad);

/**
 * Scales the mat4 by the dimensions in the given vec3
 * @returns {mat4} out
 * @param output {mat4} out the receiving matrix
 * @param a {mat4} a the matrix to scale
 * @param v {vec3} v the vec3 to scale the matrix by
 */
float const *Mat4_Scale(float *output, float const *a, float const *v);

/**
 * Translate a mat4 by the given vector
 * @returns {mat4} out
 * @param output {mat4} out the receiving matrix
 * @param a {mat4} a the matrix to translate
 * @param v {vec3} v vector to translate by
 */
float const *Mat4_Translate(float *output, float const *a, float const *v);

/**
 * Transpose the values of a mat4
 * @returns {mat4} out
 * @param output @param {mat4} out the receiving matrix
 * @param a @param {mat4} a the source matrix
 */
float const *Mat4_Transpose(float *output, float const *a);

float MathCi_AbsFloat(float b);

float MathCi_ClampFloat(float value, float min, float max);

int MathCi_ClampInt(int value, int min, int max);

float MathCi_MaxFloat(float a, float b);

int MathCi_MaxInt(int a, int b);

float MathCi_MinFloat(float a, float b);

int MathCi_MinInt(int a, int b);

int MathCi_Sign(float q);

MenuState *MenuState_New(void);
void MenuState_Delete(MenuState *self);

MenuWidget *MenuWidget_New(void);
void MenuWidget_Delete(MenuWidget *self);

void MenuWidget_GetFocus(MenuWidget *self);

void MenuWidget_LoseFocus(MenuWidget *self);

MeshBatcher *MeshBatcher_New(void);
void MeshBatcher_Delete(MeshBatcher *self);

int MeshBatcher_Add(MeshBatcher *self, ModelData const *modelData, cibool transparent, int texture, float centerX, float centerY, float centerZ, float radius);

void MeshBatcher_Clear(MeshBatcher *self);

void MeshBatcher_Draw(MeshBatcher *self, float playerPositionX, float playerPositionY, float playerPositionZ);

void MeshBatcher_Remove(MeshBatcher *self, int id);

int MeshBatcher_TotalTriangleCount(MeshBatcher const *self);

#define MeshBatcher_TEXTURES_COUNT  10

Minecart *Minecart_New(void);
void Minecart_Delete(Minecart *self);

cibool MiscCi_ReadBool(const char *str);

unsigned char const *MiscCi_UshortArrayToByteArray(int const *input, int inputLength);

float MiscCi_Vec3Length(float x, float y, float z);

ModAudio *ModAudio_New(void);
void ModAudio_Delete(ModAudio *self);

void ModAudio_OnNewFrame(ModAudio *self, Game const *game, NewFrameEventArgs const *args);

ModAutoCamera *ModAutoCamera_New(void);
void ModAutoCamera_Delete(ModAutoCamera *self);

cibool ModAutoCamera_OnClientCommand(ModAutoCamera *self, Game const *game, ClientCommandArgs const *args);

void ModAutoCamera_OnNewFrame(ModAutoCamera *self, Game const *game, NewFrameEventArgs const *args);

void ModAutoCamera_Start(ModAutoCamera *self, ClientModManager const *modmanager);

float ModAutoCamera_q(float t, float p0, float p1, float p2, float p3);

ModBlockDamageToPlayer *ModBlockDamageToPlayer_New(void);
void ModBlockDamageToPlayer_Delete(ModBlockDamageToPlayer *self);

#define ModBlockDamageToPlayer_BLOCK_DAMAGE_TO_PLAYER_EVERY  1

void ModBlockDamageToPlayer_OnNewFrameFixed(ModBlockDamageToPlayer const *self, Game *game, NewFrameEventArgs const *args);

ModBullet *ModBullet_New(void);
void ModBullet_Delete(ModBullet *self);

void ModBullet_OnNewFrameDraw3d(ModBullet const *self, Game const *game, float dt);

ModCamera *ModCamera_New(void);
void ModCamera_Delete(ModCamera *self);

void ModCamera_OnBeforeNewFrameDraw3d(ModCamera const *self, Game *game, float deltaTime);

ModCameraKeys *ModCameraKeys_New(void);
void ModCameraKeys_Delete(ModCameraKeys *self);

void ModCameraKeys_OnNewFrameFixed(ModCameraKeys const *self, Game *game, NewFrameEventArgs const *args);

ModClearInactivePlayersDrawInfo *ModClearInactivePlayersDrawInfo_New(void);
void ModClearInactivePlayersDrawInfo_Delete(ModClearInactivePlayersDrawInfo *self);

void ModClearInactivePlayersDrawInfo_OnNewFrameFixed(ModClearInactivePlayersDrawInfo const *self, Game const *game, NewFrameEventArgs const *args);

ModCompass *ModCompass_New(void);
void ModCompass_Delete(ModCompass *self);

void ModCompass_DrawCompass(ModCompass *self, Game *game);

void ModCompass_OnNewFrameDraw2d(ModCompass *self, Game *game, float dt);

ModDebugChunk *ModDebugChunk_New(void);
void ModDebugChunk_Delete(ModDebugChunk *self);

cibool ModDebugChunk_OnClientCommand(ModDebugChunk *self, Game const *game, ClientCommandArgs const *args);

void ModDebugChunk_OnNewFrameDraw3d(ModDebugChunk const *self, Game const *game, float deltaTime);

ModDialog *ModDialog_New(void);
void ModDialog_Delete(ModDialog *self);

void ModDialog_OnKeyDown(ModDialog const *self, Game *game, KeyEventArgs *args);

void ModDialog_OnKeyPress(ModDialog const *self, Game const *game, KeyPressEventArgs const *args);

void ModDialog_OnKeyUp(ModDialog const *self, Game const *game, KeyEventArgs const *args);

void ModDialog_OnMouseDown(ModDialog const *self, Game const *game, MouseEventArgs const *args);

void ModDialog_OnMouseUp(ModDialog const *self, Game const *game, MouseEventArgs const *args);

void ModDialog_OnNewFrameDraw2d(ModDialog const *self, Game const *game, float deltaTime);

ModDraw2dMisc *ModDraw2dMisc_New(void);
void ModDraw2dMisc_Delete(ModDraw2dMisc *self);

void ModDraw2dMisc_DrawBlockInfo(ModDraw2dMisc const *self, Game *game);

void ModDraw2dMisc_OnNewFrameDraw2d(ModDraw2dMisc const *self, Game *game, float deltaTime);

ModDrawArea *ModDrawArea_New(void);
void ModDrawArea_Delete(ModDrawArea *self);

void ModDrawArea_OnHitEntity(ModDrawArea const *self, Game const *game, OnUseEntityArgs const *e);

void ModDrawArea_OnNewFrameDraw3d(ModDrawArea const *self, Game const *game, float deltaTime);

void ModDrawArea_OnNewFrameFixed(ModDrawArea *self, Game const *game, NewFrameEventArgs const *args);

ModDrawHand2d *ModDrawHand2d_New(void);
void ModDrawHand2d_Delete(ModDrawHand2d *self);

const char *ModDrawHand2d_HandImage2d(Game const *game);

void ModDrawHand2d_OnNewFrameDraw3d(ModDrawHand2d *self, Game *game, float deltaTime);

cibool ModDrawHand2d_ShouldDrawHand(Game const *game);

ModDrawHand3d *ModDrawHand3d_New(void);
void ModDrawHand3d_Delete(ModDrawHand3d *self);

void ModDrawHand3d_AddVertex(ModDrawHand3d const *self, ModelData *model, float x, float y, float z, float u, float v, int color);

void ModDrawHand3d_DrawWeapon(ModDrawHand3d *self, float dt);

int ModDrawHand3d_GetWeaponTextureId(ModDrawHand3d const *self, int side);

cibool ModDrawHand3d_IsCompass(ModDrawHand3d const *self);

cibool ModDrawHand3d_IsEmptyHand(ModDrawHand3d const *self);

cibool ModDrawHand3d_IsTorch(ModDrawHand3d const *self);

float ModDrawHand3d_Light(ModDrawHand3d const *self);

void ModDrawHand3d_OnNewFrameDraw3d(ModDrawHand3d *self, Game *game_, float deltaTime);

void ModDrawHand3d_SetAttack(ModDrawHand3d *self, cibool isattack, cibool build);

int ModDrawHand3d_terrainTexture(ModDrawHand3d const *self);

int ModDrawHand3d_texturesPacked(ModDrawHand3d const *self);

ModDrawLinesAroundSelectedBlock *ModDrawLinesAroundSelectedBlock_New(void);
void ModDrawLinesAroundSelectedBlock_Delete(ModDrawLinesAroundSelectedBlock *self);

void ModDrawLinesAroundSelectedBlock_OnNewFrameDraw3d(ModDrawLinesAroundSelectedBlock const *self, Game const *game, float deltaTime);

ModDrawMain *ModDrawMain_New(void);
void ModDrawMain_Delete(ModDrawMain *self);

void ModDrawMain_OnReadOnlyMainThread(ModDrawMain const *self, Game *game, float dt);

ModDrawMinecarts *ModDrawMinecarts_New(void);
void ModDrawMinecarts_Delete(ModDrawMinecarts *self);

void ModDrawMinecarts_Draw(ModDrawMinecarts *self, Game const *game, float positionX, float positionY, float positionZ, VehicleDirection12 dir, VehicleDirection12 lastdir, float progress);

void ModDrawMinecarts_OnNewFrameDraw3d(ModDrawMinecarts *self, Game const *game, float deltaTime);

ModDrawParticleEffectBlockBreak *ModDrawParticleEffectBlockBreak_New(void);
void ModDrawParticleEffectBlockBreak_Delete(ModDrawParticleEffectBlockBreak *self);

void ModDrawParticleEffectBlockBreak_OnNewFrameDraw3d(ModDrawParticleEffectBlockBreak const *self, Game const *game, float deltaTime);

void ModDrawParticleEffectBlockBreak_StartParticleEffect(ModDrawParticleEffectBlockBreak const *self, float x, float y, float z);

ModDrawPlayerNames *ModDrawPlayerNames_New(void);
void ModDrawPlayerNames_Delete(ModDrawPlayerNames *self);

void ModDrawPlayerNames_OnNewFrameDraw3d(ModDrawPlayerNames const *self, Game *game, float deltaTime);

ModDrawPlayers *ModDrawPlayers_New(void);
void ModDrawPlayers_Delete(ModDrawPlayers *self);

void ModDrawPlayers_OnNewFrameDraw3d(ModDrawPlayers const *self, Game *game, float deltaTime);

ModDrawSprites *ModDrawSprites_New(void);
void ModDrawSprites_Delete(ModDrawSprites *self);

void ModDrawSprites_Billboard(Game const *game);

void ModDrawSprites_OnNewFrameDraw3d(ModDrawSprites const *self, Game *game, float deltaTime);

ModDrawTerrain *ModDrawTerrain_New(void);
void ModDrawTerrain_Delete(ModDrawTerrain *self);

Vector3IntRef const *const *ModDrawTerrain_BlocksAround7(Vector3IntRef const *pos);

int ModDrawTerrain_ChunkUpdates(ModDrawTerrain const *self);

void ModDrawTerrain_Dispose(ModDrawTerrain const *self, Game const *game_);

void ModDrawTerrain_DrawTerrain(ModDrawTerrain const *self);

cibool ModDrawTerrain_IsTransparentForLight(ModDrawTerrain const *self, int block);

void ModDrawTerrain_MainThreadCommit(ModDrawTerrain *self);

void ModDrawTerrain_OnNewFrameDraw3d(ModDrawTerrain *self, Game *game_, float deltaTime);

void ModDrawTerrain_OnReadOnlyBackgroundThread(ModDrawTerrain *self, Game *game_, float dt);

void ModDrawTerrain_RedrawAllBlocks(ModDrawTerrain *self);

void ModDrawTerrain_StartTerrain(ModDrawTerrain *self);

int ModDrawTerrain_TrianglesCount(ModDrawTerrain const *self);

void ModDrawTerrain_UpdateTerrain(ModDrawTerrain *self);

int ModDrawTerrain_maxlight(ModDrawTerrain const *self);

ModDrawTestModel *ModDrawTestModel_New(void);
void ModDrawTestModel_Delete(ModDrawTestModel *self);

cibool ModDrawTestModel_OnClientCommand(ModDrawTestModel const *self, Game *game, ClientCommandArgs const *args);

void ModDrawTestModel_OnNewFrameDraw3d(ModDrawTestModel *self, Game const *game, float deltaTime);

ModDrawText *ModDrawText_New(void);
void ModDrawText_Delete(ModDrawText *self);

void ModDrawText_OnNewFrameDraw3d(ModDrawText const *self, Game *game, float deltaTime);

ModExpire *ModExpire_New(void);
void ModExpire_Delete(ModExpire *self);

void ModExpire_OnNewFrameFixed(ModExpire const *self, Game *game, NewFrameEventArgs const *args);

ModFallDamageToPlayer *ModFallDamageToPlayer_New(void);
void ModFallDamageToPlayer_Delete(ModFallDamageToPlayer *self);

void ModFallDamageToPlayer_OnNewFrameFixed(ModFallDamageToPlayer *self, Game const *game, NewFrameEventArgs const *args);

ModFpsHistoryGraph *ModFpsHistoryGraph_New(void);
void ModFpsHistoryGraph_Delete(ModFpsHistoryGraph *self);

cibool ModFpsHistoryGraph_OnClientCommand(ModFpsHistoryGraph *self, Game const *game, ClientCommandArgs const *args);

void ModFpsHistoryGraph_OnKeyDown(ModFpsHistoryGraph *self, Game const *game, KeyEventArgs const *args);

void ModFpsHistoryGraph_OnNewFrame(ModFpsHistoryGraph *self, Game const *game, NewFrameEventArgs const *args);

void ModFpsHistoryGraph_Start(ModFpsHistoryGraph *self, ClientModManager const *modmanager);

ModGrenade *ModGrenade_New(void);
void ModGrenade_Delete(ModGrenade *self);

void ModGrenade_OnNewFrameFixed(ModGrenade const *self, Game const *game, NewFrameEventArgs const *args);

ModGuiChat *ModGuiChat_New(void);
void ModGuiChat_Delete(ModGuiChat *self);

const char *ModGuiChat_DoAutocomplete(ModGuiChat const *self, const char *text);

void ModGuiChat_DrawChatLines(ModGuiChat *self, cibool all);

void ModGuiChat_DrawTypingBuffer(ModGuiChat const *self);

void ModGuiChat_OnKeyDown(ModGuiChat *self, Game const *game_, KeyEventArgs *args);

void ModGuiChat_OnKeyPress(ModGuiChat const *self, Game const *game_, KeyPressEventArgs const *args);

void ModGuiChat_OnMouseDown(ModGuiChat const *self, Game const *game_, MouseEventArgs const *args);

void ModGuiChat_OnNewFrameDraw2d(ModGuiChat *self, Game *game_, float deltaTime);

ModGuiCrafting *ModGuiCrafting_New(void);
void ModGuiCrafting_Delete(ModGuiCrafting *self);

void ModGuiCrafting_OnKeyDown(ModGuiCrafting *self, Game *game, KeyEventArgs *args);

void ModGuiCrafting_OnNewFrameDraw2d(ModGuiCrafting *self, Game *game, float deltaTime);

void ModGuiCrafting_OnNewFrameFixed(ModGuiCrafting *self, Game *game, NewFrameEventArgs const *args);

ModGuiEscapeMenu *ModGuiEscapeMenu_New(void);
void ModGuiEscapeMenu_Delete(ModGuiEscapeMenu *self);

void ModGuiEscapeMenu_LoadOptions(ModGuiEscapeMenu *self);

void ModGuiEscapeMenu_OnKeyDown(ModGuiEscapeMenu *self, Game const *game_, KeyEventArgs *args);

void ModGuiEscapeMenu_OnNewFrameDraw2d(ModGuiEscapeMenu *self, Game *game_, float deltaTime);

void ModGuiEscapeMenu_RestoreResolution(ModGuiEscapeMenu *self);

void ModGuiEscapeMenu_SaveOptions(ModGuiEscapeMenu const *self);

void ModGuiEscapeMenu_UseResolution(ModGuiEscapeMenu const *self);

ModGuiInventory *ModGuiInventory_New(void);
void ModGuiInventory_Delete(ModGuiInventory *self);

int ModGuiInventory_ActiveMaterialCellSize(ModGuiInventory const *self);

int ModGuiInventory_CellsStartX(ModGuiInventory const *self);

int ModGuiInventory_CellsStartY(ModGuiInventory const *self);

void ModGuiInventory_DrawItemInfo(ModGuiInventory const *self, int screenposX, int screenposY, Packet_Item const *item);

void ModGuiInventory_DrawMaterialSelector(ModGuiInventory const *self);

int ModGuiInventory_InventoryStartX(ModGuiInventory const *self);

int ModGuiInventory_InventoryStartY(ModGuiInventory const *self);

cibool ModGuiInventory_IsMouseOverCells(ModGuiInventory const *self);

void ModGuiInventory_OnKeyPress(ModGuiInventory const *self, Game const *game_, KeyPressEventArgs const *args);

void ModGuiInventory_OnMouseDown(ModGuiInventory *self, Game const *game_, MouseEventArgs *args);

void ModGuiInventory_OnMouseUp(ModGuiInventory *self, Game const *game_, MouseEventArgs const *args);

void ModGuiInventory_OnMouseWheelChanged(ModGuiInventory *self, Game *game_, MouseWheelEventArgs const *args);

void ModGuiInventory_OnNewFrameDraw2d(ModGuiInventory *self, Game *game_, float deltaTime);

void ModGuiInventory_OnTouchStart(ModGuiInventory *self, Game const *game_, TouchEventArgs *e);

void ModGuiInventory_ScrollDown(ModGuiInventory *self);

void ModGuiInventory_ScrollUp(ModGuiInventory *self);

ModGuiMapLoading *ModGuiMapLoading_New(void);
void ModGuiMapLoading_Delete(ModGuiMapLoading *self);

void ModGuiMapLoading_OnNewFrameDraw2d(ModGuiMapLoading *self, Game *game, float deltaTime);

ModGuiPlayerStats *ModGuiPlayerStats_New(void);
void ModGuiPlayerStats_Delete(ModGuiPlayerStats *self);

void ModGuiPlayerStats_DrawPlayerHealth(ModGuiPlayerStats const *self, Game *game);

void ModGuiPlayerStats_DrawPlayerOxygen(ModGuiPlayerStats const *self, Game *game);

void ModGuiPlayerStats_OnNewFrameDraw2d(ModGuiPlayerStats *self, Game *game, float deltaTime);

ModGuiTextEditor *ModGuiTextEditor_New(void);
void ModGuiTextEditor_Delete(ModGuiTextEditor *self);

void ModGuiTextEditor_OnKeyDown(ModGuiTextEditor *self, Game const *game_, KeyEventArgs *e);

void ModGuiTextEditor_OnKeyPress(ModGuiTextEditor *self, Game const *game_, KeyPressEventArgs *e);

void ModGuiTextEditor_OnNewFrameDraw2d(ModGuiTextEditor const *self, Game *game, float deltaTime);

ModGuiTouchButtons *ModGuiTouchButtons_New(void);
void ModGuiTouchButtons_Delete(ModGuiTouchButtons *self);

void ModGuiTouchButtons_OnButton(ModGuiTouchButtons const *self, MenuWidget const *w);

void ModGuiTouchButtons_OnNewFrameDraw2d(ModGuiTouchButtons *self, Game *game_, float deltaTime);

void ModGuiTouchButtons_OnTouchEnd(ModGuiTouchButtons *self, Game const *game_, TouchEventArgs const *e);

void ModGuiTouchButtons_OnTouchMove(ModGuiTouchButtons *self, Game *game, TouchEventArgs const *e);

void ModGuiTouchButtons_OnTouchStart(ModGuiTouchButtons *self, Game const *game_, TouchEventArgs *e);

ModInterpolatePositions *ModInterpolatePositions_New(void);
void ModInterpolatePositions_Delete(ModInterpolatePositions *self);

void ModInterpolatePositions_OnNewFrame(ModInterpolatePositions const *self, Game const *game, NewFrameEventArgs const *args);

ModLoadPlayerTextures *ModLoadPlayerTextures_New(void);
void ModLoadPlayerTextures_Delete(ModLoadPlayerTextures *self);

void ModLoadPlayerTextures_OnNewFrame(ModLoadPlayerTextures *self, Game const *game, NewFrameEventArgs const *args);

ModManagerSimple1 *ModManagerSimple1_New(void);
void ModManagerSimple1_Delete(ModManagerSimple1 *self);

void ModManagerSimple1_AddToInventory(ModManagerSimple1 const *self, int player, const char *block, int amount);

BlockTypeSimple const *ModManagerSimple1_CreateBlockType(ModManagerSimple1 const *self, const char *name);

int ModManagerSimple1_GetBlockTypeId(ModManagerSimple1 const *self, const char *p);

void ModManagerSimple1_Start(ModManagerSimple1 *self, ServerSimple *serverSimple);

ModNetworkEntity *ModNetworkEntity_New(void);
void ModNetworkEntity_Delete(ModNetworkEntity *self);

void ModNetworkEntity_OnNewFrame(ModNetworkEntity const *self, Game const *game, NewFrameEventArgs const *args);

ModNetworkProcess *ModNetworkProcess_New(void);
void ModNetworkProcess_Delete(ModNetworkProcess *self);

void ModNetworkProcess_NetworkProcess(ModNetworkProcess *self);

void ModNetworkProcess_OnReadOnlyBackgroundThread(ModNetworkProcess *self, Game *game_, float dt);

void ModNetworkProcess_TryReadPacket(ModNetworkProcess *self, unsigned char *data, int dataLength);

ModPicking *ModPicking_New(void);
void ModPicking_Delete(ModPicking *self);

void ModPicking_GetPickingLine(ModPicking const *self, Game const *game, Line3D *retPick, cibool ispistolshoot);

void ModPicking_OnMouseDown(ModPicking *self, Game *game, MouseEventArgs const *args);

void ModPicking_OnMouseUp(ModPicking *self, Game *game, MouseEventArgs const *args);

void ModPicking_OnNewFrameReadOnlyMainThread(ModPicking *self, Game *game, float deltaTime);

ModPush *ModPush_New(void);
void ModPush_Delete(ModPush *self);

void ModPush_OnNewFrameFixed(ModPush const *self, Game *game, NewFrameEventArgs const *args);

ModRail *ModRail_New(void);
void ModRail_Delete(ModRail *self);

Vector3IntRef const *ModRail_NextTile(VehicleDirection12 direction, int currentTileX, int currentTileY, int currentTileZ);

Vector3IntRef const *ModRail_NextTile_(TileExitDirection direction, int currentTileX, int currentTileY, int currentTileZ);

void ModRail_OnNewFrameFixed(ModRail *self, Game *game, NewFrameEventArgs const *args);

ModReloadAmmo *ModReloadAmmo_New(void);
void ModReloadAmmo_Delete(ModReloadAmmo *self);

void ModReloadAmmo_OnKeyDown(ModReloadAmmo const *self, Game *game, KeyEventArgs const *args);

void ModReloadAmmo_OnNewFrameFixed(ModReloadAmmo const *self, Game *game, NewFrameEventArgs const *args);

ModScreenshot *ModScreenshot_New(void);
void ModScreenshot_Delete(ModScreenshot *self);

void ModScreenshot_OnKeyDown(ModScreenshot *self, Game const *game, KeyEventArgs *args);

void ModScreenshot_OnNewFrameDraw2d(ModScreenshot *self, Game *game, float deltaTime);

ModSendActiveMaterial *ModSendActiveMaterial_New(void);
void ModSendActiveMaterial_Delete(ModSendActiveMaterial *self);

void ModSendActiveMaterial_OnNewFrameFixed(ModSendActiveMaterial *self, Game const *game, NewFrameEventArgs const *args);

ModSendPosition *ModSendPosition_New(void);
void ModSendPosition_Delete(ModSendPosition *self);

void ModSendPosition_OnNewFrame(ModSendPosition const *self, Game *game, NewFrameEventArgs const *args);

ModServerSimple *ModServerSimple_New(void);
void ModServerSimple_Delete(ModServerSimple *self);

void ModServerSimple_OnReadOnlyBackgroundThread(ModServerSimple const *self, Game const *game, float dt);

void ModSimple_GenerateChunk(ModSimple const *self, int cx, int cy, int cz, int const *chunk);

int ModSimple_GetHeight(ModSimple const *self);

void ModSimple_OnPlayerJoin(ModSimple const *self, int playerId);

ModSimpleDefault *ModSimpleDefault_New(void);
void ModSimpleDefault_Delete(ModSimpleDefault *self);

void ModSimpleDefault_OnPlayerJoin(ModSimpleDefault const *self, int playerId);

void ModSimpleDefault_Start(ModSimpleDefault *self, ModManagerSimple const *manager);

ModSimpleWorldGenerator *ModSimpleWorldGenerator_New(void);
void ModSimpleWorldGenerator_Delete(ModSimpleWorldGenerator *self);

void ModSimpleWorldGenerator_GenerateChunk(ModSimpleWorldGenerator const *self, int cx, int cy, int cz, int *chunk);

int ModSimpleWorldGenerator_GetHeight(ModSimpleWorldGenerator const *self);

void ModSimpleWorldGenerator_Start(ModSimpleWorldGenerator *self, ModManagerSimple const *manager);

ModSkySphereAnimated *ModSkySphereAnimated_New(void);
void ModSkySphereAnimated_Delete(ModSkySphereAnimated *self);

void ModSkySphereAnimated_Draw(ModSkySphereAnimated *self, Game *game, float fov);

ModelData *ModSkySphereAnimated_GetSphereModelData2(ModSkySphereAnimated const *self, ModelData *data, GamePlatform const *platform, float radius, float height, int segments, int rings, int const *skyPixels_, int const *glowPixels_, float sunX, float sunY, float sunZ);

void ModSkySphereAnimated_OnNewFrameDraw3d(ModSkySphereAnimated *self, Game *game, float deltaTime);

ModSkySphereStatic *ModSkySphereStatic_New(void);
void ModSkySphereStatic_Delete(ModSkySphereStatic *self);

void ModSkySphereStatic_Draw(ModSkySphereStatic *self, Game *game, float fov);

void ModSkySphereStatic_OnNewFrameDraw3d(ModSkySphereStatic *self, Game *game, float deltaTime);

ModUnloadRendererChunks *ModUnloadRendererChunks_New(void);
void ModUnloadRendererChunks_Delete(ModUnloadRendererChunks *self);

void ModUnloadRendererChunks_OnReadOnlyBackgroundThread(ModUnloadRendererChunks *self, Game const *game_, float dt);

ModUpdateMain *ModUpdateMain_New(void);
void ModUpdateMain_Delete(ModUpdateMain *self);

void ModUpdateMain_OnReadOnlyMainThread(ModUpdateMain const *self, Game const *game, float dt);

ModWalkSound *ModWalkSound_New(void);
void ModWalkSound_Delete(ModWalkSound *self);

void ModWalkSound_OnNewFrameFixed(ModWalkSound *self, Game const *game, NewFrameEventArgs const *args);

ModelData *ModelData_New(void);
void ModelData_Delete(ModelData *self);

int ModelData_GetIndicesCount(ModelData const *self);

int ModelData_GetRgbaCount(ModelData const *self);

int ModelData_GetUvCount(ModelData const *self);

int ModelData_GetVerticesCount(ModelData const *self);

int ModelData_GetXyzCount(ModelData const *self);

void ModelData_SetIndicesCount(ModelData *self, int value);

void ModelData_SetVerticesCount(ModelData *self, int value);

int const *ModelData_getIndices(ModelData const *self);

int ModelData_getMode(ModelData const *self);

unsigned char const *ModelData_getRgba(ModelData const *self);

float const *ModelData_getUv(ModelData const *self);

float const *ModelData_getXyz(ModelData const *self);

void ModelData_setIndices(ModelData *self, int *p);

void ModelData_setMode(ModelData *self, int p);

void ModelData_setRgba(ModelData *self, unsigned char *p);

void ModelData_setUv(ModelData *self, float *p);

void ModelData_setXyz(ModelData *self, float *p);

void ModelDataTool_AddVertex(ModelData *model, float x, float y, float z, float u, float v, int color);

#define MouseButtonEnum_LEFT  0

#define MouseButtonEnum_MIDDLE  1

#define MouseButtonEnum_RIGHT  2

MouseEventArgs *MouseEventArgs_New(void);
void MouseEventArgs_Delete(MouseEventArgs *self);

int MouseEventArgs_GetButton(MouseEventArgs const *self);

cibool MouseEventArgs_GetEmulated(MouseEventArgs const *self);

cibool MouseEventArgs_GetForceUsage(MouseEventArgs const *self);

cibool MouseEventArgs_GetHandled(MouseEventArgs const *self);

int MouseEventArgs_GetMovementX(MouseEventArgs const *self);

int MouseEventArgs_GetMovementY(MouseEventArgs const *self);

int MouseEventArgs_GetX(MouseEventArgs const *self);

int MouseEventArgs_GetY(MouseEventArgs const *self);

void MouseEventArgs_SetButton(MouseEventArgs *self, int value);

void MouseEventArgs_SetEmulated(MouseEventArgs *self, cibool value);

void MouseEventArgs_SetForceUsage(MouseEventArgs *self, cibool value);

void MouseEventArgs_SetHandled(MouseEventArgs *self, cibool value);

void MouseEventArgs_SetMovementX(MouseEventArgs *self, int value);

void MouseEventArgs_SetMovementY(MouseEventArgs *self, int value);

void MouseEventArgs_SetX(MouseEventArgs *self, int value);

void MouseEventArgs_SetY(MouseEventArgs *self, int value);

MouseWheelEventArgs *MouseWheelEventArgs_New(void);
void MouseWheelEventArgs_Delete(MouseWheelEventArgs *self);

int MouseWheelEventArgs_GetDelta(MouseWheelEventArgs const *self);

float MouseWheelEventArgs_GetDeltaPrecise(MouseWheelEventArgs const *self);

void MouseWheelEventArgs_SetDelta(MouseWheelEventArgs *self, int value);

void MouseWheelEventArgs_SetDeltaPrecise(MouseWheelEventArgs *self, float value);

NetIncomingMessage *NetIncomingMessage_New(void);
void NetIncomingMessage_Delete(NetIncomingMessage *self);

NetworkInterpolation *NetworkInterpolation_New(void);
void NetworkInterpolation_Delete(NetworkInterpolation *self);

void NetworkInterpolation_AddNetworkPacket(NetworkInterpolation *self, InterpolatedObject const *c, int timeMilliseconds);

InterpolatedObject const *NetworkInterpolation_InterpolatedState(NetworkInterpolation const *self, int timeMilliseconds);

NewFrameEventArgs *NewFrameEventArgs_New(void);
void NewFrameEventArgs_Delete(NewFrameEventArgs *self);

float NewFrameEventArgs_GetDt(NewFrameEventArgs const *self);

void NewFrameEventArgs_SetDt(NewFrameEventArgs *self, float p);

Node *Node_New(void);
void Node_Delete(Node *self);

OnCrashHandler *OnCrashHandler_New(void);
void OnCrashHandler_Delete(OnCrashHandler *self);

void OnCrashHandler_OnCrash(OnCrashHandler const *self);

OnCrashHandlerLeave *OnCrashHandlerLeave_New(void);
void OnCrashHandlerLeave_Delete(OnCrashHandlerLeave *self);

OnCrashHandlerLeave const *OnCrashHandlerLeave_Create(Game const *game);

void OnCrashHandlerLeave_OnCrash(OnCrashHandlerLeave const *self);

OnUseEntityArgs *OnUseEntityArgs_New(void);
void OnUseEntityArgs_Delete(OnUseEntityArgs *self);

OptionsCi *OptionsCi_New(void);
void OptionsCi_Delete(OptionsCi *self);

PacketHandlerCraftingRecipes *PacketHandlerCraftingRecipes_New(void);
void PacketHandlerCraftingRecipes_Delete(PacketHandlerCraftingRecipes *self);

void PacketHandlerCraftingRecipes_Handle(PacketHandlerCraftingRecipes const *self, Game const *game, Packet_Server const *packet);

Packet_ *Packet__New(void);
void Packet__Delete(Packet_ *self);

#define Packet_BlockSetModeEnum_CREATE  1

#define Packet_BlockSetModeEnum_DESTROY  0

#define Packet_BlockSetModeEnum_USE  2

/**
 * &lt;summary&gt;open doors, use crafting table, etc.&lt;/summary&gt;
 */
#define Packet_BlockSetModeEnum_USE_WITH_TOOL  3

Packet_BlockType *Packet_BlockType_New(void);
void Packet_BlockType_Delete(Packet_BlockType *self);

int Packet_BlockType_GetAimRadiusFloat(Packet_BlockType const *self);

int Packet_BlockType_GetAmmoMagazine(Packet_BlockType const *self);

int Packet_BlockType_GetAmmoTotal(Packet_BlockType const *self);

int Packet_BlockType_GetBulletsPerShotFloat(Packet_BlockType const *self);

int Packet_BlockType_GetDamageBodyFloat(Packet_BlockType const *self);

int Packet_BlockType_GetDamageHeadFloat(Packet_BlockType const *self);

int Packet_BlockType_GetDamageToPlayer(Packet_BlockType const *self);

int Packet_BlockType_GetDelayFloat(Packet_BlockType const *self);

int Packet_BlockType_GetDrawType(Packet_BlockType const *self);

int Packet_BlockType_GetExplosionRangeFloat(Packet_BlockType const *self);

int Packet_BlockType_GetExplosionTimeFloat(Packet_BlockType const *self);

const char *Packet_BlockType_GetHandimage(Packet_BlockType const *self);

int Packet_BlockType_GetIronSightsAimRadiusFloat(Packet_BlockType const *self);

cibool Packet_BlockType_GetIronSightsEnabled(Packet_BlockType const *self);

int Packet_BlockType_GetIronSightsFovFloat(Packet_BlockType const *self);

const char *Packet_BlockType_GetIronSightsImage(Packet_BlockType const *self);

int Packet_BlockType_GetIronSightsMoveSpeedFloat(Packet_BlockType const *self);

cibool Packet_BlockType_GetIsBuildable(Packet_BlockType const *self);

cibool Packet_BlockType_GetIsPistol(Packet_BlockType const *self);

cibool Packet_BlockType_GetIsSlipperyWalk(Packet_BlockType const *self);

cibool Packet_BlockType_GetIsTool(Packet_BlockType const *self);

cibool Packet_BlockType_GetIsUsable(Packet_BlockType const *self);

int Packet_BlockType_GetLightRadius(Packet_BlockType const *self);

const char *Packet_BlockType_GetName(Packet_BlockType const *self);

int Packet_BlockType_GetPickDistanceWhenUsedFloat(Packet_BlockType const *self);

int Packet_BlockType_GetPistolType(Packet_BlockType const *self);

cibool Packet_BlockType_GetProjectileBounce(Packet_BlockType const *self);

int Packet_BlockType_GetProjectileSpeedFloat(Packet_BlockType const *self);

int Packet_BlockType_GetRail(Packet_BlockType const *self);

int Packet_BlockType_GetRecoilFloat(Packet_BlockType const *self);

int Packet_BlockType_GetReloadDelayFloat(Packet_BlockType const *self);

Packet_SoundSet const *Packet_BlockType_GetSounds(Packet_BlockType const *self);

int Packet_BlockType_GetStartInventoryAmount(Packet_BlockType const *self);

int Packet_BlockType_GetStrength(Packet_BlockType const *self);

const char *Packet_BlockType_GetTextureIdBack(Packet_BlockType const *self);

const char *Packet_BlockType_GetTextureIdBottom(Packet_BlockType const *self);

const char *Packet_BlockType_GetTextureIdForInventory(Packet_BlockType const *self);

const char *Packet_BlockType_GetTextureIdFront(Packet_BlockType const *self);

const char *Packet_BlockType_GetTextureIdLeft(Packet_BlockType const *self);

const char *Packet_BlockType_GetTextureIdRight(Packet_BlockType const *self);

const char *Packet_BlockType_GetTextureIdTop(Packet_BlockType const *self);

int Packet_BlockType_GetWalkSpeedFloat(Packet_BlockType const *self);

int Packet_BlockType_GetWalkSpeedWhenUsedFloat(Packet_BlockType const *self);

int Packet_BlockType_GetWalkableType(Packet_BlockType const *self);

int Packet_BlockType_GetWhenPlacedGetsConvertedTo(Packet_BlockType const *self);

void Packet_BlockType_SetAimRadiusFloat(Packet_BlockType *self, int value);

void Packet_BlockType_SetAmmoMagazine(Packet_BlockType *self, int value);

void Packet_BlockType_SetAmmoTotal(Packet_BlockType *self, int value);

void Packet_BlockType_SetBulletsPerShotFloat(Packet_BlockType *self, int value);

void Packet_BlockType_SetDamageBodyFloat(Packet_BlockType *self, int value);

void Packet_BlockType_SetDamageHeadFloat(Packet_BlockType *self, int value);

void Packet_BlockType_SetDamageToPlayer(Packet_BlockType *self, int value);

void Packet_BlockType_SetDelayFloat(Packet_BlockType *self, int value);

void Packet_BlockType_SetDrawType(Packet_BlockType *self, int value);

void Packet_BlockType_SetExplosionRangeFloat(Packet_BlockType *self, int value);

void Packet_BlockType_SetExplosionTimeFloat(Packet_BlockType *self, int value);

void Packet_BlockType_SetHandimage(Packet_BlockType *self, const char *value);

void Packet_BlockType_SetIronSightsAimRadiusFloat(Packet_BlockType *self, int value);

void Packet_BlockType_SetIronSightsEnabled(Packet_BlockType *self, cibool value);

void Packet_BlockType_SetIronSightsFovFloat(Packet_BlockType *self, int value);

void Packet_BlockType_SetIronSightsImage(Packet_BlockType *self, const char *value);

void Packet_BlockType_SetIronSightsMoveSpeedFloat(Packet_BlockType *self, int value);

void Packet_BlockType_SetIsBuildable(Packet_BlockType *self, cibool value);

void Packet_BlockType_SetIsPistol(Packet_BlockType *self, cibool value);

void Packet_BlockType_SetIsSlipperyWalk(Packet_BlockType *self, cibool value);

void Packet_BlockType_SetIsTool(Packet_BlockType *self, cibool value);

void Packet_BlockType_SetIsUsable(Packet_BlockType *self, cibool value);

void Packet_BlockType_SetLightRadius(Packet_BlockType *self, int value);

void Packet_BlockType_SetName(Packet_BlockType *self, const char *value);

void Packet_BlockType_SetPickDistanceWhenUsedFloat(Packet_BlockType *self, int value);

void Packet_BlockType_SetPistolType(Packet_BlockType *self, int value);

void Packet_BlockType_SetProjectileBounce(Packet_BlockType *self, cibool value);

void Packet_BlockType_SetProjectileSpeedFloat(Packet_BlockType *self, int value);

void Packet_BlockType_SetRail(Packet_BlockType *self, int value);

void Packet_BlockType_SetRecoilFloat(Packet_BlockType *self, int value);

void Packet_BlockType_SetReloadDelayFloat(Packet_BlockType *self, int value);

void Packet_BlockType_SetSounds(Packet_BlockType *self, Packet_SoundSet *value);

void Packet_BlockType_SetStartInventoryAmount(Packet_BlockType *self, int value);

void Packet_BlockType_SetStrength(Packet_BlockType *self, int value);

void Packet_BlockType_SetTextureIdBack(Packet_BlockType *self, const char *value);

void Packet_BlockType_SetTextureIdBottom(Packet_BlockType *self, const char *value);

void Packet_BlockType_SetTextureIdForInventory(Packet_BlockType *self, const char *value);

void Packet_BlockType_SetTextureIdFront(Packet_BlockType *self, const char *value);

void Packet_BlockType_SetTextureIdLeft(Packet_BlockType *self, const char *value);

void Packet_BlockType_SetTextureIdRight(Packet_BlockType *self, const char *value);

void Packet_BlockType_SetTextureIdTop(Packet_BlockType *self, const char *value);

void Packet_BlockType_SetWalkSpeedFloat(Packet_BlockType *self, int value);

void Packet_BlockType_SetWalkSpeedWhenUsedFloat(Packet_BlockType *self, int value);

void Packet_BlockType_SetWalkableType(Packet_BlockType *self, int value);

void Packet_BlockType_SetWhenPlacedGetsConvertedTo(Packet_BlockType *self, int value);

/**
 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_BlockType const *Packet_BlockTypeSerializer_Deserialize(CitoStream const *stream, Packet_BlockType *instance);

/**
 * &lt;summary&gt;Helper: put the buffer into a MemoryStream before deserializing&lt;/summary&gt;
 */
Packet_BlockType const *Packet_BlockTypeSerializer_DeserializeBuffer(unsigned char *buffer, int length, Packet_BlockType *instance);

/**
 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_BlockType const *Packet_BlockTypeSerializer_DeserializeLength(CitoStream const *stream, int length, Packet_BlockType *instance);

/**
 * &lt;summary&gt;Read the VarInt length prefix and the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_BlockType const *Packet_BlockTypeSerializer_DeserializeLengthDelimited(CitoStream const *stream, Packet_BlockType *instance);

/**
 * &lt;summary&gt;Helper: create a new instance to deserializing into&lt;/summary&gt;
 */
Packet_BlockType *Packet_BlockTypeSerializer_DeserializeLengthDelimitedNew(CitoStream const *stream);

/**
 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
 */
void Packet_BlockTypeSerializer_Serialize(CitoStream const *stream, Packet_BlockType const *instance);

/**
 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
 */
void Packet_BlockTypeSerializer_SerializeLengthDelimited(CitoStream const *stream, Packet_BlockType const *instance);

/**
 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
 */
unsigned char const *Packet_BlockTypeSerializer_SerializeToBytes(Packet_BlockType const *instance);

Packet_Client *Packet_Client_New(void);
void Packet_Client_Delete(Packet_Client *self);

Packet_ClientActiveMaterialSlot const *Packet_Client_GetActiveMaterialSlot(Packet_Client const *self);

Packet_ClientCraft const *Packet_Client_GetCraft(Packet_Client const *self);

Packet_ClientDeath const *Packet_Client_GetDeath(Packet_Client const *self);

Packet_ClientDialogClick const *Packet_Client_GetDialogClick_(Packet_Client const *self);

Packet_ClientEntityInteraction const *Packet_Client_GetEntityInteraction(Packet_Client const *self);

Packet_ClientFillArea const *Packet_Client_GetFillArea(Packet_Client const *self);

Packet_ClientGameResolution const *Packet_Client_GetGameResolution(Packet_Client const *self);

Packet_ClientHealth const *Packet_Client_GetHealth(Packet_Client const *self);

int Packet_Client_GetId(Packet_Client const *self);

Packet_ClientIdentification const *Packet_Client_GetIdentification(Packet_Client const *self);

Packet_ClientInventoryAction const *Packet_Client_GetInventoryAction(Packet_Client const *self);

Packet_ClientLeave const *Packet_Client_GetLeave(Packet_Client const *self);

Packet_ClientMessage const *Packet_Client_GetMessage(Packet_Client const *self);

Packet_ClientOxygen const *Packet_Client_GetOxygen(Packet_Client const *self);

Packet_ClientPingReply const *Packet_Client_GetPingReply(Packet_Client const *self);

Packet_ClientPositionAndOrientation const *Packet_Client_GetPositionAndOrientation(Packet_Client const *self);

Packet_ClientServerQuery const *Packet_Client_GetQuery(Packet_Client const *self);

Packet_ClientReload const *Packet_Client_GetReload(Packet_Client const *self);

Packet_ClientRequestBlob const *Packet_Client_GetRequestBlob(Packet_Client const *self);

Packet_ClientSetBlock const *Packet_Client_GetSetBlock(Packet_Client const *self);

Packet_ClientShot const *Packet_Client_GetShot(Packet_Client const *self);

Packet_ClientSpecialKey const *Packet_Client_GetSpecialKey_(Packet_Client const *self);

void Packet_Client_SetActiveMaterialSlot(Packet_Client *self, Packet_ClientActiveMaterialSlot *value);

void Packet_Client_SetCraft(Packet_Client *self, Packet_ClientCraft *value);

void Packet_Client_SetDeath(Packet_Client *self, Packet_ClientDeath *value);

void Packet_Client_SetDialogClick_(Packet_Client *self, Packet_ClientDialogClick *value);

void Packet_Client_SetEntityInteraction(Packet_Client *self, Packet_ClientEntityInteraction *value);

void Packet_Client_SetFillArea(Packet_Client *self, Packet_ClientFillArea *value);

void Packet_Client_SetGameResolution(Packet_Client *self, Packet_ClientGameResolution *value);

void Packet_Client_SetHealth(Packet_Client *self, Packet_ClientHealth *value);

void Packet_Client_SetId(Packet_Client *self, int value);

void Packet_Client_SetIdentification(Packet_Client *self, Packet_ClientIdentification *value);

void Packet_Client_SetInventoryAction(Packet_Client *self, Packet_ClientInventoryAction *value);

void Packet_Client_SetLeave(Packet_Client *self, Packet_ClientLeave *value);

void Packet_Client_SetMessage(Packet_Client *self, Packet_ClientMessage *value);

void Packet_Client_SetOxygen(Packet_Client *self, Packet_ClientOxygen *value);

void Packet_Client_SetPingReply(Packet_Client *self, Packet_ClientPingReply const *value);

void Packet_Client_SetPositionAndOrientation(Packet_Client *self, Packet_ClientPositionAndOrientation *value);

void Packet_Client_SetQuery(Packet_Client *self, Packet_ClientServerQuery const *value);

void Packet_Client_SetReload(Packet_Client *self, Packet_ClientReload const *value);

void Packet_Client_SetRequestBlob(Packet_Client *self, Packet_ClientRequestBlob *value);

void Packet_Client_SetSetBlock(Packet_Client *self, Packet_ClientSetBlock *value);

void Packet_Client_SetShot(Packet_Client *self, Packet_ClientShot *value);

void Packet_Client_SetSpecialKey_(Packet_Client *self, Packet_ClientSpecialKey *value);

Packet_ClientActiveMaterialSlot *Packet_ClientActiveMaterialSlot_New(void);
void Packet_ClientActiveMaterialSlot_Delete(Packet_ClientActiveMaterialSlot *self);

int Packet_ClientActiveMaterialSlot_GetActiveMaterialSlot(Packet_ClientActiveMaterialSlot const *self);

void Packet_ClientActiveMaterialSlot_SetActiveMaterialSlot(Packet_ClientActiveMaterialSlot *self, int value);

/**
 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ClientActiveMaterialSlot const *Packet_ClientActiveMaterialSlotSerializer_Deserialize(CitoStream const *stream, Packet_ClientActiveMaterialSlot *instance);

/**
 * &lt;summary&gt;Helper: put the buffer into a MemoryStream before deserializing&lt;/summary&gt;
 */
Packet_ClientActiveMaterialSlot const *Packet_ClientActiveMaterialSlotSerializer_DeserializeBuffer(unsigned char *buffer, int length, Packet_ClientActiveMaterialSlot *instance);

/**
 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ClientActiveMaterialSlot const *Packet_ClientActiveMaterialSlotSerializer_DeserializeLength(CitoStream const *stream, int length, Packet_ClientActiveMaterialSlot *instance);

/**
 * &lt;summary&gt;Read the VarInt length prefix and the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ClientActiveMaterialSlot const *Packet_ClientActiveMaterialSlotSerializer_DeserializeLengthDelimited(CitoStream const *stream, Packet_ClientActiveMaterialSlot *instance);

/**
 * &lt;summary&gt;Helper: create a new instance to deserializing into&lt;/summary&gt;
 */
Packet_ClientActiveMaterialSlot *Packet_ClientActiveMaterialSlotSerializer_DeserializeLengthDelimitedNew(CitoStream const *stream);

/**
 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
 */
void Packet_ClientActiveMaterialSlotSerializer_Serialize(CitoStream const *stream, Packet_ClientActiveMaterialSlot const *instance);

/**
 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
 */
void Packet_ClientActiveMaterialSlotSerializer_SerializeLengthDelimited(CitoStream const *stream, Packet_ClientActiveMaterialSlot const *instance);

/**
 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
 */
unsigned char const *Packet_ClientActiveMaterialSlotSerializer_SerializeToBytes(Packet_ClientActiveMaterialSlot const *instance);

Packet_ClientCraft *Packet_ClientCraft_New(void);
void Packet_ClientCraft_Delete(Packet_ClientCraft *self);

int Packet_ClientCraft_GetRecipeId(Packet_ClientCraft const *self);

int Packet_ClientCraft_GetX(Packet_ClientCraft const *self);

int Packet_ClientCraft_GetY(Packet_ClientCraft const *self);

int Packet_ClientCraft_GetZ(Packet_ClientCraft const *self);

void Packet_ClientCraft_SetRecipeId(Packet_ClientCraft *self, int value);

void Packet_ClientCraft_SetX(Packet_ClientCraft *self, int value);

void Packet_ClientCraft_SetY(Packet_ClientCraft *self, int value);

void Packet_ClientCraft_SetZ(Packet_ClientCraft *self, int value);

/**
 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ClientCraft const *Packet_ClientCraftSerializer_Deserialize(CitoStream const *stream, Packet_ClientCraft *instance);

/**
 * &lt;summary&gt;Helper: put the buffer into a MemoryStream before deserializing&lt;/summary&gt;
 */
Packet_ClientCraft const *Packet_ClientCraftSerializer_DeserializeBuffer(unsigned char *buffer, int length, Packet_ClientCraft *instance);

/**
 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ClientCraft const *Packet_ClientCraftSerializer_DeserializeLength(CitoStream const *stream, int length, Packet_ClientCraft *instance);

/**
 * &lt;summary&gt;Read the VarInt length prefix and the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ClientCraft const *Packet_ClientCraftSerializer_DeserializeLengthDelimited(CitoStream const *stream, Packet_ClientCraft *instance);

/**
 * &lt;summary&gt;Helper: create a new instance to deserializing into&lt;/summary&gt;
 */
Packet_ClientCraft *Packet_ClientCraftSerializer_DeserializeLengthDelimitedNew(CitoStream const *stream);

/**
 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
 */
void Packet_ClientCraftSerializer_Serialize(CitoStream const *stream, Packet_ClientCraft const *instance);

/**
 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
 */
void Packet_ClientCraftSerializer_SerializeLengthDelimited(CitoStream const *stream, Packet_ClientCraft const *instance);

/**
 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
 */
unsigned char const *Packet_ClientCraftSerializer_SerializeToBytes(Packet_ClientCraft const *instance);

Packet_ClientDeath *Packet_ClientDeath_New(void);
void Packet_ClientDeath_Delete(Packet_ClientDeath *self);

int Packet_ClientDeath_GetReason(Packet_ClientDeath const *self);

int Packet_ClientDeath_GetSourcePlayer(Packet_ClientDeath const *self);

void Packet_ClientDeath_SetReason(Packet_ClientDeath *self, int value);

void Packet_ClientDeath_SetSourcePlayer(Packet_ClientDeath *self, int value);

/**
 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ClientDeath const *Packet_ClientDeathSerializer_Deserialize(CitoStream const *stream, Packet_ClientDeath *instance);

/**
 * &lt;summary&gt;Helper: put the buffer into a MemoryStream before deserializing&lt;/summary&gt;
 */
Packet_ClientDeath const *Packet_ClientDeathSerializer_DeserializeBuffer(unsigned char *buffer, int length, Packet_ClientDeath *instance);

/**
 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ClientDeath const *Packet_ClientDeathSerializer_DeserializeLength(CitoStream const *stream, int length, Packet_ClientDeath *instance);

/**
 * &lt;summary&gt;Read the VarInt length prefix and the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ClientDeath const *Packet_ClientDeathSerializer_DeserializeLengthDelimited(CitoStream const *stream, Packet_ClientDeath *instance);

/**
 * &lt;summary&gt;Helper: create a new instance to deserializing into&lt;/summary&gt;
 */
Packet_ClientDeath *Packet_ClientDeathSerializer_DeserializeLengthDelimitedNew(CitoStream const *stream);

/**
 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
 */
void Packet_ClientDeathSerializer_Serialize(CitoStream const *stream, Packet_ClientDeath const *instance);

/**
 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
 */
void Packet_ClientDeathSerializer_SerializeLengthDelimited(CitoStream const *stream, Packet_ClientDeath const *instance);

/**
 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
 */
unsigned char const *Packet_ClientDeathSerializer_SerializeToBytes(Packet_ClientDeath const *instance);

Packet_ClientDialogClick *Packet_ClientDialogClick_New(void);
void Packet_ClientDialogClick_Delete(Packet_ClientDialogClick *self);

const char *const *Packet_ClientDialogClick_GetTextBoxValue(Packet_ClientDialogClick const *self);

int Packet_ClientDialogClick_GetTextBoxValueCount(Packet_ClientDialogClick const *self);

int Packet_ClientDialogClick_GetTextBoxValueLength(Packet_ClientDialogClick const *self);

const char *Packet_ClientDialogClick_GetWidgetId(Packet_ClientDialogClick const *self);

void Packet_ClientDialogClick_SetTextBoxValue(Packet_ClientDialogClick *self, const char **value, int count, int length);

void Packet_ClientDialogClick_SetWidgetId(Packet_ClientDialogClick *self, const char *value);

void Packet_ClientDialogClick_TextBoxValueAdd(Packet_ClientDialogClick *self, const char *value);

/**
 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ClientDialogClick const *Packet_ClientDialogClickSerializer_Deserialize(CitoStream const *stream, Packet_ClientDialogClick *instance);

/**
 * &lt;summary&gt;Helper: put the buffer into a MemoryStream before deserializing&lt;/summary&gt;
 */
Packet_ClientDialogClick const *Packet_ClientDialogClickSerializer_DeserializeBuffer(unsigned char *buffer, int length, Packet_ClientDialogClick *instance);

/**
 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ClientDialogClick const *Packet_ClientDialogClickSerializer_DeserializeLength(CitoStream const *stream, int length, Packet_ClientDialogClick *instance);

/**
 * &lt;summary&gt;Read the VarInt length prefix and the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ClientDialogClick const *Packet_ClientDialogClickSerializer_DeserializeLengthDelimited(CitoStream const *stream, Packet_ClientDialogClick *instance);

/**
 * &lt;summary&gt;Helper: create a new instance to deserializing into&lt;/summary&gt;
 */
Packet_ClientDialogClick *Packet_ClientDialogClickSerializer_DeserializeLengthDelimitedNew(CitoStream const *stream);

/**
 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
 */
void Packet_ClientDialogClickSerializer_Serialize(CitoStream const *stream, Packet_ClientDialogClick const *instance);

/**
 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
 */
void Packet_ClientDialogClickSerializer_SerializeLengthDelimited(CitoStream const *stream, Packet_ClientDialogClick const *instance);

/**
 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
 */
unsigned char const *Packet_ClientDialogClickSerializer_SerializeToBytes(Packet_ClientDialogClick const *instance);

Packet_ClientEntityInteraction *Packet_ClientEntityInteraction_New(void);
void Packet_ClientEntityInteraction_Delete(Packet_ClientEntityInteraction *self);

int Packet_ClientEntityInteraction_GetEntityId(Packet_ClientEntityInteraction const *self);

int Packet_ClientEntityInteraction_GetInteractionType(Packet_ClientEntityInteraction const *self);

void Packet_ClientEntityInteraction_SetEntityId(Packet_ClientEntityInteraction *self, int value);

void Packet_ClientEntityInteraction_SetInteractionType(Packet_ClientEntityInteraction *self, int value);

/**
 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ClientEntityInteraction const *Packet_ClientEntityInteractionSerializer_Deserialize(CitoStream const *stream, Packet_ClientEntityInteraction *instance);

/**
 * &lt;summary&gt;Helper: put the buffer into a MemoryStream before deserializing&lt;/summary&gt;
 */
Packet_ClientEntityInteraction const *Packet_ClientEntityInteractionSerializer_DeserializeBuffer(unsigned char *buffer, int length, Packet_ClientEntityInteraction *instance);

/**
 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ClientEntityInteraction const *Packet_ClientEntityInteractionSerializer_DeserializeLength(CitoStream const *stream, int length, Packet_ClientEntityInteraction *instance);

/**
 * &lt;summary&gt;Read the VarInt length prefix and the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ClientEntityInteraction const *Packet_ClientEntityInteractionSerializer_DeserializeLengthDelimited(CitoStream const *stream, Packet_ClientEntityInteraction *instance);

/**
 * &lt;summary&gt;Helper: create a new instance to deserializing into&lt;/summary&gt;
 */
Packet_ClientEntityInteraction *Packet_ClientEntityInteractionSerializer_DeserializeLengthDelimitedNew(CitoStream const *stream);

/**
 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
 */
void Packet_ClientEntityInteractionSerializer_Serialize(CitoStream const *stream, Packet_ClientEntityInteraction const *instance);

/**
 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
 */
void Packet_ClientEntityInteractionSerializer_SerializeLengthDelimited(CitoStream const *stream, Packet_ClientEntityInteraction const *instance);

/**
 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
 */
unsigned char const *Packet_ClientEntityInteractionSerializer_SerializeToBytes(Packet_ClientEntityInteraction const *instance);

Packet_ClientFillArea *Packet_ClientFillArea_New(void);
void Packet_ClientFillArea_Delete(Packet_ClientFillArea *self);

int Packet_ClientFillArea_GetBlockType(Packet_ClientFillArea const *self);

int Packet_ClientFillArea_GetMaterialSlot(Packet_ClientFillArea const *self);

int Packet_ClientFillArea_GetX1(Packet_ClientFillArea const *self);

int Packet_ClientFillArea_GetX2(Packet_ClientFillArea const *self);

int Packet_ClientFillArea_GetY1(Packet_ClientFillArea const *self);

int Packet_ClientFillArea_GetY2(Packet_ClientFillArea const *self);

int Packet_ClientFillArea_GetZ1(Packet_ClientFillArea const *self);

int Packet_ClientFillArea_GetZ2(Packet_ClientFillArea const *self);

void Packet_ClientFillArea_SetBlockType(Packet_ClientFillArea *self, int value);

void Packet_ClientFillArea_SetMaterialSlot(Packet_ClientFillArea *self, int value);

void Packet_ClientFillArea_SetX1(Packet_ClientFillArea *self, int value);

void Packet_ClientFillArea_SetX2(Packet_ClientFillArea *self, int value);

void Packet_ClientFillArea_SetY1(Packet_ClientFillArea *self, int value);

void Packet_ClientFillArea_SetY2(Packet_ClientFillArea *self, int value);

void Packet_ClientFillArea_SetZ1(Packet_ClientFillArea *self, int value);

void Packet_ClientFillArea_SetZ2(Packet_ClientFillArea *self, int value);

/**
 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ClientFillArea const *Packet_ClientFillAreaSerializer_Deserialize(CitoStream const *stream, Packet_ClientFillArea *instance);

/**
 * &lt;summary&gt;Helper: put the buffer into a MemoryStream before deserializing&lt;/summary&gt;
 */
Packet_ClientFillArea const *Packet_ClientFillAreaSerializer_DeserializeBuffer(unsigned char *buffer, int length, Packet_ClientFillArea *instance);

/**
 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ClientFillArea const *Packet_ClientFillAreaSerializer_DeserializeLength(CitoStream const *stream, int length, Packet_ClientFillArea *instance);

/**
 * &lt;summary&gt;Read the VarInt length prefix and the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ClientFillArea const *Packet_ClientFillAreaSerializer_DeserializeLengthDelimited(CitoStream const *stream, Packet_ClientFillArea *instance);

/**
 * &lt;summary&gt;Helper: create a new instance to deserializing into&lt;/summary&gt;
 */
Packet_ClientFillArea *Packet_ClientFillAreaSerializer_DeserializeLengthDelimitedNew(CitoStream const *stream);

/**
 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
 */
void Packet_ClientFillAreaSerializer_Serialize(CitoStream const *stream, Packet_ClientFillArea const *instance);

/**
 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
 */
void Packet_ClientFillAreaSerializer_SerializeLengthDelimited(CitoStream const *stream, Packet_ClientFillArea const *instance);

/**
 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
 */
unsigned char const *Packet_ClientFillAreaSerializer_SerializeToBytes(Packet_ClientFillArea const *instance);

Packet_ClientGameResolution *Packet_ClientGameResolution_New(void);
void Packet_ClientGameResolution_Delete(Packet_ClientGameResolution *self);

int Packet_ClientGameResolution_GetHeight(Packet_ClientGameResolution const *self);

int Packet_ClientGameResolution_GetWidth(Packet_ClientGameResolution const *self);

void Packet_ClientGameResolution_SetHeight(Packet_ClientGameResolution *self, int value);

void Packet_ClientGameResolution_SetWidth(Packet_ClientGameResolution *self, int value);

/**
 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ClientGameResolution const *Packet_ClientGameResolutionSerializer_Deserialize(CitoStream const *stream, Packet_ClientGameResolution *instance);

/**
 * &lt;summary&gt;Helper: put the buffer into a MemoryStream before deserializing&lt;/summary&gt;
 */
Packet_ClientGameResolution const *Packet_ClientGameResolutionSerializer_DeserializeBuffer(unsigned char *buffer, int length, Packet_ClientGameResolution *instance);

/**
 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ClientGameResolution const *Packet_ClientGameResolutionSerializer_DeserializeLength(CitoStream const *stream, int length, Packet_ClientGameResolution *instance);

/**
 * &lt;summary&gt;Read the VarInt length prefix and the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ClientGameResolution const *Packet_ClientGameResolutionSerializer_DeserializeLengthDelimited(CitoStream const *stream, Packet_ClientGameResolution *instance);

/**
 * &lt;summary&gt;Helper: create a new instance to deserializing into&lt;/summary&gt;
 */
Packet_ClientGameResolution *Packet_ClientGameResolutionSerializer_DeserializeLengthDelimitedNew(CitoStream const *stream);

/**
 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
 */
void Packet_ClientGameResolutionSerializer_Serialize(CitoStream const *stream, Packet_ClientGameResolution const *instance);

/**
 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
 */
void Packet_ClientGameResolutionSerializer_SerializeLengthDelimited(CitoStream const *stream, Packet_ClientGameResolution const *instance);

/**
 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
 */
unsigned char const *Packet_ClientGameResolutionSerializer_SerializeToBytes(Packet_ClientGameResolution const *instance);

Packet_ClientHealth *Packet_ClientHealth_New(void);
void Packet_ClientHealth_Delete(Packet_ClientHealth *self);

int Packet_ClientHealth_GetCurrentHealth(Packet_ClientHealth const *self);

void Packet_ClientHealth_SetCurrentHealth(Packet_ClientHealth *self, int value);

/**
 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ClientHealth const *Packet_ClientHealthSerializer_Deserialize(CitoStream const *stream, Packet_ClientHealth *instance);

/**
 * &lt;summary&gt;Helper: put the buffer into a MemoryStream before deserializing&lt;/summary&gt;
 */
Packet_ClientHealth const *Packet_ClientHealthSerializer_DeserializeBuffer(unsigned char *buffer, int length, Packet_ClientHealth *instance);

/**
 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ClientHealth const *Packet_ClientHealthSerializer_DeserializeLength(CitoStream const *stream, int length, Packet_ClientHealth *instance);

/**
 * &lt;summary&gt;Read the VarInt length prefix and the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ClientHealth const *Packet_ClientHealthSerializer_DeserializeLengthDelimited(CitoStream const *stream, Packet_ClientHealth *instance);

/**
 * &lt;summary&gt;Helper: create a new instance to deserializing into&lt;/summary&gt;
 */
Packet_ClientHealth *Packet_ClientHealthSerializer_DeserializeLengthDelimitedNew(CitoStream const *stream);

/**
 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
 */
void Packet_ClientHealthSerializer_Serialize(CitoStream const *stream, Packet_ClientHealth const *instance);

/**
 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
 */
void Packet_ClientHealthSerializer_SerializeLengthDelimited(CitoStream const *stream, Packet_ClientHealth const *instance);

/**
 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
 */
unsigned char const *Packet_ClientHealthSerializer_SerializeToBytes(Packet_ClientHealth const *instance);

#define Packet_ClientIdEnum_ACTIVE_MATERIAL_SLOT  56

#define Packet_ClientIdEnum_CRAFT  9

#define Packet_ClientIdEnum_DEATH  60

#define Packet_ClientIdEnum_DIALOG_CLICK  14

#define Packet_ClientIdEnum_ENTITY_INTERACTION  61

#define Packet_ClientIdEnum_EXTENDED_PACKET_COMMAND  100

#define Packet_ClientIdEnum_FILL_AREA  510

#define Packet_ClientIdEnum_GAME_RESOLUTION  10

#define Packet_ClientIdEnum_HEALTH  52

#define Packet_ClientIdEnum_INVENTORY_ACTION  51

#define Packet_ClientIdEnum_LEAVE  57

#define Packet_ClientIdEnum_MESSAGE  13

#define Packet_ClientIdEnum_MONSTER_HIT  53

#define Packet_ClientIdEnum_OXYGEN  59

#define Packet_ClientIdEnum_PING_REPLY  1

#define Packet_ClientIdEnum_PLAYER_IDENTIFICATION  0

#define Packet_ClientIdEnum_POSITIONAND_ORIENTATION  8

#define Packet_ClientIdEnum_RELOAD  58

#define Packet_ClientIdEnum_REQUEST_BLOB  50

#define Packet_ClientIdEnum_SERVER_QUERY  64

#define Packet_ClientIdEnum_SET_BLOCK  5

#define Packet_ClientIdEnum_SHOT  54

#define Packet_ClientIdEnum_SPECIAL_KEY  55

Packet_ClientIdentification *Packet_ClientIdentification_New(void);
void Packet_ClientIdentification_Delete(Packet_ClientIdentification *self);

const char *Packet_ClientIdentification_GetMdProtocolVersion(Packet_ClientIdentification const *self);

Packet_PositionAndOrientation const *Packet_ClientIdentification_GetRequestPosition(Packet_ClientIdentification const *self);

const char *Packet_ClientIdentification_GetServerPassword(Packet_ClientIdentification const *self);

const char *Packet_ClientIdentification_GetUsername(Packet_ClientIdentification const *self);

const char *Packet_ClientIdentification_GetVerificationKey(Packet_ClientIdentification const *self);

void Packet_ClientIdentification_SetMdProtocolVersion(Packet_ClientIdentification *self, const char *value);

void Packet_ClientIdentification_SetRequestPosition(Packet_ClientIdentification *self, Packet_PositionAndOrientation *value);

void Packet_ClientIdentification_SetServerPassword(Packet_ClientIdentification *self, const char *value);

void Packet_ClientIdentification_SetUsername(Packet_ClientIdentification *self, const char *value);

void Packet_ClientIdentification_SetVerificationKey(Packet_ClientIdentification *self, const char *value);

/**
 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ClientIdentification const *Packet_ClientIdentificationSerializer_Deserialize(CitoStream const *stream, Packet_ClientIdentification *instance);

/**
 * &lt;summary&gt;Helper: put the buffer into a MemoryStream before deserializing&lt;/summary&gt;
 */
Packet_ClientIdentification const *Packet_ClientIdentificationSerializer_DeserializeBuffer(unsigned char *buffer, int length, Packet_ClientIdentification *instance);

/**
 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ClientIdentification const *Packet_ClientIdentificationSerializer_DeserializeLength(CitoStream const *stream, int length, Packet_ClientIdentification *instance);

/**
 * &lt;summary&gt;Read the VarInt length prefix and the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ClientIdentification const *Packet_ClientIdentificationSerializer_DeserializeLengthDelimited(CitoStream const *stream, Packet_ClientIdentification *instance);

/**
 * &lt;summary&gt;Helper: create a new instance to deserializing into&lt;/summary&gt;
 */
Packet_ClientIdentification *Packet_ClientIdentificationSerializer_DeserializeLengthDelimitedNew(CitoStream const *stream);

/**
 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
 */
void Packet_ClientIdentificationSerializer_Serialize(CitoStream const *stream, Packet_ClientIdentification const *instance);

/**
 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
 */
void Packet_ClientIdentificationSerializer_SerializeLengthDelimited(CitoStream const *stream, Packet_ClientIdentification const *instance);

/**
 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
 */
unsigned char const *Packet_ClientIdentificationSerializer_SerializeToBytes(Packet_ClientIdentification const *instance);

Packet_ClientInventoryAction *Packet_ClientInventoryAction_New(void);
void Packet_ClientInventoryAction_Delete(Packet_ClientInventoryAction *self);

Packet_InventoryPosition const *Packet_ClientInventoryAction_GetA(Packet_ClientInventoryAction const *self);

int Packet_ClientInventoryAction_GetAction(Packet_ClientInventoryAction const *self);

Packet_InventoryPosition const *Packet_ClientInventoryAction_GetB(Packet_ClientInventoryAction const *self);

void Packet_ClientInventoryAction_SetA(Packet_ClientInventoryAction *self, Packet_InventoryPosition *value);

void Packet_ClientInventoryAction_SetAction(Packet_ClientInventoryAction *self, int value);

void Packet_ClientInventoryAction_SetB(Packet_ClientInventoryAction *self, Packet_InventoryPosition *value);

/**
 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ClientInventoryAction const *Packet_ClientInventoryActionSerializer_Deserialize(CitoStream const *stream, Packet_ClientInventoryAction *instance);

/**
 * &lt;summary&gt;Helper: put the buffer into a MemoryStream before deserializing&lt;/summary&gt;
 */
Packet_ClientInventoryAction const *Packet_ClientInventoryActionSerializer_DeserializeBuffer(unsigned char *buffer, int length, Packet_ClientInventoryAction *instance);

/**
 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ClientInventoryAction const *Packet_ClientInventoryActionSerializer_DeserializeLength(CitoStream const *stream, int length, Packet_ClientInventoryAction *instance);

/**
 * &lt;summary&gt;Read the VarInt length prefix and the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ClientInventoryAction const *Packet_ClientInventoryActionSerializer_DeserializeLengthDelimited(CitoStream const *stream, Packet_ClientInventoryAction *instance);

/**
 * &lt;summary&gt;Helper: create a new instance to deserializing into&lt;/summary&gt;
 */
Packet_ClientInventoryAction *Packet_ClientInventoryActionSerializer_DeserializeLengthDelimitedNew(CitoStream const *stream);

/**
 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
 */
void Packet_ClientInventoryActionSerializer_Serialize(CitoStream const *stream, Packet_ClientInventoryAction const *instance);

/**
 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
 */
void Packet_ClientInventoryActionSerializer_SerializeLengthDelimited(CitoStream const *stream, Packet_ClientInventoryAction const *instance);

/**
 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
 */
unsigned char const *Packet_ClientInventoryActionSerializer_SerializeToBytes(Packet_ClientInventoryAction const *instance);

Packet_ClientLeave *Packet_ClientLeave_New(void);
void Packet_ClientLeave_Delete(Packet_ClientLeave *self);

int Packet_ClientLeave_GetReason(Packet_ClientLeave const *self);

void Packet_ClientLeave_SetReason(Packet_ClientLeave *self, int value);

/**
 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ClientLeave const *Packet_ClientLeaveSerializer_Deserialize(CitoStream const *stream, Packet_ClientLeave *instance);

/**
 * &lt;summary&gt;Helper: put the buffer into a MemoryStream before deserializing&lt;/summary&gt;
 */
Packet_ClientLeave const *Packet_ClientLeaveSerializer_DeserializeBuffer(unsigned char *buffer, int length, Packet_ClientLeave *instance);

/**
 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ClientLeave const *Packet_ClientLeaveSerializer_DeserializeLength(CitoStream const *stream, int length, Packet_ClientLeave *instance);

/**
 * &lt;summary&gt;Read the VarInt length prefix and the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ClientLeave const *Packet_ClientLeaveSerializer_DeserializeLengthDelimited(CitoStream const *stream, Packet_ClientLeave *instance);

/**
 * &lt;summary&gt;Helper: create a new instance to deserializing into&lt;/summary&gt;
 */
Packet_ClientLeave *Packet_ClientLeaveSerializer_DeserializeLengthDelimitedNew(CitoStream const *stream);

/**
 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
 */
void Packet_ClientLeaveSerializer_Serialize(CitoStream const *stream, Packet_ClientLeave const *instance);

/**
 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
 */
void Packet_ClientLeaveSerializer_SerializeLengthDelimited(CitoStream const *stream, Packet_ClientLeave const *instance);

/**
 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
 */
unsigned char const *Packet_ClientLeaveSerializer_SerializeToBytes(Packet_ClientLeave const *instance);

Packet_ClientMessage *Packet_ClientMessage_New(void);
void Packet_ClientMessage_Delete(Packet_ClientMessage *self);

int Packet_ClientMessage_GetIsTeamchat(Packet_ClientMessage const *self);

const char *Packet_ClientMessage_GetMessage(Packet_ClientMessage const *self);

void Packet_ClientMessage_SetIsTeamchat(Packet_ClientMessage *self, int value);

void Packet_ClientMessage_SetMessage(Packet_ClientMessage *self, const char *value);

/**
 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ClientMessage const *Packet_ClientMessageSerializer_Deserialize(CitoStream const *stream, Packet_ClientMessage *instance);

/**
 * &lt;summary&gt;Helper: put the buffer into a MemoryStream before deserializing&lt;/summary&gt;
 */
Packet_ClientMessage const *Packet_ClientMessageSerializer_DeserializeBuffer(unsigned char *buffer, int length, Packet_ClientMessage *instance);

/**
 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ClientMessage const *Packet_ClientMessageSerializer_DeserializeLength(CitoStream const *stream, int length, Packet_ClientMessage *instance);

/**
 * &lt;summary&gt;Read the VarInt length prefix and the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ClientMessage const *Packet_ClientMessageSerializer_DeserializeLengthDelimited(CitoStream const *stream, Packet_ClientMessage *instance);

/**
 * &lt;summary&gt;Helper: create a new instance to deserializing into&lt;/summary&gt;
 */
Packet_ClientMessage *Packet_ClientMessageSerializer_DeserializeLengthDelimitedNew(CitoStream const *stream);

/**
 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
 */
void Packet_ClientMessageSerializer_Serialize(CitoStream const *stream, Packet_ClientMessage const *instance);

/**
 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
 */
void Packet_ClientMessageSerializer_SerializeLengthDelimited(CitoStream const *stream, Packet_ClientMessage const *instance);

/**
 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
 */
unsigned char const *Packet_ClientMessageSerializer_SerializeToBytes(Packet_ClientMessage const *instance);

Packet_ClientOxygen *Packet_ClientOxygen_New(void);
void Packet_ClientOxygen_Delete(Packet_ClientOxygen *self);

int Packet_ClientOxygen_GetCurrentOxygen(Packet_ClientOxygen const *self);

void Packet_ClientOxygen_SetCurrentOxygen(Packet_ClientOxygen *self, int value);

/**
 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ClientOxygen const *Packet_ClientOxygenSerializer_Deserialize(CitoStream const *stream, Packet_ClientOxygen *instance);

/**
 * &lt;summary&gt;Helper: put the buffer into a MemoryStream before deserializing&lt;/summary&gt;
 */
Packet_ClientOxygen const *Packet_ClientOxygenSerializer_DeserializeBuffer(unsigned char *buffer, int length, Packet_ClientOxygen *instance);

/**
 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ClientOxygen const *Packet_ClientOxygenSerializer_DeserializeLength(CitoStream const *stream, int length, Packet_ClientOxygen *instance);

/**
 * &lt;summary&gt;Read the VarInt length prefix and the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ClientOxygen const *Packet_ClientOxygenSerializer_DeserializeLengthDelimited(CitoStream const *stream, Packet_ClientOxygen *instance);

/**
 * &lt;summary&gt;Helper: create a new instance to deserializing into&lt;/summary&gt;
 */
Packet_ClientOxygen *Packet_ClientOxygenSerializer_DeserializeLengthDelimitedNew(CitoStream const *stream);

/**
 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
 */
void Packet_ClientOxygenSerializer_Serialize(CitoStream const *stream, Packet_ClientOxygen const *instance);

/**
 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
 */
void Packet_ClientOxygenSerializer_SerializeLengthDelimited(CitoStream const *stream, Packet_ClientOxygen const *instance);

/**
 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
 */
unsigned char const *Packet_ClientOxygenSerializer_SerializeToBytes(Packet_ClientOxygen const *instance);

/**
 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ClientPingReply const *Packet_ClientPingReplySerializer_Deserialize(CitoStream const *stream, Packet_ClientPingReply const *instance);

/**
 * &lt;summary&gt;Helper: put the buffer into a MemoryStream before deserializing&lt;/summary&gt;
 */
Packet_ClientPingReply const *Packet_ClientPingReplySerializer_DeserializeBuffer(unsigned char *buffer, int length, Packet_ClientPingReply const *instance);

/**
 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ClientPingReply const *Packet_ClientPingReplySerializer_DeserializeLength(CitoStream const *stream, int length, Packet_ClientPingReply const *instance);

/**
 * &lt;summary&gt;Read the VarInt length prefix and the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ClientPingReply const *Packet_ClientPingReplySerializer_DeserializeLengthDelimited(CitoStream const *stream, Packet_ClientPingReply const *instance);

/**
 * &lt;summary&gt;Helper: create a new instance to deserializing into&lt;/summary&gt;
 */
Packet_ClientPingReply const *Packet_ClientPingReplySerializer_DeserializeLengthDelimitedNew(CitoStream const *stream);

/**
 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
 */
void Packet_ClientPingReplySerializer_Serialize(CitoStream const *stream, Packet_ClientPingReply const *instance);

/**
 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
 */
void Packet_ClientPingReplySerializer_SerializeLengthDelimited(CitoStream const *stream, Packet_ClientPingReply const *instance);

/**
 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
 */
unsigned char const *Packet_ClientPingReplySerializer_SerializeToBytes(Packet_ClientPingReply const *instance);

Packet_ClientPositionAndOrientation *Packet_ClientPositionAndOrientation_New(void);
void Packet_ClientPositionAndOrientation_Delete(Packet_ClientPositionAndOrientation *self);

int Packet_ClientPositionAndOrientation_GetHeading(Packet_ClientPositionAndOrientation const *self);

int Packet_ClientPositionAndOrientation_GetPitch(Packet_ClientPositionAndOrientation const *self);

int Packet_ClientPositionAndOrientation_GetPlayerId(Packet_ClientPositionAndOrientation const *self);

int Packet_ClientPositionAndOrientation_GetStance(Packet_ClientPositionAndOrientation const *self);

int Packet_ClientPositionAndOrientation_GetX(Packet_ClientPositionAndOrientation const *self);

int Packet_ClientPositionAndOrientation_GetY(Packet_ClientPositionAndOrientation const *self);

int Packet_ClientPositionAndOrientation_GetZ(Packet_ClientPositionAndOrientation const *self);

void Packet_ClientPositionAndOrientation_SetHeading(Packet_ClientPositionAndOrientation *self, int value);

void Packet_ClientPositionAndOrientation_SetPitch(Packet_ClientPositionAndOrientation *self, int value);

void Packet_ClientPositionAndOrientation_SetPlayerId(Packet_ClientPositionAndOrientation *self, int value);

void Packet_ClientPositionAndOrientation_SetStance(Packet_ClientPositionAndOrientation *self, int value);

void Packet_ClientPositionAndOrientation_SetX(Packet_ClientPositionAndOrientation *self, int value);

void Packet_ClientPositionAndOrientation_SetY(Packet_ClientPositionAndOrientation *self, int value);

void Packet_ClientPositionAndOrientation_SetZ(Packet_ClientPositionAndOrientation *self, int value);

/**
 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ClientPositionAndOrientation const *Packet_ClientPositionAndOrientationSerializer_Deserialize(CitoStream const *stream, Packet_ClientPositionAndOrientation *instance);

/**
 * &lt;summary&gt;Helper: put the buffer into a MemoryStream before deserializing&lt;/summary&gt;
 */
Packet_ClientPositionAndOrientation const *Packet_ClientPositionAndOrientationSerializer_DeserializeBuffer(unsigned char *buffer, int length, Packet_ClientPositionAndOrientation *instance);

/**
 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ClientPositionAndOrientation const *Packet_ClientPositionAndOrientationSerializer_DeserializeLength(CitoStream const *stream, int length, Packet_ClientPositionAndOrientation *instance);

/**
 * &lt;summary&gt;Read the VarInt length prefix and the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ClientPositionAndOrientation const *Packet_ClientPositionAndOrientationSerializer_DeserializeLengthDelimited(CitoStream const *stream, Packet_ClientPositionAndOrientation *instance);

/**
 * &lt;summary&gt;Helper: create a new instance to deserializing into&lt;/summary&gt;
 */
Packet_ClientPositionAndOrientation *Packet_ClientPositionAndOrientationSerializer_DeserializeLengthDelimitedNew(CitoStream const *stream);

/**
 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
 */
void Packet_ClientPositionAndOrientationSerializer_Serialize(CitoStream const *stream, Packet_ClientPositionAndOrientation const *instance);

/**
 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
 */
void Packet_ClientPositionAndOrientationSerializer_SerializeLengthDelimited(CitoStream const *stream, Packet_ClientPositionAndOrientation const *instance);

/**
 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
 */
unsigned char const *Packet_ClientPositionAndOrientationSerializer_SerializeToBytes(Packet_ClientPositionAndOrientation const *instance);

/**
 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ClientReload const *Packet_ClientReloadSerializer_Deserialize(CitoStream const *stream, Packet_ClientReload const *instance);

/**
 * &lt;summary&gt;Helper: put the buffer into a MemoryStream before deserializing&lt;/summary&gt;
 */
Packet_ClientReload const *Packet_ClientReloadSerializer_DeserializeBuffer(unsigned char *buffer, int length, Packet_ClientReload const *instance);

/**
 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ClientReload const *Packet_ClientReloadSerializer_DeserializeLength(CitoStream const *stream, int length, Packet_ClientReload const *instance);

/**
 * &lt;summary&gt;Read the VarInt length prefix and the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ClientReload const *Packet_ClientReloadSerializer_DeserializeLengthDelimited(CitoStream const *stream, Packet_ClientReload const *instance);

/**
 * &lt;summary&gt;Helper: create a new instance to deserializing into&lt;/summary&gt;
 */
Packet_ClientReload const *Packet_ClientReloadSerializer_DeserializeLengthDelimitedNew(CitoStream const *stream);

/**
 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
 */
void Packet_ClientReloadSerializer_Serialize(CitoStream const *stream, Packet_ClientReload const *instance);

/**
 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
 */
void Packet_ClientReloadSerializer_SerializeLengthDelimited(CitoStream const *stream, Packet_ClientReload const *instance);

/**
 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
 */
unsigned char const *Packet_ClientReloadSerializer_SerializeToBytes(Packet_ClientReload const *instance);

Packet_ClientRequestBlob *Packet_ClientRequestBlob_New(void);
void Packet_ClientRequestBlob_Delete(Packet_ClientRequestBlob *self);

Packet_StringList const *Packet_ClientRequestBlob_GetRequestedMd5(Packet_ClientRequestBlob const *self);

void Packet_ClientRequestBlob_SetRequestedMd5(Packet_ClientRequestBlob *self, Packet_StringList *value);

/**
 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ClientRequestBlob const *Packet_ClientRequestBlobSerializer_Deserialize(CitoStream const *stream, Packet_ClientRequestBlob *instance);

/**
 * &lt;summary&gt;Helper: put the buffer into a MemoryStream before deserializing&lt;/summary&gt;
 */
Packet_ClientRequestBlob const *Packet_ClientRequestBlobSerializer_DeserializeBuffer(unsigned char *buffer, int length, Packet_ClientRequestBlob *instance);

/**
 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ClientRequestBlob const *Packet_ClientRequestBlobSerializer_DeserializeLength(CitoStream const *stream, int length, Packet_ClientRequestBlob *instance);

/**
 * &lt;summary&gt;Read the VarInt length prefix and the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ClientRequestBlob const *Packet_ClientRequestBlobSerializer_DeserializeLengthDelimited(CitoStream const *stream, Packet_ClientRequestBlob *instance);

/**
 * &lt;summary&gt;Helper: create a new instance to deserializing into&lt;/summary&gt;
 */
Packet_ClientRequestBlob *Packet_ClientRequestBlobSerializer_DeserializeLengthDelimitedNew(CitoStream const *stream);

/**
 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
 */
void Packet_ClientRequestBlobSerializer_Serialize(CitoStream const *stream, Packet_ClientRequestBlob const *instance);

/**
 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
 */
void Packet_ClientRequestBlobSerializer_SerializeLengthDelimited(CitoStream const *stream, Packet_ClientRequestBlob const *instance);

/**
 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
 */
unsigned char const *Packet_ClientRequestBlobSerializer_SerializeToBytes(Packet_ClientRequestBlob const *instance);

/**
 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_Client const *Packet_ClientSerializer_Deserialize(CitoStream const *stream, Packet_Client *instance);

/**
 * &lt;summary&gt;Helper: put the buffer into a MemoryStream before deserializing&lt;/summary&gt;
 */
Packet_Client const *Packet_ClientSerializer_DeserializeBuffer(unsigned char *buffer, int length, Packet_Client *instance);

/**
 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_Client const *Packet_ClientSerializer_DeserializeLength(CitoStream const *stream, int length, Packet_Client *instance);

/**
 * &lt;summary&gt;Read the VarInt length prefix and the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_Client const *Packet_ClientSerializer_DeserializeLengthDelimited(CitoStream const *stream, Packet_Client *instance);

/**
 * &lt;summary&gt;Helper: create a new instance to deserializing into&lt;/summary&gt;
 */
Packet_Client const *Packet_ClientSerializer_DeserializeLengthDelimitedNew(CitoStream const *stream);

/**
 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
 */
void Packet_ClientSerializer_Serialize(CitoStream const *stream, Packet_Client const *instance);

/**
 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
 */
void Packet_ClientSerializer_SerializeLengthDelimited(CitoStream const *stream, Packet_Client const *instance);

/**
 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
 */
unsigned char const *Packet_ClientSerializer_SerializeToBytes(Packet_Client const *instance);

/**
 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ClientServerQuery const *Packet_ClientServerQuerySerializer_Deserialize(CitoStream const *stream, Packet_ClientServerQuery const *instance);

/**
 * &lt;summary&gt;Helper: put the buffer into a MemoryStream before deserializing&lt;/summary&gt;
 */
Packet_ClientServerQuery const *Packet_ClientServerQuerySerializer_DeserializeBuffer(unsigned char *buffer, int length, Packet_ClientServerQuery const *instance);

/**
 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ClientServerQuery const *Packet_ClientServerQuerySerializer_DeserializeLength(CitoStream const *stream, int length, Packet_ClientServerQuery const *instance);

/**
 * &lt;summary&gt;Read the VarInt length prefix and the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ClientServerQuery const *Packet_ClientServerQuerySerializer_DeserializeLengthDelimited(CitoStream const *stream, Packet_ClientServerQuery const *instance);

/**
 * &lt;summary&gt;Helper: create a new instance to deserializing into&lt;/summary&gt;
 */
Packet_ClientServerQuery const *Packet_ClientServerQuerySerializer_DeserializeLengthDelimitedNew(CitoStream const *stream);

/**
 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
 */
void Packet_ClientServerQuerySerializer_Serialize(CitoStream const *stream, Packet_ClientServerQuery const *instance);

/**
 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
 */
void Packet_ClientServerQuerySerializer_SerializeLengthDelimited(CitoStream const *stream, Packet_ClientServerQuery const *instance);

/**
 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
 */
unsigned char const *Packet_ClientServerQuerySerializer_SerializeToBytes(Packet_ClientServerQuery const *instance);

Packet_ClientSetBlock *Packet_ClientSetBlock_New(void);
void Packet_ClientSetBlock_Delete(Packet_ClientSetBlock *self);

int Packet_ClientSetBlock_GetBlockType(Packet_ClientSetBlock const *self);

int Packet_ClientSetBlock_GetMaterialSlot(Packet_ClientSetBlock const *self);

int Packet_ClientSetBlock_GetMode(Packet_ClientSetBlock const *self);

int Packet_ClientSetBlock_GetX(Packet_ClientSetBlock const *self);

int Packet_ClientSetBlock_GetY(Packet_ClientSetBlock const *self);

int Packet_ClientSetBlock_GetZ(Packet_ClientSetBlock const *self);

void Packet_ClientSetBlock_SetBlockType(Packet_ClientSetBlock *self, int value);

void Packet_ClientSetBlock_SetMaterialSlot(Packet_ClientSetBlock *self, int value);

void Packet_ClientSetBlock_SetMode(Packet_ClientSetBlock *self, int value);

void Packet_ClientSetBlock_SetX(Packet_ClientSetBlock *self, int value);

void Packet_ClientSetBlock_SetY(Packet_ClientSetBlock *self, int value);

void Packet_ClientSetBlock_SetZ(Packet_ClientSetBlock *self, int value);

/**
 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ClientSetBlock const *Packet_ClientSetBlockSerializer_Deserialize(CitoStream const *stream, Packet_ClientSetBlock *instance);

/**
 * &lt;summary&gt;Helper: put the buffer into a MemoryStream before deserializing&lt;/summary&gt;
 */
Packet_ClientSetBlock const *Packet_ClientSetBlockSerializer_DeserializeBuffer(unsigned char *buffer, int length, Packet_ClientSetBlock *instance);

/**
 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ClientSetBlock const *Packet_ClientSetBlockSerializer_DeserializeLength(CitoStream const *stream, int length, Packet_ClientSetBlock *instance);

/**
 * &lt;summary&gt;Read the VarInt length prefix and the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ClientSetBlock const *Packet_ClientSetBlockSerializer_DeserializeLengthDelimited(CitoStream const *stream, Packet_ClientSetBlock *instance);

/**
 * &lt;summary&gt;Helper: create a new instance to deserializing into&lt;/summary&gt;
 */
Packet_ClientSetBlock *Packet_ClientSetBlockSerializer_DeserializeLengthDelimitedNew(CitoStream const *stream);

/**
 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
 */
void Packet_ClientSetBlockSerializer_Serialize(CitoStream const *stream, Packet_ClientSetBlock const *instance);

/**
 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
 */
void Packet_ClientSetBlockSerializer_SerializeLengthDelimited(CitoStream const *stream, Packet_ClientSetBlock const *instance);

/**
 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
 */
unsigned char const *Packet_ClientSetBlockSerializer_SerializeToBytes(Packet_ClientSetBlock const *instance);

Packet_ClientShot *Packet_ClientShot_New(void);
void Packet_ClientShot_Delete(Packet_ClientShot *self);

int Packet_ClientShot_GetExplodesAfter(Packet_ClientShot const *self);

int Packet_ClientShot_GetFromX(Packet_ClientShot const *self);

int Packet_ClientShot_GetFromY(Packet_ClientShot const *self);

int Packet_ClientShot_GetFromZ(Packet_ClientShot const *self);

int Packet_ClientShot_GetHitPlayer(Packet_ClientShot const *self);

int Packet_ClientShot_GetIsHitHead(Packet_ClientShot const *self);

int Packet_ClientShot_GetToX(Packet_ClientShot const *self);

int Packet_ClientShot_GetToY(Packet_ClientShot const *self);

int Packet_ClientShot_GetToZ(Packet_ClientShot const *self);

int Packet_ClientShot_GetWeaponBlock(Packet_ClientShot const *self);

void Packet_ClientShot_SetExplodesAfter(Packet_ClientShot *self, int value);

void Packet_ClientShot_SetFromX(Packet_ClientShot *self, int value);

void Packet_ClientShot_SetFromY(Packet_ClientShot *self, int value);

void Packet_ClientShot_SetFromZ(Packet_ClientShot *self, int value);

void Packet_ClientShot_SetHitPlayer(Packet_ClientShot *self, int value);

void Packet_ClientShot_SetIsHitHead(Packet_ClientShot *self, int value);

void Packet_ClientShot_SetToX(Packet_ClientShot *self, int value);

void Packet_ClientShot_SetToY(Packet_ClientShot *self, int value);

void Packet_ClientShot_SetToZ(Packet_ClientShot *self, int value);

void Packet_ClientShot_SetWeaponBlock(Packet_ClientShot *self, int value);

/**
 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ClientShot const *Packet_ClientShotSerializer_Deserialize(CitoStream const *stream, Packet_ClientShot *instance);

/**
 * &lt;summary&gt;Helper: put the buffer into a MemoryStream before deserializing&lt;/summary&gt;
 */
Packet_ClientShot const *Packet_ClientShotSerializer_DeserializeBuffer(unsigned char *buffer, int length, Packet_ClientShot *instance);

/**
 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ClientShot const *Packet_ClientShotSerializer_DeserializeLength(CitoStream const *stream, int length, Packet_ClientShot *instance);

/**
 * &lt;summary&gt;Read the VarInt length prefix and the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ClientShot const *Packet_ClientShotSerializer_DeserializeLengthDelimited(CitoStream const *stream, Packet_ClientShot *instance);

/**
 * &lt;summary&gt;Helper: create a new instance to deserializing into&lt;/summary&gt;
 */
Packet_ClientShot *Packet_ClientShotSerializer_DeserializeLengthDelimitedNew(CitoStream const *stream);

/**
 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
 */
void Packet_ClientShotSerializer_Serialize(CitoStream const *stream, Packet_ClientShot const *instance);

/**
 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
 */
void Packet_ClientShotSerializer_SerializeLengthDelimited(CitoStream const *stream, Packet_ClientShot const *instance);

/**
 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
 */
unsigned char const *Packet_ClientShotSerializer_SerializeToBytes(Packet_ClientShot const *instance);

Packet_ClientSpecialKey *Packet_ClientSpecialKey_New(void);
void Packet_ClientSpecialKey_Delete(Packet_ClientSpecialKey *self);

int Packet_ClientSpecialKey_GetKey_(Packet_ClientSpecialKey const *self);

void Packet_ClientSpecialKey_SetKey_(Packet_ClientSpecialKey *self, int value);

/**
 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ClientSpecialKey const *Packet_ClientSpecialKeySerializer_Deserialize(CitoStream const *stream, Packet_ClientSpecialKey *instance);

/**
 * &lt;summary&gt;Helper: put the buffer into a MemoryStream before deserializing&lt;/summary&gt;
 */
Packet_ClientSpecialKey const *Packet_ClientSpecialKeySerializer_DeserializeBuffer(unsigned char *buffer, int length, Packet_ClientSpecialKey *instance);

/**
 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ClientSpecialKey const *Packet_ClientSpecialKeySerializer_DeserializeLength(CitoStream const *stream, int length, Packet_ClientSpecialKey *instance);

/**
 * &lt;summary&gt;Read the VarInt length prefix and the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ClientSpecialKey const *Packet_ClientSpecialKeySerializer_DeserializeLengthDelimited(CitoStream const *stream, Packet_ClientSpecialKey *instance);

/**
 * &lt;summary&gt;Helper: create a new instance to deserializing into&lt;/summary&gt;
 */
Packet_ClientSpecialKey *Packet_ClientSpecialKeySerializer_DeserializeLengthDelimitedNew(CitoStream const *stream);

/**
 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
 */
void Packet_ClientSpecialKeySerializer_Serialize(CitoStream const *stream, Packet_ClientSpecialKey const *instance);

/**
 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
 */
void Packet_ClientSpecialKeySerializer_SerializeLengthDelimited(CitoStream const *stream, Packet_ClientSpecialKey const *instance);

/**
 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
 */
unsigned char const *Packet_ClientSpecialKeySerializer_SerializeToBytes(Packet_ClientSpecialKey const *instance);

Packet_CraftingRecipe *Packet_CraftingRecipe_New(void);
void Packet_CraftingRecipe_Delete(Packet_CraftingRecipe *self);

Packet_Ingredient const *const *Packet_CraftingRecipe_GetIngredients(Packet_CraftingRecipe const *self);

int Packet_CraftingRecipe_GetIngredientsCount(Packet_CraftingRecipe const *self);

int Packet_CraftingRecipe_GetIngredientsLength(Packet_CraftingRecipe const *self);

Packet_Ingredient const *Packet_CraftingRecipe_GetOutput(Packet_CraftingRecipe const *self);

void Packet_CraftingRecipe_IngredientsAdd(Packet_CraftingRecipe *self, Packet_Ingredient const *value);

void Packet_CraftingRecipe_SetIngredients(Packet_CraftingRecipe *self, Packet_Ingredient const **value, int count, int length);

void Packet_CraftingRecipe_SetOutput(Packet_CraftingRecipe *self, Packet_Ingredient *value);

/**
 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_CraftingRecipe const *Packet_CraftingRecipeSerializer_Deserialize(CitoStream const *stream, Packet_CraftingRecipe *instance);

/**
 * &lt;summary&gt;Helper: put the buffer into a MemoryStream before deserializing&lt;/summary&gt;
 */
Packet_CraftingRecipe const *Packet_CraftingRecipeSerializer_DeserializeBuffer(unsigned char *buffer, int length, Packet_CraftingRecipe *instance);

/**
 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_CraftingRecipe const *Packet_CraftingRecipeSerializer_DeserializeLength(CitoStream const *stream, int length, Packet_CraftingRecipe *instance);

/**
 * &lt;summary&gt;Read the VarInt length prefix and the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_CraftingRecipe const *Packet_CraftingRecipeSerializer_DeserializeLengthDelimited(CitoStream const *stream, Packet_CraftingRecipe *instance);

/**
 * &lt;summary&gt;Helper: create a new instance to deserializing into&lt;/summary&gt;
 */
Packet_CraftingRecipe const *Packet_CraftingRecipeSerializer_DeserializeLengthDelimitedNew(CitoStream const *stream);

/**
 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
 */
void Packet_CraftingRecipeSerializer_Serialize(CitoStream const *stream, Packet_CraftingRecipe const *instance);

/**
 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
 */
void Packet_CraftingRecipeSerializer_SerializeLengthDelimited(CitoStream const *stream, Packet_CraftingRecipe const *instance);

/**
 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
 */
unsigned char const *Packet_CraftingRecipeSerializer_SerializeToBytes(Packet_CraftingRecipe const *instance);

#define Packet_DeathReasonEnum_BLOCK_DAMAGE  1

#define Packet_DeathReasonEnum_DROWNING  2

#define Packet_DeathReasonEnum_EXPLOSION  3

#define Packet_DeathReasonEnum_FALL_DAMAGE  0

Packet_Dialog *Packet_Dialog_New(void);
void Packet_Dialog_Delete(Packet_Dialog *self);

int Packet_Dialog_GetHeight_(Packet_Dialog const *self);

int Packet_Dialog_GetIsModal(Packet_Dialog const *self);

Packet_Widget const *const *Packet_Dialog_GetWidgets(Packet_Dialog const *self);

int Packet_Dialog_GetWidgetsCount(Packet_Dialog const *self);

int Packet_Dialog_GetWidgetsLength(Packet_Dialog const *self);

int Packet_Dialog_GetWidth(Packet_Dialog const *self);

void Packet_Dialog_SetHeight_(Packet_Dialog *self, int value);

void Packet_Dialog_SetIsModal(Packet_Dialog *self, int value);

void Packet_Dialog_SetWidgets(Packet_Dialog *self, Packet_Widget const **value, int count, int length);

void Packet_Dialog_SetWidth(Packet_Dialog *self, int value);

void Packet_Dialog_WidgetsAdd(Packet_Dialog *self, Packet_Widget const *value);

Packet_DialogFont *Packet_DialogFont_New(void);
void Packet_DialogFont_Delete(Packet_DialogFont *self);

const char *Packet_DialogFont_GetFamilyName(Packet_DialogFont const *self);

int Packet_DialogFont_GetFontStyle(Packet_DialogFont const *self);

int Packet_DialogFont_GetSizeFloat(Packet_DialogFont const *self);

void Packet_DialogFont_SetFamilyName(Packet_DialogFont *self, const char *value);

void Packet_DialogFont_SetFontStyle(Packet_DialogFont *self, int value);

void Packet_DialogFont_SetSizeFloat(Packet_DialogFont *self, int value);

/**
 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_DialogFont const *Packet_DialogFontSerializer_Deserialize(CitoStream const *stream, Packet_DialogFont *instance);

/**
 * &lt;summary&gt;Helper: put the buffer into a MemoryStream before deserializing&lt;/summary&gt;
 */
Packet_DialogFont const *Packet_DialogFontSerializer_DeserializeBuffer(unsigned char *buffer, int length, Packet_DialogFont *instance);

/**
 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_DialogFont const *Packet_DialogFontSerializer_DeserializeLength(CitoStream const *stream, int length, Packet_DialogFont *instance);

/**
 * &lt;summary&gt;Read the VarInt length prefix and the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_DialogFont const *Packet_DialogFontSerializer_DeserializeLengthDelimited(CitoStream const *stream, Packet_DialogFont *instance);

/**
 * &lt;summary&gt;Helper: create a new instance to deserializing into&lt;/summary&gt;
 */
Packet_DialogFont *Packet_DialogFontSerializer_DeserializeLengthDelimitedNew(CitoStream const *stream);

/**
 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
 */
void Packet_DialogFontSerializer_Serialize(CitoStream const *stream, Packet_DialogFont const *instance);

/**
 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
 */
void Packet_DialogFontSerializer_SerializeLengthDelimited(CitoStream const *stream, Packet_DialogFont const *instance);

/**
 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
 */
unsigned char const *Packet_DialogFontSerializer_SerializeToBytes(Packet_DialogFont const *instance);

#define Packet_DialogFontStyleEnum_BOLD  1

#define Packet_DialogFontStyleEnum_ITALIC  2

#define Packet_DialogFontStyleEnum_REGULAR  0

#define Packet_DialogFontStyleEnum_STRIKEOUT  8

#define Packet_DialogFontStyleEnum_UNDERLINE  4

/**
 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_Dialog const *Packet_DialogSerializer_Deserialize(CitoStream const *stream, Packet_Dialog *instance);

/**
 * &lt;summary&gt;Helper: put the buffer into a MemoryStream before deserializing&lt;/summary&gt;
 */
Packet_Dialog const *Packet_DialogSerializer_DeserializeBuffer(unsigned char *buffer, int length, Packet_Dialog *instance);

/**
 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_Dialog const *Packet_DialogSerializer_DeserializeLength(CitoStream const *stream, int length, Packet_Dialog *instance);

/**
 * &lt;summary&gt;Read the VarInt length prefix and the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_Dialog const *Packet_DialogSerializer_DeserializeLengthDelimited(CitoStream const *stream, Packet_Dialog *instance);

/**
 * &lt;summary&gt;Helper: create a new instance to deserializing into&lt;/summary&gt;
 */
Packet_Dialog *Packet_DialogSerializer_DeserializeLengthDelimitedNew(CitoStream const *stream);

/**
 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
 */
void Packet_DialogSerializer_Serialize(CitoStream const *stream, Packet_Dialog const *instance);

/**
 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
 */
void Packet_DialogSerializer_SerializeLengthDelimited(CitoStream const *stream, Packet_Dialog const *instance);

/**
 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
 */
unsigned char const *Packet_DialogSerializer_SerializeToBytes(Packet_Dialog const *instance);

#define Packet_DrawTypeEnum_CACTUS  13

#define Packet_DrawTypeEnum_CLOSED_DOOR  8

#define Packet_DrawTypeEnum_EMPTY  0

#define Packet_DrawTypeEnum_FENCE  10

#define Packet_DrawTypeEnum_FLAT  12

#define Packet_DrawTypeEnum_FLUID  3

#define Packet_DrawTypeEnum_HALF_HEIGHT  11

#define Packet_DrawTypeEnum_LADDER  9

#define Packet_DrawTypeEnum_OPEN_DOOR_LEFT  6

#define Packet_DrawTypeEnum_OPEN_DOOR_RIGHT  7

#define Packet_DrawTypeEnum_PLANT  5

#define Packet_DrawTypeEnum_SOLID  1

#define Packet_DrawTypeEnum_TORCH  4

#define Packet_DrawTypeEnum_TRANSPARENT  2

#define Packet_EntityInteractionTypeEnum_HIT  1

#define Packet_EntityInteractionTypeEnum_USE  0

Packet_Ingredient *Packet_Ingredient_New(void);
void Packet_Ingredient_Delete(Packet_Ingredient *self);

int Packet_Ingredient_GetAmount(Packet_Ingredient const *self);

int Packet_Ingredient_GetType(Packet_Ingredient const *self);

void Packet_Ingredient_SetAmount(Packet_Ingredient *self, int value);

void Packet_Ingredient_SetType(Packet_Ingredient *self, int value);

/**
 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_Ingredient const *Packet_IngredientSerializer_Deserialize(CitoStream const *stream, Packet_Ingredient *instance);

/**
 * &lt;summary&gt;Helper: put the buffer into a MemoryStream before deserializing&lt;/summary&gt;
 */
Packet_Ingredient const *Packet_IngredientSerializer_DeserializeBuffer(unsigned char *buffer, int length, Packet_Ingredient *instance);

/**
 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_Ingredient const *Packet_IngredientSerializer_DeserializeLength(CitoStream const *stream, int length, Packet_Ingredient *instance);

/**
 * &lt;summary&gt;Read the VarInt length prefix and the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_Ingredient const *Packet_IngredientSerializer_DeserializeLengthDelimited(CitoStream const *stream, Packet_Ingredient *instance);

/**
 * &lt;summary&gt;Helper: create a new instance to deserializing into&lt;/summary&gt;
 */
Packet_Ingredient *Packet_IngredientSerializer_DeserializeLengthDelimitedNew(CitoStream const *stream);

/**
 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
 */
void Packet_IngredientSerializer_Serialize(CitoStream const *stream, Packet_Ingredient const *instance);

/**
 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
 */
void Packet_IngredientSerializer_SerializeLengthDelimited(CitoStream const *stream, Packet_Ingredient const *instance);

/**
 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
 */
unsigned char const *Packet_IngredientSerializer_SerializeToBytes(Packet_Ingredient const *instance);

Packet_IntInt *Packet_IntInt_New(void);
void Packet_IntInt_Delete(Packet_IntInt *self);

int Packet_IntInt_GetKey_(Packet_IntInt const *self);

int Packet_IntInt_GetValue_(Packet_IntInt const *self);

void Packet_IntInt_SetKey_(Packet_IntInt *self, int value);

void Packet_IntInt_SetValue_(Packet_IntInt *self, int value);

/**
 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_IntInt const *Packet_IntIntSerializer_Deserialize(CitoStream const *stream, Packet_IntInt *instance);

/**
 * &lt;summary&gt;Helper: put the buffer into a MemoryStream before deserializing&lt;/summary&gt;
 */
Packet_IntInt const *Packet_IntIntSerializer_DeserializeBuffer(unsigned char *buffer, int length, Packet_IntInt *instance);

/**
 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_IntInt const *Packet_IntIntSerializer_DeserializeLength(CitoStream const *stream, int length, Packet_IntInt *instance);

/**
 * &lt;summary&gt;Read the VarInt length prefix and the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_IntInt const *Packet_IntIntSerializer_DeserializeLengthDelimited(CitoStream const *stream, Packet_IntInt *instance);

/**
 * &lt;summary&gt;Helper: create a new instance to deserializing into&lt;/summary&gt;
 */
Packet_IntInt const *Packet_IntIntSerializer_DeserializeLengthDelimitedNew(CitoStream const *stream);

/**
 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
 */
void Packet_IntIntSerializer_Serialize(CitoStream const *stream, Packet_IntInt const *instance);

/**
 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
 */
void Packet_IntIntSerializer_SerializeLengthDelimited(CitoStream const *stream, Packet_IntInt const *instance);

/**
 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
 */
unsigned char const *Packet_IntIntSerializer_SerializeToBytes(Packet_IntInt const *instance);

Packet_IntString *Packet_IntString_New(void);
void Packet_IntString_Delete(Packet_IntString *self);

int Packet_IntString_GetKey_(Packet_IntString const *self);

const char *Packet_IntString_GetValue_(Packet_IntString const *self);

void Packet_IntString_SetKey_(Packet_IntString *self, int value);

void Packet_IntString_SetValue_(Packet_IntString *self, const char *value);

/**
 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_IntString const *Packet_IntStringSerializer_Deserialize(CitoStream const *stream, Packet_IntString *instance);

/**
 * &lt;summary&gt;Helper: put the buffer into a MemoryStream before deserializing&lt;/summary&gt;
 */
Packet_IntString const *Packet_IntStringSerializer_DeserializeBuffer(unsigned char *buffer, int length, Packet_IntString *instance);

/**
 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_IntString const *Packet_IntStringSerializer_DeserializeLength(CitoStream const *stream, int length, Packet_IntString *instance);

/**
 * &lt;summary&gt;Read the VarInt length prefix and the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_IntString const *Packet_IntStringSerializer_DeserializeLengthDelimited(CitoStream const *stream, Packet_IntString *instance);

/**
 * &lt;summary&gt;Helper: create a new instance to deserializing into&lt;/summary&gt;
 */
Packet_IntString const *Packet_IntStringSerializer_DeserializeLengthDelimitedNew(CitoStream const *stream);

/**
 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
 */
void Packet_IntStringSerializer_Serialize(CitoStream const *stream, Packet_IntString const *instance);

/**
 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
 */
void Packet_IntStringSerializer_SerializeLengthDelimited(CitoStream const *stream, Packet_IntString const *instance);

/**
 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
 */
unsigned char const *Packet_IntStringSerializer_SerializeToBytes(Packet_IntString const *instance);

Packet_Inventory *Packet_Inventory_New(void);
void Packet_Inventory_Delete(Packet_Inventory *self);

Packet_Item const *Packet_Inventory_GetBoots(Packet_Inventory const *self);

Packet_Item const *Packet_Inventory_GetDragDropItem(Packet_Inventory const *self);

Packet_Item const *Packet_Inventory_GetGauntlet(Packet_Inventory const *self);

Packet_Item const *Packet_Inventory_GetHelmet(Packet_Inventory const *self);

Packet_PositionItem const *const *Packet_Inventory_GetItems(Packet_Inventory const *self);

int Packet_Inventory_GetItemsCount(Packet_Inventory const *self);

int Packet_Inventory_GetItemsLength(Packet_Inventory const *self);

Packet_Item const *Packet_Inventory_GetMainArmor(Packet_Inventory const *self);

Packet_Item const *const *Packet_Inventory_GetRightHand(Packet_Inventory const *self);

int Packet_Inventory_GetRightHandCount(Packet_Inventory const *self);

int Packet_Inventory_GetRightHandLength(Packet_Inventory const *self);

void Packet_Inventory_ItemsAdd(Packet_Inventory *self, Packet_PositionItem const *value);

void Packet_Inventory_RightHandAdd(Packet_Inventory *self, Packet_Item *value);

void Packet_Inventory_SetBoots(Packet_Inventory *self, Packet_Item *value);

void Packet_Inventory_SetDragDropItem(Packet_Inventory *self, Packet_Item *value);

void Packet_Inventory_SetGauntlet(Packet_Inventory *self, Packet_Item *value);

void Packet_Inventory_SetHelmet(Packet_Inventory *self, Packet_Item *value);

void Packet_Inventory_SetItems(Packet_Inventory *self, Packet_PositionItem const **value, int count, int length);

void Packet_Inventory_SetMainArmor(Packet_Inventory *self, Packet_Item *value);

void Packet_Inventory_SetRightHand(Packet_Inventory *self, Packet_Item const **value, int count, int length);

#define Packet_InventoryActionTypeEnum_CLICK  0

#define Packet_InventoryActionTypeEnum_MOVE_TO_INVENTORY  2

#define Packet_InventoryActionTypeEnum_WEAR_ITEM  1

Packet_InventoryPosition *Packet_InventoryPosition_New(void);
void Packet_InventoryPosition_Delete(Packet_InventoryPosition *self);

int Packet_InventoryPosition_GetActiveMaterial(Packet_InventoryPosition const *self);

int Packet_InventoryPosition_GetAreaX(Packet_InventoryPosition const *self);

int Packet_InventoryPosition_GetAreaY(Packet_InventoryPosition const *self);

int Packet_InventoryPosition_GetGroundPositionX(Packet_InventoryPosition const *self);

int Packet_InventoryPosition_GetGroundPositionY(Packet_InventoryPosition const *self);

int Packet_InventoryPosition_GetGroundPositionZ(Packet_InventoryPosition const *self);

int Packet_InventoryPosition_GetMaterialId(Packet_InventoryPosition const *self);

int Packet_InventoryPosition_GetType(Packet_InventoryPosition const *self);

int Packet_InventoryPosition_GetWearPlace(Packet_InventoryPosition const *self);

void Packet_InventoryPosition_SetActiveMaterial(Packet_InventoryPosition *self, int value);

void Packet_InventoryPosition_SetAreaX(Packet_InventoryPosition *self, int value);

void Packet_InventoryPosition_SetAreaY(Packet_InventoryPosition *self, int value);

void Packet_InventoryPosition_SetGroundPositionX(Packet_InventoryPosition *self, int value);

void Packet_InventoryPosition_SetGroundPositionY(Packet_InventoryPosition *self, int value);

void Packet_InventoryPosition_SetGroundPositionZ(Packet_InventoryPosition *self, int value);

void Packet_InventoryPosition_SetMaterialId(Packet_InventoryPosition *self, int value);

void Packet_InventoryPosition_SetType(Packet_InventoryPosition *self, int value);

void Packet_InventoryPosition_SetWearPlace(Packet_InventoryPosition *self, int value);

/**
 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_InventoryPosition const *Packet_InventoryPositionSerializer_Deserialize(CitoStream const *stream, Packet_InventoryPosition *instance);

/**
 * &lt;summary&gt;Helper: put the buffer into a MemoryStream before deserializing&lt;/summary&gt;
 */
Packet_InventoryPosition const *Packet_InventoryPositionSerializer_DeserializeBuffer(unsigned char *buffer, int length, Packet_InventoryPosition *instance);

/**
 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_InventoryPosition const *Packet_InventoryPositionSerializer_DeserializeLength(CitoStream const *stream, int length, Packet_InventoryPosition *instance);

/**
 * &lt;summary&gt;Read the VarInt length prefix and the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_InventoryPosition const *Packet_InventoryPositionSerializer_DeserializeLengthDelimited(CitoStream const *stream, Packet_InventoryPosition *instance);

/**
 * &lt;summary&gt;Helper: create a new instance to deserializing into&lt;/summary&gt;
 */
Packet_InventoryPosition *Packet_InventoryPositionSerializer_DeserializeLengthDelimitedNew(CitoStream const *stream);

/**
 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
 */
void Packet_InventoryPositionSerializer_Serialize(CitoStream const *stream, Packet_InventoryPosition const *instance);

/**
 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
 */
void Packet_InventoryPositionSerializer_SerializeLengthDelimited(CitoStream const *stream, Packet_InventoryPosition const *instance);

/**
 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
 */
unsigned char const *Packet_InventoryPositionSerializer_SerializeToBytes(Packet_InventoryPosition const *instance);

#define Packet_InventoryPositionTypeEnum_GROUND  1

#define Packet_InventoryPositionTypeEnum_MAIN_AREA  0

#define Packet_InventoryPositionTypeEnum_MATERIAL_SELECTOR  2

#define Packet_InventoryPositionTypeEnum_WEAR_PLACE  3

/**
 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_Inventory const *Packet_InventorySerializer_Deserialize(CitoStream const *stream, Packet_Inventory *instance);

/**
 * &lt;summary&gt;Helper: put the buffer into a MemoryStream before deserializing&lt;/summary&gt;
 */
Packet_Inventory const *Packet_InventorySerializer_DeserializeBuffer(unsigned char *buffer, int length, Packet_Inventory *instance);

/**
 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_Inventory const *Packet_InventorySerializer_DeserializeLength(CitoStream const *stream, int length, Packet_Inventory *instance);

/**
 * &lt;summary&gt;Read the VarInt length prefix and the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_Inventory const *Packet_InventorySerializer_DeserializeLengthDelimited(CitoStream const *stream, Packet_Inventory *instance);

/**
 * &lt;summary&gt;Helper: create a new instance to deserializing into&lt;/summary&gt;
 */
Packet_Inventory *Packet_InventorySerializer_DeserializeLengthDelimitedNew(CitoStream const *stream);

/**
 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
 */
void Packet_InventorySerializer_Serialize(CitoStream const *stream, Packet_Inventory const *instance);

/**
 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
 */
void Packet_InventorySerializer_SerializeLengthDelimited(CitoStream const *stream, Packet_Inventory const *instance);

/**
 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
 */
unsigned char const *Packet_InventorySerializer_SerializeToBytes(Packet_Inventory const *instance);

Packet_Item *Packet_Item_New(void);
void Packet_Item_Delete(Packet_Item *self);

int Packet_Item_GetBlockCount(Packet_Item const *self);

int Packet_Item_GetBlockId(Packet_Item const *self);

int Packet_Item_GetItemClass(Packet_Item const *self);

const char *Packet_Item_GetItemId(Packet_Item const *self);

void Packet_Item_SetBlockCount(Packet_Item *self, int value);

void Packet_Item_SetBlockId(Packet_Item *self, int value);

void Packet_Item_SetItemClass(Packet_Item *self, int value);

void Packet_Item_SetItemId(Packet_Item *self, const char *value);

#define Packet_ItemClassEnum_BLOCK  0

#define Packet_ItemClassEnum_BOOTS  3

#define Packet_ItemClassEnum_GAUNTLET  5

#define Packet_ItemClassEnum_HELMET  4

#define Packet_ItemClassEnum_MAIN_ARMOR  2

#define Packet_ItemClassEnum_OTHER  7

#define Packet_ItemClassEnum_SHIELD  6

#define Packet_ItemClassEnum_WEAPON  1

/**
 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_Item const *Packet_ItemSerializer_Deserialize(CitoStream const *stream, Packet_Item *instance);

/**
 * &lt;summary&gt;Helper: put the buffer into a MemoryStream before deserializing&lt;/summary&gt;
 */
Packet_Item const *Packet_ItemSerializer_DeserializeBuffer(unsigned char *buffer, int length, Packet_Item *instance);

/**
 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_Item const *Packet_ItemSerializer_DeserializeLength(CitoStream const *stream, int length, Packet_Item *instance);

/**
 * &lt;summary&gt;Read the VarInt length prefix and the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_Item const *Packet_ItemSerializer_DeserializeLengthDelimited(CitoStream const *stream, Packet_Item *instance);

/**
 * &lt;summary&gt;Helper: create a new instance to deserializing into&lt;/summary&gt;
 */
Packet_Item *Packet_ItemSerializer_DeserializeLengthDelimitedNew(CitoStream const *stream);

/**
 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
 */
void Packet_ItemSerializer_Serialize(CitoStream const *stream, Packet_Item const *instance);

/**
 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
 */
void Packet_ItemSerializer_SerializeLengthDelimited(CitoStream const *stream, Packet_Item const *instance);

/**
 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
 */
unsigned char const *Packet_ItemSerializer_SerializeToBytes(Packet_Item const *instance);

#define Packet_LeaveReasonEnum_CRASH  1

#define Packet_LeaveReasonEnum_LEAVE  0

#define Packet_PistolTypeEnum_GRENADE  1

#define Packet_PistolTypeEnum_NORMAL  0

Packet_PositionAndOrientation *Packet_PositionAndOrientation_New(void);
void Packet_PositionAndOrientation_Delete(Packet_PositionAndOrientation *self);

int Packet_PositionAndOrientation_GetHeading(Packet_PositionAndOrientation const *self);

int Packet_PositionAndOrientation_GetPitch(Packet_PositionAndOrientation const *self);

int Packet_PositionAndOrientation_GetStance(Packet_PositionAndOrientation const *self);

int Packet_PositionAndOrientation_GetX(Packet_PositionAndOrientation const *self);

int Packet_PositionAndOrientation_GetY(Packet_PositionAndOrientation const *self);

int Packet_PositionAndOrientation_GetZ(Packet_PositionAndOrientation const *self);

void Packet_PositionAndOrientation_SetHeading(Packet_PositionAndOrientation *self, int value);

void Packet_PositionAndOrientation_SetPitch(Packet_PositionAndOrientation *self, int value);

void Packet_PositionAndOrientation_SetStance(Packet_PositionAndOrientation *self, int value);

void Packet_PositionAndOrientation_SetX(Packet_PositionAndOrientation *self, int value);

void Packet_PositionAndOrientation_SetY(Packet_PositionAndOrientation *self, int value);

void Packet_PositionAndOrientation_SetZ(Packet_PositionAndOrientation *self, int value);

/**
 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_PositionAndOrientation const *Packet_PositionAndOrientationSerializer_Deserialize(CitoStream const *stream, Packet_PositionAndOrientation *instance);

/**
 * &lt;summary&gt;Helper: put the buffer into a MemoryStream before deserializing&lt;/summary&gt;
 */
Packet_PositionAndOrientation const *Packet_PositionAndOrientationSerializer_DeserializeBuffer(unsigned char *buffer, int length, Packet_PositionAndOrientation *instance);

/**
 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_PositionAndOrientation const *Packet_PositionAndOrientationSerializer_DeserializeLength(CitoStream const *stream, int length, Packet_PositionAndOrientation *instance);

/**
 * &lt;summary&gt;Read the VarInt length prefix and the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_PositionAndOrientation const *Packet_PositionAndOrientationSerializer_DeserializeLengthDelimited(CitoStream const *stream, Packet_PositionAndOrientation *instance);

/**
 * &lt;summary&gt;Helper: create a new instance to deserializing into&lt;/summary&gt;
 */
Packet_PositionAndOrientation *Packet_PositionAndOrientationSerializer_DeserializeLengthDelimitedNew(CitoStream const *stream);

/**
 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
 */
void Packet_PositionAndOrientationSerializer_Serialize(CitoStream const *stream, Packet_PositionAndOrientation const *instance);

/**
 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
 */
void Packet_PositionAndOrientationSerializer_SerializeLengthDelimited(CitoStream const *stream, Packet_PositionAndOrientation const *instance);

/**
 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
 */
unsigned char const *Packet_PositionAndOrientationSerializer_SerializeToBytes(Packet_PositionAndOrientation const *instance);

Packet_PositionItem *Packet_PositionItem_New(void);
void Packet_PositionItem_Delete(Packet_PositionItem *self);

const char *Packet_PositionItem_GetKey_(Packet_PositionItem const *self);

Packet_Item const *Packet_PositionItem_GetValue_(Packet_PositionItem const *self);

int Packet_PositionItem_GetX(Packet_PositionItem const *self);

int Packet_PositionItem_GetY(Packet_PositionItem const *self);

void Packet_PositionItem_SetKey_(Packet_PositionItem *self, const char *value);

void Packet_PositionItem_SetValue_(Packet_PositionItem *self, Packet_Item *value);

void Packet_PositionItem_SetX(Packet_PositionItem *self, int value);

void Packet_PositionItem_SetY(Packet_PositionItem *self, int value);

/**
 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_PositionItem const *Packet_PositionItemSerializer_Deserialize(CitoStream const *stream, Packet_PositionItem *instance);

/**
 * &lt;summary&gt;Helper: put the buffer into a MemoryStream before deserializing&lt;/summary&gt;
 */
Packet_PositionItem const *Packet_PositionItemSerializer_DeserializeBuffer(unsigned char *buffer, int length, Packet_PositionItem *instance);

/**
 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_PositionItem const *Packet_PositionItemSerializer_DeserializeLength(CitoStream const *stream, int length, Packet_PositionItem *instance);

/**
 * &lt;summary&gt;Read the VarInt length prefix and the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_PositionItem const *Packet_PositionItemSerializer_DeserializeLengthDelimited(CitoStream const *stream, Packet_PositionItem *instance);

/**
 * &lt;summary&gt;Helper: create a new instance to deserializing into&lt;/summary&gt;
 */
Packet_PositionItem const *Packet_PositionItemSerializer_DeserializeLengthDelimitedNew(CitoStream const *stream);

/**
 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
 */
void Packet_PositionItemSerializer_Serialize(CitoStream const *stream, Packet_PositionItem const *instance);

/**
 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
 */
void Packet_PositionItemSerializer_SerializeLengthDelimited(CitoStream const *stream, Packet_PositionItem const *instance);

/**
 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
 */
unsigned char const *Packet_PositionItemSerializer_SerializeToBytes(Packet_PositionItem const *instance);

Packet_Server *Packet_Server_New(void);
void Packet_Server_Delete(Packet_Server *self);

Packet_ServerAmmo const *Packet_Server_GetAmmo(Packet_Server const *self);

Packet_ServerBlobFinalize const *Packet_Server_GetBlobFinalize(Packet_Server const *self);

Packet_ServerBlobInitialize const *Packet_Server_GetBlobInitialize(Packet_Server const *self);

Packet_ServerBlobPart const *Packet_Server_GetBlobPart(Packet_Server const *self);

Packet_ServerBlockType const *Packet_Server_GetBlockType(Packet_Server const *self);

Packet_ServerBlockTypes const *Packet_Server_GetBlockTypes(Packet_Server const *self);

Packet_ServerBullet const *Packet_Server_GetBullet(Packet_Server const *self);

Packet_ServerChunkPart const *Packet_Server_GetChunkPart(Packet_Server const *self);

Packet_ServerChunk const *Packet_Server_GetChunk_(Packet_Server const *self);

Packet_ServerCraftingRecipes const *Packet_Server_GetCraftingRecipes(Packet_Server const *self);

Packet_ServerDialog const *Packet_Server_GetDialog(Packet_Server const *self);

Packet_ServerDisconnectPlayer const *Packet_Server_GetDisconnectPlayer(Packet_Server const *self);

Packet_ServerEntityDespawn const *Packet_Server_GetEntityDespawn(Packet_Server const *self);

Packet_ServerEntityPositionAndOrientation const *Packet_Server_GetEntityPosition(Packet_Server const *self);

Packet_ServerEntitySpawn const *Packet_Server_GetEntitySpawn(Packet_Server const *self);

Packet_ServerExplosion const *Packet_Server_GetExplosion(Packet_Server const *self);

Packet_ServerFillArea const *Packet_Server_GetFillArea(Packet_Server const *self);

Packet_ServerFillAreaLimit const *Packet_Server_GetFillAreaLimit(Packet_Server const *self);

Packet_ServerFollow const *Packet_Server_GetFollow(Packet_Server const *self);

Packet_ServerFreemove const *Packet_Server_GetFreemove(Packet_Server const *self);

Packet_ServerHeightmapChunk const *Packet_Server_GetHeightmapChunk(Packet_Server const *self);

int Packet_Server_GetId(Packet_Server const *self);

Packet_ServerIdentification const *Packet_Server_GetIdentification(Packet_Server const *self);

Packet_ServerInventory const *Packet_Server_GetInventory(Packet_Server const *self);

Packet_ServerLevelProgress const *Packet_Server_GetLevelDataChunk(Packet_Server const *self);

Packet_ServerLevelFinalize const *Packet_Server_GetLevelFinalize(Packet_Server const *self);

Packet_ServerLevelInitialize const *Packet_Server_GetLevelInitialize(Packet_Server const *self);

Packet_ServerLightLevels const *Packet_Server_GetLightLevels(Packet_Server const *self);

Packet_ServerMessage const *Packet_Server_GetMessage(Packet_Server const *self);

Packet_ServerMonsters const *Packet_Server_GetMonster(Packet_Server const *self);

Packet_ServerPing const *Packet_Server_GetPing(Packet_Server const *self);

Packet_ServerPlayerPing const *Packet_Server_GetPlayerPing(Packet_Server const *self);

Packet_ServerPlayerSpawnPosition const *Packet_Server_GetPlayerSpawnPosition(Packet_Server const *self);

Packet_ServerPlayerStats const *Packet_Server_GetPlayerStats(Packet_Server const *self);

Packet_ServerProjectile const *Packet_Server_GetProjectile(Packet_Server const *self);

Packet_ServerQueryAnswer const *Packet_Server_GetQueryAnswer(Packet_Server const *self);

Packet_ServerRedirect const *Packet_Server_GetRedirect(Packet_Server const *self);

Packet_ServerSeason const *Packet_Server_GetSeason(Packet_Server const *self);

Packet_ServerSetBlock const *Packet_Server_GetSetBlock(Packet_Server const *self);

Packet_ServerSound const *Packet_Server_GetSound(Packet_Server const *self);

Packet_ServerSunLevels const *Packet_Server_GetSunLevels(Packet_Server const *self);

Packet_ServerTranslatedString const *Packet_Server_GetTranslation(Packet_Server const *self);

void Packet_Server_SetAmmo(Packet_Server *self, Packet_ServerAmmo *value);

void Packet_Server_SetBlobFinalize(Packet_Server *self, Packet_ServerBlobFinalize const *value);

void Packet_Server_SetBlobInitialize(Packet_Server *self, Packet_ServerBlobInitialize *value);

void Packet_Server_SetBlobPart(Packet_Server *self, Packet_ServerBlobPart *value);

void Packet_Server_SetBlockType(Packet_Server *self, Packet_ServerBlockType *value);

void Packet_Server_SetBlockTypes(Packet_Server *self, Packet_ServerBlockTypes const *value);

void Packet_Server_SetBullet(Packet_Server *self, Packet_ServerBullet *value);

void Packet_Server_SetChunkPart(Packet_Server *self, Packet_ServerChunkPart *value);

void Packet_Server_SetChunk_(Packet_Server *self, Packet_ServerChunk *value);

void Packet_Server_SetCraftingRecipes(Packet_Server *self, Packet_ServerCraftingRecipes *value);

void Packet_Server_SetDialog(Packet_Server *self, Packet_ServerDialog *value);

void Packet_Server_SetDisconnectPlayer(Packet_Server *self, Packet_ServerDisconnectPlayer *value);

void Packet_Server_SetEntityDespawn(Packet_Server *self, Packet_ServerEntityDespawn *value);

void Packet_Server_SetEntityPosition(Packet_Server *self, Packet_ServerEntityPositionAndOrientation *value);

void Packet_Server_SetEntitySpawn(Packet_Server *self, Packet_ServerEntitySpawn *value);

void Packet_Server_SetExplosion(Packet_Server *self, Packet_ServerExplosion *value);

void Packet_Server_SetFillArea(Packet_Server *self, Packet_ServerFillArea *value);

void Packet_Server_SetFillAreaLimit(Packet_Server *self, Packet_ServerFillAreaLimit *value);

void Packet_Server_SetFollow(Packet_Server *self, Packet_ServerFollow *value);

void Packet_Server_SetFreemove(Packet_Server *self, Packet_ServerFreemove *value);

void Packet_Server_SetHeightmapChunk(Packet_Server *self, Packet_ServerHeightmapChunk *value);

void Packet_Server_SetId(Packet_Server *self, int value);

void Packet_Server_SetIdentification(Packet_Server *self, Packet_ServerIdentification *value);

void Packet_Server_SetInventory(Packet_Server *self, Packet_ServerInventory *value);

void Packet_Server_SetLevelDataChunk(Packet_Server *self, Packet_ServerLevelProgress *value);

void Packet_Server_SetLevelFinalize(Packet_Server *self, Packet_ServerLevelFinalize const *value);

void Packet_Server_SetLevelInitialize(Packet_Server *self, Packet_ServerLevelInitialize const *value);

void Packet_Server_SetLightLevels(Packet_Server *self, Packet_ServerLightLevels *value);

void Packet_Server_SetMessage(Packet_Server *self, Packet_ServerMessage *value);

void Packet_Server_SetMonster(Packet_Server *self, Packet_ServerMonsters *value);

void Packet_Server_SetPing(Packet_Server *self, Packet_ServerPing const *value);

void Packet_Server_SetPlayerPing(Packet_Server *self, Packet_ServerPlayerPing *value);

void Packet_Server_SetPlayerSpawnPosition(Packet_Server *self, Packet_ServerPlayerSpawnPosition *value);

void Packet_Server_SetPlayerStats(Packet_Server *self, Packet_ServerPlayerStats *value);

void Packet_Server_SetProjectile(Packet_Server *self, Packet_ServerProjectile *value);

void Packet_Server_SetQueryAnswer(Packet_Server *self, Packet_ServerQueryAnswer *value);

void Packet_Server_SetRedirect(Packet_Server *self, Packet_ServerRedirect *value);

void Packet_Server_SetSeason(Packet_Server *self, Packet_ServerSeason *value);

void Packet_Server_SetSetBlock(Packet_Server *self, Packet_ServerSetBlock *value);

void Packet_Server_SetSound(Packet_Server *self, Packet_ServerSound *value);

void Packet_Server_SetSunLevels(Packet_Server *self, Packet_ServerSunLevels *value);

void Packet_Server_SetTranslation(Packet_Server *self, Packet_ServerTranslatedString *value);

Packet_ServerAmmo *Packet_ServerAmmo_New(void);
void Packet_ServerAmmo_Delete(Packet_ServerAmmo *self);

Packet_IntInt const *const *Packet_ServerAmmo_GetTotalAmmo(Packet_ServerAmmo const *self);

int Packet_ServerAmmo_GetTotalAmmoCount(Packet_ServerAmmo const *self);

int Packet_ServerAmmo_GetTotalAmmoLength(Packet_ServerAmmo const *self);

void Packet_ServerAmmo_SetTotalAmmo(Packet_ServerAmmo *self, Packet_IntInt const **value, int count, int length);

void Packet_ServerAmmo_TotalAmmoAdd(Packet_ServerAmmo *self, Packet_IntInt const *value);

/**
 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerAmmo const *Packet_ServerAmmoSerializer_Deserialize(CitoStream const *stream, Packet_ServerAmmo *instance);

/**
 * &lt;summary&gt;Helper: put the buffer into a MemoryStream before deserializing&lt;/summary&gt;
 */
Packet_ServerAmmo const *Packet_ServerAmmoSerializer_DeserializeBuffer(unsigned char *buffer, int length, Packet_ServerAmmo *instance);

/**
 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerAmmo const *Packet_ServerAmmoSerializer_DeserializeLength(CitoStream const *stream, int length, Packet_ServerAmmo *instance);

/**
 * &lt;summary&gt;Read the VarInt length prefix and the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerAmmo const *Packet_ServerAmmoSerializer_DeserializeLengthDelimited(CitoStream const *stream, Packet_ServerAmmo *instance);

/**
 * &lt;summary&gt;Helper: create a new instance to deserializing into&lt;/summary&gt;
 */
Packet_ServerAmmo *Packet_ServerAmmoSerializer_DeserializeLengthDelimitedNew(CitoStream const *stream);

/**
 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
 */
void Packet_ServerAmmoSerializer_Serialize(CitoStream const *stream, Packet_ServerAmmo const *instance);

/**
 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
 */
void Packet_ServerAmmoSerializer_SerializeLengthDelimited(CitoStream const *stream, Packet_ServerAmmo const *instance);

/**
 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
 */
unsigned char const *Packet_ServerAmmoSerializer_SerializeToBytes(Packet_ServerAmmo const *instance);

/**
 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerBlobFinalize const *Packet_ServerBlobFinalizeSerializer_Deserialize(CitoStream const *stream, Packet_ServerBlobFinalize const *instance);

/**
 * &lt;summary&gt;Helper: put the buffer into a MemoryStream before deserializing&lt;/summary&gt;
 */
Packet_ServerBlobFinalize const *Packet_ServerBlobFinalizeSerializer_DeserializeBuffer(unsigned char *buffer, int length, Packet_ServerBlobFinalize const *instance);

/**
 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerBlobFinalize const *Packet_ServerBlobFinalizeSerializer_DeserializeLength(CitoStream const *stream, int length, Packet_ServerBlobFinalize const *instance);

/**
 * &lt;summary&gt;Read the VarInt length prefix and the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerBlobFinalize const *Packet_ServerBlobFinalizeSerializer_DeserializeLengthDelimited(CitoStream const *stream, Packet_ServerBlobFinalize const *instance);

/**
 * &lt;summary&gt;Helper: create a new instance to deserializing into&lt;/summary&gt;
 */
Packet_ServerBlobFinalize const *Packet_ServerBlobFinalizeSerializer_DeserializeLengthDelimitedNew(CitoStream const *stream);

/**
 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
 */
void Packet_ServerBlobFinalizeSerializer_Serialize(CitoStream const *stream, Packet_ServerBlobFinalize const *instance);

/**
 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
 */
void Packet_ServerBlobFinalizeSerializer_SerializeLengthDelimited(CitoStream const *stream, Packet_ServerBlobFinalize const *instance);

/**
 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
 */
unsigned char const *Packet_ServerBlobFinalizeSerializer_SerializeToBytes(Packet_ServerBlobFinalize const *instance);

Packet_ServerBlobInitialize *Packet_ServerBlobInitialize_New(void);
void Packet_ServerBlobInitialize_Delete(Packet_ServerBlobInitialize *self);

const char *Packet_ServerBlobInitialize_GetMd5(Packet_ServerBlobInitialize const *self);

const char *Packet_ServerBlobInitialize_GetName(Packet_ServerBlobInitialize const *self);

void Packet_ServerBlobInitialize_SetMd5(Packet_ServerBlobInitialize *self, const char *value);

void Packet_ServerBlobInitialize_SetName(Packet_ServerBlobInitialize *self, const char *value);

/**
 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerBlobInitialize const *Packet_ServerBlobInitializeSerializer_Deserialize(CitoStream const *stream, Packet_ServerBlobInitialize *instance);

/**
 * &lt;summary&gt;Helper: put the buffer into a MemoryStream before deserializing&lt;/summary&gt;
 */
Packet_ServerBlobInitialize const *Packet_ServerBlobInitializeSerializer_DeserializeBuffer(unsigned char *buffer, int length, Packet_ServerBlobInitialize *instance);

/**
 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerBlobInitialize const *Packet_ServerBlobInitializeSerializer_DeserializeLength(CitoStream const *stream, int length, Packet_ServerBlobInitialize *instance);

/**
 * &lt;summary&gt;Read the VarInt length prefix and the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerBlobInitialize const *Packet_ServerBlobInitializeSerializer_DeserializeLengthDelimited(CitoStream const *stream, Packet_ServerBlobInitialize *instance);

/**
 * &lt;summary&gt;Helper: create a new instance to deserializing into&lt;/summary&gt;
 */
Packet_ServerBlobInitialize *Packet_ServerBlobInitializeSerializer_DeserializeLengthDelimitedNew(CitoStream const *stream);

/**
 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
 */
void Packet_ServerBlobInitializeSerializer_Serialize(CitoStream const *stream, Packet_ServerBlobInitialize const *instance);

/**
 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
 */
void Packet_ServerBlobInitializeSerializer_SerializeLengthDelimited(CitoStream const *stream, Packet_ServerBlobInitialize const *instance);

/**
 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
 */
unsigned char const *Packet_ServerBlobInitializeSerializer_SerializeToBytes(Packet_ServerBlobInitialize const *instance);

Packet_ServerBlobPart *Packet_ServerBlobPart_New(void);
void Packet_ServerBlobPart_Delete(Packet_ServerBlobPart *self);

unsigned char const *Packet_ServerBlobPart_GetData(Packet_ServerBlobPart const *self);

int Packet_ServerBlobPart_GetIslastpart(Packet_ServerBlobPart const *self);

void Packet_ServerBlobPart_SetData(Packet_ServerBlobPart *self, unsigned char const *value);

void Packet_ServerBlobPart_SetIslastpart(Packet_ServerBlobPart *self, int value);

/**
 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerBlobPart const *Packet_ServerBlobPartSerializer_Deserialize(CitoStream const *stream, Packet_ServerBlobPart *instance);

/**
 * &lt;summary&gt;Helper: put the buffer into a MemoryStream before deserializing&lt;/summary&gt;
 */
Packet_ServerBlobPart const *Packet_ServerBlobPartSerializer_DeserializeBuffer(unsigned char *buffer, int length, Packet_ServerBlobPart *instance);

/**
 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerBlobPart const *Packet_ServerBlobPartSerializer_DeserializeLength(CitoStream const *stream, int length, Packet_ServerBlobPart *instance);

/**
 * &lt;summary&gt;Read the VarInt length prefix and the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerBlobPart const *Packet_ServerBlobPartSerializer_DeserializeLengthDelimited(CitoStream const *stream, Packet_ServerBlobPart *instance);

/**
 * &lt;summary&gt;Helper: create a new instance to deserializing into&lt;/summary&gt;
 */
Packet_ServerBlobPart *Packet_ServerBlobPartSerializer_DeserializeLengthDelimitedNew(CitoStream const *stream);

/**
 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
 */
void Packet_ServerBlobPartSerializer_Serialize(CitoStream const *stream, Packet_ServerBlobPart const *instance);

/**
 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
 */
void Packet_ServerBlobPartSerializer_SerializeLengthDelimited(CitoStream const *stream, Packet_ServerBlobPart const *instance);

/**
 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
 */
unsigned char const *Packet_ServerBlobPartSerializer_SerializeToBytes(Packet_ServerBlobPart const *instance);

Packet_ServerBlockType *Packet_ServerBlockType_New(void);
void Packet_ServerBlockType_Delete(Packet_ServerBlockType *self);

Packet_BlockType const *Packet_ServerBlockType_GetBlocktype(Packet_ServerBlockType const *self);

int Packet_ServerBlockType_GetId(Packet_ServerBlockType const *self);

void Packet_ServerBlockType_SetBlocktype(Packet_ServerBlockType *self, Packet_BlockType *value);

void Packet_ServerBlockType_SetId(Packet_ServerBlockType *self, int value);

/**
 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerBlockType const *Packet_ServerBlockTypeSerializer_Deserialize(CitoStream const *stream, Packet_ServerBlockType *instance);

/**
 * &lt;summary&gt;Helper: put the buffer into a MemoryStream before deserializing&lt;/summary&gt;
 */
Packet_ServerBlockType const *Packet_ServerBlockTypeSerializer_DeserializeBuffer(unsigned char *buffer, int length, Packet_ServerBlockType *instance);

/**
 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerBlockType const *Packet_ServerBlockTypeSerializer_DeserializeLength(CitoStream const *stream, int length, Packet_ServerBlockType *instance);

/**
 * &lt;summary&gt;Read the VarInt length prefix and the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerBlockType const *Packet_ServerBlockTypeSerializer_DeserializeLengthDelimited(CitoStream const *stream, Packet_ServerBlockType *instance);

/**
 * &lt;summary&gt;Helper: create a new instance to deserializing into&lt;/summary&gt;
 */
Packet_ServerBlockType *Packet_ServerBlockTypeSerializer_DeserializeLengthDelimitedNew(CitoStream const *stream);

/**
 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
 */
void Packet_ServerBlockTypeSerializer_Serialize(CitoStream const *stream, Packet_ServerBlockType const *instance);

/**
 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
 */
void Packet_ServerBlockTypeSerializer_SerializeLengthDelimited(CitoStream const *stream, Packet_ServerBlockType const *instance);

/**
 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
 */
unsigned char const *Packet_ServerBlockTypeSerializer_SerializeToBytes(Packet_ServerBlockType const *instance);

/**
 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerBlockTypes const *Packet_ServerBlockTypesSerializer_Deserialize(CitoStream const *stream, Packet_ServerBlockTypes const *instance);

/**
 * &lt;summary&gt;Helper: put the buffer into a MemoryStream before deserializing&lt;/summary&gt;
 */
Packet_ServerBlockTypes const *Packet_ServerBlockTypesSerializer_DeserializeBuffer(unsigned char *buffer, int length, Packet_ServerBlockTypes const *instance);

/**
 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerBlockTypes const *Packet_ServerBlockTypesSerializer_DeserializeLength(CitoStream const *stream, int length, Packet_ServerBlockTypes const *instance);

/**
 * &lt;summary&gt;Read the VarInt length prefix and the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerBlockTypes const *Packet_ServerBlockTypesSerializer_DeserializeLengthDelimited(CitoStream const *stream, Packet_ServerBlockTypes const *instance);

/**
 * &lt;summary&gt;Helper: create a new instance to deserializing into&lt;/summary&gt;
 */
Packet_ServerBlockTypes const *Packet_ServerBlockTypesSerializer_DeserializeLengthDelimitedNew(CitoStream const *stream);

/**
 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
 */
void Packet_ServerBlockTypesSerializer_Serialize(CitoStream const *stream, Packet_ServerBlockTypes const *instance);

/**
 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
 */
void Packet_ServerBlockTypesSerializer_SerializeLengthDelimited(CitoStream const *stream, Packet_ServerBlockTypes const *instance);

/**
 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
 */
unsigned char const *Packet_ServerBlockTypesSerializer_SerializeToBytes(Packet_ServerBlockTypes const *instance);

Packet_ServerBullet *Packet_ServerBullet_New(void);
void Packet_ServerBullet_Delete(Packet_ServerBullet *self);

int Packet_ServerBullet_GetFromXFloat(Packet_ServerBullet const *self);

int Packet_ServerBullet_GetFromYFloat(Packet_ServerBullet const *self);

int Packet_ServerBullet_GetFromZFloat(Packet_ServerBullet const *self);

int Packet_ServerBullet_GetSpeedFloat(Packet_ServerBullet const *self);

int Packet_ServerBullet_GetToXFloat(Packet_ServerBullet const *self);

int Packet_ServerBullet_GetToYFloat(Packet_ServerBullet const *self);

int Packet_ServerBullet_GetToZFloat(Packet_ServerBullet const *self);

void Packet_ServerBullet_SetFromXFloat(Packet_ServerBullet *self, int value);

void Packet_ServerBullet_SetFromYFloat(Packet_ServerBullet *self, int value);

void Packet_ServerBullet_SetFromZFloat(Packet_ServerBullet *self, int value);

void Packet_ServerBullet_SetSpeedFloat(Packet_ServerBullet *self, int value);

void Packet_ServerBullet_SetToXFloat(Packet_ServerBullet *self, int value);

void Packet_ServerBullet_SetToYFloat(Packet_ServerBullet *self, int value);

void Packet_ServerBullet_SetToZFloat(Packet_ServerBullet *self, int value);

/**
 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerBullet const *Packet_ServerBulletSerializer_Deserialize(CitoStream const *stream, Packet_ServerBullet *instance);

/**
 * &lt;summary&gt;Helper: put the buffer into a MemoryStream before deserializing&lt;/summary&gt;
 */
Packet_ServerBullet const *Packet_ServerBulletSerializer_DeserializeBuffer(unsigned char *buffer, int length, Packet_ServerBullet *instance);

/**
 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerBullet const *Packet_ServerBulletSerializer_DeserializeLength(CitoStream const *stream, int length, Packet_ServerBullet *instance);

/**
 * &lt;summary&gt;Read the VarInt length prefix and the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerBullet const *Packet_ServerBulletSerializer_DeserializeLengthDelimited(CitoStream const *stream, Packet_ServerBullet *instance);

/**
 * &lt;summary&gt;Helper: create a new instance to deserializing into&lt;/summary&gt;
 */
Packet_ServerBullet *Packet_ServerBulletSerializer_DeserializeLengthDelimitedNew(CitoStream const *stream);

/**
 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
 */
void Packet_ServerBulletSerializer_Serialize(CitoStream const *stream, Packet_ServerBullet const *instance);

/**
 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
 */
void Packet_ServerBulletSerializer_SerializeLengthDelimited(CitoStream const *stream, Packet_ServerBullet const *instance);

/**
 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
 */
unsigned char const *Packet_ServerBulletSerializer_SerializeToBytes(Packet_ServerBullet const *instance);

Packet_ServerChunk *Packet_ServerChunk_New(void);
void Packet_ServerChunk_Delete(Packet_ServerChunk *self);

int Packet_ServerChunk_GetSizeX(Packet_ServerChunk const *self);

int Packet_ServerChunk_GetSizeY(Packet_ServerChunk const *self);

int Packet_ServerChunk_GetSizeZ(Packet_ServerChunk const *self);

int Packet_ServerChunk_GetX(Packet_ServerChunk const *self);

int Packet_ServerChunk_GetY(Packet_ServerChunk const *self);

int Packet_ServerChunk_GetZ(Packet_ServerChunk const *self);

void Packet_ServerChunk_SetSizeX(Packet_ServerChunk *self, int value);

void Packet_ServerChunk_SetSizeY(Packet_ServerChunk *self, int value);

void Packet_ServerChunk_SetSizeZ(Packet_ServerChunk *self, int value);

void Packet_ServerChunk_SetX(Packet_ServerChunk *self, int value);

void Packet_ServerChunk_SetY(Packet_ServerChunk *self, int value);

void Packet_ServerChunk_SetZ(Packet_ServerChunk *self, int value);

Packet_ServerChunkPart *Packet_ServerChunkPart_New(void);
void Packet_ServerChunkPart_Delete(Packet_ServerChunkPart *self);

unsigned char const *Packet_ServerChunkPart_GetCompressedChunkPart(Packet_ServerChunkPart const *self);

void Packet_ServerChunkPart_SetCompressedChunkPart(Packet_ServerChunkPart *self, unsigned char const *value);

/**
 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerChunkPart const *Packet_ServerChunkPartSerializer_Deserialize(CitoStream const *stream, Packet_ServerChunkPart *instance);

/**
 * &lt;summary&gt;Helper: put the buffer into a MemoryStream before deserializing&lt;/summary&gt;
 */
Packet_ServerChunkPart const *Packet_ServerChunkPartSerializer_DeserializeBuffer(unsigned char *buffer, int length, Packet_ServerChunkPart *instance);

/**
 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerChunkPart const *Packet_ServerChunkPartSerializer_DeserializeLength(CitoStream const *stream, int length, Packet_ServerChunkPart *instance);

/**
 * &lt;summary&gt;Read the VarInt length prefix and the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerChunkPart const *Packet_ServerChunkPartSerializer_DeserializeLengthDelimited(CitoStream const *stream, Packet_ServerChunkPart *instance);

/**
 * &lt;summary&gt;Helper: create a new instance to deserializing into&lt;/summary&gt;
 */
Packet_ServerChunkPart *Packet_ServerChunkPartSerializer_DeserializeLengthDelimitedNew(CitoStream const *stream);

/**
 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
 */
void Packet_ServerChunkPartSerializer_Serialize(CitoStream const *stream, Packet_ServerChunkPart const *instance);

/**
 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
 */
void Packet_ServerChunkPartSerializer_SerializeLengthDelimited(CitoStream const *stream, Packet_ServerChunkPart const *instance);

/**
 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
 */
unsigned char const *Packet_ServerChunkPartSerializer_SerializeToBytes(Packet_ServerChunkPart const *instance);

/**
 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerChunk const *Packet_ServerChunkSerializer_Deserialize(CitoStream const *stream, Packet_ServerChunk *instance);

/**
 * &lt;summary&gt;Helper: put the buffer into a MemoryStream before deserializing&lt;/summary&gt;
 */
Packet_ServerChunk const *Packet_ServerChunkSerializer_DeserializeBuffer(unsigned char *buffer, int length, Packet_ServerChunk *instance);

/**
 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerChunk const *Packet_ServerChunkSerializer_DeserializeLength(CitoStream const *stream, int length, Packet_ServerChunk *instance);

/**
 * &lt;summary&gt;Read the VarInt length prefix and the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerChunk const *Packet_ServerChunkSerializer_DeserializeLengthDelimited(CitoStream const *stream, Packet_ServerChunk *instance);

/**
 * &lt;summary&gt;Helper: create a new instance to deserializing into&lt;/summary&gt;
 */
Packet_ServerChunk *Packet_ServerChunkSerializer_DeserializeLengthDelimitedNew(CitoStream const *stream);

/**
 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
 */
void Packet_ServerChunkSerializer_Serialize(CitoStream const *stream, Packet_ServerChunk const *instance);

/**
 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
 */
void Packet_ServerChunkSerializer_SerializeLengthDelimited(CitoStream const *stream, Packet_ServerChunk const *instance);

/**
 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
 */
unsigned char const *Packet_ServerChunkSerializer_SerializeToBytes(Packet_ServerChunk const *instance);

Packet_ServerCraftingRecipes *Packet_ServerCraftingRecipes_New(void);
void Packet_ServerCraftingRecipes_Delete(Packet_ServerCraftingRecipes *self);

void Packet_ServerCraftingRecipes_CraftingRecipesAdd(Packet_ServerCraftingRecipes *self, Packet_CraftingRecipe const *value);

Packet_CraftingRecipe const *const *Packet_ServerCraftingRecipes_GetCraftingRecipes(Packet_ServerCraftingRecipes const *self);

int Packet_ServerCraftingRecipes_GetCraftingRecipesCount(Packet_ServerCraftingRecipes const *self);

int Packet_ServerCraftingRecipes_GetCraftingRecipesLength(Packet_ServerCraftingRecipes const *self);

void Packet_ServerCraftingRecipes_SetCraftingRecipes(Packet_ServerCraftingRecipes *self, Packet_CraftingRecipe const **value, int count, int length);

/**
 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerCraftingRecipes const *Packet_ServerCraftingRecipesSerializer_Deserialize(CitoStream const *stream, Packet_ServerCraftingRecipes *instance);

/**
 * &lt;summary&gt;Helper: put the buffer into a MemoryStream before deserializing&lt;/summary&gt;
 */
Packet_ServerCraftingRecipes const *Packet_ServerCraftingRecipesSerializer_DeserializeBuffer(unsigned char *buffer, int length, Packet_ServerCraftingRecipes *instance);

/**
 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerCraftingRecipes const *Packet_ServerCraftingRecipesSerializer_DeserializeLength(CitoStream const *stream, int length, Packet_ServerCraftingRecipes *instance);

/**
 * &lt;summary&gt;Read the VarInt length prefix and the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerCraftingRecipes const *Packet_ServerCraftingRecipesSerializer_DeserializeLengthDelimited(CitoStream const *stream, Packet_ServerCraftingRecipes *instance);

/**
 * &lt;summary&gt;Helper: create a new instance to deserializing into&lt;/summary&gt;
 */
Packet_ServerCraftingRecipes *Packet_ServerCraftingRecipesSerializer_DeserializeLengthDelimitedNew(CitoStream const *stream);

/**
 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
 */
void Packet_ServerCraftingRecipesSerializer_Serialize(CitoStream const *stream, Packet_ServerCraftingRecipes const *instance);

/**
 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
 */
void Packet_ServerCraftingRecipesSerializer_SerializeLengthDelimited(CitoStream const *stream, Packet_ServerCraftingRecipes const *instance);

/**
 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
 */
unsigned char const *Packet_ServerCraftingRecipesSerializer_SerializeToBytes(Packet_ServerCraftingRecipes const *instance);

Packet_ServerDialog *Packet_ServerDialog_New(void);
void Packet_ServerDialog_Delete(Packet_ServerDialog *self);

Packet_Dialog const *Packet_ServerDialog_GetDialog(Packet_ServerDialog const *self);

const char *Packet_ServerDialog_GetDialogId(Packet_ServerDialog const *self);

void Packet_ServerDialog_SetDialog(Packet_ServerDialog *self, Packet_Dialog *value);

void Packet_ServerDialog_SetDialogId(Packet_ServerDialog *self, const char *value);

/**
 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerDialog const *Packet_ServerDialogSerializer_Deserialize(CitoStream const *stream, Packet_ServerDialog *instance);

/**
 * &lt;summary&gt;Helper: put the buffer into a MemoryStream before deserializing&lt;/summary&gt;
 */
Packet_ServerDialog const *Packet_ServerDialogSerializer_DeserializeBuffer(unsigned char *buffer, int length, Packet_ServerDialog *instance);

/**
 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerDialog const *Packet_ServerDialogSerializer_DeserializeLength(CitoStream const *stream, int length, Packet_ServerDialog *instance);

/**
 * &lt;summary&gt;Read the VarInt length prefix and the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerDialog const *Packet_ServerDialogSerializer_DeserializeLengthDelimited(CitoStream const *stream, Packet_ServerDialog *instance);

/**
 * &lt;summary&gt;Helper: create a new instance to deserializing into&lt;/summary&gt;
 */
Packet_ServerDialog *Packet_ServerDialogSerializer_DeserializeLengthDelimitedNew(CitoStream const *stream);

/**
 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
 */
void Packet_ServerDialogSerializer_Serialize(CitoStream const *stream, Packet_ServerDialog const *instance);

/**
 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
 */
void Packet_ServerDialogSerializer_SerializeLengthDelimited(CitoStream const *stream, Packet_ServerDialog const *instance);

/**
 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
 */
unsigned char const *Packet_ServerDialogSerializer_SerializeToBytes(Packet_ServerDialog const *instance);

Packet_ServerDisconnectPlayer *Packet_ServerDisconnectPlayer_New(void);
void Packet_ServerDisconnectPlayer_Delete(Packet_ServerDisconnectPlayer *self);

const char *Packet_ServerDisconnectPlayer_GetDisconnectReason(Packet_ServerDisconnectPlayer const *self);

void Packet_ServerDisconnectPlayer_SetDisconnectReason(Packet_ServerDisconnectPlayer *self, const char *value);

/**
 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerDisconnectPlayer const *Packet_ServerDisconnectPlayerSerializer_Deserialize(CitoStream const *stream, Packet_ServerDisconnectPlayer *instance);

/**
 * &lt;summary&gt;Helper: put the buffer into a MemoryStream before deserializing&lt;/summary&gt;
 */
Packet_ServerDisconnectPlayer const *Packet_ServerDisconnectPlayerSerializer_DeserializeBuffer(unsigned char *buffer, int length, Packet_ServerDisconnectPlayer *instance);

/**
 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerDisconnectPlayer const *Packet_ServerDisconnectPlayerSerializer_DeserializeLength(CitoStream const *stream, int length, Packet_ServerDisconnectPlayer *instance);

/**
 * &lt;summary&gt;Read the VarInt length prefix and the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerDisconnectPlayer const *Packet_ServerDisconnectPlayerSerializer_DeserializeLengthDelimited(CitoStream const *stream, Packet_ServerDisconnectPlayer *instance);

/**
 * &lt;summary&gt;Helper: create a new instance to deserializing into&lt;/summary&gt;
 */
Packet_ServerDisconnectPlayer *Packet_ServerDisconnectPlayerSerializer_DeserializeLengthDelimitedNew(CitoStream const *stream);

/**
 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
 */
void Packet_ServerDisconnectPlayerSerializer_Serialize(CitoStream const *stream, Packet_ServerDisconnectPlayer const *instance);

/**
 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
 */
void Packet_ServerDisconnectPlayerSerializer_SerializeLengthDelimited(CitoStream const *stream, Packet_ServerDisconnectPlayer const *instance);

/**
 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
 */
unsigned char const *Packet_ServerDisconnectPlayerSerializer_SerializeToBytes(Packet_ServerDisconnectPlayer const *instance);

Packet_ServerEntity *Packet_ServerEntity_New(void);
void Packet_ServerEntity_Delete(Packet_ServerEntity *self);

Packet_ServerEntityDrawArea const *Packet_ServerEntity_GetDrawArea(Packet_ServerEntity const *self);

Packet_ServerEntityDrawBlock const *Packet_ServerEntity_GetDrawBlock(Packet_ServerEntity const *self);

Packet_ServerEntityAnimatedModel const *Packet_ServerEntity_GetDrawModel(Packet_ServerEntity const *self);

Packet_ServerEntityDrawName const *Packet_ServerEntity_GetDrawName_(Packet_ServerEntity const *self);

Packet_ServerEntityDrawText const *Packet_ServerEntity_GetDrawText(Packet_ServerEntity const *self);

Packet_ServerPlayerStats const *Packet_ServerEntity_GetPlayerStats(Packet_ServerEntity const *self);

Packet_PositionAndOrientation const *Packet_ServerEntity_GetPosition(Packet_ServerEntity const *self);

Packet_ServerEntityPush const *Packet_ServerEntity_GetPush(Packet_ServerEntity const *self);

cibool Packet_ServerEntity_GetUsable(Packet_ServerEntity const *self);

void Packet_ServerEntity_SetDrawArea(Packet_ServerEntity *self, Packet_ServerEntityDrawArea *value);

void Packet_ServerEntity_SetDrawBlock(Packet_ServerEntity *self, Packet_ServerEntityDrawBlock *value);

void Packet_ServerEntity_SetDrawModel(Packet_ServerEntity *self, Packet_ServerEntityAnimatedModel *value);

void Packet_ServerEntity_SetDrawName_(Packet_ServerEntity *self, Packet_ServerEntityDrawName *value);

void Packet_ServerEntity_SetDrawText(Packet_ServerEntity *self, Packet_ServerEntityDrawText *value);

void Packet_ServerEntity_SetPlayerStats(Packet_ServerEntity *self, Packet_ServerPlayerStats *value);

void Packet_ServerEntity_SetPosition(Packet_ServerEntity *self, Packet_PositionAndOrientation *value);

void Packet_ServerEntity_SetPush(Packet_ServerEntity *self, Packet_ServerEntityPush *value);

void Packet_ServerEntity_SetUsable(Packet_ServerEntity *self, cibool value);

Packet_ServerEntityAnimatedModel *Packet_ServerEntityAnimatedModel_New(void);
void Packet_ServerEntityAnimatedModel_Delete(Packet_ServerEntityAnimatedModel *self);

int Packet_ServerEntityAnimatedModel_GetDownloadSkin(Packet_ServerEntityAnimatedModel const *self);

int Packet_ServerEntityAnimatedModel_GetEyeHeight(Packet_ServerEntityAnimatedModel const *self);

int Packet_ServerEntityAnimatedModel_GetModelHeight(Packet_ServerEntityAnimatedModel const *self);

const char *Packet_ServerEntityAnimatedModel_GetModel_(Packet_ServerEntityAnimatedModel const *self);

const char *Packet_ServerEntityAnimatedModel_GetTexture_(Packet_ServerEntityAnimatedModel const *self);

void Packet_ServerEntityAnimatedModel_SetDownloadSkin(Packet_ServerEntityAnimatedModel *self, int value);

void Packet_ServerEntityAnimatedModel_SetEyeHeight(Packet_ServerEntityAnimatedModel *self, int value);

void Packet_ServerEntityAnimatedModel_SetModelHeight(Packet_ServerEntityAnimatedModel *self, int value);

void Packet_ServerEntityAnimatedModel_SetModel_(Packet_ServerEntityAnimatedModel *self, const char *value);

void Packet_ServerEntityAnimatedModel_SetTexture_(Packet_ServerEntityAnimatedModel *self, const char *value);

/**
 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerEntityAnimatedModel const *Packet_ServerEntityAnimatedModelSerializer_Deserialize(CitoStream const *stream, Packet_ServerEntityAnimatedModel *instance);

/**
 * &lt;summary&gt;Helper: put the buffer into a MemoryStream before deserializing&lt;/summary&gt;
 */
Packet_ServerEntityAnimatedModel const *Packet_ServerEntityAnimatedModelSerializer_DeserializeBuffer(unsigned char *buffer, int length, Packet_ServerEntityAnimatedModel *instance);

/**
 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerEntityAnimatedModel const *Packet_ServerEntityAnimatedModelSerializer_DeserializeLength(CitoStream const *stream, int length, Packet_ServerEntityAnimatedModel *instance);

/**
 * &lt;summary&gt;Read the VarInt length prefix and the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerEntityAnimatedModel const *Packet_ServerEntityAnimatedModelSerializer_DeserializeLengthDelimited(CitoStream const *stream, Packet_ServerEntityAnimatedModel *instance);

/**
 * &lt;summary&gt;Helper: create a new instance to deserializing into&lt;/summary&gt;
 */
Packet_ServerEntityAnimatedModel *Packet_ServerEntityAnimatedModelSerializer_DeserializeLengthDelimitedNew(CitoStream const *stream);

/**
 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
 */
void Packet_ServerEntityAnimatedModelSerializer_Serialize(CitoStream const *stream, Packet_ServerEntityAnimatedModel const *instance);

/**
 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
 */
void Packet_ServerEntityAnimatedModelSerializer_SerializeLengthDelimited(CitoStream const *stream, Packet_ServerEntityAnimatedModel const *instance);

/**
 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
 */
unsigned char const *Packet_ServerEntityAnimatedModelSerializer_SerializeToBytes(Packet_ServerEntityAnimatedModel const *instance);

Packet_ServerEntityDespawn *Packet_ServerEntityDespawn_New(void);
void Packet_ServerEntityDespawn_Delete(Packet_ServerEntityDespawn *self);

int Packet_ServerEntityDespawn_GetId(Packet_ServerEntityDespawn const *self);

void Packet_ServerEntityDespawn_SetId(Packet_ServerEntityDespawn *self, int value);

/**
 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerEntityDespawn const *Packet_ServerEntityDespawnSerializer_Deserialize(CitoStream const *stream, Packet_ServerEntityDespawn *instance);

/**
 * &lt;summary&gt;Helper: put the buffer into a MemoryStream before deserializing&lt;/summary&gt;
 */
Packet_ServerEntityDespawn const *Packet_ServerEntityDespawnSerializer_DeserializeBuffer(unsigned char *buffer, int length, Packet_ServerEntityDespawn *instance);

/**
 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerEntityDespawn const *Packet_ServerEntityDespawnSerializer_DeserializeLength(CitoStream const *stream, int length, Packet_ServerEntityDespawn *instance);

/**
 * &lt;summary&gt;Read the VarInt length prefix and the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerEntityDespawn const *Packet_ServerEntityDespawnSerializer_DeserializeLengthDelimited(CitoStream const *stream, Packet_ServerEntityDespawn *instance);

/**
 * &lt;summary&gt;Helper: create a new instance to deserializing into&lt;/summary&gt;
 */
Packet_ServerEntityDespawn *Packet_ServerEntityDespawnSerializer_DeserializeLengthDelimitedNew(CitoStream const *stream);

/**
 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
 */
void Packet_ServerEntityDespawnSerializer_Serialize(CitoStream const *stream, Packet_ServerEntityDespawn const *instance);

/**
 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
 */
void Packet_ServerEntityDespawnSerializer_SerializeLengthDelimited(CitoStream const *stream, Packet_ServerEntityDespawn const *instance);

/**
 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
 */
unsigned char const *Packet_ServerEntityDespawnSerializer_SerializeToBytes(Packet_ServerEntityDespawn const *instance);

Packet_ServerEntityDrawArea *Packet_ServerEntityDrawArea_New(void);
void Packet_ServerEntityDrawArea_Delete(Packet_ServerEntityDrawArea *self);

int Packet_ServerEntityDrawArea_GetSizex(Packet_ServerEntityDrawArea const *self);

int Packet_ServerEntityDrawArea_GetSizey(Packet_ServerEntityDrawArea const *self);

int Packet_ServerEntityDrawArea_GetSizez(Packet_ServerEntityDrawArea const *self);

int Packet_ServerEntityDrawArea_GetVisibleToClientId(Packet_ServerEntityDrawArea const *self);

int Packet_ServerEntityDrawArea_GetX(Packet_ServerEntityDrawArea const *self);

int Packet_ServerEntityDrawArea_GetY(Packet_ServerEntityDrawArea const *self);

int Packet_ServerEntityDrawArea_GetZ(Packet_ServerEntityDrawArea const *self);

void Packet_ServerEntityDrawArea_SetSizex(Packet_ServerEntityDrawArea *self, int value);

void Packet_ServerEntityDrawArea_SetSizey(Packet_ServerEntityDrawArea *self, int value);

void Packet_ServerEntityDrawArea_SetSizez(Packet_ServerEntityDrawArea *self, int value);

void Packet_ServerEntityDrawArea_SetVisibleToClientId(Packet_ServerEntityDrawArea *self, int value);

void Packet_ServerEntityDrawArea_SetX(Packet_ServerEntityDrawArea *self, int value);

void Packet_ServerEntityDrawArea_SetY(Packet_ServerEntityDrawArea *self, int value);

void Packet_ServerEntityDrawArea_SetZ(Packet_ServerEntityDrawArea *self, int value);

/**
 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerEntityDrawArea const *Packet_ServerEntityDrawAreaSerializer_Deserialize(CitoStream const *stream, Packet_ServerEntityDrawArea *instance);

/**
 * &lt;summary&gt;Helper: put the buffer into a MemoryStream before deserializing&lt;/summary&gt;
 */
Packet_ServerEntityDrawArea const *Packet_ServerEntityDrawAreaSerializer_DeserializeBuffer(unsigned char *buffer, int length, Packet_ServerEntityDrawArea *instance);

/**
 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerEntityDrawArea const *Packet_ServerEntityDrawAreaSerializer_DeserializeLength(CitoStream const *stream, int length, Packet_ServerEntityDrawArea *instance);

/**
 * &lt;summary&gt;Read the VarInt length prefix and the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerEntityDrawArea const *Packet_ServerEntityDrawAreaSerializer_DeserializeLengthDelimited(CitoStream const *stream, Packet_ServerEntityDrawArea *instance);

/**
 * &lt;summary&gt;Helper: create a new instance to deserializing into&lt;/summary&gt;
 */
Packet_ServerEntityDrawArea *Packet_ServerEntityDrawAreaSerializer_DeserializeLengthDelimitedNew(CitoStream const *stream);

/**
 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
 */
void Packet_ServerEntityDrawAreaSerializer_Serialize(CitoStream const *stream, Packet_ServerEntityDrawArea const *instance);

/**
 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
 */
void Packet_ServerEntityDrawAreaSerializer_SerializeLengthDelimited(CitoStream const *stream, Packet_ServerEntityDrawArea const *instance);

/**
 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
 */
unsigned char const *Packet_ServerEntityDrawAreaSerializer_SerializeToBytes(Packet_ServerEntityDrawArea const *instance);

Packet_ServerEntityDrawBlock *Packet_ServerEntityDrawBlock_New(void);
void Packet_ServerEntityDrawBlock_Delete(Packet_ServerEntityDrawBlock *self);

int Packet_ServerEntityDrawBlock_GetBlockType(Packet_ServerEntityDrawBlock const *self);

void Packet_ServerEntityDrawBlock_SetBlockType(Packet_ServerEntityDrawBlock *self, int value);

/**
 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerEntityDrawBlock const *Packet_ServerEntityDrawBlockSerializer_Deserialize(CitoStream const *stream, Packet_ServerEntityDrawBlock *instance);

/**
 * &lt;summary&gt;Helper: put the buffer into a MemoryStream before deserializing&lt;/summary&gt;
 */
Packet_ServerEntityDrawBlock const *Packet_ServerEntityDrawBlockSerializer_DeserializeBuffer(unsigned char *buffer, int length, Packet_ServerEntityDrawBlock *instance);

/**
 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerEntityDrawBlock const *Packet_ServerEntityDrawBlockSerializer_DeserializeLength(CitoStream const *stream, int length, Packet_ServerEntityDrawBlock *instance);

/**
 * &lt;summary&gt;Read the VarInt length prefix and the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerEntityDrawBlock const *Packet_ServerEntityDrawBlockSerializer_DeserializeLengthDelimited(CitoStream const *stream, Packet_ServerEntityDrawBlock *instance);

/**
 * &lt;summary&gt;Helper: create a new instance to deserializing into&lt;/summary&gt;
 */
Packet_ServerEntityDrawBlock *Packet_ServerEntityDrawBlockSerializer_DeserializeLengthDelimitedNew(CitoStream const *stream);

/**
 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
 */
void Packet_ServerEntityDrawBlockSerializer_Serialize(CitoStream const *stream, Packet_ServerEntityDrawBlock const *instance);

/**
 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
 */
void Packet_ServerEntityDrawBlockSerializer_SerializeLengthDelimited(CitoStream const *stream, Packet_ServerEntityDrawBlock const *instance);

/**
 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
 */
unsigned char const *Packet_ServerEntityDrawBlockSerializer_SerializeToBytes(Packet_ServerEntityDrawBlock const *instance);

Packet_ServerEntityDrawName *Packet_ServerEntityDrawName_New(void);
void Packet_ServerEntityDrawName_Delete(Packet_ServerEntityDrawName *self);

cibool Packet_ServerEntityDrawName_GetClientAutoComplete(Packet_ServerEntityDrawName const *self);

const char *Packet_ServerEntityDrawName_GetColor(Packet_ServerEntityDrawName const *self);

const char *Packet_ServerEntityDrawName_GetName(Packet_ServerEntityDrawName const *self);

cibool Packet_ServerEntityDrawName_GetOnlyWhenSelected(Packet_ServerEntityDrawName const *self);

void Packet_ServerEntityDrawName_SetClientAutoComplete(Packet_ServerEntityDrawName *self, cibool value);

void Packet_ServerEntityDrawName_SetColor(Packet_ServerEntityDrawName *self, const char *value);

void Packet_ServerEntityDrawName_SetName(Packet_ServerEntityDrawName *self, const char *value);

void Packet_ServerEntityDrawName_SetOnlyWhenSelected(Packet_ServerEntityDrawName *self, cibool value);

/**
 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerEntityDrawName const *Packet_ServerEntityDrawNameSerializer_Deserialize(CitoStream const *stream, Packet_ServerEntityDrawName *instance);

/**
 * &lt;summary&gt;Helper: put the buffer into a MemoryStream before deserializing&lt;/summary&gt;
 */
Packet_ServerEntityDrawName const *Packet_ServerEntityDrawNameSerializer_DeserializeBuffer(unsigned char *buffer, int length, Packet_ServerEntityDrawName *instance);

/**
 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerEntityDrawName const *Packet_ServerEntityDrawNameSerializer_DeserializeLength(CitoStream const *stream, int length, Packet_ServerEntityDrawName *instance);

/**
 * &lt;summary&gt;Read the VarInt length prefix and the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerEntityDrawName const *Packet_ServerEntityDrawNameSerializer_DeserializeLengthDelimited(CitoStream const *stream, Packet_ServerEntityDrawName *instance);

/**
 * &lt;summary&gt;Helper: create a new instance to deserializing into&lt;/summary&gt;
 */
Packet_ServerEntityDrawName *Packet_ServerEntityDrawNameSerializer_DeserializeLengthDelimitedNew(CitoStream const *stream);

/**
 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
 */
void Packet_ServerEntityDrawNameSerializer_Serialize(CitoStream const *stream, Packet_ServerEntityDrawName const *instance);

/**
 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
 */
void Packet_ServerEntityDrawNameSerializer_SerializeLengthDelimited(CitoStream const *stream, Packet_ServerEntityDrawName const *instance);

/**
 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
 */
unsigned char const *Packet_ServerEntityDrawNameSerializer_SerializeToBytes(Packet_ServerEntityDrawName const *instance);

Packet_ServerEntityDrawText *Packet_ServerEntityDrawText_New(void);
void Packet_ServerEntityDrawText_Delete(Packet_ServerEntityDrawText *self);

int Packet_ServerEntityDrawText_GetDx(Packet_ServerEntityDrawText const *self);

int Packet_ServerEntityDrawText_GetDy(Packet_ServerEntityDrawText const *self);

int Packet_ServerEntityDrawText_GetDz(Packet_ServerEntityDrawText const *self);

int Packet_ServerEntityDrawText_GetRotx(Packet_ServerEntityDrawText const *self);

int Packet_ServerEntityDrawText_GetRoty(Packet_ServerEntityDrawText const *self);

int Packet_ServerEntityDrawText_GetRotz(Packet_ServerEntityDrawText const *self);

const char *Packet_ServerEntityDrawText_GetText(Packet_ServerEntityDrawText const *self);

void Packet_ServerEntityDrawText_SetDx(Packet_ServerEntityDrawText *self, int value);

void Packet_ServerEntityDrawText_SetDy(Packet_ServerEntityDrawText *self, int value);

void Packet_ServerEntityDrawText_SetDz(Packet_ServerEntityDrawText *self, int value);

void Packet_ServerEntityDrawText_SetRotx(Packet_ServerEntityDrawText *self, int value);

void Packet_ServerEntityDrawText_SetRoty(Packet_ServerEntityDrawText *self, int value);

void Packet_ServerEntityDrawText_SetRotz(Packet_ServerEntityDrawText *self, int value);

void Packet_ServerEntityDrawText_SetText(Packet_ServerEntityDrawText *self, const char *value);

/**
 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerEntityDrawText const *Packet_ServerEntityDrawTextSerializer_Deserialize(CitoStream const *stream, Packet_ServerEntityDrawText *instance);

/**
 * &lt;summary&gt;Helper: put the buffer into a MemoryStream before deserializing&lt;/summary&gt;
 */
Packet_ServerEntityDrawText const *Packet_ServerEntityDrawTextSerializer_DeserializeBuffer(unsigned char *buffer, int length, Packet_ServerEntityDrawText *instance);

/**
 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerEntityDrawText const *Packet_ServerEntityDrawTextSerializer_DeserializeLength(CitoStream const *stream, int length, Packet_ServerEntityDrawText *instance);

/**
 * &lt;summary&gt;Read the VarInt length prefix and the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerEntityDrawText const *Packet_ServerEntityDrawTextSerializer_DeserializeLengthDelimited(CitoStream const *stream, Packet_ServerEntityDrawText *instance);

/**
 * &lt;summary&gt;Helper: create a new instance to deserializing into&lt;/summary&gt;
 */
Packet_ServerEntityDrawText *Packet_ServerEntityDrawTextSerializer_DeserializeLengthDelimitedNew(CitoStream const *stream);

/**
 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
 */
void Packet_ServerEntityDrawTextSerializer_Serialize(CitoStream const *stream, Packet_ServerEntityDrawText const *instance);

/**
 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
 */
void Packet_ServerEntityDrawTextSerializer_SerializeLengthDelimited(CitoStream const *stream, Packet_ServerEntityDrawText const *instance);

/**
 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
 */
unsigned char const *Packet_ServerEntityDrawTextSerializer_SerializeToBytes(Packet_ServerEntityDrawText const *instance);

Packet_ServerEntityPositionAndOrientation *Packet_ServerEntityPositionAndOrientation_New(void);
void Packet_ServerEntityPositionAndOrientation_Delete(Packet_ServerEntityPositionAndOrientation *self);

int Packet_ServerEntityPositionAndOrientation_GetId(Packet_ServerEntityPositionAndOrientation const *self);

Packet_PositionAndOrientation const *Packet_ServerEntityPositionAndOrientation_GetPositionAndOrientation(Packet_ServerEntityPositionAndOrientation const *self);

void Packet_ServerEntityPositionAndOrientation_SetId(Packet_ServerEntityPositionAndOrientation *self, int value);

void Packet_ServerEntityPositionAndOrientation_SetPositionAndOrientation(Packet_ServerEntityPositionAndOrientation *self, Packet_PositionAndOrientation *value);

/**
 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerEntityPositionAndOrientation const *Packet_ServerEntityPositionAndOrientationSerializer_Deserialize(CitoStream const *stream, Packet_ServerEntityPositionAndOrientation *instance);

/**
 * &lt;summary&gt;Helper: put the buffer into a MemoryStream before deserializing&lt;/summary&gt;
 */
Packet_ServerEntityPositionAndOrientation const *Packet_ServerEntityPositionAndOrientationSerializer_DeserializeBuffer(unsigned char *buffer, int length, Packet_ServerEntityPositionAndOrientation *instance);

/**
 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerEntityPositionAndOrientation const *Packet_ServerEntityPositionAndOrientationSerializer_DeserializeLength(CitoStream const *stream, int length, Packet_ServerEntityPositionAndOrientation *instance);

/**
 * &lt;summary&gt;Read the VarInt length prefix and the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerEntityPositionAndOrientation const *Packet_ServerEntityPositionAndOrientationSerializer_DeserializeLengthDelimited(CitoStream const *stream, Packet_ServerEntityPositionAndOrientation *instance);

/**
 * &lt;summary&gt;Helper: create a new instance to deserializing into&lt;/summary&gt;
 */
Packet_ServerEntityPositionAndOrientation *Packet_ServerEntityPositionAndOrientationSerializer_DeserializeLengthDelimitedNew(CitoStream const *stream);

/**
 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
 */
void Packet_ServerEntityPositionAndOrientationSerializer_Serialize(CitoStream const *stream, Packet_ServerEntityPositionAndOrientation const *instance);

/**
 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
 */
void Packet_ServerEntityPositionAndOrientationSerializer_SerializeLengthDelimited(CitoStream const *stream, Packet_ServerEntityPositionAndOrientation const *instance);

/**
 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
 */
unsigned char const *Packet_ServerEntityPositionAndOrientationSerializer_SerializeToBytes(Packet_ServerEntityPositionAndOrientation const *instance);

Packet_ServerEntityPush *Packet_ServerEntityPush_New(void);
void Packet_ServerEntityPush_Delete(Packet_ServerEntityPush *self);

int Packet_ServerEntityPush_GetRangeFloat(Packet_ServerEntityPush const *self);

void Packet_ServerEntityPush_SetRangeFloat(Packet_ServerEntityPush *self, int value);

/**
 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerEntityPush const *Packet_ServerEntityPushSerializer_Deserialize(CitoStream const *stream, Packet_ServerEntityPush *instance);

/**
 * &lt;summary&gt;Helper: put the buffer into a MemoryStream before deserializing&lt;/summary&gt;
 */
Packet_ServerEntityPush const *Packet_ServerEntityPushSerializer_DeserializeBuffer(unsigned char *buffer, int length, Packet_ServerEntityPush *instance);

/**
 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerEntityPush const *Packet_ServerEntityPushSerializer_DeserializeLength(CitoStream const *stream, int length, Packet_ServerEntityPush *instance);

/**
 * &lt;summary&gt;Read the VarInt length prefix and the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerEntityPush const *Packet_ServerEntityPushSerializer_DeserializeLengthDelimited(CitoStream const *stream, Packet_ServerEntityPush *instance);

/**
 * &lt;summary&gt;Helper: create a new instance to deserializing into&lt;/summary&gt;
 */
Packet_ServerEntityPush *Packet_ServerEntityPushSerializer_DeserializeLengthDelimitedNew(CitoStream const *stream);

/**
 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
 */
void Packet_ServerEntityPushSerializer_Serialize(CitoStream const *stream, Packet_ServerEntityPush const *instance);

/**
 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
 */
void Packet_ServerEntityPushSerializer_SerializeLengthDelimited(CitoStream const *stream, Packet_ServerEntityPush const *instance);

/**
 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
 */
unsigned char const *Packet_ServerEntityPushSerializer_SerializeToBytes(Packet_ServerEntityPush const *instance);

/**
 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerEntity const *Packet_ServerEntitySerializer_Deserialize(CitoStream const *stream, Packet_ServerEntity *instance);

/**
 * &lt;summary&gt;Helper: put the buffer into a MemoryStream before deserializing&lt;/summary&gt;
 */
Packet_ServerEntity const *Packet_ServerEntitySerializer_DeserializeBuffer(unsigned char *buffer, int length, Packet_ServerEntity *instance);

/**
 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerEntity const *Packet_ServerEntitySerializer_DeserializeLength(CitoStream const *stream, int length, Packet_ServerEntity *instance);

/**
 * &lt;summary&gt;Read the VarInt length prefix and the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerEntity const *Packet_ServerEntitySerializer_DeserializeLengthDelimited(CitoStream const *stream, Packet_ServerEntity *instance);

/**
 * &lt;summary&gt;Helper: create a new instance to deserializing into&lt;/summary&gt;
 */
Packet_ServerEntity *Packet_ServerEntitySerializer_DeserializeLengthDelimitedNew(CitoStream const *stream);

/**
 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
 */
void Packet_ServerEntitySerializer_Serialize(CitoStream const *stream, Packet_ServerEntity const *instance);

/**
 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
 */
void Packet_ServerEntitySerializer_SerializeLengthDelimited(CitoStream const *stream, Packet_ServerEntity const *instance);

/**
 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
 */
unsigned char const *Packet_ServerEntitySerializer_SerializeToBytes(Packet_ServerEntity const *instance);

Packet_ServerEntitySpawn *Packet_ServerEntitySpawn_New(void);
void Packet_ServerEntitySpawn_Delete(Packet_ServerEntitySpawn *self);

Packet_ServerEntity const *Packet_ServerEntitySpawn_GetEntity_(Packet_ServerEntitySpawn const *self);

int Packet_ServerEntitySpawn_GetId(Packet_ServerEntitySpawn const *self);

void Packet_ServerEntitySpawn_SetEntity_(Packet_ServerEntitySpawn *self, Packet_ServerEntity *value);

void Packet_ServerEntitySpawn_SetId(Packet_ServerEntitySpawn *self, int value);

/**
 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerEntitySpawn const *Packet_ServerEntitySpawnSerializer_Deserialize(CitoStream const *stream, Packet_ServerEntitySpawn *instance);

/**
 * &lt;summary&gt;Helper: put the buffer into a MemoryStream before deserializing&lt;/summary&gt;
 */
Packet_ServerEntitySpawn const *Packet_ServerEntitySpawnSerializer_DeserializeBuffer(unsigned char *buffer, int length, Packet_ServerEntitySpawn *instance);

/**
 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerEntitySpawn const *Packet_ServerEntitySpawnSerializer_DeserializeLength(CitoStream const *stream, int length, Packet_ServerEntitySpawn *instance);

/**
 * &lt;summary&gt;Read the VarInt length prefix and the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerEntitySpawn const *Packet_ServerEntitySpawnSerializer_DeserializeLengthDelimited(CitoStream const *stream, Packet_ServerEntitySpawn *instance);

/**
 * &lt;summary&gt;Helper: create a new instance to deserializing into&lt;/summary&gt;
 */
Packet_ServerEntitySpawn *Packet_ServerEntitySpawnSerializer_DeserializeLengthDelimitedNew(CitoStream const *stream);

/**
 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
 */
void Packet_ServerEntitySpawnSerializer_Serialize(CitoStream const *stream, Packet_ServerEntitySpawn const *instance);

/**
 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
 */
void Packet_ServerEntitySpawnSerializer_SerializeLengthDelimited(CitoStream const *stream, Packet_ServerEntitySpawn const *instance);

/**
 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
 */
unsigned char const *Packet_ServerEntitySpawnSerializer_SerializeToBytes(Packet_ServerEntitySpawn const *instance);

Packet_ServerExplosion *Packet_ServerExplosion_New(void);
void Packet_ServerExplosion_Delete(Packet_ServerExplosion *self);

int Packet_ServerExplosion_GetIsRelativeToPlayerPosition(Packet_ServerExplosion const *self);

int Packet_ServerExplosion_GetRangeFloat(Packet_ServerExplosion const *self);

int Packet_ServerExplosion_GetTimeFloat(Packet_ServerExplosion const *self);

int Packet_ServerExplosion_GetXFloat(Packet_ServerExplosion const *self);

int Packet_ServerExplosion_GetYFloat(Packet_ServerExplosion const *self);

int Packet_ServerExplosion_GetZFloat(Packet_ServerExplosion const *self);

void Packet_ServerExplosion_SetIsRelativeToPlayerPosition(Packet_ServerExplosion *self, int value);

void Packet_ServerExplosion_SetRangeFloat(Packet_ServerExplosion *self, int value);

void Packet_ServerExplosion_SetTimeFloat(Packet_ServerExplosion *self, int value);

void Packet_ServerExplosion_SetXFloat(Packet_ServerExplosion *self, int value);

void Packet_ServerExplosion_SetYFloat(Packet_ServerExplosion *self, int value);

void Packet_ServerExplosion_SetZFloat(Packet_ServerExplosion *self, int value);

/**
 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerExplosion const *Packet_ServerExplosionSerializer_Deserialize(CitoStream const *stream, Packet_ServerExplosion *instance);

/**
 * &lt;summary&gt;Helper: put the buffer into a MemoryStream before deserializing&lt;/summary&gt;
 */
Packet_ServerExplosion const *Packet_ServerExplosionSerializer_DeserializeBuffer(unsigned char *buffer, int length, Packet_ServerExplosion *instance);

/**
 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerExplosion const *Packet_ServerExplosionSerializer_DeserializeLength(CitoStream const *stream, int length, Packet_ServerExplosion *instance);

/**
 * &lt;summary&gt;Read the VarInt length prefix and the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerExplosion const *Packet_ServerExplosionSerializer_DeserializeLengthDelimited(CitoStream const *stream, Packet_ServerExplosion *instance);

/**
 * &lt;summary&gt;Helper: create a new instance to deserializing into&lt;/summary&gt;
 */
Packet_ServerExplosion *Packet_ServerExplosionSerializer_DeserializeLengthDelimitedNew(CitoStream const *stream);

/**
 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
 */
void Packet_ServerExplosionSerializer_Serialize(CitoStream const *stream, Packet_ServerExplosion const *instance);

/**
 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
 */
void Packet_ServerExplosionSerializer_SerializeLengthDelimited(CitoStream const *stream, Packet_ServerExplosion const *instance);

/**
 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
 */
unsigned char const *Packet_ServerExplosionSerializer_SerializeToBytes(Packet_ServerExplosion const *instance);

Packet_ServerFillArea *Packet_ServerFillArea_New(void);
void Packet_ServerFillArea_Delete(Packet_ServerFillArea *self);

int Packet_ServerFillArea_GetBlockCount(Packet_ServerFillArea const *self);

int Packet_ServerFillArea_GetBlockType(Packet_ServerFillArea const *self);

int Packet_ServerFillArea_GetX1(Packet_ServerFillArea const *self);

int Packet_ServerFillArea_GetX2(Packet_ServerFillArea const *self);

int Packet_ServerFillArea_GetY1(Packet_ServerFillArea const *self);

int Packet_ServerFillArea_GetY2(Packet_ServerFillArea const *self);

int Packet_ServerFillArea_GetZ1(Packet_ServerFillArea const *self);

int Packet_ServerFillArea_GetZ2(Packet_ServerFillArea const *self);

void Packet_ServerFillArea_SetBlockCount(Packet_ServerFillArea *self, int value);

void Packet_ServerFillArea_SetBlockType(Packet_ServerFillArea *self, int value);

void Packet_ServerFillArea_SetX1(Packet_ServerFillArea *self, int value);

void Packet_ServerFillArea_SetX2(Packet_ServerFillArea *self, int value);

void Packet_ServerFillArea_SetY1(Packet_ServerFillArea *self, int value);

void Packet_ServerFillArea_SetY2(Packet_ServerFillArea *self, int value);

void Packet_ServerFillArea_SetZ1(Packet_ServerFillArea *self, int value);

void Packet_ServerFillArea_SetZ2(Packet_ServerFillArea *self, int value);

Packet_ServerFillAreaLimit *Packet_ServerFillAreaLimit_New(void);
void Packet_ServerFillAreaLimit_Delete(Packet_ServerFillAreaLimit *self);

int Packet_ServerFillAreaLimit_GetLimit(Packet_ServerFillAreaLimit const *self);

void Packet_ServerFillAreaLimit_SetLimit(Packet_ServerFillAreaLimit *self, int value);

/**
 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerFillAreaLimit const *Packet_ServerFillAreaLimitSerializer_Deserialize(CitoStream const *stream, Packet_ServerFillAreaLimit *instance);

/**
 * &lt;summary&gt;Helper: put the buffer into a MemoryStream before deserializing&lt;/summary&gt;
 */
Packet_ServerFillAreaLimit const *Packet_ServerFillAreaLimitSerializer_DeserializeBuffer(unsigned char *buffer, int length, Packet_ServerFillAreaLimit *instance);

/**
 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerFillAreaLimit const *Packet_ServerFillAreaLimitSerializer_DeserializeLength(CitoStream const *stream, int length, Packet_ServerFillAreaLimit *instance);

/**
 * &lt;summary&gt;Read the VarInt length prefix and the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerFillAreaLimit const *Packet_ServerFillAreaLimitSerializer_DeserializeLengthDelimited(CitoStream const *stream, Packet_ServerFillAreaLimit *instance);

/**
 * &lt;summary&gt;Helper: create a new instance to deserializing into&lt;/summary&gt;
 */
Packet_ServerFillAreaLimit *Packet_ServerFillAreaLimitSerializer_DeserializeLengthDelimitedNew(CitoStream const *stream);

/**
 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
 */
void Packet_ServerFillAreaLimitSerializer_Serialize(CitoStream const *stream, Packet_ServerFillAreaLimit const *instance);

/**
 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
 */
void Packet_ServerFillAreaLimitSerializer_SerializeLengthDelimited(CitoStream const *stream, Packet_ServerFillAreaLimit const *instance);

/**
 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
 */
unsigned char const *Packet_ServerFillAreaLimitSerializer_SerializeToBytes(Packet_ServerFillAreaLimit const *instance);

/**
 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerFillArea const *Packet_ServerFillAreaSerializer_Deserialize(CitoStream const *stream, Packet_ServerFillArea *instance);

/**
 * &lt;summary&gt;Helper: put the buffer into a MemoryStream before deserializing&lt;/summary&gt;
 */
Packet_ServerFillArea const *Packet_ServerFillAreaSerializer_DeserializeBuffer(unsigned char *buffer, int length, Packet_ServerFillArea *instance);

/**
 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerFillArea const *Packet_ServerFillAreaSerializer_DeserializeLength(CitoStream const *stream, int length, Packet_ServerFillArea *instance);

/**
 * &lt;summary&gt;Read the VarInt length prefix and the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerFillArea const *Packet_ServerFillAreaSerializer_DeserializeLengthDelimited(CitoStream const *stream, Packet_ServerFillArea *instance);

/**
 * &lt;summary&gt;Helper: create a new instance to deserializing into&lt;/summary&gt;
 */
Packet_ServerFillArea *Packet_ServerFillAreaSerializer_DeserializeLengthDelimitedNew(CitoStream const *stream);

/**
 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
 */
void Packet_ServerFillAreaSerializer_Serialize(CitoStream const *stream, Packet_ServerFillArea const *instance);

/**
 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
 */
void Packet_ServerFillAreaSerializer_SerializeLengthDelimited(CitoStream const *stream, Packet_ServerFillArea const *instance);

/**
 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
 */
unsigned char const *Packet_ServerFillAreaSerializer_SerializeToBytes(Packet_ServerFillArea const *instance);

Packet_ServerFollow *Packet_ServerFollow_New(void);
void Packet_ServerFollow_Delete(Packet_ServerFollow *self);

const char *Packet_ServerFollow_GetClient(Packet_ServerFollow const *self);

int Packet_ServerFollow_GetTpp(Packet_ServerFollow const *self);

void Packet_ServerFollow_SetClient(Packet_ServerFollow *self, const char *value);

void Packet_ServerFollow_SetTpp(Packet_ServerFollow *self, int value);

/**
 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerFollow const *Packet_ServerFollowSerializer_Deserialize(CitoStream const *stream, Packet_ServerFollow *instance);

/**
 * &lt;summary&gt;Helper: put the buffer into a MemoryStream before deserializing&lt;/summary&gt;
 */
Packet_ServerFollow const *Packet_ServerFollowSerializer_DeserializeBuffer(unsigned char *buffer, int length, Packet_ServerFollow *instance);

/**
 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerFollow const *Packet_ServerFollowSerializer_DeserializeLength(CitoStream const *stream, int length, Packet_ServerFollow *instance);

/**
 * &lt;summary&gt;Read the VarInt length prefix and the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerFollow const *Packet_ServerFollowSerializer_DeserializeLengthDelimited(CitoStream const *stream, Packet_ServerFollow *instance);

/**
 * &lt;summary&gt;Helper: create a new instance to deserializing into&lt;/summary&gt;
 */
Packet_ServerFollow *Packet_ServerFollowSerializer_DeserializeLengthDelimitedNew(CitoStream const *stream);

/**
 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
 */
void Packet_ServerFollowSerializer_Serialize(CitoStream const *stream, Packet_ServerFollow const *instance);

/**
 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
 */
void Packet_ServerFollowSerializer_SerializeLengthDelimited(CitoStream const *stream, Packet_ServerFollow const *instance);

/**
 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
 */
unsigned char const *Packet_ServerFollowSerializer_SerializeToBytes(Packet_ServerFollow const *instance);

Packet_ServerFreemove *Packet_ServerFreemove_New(void);
void Packet_ServerFreemove_Delete(Packet_ServerFreemove *self);

int Packet_ServerFreemove_GetIsEnabled(Packet_ServerFreemove const *self);

void Packet_ServerFreemove_SetIsEnabled(Packet_ServerFreemove *self, int value);

/**
 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerFreemove const *Packet_ServerFreemoveSerializer_Deserialize(CitoStream const *stream, Packet_ServerFreemove *instance);

/**
 * &lt;summary&gt;Helper: put the buffer into a MemoryStream before deserializing&lt;/summary&gt;
 */
Packet_ServerFreemove const *Packet_ServerFreemoveSerializer_DeserializeBuffer(unsigned char *buffer, int length, Packet_ServerFreemove *instance);

/**
 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerFreemove const *Packet_ServerFreemoveSerializer_DeserializeLength(CitoStream const *stream, int length, Packet_ServerFreemove *instance);

/**
 * &lt;summary&gt;Read the VarInt length prefix and the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerFreemove const *Packet_ServerFreemoveSerializer_DeserializeLengthDelimited(CitoStream const *stream, Packet_ServerFreemove *instance);

/**
 * &lt;summary&gt;Helper: create a new instance to deserializing into&lt;/summary&gt;
 */
Packet_ServerFreemove *Packet_ServerFreemoveSerializer_DeserializeLengthDelimitedNew(CitoStream const *stream);

/**
 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
 */
void Packet_ServerFreemoveSerializer_Serialize(CitoStream const *stream, Packet_ServerFreemove const *instance);

/**
 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
 */
void Packet_ServerFreemoveSerializer_SerializeLengthDelimited(CitoStream const *stream, Packet_ServerFreemove const *instance);

/**
 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
 */
unsigned char const *Packet_ServerFreemoveSerializer_SerializeToBytes(Packet_ServerFreemove const *instance);

Packet_ServerHeightmapChunk *Packet_ServerHeightmapChunk_New(void);
void Packet_ServerHeightmapChunk_Delete(Packet_ServerHeightmapChunk *self);

unsigned char const *Packet_ServerHeightmapChunk_GetCompressedHeightmap(Packet_ServerHeightmapChunk const *self);

int Packet_ServerHeightmapChunk_GetSizeX(Packet_ServerHeightmapChunk const *self);

int Packet_ServerHeightmapChunk_GetSizeY(Packet_ServerHeightmapChunk const *self);

int Packet_ServerHeightmapChunk_GetX(Packet_ServerHeightmapChunk const *self);

int Packet_ServerHeightmapChunk_GetY(Packet_ServerHeightmapChunk const *self);

void Packet_ServerHeightmapChunk_SetCompressedHeightmap(Packet_ServerHeightmapChunk *self, unsigned char const *value);

void Packet_ServerHeightmapChunk_SetSizeX(Packet_ServerHeightmapChunk *self, int value);

void Packet_ServerHeightmapChunk_SetSizeY(Packet_ServerHeightmapChunk *self, int value);

void Packet_ServerHeightmapChunk_SetX(Packet_ServerHeightmapChunk *self, int value);

void Packet_ServerHeightmapChunk_SetY(Packet_ServerHeightmapChunk *self, int value);

/**
 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerHeightmapChunk const *Packet_ServerHeightmapChunkSerializer_Deserialize(CitoStream const *stream, Packet_ServerHeightmapChunk *instance);

/**
 * &lt;summary&gt;Helper: put the buffer into a MemoryStream before deserializing&lt;/summary&gt;
 */
Packet_ServerHeightmapChunk const *Packet_ServerHeightmapChunkSerializer_DeserializeBuffer(unsigned char *buffer, int length, Packet_ServerHeightmapChunk *instance);

/**
 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerHeightmapChunk const *Packet_ServerHeightmapChunkSerializer_DeserializeLength(CitoStream const *stream, int length, Packet_ServerHeightmapChunk *instance);

/**
 * &lt;summary&gt;Read the VarInt length prefix and the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerHeightmapChunk const *Packet_ServerHeightmapChunkSerializer_DeserializeLengthDelimited(CitoStream const *stream, Packet_ServerHeightmapChunk *instance);

/**
 * &lt;summary&gt;Helper: create a new instance to deserializing into&lt;/summary&gt;
 */
Packet_ServerHeightmapChunk *Packet_ServerHeightmapChunkSerializer_DeserializeLengthDelimitedNew(CitoStream const *stream);

/**
 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
 */
void Packet_ServerHeightmapChunkSerializer_Serialize(CitoStream const *stream, Packet_ServerHeightmapChunk const *instance);

/**
 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
 */
void Packet_ServerHeightmapChunkSerializer_SerializeLengthDelimited(CitoStream const *stream, Packet_ServerHeightmapChunk const *instance);

/**
 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
 */
unsigned char const *Packet_ServerHeightmapChunkSerializer_SerializeToBytes(Packet_ServerHeightmapChunk const *instance);

#define Packet_ServerIdEnum_ACTIVE_MONSTERS  25

#define Packet_ServerIdEnum_AMMO  55

#define Packet_ServerIdEnum_BLOB_FINALIZE  20

#define Packet_ServerIdEnum_BLOB_INITIALIZE  18

#define Packet_ServerIdEnum_BLOB_PART  19

#define Packet_ServerIdEnum_BLOCK_TYPE  56

#define Packet_ServerIdEnum_BLOCK_TYPES  27

#define Packet_ServerIdEnum_BULLET  54

#define Packet_ServerIdEnum_CHUNK_PART  57

#define Packet_ServerIdEnum_CHUNK_  15

#define Packet_ServerIdEnum_CRAFTING_RECIPES  30

#define Packet_ServerIdEnum_DIALOG  52

#define Packet_ServerIdEnum_DISCONNECT_PLAYER  14

#define Packet_ServerIdEnum_ENTITY_DESPAWN  68

#define Packet_ServerIdEnum_ENTITY_POSITION  67

#define Packet_ServerIdEnum_ENTITY_SPAWN  66

#define Packet_ServerIdEnum_EXPLOSION  58

#define Packet_ServerIdEnum_EXTENDED_PACKET_COMMAND  100

#define Packet_ServerIdEnum_EXTENDED_PACKET_TICK  101

#define Packet_ServerIdEnum_FILL_AREA  61

#define Packet_ServerIdEnum_FILL_AREA_LIMIT  62

#define Packet_ServerIdEnum_FINITE_INVENTORY  16

#define Packet_ServerIdEnum_FOLLOW  53

#define Packet_ServerIdEnum_FREEMOVE  51

#define Packet_ServerIdEnum_HEIGHTMAP_CHUNK  21

#define Packet_ServerIdEnum_LEVEL_DATA_CHUNK  3

#define Packet_ServerIdEnum_LEVEL_FINALIZE  4

#define Packet_ServerIdEnum_LEVEL_INITIALIZE  2

#define Packet_ServerIdEnum_LIGHT_LEVELS  29

#define Packet_ServerIdEnum_MESSAGE  13

#define Packet_ServerIdEnum_MONSTER  24

#define Packet_ServerIdEnum_PING  1

#define Packet_ServerIdEnum_PLAYER_PING  111

#define Packet_ServerIdEnum_PLAYER_SPAWN_POSITION  26

#define Packet_ServerIdEnum_PLAYER_STATS  23

#define Packet_ServerIdEnum_PROJECTILE  59

#define Packet_ServerIdEnum_QUERY_ANSWER  64

#define Packet_ServerIdEnum_REMOVE_MONSTERS  50

#define Packet_ServerIdEnum_SEASON  17

#define Packet_ServerIdEnum_SERVER_IDENTIFICATION  0

#define Packet_ServerIdEnum_SERVER_REDIRECT  65

#define Packet_ServerIdEnum_SET_BLOCK  6

#define Packet_ServerIdEnum_SOUND  22

#define Packet_ServerIdEnum_SUN_LEVELS  28

#define Packet_ServerIdEnum_TRANSLATION  60

Packet_ServerIdentification *Packet_ServerIdentification_New(void);
void Packet_ServerIdentification_Delete(Packet_ServerIdentification *self);

int Packet_ServerIdentification_GetAssignedClientId(Packet_ServerIdentification const *self);

int Packet_ServerIdentification_GetDisableShadows(Packet_ServerIdentification const *self);

int Packet_ServerIdentification_GetMapSizeX(Packet_ServerIdentification const *self);

int Packet_ServerIdentification_GetMapSizeY(Packet_ServerIdentification const *self);

int Packet_ServerIdentification_GetMapSizeZ(Packet_ServerIdentification const *self);

const char *Packet_ServerIdentification_GetMdProtocolVersion(Packet_ServerIdentification const *self);

int Packet_ServerIdentification_GetPlayerAreaSize(Packet_ServerIdentification const *self);

int Packet_ServerIdentification_GetRenderHint_(Packet_ServerIdentification const *self);

Packet_StringList const *Packet_ServerIdentification_GetRequiredBlobMd5(Packet_ServerIdentification const *self);

Packet_StringList const *Packet_ServerIdentification_GetRequiredBlobName(Packet_ServerIdentification const *self);

const char *Packet_ServerIdentification_GetServerMotd(Packet_ServerIdentification const *self);

const char *Packet_ServerIdentification_GetServerName(Packet_ServerIdentification const *self);

void Packet_ServerIdentification_SetAssignedClientId(Packet_ServerIdentification *self, int value);

void Packet_ServerIdentification_SetDisableShadows(Packet_ServerIdentification *self, int value);

void Packet_ServerIdentification_SetMapSizeX(Packet_ServerIdentification *self, int value);

void Packet_ServerIdentification_SetMapSizeY(Packet_ServerIdentification *self, int value);

void Packet_ServerIdentification_SetMapSizeZ(Packet_ServerIdentification *self, int value);

void Packet_ServerIdentification_SetMdProtocolVersion(Packet_ServerIdentification *self, const char *value);

void Packet_ServerIdentification_SetPlayerAreaSize(Packet_ServerIdentification *self, int value);

void Packet_ServerIdentification_SetRenderHint_(Packet_ServerIdentification *self, int value);

void Packet_ServerIdentification_SetRequiredBlobMd5(Packet_ServerIdentification *self, Packet_StringList *value);

void Packet_ServerIdentification_SetRequiredBlobName(Packet_ServerIdentification *self, Packet_StringList *value);

void Packet_ServerIdentification_SetServerMotd(Packet_ServerIdentification *self, const char *value);

void Packet_ServerIdentification_SetServerName(Packet_ServerIdentification *self, const char *value);

/**
 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerIdentification const *Packet_ServerIdentificationSerializer_Deserialize(CitoStream const *stream, Packet_ServerIdentification *instance);

/**
 * &lt;summary&gt;Helper: put the buffer into a MemoryStream before deserializing&lt;/summary&gt;
 */
Packet_ServerIdentification const *Packet_ServerIdentificationSerializer_DeserializeBuffer(unsigned char *buffer, int length, Packet_ServerIdentification *instance);

/**
 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerIdentification const *Packet_ServerIdentificationSerializer_DeserializeLength(CitoStream const *stream, int length, Packet_ServerIdentification *instance);

/**
 * &lt;summary&gt;Read the VarInt length prefix and the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerIdentification const *Packet_ServerIdentificationSerializer_DeserializeLengthDelimited(CitoStream const *stream, Packet_ServerIdentification *instance);

/**
 * &lt;summary&gt;Helper: create a new instance to deserializing into&lt;/summary&gt;
 */
Packet_ServerIdentification *Packet_ServerIdentificationSerializer_DeserializeLengthDelimitedNew(CitoStream const *stream);

/**
 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
 */
void Packet_ServerIdentificationSerializer_Serialize(CitoStream const *stream, Packet_ServerIdentification const *instance);

/**
 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
 */
void Packet_ServerIdentificationSerializer_SerializeLengthDelimited(CitoStream const *stream, Packet_ServerIdentification const *instance);

/**
 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
 */
unsigned char const *Packet_ServerIdentificationSerializer_SerializeToBytes(Packet_ServerIdentification const *instance);

Packet_ServerInventory *Packet_ServerInventory_New(void);
void Packet_ServerInventory_Delete(Packet_ServerInventory *self);

Packet_Inventory const *Packet_ServerInventory_GetInventory(Packet_ServerInventory const *self);

void Packet_ServerInventory_SetInventory(Packet_ServerInventory *self, Packet_Inventory *value);

/**
 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerInventory const *Packet_ServerInventorySerializer_Deserialize(CitoStream const *stream, Packet_ServerInventory *instance);

/**
 * &lt;summary&gt;Helper: put the buffer into a MemoryStream before deserializing&lt;/summary&gt;
 */
Packet_ServerInventory const *Packet_ServerInventorySerializer_DeserializeBuffer(unsigned char *buffer, int length, Packet_ServerInventory *instance);

/**
 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerInventory const *Packet_ServerInventorySerializer_DeserializeLength(CitoStream const *stream, int length, Packet_ServerInventory *instance);

/**
 * &lt;summary&gt;Read the VarInt length prefix and the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerInventory const *Packet_ServerInventorySerializer_DeserializeLengthDelimited(CitoStream const *stream, Packet_ServerInventory *instance);

/**
 * &lt;summary&gt;Helper: create a new instance to deserializing into&lt;/summary&gt;
 */
Packet_ServerInventory *Packet_ServerInventorySerializer_DeserializeLengthDelimitedNew(CitoStream const *stream);

/**
 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
 */
void Packet_ServerInventorySerializer_Serialize(CitoStream const *stream, Packet_ServerInventory const *instance);

/**
 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
 */
void Packet_ServerInventorySerializer_SerializeLengthDelimited(CitoStream const *stream, Packet_ServerInventory const *instance);

/**
 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
 */
unsigned char const *Packet_ServerInventorySerializer_SerializeToBytes(Packet_ServerInventory const *instance);

/**
 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerLevelFinalize const *Packet_ServerLevelFinalizeSerializer_Deserialize(CitoStream const *stream, Packet_ServerLevelFinalize const *instance);

/**
 * &lt;summary&gt;Helper: put the buffer into a MemoryStream before deserializing&lt;/summary&gt;
 */
Packet_ServerLevelFinalize const *Packet_ServerLevelFinalizeSerializer_DeserializeBuffer(unsigned char *buffer, int length, Packet_ServerLevelFinalize const *instance);

/**
 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerLevelFinalize const *Packet_ServerLevelFinalizeSerializer_DeserializeLength(CitoStream const *stream, int length, Packet_ServerLevelFinalize const *instance);

/**
 * &lt;summary&gt;Read the VarInt length prefix and the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerLevelFinalize const *Packet_ServerLevelFinalizeSerializer_DeserializeLengthDelimited(CitoStream const *stream, Packet_ServerLevelFinalize const *instance);

/**
 * &lt;summary&gt;Helper: create a new instance to deserializing into&lt;/summary&gt;
 */
Packet_ServerLevelFinalize const *Packet_ServerLevelFinalizeSerializer_DeserializeLengthDelimitedNew(CitoStream const *stream);

/**
 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
 */
void Packet_ServerLevelFinalizeSerializer_Serialize(CitoStream const *stream, Packet_ServerLevelFinalize const *instance);

/**
 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
 */
void Packet_ServerLevelFinalizeSerializer_SerializeLengthDelimited(CitoStream const *stream, Packet_ServerLevelFinalize const *instance);

/**
 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
 */
unsigned char const *Packet_ServerLevelFinalizeSerializer_SerializeToBytes(Packet_ServerLevelFinalize const *instance);

/**
 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerLevelInitialize const *Packet_ServerLevelInitializeSerializer_Deserialize(CitoStream const *stream, Packet_ServerLevelInitialize const *instance);

/**
 * &lt;summary&gt;Helper: put the buffer into a MemoryStream before deserializing&lt;/summary&gt;
 */
Packet_ServerLevelInitialize const *Packet_ServerLevelInitializeSerializer_DeserializeBuffer(unsigned char *buffer, int length, Packet_ServerLevelInitialize const *instance);

/**
 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerLevelInitialize const *Packet_ServerLevelInitializeSerializer_DeserializeLength(CitoStream const *stream, int length, Packet_ServerLevelInitialize const *instance);

/**
 * &lt;summary&gt;Read the VarInt length prefix and the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerLevelInitialize const *Packet_ServerLevelInitializeSerializer_DeserializeLengthDelimited(CitoStream const *stream, Packet_ServerLevelInitialize const *instance);

/**
 * &lt;summary&gt;Helper: create a new instance to deserializing into&lt;/summary&gt;
 */
Packet_ServerLevelInitialize const *Packet_ServerLevelInitializeSerializer_DeserializeLengthDelimitedNew(CitoStream const *stream);

/**
 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
 */
void Packet_ServerLevelInitializeSerializer_Serialize(CitoStream const *stream, Packet_ServerLevelInitialize const *instance);

/**
 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
 */
void Packet_ServerLevelInitializeSerializer_SerializeLengthDelimited(CitoStream const *stream, Packet_ServerLevelInitialize const *instance);

/**
 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
 */
unsigned char const *Packet_ServerLevelInitializeSerializer_SerializeToBytes(Packet_ServerLevelInitialize const *instance);

Packet_ServerLevelProgress *Packet_ServerLevelProgress_New(void);
void Packet_ServerLevelProgress_Delete(Packet_ServerLevelProgress *self);

int Packet_ServerLevelProgress_GetPercentComplete(Packet_ServerLevelProgress const *self);

int Packet_ServerLevelProgress_GetPercentCompleteSubitem(Packet_ServerLevelProgress const *self);

const char *Packet_ServerLevelProgress_GetStatus(Packet_ServerLevelProgress const *self);

void Packet_ServerLevelProgress_SetPercentComplete(Packet_ServerLevelProgress *self, int value);

void Packet_ServerLevelProgress_SetPercentCompleteSubitem(Packet_ServerLevelProgress *self, int value);

void Packet_ServerLevelProgress_SetStatus(Packet_ServerLevelProgress *self, const char *value);

/**
 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerLevelProgress const *Packet_ServerLevelProgressSerializer_Deserialize(CitoStream const *stream, Packet_ServerLevelProgress *instance);

/**
 * &lt;summary&gt;Helper: put the buffer into a MemoryStream before deserializing&lt;/summary&gt;
 */
Packet_ServerLevelProgress const *Packet_ServerLevelProgressSerializer_DeserializeBuffer(unsigned char *buffer, int length, Packet_ServerLevelProgress *instance);

/**
 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerLevelProgress const *Packet_ServerLevelProgressSerializer_DeserializeLength(CitoStream const *stream, int length, Packet_ServerLevelProgress *instance);

/**
 * &lt;summary&gt;Read the VarInt length prefix and the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerLevelProgress const *Packet_ServerLevelProgressSerializer_DeserializeLengthDelimited(CitoStream const *stream, Packet_ServerLevelProgress *instance);

/**
 * &lt;summary&gt;Helper: create a new instance to deserializing into&lt;/summary&gt;
 */
Packet_ServerLevelProgress *Packet_ServerLevelProgressSerializer_DeserializeLengthDelimitedNew(CitoStream const *stream);

/**
 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
 */
void Packet_ServerLevelProgressSerializer_Serialize(CitoStream const *stream, Packet_ServerLevelProgress const *instance);

/**
 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
 */
void Packet_ServerLevelProgressSerializer_SerializeLengthDelimited(CitoStream const *stream, Packet_ServerLevelProgress const *instance);

/**
 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
 */
unsigned char const *Packet_ServerLevelProgressSerializer_SerializeToBytes(Packet_ServerLevelProgress const *instance);

Packet_ServerLightLevels *Packet_ServerLightLevels_New(void);
void Packet_ServerLightLevels_Delete(Packet_ServerLightLevels *self);

int const *Packet_ServerLightLevels_GetLightlevels(Packet_ServerLightLevels const *self);

int Packet_ServerLightLevels_GetLightlevelsCount(Packet_ServerLightLevels const *self);

int Packet_ServerLightLevels_GetLightlevelsLength(Packet_ServerLightLevels const *self);

void Packet_ServerLightLevels_LightlevelsAdd(Packet_ServerLightLevels *self, int value);

void Packet_ServerLightLevels_SetLightlevels(Packet_ServerLightLevels *self, int *value, int count, int length);

/**
 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerLightLevels const *Packet_ServerLightLevelsSerializer_Deserialize(CitoStream const *stream, Packet_ServerLightLevels *instance);

/**
 * &lt;summary&gt;Helper: put the buffer into a MemoryStream before deserializing&lt;/summary&gt;
 */
Packet_ServerLightLevels const *Packet_ServerLightLevelsSerializer_DeserializeBuffer(unsigned char *buffer, int length, Packet_ServerLightLevels *instance);

/**
 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerLightLevels const *Packet_ServerLightLevelsSerializer_DeserializeLength(CitoStream const *stream, int length, Packet_ServerLightLevels *instance);

/**
 * &lt;summary&gt;Read the VarInt length prefix and the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerLightLevels const *Packet_ServerLightLevelsSerializer_DeserializeLengthDelimited(CitoStream const *stream, Packet_ServerLightLevels *instance);

/**
 * &lt;summary&gt;Helper: create a new instance to deserializing into&lt;/summary&gt;
 */
Packet_ServerLightLevels *Packet_ServerLightLevelsSerializer_DeserializeLengthDelimitedNew(CitoStream const *stream);

/**
 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
 */
void Packet_ServerLightLevelsSerializer_Serialize(CitoStream const *stream, Packet_ServerLightLevels const *instance);

/**
 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
 */
void Packet_ServerLightLevelsSerializer_SerializeLengthDelimited(CitoStream const *stream, Packet_ServerLightLevels const *instance);

/**
 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
 */
unsigned char const *Packet_ServerLightLevelsSerializer_SerializeToBytes(Packet_ServerLightLevels const *instance);

Packet_ServerMessage *Packet_ServerMessage_New(void);
void Packet_ServerMessage_Delete(Packet_ServerMessage *self);

const char *Packet_ServerMessage_GetMessage(Packet_ServerMessage const *self);

void Packet_ServerMessage_SetMessage(Packet_ServerMessage *self, const char *value);

/**
 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerMessage const *Packet_ServerMessageSerializer_Deserialize(CitoStream const *stream, Packet_ServerMessage *instance);

/**
 * &lt;summary&gt;Helper: put the buffer into a MemoryStream before deserializing&lt;/summary&gt;
 */
Packet_ServerMessage const *Packet_ServerMessageSerializer_DeserializeBuffer(unsigned char *buffer, int length, Packet_ServerMessage *instance);

/**
 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerMessage const *Packet_ServerMessageSerializer_DeserializeLength(CitoStream const *stream, int length, Packet_ServerMessage *instance);

/**
 * &lt;summary&gt;Read the VarInt length prefix and the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerMessage const *Packet_ServerMessageSerializer_DeserializeLengthDelimited(CitoStream const *stream, Packet_ServerMessage *instance);

/**
 * &lt;summary&gt;Helper: create a new instance to deserializing into&lt;/summary&gt;
 */
Packet_ServerMessage *Packet_ServerMessageSerializer_DeserializeLengthDelimitedNew(CitoStream const *stream);

/**
 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
 */
void Packet_ServerMessageSerializer_Serialize(CitoStream const *stream, Packet_ServerMessage const *instance);

/**
 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
 */
void Packet_ServerMessageSerializer_SerializeLengthDelimited(CitoStream const *stream, Packet_ServerMessage const *instance);

/**
 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
 */
unsigned char const *Packet_ServerMessageSerializer_SerializeToBytes(Packet_ServerMessage const *instance);

Packet_ServerMonster *Packet_ServerMonster_New(void);
void Packet_ServerMonster_Delete(Packet_ServerMonster *self);

int Packet_ServerMonster_GetHealth(Packet_ServerMonster const *self);

int Packet_ServerMonster_GetId(Packet_ServerMonster const *self);

int Packet_ServerMonster_GetMonsterType(Packet_ServerMonster const *self);

Packet_PositionAndOrientation const *Packet_ServerMonster_GetPositionAndOrientation(Packet_ServerMonster const *self);

void Packet_ServerMonster_SetHealth(Packet_ServerMonster *self, int value);

void Packet_ServerMonster_SetId(Packet_ServerMonster *self, int value);

void Packet_ServerMonster_SetMonsterType(Packet_ServerMonster *self, int value);

void Packet_ServerMonster_SetPositionAndOrientation(Packet_ServerMonster *self, Packet_PositionAndOrientation *value);

/**
 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerMonster const *Packet_ServerMonsterSerializer_Deserialize(CitoStream const *stream, Packet_ServerMonster *instance);

/**
 * &lt;summary&gt;Helper: put the buffer into a MemoryStream before deserializing&lt;/summary&gt;
 */
Packet_ServerMonster const *Packet_ServerMonsterSerializer_DeserializeBuffer(unsigned char *buffer, int length, Packet_ServerMonster *instance);

/**
 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerMonster const *Packet_ServerMonsterSerializer_DeserializeLength(CitoStream const *stream, int length, Packet_ServerMonster *instance);

/**
 * &lt;summary&gt;Read the VarInt length prefix and the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerMonster const *Packet_ServerMonsterSerializer_DeserializeLengthDelimited(CitoStream const *stream, Packet_ServerMonster *instance);

/**
 * &lt;summary&gt;Helper: create a new instance to deserializing into&lt;/summary&gt;
 */
Packet_ServerMonster const *Packet_ServerMonsterSerializer_DeserializeLengthDelimitedNew(CitoStream const *stream);

/**
 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
 */
void Packet_ServerMonsterSerializer_Serialize(CitoStream const *stream, Packet_ServerMonster const *instance);

/**
 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
 */
void Packet_ServerMonsterSerializer_SerializeLengthDelimited(CitoStream const *stream, Packet_ServerMonster const *instance);

/**
 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
 */
unsigned char const *Packet_ServerMonsterSerializer_SerializeToBytes(Packet_ServerMonster const *instance);

Packet_ServerMonsters *Packet_ServerMonsters_New(void);
void Packet_ServerMonsters_Delete(Packet_ServerMonsters *self);

Packet_ServerMonster const *const *Packet_ServerMonsters_GetMonsters(Packet_ServerMonsters const *self);

int Packet_ServerMonsters_GetMonstersCount(Packet_ServerMonsters const *self);

int Packet_ServerMonsters_GetMonstersLength(Packet_ServerMonsters const *self);

void Packet_ServerMonsters_MonstersAdd(Packet_ServerMonsters *self, Packet_ServerMonster const *value);

void Packet_ServerMonsters_SetMonsters(Packet_ServerMonsters *self, Packet_ServerMonster const **value, int count, int length);

/**
 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerMonsters const *Packet_ServerMonstersSerializer_Deserialize(CitoStream const *stream, Packet_ServerMonsters *instance);

/**
 * &lt;summary&gt;Helper: put the buffer into a MemoryStream before deserializing&lt;/summary&gt;
 */
Packet_ServerMonsters const *Packet_ServerMonstersSerializer_DeserializeBuffer(unsigned char *buffer, int length, Packet_ServerMonsters *instance);

/**
 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerMonsters const *Packet_ServerMonstersSerializer_DeserializeLength(CitoStream const *stream, int length, Packet_ServerMonsters *instance);

/**
 * &lt;summary&gt;Read the VarInt length prefix and the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerMonsters const *Packet_ServerMonstersSerializer_DeserializeLengthDelimited(CitoStream const *stream, Packet_ServerMonsters *instance);

/**
 * &lt;summary&gt;Helper: create a new instance to deserializing into&lt;/summary&gt;
 */
Packet_ServerMonsters *Packet_ServerMonstersSerializer_DeserializeLengthDelimitedNew(CitoStream const *stream);

/**
 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
 */
void Packet_ServerMonstersSerializer_Serialize(CitoStream const *stream, Packet_ServerMonsters const *instance);

/**
 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
 */
void Packet_ServerMonstersSerializer_SerializeLengthDelimited(CitoStream const *stream, Packet_ServerMonsters const *instance);

/**
 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
 */
unsigned char const *Packet_ServerMonstersSerializer_SerializeToBytes(Packet_ServerMonsters const *instance);

/**
 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerPing const *Packet_ServerPingSerializer_Deserialize(CitoStream const *stream, Packet_ServerPing const *instance);

/**
 * &lt;summary&gt;Helper: put the buffer into a MemoryStream before deserializing&lt;/summary&gt;
 */
Packet_ServerPing const *Packet_ServerPingSerializer_DeserializeBuffer(unsigned char *buffer, int length, Packet_ServerPing const *instance);

/**
 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerPing const *Packet_ServerPingSerializer_DeserializeLength(CitoStream const *stream, int length, Packet_ServerPing const *instance);

/**
 * &lt;summary&gt;Read the VarInt length prefix and the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerPing const *Packet_ServerPingSerializer_DeserializeLengthDelimited(CitoStream const *stream, Packet_ServerPing const *instance);

/**
 * &lt;summary&gt;Helper: create a new instance to deserializing into&lt;/summary&gt;
 */
Packet_ServerPing const *Packet_ServerPingSerializer_DeserializeLengthDelimitedNew(CitoStream const *stream);

/**
 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
 */
void Packet_ServerPingSerializer_Serialize(CitoStream const *stream, Packet_ServerPing const *instance);

/**
 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
 */
void Packet_ServerPingSerializer_SerializeLengthDelimited(CitoStream const *stream, Packet_ServerPing const *instance);

/**
 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
 */
unsigned char const *Packet_ServerPingSerializer_SerializeToBytes(Packet_ServerPing const *instance);

Packet_ServerPlayerPing *Packet_ServerPlayerPing_New(void);
void Packet_ServerPlayerPing_Delete(Packet_ServerPlayerPing *self);

int Packet_ServerPlayerPing_GetClientId(Packet_ServerPlayerPing const *self);

int Packet_ServerPlayerPing_GetPing(Packet_ServerPlayerPing const *self);

void Packet_ServerPlayerPing_SetClientId(Packet_ServerPlayerPing *self, int value);

void Packet_ServerPlayerPing_SetPing(Packet_ServerPlayerPing *self, int value);

/**
 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerPlayerPing const *Packet_ServerPlayerPingSerializer_Deserialize(CitoStream const *stream, Packet_ServerPlayerPing *instance);

/**
 * &lt;summary&gt;Helper: put the buffer into a MemoryStream before deserializing&lt;/summary&gt;
 */
Packet_ServerPlayerPing const *Packet_ServerPlayerPingSerializer_DeserializeBuffer(unsigned char *buffer, int length, Packet_ServerPlayerPing *instance);

/**
 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerPlayerPing const *Packet_ServerPlayerPingSerializer_DeserializeLength(CitoStream const *stream, int length, Packet_ServerPlayerPing *instance);

/**
 * &lt;summary&gt;Read the VarInt length prefix and the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerPlayerPing const *Packet_ServerPlayerPingSerializer_DeserializeLengthDelimited(CitoStream const *stream, Packet_ServerPlayerPing *instance);

/**
 * &lt;summary&gt;Helper: create a new instance to deserializing into&lt;/summary&gt;
 */
Packet_ServerPlayerPing *Packet_ServerPlayerPingSerializer_DeserializeLengthDelimitedNew(CitoStream const *stream);

/**
 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
 */
void Packet_ServerPlayerPingSerializer_Serialize(CitoStream const *stream, Packet_ServerPlayerPing const *instance);

/**
 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
 */
void Packet_ServerPlayerPingSerializer_SerializeLengthDelimited(CitoStream const *stream, Packet_ServerPlayerPing const *instance);

/**
 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
 */
unsigned char const *Packet_ServerPlayerPingSerializer_SerializeToBytes(Packet_ServerPlayerPing const *instance);

Packet_ServerPlayerSpawnPosition *Packet_ServerPlayerSpawnPosition_New(void);
void Packet_ServerPlayerSpawnPosition_Delete(Packet_ServerPlayerSpawnPosition *self);

int Packet_ServerPlayerSpawnPosition_GetX(Packet_ServerPlayerSpawnPosition const *self);

int Packet_ServerPlayerSpawnPosition_GetY(Packet_ServerPlayerSpawnPosition const *self);

int Packet_ServerPlayerSpawnPosition_GetZ(Packet_ServerPlayerSpawnPosition const *self);

void Packet_ServerPlayerSpawnPosition_SetX(Packet_ServerPlayerSpawnPosition *self, int value);

void Packet_ServerPlayerSpawnPosition_SetY(Packet_ServerPlayerSpawnPosition *self, int value);

void Packet_ServerPlayerSpawnPosition_SetZ(Packet_ServerPlayerSpawnPosition *self, int value);

/**
 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerPlayerSpawnPosition const *Packet_ServerPlayerSpawnPositionSerializer_Deserialize(CitoStream const *stream, Packet_ServerPlayerSpawnPosition *instance);

/**
 * &lt;summary&gt;Helper: put the buffer into a MemoryStream before deserializing&lt;/summary&gt;
 */
Packet_ServerPlayerSpawnPosition const *Packet_ServerPlayerSpawnPositionSerializer_DeserializeBuffer(unsigned char *buffer, int length, Packet_ServerPlayerSpawnPosition *instance);

/**
 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerPlayerSpawnPosition const *Packet_ServerPlayerSpawnPositionSerializer_DeserializeLength(CitoStream const *stream, int length, Packet_ServerPlayerSpawnPosition *instance);

/**
 * &lt;summary&gt;Read the VarInt length prefix and the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerPlayerSpawnPosition const *Packet_ServerPlayerSpawnPositionSerializer_DeserializeLengthDelimited(CitoStream const *stream, Packet_ServerPlayerSpawnPosition *instance);

/**
 * &lt;summary&gt;Helper: create a new instance to deserializing into&lt;/summary&gt;
 */
Packet_ServerPlayerSpawnPosition *Packet_ServerPlayerSpawnPositionSerializer_DeserializeLengthDelimitedNew(CitoStream const *stream);

/**
 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
 */
void Packet_ServerPlayerSpawnPositionSerializer_Serialize(CitoStream const *stream, Packet_ServerPlayerSpawnPosition const *instance);

/**
 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
 */
void Packet_ServerPlayerSpawnPositionSerializer_SerializeLengthDelimited(CitoStream const *stream, Packet_ServerPlayerSpawnPosition const *instance);

/**
 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
 */
unsigned char const *Packet_ServerPlayerSpawnPositionSerializer_SerializeToBytes(Packet_ServerPlayerSpawnPosition const *instance);

Packet_ServerPlayerStats *Packet_ServerPlayerStats_New(void);
void Packet_ServerPlayerStats_Delete(Packet_ServerPlayerStats *self);

int Packet_ServerPlayerStats_GetCurrentHealth(Packet_ServerPlayerStats const *self);

int Packet_ServerPlayerStats_GetCurrentOxygen(Packet_ServerPlayerStats const *self);

int Packet_ServerPlayerStats_GetMaxHealth(Packet_ServerPlayerStats const *self);

int Packet_ServerPlayerStats_GetMaxOxygen(Packet_ServerPlayerStats const *self);

void Packet_ServerPlayerStats_SetCurrentHealth(Packet_ServerPlayerStats *self, int value);

void Packet_ServerPlayerStats_SetCurrentOxygen(Packet_ServerPlayerStats *self, int value);

void Packet_ServerPlayerStats_SetMaxHealth(Packet_ServerPlayerStats *self, int value);

void Packet_ServerPlayerStats_SetMaxOxygen(Packet_ServerPlayerStats *self, int value);

/**
 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerPlayerStats const *Packet_ServerPlayerStatsSerializer_Deserialize(CitoStream const *stream, Packet_ServerPlayerStats *instance);

/**
 * &lt;summary&gt;Helper: put the buffer into a MemoryStream before deserializing&lt;/summary&gt;
 */
Packet_ServerPlayerStats const *Packet_ServerPlayerStatsSerializer_DeserializeBuffer(unsigned char *buffer, int length, Packet_ServerPlayerStats *instance);

/**
 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerPlayerStats const *Packet_ServerPlayerStatsSerializer_DeserializeLength(CitoStream const *stream, int length, Packet_ServerPlayerStats *instance);

/**
 * &lt;summary&gt;Read the VarInt length prefix and the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerPlayerStats const *Packet_ServerPlayerStatsSerializer_DeserializeLengthDelimited(CitoStream const *stream, Packet_ServerPlayerStats *instance);

/**
 * &lt;summary&gt;Helper: create a new instance to deserializing into&lt;/summary&gt;
 */
Packet_ServerPlayerStats *Packet_ServerPlayerStatsSerializer_DeserializeLengthDelimitedNew(CitoStream const *stream);

/**
 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
 */
void Packet_ServerPlayerStatsSerializer_Serialize(CitoStream const *stream, Packet_ServerPlayerStats const *instance);

/**
 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
 */
void Packet_ServerPlayerStatsSerializer_SerializeLengthDelimited(CitoStream const *stream, Packet_ServerPlayerStats const *instance);

/**
 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
 */
unsigned char const *Packet_ServerPlayerStatsSerializer_SerializeToBytes(Packet_ServerPlayerStats const *instance);

Packet_ServerProjectile *Packet_ServerProjectile_New(void);
void Packet_ServerProjectile_Delete(Packet_ServerProjectile *self);

int Packet_ServerProjectile_GetBlockId(Packet_ServerProjectile const *self);

int Packet_ServerProjectile_GetExplodesAfterFloat(Packet_ServerProjectile const *self);

int Packet_ServerProjectile_GetFromXFloat(Packet_ServerProjectile const *self);

int Packet_ServerProjectile_GetFromYFloat(Packet_ServerProjectile const *self);

int Packet_ServerProjectile_GetFromZFloat(Packet_ServerProjectile const *self);

int Packet_ServerProjectile_GetSourcePlayerID(Packet_ServerProjectile const *self);

int Packet_ServerProjectile_GetVelocityXFloat(Packet_ServerProjectile const *self);

int Packet_ServerProjectile_GetVelocityYFloat(Packet_ServerProjectile const *self);

int Packet_ServerProjectile_GetVelocityZFloat(Packet_ServerProjectile const *self);

void Packet_ServerProjectile_SetBlockId(Packet_ServerProjectile *self, int value);

void Packet_ServerProjectile_SetExplodesAfterFloat(Packet_ServerProjectile *self, int value);

void Packet_ServerProjectile_SetFromXFloat(Packet_ServerProjectile *self, int value);

void Packet_ServerProjectile_SetFromYFloat(Packet_ServerProjectile *self, int value);

void Packet_ServerProjectile_SetFromZFloat(Packet_ServerProjectile *self, int value);

void Packet_ServerProjectile_SetSourcePlayerID(Packet_ServerProjectile *self, int value);

void Packet_ServerProjectile_SetVelocityXFloat(Packet_ServerProjectile *self, int value);

void Packet_ServerProjectile_SetVelocityYFloat(Packet_ServerProjectile *self, int value);

void Packet_ServerProjectile_SetVelocityZFloat(Packet_ServerProjectile *self, int value);

/**
 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerProjectile const *Packet_ServerProjectileSerializer_Deserialize(CitoStream const *stream, Packet_ServerProjectile *instance);

/**
 * &lt;summary&gt;Helper: put the buffer into a MemoryStream before deserializing&lt;/summary&gt;
 */
Packet_ServerProjectile const *Packet_ServerProjectileSerializer_DeserializeBuffer(unsigned char *buffer, int length, Packet_ServerProjectile *instance);

/**
 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerProjectile const *Packet_ServerProjectileSerializer_DeserializeLength(CitoStream const *stream, int length, Packet_ServerProjectile *instance);

/**
 * &lt;summary&gt;Read the VarInt length prefix and the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerProjectile const *Packet_ServerProjectileSerializer_DeserializeLengthDelimited(CitoStream const *stream, Packet_ServerProjectile *instance);

/**
 * &lt;summary&gt;Helper: create a new instance to deserializing into&lt;/summary&gt;
 */
Packet_ServerProjectile *Packet_ServerProjectileSerializer_DeserializeLengthDelimitedNew(CitoStream const *stream);

/**
 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
 */
void Packet_ServerProjectileSerializer_Serialize(CitoStream const *stream, Packet_ServerProjectile const *instance);

/**
 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
 */
void Packet_ServerProjectileSerializer_SerializeLengthDelimited(CitoStream const *stream, Packet_ServerProjectile const *instance);

/**
 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
 */
unsigned char const *Packet_ServerProjectileSerializer_SerializeToBytes(Packet_ServerProjectile const *instance);

Packet_ServerQueryAnswer *Packet_ServerQueryAnswer_New(void);
void Packet_ServerQueryAnswer_Delete(Packet_ServerQueryAnswer *self);

const char *Packet_ServerQueryAnswer_GetGameMode(Packet_ServerQueryAnswer const *self);

const char *Packet_ServerQueryAnswer_GetMOTD(Packet_ServerQueryAnswer const *self);

int Packet_ServerQueryAnswer_GetMapSizeX(Packet_ServerQueryAnswer const *self);

int Packet_ServerQueryAnswer_GetMapSizeY(Packet_ServerQueryAnswer const *self);

int Packet_ServerQueryAnswer_GetMapSizeZ(Packet_ServerQueryAnswer const *self);

int Packet_ServerQueryAnswer_GetMaxPlayers(Packet_ServerQueryAnswer const *self);

const char *Packet_ServerQueryAnswer_GetName(Packet_ServerQueryAnswer const *self);

cibool Packet_ServerQueryAnswer_GetPassword(Packet_ServerQueryAnswer const *self);

int Packet_ServerQueryAnswer_GetPlayerCount(Packet_ServerQueryAnswer const *self);

const char *Packet_ServerQueryAnswer_GetPlayerList(Packet_ServerQueryAnswer const *self);

int Packet_ServerQueryAnswer_GetPort(Packet_ServerQueryAnswer const *self);

const char *Packet_ServerQueryAnswer_GetPublicHash(Packet_ServerQueryAnswer const *self);

unsigned char const *Packet_ServerQueryAnswer_GetServerThumbnail(Packet_ServerQueryAnswer const *self);

const char *Packet_ServerQueryAnswer_GetServerVersion(Packet_ServerQueryAnswer const *self);

void Packet_ServerQueryAnswer_SetGameMode(Packet_ServerQueryAnswer *self, const char *value);

void Packet_ServerQueryAnswer_SetMOTD(Packet_ServerQueryAnswer *self, const char *value);

void Packet_ServerQueryAnswer_SetMapSizeX(Packet_ServerQueryAnswer *self, int value);

void Packet_ServerQueryAnswer_SetMapSizeY(Packet_ServerQueryAnswer *self, int value);

void Packet_ServerQueryAnswer_SetMapSizeZ(Packet_ServerQueryAnswer *self, int value);

void Packet_ServerQueryAnswer_SetMaxPlayers(Packet_ServerQueryAnswer *self, int value);

void Packet_ServerQueryAnswer_SetName(Packet_ServerQueryAnswer *self, const char *value);

void Packet_ServerQueryAnswer_SetPassword(Packet_ServerQueryAnswer *self, cibool value);

void Packet_ServerQueryAnswer_SetPlayerCount(Packet_ServerQueryAnswer *self, int value);

void Packet_ServerQueryAnswer_SetPlayerList(Packet_ServerQueryAnswer *self, const char *value);

void Packet_ServerQueryAnswer_SetPort(Packet_ServerQueryAnswer *self, int value);

void Packet_ServerQueryAnswer_SetPublicHash(Packet_ServerQueryAnswer *self, const char *value);

void Packet_ServerQueryAnswer_SetServerThumbnail(Packet_ServerQueryAnswer *self, unsigned char const *value);

void Packet_ServerQueryAnswer_SetServerVersion(Packet_ServerQueryAnswer *self, const char *value);

/**
 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerQueryAnswer const *Packet_ServerQueryAnswerSerializer_Deserialize(CitoStream const *stream, Packet_ServerQueryAnswer *instance);

/**
 * &lt;summary&gt;Helper: put the buffer into a MemoryStream before deserializing&lt;/summary&gt;
 */
Packet_ServerQueryAnswer const *Packet_ServerQueryAnswerSerializer_DeserializeBuffer(unsigned char *buffer, int length, Packet_ServerQueryAnswer *instance);

/**
 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerQueryAnswer const *Packet_ServerQueryAnswerSerializer_DeserializeLength(CitoStream const *stream, int length, Packet_ServerQueryAnswer *instance);

/**
 * &lt;summary&gt;Read the VarInt length prefix and the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerQueryAnswer const *Packet_ServerQueryAnswerSerializer_DeserializeLengthDelimited(CitoStream const *stream, Packet_ServerQueryAnswer *instance);

/**
 * &lt;summary&gt;Helper: create a new instance to deserializing into&lt;/summary&gt;
 */
Packet_ServerQueryAnswer *Packet_ServerQueryAnswerSerializer_DeserializeLengthDelimitedNew(CitoStream const *stream);

/**
 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
 */
void Packet_ServerQueryAnswerSerializer_Serialize(CitoStream const *stream, Packet_ServerQueryAnswer const *instance);

/**
 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
 */
void Packet_ServerQueryAnswerSerializer_SerializeLengthDelimited(CitoStream const *stream, Packet_ServerQueryAnswer const *instance);

/**
 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
 */
unsigned char const *Packet_ServerQueryAnswerSerializer_SerializeToBytes(Packet_ServerQueryAnswer const *instance);

Packet_ServerRedirect *Packet_ServerRedirect_New(void);
void Packet_ServerRedirect_Delete(Packet_ServerRedirect *self);

const char *Packet_ServerRedirect_GetIP(Packet_ServerRedirect const *self);

int Packet_ServerRedirect_GetPort(Packet_ServerRedirect const *self);

void Packet_ServerRedirect_SetIP(Packet_ServerRedirect *self, const char *value);

void Packet_ServerRedirect_SetPort(Packet_ServerRedirect *self, int value);

/**
 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerRedirect const *Packet_ServerRedirectSerializer_Deserialize(CitoStream const *stream, Packet_ServerRedirect *instance);

/**
 * &lt;summary&gt;Helper: put the buffer into a MemoryStream before deserializing&lt;/summary&gt;
 */
Packet_ServerRedirect const *Packet_ServerRedirectSerializer_DeserializeBuffer(unsigned char *buffer, int length, Packet_ServerRedirect *instance);

/**
 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerRedirect const *Packet_ServerRedirectSerializer_DeserializeLength(CitoStream const *stream, int length, Packet_ServerRedirect *instance);

/**
 * &lt;summary&gt;Read the VarInt length prefix and the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerRedirect const *Packet_ServerRedirectSerializer_DeserializeLengthDelimited(CitoStream const *stream, Packet_ServerRedirect *instance);

/**
 * &lt;summary&gt;Helper: create a new instance to deserializing into&lt;/summary&gt;
 */
Packet_ServerRedirect *Packet_ServerRedirectSerializer_DeserializeLengthDelimitedNew(CitoStream const *stream);

/**
 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
 */
void Packet_ServerRedirectSerializer_Serialize(CitoStream const *stream, Packet_ServerRedirect const *instance);

/**
 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
 */
void Packet_ServerRedirectSerializer_SerializeLengthDelimited(CitoStream const *stream, Packet_ServerRedirect const *instance);

/**
 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
 */
unsigned char const *Packet_ServerRedirectSerializer_SerializeToBytes(Packet_ServerRedirect const *instance);

Packet_ServerSeason *Packet_ServerSeason_New(void);
void Packet_ServerSeason_Delete(Packet_ServerSeason *self);

int Packet_ServerSeason_GetDayNightCycleSpeedup(Packet_ServerSeason const *self);

int Packet_ServerSeason_GetHour(Packet_ServerSeason const *self);

int Packet_ServerSeason_GetMoon(Packet_ServerSeason const *self);

void Packet_ServerSeason_SetDayNightCycleSpeedup(Packet_ServerSeason *self, int value);

void Packet_ServerSeason_SetHour(Packet_ServerSeason *self, int value);

void Packet_ServerSeason_SetMoon(Packet_ServerSeason *self, int value);

/**
 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerSeason const *Packet_ServerSeasonSerializer_Deserialize(CitoStream const *stream, Packet_ServerSeason *instance);

/**
 * &lt;summary&gt;Helper: put the buffer into a MemoryStream before deserializing&lt;/summary&gt;
 */
Packet_ServerSeason const *Packet_ServerSeasonSerializer_DeserializeBuffer(unsigned char *buffer, int length, Packet_ServerSeason *instance);

/**
 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerSeason const *Packet_ServerSeasonSerializer_DeserializeLength(CitoStream const *stream, int length, Packet_ServerSeason *instance);

/**
 * &lt;summary&gt;Read the VarInt length prefix and the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerSeason const *Packet_ServerSeasonSerializer_DeserializeLengthDelimited(CitoStream const *stream, Packet_ServerSeason *instance);

/**
 * &lt;summary&gt;Helper: create a new instance to deserializing into&lt;/summary&gt;
 */
Packet_ServerSeason *Packet_ServerSeasonSerializer_DeserializeLengthDelimitedNew(CitoStream const *stream);

/**
 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
 */
void Packet_ServerSeasonSerializer_Serialize(CitoStream const *stream, Packet_ServerSeason const *instance);

/**
 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
 */
void Packet_ServerSeasonSerializer_SerializeLengthDelimited(CitoStream const *stream, Packet_ServerSeason const *instance);

/**
 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
 */
unsigned char const *Packet_ServerSeasonSerializer_SerializeToBytes(Packet_ServerSeason const *instance);

/**
 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_Server const *Packet_ServerSerializer_Deserialize(CitoStream const *stream, Packet_Server *instance);

/**
 * &lt;summary&gt;Helper: put the buffer into a MemoryStream before deserializing&lt;/summary&gt;
 */
Packet_Server const *Packet_ServerSerializer_DeserializeBuffer(unsigned char *buffer, int length, Packet_Server *instance);

/**
 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_Server const *Packet_ServerSerializer_DeserializeLength(CitoStream const *stream, int length, Packet_Server *instance);

/**
 * &lt;summary&gt;Read the VarInt length prefix and the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_Server const *Packet_ServerSerializer_DeserializeLengthDelimited(CitoStream const *stream, Packet_Server *instance);

/**
 * &lt;summary&gt;Helper: create a new instance to deserializing into&lt;/summary&gt;
 */
Packet_Server const *Packet_ServerSerializer_DeserializeLengthDelimitedNew(CitoStream const *stream);

/**
 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
 */
void Packet_ServerSerializer_Serialize(CitoStream const *stream, Packet_Server const *instance);

/**
 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
 */
void Packet_ServerSerializer_SerializeLengthDelimited(CitoStream const *stream, Packet_Server const *instance);

/**
 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
 */
unsigned char const *Packet_ServerSerializer_SerializeToBytes(Packet_Server const *instance);

Packet_ServerSetBlock *Packet_ServerSetBlock_New(void);
void Packet_ServerSetBlock_Delete(Packet_ServerSetBlock *self);

int Packet_ServerSetBlock_GetBlockType(Packet_ServerSetBlock const *self);

int Packet_ServerSetBlock_GetX(Packet_ServerSetBlock const *self);

int Packet_ServerSetBlock_GetY(Packet_ServerSetBlock const *self);

int Packet_ServerSetBlock_GetZ(Packet_ServerSetBlock const *self);

void Packet_ServerSetBlock_SetBlockType(Packet_ServerSetBlock *self, int value);

void Packet_ServerSetBlock_SetX(Packet_ServerSetBlock *self, int value);

void Packet_ServerSetBlock_SetY(Packet_ServerSetBlock *self, int value);

void Packet_ServerSetBlock_SetZ(Packet_ServerSetBlock *self, int value);

/**
 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerSetBlock const *Packet_ServerSetBlockSerializer_Deserialize(CitoStream const *stream, Packet_ServerSetBlock *instance);

/**
 * &lt;summary&gt;Helper: put the buffer into a MemoryStream before deserializing&lt;/summary&gt;
 */
Packet_ServerSetBlock const *Packet_ServerSetBlockSerializer_DeserializeBuffer(unsigned char *buffer, int length, Packet_ServerSetBlock *instance);

/**
 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerSetBlock const *Packet_ServerSetBlockSerializer_DeserializeLength(CitoStream const *stream, int length, Packet_ServerSetBlock *instance);

/**
 * &lt;summary&gt;Read the VarInt length prefix and the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerSetBlock const *Packet_ServerSetBlockSerializer_DeserializeLengthDelimited(CitoStream const *stream, Packet_ServerSetBlock *instance);

/**
 * &lt;summary&gt;Helper: create a new instance to deserializing into&lt;/summary&gt;
 */
Packet_ServerSetBlock *Packet_ServerSetBlockSerializer_DeserializeLengthDelimitedNew(CitoStream const *stream);

/**
 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
 */
void Packet_ServerSetBlockSerializer_Serialize(CitoStream const *stream, Packet_ServerSetBlock const *instance);

/**
 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
 */
void Packet_ServerSetBlockSerializer_SerializeLengthDelimited(CitoStream const *stream, Packet_ServerSetBlock const *instance);

/**
 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
 */
unsigned char const *Packet_ServerSetBlockSerializer_SerializeToBytes(Packet_ServerSetBlock const *instance);

Packet_ServerSound *Packet_ServerSound_New(void);
void Packet_ServerSound_Delete(Packet_ServerSound *self);

const char *Packet_ServerSound_GetName(Packet_ServerSound const *self);

int Packet_ServerSound_GetX(Packet_ServerSound const *self);

int Packet_ServerSound_GetY(Packet_ServerSound const *self);

int Packet_ServerSound_GetZ(Packet_ServerSound const *self);

void Packet_ServerSound_SetName(Packet_ServerSound *self, const char *value);

void Packet_ServerSound_SetX(Packet_ServerSound *self, int value);

void Packet_ServerSound_SetY(Packet_ServerSound *self, int value);

void Packet_ServerSound_SetZ(Packet_ServerSound *self, int value);

/**
 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerSound const *Packet_ServerSoundSerializer_Deserialize(CitoStream const *stream, Packet_ServerSound *instance);

/**
 * &lt;summary&gt;Helper: put the buffer into a MemoryStream before deserializing&lt;/summary&gt;
 */
Packet_ServerSound const *Packet_ServerSoundSerializer_DeserializeBuffer(unsigned char *buffer, int length, Packet_ServerSound *instance);

/**
 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerSound const *Packet_ServerSoundSerializer_DeserializeLength(CitoStream const *stream, int length, Packet_ServerSound *instance);

/**
 * &lt;summary&gt;Read the VarInt length prefix and the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerSound const *Packet_ServerSoundSerializer_DeserializeLengthDelimited(CitoStream const *stream, Packet_ServerSound *instance);

/**
 * &lt;summary&gt;Helper: create a new instance to deserializing into&lt;/summary&gt;
 */
Packet_ServerSound *Packet_ServerSoundSerializer_DeserializeLengthDelimitedNew(CitoStream const *stream);

/**
 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
 */
void Packet_ServerSoundSerializer_Serialize(CitoStream const *stream, Packet_ServerSound const *instance);

/**
 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
 */
void Packet_ServerSoundSerializer_SerializeLengthDelimited(CitoStream const *stream, Packet_ServerSound const *instance);

/**
 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
 */
unsigned char const *Packet_ServerSoundSerializer_SerializeToBytes(Packet_ServerSound const *instance);

Packet_ServerSunLevels *Packet_ServerSunLevels_New(void);
void Packet_ServerSunLevels_Delete(Packet_ServerSunLevels *self);

int const *Packet_ServerSunLevels_GetSunlevels(Packet_ServerSunLevels const *self);

int Packet_ServerSunLevels_GetSunlevelsCount(Packet_ServerSunLevels const *self);

int Packet_ServerSunLevels_GetSunlevelsLength(Packet_ServerSunLevels const *self);

void Packet_ServerSunLevels_SetSunlevels(Packet_ServerSunLevels *self, int *value, int count, int length);

void Packet_ServerSunLevels_SunlevelsAdd(Packet_ServerSunLevels *self, int value);

/**
 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerSunLevels const *Packet_ServerSunLevelsSerializer_Deserialize(CitoStream const *stream, Packet_ServerSunLevels *instance);

/**
 * &lt;summary&gt;Helper: put the buffer into a MemoryStream before deserializing&lt;/summary&gt;
 */
Packet_ServerSunLevels const *Packet_ServerSunLevelsSerializer_DeserializeBuffer(unsigned char *buffer, int length, Packet_ServerSunLevels *instance);

/**
 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerSunLevels const *Packet_ServerSunLevelsSerializer_DeserializeLength(CitoStream const *stream, int length, Packet_ServerSunLevels *instance);

/**
 * &lt;summary&gt;Read the VarInt length prefix and the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerSunLevels const *Packet_ServerSunLevelsSerializer_DeserializeLengthDelimited(CitoStream const *stream, Packet_ServerSunLevels *instance);

/**
 * &lt;summary&gt;Helper: create a new instance to deserializing into&lt;/summary&gt;
 */
Packet_ServerSunLevels *Packet_ServerSunLevelsSerializer_DeserializeLengthDelimitedNew(CitoStream const *stream);

/**
 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
 */
void Packet_ServerSunLevelsSerializer_Serialize(CitoStream const *stream, Packet_ServerSunLevels const *instance);

/**
 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
 */
void Packet_ServerSunLevelsSerializer_SerializeLengthDelimited(CitoStream const *stream, Packet_ServerSunLevels const *instance);

/**
 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
 */
unsigned char const *Packet_ServerSunLevelsSerializer_SerializeToBytes(Packet_ServerSunLevels const *instance);

Packet_ServerTranslatedString *Packet_ServerTranslatedString_New(void);
void Packet_ServerTranslatedString_Delete(Packet_ServerTranslatedString *self);

const char *Packet_ServerTranslatedString_GetId(Packet_ServerTranslatedString const *self);

const char *Packet_ServerTranslatedString_GetLang(Packet_ServerTranslatedString const *self);

const char *Packet_ServerTranslatedString_GetTranslation(Packet_ServerTranslatedString const *self);

void Packet_ServerTranslatedString_SetId(Packet_ServerTranslatedString *self, const char *value);

void Packet_ServerTranslatedString_SetLang(Packet_ServerTranslatedString *self, const char *value);

void Packet_ServerTranslatedString_SetTranslation(Packet_ServerTranslatedString *self, const char *value);

/**
 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerTranslatedString const *Packet_ServerTranslatedStringSerializer_Deserialize(CitoStream const *stream, Packet_ServerTranslatedString *instance);

/**
 * &lt;summary&gt;Helper: put the buffer into a MemoryStream before deserializing&lt;/summary&gt;
 */
Packet_ServerTranslatedString const *Packet_ServerTranslatedStringSerializer_DeserializeBuffer(unsigned char *buffer, int length, Packet_ServerTranslatedString *instance);

/**
 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerTranslatedString const *Packet_ServerTranslatedStringSerializer_DeserializeLength(CitoStream const *stream, int length, Packet_ServerTranslatedString *instance);

/**
 * &lt;summary&gt;Read the VarInt length prefix and the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_ServerTranslatedString const *Packet_ServerTranslatedStringSerializer_DeserializeLengthDelimited(CitoStream const *stream, Packet_ServerTranslatedString *instance);

/**
 * &lt;summary&gt;Helper: create a new instance to deserializing into&lt;/summary&gt;
 */
Packet_ServerTranslatedString *Packet_ServerTranslatedStringSerializer_DeserializeLengthDelimitedNew(CitoStream const *stream);

/**
 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
 */
void Packet_ServerTranslatedStringSerializer_Serialize(CitoStream const *stream, Packet_ServerTranslatedString const *instance);

/**
 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
 */
void Packet_ServerTranslatedStringSerializer_SerializeLengthDelimited(CitoStream const *stream, Packet_ServerTranslatedString const *instance);

/**
 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
 */
unsigned char const *Packet_ServerTranslatedStringSerializer_SerializeToBytes(Packet_ServerTranslatedString const *instance);

Packet_SoundSet *Packet_SoundSet_New(void);
void Packet_SoundSet_Delete(Packet_SoundSet *self);

void Packet_SoundSet_Break1Add(Packet_SoundSet *self, const char *value);

void Packet_SoundSet_BuildAdd(Packet_SoundSet *self, const char *value);

void Packet_SoundSet_CloneAdd(Packet_SoundSet *self, const char *value);

const char *const *Packet_SoundSet_GetBreak1(Packet_SoundSet const *self);

int Packet_SoundSet_GetBreak1Count(Packet_SoundSet const *self);

int Packet_SoundSet_GetBreak1Length(Packet_SoundSet const *self);

const char *const *Packet_SoundSet_GetBuild(Packet_SoundSet const *self);

int Packet_SoundSet_GetBuildCount(Packet_SoundSet const *self);

int Packet_SoundSet_GetBuildLength(Packet_SoundSet const *self);

const char *const *Packet_SoundSet_GetClone(Packet_SoundSet const *self);

int Packet_SoundSet_GetCloneCount(Packet_SoundSet const *self);

int Packet_SoundSet_GetCloneLength(Packet_SoundSet const *self);

const char *const *Packet_SoundSet_GetReload(Packet_SoundSet const *self);

int Packet_SoundSet_GetReloadCount(Packet_SoundSet const *self);

int Packet_SoundSet_GetReloadLength(Packet_SoundSet const *self);

const char *const *Packet_SoundSet_GetShoot(Packet_SoundSet const *self);

int Packet_SoundSet_GetShootCount(Packet_SoundSet const *self);

const char *const *Packet_SoundSet_GetShootEnd(Packet_SoundSet const *self);

int Packet_SoundSet_GetShootEndCount(Packet_SoundSet const *self);

int Packet_SoundSet_GetShootEndLength(Packet_SoundSet const *self);

int Packet_SoundSet_GetShootLength(Packet_SoundSet const *self);

const char *const *Packet_SoundSet_GetWalk(Packet_SoundSet const *self);

int Packet_SoundSet_GetWalkCount(Packet_SoundSet const *self);

int Packet_SoundSet_GetWalkLength(Packet_SoundSet const *self);

void Packet_SoundSet_ReloadAdd(Packet_SoundSet *self, const char *value);

void Packet_SoundSet_SetBreak1(Packet_SoundSet *self, const char **value, int count, int length);

void Packet_SoundSet_SetBuild(Packet_SoundSet *self, const char **value, int count, int length);

void Packet_SoundSet_SetClone(Packet_SoundSet *self, const char **value, int count, int length);

void Packet_SoundSet_SetReload(Packet_SoundSet *self, const char **value, int count, int length);

void Packet_SoundSet_SetShoot(Packet_SoundSet *self, const char **value, int count, int length);

void Packet_SoundSet_SetShootEnd(Packet_SoundSet *self, const char **value, int count, int length);

void Packet_SoundSet_SetWalk(Packet_SoundSet *self, const char **value, int count, int length);

void Packet_SoundSet_ShootAdd(Packet_SoundSet *self, const char *value);

void Packet_SoundSet_ShootEndAdd(Packet_SoundSet *self, const char *value);

void Packet_SoundSet_WalkAdd(Packet_SoundSet *self, const char *value);

/**
 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_SoundSet const *Packet_SoundSetSerializer_Deserialize(CitoStream const *stream, Packet_SoundSet *instance);

/**
 * &lt;summary&gt;Helper: put the buffer into a MemoryStream before deserializing&lt;/summary&gt;
 */
Packet_SoundSet const *Packet_SoundSetSerializer_DeserializeBuffer(unsigned char *buffer, int length, Packet_SoundSet *instance);

/**
 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_SoundSet const *Packet_SoundSetSerializer_DeserializeLength(CitoStream const *stream, int length, Packet_SoundSet *instance);

/**
 * &lt;summary&gt;Read the VarInt length prefix and the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_SoundSet const *Packet_SoundSetSerializer_DeserializeLengthDelimited(CitoStream const *stream, Packet_SoundSet *instance);

/**
 * &lt;summary&gt;Helper: create a new instance to deserializing into&lt;/summary&gt;
 */
Packet_SoundSet *Packet_SoundSetSerializer_DeserializeLengthDelimitedNew(CitoStream const *stream);

/**
 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
 */
void Packet_SoundSetSerializer_Serialize(CitoStream const *stream, Packet_SoundSet const *instance);

/**
 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
 */
void Packet_SoundSetSerializer_SerializeLengthDelimited(CitoStream const *stream, Packet_SoundSet const *instance);

/**
 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
 */
unsigned char const *Packet_SoundSetSerializer_SerializeToBytes(Packet_SoundSet const *instance);

#define Packet_SpecialKeyEnum_RESPAWN  0

#define Packet_SpecialKeyEnum_SELECT_TEAM  3

#define Packet_SpecialKeyEnum_SET_SPAWN  1

#define Packet_SpecialKeyEnum_TAB_PLAYER_LIST  2

Packet_StringList *Packet_StringList_New(void);
void Packet_StringList_Delete(Packet_StringList *self);

const char *const *Packet_StringList_GetItems(Packet_StringList const *self);

int Packet_StringList_GetItemsCount(Packet_StringList const *self);

int Packet_StringList_GetItemsLength(Packet_StringList const *self);

void Packet_StringList_ItemsAdd(Packet_StringList *self, const char *value);

void Packet_StringList_SetItems(Packet_StringList *self, const char **value, int count, int length);

/**
 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_StringList const *Packet_StringListSerializer_Deserialize(CitoStream const *stream, Packet_StringList *instance);

/**
 * &lt;summary&gt;Helper: put the buffer into a MemoryStream before deserializing&lt;/summary&gt;
 */
Packet_StringList const *Packet_StringListSerializer_DeserializeBuffer(unsigned char *buffer, int length, Packet_StringList *instance);

/**
 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_StringList const *Packet_StringListSerializer_DeserializeLength(CitoStream const *stream, int length, Packet_StringList *instance);

/**
 * &lt;summary&gt;Read the VarInt length prefix and the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_StringList const *Packet_StringListSerializer_DeserializeLengthDelimited(CitoStream const *stream, Packet_StringList *instance);

/**
 * &lt;summary&gt;Helper: create a new instance to deserializing into&lt;/summary&gt;
 */
Packet_StringList *Packet_StringListSerializer_DeserializeLengthDelimitedNew(CitoStream const *stream);

/**
 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
 */
void Packet_StringListSerializer_Serialize(CitoStream const *stream, Packet_StringList const *instance);

/**
 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
 */
void Packet_StringListSerializer_SerializeLengthDelimited(CitoStream const *stream, Packet_StringList const *instance);

/**
 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
 */
unsigned char const *Packet_StringListSerializer_SerializeToBytes(Packet_StringList const *instance);

#define Packet_WalkableTypeEnum_EMPTY  0

#define Packet_WalkableTypeEnum_FLUID  1

#define Packet_WalkableTypeEnum_SOLID  2

Packet_Widget *Packet_Widget_New(void);
void Packet_Widget_Delete(Packet_Widget *self);

int Packet_Widget_GetClick(Packet_Widget const *self);

int Packet_Widget_GetClickKey(Packet_Widget const *self);

int Packet_Widget_GetColor(Packet_Widget const *self);

Packet_DialogFont const *Packet_Widget_GetFont(Packet_Widget const *self);

int Packet_Widget_GetHeight_(Packet_Widget const *self);

const char *Packet_Widget_GetId(Packet_Widget const *self);

const char *Packet_Widget_GetImage(Packet_Widget const *self);

const char *Packet_Widget_GetText(Packet_Widget const *self);

int Packet_Widget_GetType(Packet_Widget const *self);

int Packet_Widget_GetWidth(Packet_Widget const *self);

int Packet_Widget_GetX(Packet_Widget const *self);

int Packet_Widget_GetY(Packet_Widget const *self);

void Packet_Widget_SetClick(Packet_Widget *self, int value);

void Packet_Widget_SetClickKey(Packet_Widget *self, int value);

void Packet_Widget_SetColor(Packet_Widget *self, int value);

void Packet_Widget_SetFont(Packet_Widget *self, Packet_DialogFont *value);

void Packet_Widget_SetHeight_(Packet_Widget *self, int value);

void Packet_Widget_SetId(Packet_Widget *self, const char *value);

void Packet_Widget_SetImage(Packet_Widget *self, const char *value);

void Packet_Widget_SetText(Packet_Widget *self, const char *value);

void Packet_Widget_SetType(Packet_Widget *self, int value);

void Packet_Widget_SetWidth(Packet_Widget *self, int value);

void Packet_Widget_SetX(Packet_Widget *self, int value);

void Packet_Widget_SetY(Packet_Widget *self, int value);

/**
 * &lt;summary&gt;Takes the remaining content of the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_Widget const *Packet_WidgetSerializer_Deserialize(CitoStream const *stream, Packet_Widget *instance);

/**
 * &lt;summary&gt;Helper: put the buffer into a MemoryStream before deserializing&lt;/summary&gt;
 */
Packet_Widget const *Packet_WidgetSerializer_DeserializeBuffer(unsigned char *buffer, int length, Packet_Widget *instance);

/**
 * &lt;summary&gt;Read the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_Widget const *Packet_WidgetSerializer_DeserializeLength(CitoStream const *stream, int length, Packet_Widget *instance);

/**
 * &lt;summary&gt;Read the VarInt length prefix and the given number of bytes from the stream and deserialze it into the instance.&lt;/summary&gt;
 */
Packet_Widget const *Packet_WidgetSerializer_DeserializeLengthDelimited(CitoStream const *stream, Packet_Widget *instance);

/**
 * &lt;summary&gt;Helper: create a new instance to deserializing into&lt;/summary&gt;
 */
Packet_Widget const *Packet_WidgetSerializer_DeserializeLengthDelimitedNew(CitoStream const *stream);

/**
 * &lt;summary&gt;Serialize the instance into the stream&lt;/summary&gt;
 */
void Packet_WidgetSerializer_Serialize(CitoStream const *stream, Packet_Widget const *instance);

/**
 * &lt;summary&gt;Helper: Serialize with a varint length prefix&lt;/summary&gt;
 */
void Packet_WidgetSerializer_SerializeLengthDelimited(CitoStream const *stream, Packet_Widget const *instance);

/**
 * &lt;summary&gt;Helper: Serialize into a MemoryStream and return its byte array&lt;/summary&gt;
 */
unsigned char const *Packet_WidgetSerializer_SerializeToBytes(Packet_Widget const *instance);

#define Packet_WidgetTypeEnum_IMAGE  0

#define Packet_WidgetTypeEnum_TEXT  1

#define Packet_WidgetTypeEnum_TEXT_BOX  2

Ping_ *Ping__New(void);
void Ping__Delete(Ping_ *self);

int Ping__GetTimeoutValue(Ping_ const *self);

cibool Ping__Receive(Ping_ *self, GamePlatform const *platform);

cibool Ping__Send(Ping_ *self, GamePlatform const *platform);

void Ping__SetTimeoutValue(Ping_ *self, int value);

cibool Ping__Timeout(Ping_ *self, GamePlatform const *platform);

float Platform_Acos(float a);

float Platform_Cos(float a);

float Platform_Sin(float a);

float Platform_Sqrt(float a);

float Platform_Tan(float a);

void Platform_WriteInt(int a);

void Platform_WriteString(const char *a);

Player *Player_New(void);
void Player_Delete(Player *self);

float Player_DefaultEyeHeight(Player const *self);

float Player_DefaultModelHeight(Player const *self);

PlayerDrawInfo *PlayerDrawInfo_New(void);
void PlayerDrawInfo_Delete(PlayerDrawInfo *self);

PlayerInterpolate *PlayerInterpolate_New(void);
void PlayerInterpolate_Delete(PlayerInterpolate *self);

float PlayerInterpolate_DegToRad(float deg);

InterpolatedObject const *PlayerInterpolate_Interpolate(PlayerInterpolate const *self, InterpolatedObject const *a, InterpolatedObject const *b, float progress);

float PlayerInterpolate_RadToDeg(float rad);

PlayerInterpolationState *PlayerInterpolationState_New(void);
void PlayerInterpolationState_Delete(PlayerInterpolationState *self);

PointFloatRef *PointFloatRef_New(void);
void PointFloatRef_Delete(PointFloatRef *self);

PointFloatRef const *PointFloatRef_Create(float x_, float y_);

PointRef *PointRef_New(void);
void PointRef_Delete(PointRef *self);

PointRef *PointRef_Create(int x_, int y_);

PredicateBox3DHit *PredicateBox3DHit_New(void);
void PredicateBox3DHit_Delete(PredicateBox3DHit *self);

PredicateBox3DHit const *PredicateBox3DHit_Create(BlockOctreeSearcher const *s_);

cibool PredicateBox3DHit_Hit(PredicateBox3DHit const *self, Box3D const *o);

Preferences *Preferences_New(void);
void Preferences_Delete(Preferences *self);

cibool Preferences_GetBool(Preferences const *self, const char *key, cibool default_);

int Preferences_GetInt(Preferences const *self, const char *key, int default_);

const char *Preferences_GetKey(Preferences const *self, int i);

int Preferences_GetKeysCount(Preferences const *self);

const char *Preferences_GetString(Preferences const *self, const char *key, const char *default_);

void Preferences_SetBool(Preferences const *self, const char *key, cibool value);

void Preferences_SetInt(Preferences const *self, const char *key, int value);

void Preferences_SetString(Preferences const *self, const char *key, const char *value);

ProcessPacketTask *ProcessPacketTask_New(void);
void ProcessPacketTask_Delete(ProcessPacketTask *self);

void ProcessPacketTask_Run(ProcessPacketTask const *self);

int ProtoPlatform_ArrayLength(unsigned char const *a);

const char *ProtoPlatform_BytesToString(unsigned char const *bytes, int length);

unsigned char ProtoPlatform_IntToByte(int a);

unsigned char const *ProtoPlatform_StringToBytes(const char *s);

int ProtoPlatform_logical_right_shift(int x, int n);

cibool ProtocolParser_ReadBool(CitoStream const *stream);

/**
 * &lt;summary&gt;
 * Reads a length delimited byte array
 * &lt;/summary&gt;
 */
unsigned char const *ProtocolParser_ReadBytes(CitoStream const *stream);

/**
 * &lt;summary&gt;
 * Since the int32 format is inefficient for negative numbers we have avoided to implement it.
 * The same functionality can be achieved using: (int)ReadUInt64(stream);
 * &lt;/summary&gt;
 */
int ProtocolParser_ReadInt32(CitoStream const *stream);

/**
 * &lt;summary&gt;
 * Since the int64 format is inefficient for negative numbers we have avoided to implement it.
 * The same functionality can be achieved using: (long)ReadUInt64(stream);
 * &lt;/summary&gt;
 */
int ProtocolParser_ReadInt64(CitoStream const *stream);

Key const *ProtocolParser_ReadKey(CitoStream const *stream);

Key const *ProtocolParser_ReadKey_(unsigned char firstByte, CitoStream const *stream);

/**
 * &lt;summary&gt;
 * Reads past a varint for an unknown field.
 * &lt;/summary&gt;
 */
void ProtocolParser_ReadSkipVarInt(CitoStream const *stream);

const char *ProtocolParser_ReadString(CitoStream const *stream);

/**
 * &lt;summary&gt;
 * Unsigned VarInt format
 * Do not use to read int32, use ReadUint64 for that.
 * &lt;/summary&gt;
 */
int ProtocolParser_ReadUInt32(CitoStream const *stream);

/**
 * &lt;summary&gt;
 * Unsigned VarInt format
 * &lt;/summary&gt;
 */
int ProtocolParser_ReadUInt64(CitoStream const *stream);

/**
 * &lt;summary&gt;
 * Read the value for an unknown key as bytes.
 * Used to preserve unknown keys during deserialization.
 * Requires the message option preserveunknown=true.
 * &lt;/summary&gt;
 */
unsigned char const *ProtocolParser_ReadValueBytes(CitoStream const *stream, Key const *key);

unsigned char const *ProtocolParser_ReadVarIntBytes(CitoStream const *stream);

/**
 * &lt;summary&gt;
 * Zig-zag signed VarInt format
 * &lt;/summary&gt;
 */
int ProtocolParser_ReadZInt32(CitoStream const *stream);

/**
 * &lt;summary&gt;
 * Zig-zag signed VarInt format
 * &lt;/summary&gt;
 */
int ProtocolParser_ReadZInt64(CitoStream const *stream);

/**
 * &lt;summary&gt;
 * Skip the next varint length prefixed bytes.
 * Alternative to ReadBytes when the data is not of interest.
 * &lt;/summary&gt;
 */
void ProtocolParser_SkipBytes(CitoStream const *stream);

/**
 * &lt;summary&gt;
 * Seek past the value for the previously read key.
 * &lt;/summary&gt;
 */
void ProtocolParser_SkipKey(CitoStream const *stream, Key const *key);

void ProtocolParser_WriteBool(CitoStream const *stream, cibool val);

/**
 * &lt;summary&gt;
 * Writes length delimited byte array
 * &lt;/summary&gt;
 */
void ProtocolParser_WriteBytes(CitoStream const *stream, unsigned char const *val);

/**
 * &lt;summary&gt;
 * Since the int32 format is inefficient for negative numbers we have avoided to imlplement.
 * The same functionality can be achieved using: WriteUInt64(stream, (uint)val);
 * Note that 64 must always be used for int32 to generate the ten byte wire format.
 * &lt;/summary&gt;
 */
void ProtocolParser_WriteInt32(CitoStream const *stream, int val);

/**
 * &lt;summary&gt;
 * Since the int64 format is inefficient for negative numbers we have avoided to implement.
 * The same functionality can be achieved using: WriteUInt64 (stream, (ulong)val);
 * &lt;/summary&gt;
 */
void ProtocolParser_WriteInt64(CitoStream const *stream, int val);

void ProtocolParser_WriteKey(CitoStream const *stream, Key const *key);

void ProtocolParser_WriteString(CitoStream const *stream, const char *val);

/**
 * &lt;summary&gt;
 * Unsigned VarInt format
 * &lt;/summary&gt;
 */
void ProtocolParser_WriteUInt32_(CitoStream const *stream, int val);

/**
 * &lt;summary&gt;
 * Unsigned VarInt format
 * &lt;/summary&gt;
 */
void ProtocolParser_WriteUInt64(CitoStream const *stream, int val);

/**
 * &lt;summary&gt;
 * Zig-zag signed VarInt format
 * &lt;/summary&gt;
 */
void ProtocolParser_WriteZInt32(CitoStream const *stream, int val);

/**
 * &lt;summary&gt;
 * Zig-zag signed VarInt format
 * &lt;/summary&gt;
 */
void ProtocolParser_WriteZInt64(CitoStream const *stream, int val);

ModelData const *QuadModelData_GetQuadModelData(void);

ModelData const *QuadModelData_GetQuadModelData2(float sx, float sy, float sw, float sh, float dx, float dy, float dw, float dh, unsigned char r, unsigned char g, unsigned char b, unsigned char a);

/**
 * **
 */
float const *Quat_Add(float *output, float const *a, float const *b);

/**
 * **
 */
float const *Quat_CalculateW(float *output, float const *a);

/**
 * **
 */
float const *Quat_CloneIt(float const *a);

/**
 * **
 */
float const *Quat_Conjugate(Quat const *self, float *output, float const *a);

/**
 * **
 */
float const *Quat_Copy(float *output, float const *a);

/**
 * **
 */
float const *Quat_Create(void);

/**
 * **
 */
float Quat_Dot(float const *a, float const *b);

/**
 * **
 */
float const *Quat_FromMat3(float *output, float const *m);

/**
 * **
 */
float const *Quat_FromValues(float x, float y, float z, float w);

/**
 * **
 */
float const *Quat_Identity_(float *output);

/**
 * **
 */
float const *Quat_Invert(Quat const *self, float *output, float const *a);

/**
 * **
 */
float Quat_Len(float const *a);

/**
 * **
 */
float Quat_Length_(float const *a);

/**
 * **
 */
float const *Quat_Lerp(float *output, float const *a, float const *b, float t);

/**
 * **
 */
float const *Quat_Mul(float *output, float const *a, float const *b);

/**
 * **
 */
float const *Quat_Multiply(float *output, float const *a, float const *b);

/**
 * **
 */
float const *Quat_Normalize(float *output, float const *a);

/**
 * **
 */
float const *Quat_RotateX(float *output, float const *a, float rad);

/**
 * **
 */
float const *Quat_RotateY(float *output, float const *a, float rad);

/**
 * **
 */
float const *Quat_RotateZ(float *output, float const *a, float rad);

/**
 * **
 */
float const *Quat_RotationTo(float *output, float const *a, float const *b);

/**
 * **
 */
float const *Quat_Scale(float *output, float const *a, float b);

/**
 * **
 */
float const *Quat_Set(float *output, float x, float y, float z, float w);

/**
 * **
 */
float const *Quat_SetAxes(float *output, float const *view, float const *right, float const *up);

/**
 * **
 */
float const *Quat_SetAxisAngle(float *output, float const *axis, float rad);

/**
 * **
 */
float const *Quat_Slerp(float *output, float const *a, float const *b, float t);

/**
 * **
 */
float Quat_SqrLen(float const *a);

/**
 * **
 */
float Quat_SquaredLength(float const *a);

QueryClient *QueryClient_New(void);
void QueryClient_Delete(QueryClient *self);

QueryResult const *QueryClient_GetResult(QueryClient const *self);

const char *QueryClient_GetServerMessage(QueryClient const *self);

void QueryClient_PerformQuery(QueryClient *self, const char *ip, int port);

void QueryClient_SetPlatform(QueryClient *self, GamePlatform const *p_);

QueryResult *QueryResult_New(void);
void QueryResult_Delete(QueryResult *self);

QueueAction *QueueAction_New(void);
void QueueAction_Delete(QueueAction *self);

int QueueAction_Count(QueueAction const *self);

QueueAction const *QueueAction_Create(int max_);

Action_ const *QueueAction_Dequeue(QueueAction *self);

void QueueAction_Enqueue(QueueAction *self, Action_ const *value);

QueueByte *QueueByte_New(void);
void QueueByte_Delete(QueueByte *self);

unsigned char QueueByte_Dequeue(QueueByte *self);

void QueueByte_DequeueRange(QueueByte *self, unsigned char *data, int length);

void QueueByte_Enqueue(QueueByte *self, unsigned char value);

int QueueByte_GetCount(QueueByte const *self);

QueueByteArray *QueueByteArray_New(void);
void QueueByteArray_Delete(QueueByteArray *self);

QueueINetOutgoingMessage *QueueINetOutgoingMessage_New(void);
void QueueINetOutgoingMessage_Delete(QueueINetOutgoingMessage *self);

QueueNetIncomingMessage *QueueNetIncomingMessage_New(void);
void QueueNetIncomingMessage_Delete(QueueNetIncomingMessage *self);

#define RailDirectionFlags_CORNERS  60

#define RailDirectionFlags_DOWN_LEFT  16

#define RailDirectionFlags_DOWN_RIGHT  32

#define RailDirectionFlags_FULL  63

#define RailDirectionFlags_HORIZONTAL  1

#define RailDirectionFlags_NONE  0

#define RailDirectionFlags_TWO_HORIZONTAL_VERTICAL  3

#define RailDirectionFlags_UP_LEFT  4

#define RailDirectionFlags_UP_RIGHT  8

#define RailDirectionFlags_VERTICAL  2

#define RailDirectionFlagsEnum_DOWN_LEFT  16

#define RailDirectionFlagsEnum_DOWN_RIGHT  32

#define RailDirectionFlagsEnum_HORIZONTAL  1

#define RailDirectionFlagsEnum_NONE  0

#define RailDirectionFlagsEnum_UP_LEFT  4

#define RailDirectionFlagsEnum_UP_RIGHT  8

#define RailDirectionFlagsEnum_VERTICAL  2

RailMapUtil *RailMapUtil_New(void);
void RailMapUtil_Delete(RailMapUtil *self);

RailSlope RailMapUtil_GetRailSlope(RailMapUtil const *self, int x, int y, int z);

#define RailSlopeEnum_FLAT  0

#define RailSlopeEnum_TWO_DOWN_RAISED  4

#define RailSlopeEnum_TWO_LEFT_RAISED  1

#define RailSlopeEnum_TWO_RIGHT_RAISED  2

#define RailSlopeEnum_TWO_UP_RAISED  3

RectFRef *RectFRef_New(void);
void RectFRef_Delete(RectFRef *self);

RectFRef *RectFRef_Create(float x_, float y_, float w_, float h_);

RectangleFloat *RectangleFloat_New(void);
void RectangleFloat_Delete(RectangleFloat *self);

float RectangleFloat_Bottom(RectangleFloat const *self);

RectangleFloat const *RectangleFloat_Create(float x_, float y_, float width_, float height_);

#define RenderHintEnum_FAST  0

#define RenderHintEnum_NICE  1

RenderedChunk *RenderedChunk_New(void);
void RenderedChunk_Delete(RenderedChunk *self);

Screen *Screen_New(void);
void Screen_Delete(Screen *self);

void Screen_DrawWidgets(Screen const *self);

void Screen_LoadTranslations(Screen const *self);

void Screen_OnBackPressed(Screen const *self);

void Screen_OnButton(Screen const *self, MenuWidget const *w);

void Screen_OnKeyDown(Screen const *self, KeyEventArgs const *e);

void Screen_OnKeyPress(Screen const *self, KeyPressEventArgs const *e);

void Screen_OnKeyUp(Screen const *self, KeyEventArgs const *e);

void Screen_OnMouseDown(Screen const *self, MouseEventArgs const *e);

void Screen_OnMouseMove(Screen const *self, MouseEventArgs const *e);

void Screen_OnMouseUp(Screen const *self, MouseEventArgs const *e);

void Screen_OnMouseWheel(Screen const *self, MouseWheelEventArgs const *e);

void Screen_OnTouchEnd(Screen const *self, TouchEventArgs const *e);

void Screen_OnTouchMove(Screen const *self, TouchEventArgs const *e);

void Screen_OnTouchStart(Screen const *self, TouchEventArgs const *e);

void Screen_Render(Screen const *self, float dt);

ScreenConnectToIp *ScreenConnectToIp_New(void);
void ScreenConnectToIp_Delete(ScreenConnectToIp *self);

void ScreenConnectToIp_LoadTranslations(ScreenConnectToIp *self);

void ScreenConnectToIp_OnBackPressed(ScreenConnectToIp const *self);

void ScreenConnectToIp_OnButton(ScreenConnectToIp const *self, MenuWidget const *w);

void ScreenConnectToIp_Render(ScreenConnectToIp *self, float dt);

ScreenGame *ScreenGame_New(void);
void ScreenGame_Delete(ScreenGame *self);

void ScreenGame_OnBackPressed(ScreenGame const *self);

void ScreenGame_OnKeyDown(ScreenGame const *self, KeyEventArgs const *e);

void ScreenGame_OnKeyPress(ScreenGame const *self, KeyPressEventArgs const *e);

void ScreenGame_OnKeyUp(ScreenGame const *self, KeyEventArgs const *e);

void ScreenGame_OnMouseDown(ScreenGame const *self, MouseEventArgs const *e);

void ScreenGame_OnMouseMove(ScreenGame const *self, MouseEventArgs const *e);

void ScreenGame_OnMouseUp(ScreenGame const *self, MouseEventArgs const *e);

void ScreenGame_OnMouseWheel(ScreenGame const *self, MouseWheelEventArgs const *e);

void ScreenGame_OnTouchEnd(ScreenGame const *self, TouchEventArgs const *e);

void ScreenGame_OnTouchMove(ScreenGame const *self, TouchEventArgs const *e);

void ScreenGame_OnTouchStart(ScreenGame const *self, TouchEventArgs const *e);

void ScreenGame_Render(ScreenGame const *self, float dt);

void ScreenGame_Start(ScreenGame *self, GamePlatform const *platform_, cibool singleplayer_, const char *singleplayerSavePath_, ConnectData *connectData_);

ScreenLogin *ScreenLogin_New(void);
void ScreenLogin_Delete(ScreenLogin *self);

void ScreenLogin_LoadTranslations(ScreenLogin *self);

void ScreenLogin_OnBackPressed(ScreenLogin const *self);

void ScreenLogin_OnButton(ScreenLogin *self, MenuWidget *w);

void ScreenLogin_Render(ScreenLogin *self, float dt);

ScreenMain *ScreenMain_New(void);
void ScreenMain_Delete(ScreenMain *self);

void ScreenMain_OnBackPressed(ScreenMain const *self);

void ScreenMain_OnButton(ScreenMain const *self, MenuWidget const *w);

void ScreenMain_OnKeyDown(ScreenMain const *self, KeyEventArgs const *e);

void ScreenMain_Render(ScreenMain *self, float dt);

ScreenModifyWorld *ScreenModifyWorld_New(void);
void ScreenModifyWorld_Delete(ScreenModifyWorld *self);

void ScreenModifyWorld_OnBackPressed(ScreenModifyWorld const *self);

void ScreenModifyWorld_OnButton(ScreenModifyWorld const *self, MenuWidget const *w);

void ScreenModifyWorld_Render(ScreenModifyWorld const *self, float dt);

ScreenMultiplayer *ScreenMultiplayer_New(void);
void ScreenMultiplayer_Delete(ScreenMultiplayer *self);

void ScreenMultiplayer_LoadTranslations(ScreenMultiplayer *self);

void ScreenMultiplayer_OnBackPressed(ScreenMultiplayer const *self);

void ScreenMultiplayer_OnButton(ScreenMultiplayer *self, MenuWidget const *w);

void ScreenMultiplayer_OnMouseWheel(ScreenMultiplayer *self, MouseWheelEventArgs const *e);

void ScreenMultiplayer_PageDown_(ScreenMultiplayer *self);

void ScreenMultiplayer_PageUp_(ScreenMultiplayer *self);

void ScreenMultiplayer_Render(ScreenMultiplayer *self, float dt);

void ScreenMultiplayer_UpdateScrollButtons(ScreenMultiplayer const *self);

void ScreenMultiplayer_UpdateThumbnails(ScreenMultiplayer const *self);

ScreenSingleplayer *ScreenSingleplayer_New(void);
void ScreenSingleplayer_Delete(ScreenSingleplayer *self);

void ScreenSingleplayer_LoadTranslations(ScreenSingleplayer *self);

void ScreenSingleplayer_OnBackPressed(ScreenSingleplayer const *self);

void ScreenSingleplayer_OnButton(ScreenSingleplayer const *self, MenuWidget const *w);

void ScreenSingleplayer_Render(ScreenSingleplayer *self, float dt);

Script *Script_New(void);
void Script_Delete(Script *self);

void Script_OnCreate(Script const *self, ScriptManager const *manager);

void Script_OnUse(Script const *self);

ScriptCharacterPhysics *ScriptCharacterPhysics_New(void);
void ScriptCharacterPhysics_Delete(ScriptCharacterPhysics *self);

float ScriptCharacterPhysics_BoxPointDistance(float minX, float minY, float minZ, float maxX, float maxY, float maxZ, float pX, float pY, float pZ);

cibool ScriptCharacterPhysics_IsTileEmptyForPhysics(ScriptCharacterPhysics const *self, int x, int y, int z);

float ScriptCharacterPhysics_MakeCloserToZero(float a, float b);

void ScriptCharacterPhysics_OnNewFrameFixed(ScriptCharacterPhysics *self, Game *game_, int entity, float dt);

void ScriptCharacterPhysics_Update(ScriptCharacterPhysics *self, EntityPosition_ *stateplayerposition, Controls const *move, float dt, BoolRef *soundnow, Vector3Ref *push, float modelheight);

float const *ScriptCharacterPhysics_WallSlide(ScriptCharacterPhysics *self, float *oldposition, float *newposition, float modelheight);

SendPacketAction *SendPacketAction_New(void);
void SendPacketAction_Delete(SendPacketAction *self);

SendPacketAction const *SendPacketAction_Create(ServerSimple const *server_, int client_, Packet_Server const *packet_);

void SendPacketAction_Run(SendPacketAction const *self);

ServerCi *ServerCi_New(void);
void ServerCi_Delete(ServerCi *self);

ServerInformation *ServerInformation_New(void);
void ServerInformation_Delete(ServerInformation *self);

ServerOnList *ServerOnList_New(void);
void ServerOnList_Delete(ServerOnList *self);

Packet_Server const *ServerPackets_BlockType(int id, Packet_BlockType *blockType);

Packet_Server const *ServerPackets_BlockTypes(void);

Packet_Server const *ServerPackets_ChunkPart(unsigned char const *compressedChunkPart);

Packet_Server const *ServerPackets_Chunk_(int x, int y, int z, int chunksize);

Packet_Server const *ServerPackets_Identification(int assignedClientId, int mapSizeX, int mapSizeY, int mapSizeZ, const char *version);

Packet_Server const *ServerPackets_LevelFinalize(void);

Packet_Server const *ServerPackets_LevelInitialize(void);

Packet_Server const *ServerPackets_Message(const char *text);

unsigned char const *ServerPackets_Serialize(Packet_Server const *packet, IntRef *retLength);

ServerSimple *ServerSimple_New(void);
void ServerSimple_Delete(ServerSimple *self);

#define ServerSimple_CHUNK_SIZE  32

void ServerSimple_QueueMainThreadAction(ServerSimple const *self, Action_ const *action);

void ServerSimple_SendPacket(ServerSimple const *self, int client, Packet_Server const *packet);

void ServerSimple_Start(ServerSimple *self, NetServer const *server_, const char *saveFilename_, GamePlatform const *platform_);

void ServerSimple_Update(ServerSimple *self);

Sound_ *Sound__New(void);
void Sound__Delete(Sound_ *self);

#define SpecialBlockId_EMPTY  0

Speculative *Speculative_New(void);
void Speculative_Delete(Speculative *self);

int *SphereModelData_CalculateElements(float radius, float height, int segments, int rings);

ModelData const *SphereModelData_GetSphereModelData(float radius, float height, int segments, int rings);

Sprite *Sprite_New(void);
void Sprite_Delete(Sprite *self);

StackMatrix4 *StackMatrix4_New(void);
void StackMatrix4_Delete(StackMatrix4 *self);

const char *StringTools_StringAppend(GamePlatform const *p, const char *a, const char *b);

int StringTools_StringLength(GamePlatform const *p, const char *a);

cibool StringTools_StringStartsWith(GamePlatform const *p, const char *s, const char *b);

const char *StringTools_StringSubstring(GamePlatform const *p, const char *a, int start, int count);

const char *StringTools_StringSubstringToEnd(GamePlatform const *p, const char *a, int start);

SunMoonRenderer *SunMoonRenderer_New(void);
void SunMoonRenderer_Delete(SunMoonRenderer *self);

int SunMoonRenderer_GetHour(SunMoonRenderer const *self);

void SunMoonRenderer_OnNewFrameDraw3d(SunMoonRenderer *self, Game *game, float dt);

void SunMoonRenderer_SetHour(SunMoonRenderer *self, int value);

void TableSerializer_Deserialize(TableSerializer const *self, GamePlatform const *p, const char *data, TableBinding const *b);

TaskScheduler *TaskScheduler_New(void);
void TaskScheduler_Delete(TaskScheduler *self);

void TaskScheduler_Update(TaskScheduler *self, Game const *game, float dt);

TcpNetClient *TcpNetClient_New(void);
void TcpNetClient_Delete(TcpNetClient *self);

NetConnection const *TcpNetClient_Connect(TcpNetClient const *self, const char *ip, int port);

#define TcpNetClient_MAX_PACKET_LENGTH  4096

NetIncomingMessage const *TcpNetClient_ReadMessage(TcpNetClient const *self);

void TcpNetClient_SendMessage(TcpNetClient const *self, INetOutgoingMessage const *message, MyNetDeliveryMethod method);

void TcpNetClient_SetPlatform(TcpNetClient *self, GamePlatform const *platform_);

void TcpNetClient_Start(TcpNetClient *self);

TerrainChunkTesselatorCi *TerrainChunkTesselatorCi_New(void);
void TerrainChunkTesselatorCi_Delete(TerrainChunkTesselatorCi *self);

void TerrainChunkTesselatorCi_AddTorch(TerrainChunkTesselatorCi const *self, int x, int y, int z, int type, int tt);

void TerrainChunkTesselatorCi_AddVertex(TerrainChunkTesselatorCi const *self, ModelData *model, float x, float y, float z, float u, float v, int color);

void TerrainChunkTesselatorCi_BuildBlockPolygons(TerrainChunkTesselatorCi *self, int x, int y, int z);

void TerrainChunkTesselatorCi_BuildSingleBlockPolygon(TerrainChunkTesselatorCi *self, int x, int y, int z, int const *currentChunk);

void TerrainChunkTesselatorCi_CalculateTilingCount(TerrainChunkTesselatorCi const *self, int const *currentChunk, int startx, int starty, int startz);

void TerrainChunkTesselatorCi_CalculateVisibleFaces(TerrainChunkTesselatorCi const *self, int const *currentChunk);

cibool TerrainChunkTesselatorCi_CanSupportTorch(TerrainChunkTesselatorCi const *self, int blocktype);

VerticesIndicesToLoad const *const *TerrainChunkTesselatorCi_GetFinalVerticesIndices(TerrainChunkTesselatorCi const *self, int x, int y, int z, IntRef *retCount);

ModelData *TerrainChunkTesselatorCi_GetModelData(TerrainChunkTesselatorCi const *self, int tiletype, int textureid);

int TerrainChunkTesselatorCi_GetRailSlope(TerrainChunkTesselatorCi const *self, int xx, int yy, int zz);

int TerrainChunkTesselatorCi_GetShadowRatio(TerrainChunkTesselatorCi const *self, int xx, int yy, int zz);

int TerrainChunkTesselatorCi_GetShadowRatioOld(TerrainChunkTesselatorCi const *self, int xx, int yy, int zz, int globalx, int globaly, int globalz);

int TerrainChunkTesselatorCi_GetShadowRatioVec(TerrainChunkTesselatorCi const *self, VecCito3i const *v);

int TerrainChunkTesselatorCi_GetTilingCount(TerrainChunkTesselatorCi const *self, int const *currentChunk, int xx, int yy, int zz, int tt, int x, int y, int z, int shadowratio, int dir, int dirflags);

VerticesIndicesToLoad const *TerrainChunkTesselatorCi_GetVerticesIndices(TerrainChunkTesselatorCi const *self, ModelData const *m, int x, int y, int z, int texture, cibool transparent);

cibool TerrainChunkTesselatorCi_IsFlower(TerrainChunkTesselatorCi const *self, int tiletype);

cibool TerrainChunkTesselatorCi_IsTransparentForLight(TerrainChunkTesselatorCi const *self, int block);

cibool TerrainChunkTesselatorCi_IsTransparentFully(TerrainChunkTesselatorCi const *self, int p);

VerticesIndicesToLoad const *const *TerrainChunkTesselatorCi_MakeChunk(TerrainChunkTesselatorCi *self, int x, int y, int z, int const *chunk18, unsigned char const *shadows18, float const *lightlevels_, IntRef *retCount);

int TerrainChunkTesselatorCi_Rail(TerrainChunkTesselatorCi const *self, int tiletype);

void TerrainChunkTesselatorCi_Start(TerrainChunkTesselatorCi *self);

int TerrainChunkTesselatorCi_TextureId(TerrainChunkTesselatorCi const *self, int tiletype, int side);

int TerrainChunkTesselatorCi_getBestLadderInDirection(TerrainChunkTesselatorCi const *self, int x, int y, int z, int const *currentChunk, int dir);

int TerrainChunkTesselatorCi_getBestLadderWall(TerrainChunkTesselatorCi const *self, int x, int y, int z, int const *currentChunk);

cibool TerrainChunkTesselatorCi_isvalid(TerrainChunkTesselatorCi const *self, int tt);

TerrainRendererCommit *TerrainRendererCommit_New(void);
void TerrainRendererCommit_Delete(TerrainRendererCommit *self);

TerrainRendererCommit const *TerrainRendererCommit_Create(ModDrawTerrain *renderer);

void TerrainRendererCommit_Run(TerrainRendererCommit const *self);

TerrainRendererRedraw *TerrainRendererRedraw_New(void);
void TerrainRendererRedraw_Delete(TerrainRendererRedraw *self);

TextColorRenderer *TextColorRenderer_New(void);
void TextColorRenderer_Delete(TextColorRenderer *self);

TextPart const *const *TextColorRenderer_DecodeColors(TextColorRenderer const *self, const char *s, int defaultcolor, IntRef *retLength);

TextPart *TextPart_New(void);
void TextPart_Delete(TextPart *self);

TextTexture *TextTexture_New(void);
void TextTexture_Delete(TextTexture *self);

Text_ *Text__New(void);
void Text__Delete(Text_ *self);

int Text__GetColor(Text_ const *self);

const char *Text__GetFontFamily(Text_ const *self);

float Text__GetFontSize(Text_ const *self);

int Text__GetFontStyle(Text_ const *self);

const char *Text__GetText(Text_ const *self);

void Text__SetColor(Text_ *self, int value);

void Text__SetFontFamily(Text_ *self, const char *value);

void Text__SetFontSize(Text_ *self, float value);

void Text__SetFontStyle(Text_ *self, int value);

void Text__SetText(Text_ *self, const char *value);

RectFRef const *TextureAtlas_TextureCoords2d(int textureId, int texturesPacked);

void TextureAtlasCi_TextureCoords2d(int textureId, int texturesPacked, RectFRef *r);

BitmapCi const *const *TextureAtlasConverter_Atlas2dInto1d(TextureAtlasConverter const *self, GamePlatform const *p, BitmapCi const *atlas2d_, int tiles, int atlassizezlimit, IntRef *retCount);

ThumbnailResponseCi *ThumbnailResponseCi_New(void);
void ThumbnailResponseCi_Delete(ThumbnailResponseCi *self);

#define TileDirectionEnum_BOTTOM  1

#define TileDirectionEnum_BOTTOM_LEFT  6

#define TileDirectionEnum_BOTTOM_RIGHT  7

#define TileDirectionEnum_CENTER  8

#define TileDirectionEnum_DIRECTION_COUNTS  9

#define TileDirectionEnum_LEFT  2

#define TileDirectionEnum_RIGHT  3

#define TileDirectionEnum_TOP  0

#define TileDirectionEnum_TOP_LEFT  4

#define TileDirectionEnum_TOP_RIGHT  5

TileEnterData *TileEnterData_New(void);
void TileEnterData_Delete(TileEnterData *self);

#define TileSide_BACK  3

#define TileSide_BOTTOM  1

#define TileSide_FRONT  2

#define TileSide_LEFT  4

#define TileSide_RIGHT  5

#define TileSide_TOP  0

#define TileSideEnum_BACK  4

#define TileSideEnum_BOTTOM  1

#define TileSideEnum_FRONT  5

#define TileSideEnum_LEFT  2

#define TileSideEnum_RIGHT  3

#define TileSideEnum_SIDE_COUNT  6

int TileSideEnum_ToFlags(int nValue);

#define TileSideEnum_TOP  0

#define TileSideFlagsEnum_BACK  32

#define TileSideFlagsEnum_BOTTOM  2

#define TileSideFlagsEnum_FRONT  16

cibool TileSideFlagsEnum_HasFlag(int nFlagA, int nFlagB);

#define TileSideFlagsEnum_LEFT  8

#define TileSideFlagsEnum_NONE  0

#define TileSideFlagsEnum_RIGHT  4

#define TileSideFlagsEnum_TOP  1

TimerCi *TimerCi_New(void);
void TimerCi_Delete(TimerCi *self);

void TimerCi_Reset(TimerCi *self);

int TimerCi_Update(TimerCi *self, float dt);

ToCall *ToCall_New(void);
void ToCall_Delete(ToCall *self);

#define TorchTypeEnum_BACK  4

#define TorchTypeEnum_FRONT  3

#define TorchTypeEnum_LEFT  1

#define TorchTypeEnum_NORMAL  0

#define TorchTypeEnum_RIGHT  2

TouchEventArgs *TouchEventArgs_New(void);
void TouchEventArgs_Delete(TouchEventArgs *self);

cibool TouchEventArgs_GetHandled(TouchEventArgs const *self);

int TouchEventArgs_GetId(TouchEventArgs const *self);

int TouchEventArgs_GetX(TouchEventArgs const *self);

int TouchEventArgs_GetY(TouchEventArgs const *self);

void TouchEventArgs_SetHandled(TouchEventArgs *self, cibool value);

void TouchEventArgs_SetId(TouchEventArgs *self, int value);

void TouchEventArgs_SetX(TouchEventArgs *self, int value);

void TouchEventArgs_SetY(TouchEventArgs *self, int value);

TranslatedString *TranslatedString_New(void);
void TranslatedString_Delete(TranslatedString *self);

UnloadRendererChunksCommit *UnloadRendererChunksCommit_New(void);
void UnloadRendererChunksCommit_Delete(UnloadRendererChunksCommit *self);

void UnloadRendererChunksCommit_Run(UnloadRendererChunksCommit *self);

Unproject *Unproject_New(void);
void Unproject_Delete(Unproject *self);

cibool Unproject_UnProject(Unproject const *self, int winX, int winY, int winZ, float const *model, float const *proj, float const *view, float *objPos);

#define UpDown_DOWN  2

#define UpDown_NONE  0

#define UpDown_UP  1

UriCi *UriCi_New(void);
void UriCi_Delete(UriCi *self);

DictionaryStringString const *UriCi_GetGet(UriCi const *self);

const char *UriCi_GetIp(UriCi const *self);

int UriCi_GetPort(UriCi const *self);

const char *UriCi_GetUrl(UriCi const *self);

/**
 * **
 */
float const *Vec2_Add(float *output, float const *a, float const *b);

/**
 * **
 */
float const *Vec2_CloneIt(float const *a);

/**
 * **
 */
float const *Vec2_Copy(float *output, float const *a);

/**
 * **
 */
float const *Vec2_Create(void);

/**
 * **
 */
float const *Vec2_Cross(float *output, float const *a, float const *b);

/**
 * **
 */
float Vec2_Dist(float const *a, float const *b);

/**
 * **
 */
float Vec2_Distance(float const *a, float const *b);

/**
 * **
 */
float const *Vec2_Div(float *output, float const *a, float const *b);

/**
 * **
 */
float const *Vec2_Divide(float *output, float const *a, float const *b);

/**
 * **
 */
float Vec2_Dot(float const *a, float const *b);

/**
 * **
 */
float const *Vec2_FromValues(float x, float y);

/**
 * **
 */
float Vec2_Len(float const *a);

/**
 * **
 */
float Vec2_Length_(float const *a);

/**
 * **
 */
float const *Vec2_Lerp(float *output, float const *a, float const *b, float t);

/**
 * **
 */
float const *Vec2_Max(float *output, float const *a, float const *b);

/**
 * **
 */
float const *Vec2_Min(float *output, float const *a, float const *b);

/**
 * **
 */
float const *Vec2_Mul(float *output, float const *a, float const *b);

/**
 * **
 */
float const *Vec2_Multiply(float *output, float const *a, float const *b);

/**
 * **
 */
float const *Vec2_Negate(float *output, float const *a);

/**
 * **
 */
float const *Vec2_Normalize(float *output, float const *a);

/**
 * **
 */
float const *Vec2_Scale(float *output, float const *a, float b);

/**
 * **
 */
float const *Vec2_ScaleAndAdd(float *output, float const *a, float const *b, float scale);

/**
 * **
 */
float const *Vec2_Set(float *output, float x, float y);

/**
 * **
 */
float Vec2_SqrDist(float const *a, float const *b);

/**
 * **
 */
float Vec2_SqrLen(float const *a);

/**
 * **
 */
float Vec2_SquaredDistance(float const *a, float const *b);

/**
 * **
 */
float Vec2_SquaredLength(float const *a);

/**
 * **
 */
float const *Vec2_Sub(float *output, float const *a, float const *b);

/**
 * **
 */
float const *Vec2_Subtract(float *output, float const *a, float const *b);

/**
 * **
 */
float const *Vec2_TransformMat2(float *output, float const *a, float const *m);

/**
 * **
 */
float const *Vec2_TransformMat2d(float *output, float const *a, float const *m);

/**
 * **
 */
float const *Vec2_TransformMat3(float *output, float const *a, float const *m);

/**
 * **
 */
float const *Vec2_TransformMat4(float *output, float const *a, float const *m);

/**
 * Adds two vec3's
 * @returns {vec3} out
 * @param output /@param {vec3} out the receiving vector
 * @param a /@param {vec3} a the first operand
 * @param b /@param {vec3} b the second operand
 */
float const *Vec3_Add(float *output, float const *a, float const *b);

/**
 * Creates a new vec3 initialized with values from an existing vector
 * Returns {vec3} a new 3D vector
 * @param a a vector to clone
 */
float *Vec3_CloneIt(float const *a);

/**
 * Copy the values from one vec3 to another
 * @returns {vec3} out
 * @param output /@param {vec3} out the receiving vector
 * @param a /@param {vec3} a the source vector
 */
float const *Vec3_Copy(float *output, float const *a);

/**
 * Creates a new, empty vec3
 * Returns {vec3} a new 3D vector.
 */
float *Vec3_Create(void);

/**
 * Computes the cross product of two vec3's
 * @returns {vec3} out
 * @param output /@param {vec3} out the receiving vector
 * @param a /@param {vec3} a the first operand
 * @param b /@param {vec3} b the second operand
 */
float const *Vec3_Cross(float *output, float const *a, float const *b);

/**
 * Alias for {@link vec3.distance}
 */
float Vec3_Dist(float const *a, float const *b);

/**
 * Calculates the euclidian distance between two vec3's
 * @returns {Number} distance between a and b
 * @param a /@param {vec3} a the first operand
 * @param b /@param {vec3} b the second operand
 */
float Vec3_Distance(float const *a, float const *b);

/**
 * Alias for {@link vec3.divide}
 */
float const *Vec3_Div(float *output, float const *a, float const *b);

/**
 * Divides two vec3's
 * @returns {vec3} out
 * @param output /@param {vec3} out the receiving vector
 * @param a /@param {vec3} a the first operand
 * @param b /@param {vec3} b the second operand
 */
float const *Vec3_Divide(float *output, float const *a, float const *b);

/**
 * Calculates the dot product of two vec3's
 * @returns {Number} dot product of a and b
 * @param a /@param {vec3} a the first operand
 * @param b /@param {vec3} b the second operand
 */
float Vec3_Dot(float const *a, float const *b);

/**
 * Creates a new vec3 initialized with the given values
 * Returns {vec3} a new 3D vector
 * @param x X component
 * @param y Y component
 * @param z Z component
 */
float *Vec3_FromValues(float x, float y, float z);

/**
 * Alias for {@link vec3.length}
 */
float Vec3_Len(float const *a);

/**
 * Calculates the length of a vec3
 * @returns {Number} length of a
 * @param a /@param {vec3} a vector to calculate length of
 */
float Vec3_Length_(float const *a);

/**
 * Performs a linear interpolation between two vec3's
 * @returns {vec3} out
 * @param output /@param {vec3} out the receiving vector
 * @param a /@param {vec3} a the first operand
 * @param b /@param {vec3} b the second operand
 * @param t /@param {Number} t interpolation amount between the two inputs
 */
float const *Vec3_Lerp(float *output, float const *a, float const *b, float t);

/**
 * Returns the maximum of two vec3's
 * @returns {vec3} out
 * @param output /@param {vec3} out the receiving vector
 * @param a /@param {vec3} a the first operand
 * @param b /@param {vec3} b the second operand
 */
float const *Vec3_Max(float *output, float const *a, float const *b);

/**
 * Returns the minimum of two vec3's
 * @returns {vec3} out
 * @param output /@param {vec3} out the receiving vector
 * @param a /@param {vec3} a the first operand
 * @param b /@param {vec3} b the second operand
 */
float const *Vec3_Min(float *output, float const *a, float const *b);

/**
 * Alias for {@link vec3.multiply}
 */
float const *Vec3_Mul(float *output, float const *a, float const *b);

/**
 * Multiplies two vec3's
 * @returns {vec3} out
 * @param output /@param {vec3} out the receiving vector
 * @param a /@param {vec3} a the first operand
 * @param b /@param {vec3} b the second operand
 */
float const *Vec3_Multiply(float *output, float const *a, float const *b);

/**
 * Negates the components of a vec3
 * @returns {vec3} out
 * @param output /@param {vec3} out the receiving vector
 * @param a /@param {vec3} a vector to negate
 */
float const *Vec3_Negate(float *output, float const *a);

/**
 * Normalize a vec3
 * @returns {vec3} out
 * @param output /@param {vec3} out the receiving vector
 * @param a /@param {vec3} a vector to normalize
 */
float const *Vec3_Normalize(float *output, float const *a);

/**
 * Scales a vec3 by a scalar number
 * @returns {vec3} out
 * @param output /@param {vec3} out the receiving vector
 * @param a /@param {vec3} a the vector to scale
 * @param b /@param {Number} b amount to scale the vector by
 */
float const *Vec3_Scale(float *output, float const *a, float b);

/**
 * Adds two vec3's after scaling the second operand by a scalar value
 * @returns {vec3} out
 * @param output /@param {vec3} out the receiving vector
 * @param a /@param {vec3} a the first operand
 * @param b /@param {vec3} b the second operand
 * @param scale /@param {Number} scale the amount to scale b by before adding
 */
float const *Vec3_ScaleAndAdd(float *output, float const *a, float const *b, float scale);

/**
 * Set the components of a vec3 to the given values
 * @returns {vec3} out
 * @param output /@param {vec3} out the receiving vector
 * @param x /@param {Number} x X component
 * @param y /@param {Number} y Y component
 * @param z /@param {Number} z Z component
 */
float const *Vec3_Set(float *output, float x, float y, float z);

/**
 * Alias for {@link vec3.squaredDistance}
 * @function
 */
float Vec3_SqrDist(float const *a, float const *b);

/**
 * Alias for {@link vec3.squaredLength}
 */
float Vec3_SqrLen(float const *a);

/**
 * Calculates the squared euclidian distance between two vec3's
 * @returns {Number} squared distance between a and b
 * @param a /@param {vec3} a the first operand
 * @param b /@param {vec3} b the second operand
 */
float Vec3_SquaredDistance(float const *a, float const *b);

/**
 * Calculates the squared length of a vec3
 * @returns {Number} squared length of a
 * @param a /@param {vec3} a vector to calculate squared length of
 */
float Vec3_SquaredLength(float const *a);

/**
 * Alias for {@link vec3.subtract}
 * @function
 */
float const *Vec3_Sub(float *output, float const *a, float const *b);

/**
 * Subtracts vector b from vector a
 * @returns {vec3} out
 * @param output /@param {vec3} out the receiving vector
 * @param a /@param {vec3} a the first operand
 * @param b /@param {vec3} b the second operand
 */
float const *Vec3_Substract(float *output, float const *a, float const *b);

/**
 * Transforms the vec3 with a mat3.
 * @returns {vec3} out
 * @param output /@param {vec3} out the receiving vector
 * @param a /@param {vec3} a the vector to transform
 * @param m /@param {mat4} m the 3x3 matrix to transform with
 */
float const *Vec3_TransformMat3(float *output, float const *a, float const *m);

/**
 * /Transforms the vec3 with a mat4.
 * /4th vector component is implicitly '1'
 * /@returns {vec3} out
 * @param output /@param {vec3} out the receiving vector
 * @param a /@param {vec3} a the vector to transform
 * @param m /@param {mat4} m matrix to transform with
 */
float const *Vec3_TransformMat4(float *output, float const *a, float const *m);

/**
 * Transforms the vec3 with a quat
 * @returns {vec3} out
 * @param output /@param {vec3} out the receiving vector
 * @param a /@param {vec3} a the vector to transform
 * @param q /@param {quat} q quaternion to transform with
 */
float const *Vec3_TransformQuat(float *output, float const *a, float const *q);

/**
 * /Perform some operation over an array of vec3s.
 * /@param {Array} a the array of vectors to iterate over
 * /@param {Number} stride Number of elements between the start of each vec3. If 0 assumes tightly packed
 * /@param {Number} offset Number of elements to skip at the beginning of the array
 * /@param {Number} count Number of vec3s to iterate over. If 0 iterates over entire array
 * /@param {Function} fn Function to call for each vector in the array
 * /@param {Object} [arg] additional argument to pass to fn
 * /@returns {Array} a
 * /
 * / Returns a string representation of a vector
 * /
 * / @param {vec3} vec vector to represent as a string
 * / @returns {String} string representation of the vector
 */
const char *Vec3_str(float const *a);

/**
 * **
 */
float const *Vec4_Add(float *output, float const *a, float const *b);

/**
 * **
 */
float const *Vec4_CloneIt(float const *a);

/**
 * **
 */
float const *Vec4_Copy(float *output, float const *a);

/**
 * **
 */
float const *Vec4_Create(void);

/**
 * **
 */
float Vec4_Dist(float const *a, float const *b);

/**
 * **
 */
float Vec4_Distance(float const *a, float const *b);

/**
 * **
 */
float const *Vec4_Div(float *output, float const *a, float const *b);

/**
 * **
 */
float const *Vec4_Divide(float *output, float const *a, float const *b);

/**
 * **
 */
float Vec4_Dot(float const *a, float const *b);

/**
 * **
 */
float const *Vec4_FromValues(float x, float y, float z, float w);

/**
 * **
 */
float Vec4_Len(float const *a);

/**
 * **
 */
float Vec4_Length_(float const *a);

/**
 * **
 */
float const *Vec4_Lerp(float *output, float const *a, float const *b, float t);

/**
 * **
 */
float const *Vec4_Max(float *output, float const *a, float const *b);

/**
 * **
 */
float const *Vec4_Min(float *output, float const *a, float const *b);

/**
 * **
 */
float const *Vec4_Mul(float *output, float const *a, float const *b);

/**
 * **
 */
float const *Vec4_Multiply(float *output, float const *a, float const *b);

/**
 * **
 */
float const *Vec4_Negate(float *output, float const *a);

/**
 * **
 */
float const *Vec4_Normalize(float *output, float const *a);

/**
 * **
 */
float const *Vec4_Scale(float *output, float const *a, float b);

/**
 * **
 */
float const *Vec4_ScaleAndAdd(float *output, float const *a, float const *b, float scale);

/**
 * **
 */
float const *Vec4_Set(float *output, float x, float y, float z, float w);

/**
 * **
 */
float Vec4_SqrDist(float const *a, float const *b);

/**
 * **
 */
float Vec4_SqrLen(float const *a);

/**
 * **
 */
float Vec4_SquaredDistance(float const *a, float const *b);

/**
 * **
 */
float Vec4_SquaredLength(float const *a);

/**
 * **
 */
float const *Vec4_Sub(float *output, float const *a, float const *b);

/**
 * **
 */
float const *Vec4_Subtract(float *output, float const *a, float const *b);

/**
 * **
 */
float const *Vec4_TransformMat4(float *output, float const *a, float const *m);

/**
 * **
 */
float const *Vec4_transformQuat(float *output, float const *a, float const *q);

VecCito3i *VecCito3i_New(void);
void VecCito3i_Delete(VecCito3i *self);

void VecCito3i_Add(VecCito3i const *self, int _x, int _y, int _z, VecCito3i *result);

VecCito3i const *VecCito3i_CitoCtr(int _x, int _y, int _z);

Vector3Float *Vector3Float_New(void);
void Vector3Float_Delete(Vector3Float *self);

Vector3IntRef *Vector3IntRef_New(void);
void Vector3IntRef_Delete(Vector3IntRef *self);

Vector3Ref *Vector3Ref_New(void);
void Vector3Ref_Delete(Vector3Ref *self);

float Vector3Ref_GetX(Vector3Ref const *self);

float Vector3Ref_GetY(Vector3Ref const *self);

float Vector3Ref_GetZ(Vector3Ref const *self);

void VectorTool_ToVectorInFixedSystem(float dx, float dy, float dz, float orientationx, float orientationy, Vector3Ref *output);

#define VehicleDirection12Flags_DOWN_LEFT_DOWN  256

#define VehicleDirection12Flags_DOWN_LEFT_LEFT  512

#define VehicleDirection12Flags_DOWN_RIGHT_DOWN  1024

#define VehicleDirection12Flags_DOWN_RIGHT_RIGHT  2048

#define VehicleDirection12Flags_HORIZONTAL_LEFT  1

#define VehicleDirection12Flags_HORIZONTAL_RIGHT  2

#define VehicleDirection12Flags_NONE  0

#define VehicleDirection12Flags_UP_LEFT_LEFT  32

#define VehicleDirection12Flags_UP_LEFT_UP  16

#define VehicleDirection12Flags_UP_RIGHT_RIGHT  128

#define VehicleDirection12Flags_UP_RIGHT_UP  64

#define VehicleDirection12Flags_VERTICAL_DOWN  8

#define VehicleDirection12Flags_VERTICAL_UP  4

VerticesIndicesToLoad *VerticesIndicesToLoad_New(void);
void VerticesIndicesToLoad_Delete(VerticesIndicesToLoad *self);

VisibleDialog *VisibleDialog_New(void);
void VisibleDialog_Delete(VisibleDialog *self);

#define WearPlace__BOOTS  2

#define WearPlace__GAUNTLET  4

#define WearPlace__HELMET  3

#define WearPlace__MAIN_ARMOR  1

#define WearPlace__RIGHT_HAND  0

WebSocketClient *WebSocketClient_New(void);
void WebSocketClient_Delete(WebSocketClient *self);

NetConnection const *WebSocketClient_Connect(WebSocketClient const *self, const char *ip, int port);

NetIncomingMessage const *WebSocketClient_ReadMessage(WebSocketClient const *self);

void WebSocketClient_SendMessage(WebSocketClient const *self, INetOutgoingMessage const *message, MyNetDeliveryMethod method);

void WebSocketClient_Start(WebSocketClient *self);

WebSocketClientConnection *WebSocketClientConnection_New(void);
void WebSocketClientConnection_Delete(WebSocketClientConnection *self);

cibool WebSocketClientConnection_EqualsConnection(WebSocketClientConnection const *self, NetConnection const *connection);

IPEndPointCi const *WebSocketClientConnection_RemoteEndPoint(WebSocketClientConnection const *self);

void WebSocketClientConnection_SendMessage(WebSocketClientConnection const *self, INetOutgoingMessage const *msg, MyNetDeliveryMethod method, int sequenceChannel);

void WebSocketClientConnection_Update(WebSocketClientConnection const *self);

#define Wire_FIXED32  5

#define Wire_FIXED64  1

#define Wire_LENGTH_DELIMITED  2

#define Wire_VARINT  0

ModelData const *WireframeCube_Get(void);

#ifdef __cplusplus
}
#endif
#endif
