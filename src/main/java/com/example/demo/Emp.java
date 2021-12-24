package com.example.demo;

public class Emp {
    private Integer id;
    private String username;
    private String password;
    public Integer getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    @Override
    public String toString() {
        return "Emp [id=" + id + ", username=" + username + ", password=" + password + "]";
    }
}
