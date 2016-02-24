// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class CraftingTableTool
{

	public final int[] getOnTable(Vector3IntRef[] table, int tableCount, IntRef retCount)
	{
		int[] ontable = new int[2048];
		int ontableCount = 0;
		for (int i = 0; i < tableCount; i++) {
			Vector3IntRef v = table[i];
			int t = this.d_Map.getBlock(v.x, v.y, v.z + 1);
			ontable[ontableCount++] = t;
		}
		retCount.value = ontableCount;
		return ontable;
	}

	public final Vector3IntRef[] getTable(int posx, int posy, int posz, IntRef retCount)
	{
		Vector3IntRef[] l = new Vector3IntRef[2048];
		int lCount = 0;
		Vector3IntRef[] todo = new Vector3IntRef[2048];
		int todoCount = 0;
		todo[todoCount++] = Vector3IntRef.create(posx, posy, posz);
		for (;;) {
			if (todoCount == 0 || lCount >= 2000) {
				break;
			}
			Vector3IntRef p = todo[todoCount - 1];
			todoCount--;
			if (this.vector3IntRefArrayContains(l, lCount, p)) {
				continue;
			}
			l[lCount++] = p;
			Vector3IntRef a = Vector3IntRef.create(p.x + 1, p.y, p.z);
			if (this.d_Map.getBlock(a.x, a.y, a.z) == this.d_Data.blockIdCraftingTable()) {
				todo[todoCount++] = a;
			}
			Vector3IntRef b = Vector3IntRef.create(p.x - 1, p.y, p.z);
			if (this.d_Map.getBlock(b.x, b.y, b.z) == this.d_Data.blockIdCraftingTable()) {
				todo[todoCount++] = b;
			}
			Vector3IntRef c = Vector3IntRef.create(p.x, p.y + 1, p.z);
			if (this.d_Map.getBlock(c.x, c.y, c.z) == this.d_Data.blockIdCraftingTable()) {
				todo[todoCount++] = c;
			}
			Vector3IntRef d = Vector3IntRef.create(p.x, p.y - 1, p.z);
			if (this.d_Map.getBlock(d.x, d.y, d.z) == this.d_Data.blockIdCraftingTable()) {
				todo[todoCount++] = d;
			}
		}
		retCount.value = lCount;
		return l;
	}

	private boolean vector3IntRefArrayContains(Vector3IntRef[] l, int lCount, Vector3IntRef p)
	{
		for (int i = 0; i < lCount; i++) {
			if (l[i].x == p.x && l[i].y == p.y && l[i].z == p.z) {
				return true;
			}
		}
		return false;
	}
	GameData d_Data;
	IMapStorage2 d_Map;
}
