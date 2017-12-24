package com.qf.core;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.corba.se.spi.resolver.Resolver;

/**
 * Servlet Filter implementation class MyStrutsPrepareAndExecuteFilter
 */
public class MyStrutsPrepareAndExecuteFilter implements Filter {

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse resp = (HttpServletResponse) response;

		// 1.从请求中获取AcitonName
		String actionName = getActionName(req.getServletPath());

		// 2.获取ActionInfo对象
		ActionInfo actionInfo = ConfigManager.map.get(actionName);

		// 3.调用Action
		String name = executeAction(actionInfo,req);

		// 4.响应客户端
		responseClinet(actionInfo.getResultInfos().get(name), req, resp);

	}

	private void responseClinet(ResultInfo resultInfo, HttpServletRequest req, HttpServletResponse resp) {

		String type = resultInfo.getType();
		if (type == null) {
			try {
				req.getRequestDispatcher(resultInfo.getText()).forward(req, resp);
			} catch (ServletException | IOException e) {
				e.printStackTrace();
			}
			return;
		}

		// 1.判断是重定向还是转发
		if ("redirect".equals(resultInfo.getType())) {
			try {
				resp.sendRedirect(resultInfo.getText());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		// ...

	}

	private String executeAction(ActionInfo actionInfo, HttpServletRequest req) {

		try {
			// 1.加载类
			Class<?> cls = Class.forName(actionInfo.getClasses());

			// 2.实列化对象
			Object ins = cls.newInstance();
			
			// 3.给属性赋值
			Field[] declaredFields = cls.getDeclaredFields();
			for (Field field : declaredFields) {
				field.setAccessible(true);
				field.set(ins, req.getParameter(field.getName()));
			}

			// 4.调用Action
			return cls.getMethod(actionInfo.getMethod()).invoke(ins).toString();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
		return null;
	}

	private String getActionName(String servletPath) {
		return servletPath.substring(1, servletPath.indexOf("."));
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// 解析xml
		new ConfigManager().init();
	}

}
