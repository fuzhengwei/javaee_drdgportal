package com.drdg.powergroup.bean;

public class PowerGroupInfo {
	
    private Integer pgiId;
    private Integer fkPgId;
    private Integer fkPmiId;

    public Integer getPgiId() {
        return pgiId;
    }

    public void setPgiId(Integer pgiId) {
        this.pgiId = pgiId;
    }

    public Integer getFkPgId() {
        return fkPgId;
    }

    public void setFkPgId(Integer fkPgId) {
        this.fkPgId = fkPgId;
    }

    public Integer getFkPmiId() {
        return fkPmiId;
    }

    public void setFkPmiId(Integer fkPmiId) {
        this.fkPmiId = fkPmiId;
    }
}