package org.neuedu.his.mapper;

import org.neuedu.his.model.Expenseclass;

public interface ExpenseclassMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Expenseclass record);

    int insertSelective(Expenseclass record);

    Expenseclass selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Expenseclass record);

    int updateByPrimaryKey(Expenseclass record);
}