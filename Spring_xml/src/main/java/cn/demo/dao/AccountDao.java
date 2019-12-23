package cn.demo.dao;

import cn.demo.beans.Account;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.util.List;

public class AccountDao {
    private QueryRunner runner;

    public void setRunner(QueryRunner runner) {
        this.runner = runner;
    }
    public List<Account> findAllAccount(){
        try{
            return runner.query("select * from account",new BeanListHandler<Account>(Account.class));
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public Account findAccountById(int id){
        try{
            return runner.query("select * from account where id = ? ",new BeanHandler<Account>(Account.class),id);
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public void saveAccount(Account account){
        System.out.println("保存操作");
        try{
            runner.update("insert into account(name,money)values(?,?)",account.getName(),account.getMoney());
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public void updateAccount(Account account){
        System.out.println("更新操作");
        try{
            runner.update("update account set name=?,money=? where id=?",account.getName(),account.getMoney(),account.getId());
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public void deleteAccount(Integer id){
        System.out.println("删除操作");
        try{
            runner.update("delete from account where id=?",id);
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
