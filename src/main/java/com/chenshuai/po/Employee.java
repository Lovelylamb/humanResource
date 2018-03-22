package com.chenshuai.po;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

public class Employee implements Serializable {
    private static final Integer EMPLOYEE_IS_POSITION=1;//在职
    private static final Integer EMPLOYEE_IS_NOT_POSITION=1;//在职
    private static final Integer EMPLOYEE_IS_FULL_POSITION=1;//全职
    private static final Integer EMPLOYEE_IS_NOT_FULL_POSITION=1;//兼职
    private static final Integer EMPLOYEE_IS_RETIRED=1;//退休
    private static final Integer EMPLOYEE_IS_NOT_RETIRED=0;//未退休
    private Integer id;
    private Integer employeePhotoId;   //头像
    private Integer employeePositionId; //职位id
    private Integer employeeDetailId;//员工详情id
    private BigDecimal employeeSalary;  //工资
    private String employeeName;      //名字
    private String employeePassword;//密码
    private Integer employeeIsPosition;//在职与否
    private Integer employeeIsFullPosition;//全职与否
    private Integer employeeIsRetired;//退休与否
    private Timestamp employeeCreateTime;
    private Timestamp employeeModifiedTime;
    private Timestamp employeeLoginTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEmployeePhotoId() {
        return employeePhotoId;
    }

    public void setEmployeePhotoId(Integer employeePhotoId) {
        this.employeePhotoId = employeePhotoId;
    }

    public Integer getEmployeePositionId() {
        return employeePositionId;
    }

    public void setEmployeePositionId(Integer employeePositionId) {
        this.employeePositionId = employeePositionId;
    }

    public Integer getEmployeeDetailId() {
        return employeeDetailId;
    }

    public void setEmployeeDetailId(Integer employeeDetailId) {
        this.employeeDetailId = employeeDetailId;
    }

    public BigDecimal getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(BigDecimal employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeePassword() {
        return employeePassword;
    }

    public void setEmployeePassword(String employeePassword) {
        this.employeePassword = employeePassword;
    }

    public Integer getEmployeeIsPosition() {
        return employeeIsPosition;
    }

    public void setEmployeeIsPosition(Integer employeeIsPosition) {
        this.employeeIsPosition = employeeIsPosition;
    }

    public Integer getEmployeeIsFullPosition() {
        return employeeIsFullPosition;
    }

    public void setEmployeeIsFullPosition(Integer employeeIsFullPosition) {
        this.employeeIsFullPosition = employeeIsFullPosition;
    }

    public Integer getEmployeeIsRetired() {
        return employeeIsRetired;
    }

    public void setEmployeeIsRetired(Integer employeeIsRetired) {
        this.employeeIsRetired = employeeIsRetired;
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

    public Timestamp getEmployeeLoginTime() {
        return employeeLoginTime;
    }

    public void setEmployeeLoginTime(Timestamp employeeLoginTime) {
        this.employeeLoginTime = employeeLoginTime;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", employeePhotoId=" + employeePhotoId +
                ", employeePositionId=" + employeePositionId +
                ", employeeDetailId=" + employeeDetailId +
                ", employeeSalary=" + employeeSalary +
                ", employeeName='" + employeeName + '\'' +
                ", employeePassword='" + employeePassword + '\'' +
                ", employeeIsPosition=" + employeeIsPosition +
                ", employeeIsFullPosition=" + employeeIsFullPosition +
                ", employeeIsRetired=" + employeeIsRetired +
                ", employeeCreateTime=" + employeeCreateTime +
                ", employeeModifiedTime=" + employeeModifiedTime +
                ", employeeLoginTime=" + employeeLoginTime +
                '}';
    }
}
