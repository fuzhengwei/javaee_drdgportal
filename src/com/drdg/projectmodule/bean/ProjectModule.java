package com.drdg.projectmodule.bean;

import java.util.List;

public class ProjectModule {

	//为树结构建立伪Id
	private Integer fakePmId;
	
	private Integer id;
	private Integer pmId;
	private String pmName;
	private String pmState;
	private String pmRemarks;
	private List<ProjectModuleInfo> children;
	
	public void setFakePmId(Integer fakePmId) {
		this.fakePmId = fakePmId;
	}

	public Integer getId() {
		return fakePmId;
	}

	public List<ProjectModuleInfo> getChildren() {
		return children;
	}

	public void setChildren(List<ProjectModuleInfo> children) {
		this.children = children;
	}

	public Integer getPmId() {
		return pmId;
	}

	public void setPmId(Integer pmId) {
		this.pmId = pmId;
	}

	public String getPmName() {
		return pmName;
	}

	public void setPmName(String pmName) {
		this.pmName = pmName == null ? null : pmName.trim();
	}

	public String getPmState() {
		return pmState;
	}

	public void setPmState(String pmState) {
		this.pmState = pmState == null ? null : pmState.trim();
	}

	public String getPmRemarks() {
		return pmRemarks;
	}

	public void setPmRemarks(String pmRemarks) {
		this.pmRemarks = pmRemarks == null ? null : pmRemarks.trim();
	}

	@Override
	public String toString() {
		return "ProjectModule [children=" + children + ", id=" + id + ", pmId="
				+ pmId + ", pmName=" + pmName + ", pmRemarks=" + pmRemarks
				+ ", pmState=" + pmState + "]";
	}

}