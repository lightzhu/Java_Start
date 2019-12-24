package cn.light.dao;

import cn.light.beans.Account;

import java.util.List;

public interface AccountDao {
   List<Account> findAll();
}
