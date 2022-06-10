package cn.edu.nchu.bookstore.service.impl;

import cn.edu.nchu.bookstore.dao.OrderDao;
import cn.edu.nchu.bookstore.dao.RefundDao;
import cn.edu.nchu.bookstore.dao.RefundVODao;
import cn.edu.nchu.bookstore.entity.Order;
import cn.edu.nchu.bookstore.entity.Refund;
import cn.edu.nchu.bookstore.entity.RefundVO;
import cn.edu.nchu.bookstore.service.RefundService;
import cn.edu.nchu.bookstore.service.ReturnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service("refundService")
public class RefundServiceImpl implements RefundService {

    @Autowired
    private RefundDao refundDao;
    @Autowired
    private OrderDao orderDao;
    @Autowired
    private RefundVODao refundVODao;

    @Override
    public boolean addRefund(Refund refund) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = sdf.format(new Date());
        refund.setRefundCreateTime(time);
        Order order = new Order();
        order.setId(refund.getOrderId());
        order.setOrderState("退款申请待同意");
        orderDao.UpdateOrderState(order);
        return refundDao.addRefund(refund);
    }

    @Override
    public List<Refund> queryRefundByOrderId(int orderId) {
        return refundDao.queryRefundByOrderId(orderId);
    }

    @Override
    public List<RefundVO> queryRefundByAccountId(int accountId) {
        return refundVODao.queryRefundByAccountId(accountId);
    }
}
