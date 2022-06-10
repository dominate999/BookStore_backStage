package cn.edu.nchu.bookstore.dao;

import cn.edu.nchu.bookstore.entity.Refund;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface RefundDao {

    @Insert("insert into refund values(null,#{orderId},#{refundCreateTime},#{refundReason},#{refundExpectAmount})")
    public boolean addRefund(Refund refund);

    @Select("select * from refund Where orderId = #{orderId}")
    public List<Refund> queryRefundByOrderId(int orderId);
}
