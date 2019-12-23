package cn.demo.service;

import cn.demo.beans.Account;
import cn.demo.dao.AccountDao;

import java.util.List;

public class AccountService {
    private AccountDao act;

    public void setAct(AccountDao act) {
        this.act = act;
    }

    public List<Account> findAllAccount(){
        return act.findAllAccount();
    }

    public Account findAccountById(Integer id){
        return act.findAccountById(id);
    }
    public void saveAccount(Account account){
        act.saveAccount(account);
    }
    public void updateAccount(Account account){
        act.updateAccount(account);
    }
    public void deleteAccount(Integer id){
        act.deleteAccount(id);
    }
}
