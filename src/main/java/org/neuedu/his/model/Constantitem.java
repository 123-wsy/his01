package org.neuedu.his.model;

public class Constantitem {
    private Integer id;
    private Integer constantTypeID;
    private String constantTypeName;

    public String getConstantTypeName() {
        return constantTypeName;
    }

    public void setConstantTypeName(String constantTypeName) {
        this.constantTypeName = constantTypeName;
    }

    private String ConstantCode;
    private String ConstantName;
    private Integer DelMark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getConstantTypeID() {
        return constantTypeID;
    }

    public void setConstantTypeID(Integer constantTypeID) {
        this.constantTypeID = constantTypeID;
    }

    public String getConstantCode() {
        return ConstantCode;
    }

    public void setConstantCode(String constantCode) {
        ConstantCode = constantCode;
    }

    public String getConstantName() {
        return ConstantName;
    }

    public void setConstantName(String constantName) {
        ConstantName = constantName;
    }

    public Integer getDelMark() {
        return DelMark;
    }

    public void setDelMark(Integer delMark) {
        DelMark = delMark;
    }
}
