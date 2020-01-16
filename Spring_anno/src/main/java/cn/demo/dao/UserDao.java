package cn.demo.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao implements IUserDao{
    public void add(){
        System.out.println("增加方法");
    }
    public void update(){
        System.out.println("更新方法");
    }
}
