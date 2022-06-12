package cn.edu.nchu.bookstore.service;

import cn.edu.nchu.bookstore.entity.AlipayBean;
import com.alipay.api.AlipayApiException;

public interface PayService {

    /**
     * 支付宝支付接口
     * @param alipayBean
     * @return
     * @throws AlipayApiException
     */
    String aliPay(AlipayBean alipayBean) throws AlipayApiException;

}
