package cn.edu.nchu.bookstore.dao;

import cn.edu.nchu.bookstore.entity.Evaluate;
import cn.edu.nchu.bookstore.entity.Refund;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface EvaluateDao {

    @Insert("insert into evaluate values(null,#{evaContent},#{evaStar},#{evaCreateTime},#{username},#{bookId},#{customerId},#{orderitemId})")
    public boolean addEvaluate(Evaluate evaluate);

    @Select("select * from evaluate Where bookId = #{bookId}")
    public List<Evaluate> queryEvaluateByBookId(int bookId);


    @Select("select * from evaluate Where customerId = #{customerId}")
    public List<Evaluate> queryEvaluateByCustomerId(int customerId);
}
