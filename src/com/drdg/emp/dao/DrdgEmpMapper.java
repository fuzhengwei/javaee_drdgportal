package com.drdg.emp.dao;

import java.util.List;

import com.drdg.emp.bean.DrdgEmp;
import com.drdg.util.bean.Page;

public interface DrdgEmpMapper {
    int deleteByPrimaryKey(Integer empId);

    int insert(DrdgEmp record);

    int insertSelective(DrdgEmp record);

    DrdgEmp selectByPrimaryKey(Integer empId);

    int selectModelCount();
    
    List<DrdgEmp> selectModelList(Page page);
    
    int updateByPrimaryKeySelective(DrdgEmp record);

    int updateByPrimaryKey(DrdgEmp record);
}