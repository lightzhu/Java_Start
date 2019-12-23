package cn.demo.service;

import cn.demo.dao.UserDao;

public class UserService {
    private UserDao userDao;
    // xml 方式的配置依赖的bean需要写对应的set方法
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

/*    public UserDao getUserDao() {
        return userDao;
    }*/

    public void save() {
        userDao.addUser();
    }
}
