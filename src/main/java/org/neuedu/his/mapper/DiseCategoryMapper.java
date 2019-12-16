package org.neuedu.his.mapper;

import org.neuedu.his.model.DiseCategory;

public interface DiseCategoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DiseCategory record);

    int insertSelective(DiseCategory record);

    DiseCategory selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DiseCategory record);

    int updateByPrimaryKey(DiseCategory record);
}