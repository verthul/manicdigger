// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class ModAutoCamera extends ClientMod
{

	private float distance(CameraPoint a, CameraPoint b)
	{
		float dx = a.positionGlX - b.positionGlX;
		float dy = a.positionGlY - b.positionGlY;
		float dz = a.positionGlZ - b.positionGlZ;
		return this.p.mathSqrt(dx * dx + dy * dy + dz * dz);
	}

	@Override
	public boolean onClientCommand(Game game, ClientCommandArgs args)
	{
		if (args.command.equals("cam")) {
			IntRef argumentsLength = new IntRef();
			String[] arguments = this.p.stringSplit(args.arguments, " ", argumentsLength);
			if (this.p.stringTrim(args.arguments).equals("")) {
				this.m.displayNotification("&6AutoCamera help.");
				this.m.displayNotification("&6.cam p&f - add a point to path");
				this.m.displayNotification("&6.cam start [real seconds]&f - play the path");
				this.m.displayNotification("&6.cam rec [real seconds] [video seconds]&f - play and record to .avi file");
				this.m.displayNotification("&6.cam stop&f - stop playing and recording");
				this.m.displayNotification("&6.cam clear&f - remove all points from path");
				this.m.displayNotification("&6.cam save&f - copy path points to clipboard");
				this.m.displayNotification("&6.cam load [points]&f - load path points");
				return true;
			}
			if (arguments[0].equals("p")) {
				this.m.displayNotification("Point defined.");
				CameraPoint point = new CameraPoint();
				point.positionGlX = this.m.getLocalPositionX();
				point.positionGlY = this.m.getLocalPositionY();
				point.positionGlZ = this.m.getLocalPositionZ();
				point.orientationGlX = this.m.getLocalOrientationX();
				point.orientationGlY = this.m.getLocalOrientationY();
				point.orientationGlZ = this.m.getLocalOrientationZ();
				this.cameraPoints[this.cameraPointsCount++] = point;
			}
			if (arguments[0].equals("start") || arguments[0].equals("play") || arguments[0].equals("rec")) {
				if (!this.m.isFreemoveAllowed()) {
					this.m.displayNotification("Free move not allowed.");
					return true;
				}
				if (this.cameraPointsCount == 0) {
					this.m.displayNotification("No points defined. Enter points with \".cam p\" command.");
					return true;
				}
				this.playingSpeed = 1;
				float totalRecTime = -1;
				if (arguments[0].equals("rec")) {
					if (argumentsLength.value >= 3) {
						totalRecTime = this.p.floatParse(arguments[2]);
					}
					this.avi = this.m.aviWriterCreate();
					this.avi.open(this.p.stringFormat("{0}.avi", this.p.timestamp()), 60, this.m.getWindowWidth(), this.m.getWindowHeight());
				}
				if (argumentsLength.value >= 2) {
					float totalTime = this.p.floatParse(arguments[1]);
					this.playingSpeed = this.totalDistance() / totalTime;
					if (totalRecTime == -1) {
						this.recspeed = 10;
					}
					else {
						this.recspeed = totalTime / totalRecTime;
					}
				}
				this.playingTime = 0;
				this.firstFrameDone = false;
				this.previousPositionX = this.m.getLocalPositionX();
				this.previousPositionY = this.m.getLocalPositionY();
				this.previousPositionZ = this.m.getLocalPositionZ();
				this.previousOrientationX = this.m.getLocalOrientationX();
				this.previousOrientationY = this.m.getLocalOrientationY();
				this.previousOrientationZ = this.m.getLocalOrientationZ();
				this.m.showGui(0);
				this.previousFreemove = this.m.getFreemove();
				this.m.setFreemove(2);
				this.m.enableCameraControl(false);
			}
			if (arguments[0].equals("stop")) {
				this.m.displayNotification("Camera stopped.");
				this.stop();
			}
			if (arguments[0].equals("clear")) {
				this.m.displayNotification("Camera points cleared.");
				this.cameraPointsCount = 0;
				this.stop();
			}
			if (arguments[0].equals("save")) {
				String s = "1,";
				for (int i = 0; i < this.cameraPointsCount; i++) {
					CameraPoint point = this.cameraPoints[i];
					s = this.p.stringFormat2("{0}{1},", s, this.p.intToString(this.p.floatToInt(point.positionGlX * 100)));
					s = this.p.stringFormat2("{0}{1},", s, this.p.intToString(this.p.floatToInt(point.positionGlY * 100)));
					s = this.p.stringFormat2("{0}{1},", s, this.p.intToString(this.p.floatToInt(point.positionGlZ * 100)));
					s = this.p.stringFormat2("{0}{1},", s, this.p.intToString(this.p.floatToInt(point.orientationGlX * 1000)));
					s = this.p.stringFormat2("{0}{1},", s, this.p.intToString(this.p.floatToInt(point.orientationGlY * 1000)));
					s = this.p.stringFormat2("{0}{1}", s, this.p.intToString(this.p.floatToInt(point.orientationGlZ * 1000)));
					if (i != this.cameraPointsCount - 1) {
						s = this.p.stringFormat("{0},", s);
					}
				}
				this.p.clipboardSetText(s);
				this.m.displayNotification("Camera points copied to clipboard.");
			}
			if (arguments[0].equals("load")) {
				IntRef pointsLength = new IntRef();
				String[] points = this.p.stringSplit(arguments[1], ",", pointsLength);
				int n = (pointsLength.value - 1) / 6;
				this.cameraPointsCount = 0;
				for (int i = 0; i < n; i++) {
					CameraPoint point = new CameraPoint();
					point.positionGlX = this.one * this.p.intParse(points[1 + i * 6 + 0]) / 100;
					point.positionGlY = this.one * this.p.intParse(points[1 + i * 6 + 1]) / 100;
					point.positionGlZ = this.one * this.p.intParse(points[1 + i * 6 + 2]) / 100;
					point.orientationGlX = this.one * this.p.intParse(points[1 + i * 6 + 3]) / 1000;
					point.orientationGlY = this.one * this.p.intParse(points[1 + i * 6 + 4]) / 1000;
					point.orientationGlZ = this.one * this.p.intParse(points[1 + i * 6 + 5]) / 1000;
					this.cameraPoints[this.cameraPointsCount++] = point;
				}
				this.m.displayNotification(this.p.stringFormat("Camera points loaded: {0}", this.p.intToString(n)));
			}
			return true;
		}
		return false;
	}

	@Override
	public void onNewFrame(Game game, NewFrameEventArgs args)
	{
		float dt = args.getDt();
		if (this.playingTime == -1) {
			return;
		}
		this.playingTime += dt;
		float playingDist = this.playingTime * this.playingSpeed;
		this.updateAvi(dt);
		float distA = 0;
		int foundPoint = -1;
		for (int i = 0; i < this.cameraPointsCount - 1; i++) {
			CameraPoint a = this.cameraPoints[i];
			CameraPoint b = this.cameraPoints[i + 1];
			float dist = this.distance(a, b);
			if (playingDist >= distA && playingDist < distA + dist) {
				foundPoint = i;
				break;
			}
			distA += dist;
		}
		if (foundPoint == -1) {
			this.stop();
			return;
		}
		{
			CameraPoint a = this.cameraPoints[foundPoint];
			CameraPoint b = this.cameraPoints[foundPoint + 1];
			CameraPoint aminus = a;
			CameraPoint bplus = b;
			if (foundPoint - 1 >= 0) {
				aminus = this.cameraPoints[foundPoint - 1];
			}
			if (foundPoint + 2 < this.cameraPointsCount) {
				bplus = this.cameraPoints[foundPoint + 2];
			}
			float t = (playingDist - distA) / this.distance(a, b);
			float x = ModAutoCamera.q(t, aminus.positionGlX, a.positionGlX, b.positionGlX, bplus.positionGlX);
			float y = ModAutoCamera.q(t, aminus.positionGlY, a.positionGlY, b.positionGlY, bplus.positionGlY);
			float z = ModAutoCamera.q(t, aminus.positionGlZ, a.positionGlZ, b.positionGlZ, bplus.positionGlZ);
			this.m.setLocalPosition(x, y, z);
			float orientx = ModAutoCamera.q(t, aminus.orientationGlX, a.orientationGlX, b.orientationGlX, bplus.orientationGlX);
			float orienty = ModAutoCamera.q(t, aminus.orientationGlY, a.orientationGlY, b.orientationGlY, bplus.orientationGlY);
			float orientz = ModAutoCamera.q(t, aminus.orientationGlZ, a.orientationGlZ, b.orientationGlZ, bplus.orientationGlZ);
			this.m.setLocalOrientation(orientx, orienty, orientz);
		}
	}

	@Override
	public void start(ClientModManager modmanager)
	{
		this.m = modmanager;
		this.p = modmanager.getPlatform();
		this.one = 1;
		this.cameraPoints = new CameraPoint[256];
		this.cameraPointsCount = 0;
		this.playingTime = -1;
		this.position = new float[3];
		this.orientation = new float[3];
	}

	private void stop()
	{
		this.m.showGui(1);
		this.m.enableCameraControl(true);
		if (this.playingTime != -1) {
			this.m.setFreemove(this.previousFreemove);
			this.m.setLocalPosition(this.previousPositionX, this.previousPositionY, this.previousPositionZ);
			this.m.setLocalOrientation(this.previousOrientationX, this.previousOrientationY, this.previousOrientationZ);
		}
		this.playingTime = -1;
		if (this.avi != null) {
			this.avi.close();
			this.avi = null;
		}
	}

	private float totalDistance()
	{
		float totalDistance = 0;
		for (int i = 0; i < this.cameraPointsCount - 1; i++) {
			CameraPoint a = this.cameraPoints[i];
			CameraPoint b = this.cameraPoints[i + 1];
			float dist = this.distance(a, b);
			totalDistance += dist;
		}
		return totalDistance;
	}

	private void updateAvi(float dt)
	{
		if (this.avi == null) {
			return;
		}
		if (!this.firstFrameDone) {
			this.firstFrameDone = true;
			return;
		}
		this.writeAccum += dt;
		float totalTime = this.playingSpeed * this.totalDistance();
		if (this.writeAccum >= this.one / 60 * this.recspeed) {
			this.writeAccum -= this.one / 60 * this.recspeed;
			BitmapCi bmp = this.m.grabScreenshot();
			this.avi.addFrame(bmp);
			bmp.dispose();
		}
	}
	private AviWriterCi avi;
	private CameraPoint[] cameraPoints;
	private int cameraPointsCount;
	private boolean firstFrameDone;
	private ClientModManager m;
	private float one;
	private float[] orientation;
	private GamePlatform p;
	private float playingSpeed;
	private float playingTime;
	private float[] position;
	private int previousFreemove;
	private float previousOrientationX;
	private float previousOrientationY;
	private float previousOrientationZ;
	private float previousPositionX;
	private float previousPositionY;
	private float previousPositionZ;

	public static float q(float t, float p0, float p1, float p2, float p3)
	{
		float one_ = 1;
		return one_ / 2 * (2 * p1 + (-p0 + p2) * t + (2 * p0 - 5 * p1 + 4 * p2 - p3) * t * t + (-p0 + 3 * p1 - 3 * p2 + p3) * t * t * t);
	}
	private float recspeed;
	private float writeAccum;
}
