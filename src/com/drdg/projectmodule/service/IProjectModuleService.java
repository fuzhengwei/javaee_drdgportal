package com.drdg.projectmodule.service;

import java.util.List;

import com.drdg.projectmodule.bean.ProjectModule;
import com.drdg.projectmodule.bean.ProjectModuleInfo;

public interface IProjectModuleService {

	public abstract int insertSelective(ProjectModule record);
	
	public abstract int insertSelective(ProjectModuleInfo record);
	
	public abstract int updateByPrimaryKeySelective(ProjectModule record);
	
	public abstract List<ProjectModule> selectProModuleInfo();
	
	public abstract List<ProjectModule> selectProModule();
	
}
