package cn.edu.nchu.bookstore.controller;

import cn.edu.nchu.bookstore.entity.Order;
import cn.edu.nchu.bookstore.entity.Orderitem;
import cn.edu.nchu.bookstore.service.OrderService;
import cn.edu.nchu.bookstore.utils.JsonResult;
import com.sun.webkit.perf.WCFontPerfLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller("orderController")
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping("/addOrderByOne")
    @ResponseBody
    public JsonResult addOrder(int bookId,int num,int userId){
        int orderId = orderService.addOrderByOne(bookId, num, userId);
        return JsonResult.ok(orderService.queryOrderByOrderId(orderId));
    }


    @RequestMapping("/addOrderFromCart")
    @ResponseBody
    public JsonResult addOrder(String cartIds,int userId){
        String[] ids = (cartIds.substring(1,cartIds.length()-1)).split(",");
        List<Integer> list = new ArrayList<Integer>();
        for (String element: ids) {
            list.add(Integer.parseInt(element));
        }
        int orderId = orderService.addOrderFromCart(list, userId);
        return JsonResult.ok(orderService.queryOrderByOrderId(orderId));
    }


    @RequestMapping("/payForOrder")
    @ResponseBody
    public JsonResult payForOrder(int orderId){
        Order order = new Order();
        order.setId(orderId);
        return JsonResult.ok(orderService.payForOrder(order));
    }

    @RequestMapping("/queryOrderByUserId")
    @ResponseBody
    public JsonResult queryOrderByUserId(int userId){
        return JsonResult.ok(orderService.queryOrderByUserId(userId));
    }

    @RequestMapping("/queryOrderByOrderId")
    @ResponseBody
    public JsonResult queryOrderByOrderId(int orderId){
        return JsonResult.ok(orderService.queryOrderByOrderId(orderId));
    }


    @RequestMapping("/addEvaToOrderItem")
    @ResponseBody
    public JsonResult addEvaToOrderItem(int orderItemId,int evaId){
        Orderitem orderitem = new Orderitem();
        orderitem.setId(orderItemId);
        orderitem.setEvaluateId(evaId);
        return JsonResult.ok(orderService.addEvaToOrderItem(orderitem));
    }

    @RequestMapping("/queryOrderBind")
    @ResponseBody
    public JsonResult queryOrderBind(@RequestParam(name = "userId") int userId,
                                     @RequestParam(name = "orderState",defaultValue = "null") String  orderState){
        return JsonResult.ok(orderService.queryOrderBind(userId, orderState));
    }





}
