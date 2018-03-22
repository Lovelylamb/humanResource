package com.chenshuai.dao;

import com.chenshuai.po.Visitor;

public interface VisitorDao {
    boolean addVisitor(Visitor visitor);//增加用户
    boolean deleteVisitor(Visitor visitor);//冻结或删除用户
    boolean updateVisitor(Visitor visitor);//更新用户
    Visitor findVisitorByName(Visitor visitor);//查询部门
}
