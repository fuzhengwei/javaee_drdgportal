package com.drdg.emp.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
import com.drdg.util.bean.Page;
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
	public Map<String, Object> doGetEmpList(@ModelAttribute Page page){
		
		List<DrdgEmp> modelList = drdgEmpService.selectModelList(page);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("total", drdgEmpService.selectModelCount());
		map.put("rows", modelList);
		return map;
	}
	
	@RequestMapping("doSaveEmp")
	@ResponseBody
	public ModelAndView doSaveEmp(@ModelAttribute DrdgEmp drdgEmp,@ModelAttribute Page page){
		ModelAndView mv = new ModelAndView();
		drdgEmp.setEmpDate(new Date());
		
		if(drdgEmpService.insert(drdgEmp) > 0){
			mv.addObject("page", page);
			mv.setViewName("emp/doGetEmpList.do");
		}else{
			System.out.println("保存失败，记录日志");
		}
		return mv;
		
	}
	
	@RequestMapping("doUpdateEmp")
	@ResponseBody
	public ModelAndView doUpdateEmp(@ModelAttribute DrdgEmp drdgEmp,@ModelAttribute Page page){
		ModelAndView mv = new ModelAndView();
		if(drdgEmpService.updateByPrimaryKeySelective(drdgEmp) > 0){
			mv.addObject("page", page);
			mv.setViewName("emp/doGetEmpList.do");
		}else{
			System.out.println("修改失败，记录日志");
		}
		return mv;
	}
	
	@RequestMapping("doDeleteEmpById")
	@ResponseBody
	public Result doDeleteEmpById(@RequestParam Integer empId){
		
		Result result = new Result();
		if(drdgEmpService.deleteByPrimaryKey(empId) > 0){
			result.setSuccess(true);
		}else{
			result.setSuccess(false);
		}
		return result;
	}
}
