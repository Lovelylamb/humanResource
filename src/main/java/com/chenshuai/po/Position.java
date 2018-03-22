package com.chenshuai.po;

import java.io.Serializable;
import java.sql.Timestamp;

public class Position implements Serializable {
    private Integer id;
    private Integer departmentId;//部门的id
    private String positionName;//职位名称
    private Timestamp positionCreateTime;//创建时间
    private Timestamp positionModifiedTime;//修改时间

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public Timestamp getPositionCreateTime() {
        return positionCreateTime;
    }

    public void setPositionCreateTime(Timestamp positionCreateTime) {
        this.positionCreateTime = positionCreateTime;
    }

    public Timestamp getPositionModifiedTime() {
        return positionModifiedTime;
    }

    public void setPositionModifiedTime(Timestamp positionModifiedTime) {
        this.positionModifiedTime = positionModifiedTime;
    }

    @Override
    public String toString() {
        return "Position{" +
                "id=" + id +
                ", departmentId=" + departmentId +
                ", positionName='" + positionName + '\'' +
                ", positionCreateTime=" + positionCreateTime +
                ", positionModifiedTime=" + positionModifiedTime +
                '}';
    }
}
