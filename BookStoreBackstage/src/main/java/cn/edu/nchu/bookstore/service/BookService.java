package cn.edu.nchu.bookstore.service;

import cn.edu.nchu.bookstore.entity.BookVO;
import cn.edu.nchu.bookstore.entity.CategoryBind;
import cn.edu.nchu.bookstore.entity.SubcategoryVO;

import java.util.List;

public interface BookService {

    List<SubcategoryVO> queryCategory();

    List<CategoryBind> queryNavigate();

    List<BookVO> queryAllBook();

    BookVO queryBookById(int bookId);

    List<BookVO> queryBookVOByKw(String kw);

    List<BookVO> queryBookVOByKeys(String booName,String category, String minPrice,String maxPrice);
}
