package com.chenshuai.po;

import java.io.Serializable;
import java.sql.Timestamp;

public class Files implements Serializable {
    private Integer id;
    private String filesAddress;  //文件地址
    private Timestamp filesCreateTime;
    private Timestamp filesModifiedTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFilesAddress() {
        return filesAddress;
    }

    public void setFilesAddress(String filesAddress) {
        this.filesAddress = filesAddress;
    }

    public Timestamp getFilesCreateTime() {
        return filesCreateTime;
    }

    public void setFilesCreateTime(Timestamp filesCreateTime) {
        this.filesCreateTime = filesCreateTime;
    }

    public Timestamp getFilesModifiedTime() {
        return filesModifiedTime;
    }

    public void setFilesModifiedTime(Timestamp filesModifiedTime) {
        this.filesModifiedTime = filesModifiedTime;
    }

    @Override
    public String toString() {
        return "Files{" +
                "id=" + id +
                ", filesAddress='" + filesAddress + '\'' +
                ", filesCreateTime=" + filesCreateTime +
                ", filesModifiedTime=" + filesModifiedTime +
                '}';
    }
}
