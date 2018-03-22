package com.chenshuai.controller;

import com.chenshuai.po.Admin;
import com.chenshuai.po.Recruit;
import com.chenshuai.service.AdminService;
import com.chenshuai.service.RecruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(value="/admin")
public class adminController {
   @Autowired
    private AdminService adminService;
   private RecruitService recruitService;
   //管理员登陆页面
   @RequestMapping("/login.view")
    public String regPage(){
       return "admin/adminLogin";
   }
//从其他不相关的页面直接跳到管理员的首页面
   @RequestMapping("/adminTop.view")
   public String adminTop(){
       return "admin/adminTop";
   }

   @RequestMapping(value="login.do")
    public String login(@ModelAttribute Admin admin, HttpSession session, Model model,
                        @RequestParam(value="isremember",required = false) String isremember,
                        HttpServletResponse response){
      admin =  adminService.findAdminByName(admin);
      if(admin==null){
          model.addAttribute("info","登陆失败");
          return "admin/adminLogin";//登陆失败返回到登陆界面
      }
       //保存cookie
       if("on".equals(isremember)){
           Cookie cookieName=new Cookie("adminName",admin.getAdminName());
           cookieName.setMaxAge(60*60*24*7);
           cookieName.setPath("/");
           Cookie cookiePassword =new Cookie("adminPassword",admin.getAdminPassword());
           cookiePassword.setMaxAge(60*60*24*7);
           cookiePassword.setPath("/");
           response.addCookie(cookieName);
           response.addCookie(cookiePassword);
       }
       session.setAttribute("admin",admin);
       model.addAttribute("info","登陆成功");
       return "admin/adminTop";
   }

   //管理员管理招聘信息
    @RequestMapping(value="/addRecriut.view")
    public String addRecruit(){
       return "recruit/recruit";
    }
   //添加招聘信息
    @RequestMapping(value="addRecruit.do")
    public String addRecruit(@ModelAttribute Recruit recruit,HttpSession session,Model model){
        boolean addRecruit = recruitService.addRecruit(recruit);
        if(addRecruit){
            model.addAttribute("info","添加信息成功");
            return "admin/adminTop";
        }
        model.addAttribute("info","添加信息失败");
        return "recruit/recruit";
    }

}
