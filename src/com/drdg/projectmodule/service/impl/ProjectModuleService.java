package com.drdg.projectmodule.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.drdg.projectmodule.dao.ProjectModuleMapper;
import com.drdg.projectmodule.service.IProjectModuleService;

@Controller("projectModuleService")
public class ProjectModuleService implements IProjectModuleService {

	private ProjectModuleMapper projectModuleMapper;
	
	public ProjectModuleMapper getProjectModuleMapper() {
		return projectModuleMapper;
	}

	@Autowired
	public void setProjectModuleMapper(ProjectModuleMapper projectModuleMapper) {
		this.projectModuleMapper = projectModuleMapper;
	}

	public List<com.drdg.projectmodule.bean.ProjectModule> selectProModuleInfo() {
		return projectModuleMapper.selectProModuleInfo();
	}

}
