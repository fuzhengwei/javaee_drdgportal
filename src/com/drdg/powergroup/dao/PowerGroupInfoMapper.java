package com.drdg.powergroup.dao;

import com.drdg.powergroup.bean.PowerGroupInfo;

public interface PowerGroupInfoMapper {
    int deleteByPrimaryKey(Integer pgiId);

    int insert(PowerGroupInfo record);

    int insertSelective(PowerGroupInfo record);

    PowerGroupInfo selectByPrimaryKey(Integer pgiId);

    int updateByPrimaryKeySelective(PowerGroupInfo record);

    int updateByPrimaryKey(PowerGroupInfo record);
}