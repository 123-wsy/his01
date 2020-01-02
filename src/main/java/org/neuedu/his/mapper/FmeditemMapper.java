package org.neuedu.his.mapper;

import org.apache.ibatis.annotations.Param;
import org.neuedu.his.model.Fmeditem;

import java.util.List;

public interface FmeditemMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Fmeditem record);

    int insertSelective(Fmeditem record);

    Fmeditem selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Fmeditem record);

    int updateByPrimaryKey(Fmeditem record);

    List<Fmeditem> searchAllFmeditem(@Param("keyword") String keyword);

    Integer delfmeditem(Integer id);

    Integer delManyfmeditem(@Param("ids")Integer[] ids);
}