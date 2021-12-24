package com.example.demo.service;

import com.example.demo.model.User;

public interface Userservice {
    public String checkuser(User user);
    public String checkuserbyemail(User user);
    public String changepwdbyemail(String newpwd,String email);
}
