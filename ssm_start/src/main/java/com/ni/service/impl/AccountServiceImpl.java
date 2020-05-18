package com.ni.service.impl;

import com.ni.dao.AccountDao;
import com.ni.domain.Account;
import com.ni.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Override
    public List<Account> findAll() {
        System.out.println("业务层：查询所有账户..");
        return accountDao.findAll();
    }

    @Override
    public void save(Account account) {
        System.out.println("业务层：保存账户..");
        accountDao.save(account);
    }
}
