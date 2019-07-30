package com.kj.oneservice.$packageName$.integration.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kj.oneservice.$packageName$.integration.dao.$serviceNamecc$DAO;
import com.kj.oneservice.$packageName$.integration.model.$serviceNamecc$Request;
import com.kj.oneservice.$packageName$.integration.model.$serviceNamecc$Response;
import com.kj.oneservice.common.integration.model.ServiceResponse;
import com.kj.oneservice.common.integration.util.AppLogger;

/**
 * Service Class for $serviceNamecc$ service
 * 
 * @author $author$
 */
@Repository
public class $serviceNamecc$Service extends OneServiceService {

	private static final AppLogger LOGGER = new AppLogger($serviceNamecc$Service.class.getName());

	@Autowired
	private $serviceNamecc$DAO $serviceName$DAO;

	/**
	 * <!--Service method stub to write business logic and DAO calls. This
	 * method can be replicated further.-->
	 * 
	 * @param $serviceName$Request
	 * @return ServiceResponse
	 */
	public ServiceResponse get($serviceNamecc$Request $serviceName$Request) {
		// TODO Change the method name accordingly
		final String METHOD_NAME = "get";

		String queryString = null;

		List<Object> objectList = $serviceName$DAO.get($serviceName$Request, queryString);

		// TODO Process object list and populate the response
		ServiceResponse response = null;

		return response;
	}

	/**
	 * Populates $serviceName$ with default response
	 * 
	 * @param $serviceName$Request
	 * @param $serviceName$Response
	 */
	public static void populate$serviceNamecc$Response($serviceNamecc$Request $serviceName$Request,
			$serviceNamecc$Response $serviceName$Response) {
		if (null != $serviceName$Request && null != $serviceName$Response) {
			// TODO Populate default request variables to response
		}
	}
}
