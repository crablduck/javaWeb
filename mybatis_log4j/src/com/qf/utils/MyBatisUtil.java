package com.qf.utils;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.xml.sax.InputSource;

public class MyBatisUtil {

	private static SqlSessionFactory sqlSessionFactory;

	public static SqlSessionFactory getSqlSessionFactory() {

		if (sqlSessionFactory == null) {
			initSqlSessionFactory(); // 为空再去参加
		}
		return sqlSessionFactory;
	}

	private static void initSqlSessionFactory() {
		InputStream ips = null;
		try {
			// 1.指定配置文件
			ips = Resources.getResourceAsStream("mybatis-config.xml");

			// 2.赋值操作
			synchronized (MyBatisUtil.class) {
				if (sqlSessionFactory == null) {
					sqlSessionFactory = new SqlSessionFactoryBuilder().build(ips);
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (ips != null) {
				try {
					ips.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
