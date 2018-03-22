package com.chenshuai.po;

import java.io.Serializable;
import java.sql.Timestamp;

public class Admin implements Serializable{
    private Integer id;
    private String adminName;
    private String adminPassword;
    private Timestamp adminLoginTime;
    private Timestamp adminModifiedTime;
    private Timestamp adminCreateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    public Timestamp getAdminLoginTime() {
        return adminLoginTime;
    }

    public void setAdminLoginTime(Timestamp adminLoginTime) {
        this.adminLoginTime = adminLoginTime;
    }

    public Timestamp getAdminCreateTime() {
        return adminCreateTime;
    }

    public void setAdminCreateTime(Timestamp adminCreateTime) {
        this.adminCreateTime = adminCreateTime;
    }

    public Timestamp getAdminModifiedTime() {
        return adminModifiedTime;
    }

    public void setAdminModifiedTime(Timestamp adminModifiedTime) {
        this.adminModifiedTime = adminModifiedTime;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                ", adminName='" + adminName + '\'' +
                ", adminPassword='" + adminPassword + '\'' +
                ", adminLoginTime=" + adminLoginTime +
                ", adminModifiedTime=" + adminModifiedTime +
                ", adminCreateTime=" + adminCreateTime +
                '}';
    }
}
