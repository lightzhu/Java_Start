package cn.demo.service;

import cn.demo.dao.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class UserServiceTest {
    private ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
    // 测试xml形式的创建对象
    @Test
    public void testSet() {
        UserDao user = (UserDao) ac.getBean("userDao");
        UserService us = (UserService) ac.getBean("userService");
        System.out.println(user);
        us.save();
    }
}