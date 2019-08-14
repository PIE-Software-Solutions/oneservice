package com.pss.oneservice.$packageName$.integration;

import static com.pss.oneservice.$packageName$.integration.util.AppConstants.APP_PID_FILE_WRITER_NAME;
import static com.pss.oneservice.common.integration.util.CommonConstants.COMMON_PACKAGE_STRUCTURE;
import static com.pss.oneservice.$packageName$.integration.util.AppConstants.APP_ALLOWED_SERVICE_PATHS;
import static com.pss.oneservice.$packageName$.integration.util.AppConstants.APP_PID_FILE_WRITER_NAME;
import static com.pss.oneservice.$packageName$.integration.util.AppConstants.APP_SERVICE_ENABLED_COLUMN;
import static com.pss.oneservice.$packageName$.integration.util.AppConstants.APP_SERVICE_NAME;
import static com.pss.oneservice.$packageName$.integration.util.AppConstants.APP_SERVICE_PWD_COLUMN;
import static com.pss.oneservice.$packageName$.integration.util.AppConstants.APP_SERVICE_ROLE_COLUMN;
import static com.pss.oneservice.$packageName$.integration.util.AppConstants.APP_SERVICE_SERVICE_COLUMN;
import static com.pss.oneservice.$packageName$.integration.util.AppConstants.APP_SERVICE_TABLE;
import static com.pss.oneservice.$packageName$.integration.util.AppConstants.APP_SERVICE_USER_COLUMN;
import static com.pss.oneservice.$packageName$.integration.util.AppConstants.APP_USER_ROLE_TABLE;
import static com.pss.oneservice.$packageName$.integration.util.AppConstants.APP_USER_TABLE;
import static com.pss.oneservice.common.integration.util.CommonConstants.ALLOWED_SERVICE_PATHS;
import static com.pss.oneservice.common.integration.util.CommonConstants.COMMON_PACKAGE_STRUCTURE;
import static com.pss.oneservice.common.integration.util.CommonConstants.COMMON_SERVICE_ENABLED;
import static com.pss.oneservice.common.integration.util.CommonConstants.COMMON_SERVICE_PWD;
import static com.pss.oneservice.common.integration.util.CommonConstants.COMMON_SERVICE_ROLE;
import static com.pss.oneservice.common.integration.util.CommonConstants.COMMON_SERVICE_SERVICE;
import static com.pss.oneservice.common.integration.util.CommonConstants.COMMON_SERVICE_TABLE;
import static com.pss.oneservice.common.integration.util.CommonConstants.COMMON_SERVICE_USER;
import static com.pss.oneservice.common.integration.util.CommonConstants.COMMON_USER_ROLE_TABLE;
import static com.pss.oneservice.common.integration.util.CommonConstants.COMMON_USER_TABLE;
import static com.pss.oneservice.common.integration.util.CommonConstants.SERVICE_NAME;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.ApplicationPidFileWriter;

import com.pss.oneservice.common.integration.config.AppFilter;

@OneServiceInjector
public class Application {
	
	static {
		ALLOWED_SERVICE_PATHS = APP_ALLOWED_SERVICE_PATHS;
		SERVICE_NAME = APP_SERVICE_NAME;
		COMMON_USER_TABLE = APP_USER_TABLE;
		COMMON_USER_ROLE_TABLE = APP_USER_ROLE_TABLE;
		COMMON_SERVICE_TABLE = APP_SERVICE_TABLE;
		COMMON_SERVICE_USER = APP_SERVICE_USER_COLUMN;
		COMMON_SERVICE_PWD = APP_SERVICE_PWD_COLUMN;
		COMMON_SERVICE_ENABLED = APP_SERVICE_ENABLED_COLUMN;
		COMMON_SERVICE_ROLE = APP_SERVICE_ROLE_COLUMN;
		COMMON_SERVICE_SERVICE = APP_SERVICE_SERVICE_COLUMN;
	}
	
	/**
	 * Spring boot application start run
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication springApplication = new SpringApplication(Application.class);
		springApplication.addListeners(new ApplicationPidFileWriter(APP_PID_FILE_WRITER_NAME));
		springApplication.run(args);
	}

}
