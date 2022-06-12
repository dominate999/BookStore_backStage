package cn.edu.nchu.bookstore.controller;

import cn.edu.nchu.bookstore.entity.AlipayBean;
import cn.edu.nchu.bookstore.service.PayService;
import cn.edu.nchu.bookstore.utils.JsonResult;
import com.alipay.api.AlipayApiException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;


@RestController
public class PayController {

    @Autowired
    private PayService payService;

    /**
     * 阿里支付
     * @param outTradeNo
     * @param subject
     * @param totalAmount
     * @param body
     * @return
     * @throws AlipayApiException
     */
    @PostMapping(value = "pay/alipay" , produces = "text/html;charset=utf-8")
    public String alipay(String outTradeNo, String subject, String totalAmount, String body) throws AlipayApiException, UnsupportedEncodingException {
        AlipayBean alipayBean = new AlipayBean();
        alipayBean.setOut_trade_no(outTradeNo);
        alipayBean.setSubject(subject);
        alipayBean.setTotal_amount(totalAmount);
        alipayBean.setBody(body);
        System.out.println(outTradeNo);
        System.out.println(subject);
        System.out.println(totalAmount);
        System.out.println(body);
        return payService.aliPay(alipayBean);

    }
}
