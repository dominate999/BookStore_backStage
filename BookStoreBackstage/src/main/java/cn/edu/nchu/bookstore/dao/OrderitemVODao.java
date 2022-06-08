package cn.edu.nchu.bookstore.dao;

import cn.edu.nchu.bookstore.entity.OrderitemVO;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface OrderitemVODao {

    @Select("select * from orderitem_view where orderId = #{orderId}")
    public List<OrderitemVO> queryOrderitemVOByOrderId(int orderId);
}
