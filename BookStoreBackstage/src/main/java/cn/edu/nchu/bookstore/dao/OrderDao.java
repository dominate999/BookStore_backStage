package cn.edu.nchu.bookstore.dao;

import cn.edu.nchu.bookstore.entity.Order;
import cn.edu.nchu.bookstore.entity.OrderVO;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface OrderDao {

    @Insert("insert into `order` values (null," +
            "#{orderGeneratedId}," +
            "#{orderState}," +
            "#{orderCreateTime}," +
            "#{orderPayTime}," +
            "#{orderAmount}," +
            "#{customerId});")
    @Options(useGeneratedKeys=true, keyProperty="id", keyColumn="id")
    boolean addOrder(Order order);

    @Update("update `order` set orderState = #{orderState} where id = #{id}")
    boolean UpdateOrderState(Order order);

    @Update("update `order` set orderState = #{orderState}, orderPayTime = #{orderPayTime} where id = #{id}")
    boolean PayForOrder(Order order);


    @Select("select * from `order` where customerId = #{userId}")
    List<Order> queryOrderByUserId(int userId);

    @Select("select * from `order` where customerId = #{userId} and orderState = #{orderState}")
    List<Order> queryOrderByState(@Param("userId") int userId, @Param("orderState") String orderState);
}
