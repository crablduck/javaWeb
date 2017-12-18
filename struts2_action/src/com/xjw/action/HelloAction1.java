package com.xjw.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author 谢嘉伟
 *
 */
public class HelloAction1 extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public String hello(){
		
		return Action.SUCCESS;
	}

}
