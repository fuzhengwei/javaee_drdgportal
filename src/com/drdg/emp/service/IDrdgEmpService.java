package com.drdg.emp.service;

import java.util.List;

import com.drdg.emp.bean.DrdgEmp;

public interface IDrdgEmpService {

	public abstract int insert(DrdgEmp record);
	
	public abstract int updateByPrimaryKey(DrdgEmp record);
	
	public abstract List<DrdgEmp> selectModelList();
	
}
