package com.drdg.projectmodule.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.drdg.projectmodule.bean.ProjectModule;
import com.drdg.projectmodule.bean.ProjectModuleInfo;
import com.drdg.projectmodule.dao.ProjectModuleInfoMapper;
import com.drdg.projectmodule.dao.ProjectModuleMapper;
import com.drdg.projectmodule.service.IProjectModuleService;

@Controller("projectModuleService")
public class ProjectModuleService implements IProjectModuleService {

	private ProjectModuleMapper projectModuleMapper;
	private ProjectModuleInfoMapper projectModuleInfoMapper;
	
	public ProjectModuleMapper getProjectModuleMapper() {
		return projectModuleMapper;
	}

	@Autowired
	public void setProjectModuleMapper(ProjectModuleMapper projectModuleMapper) {
		this.projectModuleMapper = projectModuleMapper;
	}

	public ProjectModuleInfoMapper getProjectModuleInfoMapper() {
		return projectModuleInfoMapper;
	}

	@Autowired
	public void setProjectModuleInfoMapper(
			ProjectModuleInfoMapper projectModuleInfoMapper) {
		this.projectModuleInfoMapper = projectModuleInfoMapper;
	}

	public List<com.drdg.projectmodule.bean.ProjectModule> selectProModuleInfo() {
		return projectModuleMapper.selectProModuleInfo();
	}

	public int insertSelective(ProjectModule record) {
		return projectModuleMapper.insertSelective(record);
	}

	public List<ProjectModule> selectProModule() {
		return projectModuleMapper.selectProModule();
	}

	public int insertSelective(ProjectModuleInfo record) {
		return projectModuleInfoMapper.insertSelective(record);
	}

}
