package org.neuedu.his.controller;

import com.github.pagehelper.PageInfo;
import org.neuedu.his.model.Disease;
import org.neuedu.his.model.RespBean;
import org.neuedu.his.service.DiseaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Disease")
public class DiseaseController {
    @Autowired
    DiseaseService diseaseService;
    @GetMapping("/getDisease")
    public PageInfo getDisease(@RequestParam(name="keyword",defaultValue = "") String keyword, @RequestParam(name="pageSize") Integer pageSize, @RequestParam(name="pageNum") Integer pageNum){
        return diseaseService.getDisease(keyword,pageSize,pageNum);
    }
    @PostMapping("/insertSelective")
    public RespBean insertSelective(@RequestBody Disease disease){
        return diseaseService.insertSelective(disease);
    }
}
