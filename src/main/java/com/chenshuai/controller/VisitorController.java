package com.chenshuai.controller;

import com.chenshuai.po.Visitor;
import com.chenshuai.service.VisitorService;
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
@RequestMapping(value = "/visitor")
public class VisitorController {
   @Autowired
    private VisitorService visitorService;
  //用户注册
   @RequestMapping(value = "/reg.view")
   public String regPage(){
       return "visitor/visitorRegister";
   }

   @RequestMapping(value = "/register.do")
    public String visitorRegisiter(@ModelAttribute Visitor visitor, HttpSession session, Model model){
       boolean addFlag =visitorService.addVisitor(visitor);
       if(addFlag){
           model.addAttribute("info","注册成功");
           session.setAttribute("visitor",visitor);
           return "visitor/visitorLogin";
       }
       model.addAttribute("info","注册失败");
       return "visitor/visitorIndex";
   }

   @RequestMapping(value = "/login.view")
   //登陆页面
   public String loginPage(){
       return "visitor/visitorLogin";
   }
   @RequestMapping(value="/login.do")
   public String login(@ModelAttribute Visitor visitor, HttpSession session, Model model,
                       @RequestParam(value = "isremember",required = false) String isremember,
                       HttpServletResponse response){
       visitor = visitorService.queryVisitorByName(visitor);
    if(visitor==null){
        model.addAttribute("info","登陆失败");
        return "visitor/visitorIndex";
       }
      //保存cookie
       if("on".equals(isremember)){
        Cookie cookieName=new Cookie("visitorName",visitor.getVisitorName());
        cookieName.setMaxAge(60*60*24*7);
        cookieName.setPath("/");
        Cookie cookiePassword =new Cookie("visitorPassword",visitor.getVisitorPassword());
        cookiePassword.setMaxAge(60*60*24*7);
        cookiePassword.setPath("/");
        response.addCookie(cookieName);
        response.addCookie(cookiePassword);
       }
       session.setAttribute("visitor",visitor);
       model.addAttribute("info","登陆成功");
       return "success";
   }
}
























