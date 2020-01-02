package org.neuedu.his.mapper;

import org.apache.ibatis.annotations.Param;
import org.neuedu.his.model.Register;
import org.neuedu.his.model.User;

import java.util.List;

public interface RegisterMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Register record);

    int insertSelective(Register record);

    Register selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Register record);

    int updateByPrimaryKey(Register record);

    Register getRegister();

    List<User> getRegistCount(@Param("userid") Integer userid);

}