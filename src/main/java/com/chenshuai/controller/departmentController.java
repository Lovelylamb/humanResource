package com.chenshuai.controller;

import com.chenshuai.po.Department;
import com.chenshuai.service.DepartmentService;
import com.sun.org.apache.regexp.internal.RE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(value="/department")
public class departmentController {
    @Autowired
    private DepartmentService departmentService;

    @RequestMapping(value="/addDepartment.view")
    public String addDepartment(){
        return "department/department";
    }

//增加部门
    @RequestMapping(value="addDepartment.do")
    public String addDepartmentDo(@ModelAttribute Department department, HttpSession session, Model model){
          boolean addDepartment =departmentService.addDepartment(department);
          if(addDepartment){
              model.addAttribute("info","部门添加成功");
              session.setAttribute("department",department);
              return "department/departmentIndex";
          }
        model.addAttribute("info","部门添加失败");
        return "department/department";
    }

    //删除部门
    @RequestMapping(value="deleteDepartment.do")
    public String deleteDepartment(@ModelAttribute Department department,HttpSession session ,Model model){
        boolean deleteDepartment=departmentService.deleteDepartment(department);
        if(deleteDepartment){
            model.addAttribute("info","部门删除成功");
            session.setAttribute("department",department);
            return "department/departmentIndex";
        }
        model.addAttribute("info","部门删除失败");
        return "department/department";
    }
     //更新部门信息


}
