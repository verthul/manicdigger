// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class BlockOctreeSearcher
{
	public BlockOctreeSearcher()
	{
		this.intersection = new Intersection();
		this.pool = new Box3D[10000];
		for (int i = 0; i < 10000; i++) {
			this.pool[i] = new Box3D();
		}
		this.listpool = new ListBox3d[50];
		for (int i = 0; i < 50; i++) {
			this.listpool[i] = new ListBox3d();
			this.listpool[i].arr = new Box3D[1000];
		}
		this.l = new BlockPosSide[1024];
		this.lCount = 0;
		this.currentHit = new float[3];
	}

	public final boolean boxHit(Box3D box)
	{
		this.currentHit[0] = 0;
		this.currentHit[1] = 0;
		this.currentHit[2] = 0;
		return Intersection.checkLineBox(box, this.currentLine, this.currentHit);
	}

	private ListBox3d children(Box3D box)
	{
		ListBox3d l = this.newListBox3d();
		l.count = 8;
		Box3D[] c = l.arr;
		for (int i = 0; i < 8; i++) {
			c[i] = this.newBox3d();
		}
		float x = box.minEdge[0];
		float y = box.minEdge[1];
		float z = box.minEdge[2];
		float size = box.lengthX() / 2;
		c[0].set(x, y, z, size);
		c[1].set(x + size, y, z, size);
		c[2].set(x, y, z + size, size);
		c[3].set(x + size, y, z + size, size);
		c[4].set(x, y + size, z, size);
		c[5].set(x + size, y + size, z, size);
		c[6].set(x, y + size, z + size, size);
		c[7].set(x + size, y + size, z + size, size);
		return l;
	}

	public final BlockPosSide[] lineIntersection(DelegateIsBlockEmpty isEmpty, DelegateGetBlockHeight getBlockHeight, Line3D line, IntRef retCount)
	{
		this.lCount = 0;
		this.currentLine = line;
		this.currentHit[0] = 0;
		this.currentHit[1] = 0;
		this.currentHit[2] = 0;
		ListBox3d l1 = this.search(PredicateBox3DHit.create(this));
		for (int i = 0; i < l1.count; i++) {
			Box3D node = l1.arr[i];
			float[] hit = this.currentHit;
			float x = node.minEdge[0];
			float y = node.minEdge[2];
			float z = node.minEdge[1];
			if (!isEmpty.isBlockEmpty(this.platform.floatToInt(x), this.platform.floatToInt(y), this.platform.floatToInt(z))) {
				Box3D node2 = new Box3D();
				node2.minEdge = Vec3.cloneIt(node.minEdge);
				node2.maxEdge = Vec3.cloneIt(node.maxEdge);
				node2.maxEdge[1] = node2.minEdge[1] + getBlockHeight.getBlockHeight(this.platform.floatToInt(x), this.platform.floatToInt(y), this.platform.floatToInt(z));
				BlockPosSide b = new BlockPosSide();
				float[] hit2 = new float[3];
				float[] dir = new float[3];
				dir[0] = line.end[0] - line.start[0];
				dir[1] = line.end[1] - line.start[1];
				dir[2] = line.end[2] - line.start[2];
				boolean ishit = Intersection.hitBoundingBox(node2.minEdge, node2.maxEdge, line.start, dir, hit2);
				if (ishit) {
					b.blockPos = Vec3.fromValues(this.platform.floatToInt(x), this.platform.floatToInt(z), this.platform.floatToInt(y));
					b.collisionPos = hit2;
					this.l[this.lCount++] = b;
				}
			}
		}
		BlockPosSide[] ll = new BlockPosSide[this.lCount];
		for (int i = 0; i < this.lCount; i++) {
			ll[i] = this.l[i];
		}
		retCount.value = this.lCount;
		return ll;
	}

	private ListBox3d search(PredicateBox3D query)
	{
		this.pool_i = 0;
		this.listpool_i = 0;
		if (this.startBox.lengthX() == 0 && this.startBox.lengthY() == 0 && this.startBox.lengthZ() == 0) {
			return new ListBox3d();
		}
		return this.searchPrivate(query, this.startBox);
	}

	private ListBox3d searchPrivate(PredicateBox3D query, Box3D box)
	{
		if (box.lengthX() == 1) {
			ListBox3d l1 = this.newListBox3d();
			l1.count = 1;
			l1.arr[0] = box;
			return l1;
		}
		ListBox3d l = this.newListBox3d();
		l.count = 0;
		ListBox3d children = this.children(box);
		for (int k = 0; k < children.count; k++) {
			Box3D child = children.arr[k];
			if (query.hit(child)) {
				ListBox3d l2 = this.searchPrivate(query, child);
				for (int i = 0; i < l2.count; i++) {
					Box3D n = l2.arr[i];
					l.arr[l.count++] = n;
				}
				this.recycleListBox3d(l2);
			}
		}
		this.recycleListBox3d(children);
		return l;
	}
	Box3D startBox;
	private float[] currentHit;
	private Line3D currentLine;
	private Intersection intersection;
	private BlockPosSide[] l;
	private int lCount;
	private ListBox3d[] listpool;
	private int listpool_i;

	private Box3D newBox3d()
	{
		return this.pool[this.pool_i++];
	}

	private ListBox3d newListBox3d()
	{
		ListBox3d l = this.listpool[this.listpool_i++];
		l.count = 0;
		return l;
	}
	GamePlatform platform;
	private Box3D[] pool;
	private int pool_i;

	private final void recycleBox3d(Box3D l)
	{
		this.pool_i--;
		this.pool[this.pool_i] = l;
	}

	private void recycleListBox3d(ListBox3d l)
	{
		this.listpool_i--;
		this.listpool[this.listpool_i] = l;
	}
}
