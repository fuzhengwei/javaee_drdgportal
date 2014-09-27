package com.drdg.projectmodule.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.drdg.projectmodule.bean.ProjectModule;
import com.drdg.projectmodule.service.IProjectModuleService;

@Controller
@RequestMapping("/proModule/")
public class ProjectModuleController {

	private IProjectModuleService projectModuleService;

	public IProjectModuleService getProjectModuleService() {
		return projectModuleService;
	}

	@Autowired
	public void setProjectModuleService(
			IProjectModuleService projectModuleService) {
		this.projectModuleService = projectModuleService;
	}

	@RequestMapping("doGetProModuleBaseInfo")
	@ResponseBody
	public List<ProjectModule> doGetProModuleBaseInfo() {

		List<ProjectModule> modelList = projectModuleService.selectProModuleInfo();
		
		return modelList;
	}

}
