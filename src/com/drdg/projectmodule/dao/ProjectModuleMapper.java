package com.drdg.projectmodule.dao;

import java.util.List;

import com.drdg.projectmodule.bean.ProjectModule;

public interface ProjectModuleMapper {
    int deleteByPrimaryKey(Integer pmId);

    int insert(ProjectModule record);

    int insertSelective(ProjectModule record);

    ProjectModule selectByPrimaryKey(Integer pmId);

    List<ProjectModule> selectProModuleInfo();
    
    int updateByPrimaryKeySelective(ProjectModule record);

    int updateByPrimaryKey(ProjectModule record);
}