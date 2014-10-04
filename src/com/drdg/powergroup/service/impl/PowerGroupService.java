package com.drdg.powergroup.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.drdg.powergroup.service.IPowerGroupService;
import com.drdg.projectmodule.bean.TreeProModule;
import com.drdg.projectmodule.dao.ProjectModuleMapper;

@Controller("powerGroupService")
public class PowerGroupService implements IPowerGroupService {

	private ProjectModuleMapper projectModuleMapper;
	
	public ProjectModuleMapper getProjectModuleMapper() {
		return projectModuleMapper;
	}

	@Autowired
	public void setProjectModuleMapper(ProjectModuleMapper projectModuleMapper) {
		this.projectModuleMapper = projectModuleMapper;
	}

	public List<TreeProModule> selectTreeProModule() {
		return projectModuleMapper.selectTreeProModule();
	}

}
