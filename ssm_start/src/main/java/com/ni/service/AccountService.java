package com.ni.service;

import com.ni.domain.Account;
import java.util.List;

public interface AccountService {
    public List<Account> findAll();
    public void save(Account account);
}
