package cn.edu.nchu.bookstore.controller;

import cn.edu.nchu.bookstore.entity.Cart;
import cn.edu.nchu.bookstore.service.CartService;
import cn.edu.nchu.bookstore.utils.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

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

    @RequestMapping("/deleteSelect")
    @ResponseBody
    public JsonResult deleteSelect(String cartIds){
        String[] ids = (cartIds.substring(1,cartIds.length()-1)).split(",");
        List<Integer> list = new ArrayList<Integer>();
        for (String element: ids) {
            list.add(Integer.parseInt(element));
        }
        return JsonResult.ok(cartService.deleteSelect(list));
    }

    @RequestMapping("/deleteOneByCartId")
    @ResponseBody
    public JsonResult deleteOneByCartId(int cartId){
        return JsonResult.ok(cartService.deleteOneByCartId(cartId));
    }


    @RequestMapping("/updateQuantity")
    @ResponseBody
    public JsonResult updateQuantity(int cartQuantity,int cartId){
        return JsonResult.ok(cartService.updateQuantity(cartQuantity,cartId));

    }


    @RequestMapping("/addToCart")
    @ResponseBody
    public JsonResult addToCart(int customerId,int bookId,int cartQuantity,double cartAmount){
        Cart cart = new Cart();
        cart.setCustomerId(customerId);
        cart.setBookId(bookId);
        cart.setCartQuantity(cartQuantity);
        cart.setCartAmount(cartAmount);
        return JsonResult.ok(cartService.addToCart(cart));
    }

}
