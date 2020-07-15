package com.wealth.pojo;

public class Admin {
    private String id;             // 管理员ID
    private String username;    // 管理员用户名
    private String password;    // 登录密码
    private String staus;       // 登录状态

    public String getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getStaus() {
        return staus;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setStaus(String staus) {
        this.staus = staus;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", staus='" + staus + '\'' +
                '}';
    }
}
