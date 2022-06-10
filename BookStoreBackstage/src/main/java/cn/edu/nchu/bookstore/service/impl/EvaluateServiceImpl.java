package cn.edu.nchu.bookstore.service.impl;

import cn.edu.nchu.bookstore.dao.EvaluateDao;
import cn.edu.nchu.bookstore.dao.OrderDao;
import cn.edu.nchu.bookstore.dao.OrderitemDao;
import cn.edu.nchu.bookstore.dao.OrderitemVODao;
import cn.edu.nchu.bookstore.entity.Evaluate;
import cn.edu.nchu.bookstore.entity.Order;
import cn.edu.nchu.bookstore.entity.Orderitem;
import cn.edu.nchu.bookstore.entity.OrderitemVO;
import cn.edu.nchu.bookstore.service.EvaluateService;
import cn.edu.nchu.bookstore.service.ReturnService;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service("evaluateService")
public class EvaluateServiceImpl implements EvaluateService {

    @Autowired
    private EvaluateDao evaluateDao;
    @Autowired
    private OrderDao orderDao;
    @Autowired
    private OrderitemDao orderitemDao ;

    @Override
    public boolean addEvaluate(Evaluate evaluate) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = sdf.format(new Date());
        evaluate.setEvaCreateTime(time);
        //评价是对子订单进行评价，图书可以看到评价的信息
        //是否需要修改订单的状态？
        return evaluateDao.addEvaluate(evaluate);
    }

    @Override
    public List<Evaluate> queryEvaluateByBookId(int bookId) {
        return evaluateDao.queryEvaluateByBookId(bookId);
    }


    @Override
    public List<Evaluate> queryEvaluateByCustomerId(int customerId) {
        return evaluateDao.queryEvaluateByCustomerId(customerId);
    }

}
