package com.drdg.powergroup.bean;

public class PowerGroup {

	private Integer pgId;
	private String pgName;

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
}