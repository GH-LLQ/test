//package com.example.demo;
//
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//import org.springframework.beans.factory.annotation.Configurable;
//import org.springframework.scheduling.annotation.EnableScheduling;
//import org.springframework.scheduling.annotation.Scheduled;
//import org.springframework.stereotype.Component;
//
//@Component
//@Configurable
//@EnableScheduling
//public class TestTask {
//    private  static  final Logger logger= LogManager.getLogger(TestTask.class);
//    @Scheduled(cron="*/5 * * * * * ")
//    public void reportCurrentByCron(){
//        logger.info("定时器运行了！！！");
//    }
//}
