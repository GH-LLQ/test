package com.example.demo.service;

import com.example.demo.dao.WluserDao;
import com.example.demo.model.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UsersericeImpl implements Userservice {
    @Resource
    WluserDao wluserDao;
    @Override
    public String checkuser(User user) {
        String retStr="";
        User u=wluserDao.findwluserByStunum(user.getStunum());
        if(u==null){
            u=wluserDao.findwluserByStuphone(user.getStunum());
            if(u==null){
                retStr="alert('用户不存在');";
            }
        }
        if(u!=null){
            if(user.getStupwd().equals(u.getStupwd())){
                retStr="成功";
            }
            else {
                retStr="alert('密码错误');";
            }
        }
        return retStr;
    }

    @Override
    public String checkuserbyemail(User user) {
        String retStr="";
        User u=wluserDao.findwluserByemail(user.getEmail());
        if(u==null){
            retStr="alert('该邮箱未注册');";
        }else {
            retStr="邮箱存在";
        }
        return retStr;
    }

    @Override
    public String changepwdbyemail(String newpwd,String email){
        String reStr="";
        int result=wluserDao.changepwd(newpwd,email);
        if(result==1){
            reStr="修改成功";
        }
        else {
            reStr="修改失败";
        }
        return reStr;
    }
}
