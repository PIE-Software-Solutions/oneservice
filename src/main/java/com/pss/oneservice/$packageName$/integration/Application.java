package com.pss.oneservice.$packageName$.integration;

import static com.pss.oneservice.$packageName$.integration.util.AppConstants.APP_PID_FILE_WRITER_NAME;
import static com.pss.oneservice.$packageName$.integration.util.AppConstants.APP_ALLOWED_SERVICE_PATHS;
import static com.pss.oneservice.$packageName$.integration.util.AppConstants.APP_SERVICE_NAME;
import static com.pss.oneservice.common.integration.util.CommonConstants.ALLOWED_SERVICE_PATHS;
import static com.pss.oneservice.common.integration.util.CommonConstants.SERVICE_NAME;

import com.pss.oneservice.common.integration.annotations.EnableJdbc;
import com.pss.oneservice.common.integration.annotations.OneServiceInjector;

import com.pss.oneservice.common.integration.config.OneServiceInit;

@OneServiceInjector
@EnableJdbc
public class Application {
	
	static {
		ALLOWED_SERVICE_PATHS = APP_ALLOWED_SERVICE_PATHS;
		SERVICE_NAME = APP_SERVICE_NAME;
	}
	
	/**
	 * Spring boot application start run
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			OneServiceInit.initializeObject(Application.class, APP_PID_FILE_WRITER_NAME, args);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
