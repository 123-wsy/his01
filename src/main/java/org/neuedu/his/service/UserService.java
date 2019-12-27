package org.neuedu.his.service;

import org.neuedu.his.mapper.UserMapper;
import org.neuedu.his.model.RegisterInfo;
import org.neuedu.his.model.RespBean;
import org.neuedu.his.model.SchedInfo;
import org.neuedu.his.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;
    public RespBean getUserByNameAndPass(User user) {
        User user1 = userMapper.getUserByNameAndPass(user);
        if(user1 == null){
            RespBean error = RespBean.error("没这人");
            return error;
        }else{
            RespBean ok = RespBean.ok("登陆成功", user1);
            return ok;
        }
    }

    public List<User> getUserByDeptAndRegist(Integer dept,Integer regist) {
        return userMapper.getUserByDeptAndRegist(dept,regist);
    }

    public List<User> searchUsers(String keywords) {
        return userMapper.searchUsers(keywords);
    }

    public RespBean addUsers(User user) {
        Integer i=userMapper.insertSelective(user);
        if (i !=0){
            return RespBean.ok("新增用户成功");
        }else{
            return RespBean.error("新增用户失败");
        }
    }

    public RespBean updateUserById(User user) {
        Integer i=userMapper.updateByPrimaryKeySelective(user);
        if (i !=0){
            return RespBean.ok("编辑用户成功");
        }else{
            return RespBean.error("编辑用户失败");
        }
    }

    public RespBean delUserById(Integer id) {
        Integer i=userMapper.delUserById(id);
        if (i !=0){
            return RespBean.ok("删除用户成功");
        }else{
            return RespBean.error("删除用户失败");
        }
    }
}
