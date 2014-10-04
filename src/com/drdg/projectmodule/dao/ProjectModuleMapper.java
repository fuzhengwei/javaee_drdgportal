package com.drdg.projectmodule.dao;

import java.util.List;

import com.drdg.projectmodule.bean.ProjectModule;
import com.drdg.projectmodule.bean.TreeProModule;

public interface ProjectModuleMapper {
	
    int deleteProModuleByPrimaryKey(Integer pmId);

    int insert(ProjectModule record);

    int insertSelective(ProjectModule record);

    ProjectModule selectByPrimaryKey(Integer pmId);

    List<ProjectModule> selectProModuleInfo();
    
    List<ProjectModule> selectProModule();
    
    List<TreeProModule> selectTreeProModule();
    
    int updateByPrimaryKeySelective(ProjectModule record);

    int updateByPrimaryKey(ProjectModule record);
}