package com.chenshuai.po;

import java.io.Serializable;
import java.sql.Timestamp;

public class VisitorMessage implements Serializable {
    private static  final Integer VISITOR_MESSAGE_IS_VIEWED=1;//已看
    private static  final Integer VISITOR_MESSAGE_IS_NOT_VIEWED=1;//未看
    private Integer id;
    private Integer visitorId;
    private String visitorMessageItem;//游客消息主题
    private String visitorMessageContent;//游客消息内容
    private String visitorMessageViewed;//是否查看
    private Timestamp visitorCreateTime;
    private Timestamp visitorModifiedTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVisitorId() {
        return visitorId;
    }

    public void setVisitorId(Integer visitorId) {
        this.visitorId = visitorId;
    }

    public String getVisitorMessageItem() {
        return visitorMessageItem;
    }

    public void setVisitorMessageItem(String visitorMessageItem) {
        this.visitorMessageItem = visitorMessageItem;
    }

    public String getVisitorMessageContent() {
        return visitorMessageContent;
    }

    public void setVisitorMessageContent(String visitorMessageContent) {
        this.visitorMessageContent = visitorMessageContent;
    }

    public String getVisitorMessageViewed() {
        return visitorMessageViewed;
    }

    public void setVisitorMessageViewed(String visitorMessageViewed) {
        this.visitorMessageViewed = visitorMessageViewed;
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
        return "VisitorMessage{" +
                "id=" + id +
                ", visitorId=" + visitorId +
                ", visitorMessageItem='" + visitorMessageItem + '\'' +
                ", visitorMessageContent='" + visitorMessageContent + '\'' +
                ", visitorMessageViewed='" + visitorMessageViewed + '\'' +
                ", visitorCreateTime=" + visitorCreateTime +
                ", visitorModifiedTime=" + visitorModifiedTime +
                '}';
    }
}
