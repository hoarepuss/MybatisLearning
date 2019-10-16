package com.itheima.test;

import com.itheima.dao.IUserMapper;
import com.itheima.entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.lf5.util.Resource;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class MybatisTest {
    @Test
    public void MybatisTestUse() throws Exception{
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        SqlSession session = factory.openSession();
        IUserMapper userMapper = session.getMapper(IUserMapper.class);
        List<User> users = userMapper.findAllUser();
        for(User user: users){
            System.out.println(user);
        }
        session.close();
        in.close();
    }
}
