// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class TableSerializer
{

	public final void deserialize(GamePlatform p, String data, TableBinding b)
	{
		IntRef linesCount = new IntRef();
		String[] lines = p.readAllLines(data, linesCount);
		String[] header = null;
		IntRef headerLength = new IntRef();
		String current = "";
		int currentI = 0;
		for (int i = 0; i < linesCount.value; i++) {
			String s = p.stringTrim(lines[i]);
			if (s.equals("")) {
				continue;
			}
			if (p.stringStartsWithIgnoreCase(s, "//") || p.stringStartsWithIgnoreCase(s, "#")) {
				continue;
			}
			if (p.stringStartsWithIgnoreCase(s, "section=")) {
				current = p.stringReplace(s, "section=", "");
				String sHeader = p.stringTrim(lines[i + 1]);
				header = p.stringSplit(sHeader, "\t", headerLength);
				i++;
				currentI = 0;
				continue;
			}
			{
				if (header == null) {
					continue;
				}
				IntRef ssLength = new IntRef();
				String[] ss = p.stringSplit(s, "\t", ssLength);
				for (int k = 0; k < ssLength.value; k++) {
					b.set(current, currentI, header[k], ss[k]);
				}
				currentI++;
			}
		}
	}
}
