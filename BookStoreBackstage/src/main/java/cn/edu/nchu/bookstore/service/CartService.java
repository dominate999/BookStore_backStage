package cn.edu.nchu.bookstore.service;

import cn.edu.nchu.bookstore.entity.CartVO;

import java.util.List;

public interface CartService {

    List<CartVO> queryCartByCustomerId(int customerId);


}
