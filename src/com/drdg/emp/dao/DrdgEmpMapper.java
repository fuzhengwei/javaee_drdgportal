package com.drdg.emp.dao;

import java.util.List;

import com.drdg.emp.bean.DrdgEmp;

public interface DrdgEmpMapper {
    int deleteByPrimaryKey(Integer empId);

    int insert(DrdgEmp record);

    int insertSelective(DrdgEmp record);

    DrdgEmp selectByPrimaryKey(Integer empId);

    List<DrdgEmp> selectModelList();
    
    int updateByPrimaryKeySelective(DrdgEmp record);

    int updateByPrimaryKey(DrdgEmp record);
}