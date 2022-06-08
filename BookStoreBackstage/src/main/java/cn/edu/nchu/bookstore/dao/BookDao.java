package cn.edu.nchu.bookstore.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface BookDao {

    @Update("update book set bookStock = #{bookStock} where id = #{bookId}")
    public boolean updateStock(@Param("bookStock") int bookStock,@Param("bookId") int bookId);

}
