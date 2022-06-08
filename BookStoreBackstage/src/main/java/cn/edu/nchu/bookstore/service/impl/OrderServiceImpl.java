package cn.edu.nchu.bookstore.service.impl;

import cn.edu.nchu.bookstore.dao.*;
import cn.edu.nchu.bookstore.entity.*;
import cn.edu.nchu.bookstore.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service("orderService")
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao orderDao;
    @Autowired
    private OrderitemDao orderitemDao;
    @Autowired
    private OrderVODao orderVODao;
    @Autowired
    private BookVODao bookVODao;
    @Autowired
    private CartVODao cartVODao;
    @Autowired
    private BookDao bookDao;
    @Autowired
    private CustomerVODao customerVODao;
    @Autowired
    private OrderitemVODao orderitemVODao;

    @Override
    public int addOrderFromCart(List<Integer> cartIds, int userId) {
        List<CartVO> cartVOList = cartVODao.queryCartByIds(cartIds);
        Order order = new Order();
        Date date = new Date();

        // 生成订单号
        order.setOrderGeneratedId(String.valueOf(date.getTime()));

        //创建时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = sdf.format(date);
        order.setOrderCreateTime(time);

        //设置状态
        order.setOrderState("待付款");

        //下单人
        order.setCustomerId(userId);

        //设置总金额
        double amount = 0.0;

        for (CartVO cartVO : cartVOList) {
            amount += cartVO.getCartAmount();


        }
        order.setOrderAmount(amount);

        boolean state = orderDao.addOrder(order);

        Orderitem orderitem = null;
        for (CartVO cartVO : cartVOList) {
            orderitem = new Orderitem();
            //设置子订单信息
            orderitem.setOrderId(order.getId());
            orderitem.setBookId(cartVO.getBookId());
            orderitem.setBookQuantity(cartVO.getCartQuantity());
            orderitem.setOrderItemAmount(cartVO.getCartAmount());
            state = orderitemDao.addOrderItem(orderitem);

            //暂不修改图书的库存，再用户付款之后再修改！
        }

        return order.getId();
    }

    @Override
    public int addOrderByOne(int bookId, int num, int userId) {
        Order order = new Order();
        BookVO bookVO = bookVODao.queryBookById(bookId);
        Date date = new Date();
        // 生成订单号
        order.setOrderGeneratedId(String.valueOf(date.getTime()));
        //创建时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = sdf.format(date);
        order.setOrderCreateTime(time);
        //设置状态
        order.setOrderState("待付款");
        //下单人
        order.setCustomerId(userId);
        //设置总金额
        double amount = 0.0;
        amount = bookVO.getBookPrice() * num;
        order.setOrderAmount(amount);

        boolean state = orderDao.addOrder(order);

        Orderitem orderitem = new Orderitem();
        //设置子订单信息
        orderitem.setOrderId(order.getId());
        orderitem.setBookId(bookVO.getId());
        orderitem.setBookQuantity(num);
        orderitem.setOrderItemAmount(amount);
        state = orderitemDao.addOrderItem(orderitem);

        //暂不修改图书的库存，再用户付款之后再修改！

        return order.getId();
    }

    @Override
    public List<OrderVO> queryOrderByOrderId(int orderId) {

        return orderVODao.queryOrderVOByOrderId(orderId);
    }

    @Override
    public List<OrderVO> queryOrderByUserId(int userId) {

        return orderVODao.queryOrderByUserId(userId);
    }

    @Override
    public boolean updateOrderState(Order order) {
        return orderDao.UpdateOrderState(order);
    }

    @Override
    public boolean addEvaToOrderItem(Orderitem orderitem) {
        return orderitemDao.addOrderItemEva(orderitem);
    }

    @Override
    public boolean payForOrder(Order order) {
        //新增付款时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = sdf.format(new Date());
        order.setOrderPayTime(time);
        //修改状态
        order.setOrderState("待发货");
        //修改图书库存
        List<OrderVO>  orderVOList = orderVODao.queryOrderVOByOrderId(order.getId());
        for (OrderVO orderVO : orderVOList) {
            bookDao.updateStock(orderVO.getBookStock()-orderVO.getBookQuantity(),orderVO.getBookId());
        }
        return orderDao.PayForOrder(order);
    }


    @Override
    public List<OrderBind> queryOrderBind(int userId,String orderState){
        List<OrderBind> orderBinds = new ArrayList<>();
        List<Order> orderList = null;
        List<OrderitemVO> orderitems = null;
        CustomerVO customerVO = null;
        if(orderState.equals("null")){
            orderList = orderDao.queryOrderByUserId(userId);
        }else {
            orderList = orderDao.queryOrderByState(userId,orderState);
        }
        for (Order order : orderList) {
            orderitems =  orderitemVODao.queryOrderitemVOByOrderId(order.getId());
            customerVO = customerVODao.queryCustomerByCustomerId(order.getCustomerId());
            orderBinds.add(new OrderBind(customerVO,order,orderitems));
        }

        return orderBinds;
    }
}
