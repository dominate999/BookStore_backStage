package cn.edu.nchu.bookstore.controller;

import cn.edu.nchu.bookstore.service.CartService;
import cn.edu.nchu.bookstore.utils.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller("cartController")
@RequestMapping("/cart")
public class CartController {

    @Autowired
    private CartService cartService;

    @RequestMapping("/queryCartByCustomerId")
    @ResponseBody
    public JsonResult queryCartByCustomerId(int customerId){
        return JsonResult.ok(cartService.queryCartByCustomerId(customerId));
    }
}
