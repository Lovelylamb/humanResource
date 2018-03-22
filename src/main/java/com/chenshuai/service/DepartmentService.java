package com.chenshuai.service;


import com.chenshuai.po.Department;

public interface DepartmentService {
    boolean addDepartment(Department department);//增加用户
    boolean deleteDepartment(Department department);//冻结或删除用户
    boolean updateDepartment(Department department);//更新用户
    Department findDepartmentByName(Department department);//查询部门
}
