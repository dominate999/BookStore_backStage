package cn.edu.nchu.bookstore.dao;

import cn.edu.nchu.bookstore.entity.CartVO;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CartVODao {

    @Select("select * from cart_view where customerId = #{customerId}")
    List<CartVO> queryCartByCustomerId(int customerId);
}
