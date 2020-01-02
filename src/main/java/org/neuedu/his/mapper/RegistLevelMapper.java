package org.neuedu.his.mapper;

import org.apache.ibatis.annotations.Param;
import org.neuedu.his.model.RegistLevel;

import java.util.List;

public interface RegistLevelMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RegistLevel record);

    int insertSelective(RegistLevel record);

    RegistLevel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RegistLevel record);

    int updateByPrimaryKey(RegistLevel record);

    List<RegistLevel> getAllRegistLevel(@Param("deptid")Integer deptid,@Param("scheddate")String scheddate,@Param("noon")String noon);

    RegistLevel getRegistQuota(@Param("id") String id);

    List<RegistLevel> getRegistLevel();

    List<RegistLevel> allRegistLevels();

    List<RegistLevel> searchRegByKeyWords(String keywords);

    Integer delRegistLevel(Integer id);

}