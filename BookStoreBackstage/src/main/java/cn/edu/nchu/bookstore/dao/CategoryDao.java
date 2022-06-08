package cn.edu.nchu.bookstore.dao;

import cn.edu.nchu.bookstore.entity.Category;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CategoryDao {

    @Select("select * from category")
    public List<Category> queryCategory();
}
