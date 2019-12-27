package org.neuedu.his.controller;

import com.github.pagehelper.PageInfo;
import org.neuedu.his.model.PlanInfo;
import org.neuedu.his.model.RespBean;
import org.neuedu.his.model.Scheduling;
import org.neuedu.his.service.SchedulingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
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

    @PostMapping("/insertSelective")
    public RespBean insertSelective(@RequestBody PlanInfo planInfo) throws ParseException {
        return schedulingService.insertSelective(planInfo);
    }

//    @GetMapping("/getNoon")
//    public List<Scheduling> getNoon(@RequestParam("visitdate") String visitdate){
//        return schedulingService.getNoon(visitdate);
//    }
//
//    @GetMapping("/")
//    public List<Scheduling> getDept(@RequestParam("visitdate") String visitdate,@RequestParam("noon") String noon){
//        return schedulingService.getDept(visitdate,noon);
//    }

    @GetMapping("/getUserByDeptIdAndLevelAndDate")
    public List<Scheduling> getUserByDeptIdAndLevelAndDate(@RequestParam(name="deptid",defaultValue = "") Integer deptid,@RequestParam(name="registleid",defaultValue = "") Integer registleid,@RequestParam(name="scheddate",defaultValue = "") String scheddate,@RequestParam(name="noon",defaultValue = "") String noon){
        return schedulingService.getUserByDeptIdAndLevelAndDate(deptid,registleid,scheddate,noon);
    }
}
