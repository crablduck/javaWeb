package com.qf.dom4j;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.XMLWriter;

public class CreateXml {

	public static void main(String[] args) {

		// 1.获取文档对象
		Document document = DocumentHelper.createDocument();

		// 2.添加元素
		Element root = document.addElement("users");

		Element user = root.addElement("user");

		// user的属性
		Element id = user.addElement("id");
		id.setText("22");

		user.addElement("name").setText("张三");
		user.addElement("age").setText("22");

		FileOutputStream ops = null;
		try {
			ops = new FileOutputStream("C:/java/workspace/demo/day56_xml/src/user2.xml");
			// 3.生成xml
			XMLWriter xmlWriter = new XMLWriter(ops);

			xmlWriter.write(document);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(ops != null){
				try {
					ops.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}
}
