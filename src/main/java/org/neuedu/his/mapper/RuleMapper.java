package org.neuedu.his.mapper;

import org.apache.ibatis.annotations.Param;
import org.neuedu.his.model.Rule;

import java.util.List;

public interface RuleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Rule record);

    int insertSelective(Rule record);

    Rule selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Rule record);

    int updateByPrimaryKey(Rule record);

    Integer addRule(@Param("ruleName") String ruleName,@Param("userid") Integer userid,@Param("deptid") Integer deptid,@Param("schedulingRule") String schedulingRule);

    List<Rule> getRule(@Param("deptid") Integer deptid);
}