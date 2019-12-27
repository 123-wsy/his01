package org.neuedu.his.controller;

import org.neuedu.his.model.Department;
import org.neuedu.his.model.RespBean;
import org.neuedu.his.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Pattern;
import javax.validation.groups.Default;
import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/dept")
public class DeptController {
    @Autowired
    DeptService deptService;
    @GetMapping("/getDeptByCodeOrName")
    public List<Department> getDeptByCodeOrName(@RequestParam(name = "deptcode",defaultValue = "") String deptcode,@RequestParam(name = "deptname",defaultValue = "") String deptname){
        return deptService.getDeptByCodeOrName(deptcode,deptname);
    }
    @DeleteMapping("/delDeptByIds")
    public RespBean delDeptByIds(Integer[] ids){
        return deptService.delDeptByIds(ids);
    }

    @GetMapping("/getAllDept")
    public List<Department> getAllDept(){
        return deptService.getAllDept();
    }

    @GetMapping("/deptInfos")
    public List<Department> deptInfos(){
        return deptService.deptInfos();
    }
    @GetMapping("/getDept")
    public List<Department> getDept(String deptname){
        return deptService.getDept(deptname);
    }
    @DeleteMapping("/{id}")
    public RespBean delDept(@PathVariable("id") Integer id){
        return deptService.delDept(id);
    }
}
