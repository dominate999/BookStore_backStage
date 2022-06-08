package cn.edu.nchu.bookstore.dao;

import cn.edu.nchu.bookstore.entity.Category;
import cn.edu.nchu.bookstore.entity.Subcategory;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface SubCategroyDao {

    @Select("select * from subcategory where categoryId = #{superId}")
    public List<Subcategory> querySubCategroyBySuperId(int superId);
}
