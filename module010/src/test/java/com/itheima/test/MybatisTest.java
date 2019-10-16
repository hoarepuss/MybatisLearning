package com.itheima.test;

import com.itheima.dao.IUserMapper;
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
    public void testFindUserById() throws Exception{
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        SqlSession session1 = factory.openSession(true);
        IUserMapper userMapper1 = session1.getMapper(IUserMapper.class);
        User user1 = userMapper1.findUserById(41);
        System.out.println(user1);
        //userMapper1.updateUserById(41);
        session1.close();
        SqlSession session2 = factory.openSession();
        IUserMapper userMapper2 = session2.getMapper(IUserMapper.class);
        User user2 = userMapper2.findUserById(41);
        System.out.println(user2);
        System.out.println(user1 == user2);
        session2.close();
        in.close();
    }
}
