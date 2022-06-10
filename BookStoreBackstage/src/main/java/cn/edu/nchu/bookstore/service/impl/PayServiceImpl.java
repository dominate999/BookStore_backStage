package cn.edu.nchu.bookstore.service.impl;

import cn.edu.nchu.bookstore.entity.AlipayBean;
import cn.edu.nchu.bookstore.service.PayService;
import cn.edu.nchu.bookstore.utils.alipay.config.Alipay;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alipay.api.AlipayApiException;

@Service("payService")
public class PayServiceImpl implements PayService {

    @Autowired
    private Alipay alipay;

    @Override
    public String aliPay(AlipayBean alipayBean) throws AlipayApiException {
        return alipay.pay(alipayBean);
    }
}
