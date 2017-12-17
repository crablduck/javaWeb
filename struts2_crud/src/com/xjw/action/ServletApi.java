package com.xjw.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.StrutsStatics;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ServletApi extends ActionSupport implements ServletRequestAware, ServletResponseAware{

	private HttpServletRequest httpServletRequest;
	private HttpServletResponse httpServletResponse;
	
	public String getServletAPI(){
		//获取contect
		ActionContext context = ActionContext.getContext();
		
		//获取API
		Map<String, Object> session = context.getSession(); //session
		Map<String, Object> application = context.getApplication(); //application
		Map<String, Object> parameters = context.getParameters(); //parameters
		
		Map<String, Object> request = (Map<String, Object>) context.get("request");
		request.put("hello", "helloWord~");
		
		HttpServletRequest request2 = (HttpServletRequest) context.get(StrutsStatics.HTTP_REQUEST);
		request.put("nihao", "nihaoma");
		
		return "success";
	}
	
	public String servletApi2(){

		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("nihao", "nihaoma");
		return "success";
	}
	
	public String servletApi3(){
		httpServletRequest.setAttribute("nihao", "nihao");
		return "success";
		
	}

	@Override
	public void setServletResponse(HttpServletResponse arg0) {
		// TODO Auto-generated method stub
		this.httpServletResponse = arg0;
	}

	@Override
	public void setServletRequest(HttpServletRequest arg0) {
		// TODO Auto-generated method stub
		this.httpServletRequest = arg0;
	}
	
}
