package org.neuedu.his.mapper;

import org.apache.ibatis.annotations.Param;
import org.neuedu.his.model.Constantitem;

import java.util.List;

public interface ConstantitemMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Constantitem record);

    int insertSelective(Constantitem record);

    Constantitem selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Constantitem record);

    int updateByPrimaryKey(Constantitem record);

    List<Constantitem> getConstantitem(@Param("constanttypeid") Integer constanttypeid);
}