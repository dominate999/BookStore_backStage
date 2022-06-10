package cn.edu.nchu.bookstore.controller;

import cn.edu.nchu.bookstore.entity.Refund;
import cn.edu.nchu.bookstore.service.RefundService;
import cn.edu.nchu.bookstore.service.ReturnService;
import cn.edu.nchu.bookstore.utils.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller("refundController")
@RequestMapping("/refund")
public class RefundController {

    @Autowired
    private RefundService refundService;

    @RequestMapping("/addRefund")
    @ResponseBody
    public JsonResult addRefund(double expressAmount,String content,int orderId){
        Refund refund = new Refund();
        refund.setRefundExpectAmount(expressAmount);
        refund.setRefundReason(content);
        refund.setOrderId(orderId);
        return JsonResult.ok(refundService.addRefund(refund));
    }

    @RequestMapping("/queryRefundByOrderId")
    @ResponseBody
    public JsonResult queryRefundByOrderId(int orderId){

        return JsonResult.ok(refundService.queryRefundByOrderId(orderId));
    }

    @RequestMapping("/queryRefundByAccountId")
    @ResponseBody
    public JsonResult queryRefundByAccountId(int accountId){

        return JsonResult.ok(refundService.queryRefundByAccountId(accountId));
    }


}
