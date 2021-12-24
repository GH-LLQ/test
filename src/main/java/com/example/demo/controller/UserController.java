package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.Userservice;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.Random;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    Userservice userservice;
    @Resource
    JavaMailSender javaMailSender;
    @RequestMapping("/pd")
    public String test(String stunum,  String stupwd, HttpSession session){
        String reslt="";
        User user=new User();
        user.setStunum(stunum);
        user.setStupwd(stupwd);

        //调用服务层判断
        reslt=userservice.checkuser(user);
        if(reslt.equals("成功")){
            session.setAttribute("username",stunum);
            reslt="location.href='/main';";
        }else {
            session.removeAttribute("username");
        }
        return reslt;
    }
    @RequestMapping("/emailpd")
    public String test2(String email,HttpSession session){
        String reslt="";
        User user=new User();
        user.setEmail(email);
        reslt=userservice.checkuserbyemail(user);
        if(reslt.equals("邮箱存在")){
            SimpleMailMessage msg = new SimpleMailMessage();    //构建一个邮件对象
            msg.setSubject("这是一封测试邮件"); // 设置邮件主题
            msg.setFrom("511823437@qq.com"); // 设置邮箱发送者
            msg.setTo(email); // 设置邮件接收者，可以有多个接收者
            msg.setSentDate(new Date());    // 设置邮件发送日期
            String textstring=getRandomString();
            //session.setAttribute("username2",textstring);
            msg.setText(textstring);   // 设置邮件的正文
            javaMailSender.send(msg);
            session.setAttribute("v_code",textstring);
            reslt="location.href='/yyds3';";
            System.out.println("你好");
        }else{
//            session.removeAttribute("v_code");
            reslt="alert('邮箱未注册');";
        }
        return reslt;
    }
    @RequestMapping("/emailpd2")
    public String emailpd2(String email,HttpSession session){
        String reslt="";
        User user=new User();
        user.setEmail(email);
        reslt=userservice.checkuserbyemail(user);
        if(reslt.equals("邮箱存在")){
            SimpleMailMessage msg = new SimpleMailMessage();    //构建一个邮件对象
            msg.setSubject("这是一封测试邮件"); // 设置邮件主题
            msg.setFrom("511823437@qq.com"); // 设置邮箱发送者
            msg.setTo(email); // 设置邮件接收者，可以有多个接收者
            msg.setSentDate(new Date());    // 设置邮件发送日期
            String textstring=getRandomString();
            session.setAttribute("email",email);
            msg.setText(textstring);   // 设置邮件的正文
            javaMailSender.send(msg);
            session.setAttribute("v_code",textstring);
            reslt="alert('验证码发送成功')";
            System.out.println("你好");
        }else{
//            session.removeAttribute("v_code");
            reslt="alert('邮箱未注册');";
        }
        return reslt;
    }
    @RequestMapping("/v_code_pd")
    public String test3(String v_code,HttpSession session){
        String reslt="";
        System.out.println("验证码在这--------------------"+v_code);
        System.out.println(v_code.equals(session.getAttribute("v_code")));
        if(v_code.equals(session.getAttribute("v_code"))){
            System.out.println("进来了");
            return "location.href='/success';";
        }else{
//            session.removeAttribute("v_code");
            return "alert('验证码错误');";
        }
    }

    @RequestMapping("/v_code_pd2")
    public String test6(String v_code,HttpSession session){
        String reslt="";
        System.out.println("验证码在这--------------------"+v_code);
        System.out.println(v_code.equals(session.getAttribute("v_code")));
        if(v_code.equals(session.getAttribute("v_code"))){
            System.out.println("进来了");
            return "location.href='/change';";
        }else{
//            session.removeAttribute("v_code");
            return "alert('验证码错误');";
        }
    }
    @RequestMapping("/change_pd")
    public String test4(String newpwd,String newpwd2,HttpSession session){
        System.out.println("进来了");
        String reslt="";
        if(newpwd.equals(newpwd2)){
            reslt=userservice.changepwdbyemail(newpwd, (String) session.getAttribute("email"));
            if(reslt.equals("修改成功")){
                return "location.href='/test';";
            }
            else {
                return "alert('修改失败请重试！');";
            }
        }else {
            return "alert('两次密码不一致请重新输入');";
        }
    }

    @RequestMapping("/tz")
    public String test3(){
        return "location.href='/main3';";
    }
    @RequestMapping("/tz2")
    public String test5(){
        return "location.href='/main4';";
    }
    //生成验证码
    public String getRandomString(){
        String str="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random=new Random();
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<7;i++){
            int number=random.nextInt(62);
            sb.append(str.charAt(number));
        }
        System.out.println(sb.toString());
        return sb.toString();
    }
}
