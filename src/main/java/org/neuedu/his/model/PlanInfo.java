package org.neuedu.his.model;

public class PlanInfo {
    private String beginDate;
    private String finishDate;
    private Integer[] rids;
    private Integer[] pbDeptids;
    private Integer[] pbUserids;
    private String[] week;

    public String getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(String beginDate) {
        this.beginDate = beginDate;
    }

    public String getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(String finishDate) {
        this.finishDate = finishDate;
    }

    public Integer[] getRids() {
        return rids;
    }

    public void setRids(Integer[] rids) {
        this.rids = rids;
    }

    public Integer[] getPbDeptids() {
        return pbDeptids;
    }

    public void setPbDeptids(Integer[] pbDeptids) {
        this.pbDeptids = pbDeptids;
    }

    public Integer[] getPbUserids() {
        return pbUserids;
    }

    public void setPbUserids(Integer[] pbUserids) {
        this.pbUserids = pbUserids;
    }

    public String[] getWeek() {
        return week;
    }

    public void setWeek(String[] week) {
        this.week = week;
    }
}
