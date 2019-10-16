package com.itheima.dao;

import com.itheima.entity.User;

import java.util.List;

public interface IUserMapper {
    User findUserByUid(Integer userId);
    List<User> findAllUser();
}
