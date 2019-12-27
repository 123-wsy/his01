package org.neuedu.his.controller;

import com.github.pagehelper.PageInfo;
import org.neuedu.his.model.DiseCategory;
import org.neuedu.his.model.RespBean;
import org.neuedu.his.service.DiseCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/DiseCategory")
public class DiseCategoryController {
    @Autowired
    DiseCategoryService diseCategoryService;
    @GetMapping("/getDiseCategory")
    public PageInfo getDiseCategory(@RequestParam(name="keyword",defaultValue = "") String keyword,@RequestParam(name="pageSize") Integer pageSize,@RequestParam(name="pageNum") Integer pageNum){
        return diseCategoryService.getDiseCategory(keyword,pageSize,pageNum);
    }
    @GetMapping("/getLastId")
    public DiseCategory getLastId(){
        return diseCategoryService.getLastId();
    }

    @PostMapping("/insertSelective")
    public RespBean insertSelective(@RequestBody DiseCategory diseCategory){
        return diseCategoryService.insertSelective(diseCategory);
    }

    @GetMapping("/getDiseCategorys")
    public List<DiseCategory> getDiseCategorys(){
        return diseCategoryService.getDiseCategorys();
    }

    @DeleteMapping("/deleteByPrimaryKey/{id}")
    public RespBean deleteByPrimaryKey(@PathVariable("id") Integer id){
        return diseCategoryService.deleteByPrimaryKey(id);
    }

    @DeleteMapping("/deleteByPrimaryKeyS")
    public RespBean deleteByPrimaryKeyS(Integer[] ids){
        return diseCategoryService.deleteByPrimaryKeyS(ids);
    }
}
