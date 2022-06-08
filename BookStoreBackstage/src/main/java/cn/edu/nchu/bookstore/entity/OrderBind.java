package cn.edu.nchu.bookstore.entity;

import java.util.List;

public class OrderBind {
    private CustomerVO customerVO;
    private Order order;
    private List<OrderitemVO> orderitems;


    public OrderBind() {
    }

    public OrderBind(CustomerVO customerVO, Order order, List<OrderitemVO> orderitems) {
        this.customerVO = customerVO;
        this.order = order;
        this.orderitems = orderitems;
    }

    public CustomerVO getCustomerVO() {
        return customerVO;
    }

    public void setCustomerVO(CustomerVO customerVO) {
        this.customerVO = customerVO;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public List<OrderitemVO> getOrderitems() {
        return orderitems;
    }

    public void setOrderitems(List<OrderitemVO> orderitems) {
        this.orderitems = orderitems;
    }
}
