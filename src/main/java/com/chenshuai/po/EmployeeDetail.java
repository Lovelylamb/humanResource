package com.chenshuai.po;

import java.io.Serializable;
import java.sql.Timestamp;

public class EmployeeDetail implements Serializable {
    private  Integer id;
    private  String employeeName; //员工名字
    private Integer employeeAge; //员工年龄
    private String employeeIdCard;//员工的身份证
    private String employeeEmail;//电子邮箱
    private String employeePhone;//手机号码
    private String employeeAddress;//家庭地址
    private String employeeSex;//性别
    private Timestamp employeeCreateTime;
    private Timestamp employeeModifiedTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Integer getEmployeeAge() {
        return employeeAge;
    }

    public void setEmployeeAge(Integer employeeAge) {
        this.employeeAge = employeeAge;
    }

    public String getEmployeeIdCard() {
        return employeeIdCard;
    }

    public void setEmployeeIdCard(String employeeIdCard) {
        this.employeeIdCard = employeeIdCard;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    public String getEmployeePhone() {
        return employeePhone;
    }

    public void setEmployeePhone(String employeePhone) {
        this.employeePhone = employeePhone;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public String getEmployeeSex() {
        return employeeSex;
    }

    public void setEmployeeSex(String employeeSex) {
        this.employeeSex = employeeSex;
    }

    public Timestamp getEmployeeCreateTime() {
        return employeeCreateTime;
    }

    public void setEmployeeCreateTime(Timestamp employeeCreateTime) {
        this.employeeCreateTime = employeeCreateTime;
    }

    public Timestamp getEmployeeModifiedTime() {
        return employeeModifiedTime;
    }

    public void setEmployeeModifiedTime(Timestamp employeeModifiedTime) {
        this.employeeModifiedTime = employeeModifiedTime;
    }

    @Override
    public String toString() {
        return "EmployeeDetail{" +
                "id=" + id +
                ", employeeName='" + employeeName + '\'' +
                ", employeeAge=" + employeeAge +
                ", employeeIdCard='" + employeeIdCard + '\'' +
                ", employeeEmail='" + employeeEmail + '\'' +
                ", employeePhone='" + employeePhone + '\'' +
                ", employeeAddress='" + employeeAddress + '\'' +
                ", employeeSex='" + employeeSex + '\'' +
                ", employeeCreateTime=" + employeeCreateTime +
                ", employeeModifiedTime=" + employeeModifiedTime +
                '}';
    }
}
