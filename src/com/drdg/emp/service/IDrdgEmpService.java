package com.drdg.emp.service;

import java.util.List;

import com.drdg.emp.bean.DrdgEmp;
import com.drdg.util.bean.Page;

public interface IDrdgEmpService {

	public abstract int insert(DrdgEmp record);
	
	public abstract int deleteByPrimaryKey(Integer empId);
	
	public abstract int updateByPrimaryKey(DrdgEmp record);
	
	public abstract int updateByPrimaryKeySelective(DrdgEmp record);
	
	public abstract List<DrdgEmp> selectModelList(Page page);
	
	public abstract List<DrdgEmp> selectModelListBySearch(String empName);
	
	public abstract int selectModelCount();
	
}
