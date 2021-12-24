package com.example.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Date;

//
//@Component
//@Configurable
//public class TestTask {
//    private  static  final Logger logger= LogManager.getLogger(TestTask.class);
//    @Resource
//    JavaMailSender javaMailSender;
//    @Scheduled(cron="*/5 * * * * * ")
//    public void sendSimpleMail() {
//        SimpleMailMessage msg = new SimpleMailMessage();    //构建一个邮件对象
//        msg.setSubject("19网工3班-黄俊杰-1914080903308"); // 设置邮件主题
//        msg.setFrom("1797013083@qq.com"); // 设置邮箱发送者
//        msg.setTo("webyykf@126.com"); // 设置邮件接收者，可以有多个接收者
//        msg.setSentDate(new Date());    // 设置邮件发送日期
//        String textstring="你好呀！";
//        msg.setText(textstring);   // 设置邮件的正文
//        javaMailSender.send(msg);
//    }
//}