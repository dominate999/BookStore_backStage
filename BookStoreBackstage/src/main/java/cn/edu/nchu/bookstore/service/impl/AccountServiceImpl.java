package cn.edu.nchu.bookstore.service.impl;

import cn.edu.nchu.bookstore.dao.AccountDao;
import cn.edu.nchu.bookstore.dao.CustomerVODao;
import cn.edu.nchu.bookstore.entity.Account;
import cn.edu.nchu.bookstore.entity.CustomerVO;
import cn.edu.nchu.bookstore.service.AccountService;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;
    @Autowired
    private CustomerVODao customerVODao;

    @Override
    public List<Account> queryAll() {
        return accountDao.queryAll();
    }

    @Override
    public List<CustomerVO> queryAllCustomer(){
        return customerVODao.queryAllCustomer();
    }

    @Override
    public CustomerVO queryCustomerByCustomerId(int customerId) {
        return customerVODao.queryCustomerByCustomerId(customerId);
    }

    @Override
    public Account queryByAccountId(int accountId) {
        return accountDao.queryByAccountId(accountId);
    }

    @Override
    public CustomerVO queryCustomerByAccountId(int accountId) {
        return customerVODao.queryCustomerByAccountId(accountId);
    }

    @Override
    public boolean checkName(String username, int accountId) {
        List <Account> accounts = accountDao.queryAll();
        for (Account account1 : accounts) {
            if(account1.getId()==accountId){
                continue;
            }
            if(account1.getUsername().equals(username)){
                return false;
            }
        }
        return true;
    }
}
