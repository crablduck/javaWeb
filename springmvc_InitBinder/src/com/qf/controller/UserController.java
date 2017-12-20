package com.qf.controller;

import java.beans.PropertyEditorSupport;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.qf.entity.User;

@Controller
@RequestMapping(value = "/user")
public class UserController {

	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String add(User user) {
		System.out.println("UserController.add()");
		System.out.println(user.getName() + ":" + user.getBrithday());
		return "ok";
	}

	/**
	 * 属性编辑器
	 * @param dataBinder
	 */
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		// 添加表单中的类型， Date.class  也可以表示处理时间类型的
		dataBinder.registerCustomEditor(Date.class, new PropertyEditorSupport() {
			public void setAsText(String value) {
				try {
					System.err.println("nihao");
					// 1.处理用户输入的数据
					Date data = new SimpleDateFormat("yyyy-MM-dd").parse(value);
					
					// 2.赋值
					setValue(data);
				} catch (Exception e) {
					setValue(null);
				}
			}
		});
	}

}
