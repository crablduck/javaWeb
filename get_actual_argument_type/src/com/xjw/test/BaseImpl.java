package com.xjw.test;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * @author 谢嘉伟
 *
 * @param <T>
 */
public class BaseImpl<T> {

	private Class<T> entity;
	
	
	//获得子类集成父类后在， 父类泛型中的设定
	public BaseImpl(){
		
		//this.getClass() 这就是参数化类型 parameteried Type
		//里面的getGenericSuperclass  获得一般的父类的类。 是由子类继承这个方法， 以子类为起点进行获得base的类
		//当前对象的直接超类（父类）的 Type，因为子类继承Base所以会得到base的type
		//parameterizedType: com.xjw.test.BaseImpl<com.xjw.entity.User>
		ParameterizedType parameterizedType = (ParameterizedType) this.getClass().getGenericSuperclass();
		System.out.println(parameterizedType);
		
		//获得容器里面的类型get Actual Type Arguments：class com.xjw.entity.User
		entity = (Class<T>) parameterizedType.getActualTypeArguments()[0];

		System.out.println(entity);
	}
}
