package com.chenshuai.service;

import com.chenshuai.po.Visitor;

public interface VisitorService {
    Visitor queryVisitorByName(Visitor visitor);//查询用户
    boolean addVisitor(Visitor visitor);//增加用户
    boolean deleteVisitor(Visitor visitor);//冻结或删除用户
    boolean updateVisitor(Visitor visitor);//更新用户
}
