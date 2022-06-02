package cn.edu.nchu.bookstore.service.impl;

import cn.edu.nchu.bookstore.dao.AccountDao;
import cn.edu.nchu.bookstore.entity.Account;
import cn.edu.nchu.bookstore.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Override
    public List<Account> queryAll() {

        return accountDao.queryAll();
    }
}
