package com.kj.oneservice.$packageName$.integration.dao;

import static org.apache.commons.lang.StringUtils.isNotBlank;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.kj.oneservice.$packageName$.integration.dao.model.DBError;

/**
 * RowMapper implementation class for DBError DB mapping
 * 
 * <!-- This Class DOES NOT require any modification.-->
 * 
 * @author Jyothi Saranya
 */
public class DBErrorMapper implements RowMapper<DBError> {

	@Override
	public DBError mapRow(ResultSet resultSet, int rowNumber) throws SQLException {
		DBError dbError = null;

		if (null != resultSet) {
			dbError = new DBError();
			int count = 1;

			dbError.setErrorMessage(removeNull(resultSet.getString(count++)));
			dbError.setResponseCode(resultSet.getInt(count++));
		}
		return dbError;
	}

	/**
	 * Removes null string values
	 * 
	 * @param resultSetValue
	 * @return resultSetValue
	 */
	private static String removeNull(String resultSetValue) {
		if (isNotBlank(resultSetValue)) {
			resultSetValue = resultSetValue.replaceAll("null", "");
		}
		return resultSetValue;
	}
}