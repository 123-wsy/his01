package org.neuedu.his.service;

import org.neuedu.his.mapper.RegisterMapper;
import org.neuedu.his.model.Register;
import org.neuedu.his.model.RespBean;
import org.neuedu.his.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegisterService {
    @Autowired
    RegisterMapper registerMapper;
    public Register getRegister() {
        return registerMapper.getRegister();
    }

    public List<User> getRegistCount(Integer userid) {
        return registerMapper.getRegistCount(userid);
    }

    public RespBean insertSelective(Register register) {
        Integer i = registerMapper.insertSelective(register);
        if(i == 0){
            return RespBean.error("添加失败");
        }else{
            return RespBean.ok("添加成功");
        }
    }
}
