package org.neuedu.his.mapper;

import org.apache.ibatis.annotations.Param;
import org.neuedu.his.model.DiseCategory;

import java.util.List;

public interface DiseCategoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DiseCategory record);

    int insertSelective(DiseCategory record);

    DiseCategory selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DiseCategory record);

    int updateByPrimaryKey(DiseCategory record);

    List<DiseCategory> getDiseCategory(@Param("keyword") String keyword);

    DiseCategory getLastId();

    List<DiseCategory> getDiseCategorys();

    Integer deleteByPrimaryKeyS(@Param("ids") Integer[] ids);
}