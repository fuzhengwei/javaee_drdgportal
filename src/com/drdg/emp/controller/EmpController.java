package com.drdg.emp.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.drdg.emp.bean.DrdgEmp;
import com.drdg.emp.service.IDrdgEmpService;
import com.drdg.util.bean.Result;
import com.drdg.util.date.DateUtil;

@Controller
@RequestMapping("/emp/")
public class EmpController {

	private IDrdgEmpService drdgEmpService;
	
	public IDrdgEmpService getDrdgEmpService() {
		return drdgEmpService;
	}
	
	@Autowired
	public void setDrdgEmpService(IDrdgEmpService drdgEmpService) {
		this.drdgEmpService = drdgEmpService;
	}

	@RequestMapping("doGetEmpList")
	@ResponseBody
	public Map<String, Object> doGetEmpList(){
		List<DrdgEmp> modelList = drdgEmpService.selectModelList();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("total", String.valueOf(modelList.size()));
		map.put("rows", modelList);
		return map;
	}
	
	@RequestMapping("doSaveEmp")
	@ResponseBody
	public Map<String, Object> doSaveEmp(@ModelAttribute DrdgEmp drdgEmp){
		
		drdgEmp.setEmpDate(new Date());
		drdgEmpService.insert(drdgEmp);
		List<DrdgEmp> modelList = drdgEmpService.selectModelList();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("total", String.valueOf(modelList.size()));
		map.put("rows", modelList);
		return map;
		
	}
	
	@RequestMapping("doUpdateEmp")
	@ResponseBody
	public Map<String, Object> doUpdateEmp(@ModelAttribute DrdgEmp drdgEmp){
		
		System.out.println(drdgEmp.getEmpId()+ drdgEmp.getEmpName());
		
		List<DrdgEmp> modelList = drdgEmpService.selectModelList();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("total", String.valueOf(modelList.size()));
		map.put("rows", modelList);
		return map;
	}
	
	@RequestMapping("doDeleteEmpById")
	@ResponseBody
	public Result doDeleteEmpById(@RequestParam String empId){
		
		System.out.println("doDeleteEmpById:=>"+empId);
		
		Result r = new Result();
		r.setSuccess(true);
		
		return r;
	}
}
