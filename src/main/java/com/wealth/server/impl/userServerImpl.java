package com.wealth.server.impl;

import com.wealth.mapper.userMapper;
import com.wealth.pojo.User;
import com.wealth.server.userServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userServerImpl implements userServer {
    @Autowired
    private userMapper userMapper;

    @Override
    public List<User> selectUserName(String value) {
        return userMapper.selectUserName(value);
    }
}
