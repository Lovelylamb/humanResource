package com.chenshuai.po;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

public class Salary implements Serializable {
    private  static final Integer IS_RECHECK=1;//复审
    private  static final Integer IS_NOT_RECHECK=0;//未复审
    private static final Integer IS_PROVIDE=1;//发放
    private static final Integer IS_NOT_PROVIDE=1;//未发放
    private Integer id;
    private Integer employeeId;
    private BigDecimal totalSalary;//总工资
    private BigDecimal rewardPunishmentMoney;//奖惩金额
    private BigDecimal commission;//提成
    private BigDecimal socialSecurityMoney;//社保
    private Integer isProvide;//工资是否发放
    private Timestamp salaryMonth;//发工资的月份
    private Integer isRecheck;//是否复审
    private Timestamp salaryCreateTime;
    private Timestamp salaryModifiedTime;

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

    public BigDecimal getTotalSalary() {
        return totalSalary;
    }

    public void setTotalSalary(BigDecimal totalSalary) {
        this.totalSalary = totalSalary;
    }

    public BigDecimal getRewardPunishmentMoney() {
        return rewardPunishmentMoney;
    }

    public void setRewardPunishmentMoney(BigDecimal rewardPunishmentMoney) {
        this.rewardPunishmentMoney = rewardPunishmentMoney;
    }

    public BigDecimal getCommission() {
        return commission;
    }

    public void setCommission(BigDecimal commission) {
        this.commission = commission;
    }

    public BigDecimal getSocialSecurityMoney() {
        return socialSecurityMoney;
    }

    public void setSocialSecurityMoney(BigDecimal socialSecurityMoney) {
        this.socialSecurityMoney = socialSecurityMoney;
    }

    public Integer getIsProvide() {
        return isProvide;
    }

    public void setIsProvide(Integer isProvide) {
        this.isProvide = isProvide;
    }

    public Timestamp getSalaryMonth() {
        return salaryMonth;
    }

    public void setSalaryMonth(Timestamp salaryMonth) {
        this.salaryMonth = salaryMonth;
    }

    public Integer getIsRecheck() {
        return isRecheck;
    }

    public void setIsRecheck(Integer isRecheck) {
        this.isRecheck = isRecheck;
    }

    public Timestamp getSalaryCreateTime() {
        return salaryCreateTime;
    }

    public void setSalaryCreateTime(Timestamp salaryCreateTime) {
        this.salaryCreateTime = salaryCreateTime;
    }

    public Timestamp getSalaryModifiedTime() {
        return salaryModifiedTime;
    }

    public void setSalaryModifiedTime(Timestamp salaryModifiedTime) {
        this.salaryModifiedTime = salaryModifiedTime;
    }

    @Override
    public String toString() {
        return "Salary{" +
                "id=" + id +
                ", employeeId=" + employeeId +
                ", totalSalary=" + totalSalary +
                ", rewardPunishmentMoney=" + rewardPunishmentMoney +
                ", commission=" + commission +
                ", socialSecurityMoney=" + socialSecurityMoney +
                ", isProvide=" + isProvide +
                ", salaryMonth=" + salaryMonth +
                ", isRecheck=" + isRecheck +
                ", salaryCreateTime=" + salaryCreateTime +
                ", salaryModifiedTime=" + salaryModifiedTime +
                '}';
    }
}
