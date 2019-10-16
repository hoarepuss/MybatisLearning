package com.itheima.dao;

import com.itheima.entity.Account;

import java.util.List;

public interface IAccountMapper {
    List<Account> findAll();
    List<Account> findAllAccount();
}
