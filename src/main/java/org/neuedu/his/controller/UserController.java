package org.neuedu.his.controller;


import org.neuedu.his.model.RespBean;
import org.neuedu.his.model.User;
import org.neuedu.his.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping("/getUserByNameAndPass")
    public RespBean getUserByNameAndPass(@RequestBody User user){
        return userService.getUserByNameAndPass(user);
    }
}
