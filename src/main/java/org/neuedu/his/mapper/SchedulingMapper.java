package org.neuedu.his.mapper;

import org.apache.ibatis.annotations.Param;
import org.neuedu.his.model.Scheduling;
import org.neuedu.his.model.User;

import java.util.List;

public interface SchedulingMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Scheduling record);

    int insertSelective(Scheduling record);

    Scheduling selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Scheduling record);

    int updateByPrimaryKey(Scheduling record);

    List<Scheduling> getSchedulingByDate(@Param("startDate") String startDate,@Param("endDate") String endDate);

//    List<Scheduling> getNoon(@Param("visitdate") String visitdate);

//    List<Scheduling> getDept(@Param("visitdate")String visitdate,@Param("noon") String noon);
    List<Scheduling> getUserByDeptIdAndLevelAndDate(@Param("deptid") Integer deptid, @Param("registleid") Integer registleid, @Param("scheddate") String scheddate, @Param("noon") String noon);
}