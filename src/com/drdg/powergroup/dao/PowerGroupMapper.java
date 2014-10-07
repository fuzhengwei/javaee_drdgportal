package com.drdg.powergroup.dao;

import java.util.List;

import com.drdg.powergroup.bean.PowerGroup;

public interface PowerGroupMapper {
    int deleteByPrimaryKey(Integer pgId);

    int insert(PowerGroup record);

    int insertSelective(PowerGroup record);

    List<PowerGroup> selectPowerGroupTree();
    
    PowerGroup selectByPrimaryKey(Integer pgId);

    int updateByPrimaryKeySelective(PowerGroup record);

    int updateByPrimaryKey(PowerGroup record);
}