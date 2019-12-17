package org.neuedu.his.controller;

import org.neuedu.his.model.Department;
import org.neuedu.his.model.RespBean;
import org.neuedu.his.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/dept")
public class DeptController {
    @Autowired
    DeptService deptService;
    @GetMapping("/getDeptByCodeOrName")
    public RespBean getDeptByCodeOrName(@RequestBody Department department){
        return deptService.getDeptByCodeOrName(department);
    }
    @DeleteMapping("/delDeptByIds")
    public RespBean delDeptByIds(Integer[] ids){
        return deptService.delDeptByIds(ids);
    }
}
