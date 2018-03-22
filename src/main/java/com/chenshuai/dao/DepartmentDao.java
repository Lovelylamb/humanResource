package com.chenshuai.dao;

import com.chenshuai.po.Department;

public interface DepartmentDao {
    boolean addDepartment(Department department);//增加部门
    boolean deleteDepartment(Department department);//删除部门
    boolean updateDepartment(Department department);//更新部门
    Department findDepartmentByName(Department department);//查询部门
}
