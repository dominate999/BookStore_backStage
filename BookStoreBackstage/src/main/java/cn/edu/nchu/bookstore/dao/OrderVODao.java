package cn.edu.nchu.bookstore.dao;

import cn.edu.nchu.bookstore.entity.OrderVO;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface OrderVODao {

    @Select("select * from order_view where id = #{orderId}")
    List<OrderVO> queryOrderVOByOrderId(int orderId);

    @Select("select * from order_view where customerId = #{userId}")
    List<OrderVO> queryOrderByUserId(int userId);

}
