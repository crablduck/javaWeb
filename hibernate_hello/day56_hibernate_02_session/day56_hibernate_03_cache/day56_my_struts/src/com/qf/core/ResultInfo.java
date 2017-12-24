package com.qf.core;

public class ResultInfo {

	private String name;
	
	private String type;
	
	private String text;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "ResultInfo [name=" + name + ", type=" + type + ", text=" + text + "]";
	}

	
}
