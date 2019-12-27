package org.neuedu.his.service;

import org.neuedu.his.mapper.RuleMapper;
import org.neuedu.his.model.RespBean;
import org.neuedu.his.model.Rule;
import org.neuedu.his.model.SchedInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class RuleService {
    @Autowired
    RuleMapper ruleMapper;
    public RespBean addRule(SchedInfo schedInfo) {
        Integer[] userids = schedInfo.getUserids();
        Integer[] deptids = schedInfo.getDeptids();
        String[] schedulingRules = schedInfo.getSchedulingRules();
        String ruleName = schedInfo.getRuleName();
        for (int i = 0; i < userids.length; i++) {
            Integer userid = userids[i];
            Integer deptid = deptids[i];
            String schedulingRule = schedulingRules[i];
            Integer j = ruleMapper.addRule(ruleName,userid,deptid,schedulingRule);
            if(j == 0){
                return RespBean.error("新增失败");
            }
        }
        return RespBean.ok("新增成功");
    }

    public List<Rule> getRule(Integer deptid) {
        return ruleMapper.getRule(deptid);
    }
}
