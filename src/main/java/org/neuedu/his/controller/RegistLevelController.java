package org.neuedu.his.controller;

import org.neuedu.his.model.RegistLevel;
import org.neuedu.his.model.RespBean;
import org.neuedu.his.service.RegistLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/RegistLevel")
public class RegistLevelController {
    @Autowired
    RegistLevelService registLevelService;
    @GetMapping("/getRegistLevel")
    public List<RegistLevel> getRegistLevel(){
        return registLevelService.getRegistLevel();
    }
    @GetMapping("/getAllRegistLevel")
    public List<RegistLevel> getAllRegistLevel(@RequestParam(name="deptid",defaultValue = "") Integer deptid,@RequestParam(name="scheddate",defaultValue = "") String scheddate,@RequestParam(name = "noon",defaultValue = "") String noon){
        return registLevelService.getAllRegistLevel(deptid,scheddate,noon);
    }

    @GetMapping("/getRegistQuota")
    public RegistLevel getRegistQuota(@RequestParam("id") String id){
        return registLevelService.getRegistQuota(id);
    }

    @GetMapping("/allsaveRegistLevel")
    public List<RegistLevel> allRegistLevels(){
        return registLevelService.allRegistLevels();
    }
    @GetMapping("/searchRegByKeyWords")
    public List<RegistLevel> searchRegByKeyWords(String keywords){
        System.out.println(keywords);
        return registLevelService.searchRegByKeyWords(keywords);
    }
    @PostMapping("/addsaveRegistLevel")
    public RespBean saveRegistLevel(@RequestBody RegistLevel registlevel){
        return registLevelService.saveRegistLevel(registlevel);
    }
    @PutMapping("/updateRegistLevel")
    public RespBean updateRegistLevel(@RequestBody RegistLevel registlevel){
        return registLevelService.updateRegistLevel(registlevel);
    }
    @PutMapping("/delRegistLevel")
    public RespBean delRegistLevel(Integer id){
        return registLevelService.delRegistLevel(id);
    }
}
