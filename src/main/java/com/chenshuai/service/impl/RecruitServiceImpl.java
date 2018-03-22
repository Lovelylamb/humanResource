package com.chenshuai.service.impl;

import com.chenshuai.dao.RecruitDao;
import com.chenshuai.po.Recruit;
import com.chenshuai.service.RecruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service(value="RecruitService")
public class RecruitServiceImpl implements RecruitService {
    @Autowired
    private RecruitDao recruitDao;
//增加简历信息
    public boolean addRecruit(Recruit recruit) {
        return recruitDao.addRecruit(recruit);
    }
//删除简历信息
    public boolean deleteRecruit(Recruit recruit) {
        return recruitDao.deleteRecruit(recruit);
    }
}
