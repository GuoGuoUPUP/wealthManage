package com.wealth.server;

import com.wealth.pojo.Admin;

import java.util.List;

public interface adminServer {
    // 查询用户名称
    public List<Admin> selectUserName(String value);
}
