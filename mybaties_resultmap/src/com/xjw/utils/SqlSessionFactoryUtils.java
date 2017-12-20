package com.xjw.utils;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlSessionFactoryUtils {

	private static SqlSessionFactory sqlSessionFactory;
	
	public static SqlSessionFactory getSessionFactory(){
		
		InputStream inputStream = null;
		try {
			inputStream = Resources.getResourceAsStream("mybatis-config.xml");
			//获取构造工厂类
			SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
			//得到sessionfactory工厂
			
			synchronized(SqlSessionFactoryUtils.class){
				//进行非空判断
				if(sqlSessionFactory == null){
					sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
				}
			}
			return sqlSessionFactory;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				inputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}
}
