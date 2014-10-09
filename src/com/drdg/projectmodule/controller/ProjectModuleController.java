package com.drdg.projectmodule.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.drdg.projectmodule.bean.ProjectModule;
import com.drdg.projectmodule.bean.ProjectModuleInfo;
import com.drdg.projectmodule.service.IProjectModuleService;
import com.drdg.util.bean.Result;

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

	@RequestMapping("doSaveProModule")
	@ResponseBody
	public Result doSaveProModule(@ModelAttribute ProjectModule proModule){
		Result r = new Result();
		if(projectModuleService.insertSelective(proModule) > 0){
			r.setSuccess(true);
		}else{
			r.setSuccess(false);
			r.setErrorMsg("doSaveProModule error");
		}
		return r;
	}
	
	@RequestMapping("doDeleteProModuleByPrimaryKey")
	@ResponseBody
	public Result doDeleteProModuleByPrimaryKey(@RequestParam Integer pmId){
		Result r = new Result();
		if(projectModuleService.deleteProModuleByPrimaryKey(pmId) > 0){
			r.setSuccess(true);
		}else{
			r.setSuccess(false);
			r.setErrorMsg("doDeleteProModuleByPrimaryKey error");
		}
		return r;
	}
	
	@RequestMapping("doUpdateProModule")
	@ResponseBody
	public Result doUpdateProModule(@ModelAttribute ProjectModule proModule){
		
		Result r = new Result();
		if(projectModuleService.updateByPrimaryKeySelective(proModule) > 0){
			r.setSuccess(true);
		}else{
			r.setSuccess(false);
			r.setErrorMsg("doUpdateProModule error");
		}
		return r;
	}
	
	@RequestMapping("doSaveProModuleInfo")
	@ResponseBody
	public Result doSaveProModuleInfo(@ModelAttribute ProjectModuleInfo record){
		Result r = new Result();
		if(projectModuleService.insertSelective(record) > 0){
			r.setSuccess(true);
		}else{
			r.setSuccess(false);
			r.setErrorMsg("doSaveProModuleInfo error");
		}
		return r;
	}
	
	@RequestMapping("doDeleteProModuleInfoByPrimaryKey")
	@ResponseBody
	public Result doDeleteProModuleInfoByPrimaryKey(@RequestParam Integer pmiId){
		Result r = new Result();
		if(projectModuleService.deleteProModuleInfoByPrimaryKey(pmiId) > 0){
			r.setSuccess(true);
		}else{
			r.setSuccess(false);
			r.setErrorMsg("doDeleteProModuleInfoByPrimaryKey error");
		}
		return r;
	}
	
	
	@RequestMapping("doUpdateProModuleInfo")
	@ResponseBody
	public Result doUpdateProModuleInfo(@ModelAttribute ProjectModuleInfo record){
		Result r = new Result();
		if(projectModuleService.updateByPrimaryKeySelective(record) > 0){
			r.setSuccess(true);
		}else{
			r.setSuccess(false);
			r.setErrorMsg("doUpdateProModuleInfo error");
		}
		return r;
		
	}
	
	@RequestMapping("doGetProModule")
	@ResponseBody
	public List<ProjectModule> doGetProModule(){
		return projectModuleService.selectProModule();
	}
	
	@RequestMapping("doGetProModuleBaseInfo")
	@ResponseBody
	public List<ProjectModule> doGetProModuleBaseInfo() {
		List<ProjectModule> modelList = projectModuleService.selectProModuleInfo();
		return modelList;
	}

	
	
}
