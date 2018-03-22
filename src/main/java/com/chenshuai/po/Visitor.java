package com.chenshuai.po;

import java.io.Serializable;
import java.sql.Timestamp;

public class Visitor implements Serializable {
    private Integer id;
    private String visitorName;
    private String visitorPassword;
    private Integer visitorAge;
    private String visitorEmail;
    private String visitorPhone;
    private String visitorTrueName;
    private String visitorAddress;
    private Timestamp visitorLoginTime;
    private Timestamp visitorCreateTime;
    private Timestamp visitorModifiedTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVisitorName() {
        return visitorName;
    }

    public void setVisitorName(String visitorName) {
        this.visitorName = visitorName;
    }

    public String getVisitorPassword() {
        return visitorPassword;
    }

    public void setVisitorPassword(String visitorPassword) {
        this.visitorPassword = visitorPassword;
    }

    public Integer getVisitorAge() {
        return visitorAge;
    }

    public void setVisitorAge(Integer visitorAge) {
        this.visitorAge = visitorAge;
    }

    public String getVisitorEmail() {
        return visitorEmail;
    }

    public void setVisitorEmail(String visitorEmail) {
        this.visitorEmail = visitorEmail;
    }

    public String getVisitorPhone() {
        return visitorPhone;
    }

    public void setVisitorPhone(String visitorPhone) {
        this.visitorPhone = visitorPhone;
    }

    public String getVisitorTrueName() {
        return visitorTrueName;
    }

    public void setVisitorTrueName(String visitorTrueName) {
        this.visitorTrueName = visitorTrueName;
    }

    public String getVisitorAddress() {
        return visitorAddress;
    }

    public void setVisitorAddress(String visitorAddress) {
        this.visitorAddress = visitorAddress;
    }

    public Timestamp getVisitorLoginTime() {
        return visitorLoginTime;
    }

    public void setVisitorLoginTime(Timestamp visitorLoginTime) {
        this.visitorLoginTime = visitorLoginTime;
    }

    public Timestamp getVisitorCreateTime() {
        return visitorCreateTime;
    }

    public void setVisitorCreateTime(Timestamp visitorCreateTime) {
        this.visitorCreateTime = visitorCreateTime;
    }

    public Timestamp getVisitorModifiedTime() {
        return visitorModifiedTime;
    }

    public void setVisitorModifiedTime(Timestamp visitorModifiedTime) {
        this.visitorModifiedTime = visitorModifiedTime;
    }

    @Override
    public String toString() {
        return "VisitorService{" +
                "id=" + id +
                ", visitorName='" + visitorName + '\'' +
                ", visitorPassword='" + visitorPassword + '\'' +
                ", visitorAge=" + visitorAge +
                ", visitorEmail='" + visitorEmail + '\'' +
                ", visitorPhone='" + visitorPhone + '\'' +
                ", visitorTrueName='" + visitorTrueName + '\'' +
                ", visitorAddress='" + visitorAddress + '\'' +
                ", visitorLoginTime=" + visitorLoginTime +
                ", visitorCreateTime=" + visitorCreateTime +
                ", visitorModifiedTime=" + visitorModifiedTime +
                '}';
    }
}
