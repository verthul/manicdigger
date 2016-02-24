// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class Intersection
{
	public Intersection()
	{
	}

	/**
	 * &lt;summary&gt;
	 * Warning: randomly returns incorrect hit position (back side of box).
	 * &lt;/summary&gt;
	 * &lt;param name="box"&gt;&lt;/param&gt;
	 * &lt;param name="line"&gt;&lt;/param&gt;
	 * &lt;param name="hit"&gt;&lt;/param&gt;
	 * &lt;returns&gt;&lt;/returns&gt;
	 */
	public static boolean checkLineBox(Box3D box, Line3D line, float[] hit)
	{
		return Intersection.checkLineBox1(box.minEdge, box.maxEdge, line.start, line.end, hit);
	}

	public static boolean checkLineBox1(float[] B1, float[] B2, float[] L1, float[] L2, float[] Hit)
	{
		if (L2[0] < B1[0] && L1[0] < B1[0])
			return false;
		if (L2[0] > B2[0] && L1[0] > B2[0])
			return false;
		if (L2[1] < B1[1] && L1[1] < B1[1])
			return false;
		if (L2[1] > B2[1] && L1[1] > B2[1])
			return false;
		if (L2[2] < B1[2] && L1[2] < B1[2])
			return false;
		if (L2[2] > B2[2] && L1[2] > B2[2])
			return false;
		if (L1[0] > B1[0] && L1[0] < B2[0] && L1[1] > B1[1] && L1[1] < B2[1] && L1[2] > B1[2] && L1[2] < B2[2]) {
			Hit[0] = L1[0];
			Hit[1] = L1[1];
			Hit[2] = L1[2];
			return true;
		}
		if (Intersection.getIntersection(L1[0] - B1[0], L2[0] - B1[0], L1, L2, Hit) && Intersection.inBox(Hit, B1, B2, 1) || Intersection.getIntersection(L1[1] - B1[1], L2[1] - B1[1], L1, L2, Hit) && Intersection.inBox(Hit, B1, B2, 2) || Intersection.getIntersection(L1[2] - B1[2], L2[2] - B1[2], L1, L2, Hit) && Intersection.inBox(Hit, B1, B2, 3) || Intersection.getIntersection(L1[0] - B2[0], L2[0] - B2[0], L1, L2, Hit) && Intersection.inBox(Hit, B1, B2, 1) || Intersection.getIntersection(L1[1] - B2[1], L2[1] - B2[1], L1, L2, Hit) && Intersection.inBox(Hit, B1, B2, 2) || Intersection.getIntersection(L1[2] - B2[2], L2[2] - B2[2], L1, L2, Hit) && Intersection.inBox(Hit, B1, B2, 3))
			return true;
		return false;
	}

	public static float[] checkLineBoxExact(Line3D line, Box3D box)
	{
		float[] dir_ = new float[3];
		dir_[0] = line.end[0] - line.start[0];
		dir_[1] = line.end[1] - line.start[1];
		dir_[2] = line.end[2] - line.start[2];
		float[] hit = new float[3];
		if (!Intersection.hitBoundingBox(box.minEdge, box.maxEdge, line.start, dir_, hit)) {
			return null;
		}
		return hit;
	}

	private static boolean getIntersection(float fDst1, float fDst2, float[] P1, float[] P2, float[] Hit)
	{
		if (fDst1 * fDst2 >= 0)
			return false;
		if (fDst1 == fDst2)
			return false;
		Hit[0] = P1[0] + (P2[0] - P1[0]) * -fDst1 / (fDst2 - fDst1);
		Hit[1] = P1[1] + (P2[1] - P1[1]) * -fDst1 / (fDst2 - fDst1);
		Hit[2] = P1[2] + (P2[2] - P1[2]) * -fDst1 / (fDst2 - fDst1);
		return true;
	}

	public static boolean hitBoundingBox(float[] minB, float[] maxB, float[] origin, float[] dir, float[] coord)
	{
		boolean inside = true;
		byte[] quadrant = new byte[3];
		int i;
		int whichPlane;
		float[] maxT = new float[3];
		float[] candidatePlane = new float[3];
		for (i = 0; i < 3; i++)
			if (origin[i] < minB[i]) {
				quadrant[i] = 1;
				candidatePlane[i] = minB[i];
				inside = false;
			}
			else if (origin[i] > maxB[i]) {
				quadrant[i] = 0;
				candidatePlane[i] = maxB[i];
				inside = false;
			}
			else {
				quadrant[i] = 2;
			}
		if (inside) {
			coord = origin;
			return true;
		}
		for (i = 0; i < 3; i++)
			if ((quadrant[i] & 0xff) != 2 && dir[i] != 0)
				maxT[i] = (candidatePlane[i] - origin[i]) / dir[i];
			else
				maxT[i] = -1;
		whichPlane = 0;
		for (i = 1; i < 3; i++)
			if (maxT[whichPlane] < maxT[i])
				whichPlane = i;
		if (maxT[whichPlane] < 0)
			return false;
		for (i = 0; i < 3; i++)
			if (whichPlane != i) {
				coord[i] = origin[i] + maxT[whichPlane] * dir[i];
				if (coord[i] < minB[i] || coord[i] > maxB[i])
					return false;
			}
			else {
				coord[i] = candidatePlane[i];
			}
		return true;
	}

	private static boolean inBox(float[] Hit, float[] B1, float[] B2, int Axis)
	{
		if (Axis == 1 && Hit[2] > B1[2] && Hit[2] < B2[2] && Hit[1] > B1[1] && Hit[1] < B2[1])
			return true;
		if (Axis == 2 && Hit[2] > B1[2] && Hit[2] < B2[2] && Hit[0] > B1[0] && Hit[0] < B2[0])
			return true;
		if (Axis == 3 && Hit[0] > B1[0] && Hit[0] < B2[0] && Hit[1] > B1[1] && Hit[1] < B2[1])
			return true;
		return false;
	}
}
