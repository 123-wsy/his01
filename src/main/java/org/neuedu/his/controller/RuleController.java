package org.neuedu.his.controller;

import org.neuedu.his.model.RespBean;
import org.neuedu.his.model.Rule;
import org.neuedu.his.model.SchedInfo;
import org.neuedu.his.service.RuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Rule")
public class RuleController {
    @Autowired
    RuleService ruleService;
    @PostMapping("/addRule")
    public RespBean addRule(@RequestBody SchedInfo schedInfo){
        return ruleService.addRule(schedInfo);
    }

    @GetMapping("/getRule")
    public List<Rule> getRule(@RequestParam(name="deptid",defaultValue = "") Integer deptid){
        return ruleService.getRule(deptid);
    }
}
