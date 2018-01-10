package com.qf.oa.entity;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


public class SendEmail {

	public static void SendEmailInfoUser(String sendAddress, String title, String content,String copysendAddress) throws Exception {
		Properties properties = new Properties();
		//设置服务器名称， 下面是126邮箱的服务器，如果你用qq邮箱就找qq邮箱的服务器， 去百度一下就行
		properties.setProperty("mail.host", "smtp.126.com");
		//设置邮件传输协议
		properties.setProperty("mail.transport.protocol", "smtp");
		//设置是否要验证服务器用户名和密码
		properties.setProperty("mail.smtp.auth", "true");
		// 1.创建客户端与邮箱服务器的Session对象
		Session session = Session.getInstance(properties);
		// 2.开启session的debug模式，方便查看发送email的运行状态
		session.setDebug(true);
		// 3.通过session得到transport传输对象
		Transport transport = session.getTransport();
		// 4.使用用户名密码连接上邮箱服务器,此处的密码需要到邮箱开启服务设置
		transport.connect("smtp.126.com", "填写自己的账号 @126.com", "这里写授权码");
		// 5.创建邮件
		Message message = createSimpleMail(session, sendAddress, title, content,copysendAddress);
		// 6.发送邮件
		transport.sendMessage(message, message.getAllRecipients());
		transport.close();
	}
	
	

	private static Message createSimpleMail(Session session, String sendAddress, String title, String content,String copysendAddress) throws Exception{
		// 创建邮件对象
		MimeMessage message = new MimeMessage(session);
		// 指明邮件的发件人
		message.setFrom(new InternetAddress("asdfg756868947@126.com"));
		// 指明邮件的收件人
		message.setRecipient(Message.RecipientType.TO, new InternetAddress(sendAddress));
		// 邮件的标题
		message.setSubject(title);
		// 邮件的内容
		message.setContent(content, "text/html;charset=UTF-8");
		
		// 设置抄送人
       message.setRecipients(Message.RecipientType.CC, InternetAddress.parse(copysendAddress)); 
		
		return message;
	}
	
	//这里是测试
	public static void main(String[] args) {

		try {
//			SendEmailInfoUser("pqjrkwem@gmail.com", "test", "crab is a flower handsome man", "asdfg756868947@qq.com");
			SendEmailInfoUser1("目标的邮箱", "标题", "输入的内容",  "抄送邮箱");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
