package com.qf.sax;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import com.sun.jmx.snmp.Timestamp;
import com.sun.org.apache.xalan.internal.xsltc.compiler.Template;

/**
 * SAX解析XML，原理是基于事件驱动去解析的
 * 
 * @author admin
 *
 */
public class SaxParseDemo {

	public static void main(String[] args) {

		// 1.创建Sax解析工厂
		SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();

		try {
			// 2.创建SAXParser解析器
			SAXParser saxParser = saxParserFactory.newSAXParser();

			// 3.准备要解析的文件
			InputStream ips = new FileInputStream("C:/java/workspace/demo/day56_xml/src/user.xml");

			// 4.解析
			MyHandle myHandle = new MyHandle();
			saxParser.parse(ips, myHandle);

			// 返回结果
			List<User> userList = myHandle.getUserList();
			for (User user : userList) {
				System.out.println(user);
			}
			
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}

/**
 * 定义处理器
 * 
 * @author admin
 *
 */
class MyHandle extends DefaultHandler {

	private List<User> userList = null;
	private User user = null;
	private String temp = "";

	@Override
	public void startDocument() throws SAXException {
		setUserList(new ArrayList<User>());
		System.out.println("文档开始解析");
	}

	@Override
	public void endDocument() throws SAXException {
		System.out.println("文档结束解析");
	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		if ("user".equals(qName)) {
			user = new User();
		}
		temp = qName;
		System.out.println("节点开始:" + qName);
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		temp = "";
		System.out.println("节点结束:" + qName);
		if ("user".equals(qName)) {
			getUserList().add(user);
		}
	}

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		String value = new String(ch, start, length);
		System.out.println("节点中间的内容:" + value);
		if (value.trim().length() > 0) {
			if ("id".equals(temp)) {
				user.setId(Integer.parseInt(value));
			} else if ("name".equals(temp)) {
				user.setName(value);
			} else if ("age".equals(temp)) {
				user.setAge(Integer.parseInt(value));
			}
		}

	}

	public List<User> getUserList() {
		return userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}

}