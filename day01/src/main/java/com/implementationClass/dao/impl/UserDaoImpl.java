package com.implementationClass.dao.impl;

import com.implementationClass.dao.IUserDao;
import com.implementationClass.domain.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

/**
 * dao实现类
 */
public class UserDaoImpl implements IUserDao {

    private SqlSessionFactory factory;

    public UserDaoImpl(SqlSessionFactory  factory){
        this.factory = factory;
    }

    public List<User> findAll(){
        //1.使用工厂创建SqlSession对象
        SqlSession session = factory.openSession();
        //2.使用session执行查询所有方法，使用的是resources中的配置文件
        List<User> users = session.selectList("com.simple.dao.IUserDao");
        session.close();
        //3.返回查询结果
        return users;
    }
}
