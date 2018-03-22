package com.chenshuai.service;

import com.chenshuai.po.Recruit;

public interface RecruitService {
    boolean addRecruit(Recruit recruit);  //增加简历信息
    boolean deleteRecruit(Recruit recruit);  //删除招聘信息
}
