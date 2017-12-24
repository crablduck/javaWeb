package com.qf.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ActionInfo {

	private String name;
	
	private String classes;
	
	private String method;

//	private List<ResultInfo> resultInfos = new ArrayList<>();// ?
	private Map<String, ResultInfo> resultInfos = new HashMap<String, ResultInfo>();
	
	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String getClasses() {
		return classes;
	}

	public void setClasses(String classes) {
		this.classes = classes;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<String, ResultInfo> getResultInfos() {
		return resultInfos;
	}

	public void setResultInfos(Map<String, ResultInfo> resultInfos) {
		this.resultInfos = resultInfos;
	}

}
