package com.chenshuai.po;

import java.io.Serializable;
import java.sql.Timestamp;

public class Log implements Serializable {
    private Integer id;
    private String createPeopleType;//创建人员类型
    private String createPeopleId;//创建人员id
    private Timestamp logCreateTime;//日志创建时间

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCreatePeopleType() {
        return createPeopleType;
    }

    public void setCreatePeopleType(String createPeopleType) {
        this.createPeopleType = createPeopleType;
    }

    public String getCreatePeopleId() {
        return createPeopleId;
    }

    public void setCreatePeopleId(String createPeopleId) {
        this.createPeopleId = createPeopleId;
    }

    public Timestamp getLogCreateTime() {
        return logCreateTime;
    }

    public void setLogCreateTime(Timestamp logCreateTime) {
        this.logCreateTime = logCreateTime;
    }

    @Override
    public String toString() {
        return "Log{" +
                "id=" + id +
                ", createPeopleType='" + createPeopleType + '\'' +
                ", createPeopleId='" + createPeopleId + '\'' +
                ", logCreateTime=" + logCreateTime +
                '}';
    }
}
