package org.neuedu.his.mapper;

import org.neuedu.his.model.Disease;

public interface DiseaseMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Disease record);

    int insertSelective(Disease record);

    Disease selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Disease record);

    int updateByPrimaryKey(Disease record);
}