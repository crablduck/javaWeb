package com.qf.controller;

import com.qf.entity.User;

public class Test {

	public static void main(String[] args) {
		User user = new User();
		user.setName("admin");
		update(user); // 放到Requset,引用传递(传递的是内存地址)
		user.setName("xxxxx");
		System.out.println(user.getName());

		int i = 10;

		update1(i); // 值传递
		System.out.println(i);
	}

	private static void update1(int i) {
		i = 100;
	}

	private static void update(User user) {
		user.setName("123");
	}
}
