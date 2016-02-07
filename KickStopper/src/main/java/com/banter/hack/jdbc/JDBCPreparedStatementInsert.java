package com.banter.hack.jdbc;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class JDBCPreparedStatementInsert {


	public static void insertRecordIntoTable(Project projectObject) throws SQLException {

		Connection dbConnection = null;
		PreparedStatement preparedStatement = null;

		String insertTableSQL = "INSERT INTO PROJECTS"
				+ "(ID, TITLE, DESCRIPTION, AUTHOR, BACKERSCOUNT, ANTIBACKERSCOUNT, PLEDGED,"
				+ "ANTIPLEDGED, GOAL, ANTIGOAL, DEADLINE) VALUES"
				+ "(?,?,?,?,?,?,?,?,?,?,?)";

		try {
			dbConnection = GetJDBCConnection.getDBConnection();
			preparedStatement = dbConnection.prepareStatement(insertTableSQL);
			preparedStatement.setInt(1, projectObject.getId());
			preparedStatement.setString(2, projectObject.getTitle());
			preparedStatement.setString(3, projectObject.getDescription());
			preparedStatement.setString(4, projectObject.getAuthor());
			preparedStatement.setInt(5, projectObject.getBackersCount());
			preparedStatement.setInt(6, projectObject.getAntiBackersCount());
			preparedStatement.setInt(7, projectObject.getPledged());
			preparedStatement.setInt(8, projectObject.getAntiPledged());
			preparedStatement.setInt(9, projectObject.getGoal());
			preparedStatement.setInt(10, projectObject.getAntiGoal());
			preparedStatement.setDate(11, projectObject.getDeadline());			

			// execute insert SQL stetement
			preparedStatement.executeUpdate();

			System.out.println("Record is inserted into DBUSER table!");

		} catch (SQLException e) {

			System.out.println(e.getMessage());

		} finally {

			if (preparedStatement != null) {
				preparedStatement.close();
			}

			if (dbConnection != null) {
				dbConnection.close();
			}

		}

	}

	
	

}
