package com.itheima.dao;

import com.itheima.entity.QueryVo;
import com.itheima.entity.User;

import java.util.List;

public interface IUserMapper {
    List<User> findAllUser();
    void insertUser(User user);
    void updateUser(User user);
    void deleteUser(Integer userId);
    User findUserById(Integer userId);
    List<User> findUserByName(String name);
    int UserTotal();
    List<User> findUserByVo(QueryVo queryVo);
    List<User> findUserByCondition(User user);
    List<User> findUserByIds(QueryVo queryVo);
}
