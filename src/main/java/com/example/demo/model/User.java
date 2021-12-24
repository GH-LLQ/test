package com.example.demo.model;

public class User {
    private int id;
    private String stunum;
    private String stuphone;
    private String stupwd;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String email;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStunum() {
        return stunum;
    }

    public void setStunum(String stunum) {
        this.stunum = stunum;
    }

    public String getStuphone() {
        return stuphone;
    }

    public void setStuphone(String stuphone) {
        this.stuphone = stuphone;
    }

    public String getStupwd() {
        return stupwd;
    }

    public void setStupwd(String stupwd) {
        this.stupwd = stupwd;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", stunum='" + stunum + '\'' +
                ", stuphone='" + stuphone + '\'' +
                ", stupwd='" + stupwd + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
