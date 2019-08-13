package com.pss.oneservice.$packageName$.integration.dao;

import static com.pss.oneservice.$packageName$.integration.util.AppSqlConstants.GET_ERROR_DETAILS;
import static com.pss.oneservice.common.integration.util.CommonConstants.ONESERVICE_JDBC_TEMPLATE;
import static org.apache.commons.lang3.StringUtils.isNotBlank;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;

import com.pss.oneservice.$packageName$.integration.dao.model.DBError;

/**
 * DAO abstract class for $servicePathcc$ service
 * 
 * <!-- This Class DOES NOT require any modification.-->
 * 
 * @author KiranB
 */
public abstract class OneServiceDAO {

	@Autowired(required=false)
	@Qualifier(ONESERVICE_JDBC_TEMPLATE)
	protected JdbcTemplate oneServiceJdbcTemplate;

	/**
	 * Gets Error details from DB
	 * 
	 * @param errorCode
	 * @return List<DBError> errorDetailsList
	 */
	public List<DBError> getErrorDetails(String errorCode) {
		List<DBError> errorDetailsList = null;

		if (isNotBlank(errorCode)) {
			errorDetailsList = oneServiceJdbcTemplate.query(GET_ERROR_DETAILS, new Object[] { errorCode },
					new DBErrorMapper());
		}
		return errorDetailsList;
	}
}
