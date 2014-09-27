package com.drdg.projectmodule.bean;

public class ProjectModuleInfo {
	
	private Integer id;
	private Integer pmiId;
	private Integer fkPmId;
	private Integer pmiSequence;
	private String pmiName;
	private String pmName;
	private String pmiUrl;
	
	public String getPmName() {
		return pmiName;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "ProjectModuleInfo [fkPmId=" + fkPmId + ", pmiId=" + pmiId
				+ ", pmiName=" + pmiName + ", pmiSequence=" + pmiSequence
				+ ", pmiUrl=" + pmiUrl + "]";
	}

}