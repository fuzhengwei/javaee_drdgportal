package com.drdg.projectmodule.bean;

import java.util.List;

public class TreeProModule {

	private String id;
	private String text;
	private String state;

	private List<TreeProModuleInfo> children;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public List<TreeProModuleInfo> getChildren() {
		return children;
	}

	public void setChildren(List<TreeProModuleInfo> children) {
		this.children = children;
	}

	@Override
	public String toString() {
		return "TreeProModule [children=" + children + ", id=" + id
				+ ", state=" + state + ", text=" + text + "]";
	}

}
