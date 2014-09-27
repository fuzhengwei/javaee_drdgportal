package com.drdg.projectmodule.bean;

import java.util.List;

public class ProjectModule {

	private Integer id;
	private Integer pmId;
	private String pmName;
	private String pmState;
	private String pmRemarks;
	private List<ProjectModuleInfo> children;
	
	public Integer getId() {
		return getPmId();
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