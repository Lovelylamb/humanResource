package com.chenshuai.dao;

import com.chenshuai.po.Recruit;

public interface RecruitDao {
    boolean addRecruit(Recruit recruit);  //增加招聘信息
    boolean deleteRecruit(Recruit recruit);  //删除招聘信息
}
