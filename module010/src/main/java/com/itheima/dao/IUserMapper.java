package com.itheima.dao;

import com.itheima.entity.User;

public interface IUserMapper {
    User findUserById(Integer userId);
    void updateUserById(Integer userId);
}
