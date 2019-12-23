package cn.demo.service;

import cn.demo.beans.Account;
import cn.demo.dao.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Iterator;
import java.util.List;

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
    @Test
    public void testAccount() { // xml 配置文件实现 jdbc的操作
        AccountService acs = (AccountService) ac.getBean("accountService");
        Account account = (Account) ac.getBean("account");
        account.setMoney(Float.valueOf("900.890"));
        account.setName("pp");
//        acs.saveAccount(account);
        List<Account> list = acs.findAllAccount();
        Iterator<Account> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        acs.deleteAccount(7);
    }
}