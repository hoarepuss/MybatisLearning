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
    public void testFindAll() throws Exception{
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        SqlSession session = factory.openSession();
        IUserMapper userMapper = session.getMapper(IUserMapper.class);
        User  user1 = userMapper.findUserById(41);
        userMapper.updateUserById(42);
        User  user2 = userMapper.findUserById(41);
        System.out.println(user1 == user2);
        session.close();
        in.close();
    }

}
