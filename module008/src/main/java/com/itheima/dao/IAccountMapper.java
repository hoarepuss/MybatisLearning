package com.itheima.dao;

import com.itheima.entity.Account;

import java.util.List;

public interface IAccountMapper {
    List<Account> findAllAccount();
    List<Account> findAccountsByUid(Integer i);
}
