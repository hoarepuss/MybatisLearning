package com.itheima.dao;

import com.itheima.entity.Account;
import com.itheima.entity.User;

import java.util.List;

public interface IMessageMapper {
    List<Account> findAllAccountAndRelationUser();
    List<User> findAllUserAndRelationAccount();
}
