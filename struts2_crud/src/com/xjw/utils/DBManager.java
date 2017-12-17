package com.xjw.utils;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class DBManager<T> {

	public int commonUpdate(String sql, Object... args){
		Connection connection = null;
		PreparedStatement prst = null;
		try {
			//获取连接参数
			connection = DBUtils.getConnection();
			
			//获取占位符
			prst = connection.prepareStatement(sql);

			//给占位符赋值
			if(args != null){
				for (int i = 0; i < args.length; i++) {
					prst.setObject(i+1, args[i]);
				}
			}
			return prst.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBUtils.close(connection, prst, null);
		}
		return 0;
	}
	
	public List<T> commonQuery(String sql, Class<T> cls, Object... args ){

		
		Connection connection = null;
		PreparedStatement prst = null;
		ResultSet resultSet = null;
		
		//创建容器进行存储
		List<T> list = new ArrayList<>();
		//获取连接
		try {
			connection = DBUtils.getConnection();
			//获取占位符
			prst = connection.prepareStatement(sql);
			//为占位符赋值
			if(args != null){
				for (int i = 0; i < args.length; i++) {
					prst.setObject(i+1, args[i]);
				}
			}
			//查询语句
			resultSet = prst.executeQuery();
			while(resultSet.next()){
				//根据cls获取对象属性
				T t = cls.newInstance();
				Field[] fields = t.getClass().getDeclaredFields();
				for (Field field : fields) {
					field.setAccessible(true); //授权
					Object value = resultSet.getObject(field.getName()); //取值
					field.set(t, value);
				}
				list.add(t);
			}
			
			return  list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBUtils.close(connection, prst, resultSet);
		}
		return null;
	}
	

	public int commonSize(String sql){
		
		//获取连接
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		try {
			connection = DBUtils.getConnection();
			statement = connection.createStatement();
			resultSet = statement.executeQuery(sql);
			
			if(resultSet.next()){
				return resultSet.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBUtils.close(connection, statement, resultSet);
		}
		return 0;
	}
}
