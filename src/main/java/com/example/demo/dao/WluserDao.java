package com.example.demo.dao;

import com.example.demo.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface WluserDao {

    public User findwluserByStunum(String stunum);

    public User findwluserByStuphone(String stuphone);

    public User findwluserByemail(String email);

    public int changepwd(String newpwd, String email);

//    public void Sendqqemail(String address);
}
