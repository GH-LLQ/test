package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller

public class AyUserController {
    @Resource
    private AyUserController ayUserController;
    @RequestMapping("/test")
    public String test(){
        return "login";
    }

    @RequestMapping("/main")
    public String main(HttpSession session){
        if (session.getAttribute("username")!=null){
            return "main";
        }else{
            return "login";
        }
    }
    @RequestMapping("/main3")
    public String main3(){
        return "emaillogin";
    }

    @RequestMapping("/main4")
    public String main4(){
        return "findpwd";
    }




    @RequestMapping("/success")
    public String test5(){
        return "main";
    }

    @RequestMapping("/change")
    public String test6(){
        return "change";
    }
}
