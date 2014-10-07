package com.drdg.powergroup.service;

import java.util.List;

import com.drdg.powergroup.bean.PowerGroup;
import com.drdg.projectmodule.bean.TreeProModule;

public interface IPowerGroupService {

	public abstract List<TreeProModule> selectTreeProModule();
	
	public abstract List<PowerGroup> selectPowerGroupTree();
}
