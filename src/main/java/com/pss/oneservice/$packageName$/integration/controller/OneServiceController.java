package com.pss.oneservice.$packageName$.integration.controller;

import static com.pss.oneservice.common.integration.util.CommonConstants.BAD_REQUEST_CODE;
import static com.pss.oneservice.common.integration.util.CommonConstants.BAD_REQUEST_RESPONSE;
import static com.pss.oneservice.common.integration.util.CommonConstants.INTERNAL_EXCEPTION_RESPONSE;
import static com.pss.oneservice.common.integration.util.CommonConstants.INTERNAL_EXEPTION_CODE;

import org.springframework.web.bind.annotation.RestController;

import com.pss.oneservice.common.integration.annotations.SetJsonMapping;

import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * Controller abstract class for $servicePathcc$ service
 * 
 * <!-- This Class DOES NOT require any modification.-->
 * 
 * @author KARUNAR
 */
@RestController
@SetJsonMapping(path = "/$servicePath$")
@ApiResponses(value = { @ApiResponse(code = INTERNAL_EXEPTION_CODE, message = INTERNAL_EXCEPTION_RESPONSE),
		@ApiResponse(code = BAD_REQUEST_CODE, message = BAD_REQUEST_RESPONSE) })
public abstract class OneServiceController {

}
