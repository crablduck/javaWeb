package com.qf.core;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class ConfigManager {
//	public static List<ActionInfo> actionInfos = new ArrayList<ActionInfo>();
	public static Map<String, ActionInfo> map = new HashMap<String, ActionInfo>();

	public void init() {

		String path = "C:/java/workspace/demo/day56_my_struts/src/struts.xml";

		// 1.创建SAXReader
		SAXReader saxReader = new SAXReader();

		try {
			// 2.指定要解析的文件
			Document document = saxReader.read(new FileInputStream(path));

			// 3.得到跟节点
			Element rootElement = document.getRootElement();

			Iterator actionIterator = rootElement.elementIterator();

			while (actionIterator.hasNext()) {
				ActionInfo actionInfo = new ActionInfo();
				Element action = (Element) actionIterator.next();
				// 封装ActionInfo属性
				actionInfo.setName(action.attributeValue("name"));
				actionInfo.setClasses(action.attributeValue("class"));
				actionInfo.setMethod(action.attributeValue("method"));

				// 4.迭代result
				Iterator resultIterator = action.elementIterator();
				while (resultIterator.hasNext()) {
					ResultInfo resultInfo = new ResultInfo();
					Element result = (Element) resultIterator.next();

					// 封装Result属性
					resultInfo.setName(result.attributeValue("name"));
					resultInfo.setType(result.attributeValue("type"));
					resultInfo.setText(result.getText());

					actionInfo.getResultInfos().put(resultInfo.getName(), resultInfo);
					
				}
				map.put(actionInfo.getName(), actionInfo);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (DocumentException e) {
			e.printStackTrace();
		}
	}
}
