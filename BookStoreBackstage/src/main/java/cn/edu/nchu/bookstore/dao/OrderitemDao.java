package cn.edu.nchu.bookstore.dao;

import cn.edu.nchu.bookstore.entity.Orderitem;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface OrderitemDao {

    @Insert("insert into orderitem values(null,#{bookId},#{orderItemAmount},#{bookQuantity},#{evaluateId},#{orderId})")
    public boolean addOrderItem(Orderitem orderitem);


    @Insert("update  orderitem set evaluateId = #{evaluateId} whvere id = #{id})")
    public boolean addOrderItemEva(Orderitem orderitem);


    @Select("select * from orderitem where orderId = #{orderId}")
    public List<Orderitem> queryOrderitemByOrderId(int orderId);
}
