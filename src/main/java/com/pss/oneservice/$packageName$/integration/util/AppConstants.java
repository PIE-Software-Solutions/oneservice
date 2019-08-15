package com.pss.oneservice.$packageName$.integration.util;

public class AppConstants {
	
	public static final String APP_SERVICE_NAME = "$servicepath$";
	
	public static final String APP_PID_FILE_WRITER_NAME = "oneservice" + APP_SERVICE_NAME + ".pid";
	
	// Application constants
	public static final String[] APP_ALLOWED_SERVICE_PATHS = new String[] { "/$servicepath$/**" };

	// DB Error constants
	public static final String ERROR_CODE_NOT_PRESENT_IN_DB = "Error code not present in DB";

}
