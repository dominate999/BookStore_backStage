package cn.edu.nchu.bookstore.dao;

import cn.edu.nchu.bookstore.entity.Refund;
import cn.edu.nchu.bookstore.entity.RefundVO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface RefundVODao {


    @Select("select * from refund_view Where accountId = #{accountId}")
    public List<RefundVO> queryRefundByAccountId(int accountId);

}
