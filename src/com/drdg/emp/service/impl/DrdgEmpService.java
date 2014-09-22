package com.drdg.emp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.drdg.emp.bean.DrdgEmp;
import com.drdg.emp.dao.DrdgEmpMapper;
import com.drdg.emp.service.IDrdgEmpService;

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
	
	public List<DrdgEmp> selectModelList() {
		return drdgEmpMapper.selectModelList();
	}

	public int insert(DrdgEmp record) {
		return drdgEmpMapper.insert(record);
	}

	public int updateByPrimaryKey(DrdgEmp record) {
		return drdgEmpMapper.updateByPrimaryKey(record);
	}
	
	

	
	
	
}
