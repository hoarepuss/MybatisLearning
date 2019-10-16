package com.itheima.dao;

import com.itheima.entity.User;

import java.util.List;

public interface IUserMapper {
    User findUserById(Integer userId);
    void updateUserById(Integer userId);
}
