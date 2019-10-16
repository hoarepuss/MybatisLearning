package com.itheima.test;

import com.itheima.dao.IRoleMapper;
import com.itheima.dao.IUserMapper;
import com.itheima.entity.Role;
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
    public void findAllUserAndRelationRole() throws Exception{
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        SqlSession session = factory.openSession();
        IUserMapper userMapper = session.getMapper(IUserMapper.class);
        List<User> users = userMapper.findAll();
        for(User user: users){
            System.out.println(user);
            System.out.println(user.getRoles());
        }
        session.close();
        in.close();
    }

    @Test
    public void findAllRoleAndRelationUser() throws Exception{
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        SqlSession session = factory.openSession();
        IRoleMapper roleMapper = session.getMapper(IRoleMapper.class);
        List<Role> roles = roleMapper.findAll();
        for(Role role: roles){
            System.out.println(role);
            System.out.println(role.getUsers());
        }
        session.close();
        in.close();
    }
}
