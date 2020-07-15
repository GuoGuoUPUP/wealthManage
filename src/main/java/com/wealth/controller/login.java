package com.wealth.controller;

import com.alibaba.fastjson.JSONObject;
import com.wealth.pojo.Admin;
import com.wealth.pojo.User;
import com.wealth.server.adminServer;
import com.wealth.server.userServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/login")
public class login {
    /*======================================注入相关类========================================*/
    @Autowired
    private userServer userServer;
    @Autowired
    private adminServer adminServer;

    @PostMapping("/verify")
    @ResponseBody
    public Map<String,String> loginPage(@RequestBody String request) {
        System.out.println("收到post登录验证请求！");
        JSONObject object = JSONObject.parseObject(request);
        String username = object.get("username").toString();
        String password = object.get("password").toString();
        System.out.println("\t用户名：" + username + "\n\t密码：" + password);
        Map<String,String> response = new HashMap<>();

        // 查询用户表
        List<User> resultUser = userServer.selectUserName(username);
        List<Admin> resultAdmin;
        System.out.println("用户表查询结果：" + resultUser);
        if (resultUser.isEmpty()) {                 // 在用户表中未查询到,查询管理员表
            System.out.println("测试点1");
            resultAdmin = adminServer.selectUserName(username);
            System.out.println("管理员表查询结果：" + resultAdmin);
            if (resultAdmin.isEmpty()) {            // 在管理员表中未查询到
                response.put("code","failure");
            }else {                             // 该用户为管理员
                response.put("code","SUCCESS");
                response.put("type","Admin");
                response.put("id",resultAdmin.get(0).getId());
            }
        } else {
            response.put("code","SUCCESS");
            response.put("type","Admin");
            response.put("id", resultUser.get(0).getId());
        }
        return response;
    }
}
