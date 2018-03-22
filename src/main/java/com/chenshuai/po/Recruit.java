package com.chenshuai.po;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

//招聘信息表
public class Recruit implements Serializable{
    private Integer id;
    private Integer adminId;//管理员id
    private String recruitPosition;//职位
    private String recruitNumber;//人数
    private BigDecimal recruitSalary;//薪资
    private String recruitItem;//招聘主题
    private String recruitContent;//招聘内容
    private String recruitInterviewAddress;//面试地址
    private Timestamp recruitCreateTime;
    private Timestamp recruitModifiedTime;
    private String recruitDepartment;//部门

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getRecruitPosition() {
        return recruitPosition;
    }

    public void setRecruitPosition(String recruitPosition) {
        this.recruitPosition = recruitPosition;
    }

    public String getRecruitNumber() {
        return recruitNumber;
    }

    public void setRecruitNumber(String recruitNumber) {
        this.recruitNumber = recruitNumber;
    }

    public BigDecimal getRecruitSalary() {
        return recruitSalary;
    }

    public void setRecruitSalary(BigDecimal recruitSalary) {
        this.recruitSalary = recruitSalary;
    }

    public String getRecruitItem() {
        return recruitItem;
    }

    public void setRecruitItem(String recruitItem) {
        this.recruitItem = recruitItem;
    }

    public String getRecruitContent() {
        return recruitContent;
    }

    public void setRecruitContent(String recruitContent) {
        this.recruitContent = recruitContent;
    }

    public String getRecruitInterviewAddress() {
        return recruitInterviewAddress;
    }

    public void setRecruitInterviewAddress(String recruitInterviewAddress) {
        this.recruitInterviewAddress = recruitInterviewAddress;
    }

    public Timestamp getRecruitCreateTime() {
        return recruitCreateTime;
    }

    public void setRecruitCreateTime(Timestamp recruitCreateTime) {
        this.recruitCreateTime = recruitCreateTime;
    }

    public Timestamp getRecruitModifiedTime() {
        return recruitModifiedTime;
    }

    public void setRecruitModifiedTime(Timestamp recruitModifiedTime) {
        this.recruitModifiedTime = recruitModifiedTime;
    }

    public String getRecruitDepartment() {
        return recruitDepartment;
    }

    public void setRecruitDepartment(String recruitDepartment) {
        this.recruitDepartment = recruitDepartment;
    }

    @Override
    public String toString() {
        return "Recruit{" +
                "id=" + id +
                ", adminId=" + adminId +
                ", recruitPosition='" + recruitPosition + '\'' +
                ", recruitNumber='" + recruitNumber + '\'' +
                ", recruitSalary=" + recruitSalary +
                ", recruitItem='" + recruitItem + '\'' +
                ", recruitContent='" + recruitContent + '\'' +
                ", recruitInterviewAddress='" + recruitInterviewAddress + '\'' +
                ", recruitCreateTime=" + recruitCreateTime +
                ", recruitModifiedTime=" + recruitModifiedTime +
                ", recruitDepartment='" + recruitDepartment + '\'' +
                '}';
    }
}
