package com.wealth.server;

import com.wealth.pojo.User;

import java.util.List;

public interface userServer {
    // 查询用户名称
    public List<User> selectUserName(String value);
}
