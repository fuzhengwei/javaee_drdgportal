package com.drdg.powergroup.bean;

public class PowerGroupGrant {
	
	private Integer pggId;
	private Integer fkPgId;
	private Integer fkEmpId;
	
	public Integer getPggId() {
		return pggId;
	}

	public void setPggId(Integer pggId) {
		this.pggId = pggId;
	}

	public Integer getFkPgId() {
		return fkPgId;
	}

	public void setFkPgId(Integer fkPgId) {
		this.fkPgId = fkPgId;
	}

	public Integer getFkEmpId() {
		return fkEmpId;
	}

	public void setFkEmpId(Integer fkEmpId) {
		this.fkEmpId = fkEmpId;
	}
}