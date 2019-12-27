package org.neuedu.his.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.neuedu.his.mapper.SchedulingMapper;
import org.neuedu.his.model.PlanInfo;
import org.neuedu.his.model.RespBean;
import org.neuedu.his.model.Scheduling;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class SchedulingService {
    @Autowired
    SchedulingMapper schedulingMapper;
    public PageInfo getSchedulingByDate(String startDate, String endDate, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Scheduling> schedulingByDate = schedulingMapper.getSchedulingByDate(startDate, endDate);
        PageInfo pageInfo = new PageInfo(schedulingByDate);
        return pageInfo;
    }

    public RespBean insertSelective(PlanInfo planInfo) throws ParseException {
        String beginDate = planInfo.getBeginDate(); // 开始日期
        String finishDate = planInfo.getFinishDate();// 截止日期
        Integer[] rids = planInfo.getRids();// 规则id
        Integer[] deptids = planInfo.getPbDeptids();// 科室id
        Integer[] userids = planInfo.getPbUserids(); // 用户id
        String[] week = planInfo.getWeek();  // 规则字符串

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date bDate = sdf.parse(beginDate);
        Date fbDate = sdf.parse(finishDate);

        // 开始时间对象
        Calendar calendarBegin = Calendar.getInstance();
        calendarBegin.setTime(bDate);
        // 结束时间对象
        Calendar calendarEnd = Calendar.getInstance();
        calendarEnd.setTime(fbDate);
        calendarEnd.add(Calendar.DATE,1);
        // 当前时间
        Calendar now = Calendar.getInstance();

        if (calendarBegin.before(now)) {
            return RespBean.error("排班时间在 今天 之前，请重新选择排班时间");
        }else{
            // 循环条件 calendarBegin 在 calendarEnd 之前
            while (calendarBegin.before(calendarEnd)) {
                for (int i = 0; i < rids.length; i++) {
                    Integer ruleid = rids[i];
                    Integer deptid = deptids[i];
                    Integer userid = userids[i];
                    String rule = week[i];
                    // 判断 calendarBegin 是周几 1 rule.char(0) == '1'
                    int day = initWeek(calendarBegin);
                    Scheduling scheduling = new Scheduling();

                    if (rule.charAt(day * 2 - 2) == '1') {
                        // 插入 上午数据
                        scheduling.setNoon("上午");
                        scheduling.setScheddate(calendarBegin.getTime());
                        scheduling.setUserid(userid);
                        scheduling.setDeptid(deptid);
                        scheduling.setRuleid(ruleid);
                        // 插入
                        int j = schedulingMapper.insertSelective(scheduling);
                        if (j == 0) {
                            return RespBean.error("生成排班计划失败");
                        }
                    }
                    if (rule.charAt(day * 2 - 1) == '1') {
                        // 插入 下午数据
                        scheduling.setNoon("下午");
                        scheduling.setScheddate(calendarBegin.getTime());
                        scheduling.setUserid(userid);
                        scheduling.setDeptid(deptid);
                        scheduling.setRuleid(ruleid);
                        // 插入
                        int j = schedulingMapper.insertSelective(scheduling);
                        if (j == 0) {
                            return RespBean.error("生成排班计划失败");
                        }
                    }
                }
                calendarBegin.add(Calendar.DATE,1);
            }
        }
        return RespBean.ok("已成功生成排班计划");
    }

    public int initWeek(Calendar calendar) {
        int i = calendar.get(Calendar.DAY_OF_WEEK);
        if (i == 1) {
            return 7;
        }else{
            return i - 1;
        }
    }
//
//    public List<Scheduling> getNoon(String visitdate) {
//        return schedulingMapper.getNoon(visitdate);
//    }
//
//    public List<Scheduling> getDept(String visitdate, String noon) {
//        return schedulingMapper.getDept(visitdate,noon);
//    }

    public List<Scheduling> getUserByDeptIdAndLevelAndDate(Integer deptid,Integer registleid,String scheddate,String noon) {
        return schedulingMapper.getUserByDeptIdAndLevelAndDate(deptid,registleid,scheddate,noon);
    }
}
