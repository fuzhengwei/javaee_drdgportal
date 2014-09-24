package com.drdg.emp.bean;

import java.util.Date;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.drdg.util.CustomDateSerializer;

public class DrdgEmp {
    private Integer empId;

    private String empName;

    private String empPwd;

    private String empPower;

    private Date empDate;

    private String empState;

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName == null ? null : empName.trim();
    }

    public String getEmpPwd() {
        return empPwd;
    }

    public void setEmpPwd(String empPwd) {
        this.empPwd = empPwd == null ? null : empPwd.trim();
    }

    public String getEmpPower() {
        return empPower;
    }

    public void setEmpPower(String empPower) {
        this.empPower = empPower == null ? null : empPower.trim();
    }

    @JsonSerialize(using = CustomDateSerializer.class)
    public Date getEmpDate() {
        return empDate;
    }

    public void setEmpDate(Date empDate) {
        this.empDate = empDate;
    }

    public String getEmpState() {
        return empState;
    }

    public void setEmpState(String empState) {
        this.empState = empState == null ? null : empState.trim();
    }

	@Override
	public String toString() {
		return "DrdgEmp [empDate=" + empDate + ", empId=" + empId
				+ ", empName=" + empName + ", empPower=" + empPower
				+ ", empPwd=" + empPwd + ", empState=" + empState + "]";
	}

}