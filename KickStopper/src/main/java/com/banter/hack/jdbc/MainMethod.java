package com.banter.hack.jdbc;


import java.sql.Date;
import java.sql.SQLException;


public class MainMethod {
	
	public static void main(String[] argv) {

		try {

			Project mockProject = createDummyProjectObject();
			JDBCPreparedStatementInsert.insertRecordIntoTable(mockProject);

		} catch (SQLException e) {

			System.out.println(e.getMessage());

		}

	}
	
	public static Project createDummyProjectObject(){
		Date date = Date.valueOf("2016-02-06");
		Project dummyProjectObject = new Project(222, 34535, 423532, 534543,
				534543, 543534, 7464, "dummyTitle", "dummyDesc", "dummyAuthor", date);
		
		return dummyProjectObject;
	}
	
	private static java.sql.Timestamp getCurrentTimeStamp() {

		java.util.Date today = new java.util.Date();
		return new java.sql.Timestamp(today.getTime());

	}

}
