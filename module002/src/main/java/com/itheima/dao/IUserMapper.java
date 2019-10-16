package com.itheima.dao;

import com.itheima.entity.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IUserMapper {
    @Select("select * from user")
    List<User> findAllUser();
}
