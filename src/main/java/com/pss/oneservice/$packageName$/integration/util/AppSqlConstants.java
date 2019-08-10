package com.pss.oneservice.$packageName$.integration.util;

import static com.pss.oneservice.$packageName$.integration.util.AppConstants.APP_SERVICE_NAME;

/**
 * Class to hold all Application SQL constants
 * 
 * @author $author$
 */
public class AppSqlConstants {

	public static final String GET_ERROR_DETAILS = "SELECT error_msg, response_cd FROM ms_error_codes WHERE error_cd = ? and service_name in('common', '"
			+ APP_SERVICE_NAME + "')";
}