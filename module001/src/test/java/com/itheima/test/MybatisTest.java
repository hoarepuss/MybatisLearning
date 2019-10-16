package com.itheima.test;

import com.itheima.dao.IUserMapper;
import com.itheima.entity.QueryVo;
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
    public void MybatisTestfindAllUser() throws Exception{
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        SqlSession session = factory.openSession();
        IUserMapper userMapper = session.getMapper(IUserMapper.class);
        List<User> users = userMapper.findAllUser();
        for(User u: users){
            System.out.println(u);
        }
        session.close();
        in.close();
    }

    @Test
    public void MybatisTestInsertUser() throws Exception{
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        SqlSession session = factory.openSession(true);
        IUserMapper userMapper = session.getMapper(IUserMapper.class);
        User user = new User();
        user.setUserName("王五");
        user.setUserAddress("北京市顺义区");
        user.setUserSex("男");
        user.setUserBirthday(new Date());
        System.out.println(user);
        userMapper.insertUser(user);
        System.out.println(user);
        session.close();
        in.close();
    }

    @Test
    public void MybatisTestUpdateUser() throws Exception{
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        SqlSession session = factory.openSession();
        IUserMapper userMapper = session.getMapper(IUserMapper.class);
        User user = new User();
        user.setUserId(41);
        user.setUserName("杜鲁门");
        user.setUserAddress("北京市朝阳");
        user.setUserSex("女");
        user.setUserBirthday(new Date());
        userMapper.updateUser(user);
        session.commit(true);
        session.close();
        in.close();
    }

    @Test
    public void MybatisTestDeleteUser() throws Exception{
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        SqlSession session = factory.openSession();
        IUserMapper userMapper = session.getMapper(IUserMapper.class);
        userMapper.deleteUser(50);
        session.commit(true);
        session.close();
        in.close();
    }

    @Test
    public void MybatisTestfindUserById() throws Exception{
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        SqlSession session = factory.openSession();
        IUserMapper userMapper = session.getMapper(IUserMapper.class);
        User user = userMapper.findUserById(48);
        System.out.println(user);
        session.close();
        in.close();
    }

    @Test
    public void MybatisTestfindUserByName() throws Exception{
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        SqlSession session = factory.openSession();
        IUserMapper userMapper = session.getMapper(IUserMapper.class);
        List<User> users = userMapper.findUserByName("%王%");
        for(User user: users){
            System.out.println(user);
        }
        session.close();
        in.close();
    }

    @Test
    public void MybatisTestUserTotal() throws Exception{
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        SqlSession session = factory.openSession();
        IUserMapper userMapper = session.getMapper(IUserMapper.class);
        int count = userMapper.UserTotal();
        System.out.println(count);
        session.close();
        in.close();
    }

    @Test
    public void MybatisTestfindUserByVo() throws Exception{
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        SqlSession session = factory.openSession();
        IUserMapper userMapper = session.getMapper(IUserMapper.class);
        QueryVo queryVo = new QueryVo();
        User user = new User();
        //user.setUsername("'%王%'"+" or 1 = 1");
        queryVo.setUser(user);
        List<User> users = userMapper.findUserByVo(queryVo);
        for(User u: users){
            System.out.println(u);
        }
        session.close();
        in.close();
    }

    @Test
    public void MybatisTestfindUserByCondition() throws Exception{
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        SqlSession session = factory.openSession();
        IUserMapper userMapper = session.getMapper(IUserMapper.class);
        User user = new User();
        user.setUserName("老王");
        user.setUserSex("男");
        List<User> users = userMapper.findUserByCondition(user);
        for(User u: users){
            System.out.println(u);
        }
        session.close();
        in.close();
    }

    @Test
    public void MybatisTestfindUserByIds() throws Exception{
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        SqlSession session = factory.openSession();
        IUserMapper userMapper = session.getMapper(IUserMapper.class);
        QueryVo queryVo = new QueryVo();
        ArrayList<Integer> ids = new ArrayList<Integer>();
        queryVo.setIds(ids);
        ids.add(41);
        ids.add(42);
        ids.add(43);
        ids.add(44);
        List<User> users = userMapper.findUserByIds(queryVo);
        for(User u: users){
            System.out.println(u);
        }
        session.close();
        in.close();
    }
}
