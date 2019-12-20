package cn.demo.service;

import cn.demo.dao.UserDao;

public class UserService {
    private UserDao userDao;
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
