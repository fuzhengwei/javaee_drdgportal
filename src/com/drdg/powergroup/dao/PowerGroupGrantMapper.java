package com.drdg.powergroup.dao;

import com.drdg.powergroup.bean.PowerGroupGrant;

public interface PowerGroupGrantMapper {
    int deleteByPrimaryKey(Integer pggId);

    int insert(PowerGroupGrant record);

    int insertSelective(PowerGroupGrant record);

    PowerGroupGrant selectByPrimaryKey(Integer pggId);

    int updateByPrimaryKeySelective(PowerGroupGrant record);

    int updateByPrimaryKey(PowerGroupGrant record);
}