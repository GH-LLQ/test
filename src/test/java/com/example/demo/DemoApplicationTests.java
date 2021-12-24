package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.scheduling.annotation.EnableScheduling;

import javax.annotation.Resource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@SpringBootTest

class DemoApplicationTests {
    //    @Resource
//private JdbcTemplate jdbcTemplate;
//private JdbcTemplate template ;
//    @Test
//    void contextLoads() {
//
//        String sql="select * from user";
//        List<Emp> list=(List<Emp>) jdbcTemplate.query(sql, new RowMapper<Emp>() {
//            @Override
//            public Emp mapRow(ResultSet rs, int i) throws SQLException {
//                Emp emp=new Emp();
//                emp.setId(rs.getInt("id"));
//                emp.setUsername(rs.getString("username"));
//                emp.setPassword(rs.getString("password"));
//                return emp;
//            }
//        });
//        for (Emp emp:list) {
//            System.out.println(emp);
//        }
//    }
//    @Test
//    void contextLoads() {
//
//    }
}