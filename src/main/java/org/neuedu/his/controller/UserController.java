package org.neuedu.his.controller;


import org.neuedu.his.model.RegisterInfo;
import org.neuedu.his.model.RespBean;
import org.neuedu.his.model.SchedInfo;
import org.neuedu.his.model.User;
import org.neuedu.his.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping("/getUserByNameAndPass")
    public RespBean getUserByNameAndPass(@RequestBody User user){
        return userService.getUserByNameAndPass(user);
    }

    @GetMapping("/getUserByDeptAndRegist")
    public List<User> getUserByDeptAndRegist(@RequestParam(name="dept",defaultValue = "") Integer dept,@RequestParam(name="regist",defaultValue = "")Integer regist){
        return userService.getUserByDeptAndRegist(dept,regist);
    }

    /*查询用户*/
    @GetMapping("/searchUsers")
    public List<User> searchUsers(String keywords){
        return userService.searchUsers(keywords);
    }
    /*新增用户*/
    @PostMapping("/addUsers")
    public RespBean addUsers(@RequestBody User user){
        return userService.addUsers(user);
    }
    /*编辑用户*/
    @PutMapping("/updateUserById")
    public RespBean updateUserById(@RequestBody User user){
        return userService.updateUserById(user);
    }
    /*删除用户*/
    @PutMapping("/delUserById")
    public RespBean delUserById(Integer id){
        return userService.delUserById(id);
    }

}
