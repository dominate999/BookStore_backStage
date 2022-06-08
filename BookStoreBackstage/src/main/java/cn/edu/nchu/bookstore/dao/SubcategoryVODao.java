package cn.edu.nchu.bookstore.dao;

import cn.edu.nchu.bookstore.entity.SubcategoryVO;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface SubcategoryVODao {

    @Select("select * from subcategory_view")
    public List<SubcategoryVO> queryAllCate();
}
