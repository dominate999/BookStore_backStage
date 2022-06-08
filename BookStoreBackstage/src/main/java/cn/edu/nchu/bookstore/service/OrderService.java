package cn.edu.nchu.bookstore.service;

import cn.edu.nchu.bookstore.entity.*;

import java.util.List;

public interface OrderService {

    int addOrderFromCart(List<Integer> cartIds, int userId);

    int addOrderByOne(int bookId, int num,int userId);

    List<OrderVO>  queryOrderByOrderId(int orderId);

    List<OrderVO> queryOrderByUserId(int userId);

    //更新订单的状态
    boolean updateOrderState(Order order);

    //给子订单添加评价
    boolean addEvaToOrderItem(Orderitem orderitem);

    //付钱，修改订单状态
    boolean payForOrder(Order order);


    List<OrderBind> queryOrderBind(int userId,String orderState);


}
