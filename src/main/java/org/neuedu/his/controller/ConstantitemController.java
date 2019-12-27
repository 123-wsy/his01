package org.neuedu.his.controller;

import org.neuedu.his.model.Constantitem;
import org.neuedu.his.service.ConstantitemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Constantitem")
public class ConstantitemController {
    @Autowired
    ConstantitemService constantitemService;
    @GetMapping("/getConstantitem")
    public List<Constantitem> getConstantitem(Integer constanttypeid){
        return constantitemService.getConstantitem(constanttypeid);
    }
}
