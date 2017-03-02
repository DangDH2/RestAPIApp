package agrex.sforce;

import java.util.Properties;

import procesing.Util;

public class SUtil {
	public static Properties prop;

	public static String readSetting(String param) {

		if (prop == null) {

			prop = Util.readSetting(SMain.SETTING_PATH);
		}
		return prop.getProperty(param);
	}
}
