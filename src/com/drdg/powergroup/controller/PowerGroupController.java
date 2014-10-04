package com.drdg.powergroup.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.drdg.powergroup.service.IPowerGroupService;
import com.drdg.projectmodule.bean.TreeProModule;

@Controller("powerGroup")
@RequestMapping("/powerGroup/")
public class PowerGroupController {
	
	private IPowerGroupService powerGroupService;
	
	public IPowerGroupService getPowerGroupService() {
		return powerGroupService;
	}

	@Autowired
	public void setPowerGroupService(IPowerGroupService powerGroupService) {
		this.powerGroupService = powerGroupService;
	}

	@RequestMapping("doGetTreeProModule")
	@ResponseBody
	public List<TreeProModule> doGetTreeProModule(){
		
		List<TreeProModule> modelList = powerGroupService.selectTreeProModule();
		System.out.println(modelList);
		return modelList;
		
	}
	
}
