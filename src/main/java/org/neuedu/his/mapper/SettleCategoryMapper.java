package org.neuedu.his.mapper;

import org.neuedu.his.model.SettleCategory;

public interface SettleCategoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SettleCategory record);

    int insertSelective(SettleCategory record);

    SettleCategory selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SettleCategory record);

    int updateByPrimaryKey(SettleCategory record);
}