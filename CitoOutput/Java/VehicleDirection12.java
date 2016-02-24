// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

/**
 * &lt;summary&gt;
 * Each RailDirection on tile can be traversed by train in two directions.
 * &lt;/summary&gt;
 * &lt;example&gt;
 * RailDirection.Horizontal -&gt; VehicleDirection12.HorizontalLeft (vehicle goes left and decreases x position),
 * and VehicleDirection12.HorizontalRight (vehicle goes right and increases x position).
 * &lt;/example&gt;
 */
public interface VehicleDirection12
{
	int HORIZONTAL_LEFT = 0;
	int HORIZONTAL_RIGHT = 1;
	int VERTICAL_UP = 2;
	int VERTICAL_DOWN = 3;
	int UP_LEFT_UP = 4;
	int UP_LEFT_LEFT = 5;
	int UP_RIGHT_UP = 6;
	int UP_RIGHT_RIGHT = 7;
	int DOWN_LEFT_DOWN = 8;
	int DOWN_LEFT_LEFT = 9;
	int DOWN_RIGHT_DOWN = 10;
	int DOWN_RIGHT_RIGHT = 11;
}
