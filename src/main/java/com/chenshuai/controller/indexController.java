package com.chenshuai.controller;

import com.chenshuai.po.Visitor;
import com.chenshuai.service.VisitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class indexController {
    @Autowired
    private VisitorService visitorService;
//游客的主页面
//    @RequestMapping(value = "")
//    public String indexPage() {
//        return "visitor/visitorIndex";
//    }
//管理员的主页面
    @RequestMapping(value = "")
    public String indexPage() {
        return "admin/adminLogin";
    }

//在登陆和注册界面中使用首页跳转到主页面
    @RequestMapping(value="/visitorIndex1.do")
    public String visitorIndex1(){
        return "visitor/visitorIndex";
    }


    @RequestMapping(value = "/visitorIndex.do")
    public String visitorIndex(HttpServletRequest request, Visitor visitor, Model model, HttpSession session) {
        //检查cookie
        Cookie[] cookies = request.getCookies();
        if (cookies == null) {
            return "redirect:/visitor/login.view";
        }
        String visitorName = null;
        String visitorPassword = null;
        for (Cookie cookie : cookies) {
            if ("visitorName".equals(cookie.getName())) {
                visitorName = cookie.getValue();
            }
            if ("visitorPassword".equals(cookie.getName())) {
                visitorPassword = cookie.getValue();
            }
        }
        visitor.setVisitorName(visitorName);
        visitor.setVisitorPassword(visitorPassword);
        visitor = visitorService.queryVisitorByName(visitor);
        if (visitor == null) {
            model.addAttribute("info","登陆失败");
            return "redirect:/visitor/login.view";
        }
        session.setAttribute("visitor",visitor);
        model.addAttribute("info","登陆成功");
        return "success";
    }

    @RequestMapping(value ="adminIndex.do")
    public String adminIndex(){
        return null;
    }

}
