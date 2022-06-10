package cn.edu.nchu.bookstore.dao;

import cn.edu.nchu.bookstore.entity.Order;
import cn.edu.nchu.bookstore.entity.OrderVO;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface OrderDao {

    @Insert("insert into `order1` values (null," +
            "#{orderGeneratedId}," +
            "#{orderState}," +
            "#{orderCreateTime}," +
            "#{orderPayTime}," +
            "#{orderAmount}," +
            "#{customerId}," +
            "#{deliver_no}"+
            ");")
    @Options(useGeneratedKeys=true, keyProperty="id", keyColumn="id")
    boolean addOrder(Order order);

    @Update("update `order1` set orderState = #{orderState} where id = #{id}")
    boolean UpdateOrderState(Order order);

    @Update("update `order1` set orderState = #{orderState}, orderPayTime = #{orderPayTime} where id = #{id}")
    boolean PayForOrder(Order order);

    @Update("update `order1` set orderState = #{orderState}, orderPayTime = #{orderPayTime} where orderGeneratedId = #{orderGeneratedId}")
    boolean PayForOrderByGen(Order order);


    @Select("select * from `order1` where customerId = #{userId} order by id desc")
    List<Order> queryOrderByUserId(int userId);


    @Select("select * from `order1` where orderGeneratedId = #{orderGeneratedId}")
    List<Order> queryOrderByGen(String orderGeneratedId);

    @Select("select * from `order1` where customerId = #{userId} and orderState = #{orderState}  order by id desc")
    List<Order> queryOrderByState(@Param("userId") int userId, @Param("orderState") String orderState);
}
