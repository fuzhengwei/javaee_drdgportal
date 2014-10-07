package com.drdg.powergroup.bean;

import java.util.List;

import com.drdg.projectmodule.bean.ProjectModule;

public class PowerGroup {

	private Integer id;
	private Integer pgId;
	private String pgName;
	private String pmName;

	private List<ProjectModule> children;

	public String getPmName() {
		return pgName;
	}

	// 用于树结构的ID,如果上层还有那么需要使用伪id
	public Integer getId() {
		return pgId;
	}

	public Integer getPgId() {
		return pgId;
	}

	public void setPgId(Integer pgId) {
		this.pgId = pgId;
	}

	public String getPgName() {
		return pgName;
	}

	public void setPgName(String pgName) {
		this.pgName = pgName == null ? null : pgName.trim();
	}

	public List<ProjectModule> getChildren() {
		return children;
	}

	public void setChildren(List<ProjectModule> children) {
		this.children = children;
	}

	@Override
	public String toString() {
		return "PowerGroup [children=" + children + ", pgId=" + pgId
				+ ", pgName=" + pgName + "]";
	}

}