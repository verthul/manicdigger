// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public abstract class GamePlatform
{

	public abstract void addOnCrash(OnCrashHandler handler);

	public abstract void addOnKeyEvent(KeyEventHandler handler);

	public abstract void addOnMouseEvent(MouseEventHandler handler);

	public abstract void addOnNewFrame(NewFrameHandler handler);

	public abstract void addOnTouchEvent(TouchEventHandler handler);

	public abstract void applicationDoEvents();

	public abstract AudioCi audioCreate(AudioData data);

	public abstract AudioData audioDataCreate(byte[] data, int dataLength);

	public abstract boolean audioDataLoaded(AudioData data);

	public abstract void audioDelete(AudioCi audioCi);

	public abstract boolean audioFinished(AudioCi audio);

	public abstract void audioPause(AudioCi audio);

	public abstract void audioPlay(AudioCi audio);

	public abstract void audioSetPosition(AudioCi audio, float x, float y, float z);

	public abstract void audioUpdateListener(float posX, float posY, float posZ, float orientX, float orientY, float orientZ);

	public abstract AviWriterCi aviWriterCreate();

	public abstract void bindTexture2d(int texture);

	public abstract BitmapCi bitmapCreate(int width, int height);

	public abstract BitmapCi bitmapCreateFromPng(byte[] data, int dataLength);

	public abstract void bitmapDelete(BitmapCi bmp);

	public abstract float bitmapGetHeight(BitmapCi bmp);

	public abstract void bitmapGetPixelsArgb(BitmapCi bitmap, int[] bmpPixels);

	public abstract float bitmapGetWidth(BitmapCi bmp);

	public abstract void bitmapSetPixelsArgb(BitmapCi bmp, int[] pixels);

	public abstract int byteArrayLength(byte[] arr);

	public abstract EnetNetConnection castToEnetNetConnection(NetConnection connection);

	public abstract PlayerInterpolationState castToPlayerInterpolationState(InterpolatedObject a);

	public abstract void changeResolution(int width, int height, int bitsPerPixel, float refreshRate);

	public abstract String charArrayToString(int[] charArray, int length);

	public abstract boolean chatLog(String servername, String p);

	public abstract boolean clipboardContainsText();

	public abstract String clipboardGetText();

	public abstract void clipboardSetText(String s);

	public abstract void consoleWriteLine(String p);

	public abstract Model createModel(ModelData modelData);

	public abstract BitmapCi createTextTexture(Text_ t);

	public abstract String decodeHTMLEntities(String htmlencodedstring);

	public abstract void deleteModel(Model model);

	public abstract String[] directoryGetFiles(String path, IntRef length);

	public abstract void drawModel(Model model);

	public abstract void drawModelData(ModelData data);

	public abstract void drawModels(Model[] model, int count);

	public abstract boolean enetAvailable();

	public abstract EnetHost enetCreateHost();

	public abstract boolean enetHostCheckEvents(EnetHost host, EnetEventRef event_);

	public abstract EnetPeer enetHostConnect(EnetHost host, String hostName, int port, int data, int channelLimit);

	public abstract void enetHostInitialize(EnetHost host, IPEndPointCi address, int peerLimit, int channelLimit, int incomingBandwidth, int outgoingBandwidth);

	public abstract void enetHostInitializeServer(EnetHost host, int port, int peerLimit);

	public abstract boolean enetHostService(EnetHost host, int timeout, EnetEventRef enetEvent);

	public abstract void enetPeerSend(EnetPeer peer, byte channelID, byte[] data, int dataLength, int flags);

	public abstract void exit();

	public abstract boolean exitAvailable();

	public abstract void exitMousePointerLock();

	public abstract String fileName(String fullpath);

	public abstract String fileOpenDialog(String extension, String extensionName, String initialDirectory);

	public abstract String[] fileReadAllLines(String path, IntRef length);

	public abstract float floatModulo(float a, int b);

	public abstract float floatParse(String value);

	public abstract int floatToInt(float value);

	public abstract String floatToString(float value);

	public abstract boolean floatTryParse(String s, FloatRef ret);

	public abstract boolean focused();

	public abstract void gLDeleteTexture(int id);

	public abstract void gLDisableAlphaTest();

	public abstract void gLEnableAlphaTest();

	public abstract void gLLineWidth(int width);

	public abstract int getCanvasHeight();

	public abstract int getCanvasWidth();

	public abstract DisplayResolutionCi getDisplayResolutionDefault();

	public abstract DisplayResolutionCi[] getDisplayResolutions(IntRef resolutionsCount);

	public abstract String getGameVersion();

	public abstract String getLanguageIso6391();

	public abstract Preferences getPreferences();

	public abstract int getWindowState();

	public abstract void glClearColorBufferAndDepthBuffer();

	public abstract void glClearColorRgbaf(float r, float g, float b, float a);

	public abstract void glClearDepthBuffer();

	public abstract void glColorMaterialFrontAndBackAmbientAndDiffuse();

	public abstract void glCullFaceBack();

	public abstract void glDepthMask(boolean flag);

	public abstract void glDisableCullFace();

	public abstract void glDisableDepthTest();

	public abstract void glDisableFog();

	public abstract void glEnableColorMaterial();

	public abstract void glEnableCullFace();

	public abstract void glEnableDepthTest();

	public abstract void glEnableFog();

	public abstract void glEnableLighting();

	public abstract void glEnableTexture2d();

	public abstract void glFogFogColor(int r, int g, int b, int a);

	public abstract void glFogFogDensity(float density);

	public abstract void glFogFogModeExp2();

	public abstract int glGetMaxTextureSize();

	public abstract void glHintFogHintNicest();

	public abstract void glLightModelAmbient(int r, int g, int b);

	public abstract void glShadeModelSmooth();

	public abstract void glViewport(int x, int y, int width, int height);

	public abstract BitmapCi grabScreenshot();

	public abstract byte[] gzipCompress(byte[] data, int dataLength, IntRef retLength);

	public abstract void gzipDecompress(byte[] compressed, int compressedLength, byte[] ret);

	public abstract void initShaders();

	public abstract int intParse(String value);

	public abstract String intToString(int value);

	public abstract boolean isCached(String md5);

	public abstract boolean isChecksum(String checksum);

	public abstract boolean isDebuggerAttached();

	public abstract boolean isFastSystem();

	public abstract boolean isMousePointerLocked();

	public abstract boolean isSmallScreen();

	public abstract boolean isValidTypingChar(int c);

	public abstract String keyName(int key);

	public abstract Asset loadAssetFromCache(String md5);

	public abstract void loadAssetsAsyc(AssetList list, FloatRef progress);

	public abstract int loadTextureFromBitmap(BitmapCi bmp);

	public abstract float mathAcos(float p);

	public abstract float mathCos(float a);

	public abstract float mathSin(float a);

	public abstract float mathSqrt(float value);

	public abstract float mathTan(float p);

	public abstract void messageBoxShowError(String text, String caption);

	public abstract MonitorObject monitorCreate();

	public abstract void monitorEnter(MonitorObject monitorObject);

	public abstract void monitorExit(MonitorObject monitorObject);

	public abstract boolean mouseCursorIsVisible();

	public abstract void mouseCursorSetVisible(boolean value);

	public abstract boolean multithreadingAvailable();

	public abstract void openLinkInBrowser(String url);

	public abstract UriCi parseUri(String uri);

	public abstract String pathCombine(String part1, String part2);

	public abstract String pathSavegames();

	public abstract String pathStorage();

	public abstract String queryStringValue(String key);

	public abstract void queueUserWorkItem(Action_ action);

	public abstract RandomCi randomCreate();

	public abstract String[] readAllLines(String p, IntRef retCount);

	public abstract void requestMousePointerLock();

	public abstract void restoreWindowCursor();

	public abstract void saveAssetToCache(Asset tosave);

	public abstract void saveScreenshot();

	public abstract void setMatrixUniformModelView(float[] mvMatrix);

	public abstract void setMatrixUniformProjection(float[] pMatrix);

	public abstract void setPreferences(Preferences preferences);

	public abstract void setTextRendererFont(int fontID);

	public abstract void setTitle(String applicationname);

	public abstract void setVSync(boolean enabled);

	public abstract void setWindowCursor(int hotx, int hoty, int sizex, int sizey, byte[] imgdata, int imgdataLength);

	public abstract void setWindowState(int value);

	public abstract void showKeyboard(boolean show);

	public abstract boolean singlePlayerServerAvailable();

	public abstract void singlePlayerServerDisable();

	public abstract void singlePlayerServerExit();

	public abstract DummyNetwork singlePlayerServerGetNetwork();

	public abstract boolean singlePlayerServerLoaded();

	public abstract void singlePlayerServerStart(String saveFilename);

	public abstract boolean stringContains(String a, String b);

	public abstract boolean stringEmpty(String data);

	public abstract String stringFormat(String format, String arg0);

	public abstract String stringFormat2(String format, String arg0, String arg1);

	public abstract String stringFormat3(String format, String arg0, String arg1, String arg2);

	public abstract String stringFormat4(String format, String arg0, String arg1, String arg2, String arg3);

	public abstract String stringFromUtf8ByteArray(byte[] value, int valueLength);

	public abstract int stringIndexOf(String s, String p);

	public abstract String stringJoin(String[] value, String separator);

	public abstract String stringReplace(String s, String from, String to);

	public abstract String[] stringSplit(String value, String separator, IntRef returnLength);

	public abstract boolean stringStartsWithIgnoreCase(String a, String b);

	public abstract int[] stringToCharArray(String s, IntRef length);

	public abstract String stringToLower(String p);

	public abstract byte[] stringToUtf8ByteArray(String s, IntRef retLength);

	public abstract String stringTrim(String value);

	public abstract boolean tcpAvailable();

	public abstract void tcpConnect(String ip, int port, BoolRef connected);

	public abstract int tcpReceive(byte[] data, int dataLength);

	public abstract void tcpSend(byte[] data, int length);

	public abstract void textSize(String text, float fontSize, IntRef outWidth, IntRef outHeight);

	public abstract void threadSpinWait(int iterations);

	public abstract void throwException(String message);

	public abstract void thumbnailDownloadAsync(String ip, int port, ThumbnailResponseCi response);

	public abstract int timeMillisecondsFromStart();

	public abstract String timestamp();

	public abstract void webClientDownloadDataAsync(String url, HttpResponseCi response);

	public abstract void webClientUploadDataAsync(String url, byte[] data, int dataLength, HttpResponseCi response);

	public abstract boolean webSocketAvailable();

	public abstract void webSocketConnect(String ip, int port);

	public abstract int webSocketReceive(byte[] data, int dataLength);

	public abstract void webSocketSend(byte[] data, int dataLength);

	public abstract void windowExit();
}
