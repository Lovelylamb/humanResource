package com.chenshuai.po;

import java.io.Serializable;
import java.sql.Timestamp;

public class TrainingRecord implements Serializable {
    private static final Integer TRAINING_IS_ATTEND=1;//参加了培训
    private static final Integer TRAINING_IS_NOT_ATTEND=0;//未参加培训
    private Integer id;
    private Integer trainingId;
    private Integer employeeId;
    private Integer trainingIsAttend;//是否参加培训
    private Timestamp trainingRecordCreateTime;
    private Timestamp trainingRecordModifiedTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTrainingId() {
        return trainingId;
    }

    public void setTrainingId(Integer trainingId) {
        this.trainingId = trainingId;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public Integer getTrainingIsAttend() {
        return trainingIsAttend;
    }

    public void setTrainingIsAttend(Integer trainingIsAttend) {
        this.trainingIsAttend = trainingIsAttend;
    }

    public Timestamp getTrainingRecordCreateTime() {
        return trainingRecordCreateTime;
    }

    public void setTrainingRecordCreateTime(Timestamp trainingRecordCreateTime) {
        this.trainingRecordCreateTime = trainingRecordCreateTime;
    }

    public Timestamp getTrainingRecordModifiedTime() {
        return trainingRecordModifiedTime;
    }

    public void setTrainingRecordModifiedTime(Timestamp trainingRecordModifiedTime) {
        this.trainingRecordModifiedTime = trainingRecordModifiedTime;
    }

    @Override
    public String toString() {
        return "TrainingRecord{" +
                "id=" + id +
                ", trainingId=" + trainingId +
                ", employeeId=" + employeeId +
                ", trainingIsAttend=" + trainingIsAttend +
                ", trainingRecordCreateTime=" + trainingRecordCreateTime +
                ", trainingRecordModifiedTime=" + trainingRecordModifiedTime +
                '}';
    }
}
