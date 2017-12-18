package com.xjw.action;

import java.io.IOException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.User;
import org.apache.commons.fileupload.servlet.ServletRequestContext;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.StrutsStatics;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ServletApi extends ActionSupport implements ServletResponseAware, ServletRequestAware{

	private User user;
	
	private HttpServletRequest httpServletRequest;
	
	private HttpServletResponse httpServletResponse;
	
	
	public String ServletApi1(){
		ActionContext context = ActionContext.getContext();
		Map<String, Object> application = context.getApplication();
		Map<String, Object> session = context.getSession();
		Map<String, Object> parameters = context.getParameters();
		HttpServletRequest request= (HttpServletRequest) context.get("request");
		HttpServletRequest request2 = (HttpServletRequest) context.get(StrutsStatics.HTTP_REQUEST);
		return null;
	}
	
	public String ServletApi2(){
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpServletResponse response = ServletActionContext.getResponse();
		return null;
	}
	
	public String ServletApi3(){

		httpServletRequest.setAttribute("msg", "实现接口后进行set,get然后就可以直接用了， 不太喜欢这么用");

		try {
			httpServletResponse.sendRedirect("ok.jsp");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public void setServletRequest(HttpServletRequest arg0) {
		// TODO Auto-generated method stub
		this.httpServletRequest = arg0;
	}

	@Override
	public void setServletResponse(HttpServletResponse arg0) {
		// TODO Auto-generated method stub
		this.httpServletResponse = arg0;
	}
}
