package com.pss.oneservice.$packageName$.integration.controller;

import static com.pss.oneservice.$packageName$.integration.service.$serviceNamecc$Service.populate$serviceNamecc$Response;
import static com.pss.oneservice.common.integration.util.CommonConstants.EXCEPTION_CODE;
import static com.pss.oneservice.common.integration.util.CommonConstants.EXCEPTION_RESPONSE;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.pss.oneservice.$packageName$.integration.model.$serviceNamecc$Request;
import com.pss.oneservice.$packageName$.integration.model.$serviceNamecc$Response;
import com.pss.oneservice.$packageName$.integration.service.$serviceNamecc$Service;
import com.pss.oneservice.common.integration.model.ServiceResponse;
import com.pss.oneservice.common.integration.util.AppLogger;
import org.apache.log4j.BasicConfigurator;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

/**
 * Controller class for Template service
 * 
 * @author $author$
 */
@Repository
public class $serviceNamecc$Controller extends OneServiceController {

	private static final AppLogger LOGGER = new AppLogger($serviceNamecc$Controller.class.getName());

	@Autowired
	private $serviceNamecc$Service $serviceName$Service;

	/**
	 * <!--Controller method stub to write service calls. This method can be
	 * replicated.-->
	 * 
	 * @param $serviceName$Request
	 * @return ServiceResponse
	 */
	@PostMapping(path = "/$serviceName$")
	@ApiOperation(value = "$serviceNamecc$", response = $serviceNamecc$Response.class)
	public ServiceResponse get(
			@ApiParam(value = "$serviceNamecc$ Request", required = true) @RequestBody $serviceNamecc$Request $serviceName$Request) {
		// TODO Change the method name accordingly
		final String METHOD_NAME = "get";
		BasicConfigurator.configure();

		ServiceResponse response = null;

		try {
			// TODO Log the input received below
			LOGGER.debug(METHOD_NAME, "Input :: ");

			response = $serviceName$Service.get($serviceName$Request);
		} catch (Exception exception) {
			LOGGER.error(METHOD_NAME, "Exception: " + exception.getMessage());

			response = new $serviceNamecc$Response();
			populate$serviceNamecc$Response($serviceName$Request, ($serviceNamecc$Response) response);
			response.setResponseCode(EXCEPTION_CODE);
			response.setResponseMsg(EXCEPTION_RESPONSE);

			return response;
		}
		return response;
	}
}