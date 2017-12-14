package com.xjw.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xjw.util.DBUtils;

public class Jdbc {

	public static void main(String[] args) {
		try {
//			Jdbc.select1();
//			Jdbc.add();
//			Jdbc.update();
			Jdbc.del();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void select() throws ClassNotFoundException, SQLException{
		//加载驱动
		Class.forName("com.mysql.jdbc.Driver");
		
		//建立连接
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/crab", "root", "root");
		
		//发送sql语句
		String sql = "select * from person";
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(sql);
		while(resultSet.next()){
			int id = resultSet.getInt("id");
			String string = resultSet.getString("name");
			int int1 = resultSet.getInt("age");
			System.out.println(id);
			System.out.println(string);
			System.out.println(int1);
		}

		resultSet.close();
		statement.close();
		connection.close();
	}
	
	public static void select1() throws ClassNotFoundException, SQLException{

		Connection connection = DBUtils.getConnection();
		//发送sql语句
		String sql = "select * from person";
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(sql);
		while(resultSet.next()){
			int id = resultSet.getInt("id");
			String string = resultSet.getString("name");
			int int1 = resultSet.getInt("age");
			System.out.println(id);
			System.out.println(string);
			System.out.println(int1);
		}
		
		DBUtils.close(connection, statement, resultSet);
	}
	
	public static void add() throws ClassNotFoundException, SQLException{
		
		Connection connection = DBUtils.getConnection();
		//发送sql语句
		String sql = "insert into person(name, age) values('xiaohong', 18) ";
		Statement statement = connection.createStatement();
		
		System.out.println(statement.executeUpdate(sql));
		
		DBUtils.close(connection, statement, null);
	}
	
	public static void update() throws ClassNotFoundException, SQLException{
		
		Connection connection = DBUtils.getConnection();
		//发送sql语句
		String sql = "update person set name = 'xiaogang' where id = 1";
		Statement statement = connection.createStatement();
		System.out.println(statement.executeUpdate(sql));
		
		DBUtils.close(connection, statement, null);
	}
	
	public static void del() throws ClassNotFoundException, SQLException{
		
		Connection connection = DBUtils.getConnection();
		//发送sql语句
		String sql = "delete from person where id = 1";
		Statement statement = connection.createStatement();
		
		System.out.println(statement.executeUpdate(sql));
		
		DBUtils.close(connection, statement, null);
	}
	
	
}
