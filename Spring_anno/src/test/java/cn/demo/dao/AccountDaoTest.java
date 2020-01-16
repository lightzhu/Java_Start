package cn.demo.dao;

import cn.demo.beans.Account;
import cn.demo.service.AccountService;
import cn.demo.utils.MyJdkProxy;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Iterator;
import java.util.List;

import static org.junit.Assert.*;

public class AccountDaoTest {
    private ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
    AccountService acs = (AccountService) ac.getBean("accountService");
    @Test
    public void findAllAccount() {
        List<Account> list = acs.findAllAccount();
        Iterator<Account> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    @Test
    public void findAccountById() {
        System.out.println(acs.findAccountById(6));
    }
    @Test
    public void saveAccount() {
        Account zh = new Account();
        zh.setName("pop");
        zh.setMoney(7890.8f);
        acs.saveAccount(zh);
    }
    @Test
    public void JdkProxy() {
        UserDao userDao = new UserDao();
        IUserDao proxy = (IUserDao) new MyJdkProxy(userDao).creatProxy();
        proxy.add();
        proxy.update();
    }
}