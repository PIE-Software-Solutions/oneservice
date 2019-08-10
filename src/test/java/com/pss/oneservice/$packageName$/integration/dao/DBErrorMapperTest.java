package com.pss.oneservice.$packageName$.integration.dao;

import static org.assertj.core.api.Assertions.assertThat;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.pss.oneservice.$packageName$.integration.dao.DBErrorMapper;
import com.pss.oneservice.$packageName$.integration.dao.model.DBError;

/**
 * Test case for DBErrorMapper.java
 * 
 * <!-- This Class DOES NOT require any modification.-->
 * 
 * @author KARUNAR
 */
public class DBErrorMapperTest {

	// Two dimensional string array to mock DB rows.
	private String[][] resultRows = new String[2][1];

	private ResultSet resultSet;

	@Before
	public void beforeMethod() throws SQLException {
		int increment = 1;
		int noOfRows = 2;
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(2);

		for (int pointer = 0; pointer < noOfRows; pointer++) {
			if (intList.contains(increment)) {
				resultRows[pointer][0] = String.valueOf(increment);
			} else {
				resultRows[pointer][0] = "column" + increment;
			}
			increment++;
		}

		ResultSetMocker resultSetMocker = new ResultSetMocker(resultRows);
		resultSet = resultSetMocker.getResultSet();
	}

	private DBError createDBError() {
		DBError dbError = new DBError();

		dbError.setErrorMessage("column1");
		dbError.setResponseCode(2);

		return dbError;
	}

	@Test
	public void testDBErrorMapper() throws SQLException {
		DBErrorMapper dbErrorMapper = new DBErrorMapper();

		DBError dbError = dbErrorMapper.mapRow(resultSet, 0);
		DBError dbErrorExpected = createDBError();
		assertThat(dbError).isEqualToComparingFieldByField(dbErrorExpected);
	}
}
