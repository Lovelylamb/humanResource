package com.chenshuai.po;

import java.io.Serializable;
import java.sql.Timestamp;

public class Application implements Serializable {
    private static final Integer RECRUIT_HR_IS_VIEWED=1;//已查看简历
    private static final Integer RECRUIT_HR_IS_NOT_VIEWED=0;//未查看简历
    private static final Integer INTERVIEW_IS_PASS=1;//通过面试
    private static final Integer INTERVIEW_IS_NOT_PASS=0;//未通过面试
    private static final Integer INTERVIEW_IS=1; //参加了面试
    private static final Integer INTERVIEW_IS_NOT=0;//未参加面试
    private Integer id;
    private Integer resumeId;
    private Integer recruitId;
    private Integer recruitHrIsViewed;
    private Integer interviewIsPass;
    private Integer interviewIs;
    private Timestamp applicationCreateTime;
    private Timestamp applicationModifiedTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getResumeId() {
        return resumeId;
    }

    public void setResumeId(Integer resumeId) {
        this.resumeId = resumeId;
    }

    public Integer getRecruitId() {
        return recruitId;
    }

    public void setRecruitId(Integer recruitId) {
        this.recruitId = recruitId;
    }

    public Integer getRecruitHrIsViewed() {
        return recruitHrIsViewed;
    }

    public void setRecruitHrIsViewed(Integer recruitHrIsViewed) {
        this.recruitHrIsViewed = recruitHrIsViewed;
    }

    public Integer getInterviewIsPass() {
        return interviewIsPass;
    }

    public void setInterviewIsPass(Integer interviewIsPass) {
        this.interviewIsPass = interviewIsPass;
    }

    public Integer getInterviewIs() {
        return interviewIs;
    }

    public void setInterviewIs(Integer interviewIs) {
        this.interviewIs = interviewIs;
    }

    public Timestamp getApplicationCreateTime() {
        return applicationCreateTime;
    }

    public void setApplicationCreateTime(Timestamp applicationCreateTime) {
        this.applicationCreateTime = applicationCreateTime;
    }

    public Timestamp getApplicationModifiedTime() {
        return applicationModifiedTime;
    }

    public void setApplicationModifiedTime(Timestamp applicationModifiedTime) {
        this.applicationModifiedTime = applicationModifiedTime;
    }

    @Override
    public String toString() {
        return "Application{" +
                "id=" + id +
                ", resumeId=" + resumeId +
                ", recruitId=" + recruitId +
                ", recruitHrIsViewed=" + recruitHrIsViewed +
                ", interviewIsPass=" + interviewIsPass +
                ", interviewIs=" + interviewIs +
                ", applicationCreateTime=" + applicationCreateTime +
                ", applicationModifiedTime=" + applicationModifiedTime +
                '}';
    }
}
