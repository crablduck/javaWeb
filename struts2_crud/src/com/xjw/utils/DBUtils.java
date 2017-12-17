package com.xjw.utils;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;



public class DBUtils {

	private static String username;
	private static String password;
	private static String url;

	static{
		InputStream inputStream ;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Properties properties = new Properties();
			inputStream = DBUtils.class.getClassLoader().getResourceAsStream("dbconfig.properties");
			properties.load(inputStream);
			username = properties.getProperty("username");
			password = properties.getProperty("password");
			url = properties.getProperty("url");
//			String url = "jdbc:mysql://localhost:3306/crab";
			
		} catch (ClassNotFoundException | IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	public static Connection getConnection() throws SQLException{
		return DriverManager.getConnection(url, username, password);
	}
	
	public static void close(Connection connection, Statement statement, ResultSet result){
		if(result != null){
			try {
				result.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(statement != null){
			try {
				statement.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(connection != null){
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
