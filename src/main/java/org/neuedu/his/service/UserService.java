package org.neuedu.his.service;

import org.neuedu.his.mapper.UserMapper;
import org.neuedu.his.model.RespBean;
import org.neuedu.his.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
