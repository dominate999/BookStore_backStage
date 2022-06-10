package cn.edu.nchu.bookstore.service.impl;

import cn.edu.nchu.bookstore.dao.CartDao;
import cn.edu.nchu.bookstore.dao.CartVODao;
import cn.edu.nchu.bookstore.entity.Cart;
import cn.edu.nchu.bookstore.entity.CartVO;
import cn.edu.nchu.bookstore.service.CartService;
import com.alipay.api.domain.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("cartService")
public class CartServiceImpl implements CartService {

    @Autowired
    private CartVODao cartVODao;
    @Autowired
    private CartDao cartDao;

    @Override
    public List<CartVO> queryCartByCustomerId(int customerId) {
        return cartVODao.queryCartByCustomerId(customerId);
    }

    @Override
    public boolean deleteSelect(List<Integer> cartIds) {
        return cartDao.deleteSelect(cartIds);
    }

    @Override
    public boolean deleteOneByCartId(int cartId) {
        return cartDao.deleteCartByOne(cartId);
    }

    @Override
    public boolean updateQuantity(int cartQuantity, int cartId) {
        return cartDao.updateQuantity(cartQuantity, cartId);
    }

    @Override
    public boolean addToCart(Cart cart) {
       Cart cart1 =  cartDao.CheckSame(cart.getCustomerId(),cart.getBookId());
       if(cart1 != null){//不为空则累加上去
           cart1.setCartAmount(cart1.getCartAmount() + cart.getCartAmount());
           cart1.setCartQuantity(cart1.getCartQuantity() + cart.getCartQuantity());
           return cartDao.updateSame(cart1);
       }

       return cartDao.addToCart(cart);

    }
}

