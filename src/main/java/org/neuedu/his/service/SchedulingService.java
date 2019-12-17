package org.neuedu.his.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.neuedu.his.mapper.SchedulingMapper;
import org.neuedu.his.model.Scheduling;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchedulingService {
    @Autowired
    SchedulingMapper schedulingMapper;
    public PageInfo getSchedulingByDate(String startDate, String endDate, Integer pageNum, Integer pageSize) {
        System.out.println(startDate);
        System.out.println(endDate);
        PageHelper.startPage(pageNum, pageSize);
        List<Scheduling> schedulingByDate = schedulingMapper.getSchedulingByDate(startDate, endDate);
        PageInfo pageInfo = new PageInfo(schedulingByDate);
        return pageInfo;
    }
}
