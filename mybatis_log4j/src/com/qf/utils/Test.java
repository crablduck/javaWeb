package com.qf.utils;

public class Test {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			new Thread(new Runnable() {
				@Override
				public void run() {
					System.out.println(MyBatisUtil.getSqlSessionFactory());
				}
			}).start();
		}
	}
}
