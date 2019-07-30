package com.kj.oneservice.$packageName$.integration.controller;

import static com.kj.oneservice.common.integration.util.CommonConstants.BAD_REQUEST_CODE;
import static com.kj.oneservice.common.integration.util.CommonConstants.BAD_REQUEST_RESPONSE;
import static com.kj.oneservice.common.integration.util.CommonConstants.INTERNAL_EXCEPTION_RESPONSE;
import static com.kj.oneservice.common.integration.util.CommonConstants.INTERNAL_EXEPTION_CODE;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
@RequestMapping(value = "/$servicePath$", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
@ApiResponses(value = { @ApiResponse(code = INTERNAL_EXEPTION_CODE, message = INTERNAL_EXCEPTION_RESPONSE),
		@ApiResponse(code = BAD_REQUEST_CODE, message = BAD_REQUEST_RESPONSE) })
public abstract class OneServiceController {

}