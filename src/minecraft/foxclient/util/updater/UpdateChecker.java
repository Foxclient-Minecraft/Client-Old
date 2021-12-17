package foxclient.util.updater;

import foxclient.util.APIUtil;

public class UpdateChecker {
	
	private static final String URL = "https://danidev819.github.io/foxclient/api/version.json";
	
	public static boolean shouldUpdate() {
		Version CurrentVersion = new Version("3.0");
		Version LatestVersion = new Version(APIUtil.getJSONResponse(URL).get("latest").getAsString());
		if(CurrentVersion.compareTo(LatestVersion) == -1) {
			return true;
		} else if (CurrentVersion.compareTo(LatestVersion) == 1 | CurrentVersion.equals(LatestVersion)) {
			return true;
		}
		return false;
	}

}
