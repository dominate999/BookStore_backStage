package cn.edu.nchu.bookstore.dao;

import cn.edu.nchu.bookstore.entity.Return;
import cn.edu.nchu.bookstore.entity.ReturnVO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ReturnVODao {


    @Select("select * from `return_view` Where accountId = #{accountId}")
    public List<ReturnVO> queryReturnByAccountId(int accountId);

}



