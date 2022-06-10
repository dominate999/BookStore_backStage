package cn.edu.nchu.bookstore.service;

import cn.edu.nchu.bookstore.entity.RefundVO;
import cn.edu.nchu.bookstore.entity.Return;
import cn.edu.nchu.bookstore.entity.ReturnVO;

import java.util.List;

public interface ReturnService {
    public boolean addReturn(Return returnInfo);

    public List<Return> queryReturnByOrderId(int orderId);


    public List<ReturnVO> queryReturnByAccountId(int accountId);
}
