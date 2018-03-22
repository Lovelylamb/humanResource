package com.chenshuai.po;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

public class RewardPunish implements Serializable {
    private static final Integer REWARD_PUNISH_IS_STATUS=1;//奖励
    private static final Integer REWARD_PUNISH_IS_NOT_STATUS=1;//惩罚
    private Integer id;
    private Integer employeeId;
    private String rewardPunishItem;//奖惩主题
    private String rewardPunishContent;//奖惩内容
    private BigDecimal rewardPunishMoney;
    private Integer rewardPunishStatus;//奖惩状态
    private Timestamp rewardPunishCreateTime;
    private Timestamp rewardPunishModifiedTime;

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

    public String getRewardPunishItem() {
        return rewardPunishItem;
    }

    public void setRewardPunishItem(String rewardPunishItem) {
        this.rewardPunishItem = rewardPunishItem;
    }

    public String getRewardPunishContent() {
        return rewardPunishContent;
    }

    public void setRewardPunishContent(String rewardPunishContent) {
        this.rewardPunishContent = rewardPunishContent;
    }

    public BigDecimal getRewardPunishMoney() {
        return rewardPunishMoney;
    }

    public void setRewardPunishMoney(BigDecimal rewardPunishMoney) {
        this.rewardPunishMoney = rewardPunishMoney;
    }

    public Integer getRewardPunishStatus() {
        return rewardPunishStatus;
    }

    public void setRewardPunishStatus(Integer rewardPunishStatus) {
        this.rewardPunishStatus = rewardPunishStatus;
    }

    public Timestamp getRewardPunishCreateTime() {
        return rewardPunishCreateTime;
    }

    public void setRewardPunishCreateTime(Timestamp rewardPunishCreateTime) {
        this.rewardPunishCreateTime = rewardPunishCreateTime;
    }

    public Timestamp getRewardPunishModifiedTime() {
        return rewardPunishModifiedTime;
    }

    public void setRewardPunishModifiedTime(Timestamp rewardPunishModifiedTime) {
        this.rewardPunishModifiedTime = rewardPunishModifiedTime;
    }

    @Override
    public String toString() {
        return "RewardPunish{" +
                "id=" + id +
                ", employeeId=" + employeeId +
                ", rewardPunishItem='" + rewardPunishItem + '\'' +
                ", rewardPunishContent='" + rewardPunishContent + '\'' +
                ", rewardPunishMoney=" + rewardPunishMoney +
                ", rewardPunishStatus=" + rewardPunishStatus +
                ", rewardPunishCreateTime=" + rewardPunishCreateTime +
                ", rewardPunishModifiedTime=" + rewardPunishModifiedTime +
                '}';
    }
}
