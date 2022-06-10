package cn.edu.nchu.bookstore.dao;

import cn.edu.nchu.bookstore.entity.Cart;
import cn.edu.nchu.bookstore.entity.CartVO;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface CartDao {

    @Update("update cart set cartQuantity =  #{cartQuantity} where id = #{cartId}")
    public boolean updateQuantity(@Param("cartQuantity")int cartQuantity,@Param("cartId")int cartId);


    @Update("update cart set cartQuantity =  #{cartQuantity},cartAmount = #{cartAmount} where id = #{id}")
    public boolean updateSame(Cart cart);


    @Select("select * from cart where id = #{cartId}")
    public Cart queryCartById(int cartId);

    @Select("select * from cart where customerId = #{customerId} and bookId = #{bookId}")
    public Cart CheckSame(@Param("customerId")int customerId,@Param("bookId")int bookId);

    @Delete("delete from cart  where id = #{cartId}")
    public boolean deleteCartByOne(int cartId);


    @Delete({
            "<script>" +
                    "delete from cart where id in " +
                    "<foreach item = 'item' index = 'index' collection = 'ids' open='(' separator=',' close=')'>" +
                    "#{item}" +
                    "</foreach>"+
                    "</script>"})
    boolean deleteSelect(@Param("ids") List<Integer> ids);


    @Insert("insert into cart values(null,#{customerId},#{bookId},#{cartQuantity},#{cartAmount})")
    public boolean addToCart(Cart cart);


}
