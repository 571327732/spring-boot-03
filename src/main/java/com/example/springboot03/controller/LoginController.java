package com.example.springboot03.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class LoginController {
    @PostMapping("/user/login")
    public String login(@RequestParam("userName") String userName , @RequestParam("password")String password, HttpSession
                        session, Map<String,Object> map){
        if("admin".equals(userName)&& "123123".equals(password)){
            session.setAttribute("loginUser",userName);
            return "redirect:/main.html";
        }else {
            map.put("msg","用户名和密码不匹配,请重新登录!!!");
            map.put("userName",userName);//用户名回显
            return "login";
        }
    }
}
