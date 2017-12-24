package com.qf.dom4j;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import com.qf.sax.User;
import com.sun.org.apache.xml.internal.serializer.NamespaceMappings;

public class ParseXml {

	public static void main(String[] args) {

		List<User> userList = new ArrayList<User>();

		// 1.创建解析器
		SAXReader saxReader = new SAXReader();

		try {
			// 2.指定要解析的文件
			Document document = saxReader.read("C:/java/workspace/demo/day56_xml/src/user.xml");

			// 3.先的跟节点
			Element rootElement = document.getRootElement();
			
			Iterator rootIterator = rootElement.elementIterator();
			while (rootIterator.hasNext()) {
				User userEntity = new User();
				// user 节点
				Element user = (Element) rootIterator.next();
				Iterator userIterator = user.elementIterator();
				while (userIterator.hasNext()) {
					// user属性的节点
					Element attribute = (Element) userIterator.next();
					String name = attribute.getName();
					String value = attribute.getText();
					if ("id".equals(name)) {
						userEntity.setId(Integer.parseInt(value));
					} else if ("name".equals(name)) {
						userEntity.setName(value);
					} else if ("age".equals(name)) {
						userEntity.setAge(Integer.parseInt(value));
					}
				}
				userList.add(userEntity);
			}

		} catch (DocumentException e) {
			e.printStackTrace();
		}
		
		
		for (User user : userList) {
			System.out.println(user);
		}
	}
}
