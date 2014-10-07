package com.drdg.powergroup.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.drdg.powergroup.bean.PowerGroup;
import com.drdg.powergroup.dao.PowerGroupMapper;
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
	
	private PowerGroupMapper powerGroupMapper;
	
	public PowerGroupMapper getPowerGroupMapper() {
		return powerGroupMapper;
	}

	@Autowired
	public void setPowerGroupMapper(PowerGroupMapper powerGroupMapper) {
		this.powerGroupMapper = powerGroupMapper;
	}

	public List<TreeProModule> selectTreeProModule() {
		return projectModuleMapper.selectTreeProModule();
	}

	public List<PowerGroup> selectPowerGroupTree() {
		return powerGroupMapper.selectPowerGroupTree();
	}

}
