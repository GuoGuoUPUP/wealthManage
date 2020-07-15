package com.wealth.mapper;

import com.wealth.pojo.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface adminMapper {
    // 根据username查询数据库
    @Select("select * from admin where admin.username=#{value}")
    public List<Admin> selectUserName(String value);
}
