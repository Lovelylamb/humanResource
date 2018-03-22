package com.chenshuai.po;

import java.io.Serializable;
import java.sql.Timestamp;

//复审表
public class Recheck implements Serializable {
    private Integer id;
    private Integer employeeId;//员工id
    private String recheckItem;//复审主题
    private String recheckContent;//复审内容
    private Timestamp recheckCreateTime;
    private Timestamp recheckModifiedTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getRecheckItem() {
        return recheckItem;
    }

    public void setRecheckItem(String recheckItem) {
        this.recheckItem = recheckItem;
    }

    public String getRecheckContent() {
        return recheckContent;
    }

    public void setRecheckContent(String recheckContent) {
        this.recheckContent = recheckContent;
    }

    public Timestamp getRecheckCreateTime() {
        return recheckCreateTime;
    }

    public void setRecheckCreateTime(Timestamp recheckCreateTime) {
        this.recheckCreateTime = recheckCreateTime;
    }

    public Timestamp getRecheckModifiedTime() {
        return recheckModifiedTime;
    }

    public void setRecheckModifiedTime(Timestamp recheckModifiedTime) {
        this.recheckModifiedTime = recheckModifiedTime;
    }

    @Override
    public String toString() {
        return "Recheck{" +
                "id=" + id +
                ", employeeId=" + employeeId +
                ", recheckItem='" + recheckItem + '\'' +
                ", recheckContent='" + recheckContent + '\'' +
                ", recheckCreateTime=" + recheckCreateTime +
                ", recheckModifiedTime=" + recheckModifiedTime +
                '}';
    }
}
