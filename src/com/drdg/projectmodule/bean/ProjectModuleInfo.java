package com.drdg.projectmodule.bean;

public class ProjectModuleInfo {
	
	//为树结构建立伪Id
	private Integer fakePmiId;
	
	private Integer id;
	private Integer pmiId;
	private Integer fkPmId;
	private Integer pmiSequence;
	private String pmiName;
	private String pmName;
	private String pmiUrl;
	
	private ProjectModule children;
	
	public void setFakePmiId(Integer fakePmId) {
		this.fakePmiId = fakePmId;
	}

	public Integer getId() {
		return fakePmiId;
	}
	
	public String getPmName() {
		return pmiName;
	}

	public Integer getPmiId() {
		return pmiId;
	}

	public void setPmiId(Integer pmiId) {
		this.pmiId = pmiId;
	}

	public Integer getFkPmId() {
		return fkPmId;
	}

	public void setFkPmId(Integer fkPmId) {
		this.fkPmId = fkPmId;
	}

	public Integer getPmiSequence() {
		return pmiSequence;
	}

	public void setPmiSequence(Integer pmiSequence) {
		this.pmiSequence = pmiSequence;
	}

	public String getPmiName() {
		return pmiName;
	}

	public void setPmiName(String pmiName) {
		this.pmiName = pmiName == null ? null : pmiName.trim();
	}

	public String getPmiUrl() {
		return pmiUrl;
	}

	public void setPmiUrl(String pmiUrl) {
		this.pmiUrl = pmiUrl == null ? null : pmiUrl.trim();
	}

	public ProjectModule getChildren() {
		return children;
	}

	public void setChildren(ProjectModule children) {
		this.children = children;
	}

	@Override
	public String toString() {
		return "ProjectModuleInfo [fkPmId=" + fkPmId + ", pmiId=" + pmiId
				+ ", pmiName=" + pmiName + ", pmiSequence=" + pmiSequence
				+ ", pmiUrl=" + pmiUrl + "]";
	}

}