package com.chenshuai.service.impl;

import com.chenshuai.dao.DepartmentDao;
import com.chenshuai.po.Department;
import com.chenshuai.po.Visitor;
import com.chenshuai.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentDao departmentDao;

    public boolean addDepartment(Department department) {
        return departmentDao.addDepartment(department);
    }

    public boolean deleteDepartment(Department department) {
        return departmentDao.deleteDepartment(department);
    }

    public boolean updateDepartment(Department department) {
        return departmentDao.updateDepartment(department);
    }

    public Department findDepartmentByName(Department department) {
        return departmentDao.findDepartmentByName(department);
    }
}
