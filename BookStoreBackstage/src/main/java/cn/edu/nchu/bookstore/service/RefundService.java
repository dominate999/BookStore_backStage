package cn.edu.nchu.bookstore.service;

import cn.edu.nchu.bookstore.entity.Refund;
import cn.edu.nchu.bookstore.entity.RefundVO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface RefundService {

    public boolean addRefund(Refund refund);

    public List<Refund> queryRefundByOrderId(int orderId);

    public List<RefundVO> queryRefundByAccountId(int accountId);
}
