package com.qf.action;

import java.util.Date;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.qf.entity.Reply;
import com.qf.entity.User;
import com.qf.service.IReplyService;
import com.qf.service.impl.ReplyServiceImpl;

public class ReplyAction extends ActionSupport {

	private Reply reply;
	private IReplyService replyService = new ReplyServiceImpl();
	
	public String replyAdd() {

		User user = (User)ServletActionContext.getRequest().getSession().getAttribute("user");
		if(user == null){
			ServletActionContext.getRequest().setAttribute("msg", "你没有登录请先登录");
			return Action.LOGIN;
		}
		reply.setUser(user); // 添加回复人
		reply.setCreateDate(new Date());
		replyService.add(reply);
		return Action.SUCCESS;
	}

	public Reply getReply() {
		return reply;
	}

	public void setReply(Reply reply) {
		this.reply = reply;
	}
}
