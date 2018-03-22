package com.chenshuai.po;

import java.io.Serializable;
import java.sql.Timestamp;

public class EmployeeMessage implements Serializable{
    private static final Integer IS_VIEWED=1;//查看
    private static final Integer IS_NOT_VIEWED=1;//未查看
    private Integer id;
    private Integer employeeId;
    private String employeeMessageItem;//消息主题
    private String employeeMessageContent;//消息内容
    private Integer isViewed;//是否查看
    private Timestamp employeeMessageCreateTime;
    private Timestamp employeeMessageModifiedTime;

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

    public String getEmployeeMessageItem() {
        return employeeMessageItem;
    }

    public void setEmployeeMessageItem(String employeeMessageItem) {
        this.employeeMessageItem = employeeMessageItem;
    }

    public String getEmployeeMessageContent() {
        return employeeMessageContent;
    }

    public void setEmployeeMessageContent(String employeeMessageContent) {
        this.employeeMessageContent = employeeMessageContent;
    }

    public Integer getIsViewed() {
        return isViewed;
    }

    public void setIsViewed(Integer isViewed) {
        this.isViewed = isViewed;
    }

    public Timestamp getEmployeeMessageCreateTime() {
        return employeeMessageCreateTime;
    }

    public void setEmployeeMessageCreateTime(Timestamp employeeMessageCreateTime) {
        this.employeeMessageCreateTime = employeeMessageCreateTime;
    }

    public Timestamp getEmployeeMessageModifiedTime() {
        return employeeMessageModifiedTime;
    }

    public void setEmployeeMessageModifiedTime(Timestamp employeeMessageModifiedTime) {
        this.employeeMessageModifiedTime = employeeMessageModifiedTime;
    }

    @Override
    public String toString() {
        return "EmployeeMessage{" +
                "id=" + id +
                ", employeeId=" + employeeId +
                ", employeeMessageItem='" + employeeMessageItem + '\'' +
                ", employeeMessageContent='" + employeeMessageContent + '\'' +
                ", isViewed=" + isViewed +
                ", employeeMessageCreateTime=" + employeeMessageCreateTime +
                ", employeeMessageModifiedTime=" + employeeMessageModifiedTime +
                '}';
    }
}
