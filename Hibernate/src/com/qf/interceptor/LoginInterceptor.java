package com.qf.interceptor;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class LoginInterceptor extends AbstractInterceptor {

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
				String name = invocation.getInvocationContext().getName();

				if ("login".equals(name)) {
					return invocation.invoke();
				} else {
					Object customer = ServletActionContext.getRequest().getSession().getAttribute("customer");

					if (customer == null) {
						ServletActionContext.getRequest().setAttribute("msg", "你还没有登录");
						return Action.LOGIN;
					} else {
						return invocation.invoke(); // 放行
					}
				}
	}

}
