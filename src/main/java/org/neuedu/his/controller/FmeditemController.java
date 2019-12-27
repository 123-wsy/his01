package org.neuedu.his.controller;

import com.github.pagehelper.PageInfo;
import org.neuedu.his.model.Fmeditem;
import org.neuedu.his.model.RespBean;
import org.neuedu.his.service.FmeditemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.List;

@RestController
@RequestMapping("/fmeditem")
public class FmeditemController {
    @Autowired
    FmeditemService fmeditemService;
    @GetMapping("/searchAllFmeditem")
    public PageInfo searchAllFmeditem(String keyword, Integer pageNum, Integer pageSize){
        return fmeditemService.searchAllFmeditem(keyword,pageNum,pageSize);
    }
    @PutMapping("/addfmeditem")
    public RespBean addexpenseclass(@RequestBody Fmeditem fmeditem){
        return fmeditemService.addexpenseclass(fmeditem);
    }
    @PostMapping("/updfmeditem")
    public RespBean updfmeditem(@RequestBody Fmeditem fmeditem){
        return fmeditemService.updfmeditem(fmeditem);
    }
    @PostMapping("/delfmeditem")
    public RespBean delfmeditem(Integer id){
        return fmeditemService.delfmeditem(id);
    }
    @PostMapping("/delManyfmeditem")
    public RespBean delManyfmeditem(Integer[] ids){
        return fmeditemService.delManyfmeditem(ids);
    }
}
