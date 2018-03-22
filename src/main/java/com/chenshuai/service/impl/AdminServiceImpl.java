package com.chenshuai.service.impl;

import com.chenshuai.dao.AdminDao;
import com.chenshuai.po.Admin;
import com.chenshuai.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value="AdminService")
public class AdminServiceImpl implements AdminService {
@Autowired
private AdminDao adminDao;

    public Admin findAdminByName(Admin admin) {

        return adminDao.findAdminByName(admin);
    }

}
