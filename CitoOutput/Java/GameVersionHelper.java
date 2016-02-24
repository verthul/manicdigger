// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class GameVersionHelper
{

	private static int dateToInt(int year, int month, int day)
	{
		return year * 10000 + month * 100 + day;
	}

	private static boolean isVersionDate(GamePlatform platform, String version)
	{
		IntRef versionCharsCount = new IntRef();
		int[] versionChars = platform.stringToCharArray(version, versionCharsCount);
		if (versionCharsCount.value >= 10) {
			if (versionChars[4] == 45 && versionChars[7] == 45) {
				return true;
			}
		}
		return false;
	}

	public static boolean serverVersionAtLeast(GamePlatform platform, String serverGameVersion, int year, int month, int day)
	{
		if (serverGameVersion == null) {
			return true;
		}
		if (GameVersionHelper.versionToInt(platform, serverGameVersion) < GameVersionHelper.dateToInt(year, month, day)) {
			return false;
		}
		return true;
	}

	private static int versionToInt(GamePlatform platform, String version)
	{
		int max = 1000000000;
		if (!GameVersionHelper.isVersionDate(platform, version)) {
			return max;
		}
		FloatRef year = new FloatRef();
		FloatRef month = new FloatRef();
		FloatRef day = new FloatRef();
		if (platform.floatTryParse(StringTools.stringSubstring(platform, version, 0, 4), year)) {
			if (platform.floatTryParse(StringTools.stringSubstring(platform, version, 5, 2), month)) {
				if (platform.floatTryParse(StringTools.stringSubstring(platform, version, 8, 2), day)) {
					int year_ = platform.floatToInt(year.value);
					int month_ = platform.floatToInt(month.value);
					int day_ = platform.floatToInt(day.value);
					return year_ * 10000 + month_ * 100 + day_;
				}
			}
		}
		return max;
	}
}
