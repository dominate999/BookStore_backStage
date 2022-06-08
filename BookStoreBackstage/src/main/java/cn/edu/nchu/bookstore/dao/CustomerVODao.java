package cn.edu.nchu.bookstore.dao;

import cn.edu.nchu.bookstore.entity.Account;
import cn.edu.nchu.bookstore.entity.CustomerVO;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CustomerVODao {


    @Select("select * from customer_view")
    public List<CustomerVO> queryAllCustomer();

    @Select("select * from customer_view where customerId = #{customerId}")
    public CustomerVO queryCustomerByCustomerId(int customerId);

    @Select("select * from customer_view where id = #{accountId}")
    public CustomerVO queryCustomerByAccountId(int accountId);

}
