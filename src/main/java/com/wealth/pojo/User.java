package com.wealth.pojo;

public class User {
    private String id;          // 用户ID
    private String username;    // 用户名
    private String realname;    // 真实姓名
    private String password;    // 登录密码
    private String IDcard;      // 身份证号
    private String phone;       // 手机号
    private String email;       // 邮箱
    private String paypwd;      // 交易密码
    private String staus;       // 用户状态
    private String reputation;  // 用户信誉

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", realname='" + realname + '\'' +
                ", password='" + password + '\'' +
                ", IDcard='" + IDcard + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", paypwd='" + paypwd + '\'' +
                ", staus='" + staus + '\'' +
                ", reputation='" + reputation + '\'' +
                '}';
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setIDcard(String IDcard) {
        this.IDcard = IDcard;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPaypwd(String paypwd) {
        this.paypwd = paypwd;
    }

    public void setStaus(String staus) {
        this.staus = staus;
    }

    public void setReputation(String reputation) {
        this.reputation = reputation;
    }

    public String getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getRealname() {
        return realname;
    }

    public String getPassword() {
        return password;
    }

    public String getIDcard() {
        return IDcard;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getPaypwd() {
        return paypwd;
    }

    public String getStaus() {
        return staus;
    }

    public String getReputation() {
        return reputation;
    }
}
