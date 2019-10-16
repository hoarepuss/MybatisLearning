package com.itheima.test;

import com.itheima.dao.IMessageMapper;
import com.itheima.entity.Account;
import com.itheima.entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.lf5.util.Resource;
import org.junit.Test;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MybatisTest {
    @Test
    public void findAllAccountAndRelationUser() throws Exception{
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        SqlSession session = factory.openSession();
        IMessageMapper messageMapper = session.getMapper(IMessageMapper.class);
        List<Account> accounts = messageMapper.findAllAccountAndRelationUser();
        for(Account account: accounts){
            System.out.println(account);
        }
        session.close();
        in.close();
    }

    @Test
    public void findAllUserAndRelationAccount() throws Exception{
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        SqlSession session = factory.openSession();
        IMessageMapper messageMapper = session.getMapper(IMessageMapper.class);
        List<User> users = messageMapper.findAllUserAndRelationAccount();
        for(User user: users){
            System.out.println(user);
        }
        session.close();
        in.close();
    }
}
