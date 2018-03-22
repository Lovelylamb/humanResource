package com.chenshuai.po;

import java.io.Serializable;
import java.sql.Timestamp;

public class Resume implements Serializable {
    private Integer id;
    private Integer visitorId;//游客id
    private String resumeName;//名字
    private String resumeSex;//性别
    private String resumeNational;//名族
    private String resumePhone;//手机号
    private String resumeEmail;//邮箱
    private Timestamp resumeBirthDate;//出生日期
    private String resumeGraduatedSchool;//毕业学校
    private String resumeEducation;//学历
    private Timestamp resumeGraduatedDate;//毕业时间
    private String resumeExperience; //履历
    private String resumeSelfIntroduction;//简介
    private Timestamp resumeCreateTime;
    private Timestamp resumeModifiedTime;

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

    public String getResumeName() {
        return resumeName;
    }

    public void setResumeName(String resumeName) {
        this.resumeName = resumeName;
    }

    public String getResumeSex() {
        return resumeSex;
    }

    public void setResumeSex(String resumeSex) {
        this.resumeSex = resumeSex;
    }

    public String getResumeNational() {
        return resumeNational;
    }

    public void setResumeNational(String resumeNational) {
        this.resumeNational = resumeNational;
    }

    public String getResumePhone() {
        return resumePhone;
    }

    public void setResumePhone(String resumePhone) {
        this.resumePhone = resumePhone;
    }

    public String getResumeEmail() {
        return resumeEmail;
    }

    public void setResumeEmail(String resumeEmail) {
        this.resumeEmail = resumeEmail;
    }

    public Timestamp getResumeBirthDate() {
        return resumeBirthDate;
    }

    public void setResumeBirthDate(Timestamp resumeBirthDate) {
        this.resumeBirthDate = resumeBirthDate;
    }

    public String getResumeGraduatedSchool() {
        return resumeGraduatedSchool;
    }

    public void setResumeGraduatedSchool(String resumeGraduatedSchool) {
        this.resumeGraduatedSchool = resumeGraduatedSchool;
    }

    public String getResumeEducation() {
        return resumeEducation;
    }

    public void setResumeEducation(String resumeEducation) {
        this.resumeEducation = resumeEducation;
    }

    public Timestamp getResumeGraduatedDate() {
        return resumeGraduatedDate;
    }

    public void setResumeGraduatedDate(Timestamp resumeGraduatedDate) {
        this.resumeGraduatedDate = resumeGraduatedDate;
    }

    public String getResumeExperience() {
        return resumeExperience;
    }

    public void setResumeExperience(String resumeExperience) {
        this.resumeExperience = resumeExperience;
    }

    public String getResumeSelfIntroduction() {
        return resumeSelfIntroduction;
    }

    public void setResumeSelfIntroduction(String resumeSelfIntroduction) {
        this.resumeSelfIntroduction = resumeSelfIntroduction;
    }

    public Timestamp getResumeCreateTime() {
        return resumeCreateTime;
    }

    public void setResumeCreateTime(Timestamp resumeCreateTime) {
        this.resumeCreateTime = resumeCreateTime;
    }

    public Timestamp getResumeModifiedTime() {
        return resumeModifiedTime;
    }

    public void setResumeModifiedTime(Timestamp resumeModifiedTime) {
        this.resumeModifiedTime = resumeModifiedTime;
    }

    @Override
    public String toString() {
        return "Resume{" +
                "id=" + id +
                ", visitorId=" + visitorId +
                ", resumeName='" + resumeName + '\'' +
                ", resumeSex='" + resumeSex + '\'' +
                ", resumeNational='" + resumeNational + '\'' +
                ", resumePhone='" + resumePhone + '\'' +
                ", resumeEmail='" + resumeEmail + '\'' +
                ", resumeBirthDate=" + resumeBirthDate +
                ", resumeGraduatedSchool='" + resumeGraduatedSchool + '\'' +
                ", resumeEducation='" + resumeEducation + '\'' +
                ", resumeGraduatedDate=" + resumeGraduatedDate +
                ", resumeExperience='" + resumeExperience + '\'' +
                ", resumeSelfIntroduction='" + resumeSelfIntroduction + '\'' +
                ", resumeCreateTime=" + resumeCreateTime +
                ", resumeModifiedTime=" + resumeModifiedTime +
                '}';
    }
}
