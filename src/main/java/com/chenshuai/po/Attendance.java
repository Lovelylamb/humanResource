package com.chenshuai.po;

import java.io.Serializable;
import java.sql.Timestamp;

public class Attendance implements Serializable {
    private static final Integer IS_LATE=1;//迟到
    private static final Integer IS_NOT_LATE=0;//未迟到
    private static final Integer IS_LEAVE_EARLY=1;//早退
    private static final Integer IS_NOT_LEAVE_EARLY=0;//未早退
    private static final Integer IS_FOR_LEAVE=1;//请假
    private static final Integer IS_NOT_FOR_LEAVE=1;//迟到
    private Integer id;
    private Integer employeeId;    //员工的id
    private Timestamp onWorkTime; //上班时间
    private Timestamp afterWorkTime;//下班时间
    private Timestamp onWorkCardTime;//上班卡时间
    private Timestamp afterWorkCardTime;//下班打卡时间
    private Integer isLate;  //是否迟到
    private Integer isLeaveEarly;//是否早退
    private Integer isForLeave;//是否请假
    private Timestamp attendanceCreateTime;
    private Timestamp attendanceModifiedTime;

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

    public Timestamp getOnWorkTime() {
        return onWorkTime;
    }

    public void setOnWorkTime(Timestamp onWorkTime) {
        this.onWorkTime = onWorkTime;
    }

    public Timestamp getAfterWorkTime() {
        return afterWorkTime;
    }

    public void setAfterWorkTime(Timestamp afterWorkTime) {
        this.afterWorkTime = afterWorkTime;
    }

    public Timestamp getOnWorkCardTime() {
        return onWorkCardTime;
    }

    public void setOnWorkCardTime(Timestamp onWorkCardTime) {
        this.onWorkCardTime = onWorkCardTime;
    }

    public Timestamp getAfterWorkCardTime() {
        return afterWorkCardTime;
    }

    public void setAfterWorkCardTime(Timestamp afterWorkCardTime) {
        this.afterWorkCardTime = afterWorkCardTime;
    }

    public Integer getIsLate() {
        return isLate;
    }

    public void setIsLate(Integer isLate) {
        this.isLate = isLate;
    }

    public Integer getIsLeaveEarly() {
        return isLeaveEarly;
    }

    public void setIsLeaveEarly(Integer isLeaveEarly) {
        this.isLeaveEarly = isLeaveEarly;
    }

    public Integer getIsForLeave() {
        return isForLeave;
    }

    public void setIsForLeave(Integer isForLeave) {
        this.isForLeave = isForLeave;
    }

    public Timestamp getAttendanceCreateTime() {
        return attendanceCreateTime;
    }

    public void setAttendanceCreateTime(Timestamp attendanceCreateTime) {
        this.attendanceCreateTime = attendanceCreateTime;
    }

    public Timestamp getAttendanceModifiedTime() {
        return attendanceModifiedTime;
    }

    public void setAttendanceModifiedTime(Timestamp attendanceModifiedTime) {
        this.attendanceModifiedTime = attendanceModifiedTime;
    }

    @Override
    public String toString() {
        return "Attendance{" +
                "id=" + id +
                ", employeeId=" + employeeId +
                ", onWorkTime=" + onWorkTime +
                ", afterWorkTime=" + afterWorkTime +
                ", onWorkCardTime=" + onWorkCardTime +
                ", afterWorkCardTime=" + afterWorkCardTime +
                ", isLate=" + isLate +
                ", isLeaveEarly=" + isLeaveEarly +
                ", isForLeave=" + isForLeave +
                ", attendanceCreateTime=" + attendanceCreateTime +
                ", attendanceModifiedTime=" + attendanceModifiedTime +
                '}';
    }
}
