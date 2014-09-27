package com.drdg.projectmodule.dao;

import com.drdg.projectmodule.bean.ProjectModuleInfo;

public interface ProjectModuleInfoMapper {
    int deleteByPrimaryKey(Integer pmiId);

    int insert(ProjectModuleInfo record);

    int insertSelective(ProjectModuleInfo record);

    ProjectModuleInfo selectByPrimaryKey(Integer pmiId);

    int updateByPrimaryKeySelective(ProjectModuleInfo record);

    int updateByPrimaryKey(ProjectModuleInfo record);
}