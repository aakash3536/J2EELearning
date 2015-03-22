package com.practicej2ee.dblookup;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBLookUp {
	public static final String host = "jdbc:postgresql://localhost:5432/PracticeJ2EE";
	public static final String username = "postgres";
	public static final String password = "postgres";
	
	Connection con = null;

	public DBLookUp() {

		try {
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection(host, username,
					password);
			
			System.out.println("Connection eatablished ");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Boolean isValidUser(String... parameters) {
		String sql = generateQuery(parameters);
		
		try {
			PreparedStatement preparedStatement = con.prepareStatement(sql);
			preparedStatement.setString(1, parameters[0]);
			preparedStatement.setString(2, parameters[1]);
			ResultSet rs = preparedStatement.executeQuery();
			return rs.next();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		
	}

	public static void createDBConnection() {

	}

	public String generateQuery(String... parameters) {
		return "select * from users where name = ? and password = ? " ;
	}
}
