package cn.edu.nchu.bookstore.service.impl;

import cn.edu.nchu.bookstore.dao.CartVODao;
import cn.edu.nchu.bookstore.entity.CartVO;
import cn.edu.nchu.bookstore.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("cartService")
public class CartServiceImpl implements CartService {

    @Autowired
    private CartVODao cartVODao;

    @Override
    public List<CartVO> queryCartByCustomerId(int customerId) {
        return cartVODao.queryCartByCustomerId(customerId);
    }
}

