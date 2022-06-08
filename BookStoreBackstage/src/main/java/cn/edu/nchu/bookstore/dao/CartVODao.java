package cn.edu.nchu.bookstore.dao;

import cn.edu.nchu.bookstore.entity.CartVO;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CartVODao {

    @Select("select * from cart_view where customerId = #{customerId}")
    List<CartVO> queryCartByCustomerId(int customerId);


    @Select({
            "<script>" +
                    "select * from cart_view where id in " +
                    "<foreach item = 'item' index = 'index' collection = 'ids' open='(' separator=',' close=')'>" +
                    "#{item}" +
                    "</foreach>"+
                    "</script>"})
    List<CartVO> queryCartByIds(@Param("ids") List<Integer> ids);
}
