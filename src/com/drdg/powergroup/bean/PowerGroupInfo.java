package com.drdg.powergroup.bean;

import com.drdg.projectmodule.bean.ProjectModuleInfo;

public class PowerGroupInfo {
	
    private Integer pgiId;
    private Integer fkPgId;
    private Integer fkPmiId;

    private ProjectModuleInfo children;
    
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

	public ProjectModuleInfo getChildren() {
		return children;
	}

	public void setChildren(ProjectModuleInfo children) {
		this.children = children;
	}

	@Override
	public String toString() {
		return "PowerGroupInfo [children=" + children + ", fkPgId=" + fkPgId
				+ ", fkPmiId=" + fkPmiId + ", pgiId=" + pgiId + "]";
	}
	
}