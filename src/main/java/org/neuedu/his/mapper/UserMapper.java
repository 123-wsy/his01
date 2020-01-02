package org.neuedu.his.mapper;

import org.apache.ibatis.annotations.Param;
import org.neuedu.his.model.RegisterInfo;
import org.neuedu.his.model.User;

import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User getUserByNameAndPass(User user);

    List<User> getUserByDeptAndRegist(@Param("dept") Integer dept,@Param("regist") Integer regist);

    List<User> searchUsers(String keywords);

    Integer addUsers(User user);

    Integer delUserById(Integer id);
}