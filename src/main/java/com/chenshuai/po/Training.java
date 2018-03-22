package com.chenshuai.po;

import java.io.Serializable;
import java.sql.Timestamp;

public class Training implements Serializable {
    private Integer id;
    private String trainingItem;//训练主题
    private String trainingContent;//培训内容
    private Timestamp trainingTime;//培训时间
    private String trainingAddress;//培训所在的地点
    private Timestamp trainingCreateTime;
    private Timestamp trainingModifiedTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTrainingItem() {
        return trainingItem;
    }

    public void setTrainingItem(String trainingItem) {
        this.trainingItem = trainingItem;
    }

    public String getTrainingContent() {
        return trainingContent;
    }

    public void setTrainingContent(String trainingContent) {
        this.trainingContent = trainingContent;
    }

    public Timestamp getTrainingTime() {
        return trainingTime;
    }

    public void setTrainingTime(Timestamp trainingTime) {
        this.trainingTime = trainingTime;
    }

    public String getTrainingAddress() {
        return trainingAddress;
    }

    public void setTrainingAddress(String trainingAddress) {
        this.trainingAddress = trainingAddress;
    }

    public Timestamp getTrainingCreateTime() {
        return trainingCreateTime;
    }

    public void setTrainingCreateTime(Timestamp trainingCreateTime) {
        this.trainingCreateTime = trainingCreateTime;
    }

    public Timestamp getTrainingModifiedTime() {
        return trainingModifiedTime;
    }

    public void setTrainingModifiedTime(Timestamp trainingModifiedTime) {
        this.trainingModifiedTime = trainingModifiedTime;
    }

    @Override
    public String toString() {
        return "Training{" +
                "id=" + id +
                ", trainingItem='" + trainingItem + '\'' +
                ", trainingContent='" + trainingContent + '\'' +
                ", trainingTime=" + trainingTime +
                ", trainingAddress='" + trainingAddress + '\'' +
                ", trainingCreateTime=" + trainingCreateTime +
                ", trainingModifiedTime=" + trainingModifiedTime +
                '}';
    }
}
