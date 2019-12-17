package org.neuedu.his.controller;

import com.github.pagehelper.PageInfo;
import org.neuedu.his.model.Scheduling;
import org.neuedu.his.service.SchedulingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Scheduling")
public class SchedulingController {
    @Autowired
    SchedulingService schedulingService;
    @GetMapping("/getSchedulingByDate")
    public PageInfo getSchedulingByDate(@RequestParam(name="startDate",defaultValue = "") String startDate,@RequestParam(name="endDate",defaultValue = "") String endDate,@RequestParam(name="pageNum") Integer pageNum,@RequestParam(name="pageSize") Integer pageSize){
        return schedulingService.getSchedulingByDate(startDate,endDate,pageNum,pageSize);
    }
}
