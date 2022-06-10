package cn.edu.nchu.bookstore.service;

import cn.edu.nchu.bookstore.entity.Cart;
import cn.edu.nchu.bookstore.entity.CartVO;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface CartService {

    List<CartVO> queryCartByCustomerId(int customerId);

    boolean deleteSelect(List<Integer> cartIds);

    boolean updateQuantity(int cartQuantity, int cartId);

    boolean deleteOneByCartId(int cartId);


    boolean addToCart(Cart cart);
}
