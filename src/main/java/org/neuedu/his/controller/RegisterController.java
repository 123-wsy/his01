package org.neuedu.his.controller;

import org.neuedu.his.model.Register;
import org.neuedu.his.model.RespBean;
import org.neuedu.his.model.User;
import org.neuedu.his.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Register")
public class RegisterController {
    @Autowired
    RegisterService registerService;
    @GetMapping("/getRegister")
    public Register getRegister(){
        return registerService.getRegister();
    }

    @GetMapping("/getRegistCount")
    public List<User> getRegistCount(@RequestParam("userid") Integer userid){
        return registerService.getRegistCount(userid);
    }

    @PostMapping("/insertSelective")
    public RespBean insertSelective(@RequestBody Register register){
        return registerService.insertSelective(register);
    }
}
