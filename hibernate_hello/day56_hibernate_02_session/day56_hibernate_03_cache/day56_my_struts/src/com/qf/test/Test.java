package com.qf.test;

public class Test {

	public static void main(String[] args) {
		String string = "/addAction.do";
		
		System.out.println(string.substring(1, string.indexOf(".")));
	}
}
