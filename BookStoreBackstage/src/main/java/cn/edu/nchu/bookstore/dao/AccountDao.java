package cn.edu.nchu.bookstore.dao;

import cn.edu.nchu.bookstore.entity.Account;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface AccountDao {
    @Select("select * from account")
    List<Account> queryAll();
}
