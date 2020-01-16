package cn.demo.utils;

import cn.demo.dao.UserDao;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyJdkProxy implements InvocationHandler {
    private UserDao userDao;
    public MyJdkProxy(UserDao userDao){
        this.userDao = userDao;
    }
    public Object creatProxy(){
        Object proxy = Proxy.newProxyInstance(userDao.getClass().getClassLoader(),userDao.getClass().getInterfaces(),this);
        return proxy;
    }
    public Object invoke(Object proxy, Method method, Object[] args) throws InvocationTargetException, IllegalAccessException {
        if("add".equals(method.getName())){
            System.out.println("权限校验...");
            return method.invoke(userDao,args);
        }
        return method.invoke(userDao,args);
    }
}
