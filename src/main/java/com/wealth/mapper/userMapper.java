package com.wealth.mapper;

import com.wealth.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface userMapper {
    @Select("select * from user where user.username=#{value}")
    public List<User> selectUserName(String value);
}
