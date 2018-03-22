package com.chenshuai.service.impl;

import com.chenshuai.dao.VisitorDao;
import com.chenshuai.po.Visitor;
import com.chenshuai.service.VisitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "visitorService")
public class VisitorServiceImpl implements VisitorService {
@Autowired
private VisitorDao visitorDao;

    public Visitor queryVisitorByName(Visitor visitor) {
        return visitorDao.findVisitorByName(visitor);
    }

    public boolean addVisitor(Visitor visitor) {
        if(visitor==null){
            return false;
        }
        return visitorDao.addVisitor(visitor);
    }

    public boolean deleteVisitor(Visitor visitor) {
        return false;
    }

    public boolean updateVisitor(Visitor visitor) {
        return false;
    }















}
