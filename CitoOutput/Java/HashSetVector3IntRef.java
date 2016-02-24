// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class HashSetVector3IntRef
{
	public HashSetVector3IntRef()
	{
		this.max = 16;
		this.start();
	}

	public final void set(Vector3IntRef value)
	{
		int i = 0;
		for (i = 0; i < this.max; i++) {
			if (this.values[i] == null) {
				break;
			}
			if (this.values[i].x == value.x && this.values[i].y == value.y && this.values[i].z == value.z) {
				return;
			}
		}
		this.values[i] = Vector3IntRef.create(value.x, value.y, value.z);
	}

	public final void start()
	{
		this.values = new Vector3IntRef[this.max];
	}
	int max;
	Vector3IntRef[] values;
}
