package com.drdg.emp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.drdg.emp.bean.DrdgEmp;
import com.drdg.emp.dao.DrdgEmpMapper;
import com.drdg.emp.service.IDrdgEmpService;
import com.drdg.util.bean.Page;

@Service("drdgEmpService")
public class DrdgEmpService implements IDrdgEmpService {

	private DrdgEmpMapper drdgEmpMapper;
	
	@Autowired
	public void setDrdgEmpMapper(DrdgEmpMapper drdgEmpMapper) {
		this.drdgEmpMapper = drdgEmpMapper;
	}

	public DrdgEmpMapper getDrdgEmpMapper() {
		return drdgEmpMapper;
	}
	
	public List<DrdgEmp> selectModelList(Page page) {
		return drdgEmpMapper.selectModelList(page);
	}

	public int insert(DrdgEmp record) {
		return drdgEmpMapper.insert(record);
	}

	public int updateByPrimaryKey(DrdgEmp record) {
		return drdgEmpMapper.updateByPrimaryKey(record);
	}

	public int updateByPrimaryKeySelective(DrdgEmp record) {
		return drdgEmpMapper.updateByPrimaryKeySelective(record);
	}

	public int deleteByPrimaryKey(Integer empId) {
		return drdgEmpMapper.deleteByPrimaryKey(empId);
	}

	public int selectModelCount() {
		return drdgEmpMapper.selectModelCount();
	}

	public List<DrdgEmp> selectModelListBySearch(String empName) {
		return drdgEmpMapper.selectModelListBySearch(empName);
	}
	
	

	
	
	
}
