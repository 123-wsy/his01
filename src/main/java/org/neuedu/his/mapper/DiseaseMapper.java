package org.neuedu.his.mapper;

import org.apache.ibatis.annotations.Param;
import org.neuedu.his.model.Disease;

import java.util.List;

public interface DiseaseMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Disease record);

    int insertSelective(Disease record);

    Disease selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Disease record);

    int updateByPrimaryKey(Disease record);

    List<Disease> getDisease(@Param("keyword") String keyword);
}