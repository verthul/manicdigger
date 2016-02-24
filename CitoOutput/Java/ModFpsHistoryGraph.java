// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class ModFpsHistoryGraph extends ClientMod
{
	public ModFpsHistoryGraph()
	{
		this.one = 1;
		this.drawfpstext = false;
		this.drawfpsgraph = false;
		this.dtHistory = new float[300];
		for (int i = 0; i < 300; i++) {
			this.dtHistory[i] = 0;
		}
		this.todraw = new Draw2dData[300];
		for (int i = 0; i < 300; i++) {
			this.todraw[i] = new Draw2dData();
		}
	}

	private void draw()
	{
		if (this.drawfpsgraph || this.drawfpstext) {
			this.m.orthoMode();
			if (this.drawfpsgraph) {
				this.drawGraph();
			}
			if (this.drawfpstext) {
				this.m.draw2dText(this.fpstext, 20, 20, 11);
			}
			this.m.perspectiveMode();
		}
	}

	private void drawGraph()
	{
		float maxtime = 0;
		for (int i = 0; i < 300; i++) {
			float v = this.dtHistory[i];
			if (v > maxtime) {
				maxtime = v;
			}
		}
		int historyheight = 80;
		int posx = 25;
		int posy = this.m.getWindowHeight() - historyheight - 20;
		int[] colors = new int[2];
		colors[0] = Game.colorFromArgb(255, 0, 0, 0);
		colors[1] = Game.colorFromArgb(255, 255, 0, 0);
		int linecolor = Game.colorFromArgb(255, 255, 255, 255);
		for (int i = 0; i < 300; i++) {
			float time = this.dtHistory[i];
			time = time * 60 * historyheight;
			int c = InterpolationCi.interpolateColor(this.m.getPlatform(), this.one * i / 300, colors, 2);
			this.todraw[i].x1 = posx + i;
			this.todraw[i].y1 = posy - time;
			this.todraw[i].width = 1;
			this.todraw[i].height = time;
			this.todraw[i].inAtlasId = null;
			this.todraw[i].color = c;
		}
		this.m.draw2dTextures(this.todraw, 300, this.m.whiteTexture());
		this.m.draw2dTexture(this.m.whiteTexture(), posx, posy - historyheight, 300, 1, null, linecolor);
		this.m.draw2dTexture(this.m.whiteTexture(), posx, posy - historyheight * this.one * 60 / 75, 300, 1, null, linecolor);
		this.m.draw2dTexture(this.m.whiteTexture(), posx, posy - historyheight * this.one * 60 / 30, 300, 1, null, linecolor);
		this.m.draw2dTexture(this.m.whiteTexture(), posx, posy - historyheight * this.one * 60 / 150, 300, 1, null, linecolor);
		this.m.draw2dText("60", posx, posy - historyheight * this.one * 60 / 60, 6);
		this.m.draw2dText("75", posx, posy - historyheight * this.one * 60 / 75, 6);
		this.m.draw2dText("30", posx, posy - historyheight * this.one * 60 / 30, 6);
		this.m.draw2dText("150", posx, posy - historyheight * this.one * 60 / 150, 6);
	}

	@Override
	public boolean onClientCommand(Game game, ClientCommandArgs args)
	{
		if (args.command.equals("fps")) {
			IntRef argumentsLength = new IntRef();
			String[] arguments = this.m.getPlatform().stringSplit(args.arguments, " ", argumentsLength);
			if (this.m.getPlatform().stringTrim(args.arguments).equals("")) {
				this.drawfpstext = true;
			}
			else if (arguments[0].equals("1")) {
				this.drawfpstext = true;
				this.drawfpsgraph = false;
			}
			else if (arguments[0].equals("2")) {
				this.drawfpstext = true;
				this.drawfpsgraph = true;
			}
			else {
				this.drawfpstext = false;
				this.drawfpsgraph = false;
			}
			return true;
		}
		return false;
	}

	@Override
	public void onKeyDown(Game game, KeyEventArgs args)
	{
		if (args.getKeyCode() == 16) {
			if (!this.drawfpsgraph) {
				this.drawfpstext = true;
				this.drawfpsgraph = true;
			}
			else {
				this.drawfpstext = false;
				this.drawfpsgraph = false;
			}
		}
	}

	@Override
	public void onNewFrame(Game game, NewFrameEventArgs args)
	{
		float dt = args.getDt();
		this.updateGraph(dt);
		this.updateTitleFps(dt);
		this.draw();
	}

	@Override
	public void start(ClientModManager modmanager)
	{
		this.m = modmanager;
	}

	private void updateGraph(float dt)
	{
		for (int i = 0; i < 299; i++) {
			this.dtHistory[i] = this.dtHistory[i + 1];
		}
		this.dtHistory[299] = dt;
	}

	private void updateTitleFps(float dt)
	{
		GamePlatform p = this.m.getPlatform();
		this.fpscount++;
		this.longestframedt = MathCi.maxFloat(this.longestframedt, dt);
		float elapsed = this.one * (p.timeMillisecondsFromStart() - this.lasttitleupdateMilliseconds) / 1000;
		if (elapsed >= 1) {
			String fpstext1 = "";
			this.lasttitleupdateMilliseconds = p.timeMillisecondsFromStart();
			fpstext1 = StringTools.stringAppend(p, fpstext1, p.stringFormat("FPS: {0}", p.intToString(p.floatToInt(this.one * this.fpscount / elapsed))));
			fpstext1 = StringTools.stringAppend(p, fpstext1, p.stringFormat(" (min: {0})", p.intToString(p.floatToInt(this.one / this.longestframedt))));
			this.longestframedt = 0;
			this.fpscount = 0;
			this.m.getPerformanceInfo().set("fps", fpstext1);
			String s = "";
			String[] l = new String[64];
			int lCount = 0;
			for (int i = 0; i < this.m.getPerformanceInfo().count; i++) {
				if (this.m.getPerformanceInfo().items[i] == null) {
					continue;
				}
				l[lCount++] = this.m.getPerformanceInfo().items[i].value;
			}
			int perline = 2;
			for (int i = 0; i < lCount; i++) {
				s = StringTools.stringAppend(p, s, l[i]);
				if (i % perline == 0 && i != lCount - 1) {
					s = StringTools.stringAppend(p, s, ", ");
				}
				if (i % perline != 0) {
					s = StringTools.stringAppend(p, s, "\n");
				}
			}
			this.fpstext = s;
		}
	}
	private boolean drawfpsgraph;
	private boolean drawfpstext;
	private float[] dtHistory;
	private int fpscount;
	private String fpstext;
	private int lasttitleupdateMilliseconds;
	private float longestframedt;
	private ClientModManager m;
	private float one;
	private Draw2dData[] todraw;
}
