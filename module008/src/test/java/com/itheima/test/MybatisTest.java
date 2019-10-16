package com.itheima.test;

import com.itheima.dao.IAccountMapper;
import com.itheima.dao.IUserMapper;
import com.itheima.entity.Account;
import com.itheima.entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class MybatisTest {
    @Test
    public void testFindAllAccount() throws Exception{
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        SqlSession session = factory.openSession();
        IAccountMapper accountMapper = session.getMapper(IAccountMapper.class);
        List<Account> accounts = accountMapper.findAllAccount();
        session.close();
        in.close();
    }

    @Test
    public void testFindAllUser() throws Exception{
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        SqlSession session = factory.openSession();
        IUserMapper userMapper = session.getMapper(IUserMapper.class);
        List<User> users = userMapper.findAllUser();
        session.close();
        in.close();
    }
}
