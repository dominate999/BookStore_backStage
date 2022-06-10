package cn.edu.nchu.bookstore.dao;

import cn.edu.nchu.bookstore.entity.Refund;
import cn.edu.nchu.bookstore.entity.Return;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ReturnDao {


    @Insert("insert into `orderreturn` values(null,#{orderId},#{returnReason},#{returnCreateTime},,#{returnAmount},#{returnExpressNo})")
    public boolean addReturn(Return returnInfo);

    @Select("select * from `orderreturn` Where orderId = #{orderId}")
    public List<Return> queryReturnByOrderId(int orderId);


}



