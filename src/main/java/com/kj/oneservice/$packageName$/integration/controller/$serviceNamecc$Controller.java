package com.kj.oneservice.$packageName$.integration.controller;

import static com.kj.oneservice.$packageName$.integration.service.$serviceNamecc$Service.populate$serviceNamecc$Response;
import static com.kj.oneservice.common.integration.util.CommonConstants.EXCEPTION_CODE;
import static com.kj.oneservice.common.integration.util.CommonConstants.EXCEPTION_RESPONSE;

import org.apache.log4j.BasicConfigurator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kj.oneservice.$packageName$.integration.model.$serviceNamecc$Request;
import com.kj.oneservice.$packageName$.integration.model.$serviceNamecc$Response;
import com.kj.oneservice.$packageName$.integration.service.$serviceNamecc$Service;
import com.kj.oneservice.common.integration.model.ServiceResponse;
import com.kj.oneservice.common.integration.util.AppLogger;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

/**
 * Controller class for $serviceNamecc$ service
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
	@RequestMapping(value = "/$serviceName$", method = RequestMethod.POST)
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
