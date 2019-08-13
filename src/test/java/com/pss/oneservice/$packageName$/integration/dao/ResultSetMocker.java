package com.pss.oneservice.$packageName$.integration.dao;

import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.mock;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.concurrent.atomic.AtomicInteger;

import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

/**
 * Mock for ResultSet
 * 
 * <!-- This Class DOES NOT require any modification.-->
 * 
 * @author KARUNAR
 */
public class ResultSetMocker {

	// Two dimensional string array to mock DB rows.
	private String[][] resultRows;

	public ResultSetMocker(String[][] resultRows) {
		this.resultRows = resultRows;
	}

	/**
	 * Mocks ResultSet
	 * 
	 * @return ResultSet
	 * @throws SQLException
	 */
	public ResultSet getResultSet() throws SQLException {
		final ResultSet resultSet = mock(ResultSet.class);
		final AtomicInteger atomicInteger = new AtomicInteger(0);
		final MockRow mockRow = new MockRow();

		// Mock for resultSet.next()
		doAnswer(new Answer<Boolean>() {
			@Override
			public Boolean answer(InvocationOnMock invocation) throws Throwable {
				int index = atomicInteger.getAndIncrement();
				if (resultRows.length > index) {
					String[] current = resultRows[index];
					mockRow.setCurrentRowData(current);
					return true;
				} else
					return false;
			};
		}).when(resultSet).next();

		// Mock for resultSet.getString()
		doAnswer(new Answer<String>() {
			@Override
			public String answer(InvocationOnMock invocation) throws Throwable {
				Object[] args = invocation.getArguments();
				int index = ((Integer) args[0]).intValue();
				resultSet.next();
				return mockRow.getColumn(index);
			};
		}).when(resultSet).getString(anyInt());

		// Mock for resultSet.getInt()
		doAnswer(new Answer<Integer>() {
			@Override
			public Integer answer(InvocationOnMock invocation) throws Throwable {
				Object[] args = invocation.getArguments();
				int index = ((Integer) args[0]).intValue();
				resultSet.next();
				return mockRow.getInt(index);
			}
		}).when(resultSet).getInt(anyInt());

		return resultSet;
	}

	/**
	 * Mock for ResultSet Row
	 * 
	 * @author KARUNAR
	 */
	static class MockRow {
		String[] rowData;

		public void setCurrentRowData(String[] rowData) {
			this.rowData = rowData;
		}

		public String getColumn(int index) {
			return rowData[0];
		}

		public Integer getInt(int index) {
			return Integer.valueOf(rowData[0]);
		}
	}
}