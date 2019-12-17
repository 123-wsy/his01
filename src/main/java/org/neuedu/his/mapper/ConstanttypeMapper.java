package org.neuedu.his.mapper;

import org.apache.ibatis.annotations.Param;
import org.neuedu.his.model.Constanttype;

import java.util.List;

public interface ConstanttypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Constanttype record);

    int insertSelective(Constanttype record);

    Constanttype selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Constanttype record);

    int updateByPrimaryKey(Constanttype record);

    List<Constanttype> getCtypeByCodeOrName(@Param("constanttypecode") String constanttypecode,@Param("constanttypename") String constanttypename);
}