package cn.edu.nchu.bookstore.service.impl;

import cn.edu.nchu.bookstore.dao.OrderDao;
import cn.edu.nchu.bookstore.dao.ReturnDao;
import cn.edu.nchu.bookstore.dao.ReturnVODao;
import cn.edu.nchu.bookstore.entity.Order;
import cn.edu.nchu.bookstore.entity.Return;
import cn.edu.nchu.bookstore.entity.ReturnVO;
import cn.edu.nchu.bookstore.service.ReturnService;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service("returnService")
public class ReturnServiceImpl implements ReturnService {

    @Autowired
    private ReturnDao returnDao;
    @Autowired
    private OrderDao orderDao;

    @Autowired
    private ReturnVODao returnVODao;

    @Override
    public boolean addReturn(Return returnInfo) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String  time = sdf.format(new Date());
        returnInfo.setReturnCreateTime(time);
        Order order = new Order();
        order.setId(returnInfo.getOrderId());
        order.setOrderState("退货申请待同意");
        orderDao.UpdateOrderState(order);
        return  returnDao.addReturn(returnInfo);
    }

    @Override
    public List<Return> queryReturnByOrderId(int orderId) {

        return returnDao.queryReturnByOrderId(orderId);
    }

    @Override
    public List<ReturnVO> queryReturnByAccountId(int accountId) {

        return returnVODao.queryReturnByAccountId(accountId);

    }
}
