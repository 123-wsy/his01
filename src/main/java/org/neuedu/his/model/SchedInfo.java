package org.neuedu.his.model;

public class SchedInfo {
    private Integer[] userids;
    private Integer[] deptids;
    private String[] schedulingRules;
    private String ruleName;

    public Integer[] getUserids() {
        return userids;
    }

    public void setUserids(Integer[] userids) {
        this.userids = userids;
    }

    public Integer[] getDeptids() {
        return deptids;
    }

    public void setDeptids(Integer[] deptids) {
        this.deptids = deptids;
    }

    public String[] getSchedulingRules() {
        return schedulingRules;
    }

    public void setSchedulingRules(String[] schedulingRules) {
        this.schedulingRules = schedulingRules;
    }

    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }
}
