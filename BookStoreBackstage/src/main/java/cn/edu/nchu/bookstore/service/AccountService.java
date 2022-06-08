package cn.edu.nchu.bookstore.service;

import cn.edu.nchu.bookstore.entity.Account;
import cn.edu.nchu.bookstore.entity.CustomerVO;

import java.util.List;

public interface AccountService {

    List<Account> queryAll();

    boolean checkName(String username,int accountId);

    List<CustomerVO> queryAllCustomer();

    Account queryByAccountId(int accountId);

    CustomerVO queryCustomerByCustomerId(int customerId);

    CustomerVO queryCustomerByAccountId(int accountId);
}
