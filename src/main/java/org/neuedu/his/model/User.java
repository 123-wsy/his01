package org.neuedu.his.model;

import java.io.Serializable;

public class User implements Serializable {
    private Integer id;

    private String username;

    private String password;

    private String realname;

    private Integer usetype;

    private Integer doctitleid;

    private String isscheduling;

    private Integer deptid;

    private Integer registleid;

    private Integer delmark;

    private Scheduling scheduling;

    private Department department;

    private Constantitem constantitem;

    private RegistLevel registLevel;

    public Constantitem getConstantitem() {
        return constantitem;
    }

    public void setConstantitem(Constantitem constantitem) {
        this.constantitem = constantitem;
    }

    public RegistLevel getRegistLevel() {
        return registLevel;
    }

    public void setRegistLevel(RegistLevel registLevel) {
        this.registLevel = registLevel;
    }

    private boolean check01;
    private boolean check02;
    private boolean check03;
    private boolean check04;
    private boolean check05;
    private boolean check06;
    private boolean check07;
    private boolean check08;
    private boolean check09;
    private boolean check10;
    private boolean check11;
    private boolean check12;
    private boolean check13;
    private boolean check14;

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Scheduling getScheduling() {
        return scheduling;
    }

    public void setScheduling(Scheduling scheduling) {
        this.scheduling = scheduling;
    }

    public boolean isCheck01() {
        return check01;
    }

    public void setCheck01(boolean check01) {
        this.check01 = check01;
    }

    public boolean isCheck02() {
        return check02;
    }

    public void setCheck02(boolean check02) {
        this.check02 = check02;
    }

    public boolean isCheck03() {
        return check03;
    }

    public void setCheck03(boolean check03) {
        this.check03 = check03;
    }

    public boolean isCheck04() {
        return check04;
    }

    public void setCheck04(boolean check04) {
        this.check04 = check04;
    }

    public boolean isCheck05() {
        return check05;
    }

    public void setCheck05(boolean check05) {
        this.check05 = check05;
    }

    public boolean isCheck06() {
        return check06;
    }

    public void setCheck06(boolean check06) {
        this.check06 = check06;
    }

    public boolean isCheck07() {
        return check07;
    }

    public void setCheck07(boolean check07) {
        this.check07 = check07;
    }

    public boolean isCheck08() {
        return check08;
    }

    public void setCheck08(boolean check08) {
        this.check08 = check08;
    }

    public boolean isCheck09() {
        return check09;
    }

    public void setCheck09(boolean check09) {
        this.check09 = check09;
    }

    public boolean isCheck10() {
        return check10;
    }

    public void setCheck10(boolean check10) {
        this.check10 = check10;
    }

    public boolean isCheck11() {
        return check11;
    }

    public void setCheck11(boolean check11) {
        this.check11 = check11;
    }

    public boolean isCheck12() {
        return check12;
    }

    public void setCheck12(boolean check12) {
        this.check12 = check12;
    }

    public boolean isCheck13() {
        return check13;
    }

    public void setCheck13(boolean check13) {
        this.check13 = check13;
    }

    public boolean isCheck14() {
        return check14;
    }

    public void setCheck14(boolean check14) {
        this.check14 = check14;
    }

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    public Integer getUsetype() {
        return usetype;
    }

    public void setUsetype(Integer usetype) {
        this.usetype = usetype;
    }

    public Integer getDoctitleid() {
        return doctitleid;
    }

    public void setDoctitleid(Integer doctitleid) {
        this.doctitleid = doctitleid;
    }

    public String getIsscheduling() {
        return isscheduling;
    }

    public void setIsscheduling(String isscheduling) {
        this.isscheduling = isscheduling == null ? null : isscheduling.trim();
    }

    public Integer getDeptid() {
        return deptid;
    }

    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }

    public Integer getRegistleid() {
        return registleid;
    }

    public void setRegistleid(Integer registleid) {
        this.registleid = registleid;
    }

    public Integer getDelmark() {
        return delmark;
    }

    public void setDelmark(Integer delmark) {
        this.delmark = delmark;
    }
}