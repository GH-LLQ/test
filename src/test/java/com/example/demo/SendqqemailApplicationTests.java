package com.example.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutorService;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.tools.JavaFileManager;
import java.util.Date;
import java.util.Random;

//
//@Component
//@Configurable
//@EnableScheduling
//@SpringBootTest
//public class SendqqemailApplicationTests {
//    private  static  final Logger logger= LogManager.getLogger(SendqqemailApplicationTests.class);
//    @Resource
//    JavaMailSender javaMailSender;
//    @Scheduled(cron="*/5 * * * * * ")
////    @Test
//    public void sendSimpleMail() {
//        SimpleMailMessage msg = new SimpleMailMessage();    //构建一个邮件对象
//        msg.setSubject("黄俊杰"); // 设置邮件主题
//        msg.setFrom("1797013083@qq.com"); // 设置邮箱发送者
//        msg.setTo("1797013083@qq.com"); // 设置邮件接收者，可以有多个接收者
//        msg.setSentDate(new Date());    // 设置邮件发送日期
//        String textstring="19网工3班黄俊杰";
//        msg.setText(textstring);   // 设置邮件的正文
//        javaMailSender.send(msg);
//    }
////    @Test
////    public String getRandomString(){
////        String str="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
////        Random random=new Random();
////        StringBuffer sb=new StringBuffer();
////        for(int i=0;i<7;i++){
////            int number=random.nextInt(62);
////            sb.append(str.charAt(number));
////        }
////        System.out.println(sb.toString());
////        return sb.toString();
////    }
//}
