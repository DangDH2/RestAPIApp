/**
 * 
 */
package agrex.sforce;

/**
 * @author e9900141
 *
 */
public class SMain {
	public static String SETTING_PATH = "setting.properties";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SResource res = new SResource();
		/**
		 * Read setting.properties files
		 */
		res.setStr_sf_Username(SUtil.readSetting(SConst.SETTING_USERNAME)); // Get
		                                                                    // Salesforce
		                                                                    // Username

		/**
		 * Connect to Salesforce
		 */

		/**
		 * Read file CSV and Map
		 * 
		 */

		/**
		 * Upload to Salesforce
		 */

	}

}
