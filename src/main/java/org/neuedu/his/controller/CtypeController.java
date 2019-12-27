package org.neuedu.his.controller;

import org.neuedu.his.model.Constanttype;
import org.neuedu.his.service.CtypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ctype")
public class CtypeController {
    @Autowired
    CtypeService ctypeService;
    /*还没写完呢*/
    @GetMapping("/")
    public List<Constanttype> getCtypeByCodeOrName(@RequestParam(name = "constanttypecode",defaultValue = "") String constanttypecode, @RequestParam(name = "constanttypename",defaultValue = "") String constanttypename){
        return ctypeService.getCtypeByCodeOrName(constanttypecode,constanttypename);
    }
}
